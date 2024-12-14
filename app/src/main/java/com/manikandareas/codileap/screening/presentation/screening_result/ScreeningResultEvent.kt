package com.manikandareas.codileap.screening.presentation.screening_result

import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.courses.domain.LearningPath

sealed interface ScreeningResultEvent {
    data class Error(val error: NetworkError) : ScreeningResultEvent

    data class OnSuccessEnrolled(val learningPath: LearningPath) : ScreeningResultEvent
}
