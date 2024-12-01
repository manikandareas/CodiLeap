package com.manikandareas.codileap.auth.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponseDto(
    val accessToken: String,
    val tokenType: String,
    val expiresIn: Long,
    val refreshToken: String,
    val refreshTokenExpiresIn: Long,
    val user : UserResponseDto
)

@Serializable
data class UserResponseDto(
    val id: Int,
    val email: String
)