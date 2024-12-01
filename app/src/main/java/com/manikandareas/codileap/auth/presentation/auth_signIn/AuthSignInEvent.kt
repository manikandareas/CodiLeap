package com.manikandareas.codileap.auth.presentation.auth_signIn

import com.manikandareas.codileap.core.domain.util.NetworkError

sealed interface AuthSignInEvent {
    data class Error(val error:NetworkError): AuthSignInEvent
    object Success: AuthSignInEvent
}