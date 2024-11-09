package com.manikandareas.codileap.auth.presentation.auth_signIn

sealed class AuthSignInAction {
    object OnRegisterClicked : AuthSignInAction()
    object OnBackClicked : AuthSignInAction()
}