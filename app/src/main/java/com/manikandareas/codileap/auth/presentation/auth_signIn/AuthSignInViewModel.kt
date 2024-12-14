package com.manikandareas.codileap.auth.presentation.auth_signIn

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.auth.data.networking.dto.LoginRequestDto
import com.manikandareas.codileap.auth.data.networking.mappers.toToken
import com.manikandareas.codileap.auth.domain.AuthDataSource
import com.manikandareas.codileap.core.data.preference.PreferenceDataSource
import com.manikandareas.codileap.core.domain.util.onError
import com.manikandareas.codileap.core.domain.util.onSuccess
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.navigation.Navigator
import com.manikandareas.codileap.user.domain.toUser
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class AuthSignInViewModel(
    private val authDataSource: AuthDataSource,
    private val loginValidation: AuthSignInValidation,
    private val preferenceDataSource: PreferenceDataSource,
    private val navigator: Navigator
) : ViewModel() {

    var state by mutableStateOf(AuthSignInState())
        private set

    private val _events = Channel<AuthSignInEvent>()
    val events = _events.receiveAsFlow()

    fun onAction(action: AuthSignInAction) {
        when (action) {
            is AuthSignInAction.OnEmailChanged -> {
                state = state.copy(email = action.email, emailError = null)
                val result = loginValidation.validateEmail.execute(state.email)
                if (!result.successful) {
                    state = state.copy(emailError = result.errorMessage)
                }
            }

            is AuthSignInAction.OnPasswordChanged -> {
                state = state.copy(password = action.password, passwordError = null)
                val isFormValid = action.password.isNotEmpty()
                if (!isFormValid) {
                    state = state.copy(passwordError = "Password is required")
                }
            }

            AuthSignInAction.OnRegisterClicked -> viewModelScope.launch {
                navigator.navigate(Destination.RegisterScreen)
            }

            AuthSignInAction.OnBackClicked -> viewModelScope.launch {
                navigator.navigateUp()
            }

            AuthSignInAction.OnSignInClicked -> viewModelScope.launch {
                onSubmit()
            }
        }
    }


    private fun onSubmit() = viewModelScope.launch {
        if (state.email.isEmpty() || state.password.isEmpty()) {
            state = state.copy(
                emailError = if (state.email.isEmpty()) "The email can't be blank" else null,
                passwordError = if (state.password.isEmpty()) "The password can't be blank" else null
            )
            return@launch
        }

        state = state.copy(isLoading = true)
        authDataSource.login(
            LoginRequestDto(
                email = state.email,
                password = state.password
            )
        ).onSuccess { response ->
            state = state.copy(isLoading = false)

            val currUser = preferenceDataSource.getUser().first()

            if (currUser == null) {
                preferenceDataSource.saveUser(response.data!!.user.toUser())
                preferenceDataSource.saveToken(response.data.toToken())
                preferenceDataSource.saveReminderTime(
                    response.data.user.toUser().studyHours ?: "09:00"
                )
            }

            _events.send(AuthSignInEvent.Success)

            if (currUser?.isAlreadyScreened == false) {
                navigator.navigate(Destination.ScreeningScreen)
            } else {
                navigator.navigate(Destination.HomeGraph)
            }

        }.onError {
            state = state.copy(isLoading = false)
            _events.send(AuthSignInEvent.Error(it))
        }
    }

}