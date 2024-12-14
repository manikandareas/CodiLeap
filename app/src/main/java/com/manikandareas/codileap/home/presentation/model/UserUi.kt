package com.manikandareas.codileap.home.presentation.model

import com.manikandareas.codileap.user.data.networking.dto.UpdateUserRequestDto
import com.manikandareas.codileap.user.domain.User
import java.util.Date

data class UserUi(
    val id: Int,
    val email: String,
    val avatarUrl: String,
    val isAlreadyScreened: Boolean,
    val fullName: String? = "",
    val phoneNumber: String? = "",
    val address: String? = "",
    val dob: String? = "",
    val studyHours: String? = "",
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

fun UserUi.toUpdateUserRequestDto(): UpdateUserRequestDto = UpdateUserRequestDto(
    id = id,
    email = email,
    avatarUrl = avatarUrl,
    isAlreadyScreened = isAlreadyScreened,
    fullName = fullName,
    phoneNumber = phoneNumber,
    address = address,
    dob = if (dob == "") Date().toString() else dob,
    studyHours = studyHours
)
