package com.manikandareas.codileap.auth.presentation.auth_signIn

import androidx.compose.runtime.Immutable

@Immutable
data class AuthSignInState(
    val email: String = "",
    val emailError: String? = null,
    val password: String = "",
    val passwordError: String? = null,
    val isLoading: Boolean = false,
)