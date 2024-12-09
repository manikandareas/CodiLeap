package com.manikandareas.codileap.quiz.presentation

import com.manikandareas.codileap.quiz.presentation.model.AnswerUi
import com.manikandareas.codileap.quiz.presentation.model.QuizUi


data class QuizState(
    val isLoading: Boolean = false,
    val quiz: QuizUi? = null,
    val userAnswers: List<AnswerUi>? = emptyList()
)
