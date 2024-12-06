package com.manikandareas.codileap.user.data.networking.dto

data class GetStreakDetailsResponseDto(
    val date: String,
    val quizCount: Int,
    val latestAttempt: String,
    val streakValue: Int
)
