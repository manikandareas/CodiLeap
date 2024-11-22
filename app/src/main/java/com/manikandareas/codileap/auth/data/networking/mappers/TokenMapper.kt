package com.manikandareas.codileap.auth.data.networking.mappers

import com.manikandareas.codileap.auth.data.networking.dto.LoginResponseDto
import com.manikandareas.codileap.auth.domain.Token


fun LoginResponseDto.toToken(): Token {
    return Token(
        accessToken = accessToken,
        tokenType = tokenType,
        expiresIn = expiresIn,
        refreshToken = refreshToken,
        refreshTokenExpiresIn = refreshTokenExpiresIn
    )
}