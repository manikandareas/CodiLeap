package com.manikandareas.codileap.quiz.data.networking.dto

data class DailyQuizResponseDto(
    val id: Int,
    val courseId: Int,
    val title: String,
    val description: String,
    val totalQuestions: Int,
    val passingScore: Int,
    val timeLimit: Int,
    val createdAt: String,
    val updatedAt: String,
    val questions: List<QuestionDto>
)

data class QuestionDto(
    val id: Int,
    val quizId: Int,
    val text: String,
    val pointValue: Int,
    val createdAt: String,
    val updatedAt: String,
    val answerOptions: List<AnswerOptionDto>
)

data class AnswerOptionDto(
    val id: Int,
    val questionId: Int,
    val text: String,
    val isCorrect: Boolean,
)
