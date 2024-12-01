package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class EnrollLearningPathResponseDto(
    val id: Int,
    val userId: Int,
    val learningPathId: Int,
    val currentCourseId: Int,
    val completionStatus: String,
    val startedAt: String,
    val completedAt: String?
)
