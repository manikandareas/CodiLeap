package com.manikandareas.codileap.quiz.data.networking.dto

data class SubmitQuizResponseDto(
    val id: Int,
    val quizId: Int,
    val totalScore: Int,
    val startTime: String,
    val endTime: String,
    val status: String,
    val createdAt: String
)