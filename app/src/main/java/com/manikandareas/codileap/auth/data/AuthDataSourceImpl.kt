package com.manikandareas.codileap.auth.data

import com.manikandareas.codileap.auth.data.networking.RemoteAuthDataSource
import com.manikandareas.codileap.auth.data.networking.dto.LoginRequestDto
import com.manikandareas.codileap.auth.data.networking.dto.LoginResponseDto
import com.manikandareas.codileap.auth.data.networking.dto.RegisterRequestDto
import com.manikandareas.codileap.auth.data.networking.mappers.toToken
import com.manikandareas.codileap.auth.domain.AuthDataSource
import com.manikandareas.codileap.core.data.preference.PreferenceDataSource
import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.core.domain.util.onSuccess
import com.manikandareas.codileap.user.domain.toUser

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
                // Clear all existing user-related data first
                preferenceDataSource.clearToken()
                preferenceDataSource.clearStudyTime()
                preferenceDataSource.clearUser()

                // Then save new data
                println("TOKEN: ${data!!.toToken()}")
                preferenceDataSource.saveToken(data!!.toToken())

                println("USER: ${data!!.user.toUser()}")
                preferenceDataSource.saveUser(data!!.user.toUser())

                preferenceDataSource.saveStudyTime(data!!.user.toUser().studyHours ?: "09:00")
            }
        }
    }

    override suspend fun logout() {
        preferenceDataSource.clearToken()
        preferenceDataSource.clearStudyTime()
        preferenceDataSource.clearUser()
    }

}