package com.manikandareas.codileap.screening.presentation

import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.quiz.presentation.model.AnswerUi

sealed class ScreeningAction {
    data class NavigateTo(val des: Destination) : ScreeningAction()
    data object NavigateToQuizSession : ScreeningAction()

    data class OnScreeningNameAction(val name: String) : ScreeningAction()
    data class OnScreeningStudyHourAction(val studyHour: String) : ScreeningAction()

    data class OnScreeningInterestSelected(val answer: AnswerUi) : ScreeningAction()
}