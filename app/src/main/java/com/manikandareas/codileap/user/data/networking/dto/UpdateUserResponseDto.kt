package com.manikandareas.codileap.user.data.networking.dto

import kotlinx.serialization.Serializable


@Serializable
data class UpdateUserResponseDto(
    val id: Int,
    val email: String,
    val fullName: String?,
    val phoneNumber: String?,
    val address: String?,
    val dateOfBirth: String?,
    val studyHours: String?,
    val createdAt: String?,
    val avatarUrl: String,
    val isAlreadyScreened: Boolean,
    val updatedAt: String?
)
