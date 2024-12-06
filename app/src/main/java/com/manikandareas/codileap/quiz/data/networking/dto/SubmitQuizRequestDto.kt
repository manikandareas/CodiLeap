package com.manikandareas.codileap.quiz.data.networking.dto

import com.manikandareas.codileap.courses.data.networking.dto.AnswerDto
import kotlinx.serialization.Serializable

@Serializable
data class SubmitQuizRequestDto(
    val quizId: Int,
    val answers: List<AnswerDto>
)

