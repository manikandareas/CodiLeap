package com.manikandareas.codileap.user.data.networking

import com.manikandareas.codileap.core.data.networking.constructUrl
import com.manikandareas.codileap.core.data.networking.safeCall
import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.core.domain.util.map
import com.manikandareas.codileap.user.data.networking.dto.UpdateUserForScreeningRequestDto
import com.manikandareas.codileap.user.data.networking.dto.UpdateUserRequestDto
import com.manikandareas.codileap.user.data.networking.dto.UpdateUserResponseDto
import com.manikandareas.codileap.user.domain.UserDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.put
import io.ktor.client.request.setBody

class RemoteUserDataSource(private val httpClient: HttpClient) : UserDataSource {
    override suspend fun updateUserForScreening(request: UpdateUserForScreeningRequestDto): Result<UpdateUserResponseDto, NetworkError> {
        return safeCall<ApiResponse<UpdateUserResponseDto>> {
            httpClient.put(
                urlString = constructUrl("/api/users")
            ) {
                setBody(request)
            }
        }.map { it.data!! }
    }

    override suspend fun updateUser(request: UpdateUserRequestDto): Result<UpdateUserResponseDto, NetworkError> {
        return safeCall<ApiResponse<UpdateUserResponseDto>> {
            httpClient.put(
                urlString = constructUrl("/api/users")
            ) {
                setBody(request)
            }
        }.map { it.data!! }
    }


}