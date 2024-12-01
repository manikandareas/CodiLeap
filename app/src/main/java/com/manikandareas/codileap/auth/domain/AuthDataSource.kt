package com.manikandareas.codileap.auth.domain

import com.manikandareas.codileap.auth.data.networking.dto.LoginRequestDto
import com.manikandareas.codileap.auth.data.networking.dto.LoginResponseDto
import com.manikandareas.codileap.auth.data.networking.dto.RefreshTokenResponseDto
import com.manikandareas.codileap.auth.data.networking.dto.RegisterRequestDto
import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result

interface AuthDataSource {
    suspend fun register(request: RegisterRequestDto): Result<ApiResponse<Unit>, NetworkError>
    suspend fun login(request: LoginRequestDto): Result<ApiResponse<LoginResponseDto>, NetworkError>
    suspend fun logout()
}