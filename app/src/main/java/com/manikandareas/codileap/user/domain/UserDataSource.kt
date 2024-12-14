package com.manikandareas.codileap.user.domain

import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.user.data.networking.dto.UpdateUserForScreeningRequestDto
import com.manikandareas.codileap.user.data.networking.dto.UpdateUserRequestDto
import com.manikandareas.codileap.user.data.networking.dto.UpdateUserResponseDto

interface UserDataSource {
    suspend fun updateUserForScreening(request: UpdateUserForScreeningRequestDto): Result<UpdateUserResponseDto, NetworkError>

    suspend fun updateUser(request: UpdateUserRequestDto): Result<UpdateUserResponseDto, NetworkError>
}
