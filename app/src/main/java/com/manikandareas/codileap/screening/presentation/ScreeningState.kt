package com.manikandareas.codileap.screening.presentation

import android.os.Parcelable
import com.manikandareas.codileap.quiz.presentation.model.AnswerUi
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable


@Serializable
@Parcelize
data class ScreeningState (
    val studyHour: String= "",
    val fullName: String= "",
    val interestQuizAnswer: List<AnswerUi>? =emptyList(),
): Parcelable