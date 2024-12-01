package com.manikandareas.codileap.quiz.domain

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
