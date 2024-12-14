package com.manikandareas.codileap.quiz.presentation.model

import android.os.Parcelable
import com.manikandareas.codileap.courses.data.networking.dto.AnswerDto
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class AnswerUi(
    val questionId: Int,
    val answerOptionId: Int
): Parcelable

fun AnswerUi.toDtoModel() = AnswerDto(
    questionId = questionId,
    answerOptionId = answerOptionId
)
