package com.manikandareas.codileap.auth.presentation.auth_register

sealed class AuthRegisterAction {
    object OnSignInClicked : AuthRegisterAction()
    object OnBackClicked : AuthRegisterAction()
}