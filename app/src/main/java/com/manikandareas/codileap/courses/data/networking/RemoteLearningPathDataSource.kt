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
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.post

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

    override suspend fun screeningLearningPath(request: ScreeningLearningPathRequestDto): Result<ScreeningLearningPathResponseDto, NetworkError> {
        TODO("Not yet implemented")
    }
}