package com.manikandareas.codileap.screening.presentation.screening_result

import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.courses.domain.LearningPath

sealed class ScreeningResultAction {
    data class NavigateTo(val des: Destination) : ScreeningResultAction()


    data class OnLearningPathSelected(val learningPathUi: LearningPath) : ScreeningResultAction()

    object OnEnrollNowAction : ScreeningResultAction()

    object OnContinueClicked : ScreeningResultAction()
}