package com.manikandareas.codileap.auth.presentation.auth_signIn

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.auth.data.networking.dto.LoginRequestDto
import com.manikandareas.codileap.auth.domain.AuthDataSource
import com.manikandareas.codileap.core.domain.util.onError
import com.manikandareas.codileap.core.domain.util.onSuccess
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.navigation.Navigator
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class AuthSignInViewModel(
    private val authDataSource: AuthDataSource,
    private val loginValidation: AuthSignInValidation,
    private val navigator: Navigator) : ViewModel() {

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

            AuthSignInAction.OnSignInClicked -> viewModelScope.launch{
                onSubmit()
            }
        }
    }


    private fun onSubmit() = viewModelScope.launch {
        state = state.copy(isLoading = true)
        authDataSource.login(
            LoginRequestDto(
                email = state.email,
                password = state.password
            )
        ).onSuccess { response ->
            state = state.copy(isLoading = false)
            _events.send(AuthSignInEvent.Success)
            navigator.navigate(Destination.HomeGraph)
        }.onError {
            state = state.copy(isLoading = false)
            _events.send(AuthSignInEvent.Error(it))
        }
    }

}