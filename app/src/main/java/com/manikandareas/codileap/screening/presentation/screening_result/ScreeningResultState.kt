package com.manikandareas.codileap.screening.presentation.screening_result

import com.manikandareas.codileap.courses.domain.LearningPath

data class ScreeningResultState(
    val selectedLearningPath: LearningPath? = null,
    val screeningResult: LearningPath? = null,
    val isLoading: Boolean = false
)