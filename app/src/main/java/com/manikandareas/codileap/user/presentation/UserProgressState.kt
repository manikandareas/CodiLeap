package com.manikandareas.codileap.user.presentation

import com.manikandareas.codileap.user.domain.CurrentProgress
import com.manikandareas.codileap.user.domain.UserProgress

data class UserProgressState(
    val isLoading: Boolean = false,
    val currentProgress: CurrentProgress? = null,
    val userProgress: UserProgress? = null
)
