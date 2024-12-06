package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class AnswerDto(
    val questionId: Int,
    val answerOptionId: Int
)
