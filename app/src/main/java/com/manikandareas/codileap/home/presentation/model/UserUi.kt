package com.manikandareas.codileap.home.presentation.model

import com.manikandareas.codileap.user.domain.User

data class UserUi(
    val id: Int,
    val email: String,
    val avatarUrl: String,
    val isAlreadyScreened: Boolean,
    val fullName: String? = null,
    val phoneNumber: String? = null,
    val address: String? = null,
    val dob: String? = null,
    val studyHours: Int? = null,
)

fun User.toUiModel(): UserUi {
    return UserUi(
        id = id,
        email = email,
        avatarUrl = avatarUrl,
        isAlreadyScreened = isAlreadyScreened,
        fullName = fullName,
        phoneNumber = phoneNumber,
        address = address,
        dob = dob,
        studyHours = studyHours
    )
}