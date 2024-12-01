package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class SubmitQuizRequestDto(
    val quizId: Int,
    val answers: List<AnswerDto>
)

