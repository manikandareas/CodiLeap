package com.manikandareas.codileap.courses.domain

data class Question(
    val id: Int,
    val quizId: Int,
    val text: String,
    val pointValue: Int,
    val createdAt: String,
    val updatedAt: String,
    val answerOptions: List<AnswerOption>
)

data class AnswerOption(
    val id: Int,
    val questionId: Int,
    val text: String,
    val isCorrect: Boolean,
)