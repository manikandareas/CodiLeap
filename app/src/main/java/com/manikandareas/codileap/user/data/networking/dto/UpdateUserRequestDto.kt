package com.manikandareas.codileap.user.data.networking.dto

import java.util.Date

data class UpdateUserRequestDto(
    val id: Int,
    val email: String,
    val avatarUrl: String,
    val isAlreadyScreened: Boolean,
    val fullName: String? = "",
    val phoneNumber: String? = "",
    val address: String? = "",
    val dob: String? = Date().toString(),
    val studyHours: String? = "",
)