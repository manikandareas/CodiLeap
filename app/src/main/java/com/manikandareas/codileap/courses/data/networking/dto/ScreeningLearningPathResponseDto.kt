package com.manikandareas.codileap.courses.data.networking.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class ScreeningLearningPathResponseDto(
    val recommendedLearningPath: LearningPathDto
): Parcelable
//
//"recommendedLearningPath": {
//    "id": 2,
//    "name": "Machine Learning",
//    "description": "Learn the basics of Machine Learning, including concepts and tools.",
//    "createdAt": "2024-12-04 04:47:15.274722+00",
//    "updatedAt": "2024-12-04 04:47:15.274722+00"
//}

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
