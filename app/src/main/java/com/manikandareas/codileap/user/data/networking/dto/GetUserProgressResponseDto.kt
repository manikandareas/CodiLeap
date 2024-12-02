package com.manikandareas.codileap.user.data.networking.dto

import kotlinx.serialization.Serializable


@Serializable
data class GetUserProgressResponseDto(
    val overallProgress: OverallProgressDto,
    val currentStreak: String,
    val longestStreak: String,
    val averageDailyTime: Int,
    val learningPathProgress: List<LearningPathProgressDto>
)

@Serializable
data class OverallProgressDto(
    val completedCourse: Int,
    val totalCourse: Int,
    val completedModule: Int,
    val totalModule: Int
)

@Serializable
data class LearningPathProgressDto(
    val pathId: Int,
    val pathName: String,
    val progress: Int
)
