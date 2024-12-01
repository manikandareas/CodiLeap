package com.manikandareas.codileap.courses.presentation

import com.manikandareas.codileap.courses.presentation.model.CourseUi
import com.manikandareas.codileap.courses.presentation.model.LearningPathUi
import com.manikandareas.codileap.courses.presentation.model.QuizUi


data class QuizState(
    val isLoading: Boolean = false,
    val quiz: QuizUi
)
