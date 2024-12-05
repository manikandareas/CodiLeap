package com.manikandareas.codileap.user.data.networking

import com.manikandareas.codileap.core.data.networking.constructUrl
import com.manikandareas.codileap.core.data.networking.safeCall
import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.core.domain.util.map
import com.manikandareas.codileap.user.data.networking.dto.GetCurrentProgressResponseDto
import com.manikandareas.codileap.user.data.networking.dto.GetUserProgressResponseDto
import com.manikandareas.codileap.user.domain.CurrentProgress
import com.manikandareas.codileap.user.domain.ProgressDataSource
import com.manikandareas.codileap.user.domain.UserProgress
import com.manikandareas.codileap.user.domain.toDomain
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteProgressDataSource(private val httpClient: HttpClient) : ProgressDataSource {

    override suspend fun getCurrentProgress(): Result<CurrentProgress, NetworkError> {
        return safeCall<ApiResponse<GetCurrentProgressResponseDto>> {
            httpClient.get(
                urlString = constructUrl("/api/progress/current")
            )
        }.map { it.data!!.toDomain() }
    }

    override suspend fun getUserProgress(): Result<UserProgress, NetworkError> {
        return safeCall<ApiResponse<GetUserProgressResponseDto>> {
            httpClient.get(
                urlString = constructUrl("/api/progress")
            )
        }.map { it.data!!.toDomain() }
    }
}