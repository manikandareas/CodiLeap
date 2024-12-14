package com.manikandareas.codileap.user.presentation

import com.manikandareas.codileap.home.presentation.model.UserUi

data class UserProfileState(
    val isLoading: Boolean = false,
    val user: UserUi? = null,

    val fullName: String? = "",
    val phoneNumber: String? = "",
    val address: String? = "",
    val dob: String? = "",
    val studyHours: String? = "",
)