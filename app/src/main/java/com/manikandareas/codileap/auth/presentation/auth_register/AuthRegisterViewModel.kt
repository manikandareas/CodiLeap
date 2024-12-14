package com.manikandareas.codileap.auth.presentation.auth_register

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.auth.data.networking.dto.RegisterRequestDto
import com.manikandareas.codileap.auth.domain.AuthDataSource
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.onError
import com.manikandareas.codileap.core.domain.util.onSuccess
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.navigation.Navigator
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class AuthRegisterViewModel(
    private val authDataSource: AuthDataSource,
    private val registerValidation: AuthRegisterValidation,
    private val navigator: Navigator
) : ViewModel() {
    var state by mutableStateOf(AuthRegisterState())
        private set

    private val _events = Channel<AuthRegisterEvent>()
    val events = _events.receiveAsFlow()

    fun onAction(action: AuthRegisterAction) {
        when (action) {
            AuthRegisterAction.OnSignInClicked -> viewModelScope.launch {
                navigator.navigate(Destination.LoginScreen)

            }

            AuthRegisterAction.OnBackClicked -> viewModelScope.launch {
                navigator.navigate(
                    Destination.AuthScreen
                ) { popUpTo(Destination.AuthScreen) { inclusive = true } }
            }

            is AuthRegisterAction.OnEmailChanged -> {
                state = state.copy(email = action.email, emailError = null)
                val result = registerValidation.validateEmail.execute(state.email)
                if (!result.successful) state = state.copy(emailError = result.errorMessage)
            }

            is AuthRegisterAction.OnPasswordChanged -> {
                state = state.copy(password = action.password, passwordError = null)
                val result = registerValidation.validatePassword.execute(state.password)
                if (!result.successful) state = state.copy(passwordError = result.errorMessage)
            }

            is AuthRegisterAction.OnRepeatedPasswordChanged -> {
                state = state.copy(
                    repeatedPassword = action.repeatedPassword,
                    repeatedPasswordError = null
                )
                val result = registerValidation.validateRepeatedPassword.execute(
                    state.password,
                    state.repeatedPassword
                )
                if (!result.successful) state =
                    state.copy(repeatedPasswordError = result.errorMessage)
            }

            AuthRegisterAction.OnSubmitClicked -> {
                onSubmit()
            }
        }
    }

    fun onSubmit() = viewModelScope.launch {

        val emailResult = registerValidation.validateEmail.execute(state.email)
        val passwordResult = registerValidation.validatePassword.execute(state.password)
        val repeatedPasswordResult = registerValidation.validateRepeatedPassword.execute(
            state.password,
            state.repeatedPassword
        )

        val hasError = listOf(
            emailResult,
            passwordResult,
            repeatedPasswordResult
        ).any { !it.successful }

        if (hasError) {
            state = state.copy(
                emailError = emailResult.errorMessage,
                passwordError = passwordResult.errorMessage,
                repeatedPasswordError = repeatedPasswordResult.errorMessage
            )
            return@launch
        }

        state = state.copy(isLoading = true)

        authDataSource.register(
            RegisterRequestDto(
                email = state.email,
                password = state.password
            )
        ).onSuccess {
            println("Successfully register yeay ${state.email}")
            state = state.copy(
                isLoading = false,
                email = "",
                password = "",
                repeatedPassword = ""
            )
            _events.send(AuthRegisterEvent.RegisterSuccess)
        }.onError { error ->
            state = state.copy(isLoading = false)
            println("Error: ${error}")
            _events.send(AuthRegisterEvent.Error(error))
        }

    }
}