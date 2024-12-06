package com.manikandareas.codileap.auth.presentation.auth_register

import com.manikandareas.codileap.core.domain.util.NetworkError

sealed interface AuthRegisterEvent {
    data class Error(val error: NetworkError): AuthRegisterEvent
    object RegisterSuccess: AuthRegisterEvent
}