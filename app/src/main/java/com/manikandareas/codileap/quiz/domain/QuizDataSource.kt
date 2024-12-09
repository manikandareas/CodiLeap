package com.manikandareas.codileap.quiz.domain

import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.quiz.data.networking.dto.SubmitQuizRequestDto
import com.manikandareas.codileap.quiz.data.networking.dto.SubmitQuizResponseDto

interface QuizDataSource {
    suspend fun getDailyQuiz (): Result<Quiz, NetworkError>
    suspend fun submitQuiz (request: SubmitQuizRequestDto): Result<SubmitQuizResponseDto, NetworkError>
}
