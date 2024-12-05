package com.manikandareas.codileap.user.presentation

import com.manikandareas.codileap.core.domain.util.NetworkError

sealed interface UserProgressEvent {
    data class Error(val error: NetworkError) : UserProgressEvent
}
