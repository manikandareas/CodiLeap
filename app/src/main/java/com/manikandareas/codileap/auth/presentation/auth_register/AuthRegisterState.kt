package com.manikandareas.codileap.auth.presentation.auth_register

data class AuthRegisterState(
    val email: String = "",
    val emailError: String? = null,
    val password: String = "",
    val passwordError: String? = null,
    val repeatedPassword: String = "",
    val repeatedPasswordError: String? = null,
    val isLoading: Boolean = false,
)