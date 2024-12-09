package com.manikandareas.codileap.quiz.data.networking

import com.manikandareas.codileap.core.data.networking.constructUrl
import com.manikandareas.codileap.core.data.networking.safeCall
import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.core.domain.util.map
import com.manikandareas.codileap.quiz.data.networking.dto.DailyQuizResponseDto
import com.manikandareas.codileap.quiz.data.networking.dto.SubmitQuizRequestDto
import com.manikandareas.codileap.quiz.data.networking.dto.SubmitQuizResponseDto
import com.manikandareas.codileap.quiz.domain.Quiz
import com.manikandareas.codileap.quiz.domain.QuizDataSource
import com.manikandareas.codileap.quiz.domain.toDomain
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody

class RemoteQuizDataSource(private val httpClient: HttpClient) : QuizDataSource {
    override suspend fun getDailyQuiz(): Result<Quiz, NetworkError> {
        return safeCall<ApiResponse<DailyQuizResponseDto>> {
            httpClient.get(
                urlString = constructUrl("/api/quiz")
            )
        }.map { res -> res.data!!.toDomain() }
    }

    override suspend fun submitQuiz(request: SubmitQuizRequestDto): Result<SubmitQuizResponseDto, NetworkError> {
        return safeCall<ApiResponse<SubmitQuizResponseDto>> {
            httpClient.post(
                urlString = constructUrl("/api/quiz/submit"),
            ) {
                setBody(
                    request
                )
            }
        }.map { res -> res.data!! }
    }
}