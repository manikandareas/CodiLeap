package com.manikandareas.codileap.auth.data.networking

import com.manikandareas.codileap.auth.data.networking.dto.LoginRequestDto
import com.manikandareas.codileap.auth.data.networking.dto.LoginResponseDto
import com.manikandareas.codileap.auth.data.networking.dto.RefreshTokenResponseDto
import com.manikandareas.codileap.auth.data.networking.dto.RegisterRequestDto
import com.manikandareas.codileap.core.data.networking.constructUrl
import com.manikandareas.codileap.core.data.networking.safeCall
import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import io.ktor.client.HttpClient
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import  com.manikandareas.codileap.core.domain.util.Result
import io.ktor.client.request.bearerAuth


class RemoteAuthDataSource(private val httpClient: HttpClient) {
    suspend fun register(request: RegisterRequestDto): Result<ApiResponse<Unit>, NetworkError> {
        return safeCall<ApiResponse<Unit>> {
            httpClient.post(
                urlString = constructUrl("/api/auth/register")
            ) {
                setBody(
                    RegisterRequestDto(
                        email = request.email,
                        password = request.password
                    )
                )
            }

        }
    }

    suspend fun login(
        request: LoginRequestDto
    ): Result<ApiResponse<LoginResponseDto>, NetworkError> {
        return safeCall<ApiResponse<LoginResponseDto>> {
            httpClient.post(
                urlString = constructUrl("/api/auth/login")
            ) {
                setBody(
                    LoginRequestDto(
                        email = request.email,
                        password = request.password
                    )
                )
            }
        }
    }

    suspend fun refreshToken(refreshToken: String): Result<ApiResponse<RefreshTokenResponseDto>, NetworkError> {
        return safeCall<ApiResponse<RefreshTokenResponseDto>> {
            httpClient.post(
                urlString = constructUrl("/api/auth/refresh")
            ){
                bearerAuth(refreshToken)
            }
        }
    }
}