package com.manikandareas.codileap.courses.data.networking

import com.manikandareas.codileap.core.data.networking.constructUrl
import com.manikandareas.codileap.core.data.networking.safeCall
import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.core.domain.util.map
import com.manikandareas.codileap.courses.data.networking.dto.EnrollLearningPathResponseDto
import com.manikandareas.codileap.courses.data.networking.dto.LearningPathDto
import com.manikandareas.codileap.courses.data.networking.dto.ScreeningLearningPathRequestDto
import com.manikandareas.codileap.courses.data.networking.dto.ScreeningLearningPathResponseDto
import com.manikandareas.codileap.courses.data.networking.mappers.toDomain
import com.manikandareas.codileap.courses.domain.LearningPath
import com.manikandareas.codileap.courses.domain.LearningPathDataSource
import com.manikandareas.codileap.quiz.data.networking.dto.SubmitQuizRequestDto
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import kotlinx.serialization.Serializable

class RemoteLearningPathDataSource(private val httpClient: HttpClient) : LearningPathDataSource {
    override suspend fun getAllLearningPathsWithCourses(): Result<List<LearningPath>, NetworkError> {
        return safeCall<ApiResponse<List<LearningPathDto>>> {
            httpClient.get(
                urlString = constructUrl("/api/learning-paths")
            )
        }.map { res -> res.data!!.map { it.toDomain(courses = it.courses) } }
    }

    override suspend fun enrollLearningPath(learningPathId: Int): Result<EnrollLearningPathResponseDto, NetworkError> {
        return safeCall<ApiResponse<EnrollLearningPathResponseDto>> {
            httpClient.post(
                urlString = constructUrl("/api/learning-paths/$learningPathId/enroll")
            )
        }.map { it.data!! }
    }

    @Serializable
    data class ScreeningDto(
        val Q1: Int,
        val Q2: Int,
        val Q3: Int,
        val Q4: Int,
        val Q5: Int,
    )

    override suspend fun screeningLearningPath(request: SubmitQuizRequestDto): Result<ScreeningLearningPathResponseDto, NetworkError> {
        return safeCall<ApiResponse<ScreeningLearningPathResponseDto>> {
            httpClient.post(
                urlString = constructUrl("/api/learning-paths/screening"),
            ) {
                setBody(
                    ScreeningDto(
                        request.answers[0].answerOptionId.toInt(),
                        request.answers[1].answerOptionId.toInt(),
                        request.answers[2].answerOptionId.toInt(),
                        request.answers[3].answerOptionId.toInt(),
                        request.answers[4].answerOptionId.toInt(),
                    )
                )
            }
        }.map { it.data!! }
    }
}