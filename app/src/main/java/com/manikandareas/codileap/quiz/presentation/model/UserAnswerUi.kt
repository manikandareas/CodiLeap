package com.manikandareas.codileap.quiz.presentation.model

import com.manikandareas.codileap.courses.data.networking.dto.AnswerDto


data class AnswerUi(
    val questionId: Int,
    val answerOptionId: Int
)

fun AnswerUi.toDtoModel() = AnswerDto(
    questionId = questionId,
    answerOptionId = answerOptionId
)
