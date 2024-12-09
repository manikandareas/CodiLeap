package com.manikandareas.codileap.quiz.domain

import com.manikandareas.codileap.core.presentation.util.toUTC
import com.manikandareas.codileap.quiz.data.networking.dto.AnswerOptionDto
import com.manikandareas.codileap.quiz.data.networking.dto.QuestionDto
import java.time.ZonedDateTime

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


fun QuestionDto.toDomain(): Question {
    return Question(
        id = id,
        quizId = quizId,
        text = text,
        pointValue = pointValue,
        createdAt = createdAt,
        updatedAt = updatedAt,
        answerOptions = answerOptions.map { it.toDomain() }
    )
}

fun AnswerOptionDto.toDomain(): AnswerOption {
    return AnswerOption(
        id = id,
        questionId = questionId,
        text = text,
        isCorrect = isCorrect,
    )
}