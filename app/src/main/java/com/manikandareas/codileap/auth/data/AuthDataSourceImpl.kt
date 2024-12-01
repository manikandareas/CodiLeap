package com.manikandareas.codileap.auth.data

import com.manikandareas.codileap.auth.data.networking.RemoteAuthDataSource
import com.manikandareas.codileap.auth.data.networking.dto.LoginRequestDto
import com.manikandareas.codileap.auth.data.networking.dto.LoginResponseDto
import com.manikandareas.codileap.auth.data.networking.dto.RefreshTokenResponseDto
import com.manikandareas.codileap.auth.data.networking.dto.RegisterRequestDto
import com.manikandareas.codileap.auth.data.networking.mappers.toToken
import com.manikandareas.codileap.auth.data.preference.PreferenceDataSource
import com.manikandareas.codileap.auth.domain.AuthDataSource
import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.core.domain.util.onSuccess
import kotlinx.coroutines.flow.first

class AuthDataSourceImpl(
    private val preferenceDataSource: PreferenceDataSource,
    private val remoteAuthDataSource: RemoteAuthDataSource
) : AuthDataSource {
    override suspend fun register(request: RegisterRequestDto): Result<ApiResponse<Unit>, NetworkError> {
        return remoteAuthDataSource.register(request)
    }

    override suspend fun login(request: LoginRequestDto): Result<ApiResponse<LoginResponseDto>, NetworkError> {
        return remoteAuthDataSource.login(request).onSuccess { res ->
            res.data.let { data ->
                println("TOKEN: ${data!!.toToken()}")
                preferenceDataSource.saveToken(data!!.toToken())
            }
        }
    }

    override suspend fun logout() {
        return preferenceDataSource.clearToken()
    }

}