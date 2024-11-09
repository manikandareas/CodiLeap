package com.manikandareas.codileap.auth.presentation

sealed class AuthAction {
    object OnSignInClicked : AuthAction()
    object OnRegisterClicked : AuthAction()
    object OnBackClicked : AuthAction()
}