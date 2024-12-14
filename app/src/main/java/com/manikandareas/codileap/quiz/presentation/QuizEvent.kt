package com.manikandareas.codileap.quiz.presentation

import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.quiz.data.networking.dto.SubmitQuizResponseDto

sealed interface QuizEvent {
    data class Error(val error: NetworkError) : QuizEvent
    data class Success(val result: SubmitQuizResponseDto) : QuizEvent
    

    data class InvalidAnswer(val message: String) : QuizEvent
}