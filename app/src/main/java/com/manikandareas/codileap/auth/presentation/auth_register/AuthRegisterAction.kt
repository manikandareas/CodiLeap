package com.manikandareas.codileap.auth.presentation.auth_register

sealed class AuthRegisterAction {
    object OnSignInClicked : AuthRegisterAction()
    object OnBackClicked : AuthRegisterAction()
    object  OnSubmitClicked: AuthRegisterAction()

    data class OnEmailChanged(val email: String) : AuthRegisterAction()
    data class OnPasswordChanged(val password: String) : AuthRegisterAction()
    data class OnRepeatedPasswordChanged(val repeatedPassword: String) : AuthRegisterAction()
}
