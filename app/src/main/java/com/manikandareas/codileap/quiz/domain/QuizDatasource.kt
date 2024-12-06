package com.manikandareas.codileap.quiz.domain

import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.courses.data.networking.dto.SubmitQuizRequestDto
import com.manikandareas.codileap.courses.data.networking.dto.SubmitQuizResponseDto
import com.manikandareas.codileap.quiz.data.networking.dto.DailyQuizResponseDto

interface QuizDatasource {
    suspend fun getDailyQuiz (): Result<Quiz, NetworkError>
    suspend fun submitQuiz (request: SubmitQuizRequestDto): Result<SubmitQuizResponseDto, NetworkError>
}
