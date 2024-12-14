package com.manikandareas.codileap.screening.presentation.model

import com.manikandareas.codileap.quiz.presentation.model.AnswerUi

data class ScreeningUi (
    val studyHour: String= "",
    val fullName: String= "",
    val interestQuizAnswer: List<AnswerUi>? =emptyList(),
)