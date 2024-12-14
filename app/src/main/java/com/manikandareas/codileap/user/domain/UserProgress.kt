package com.manikandareas.codileap.user.domain

import com.manikandareas.codileap.user.data.networking.dto.GetUserProgressResponseDto
import com.manikandareas.codileap.user.data.networking.dto.LearningPathProgressDto
import com.manikandareas.codileap.user.data.networking.dto.OverallProgressDto
import kotlinx.serialization.Serializable


data class UserProgress(
    val overallProgress: OverallProgress,
    val currentStreak: String,
    val longestStreak: String,
    val averageDailyTime: Int,
    val learningPathProgress: List<LearningPathProgress>
)

data class OverallProgress(
    val completedCourse: Int,
    val totalCourse: Int,
    val completedModule: Int,
    val totalModule: Int
)

data class LearningPathProgress(
    val pathId: Int,
    val pathName: String,
    val progress: Float
)

fun GetUserProgressResponseDto.toDomain() = UserProgress(
    overallProgress = overallProgress.toDomain(),
    currentStreak = currentStreak,
    longestStreak = longestStreak,
    averageDailyTime = averageDailyTime,
    learningPathProgress = learningPathProgress.map { it.toDomain() }
)

fun OverallProgressDto.toDomain() = OverallProgress(
    completedCourse = completedCourse,
    totalCourse = totalCourse,
    completedModule = completedModule,
    totalModule = totalModule
)

fun LearningPathProgressDto.toDomain() = LearningPathProgress(
    pathId = pathId,
    pathName = pathName,
    progress = progress
)
