package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class ScreeningLearningPathResponseDto(
    val recommendedPath: RecommendedPathDto,
    val screeningResults: ScreeningResultsDto
)

@Serializable
data class RecommendedPathDto(
    val pathId: Int,
    val pathName: String,
    val level: String,
    val reason: String
)

@Serializable
data class ScreeningResultsDto(
    val score: Int,
    val strengths: List<String>,
    val areasForImprovement: List<String>
)
