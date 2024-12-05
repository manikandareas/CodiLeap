package com.manikandareas.codileap.courses.presentation

import com.manikandareas.codileap.core.domain.util.NetworkError

sealed interface CoursesEvent {
    data class Error(val error: NetworkError) : CoursesEvent
}
