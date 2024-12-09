package com.manikandareas.codileap.quiz.domain

import com.manikandareas.codileap.quiz.data.networking.dto.DailyQuizResponseDto

data class Quiz(
    val id: Int,
    val courseId: Int,
    val title: String,
    val description: String,
    val totalQuestions: Int,
    val passingScore: Int,
    val timeLimit: Int,
    val createdAt: String,
    val updatedAt: String,

    val questions: List<Question>
)

fun DailyQuizResponseDto.toDomain(): Quiz {
    return Quiz(
        id = id,
        courseId = courseId,
        title = title,
        description = description,
        totalQuestions = totalQuestions,
        passingScore = passingScore,
        timeLimit = timeLimit,
        createdAt = createdAt,
        updatedAt = updatedAt,
        questions = questions.map { it.toDomain() }
    )
}