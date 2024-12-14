package com.manikandareas.codileap.home.presentation

import com.manikandareas.codileap.courses.presentation.model.LearningPathUi
import com.manikandareas.codileap.home.presentation.model.UserUi
import com.manikandareas.codileap.user.domain.CurrentProgress
import com.manikandareas.codileap.user.domain.UserProgress

data class HomeState(
    val user: UserUi? = null,
    val isLoading: Boolean = false,
    val learningPaths: List<LearningPathUi> = emptyList(),

    val currentProgress: CurrentProgress? = null,
    val userProgress: UserProgress? = null
)
