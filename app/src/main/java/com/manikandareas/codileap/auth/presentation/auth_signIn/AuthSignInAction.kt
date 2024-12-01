package com.manikandareas.codileap.auth.presentation.auth_signIn


sealed class AuthSignInAction {
    data class OnEmailChanged(val email: String) : AuthSignInAction()
    data class OnPasswordChanged(val password: String) : AuthSignInAction()

    object OnRegisterClicked : AuthSignInAction()
    object OnBackClicked : AuthSignInAction()
    object OnSignInClicked : AuthSignInAction()
}