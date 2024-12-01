package com.manikandareas.codileap.quiz.presentation.model


import com.manikandareas.codileap.quiz.domain.Question
import com.manikandareas.codileap.quiz.domain.Quiz
import java.time.ZonedDateTime

data class QuizUi(
    val id: Int,
    val courseId: Int,
    val title: String,
    val description: String,
    val totalQuestions: Int,
    val passingScore: Int,
    val timeLimit: Int,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,

    val questions: List<Question>
)

fun Quiz.toUiModel() = QuizUi(
    id = id,
    courseId = courseId,
    title = title,
    description = description,
    totalQuestions = totalQuestions,
    passingScore = passingScore,
    timeLimit = timeLimit,
    createdAt = ZonedDateTime.parse(createdAt),
    updatedAt = ZonedDateTime.parse(updatedAt),
    questions = questions
)