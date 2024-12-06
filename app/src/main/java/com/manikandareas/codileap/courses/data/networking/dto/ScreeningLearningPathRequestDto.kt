package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class ScreeningLearningPathRequestDto(
    val answers: List<AnswerDto>
)

