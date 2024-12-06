package com.manikandareas.codileap.home.presentation.model

import com.manikandareas.codileap.user.domain.User

data class UserUi (
 val id: Int,
    val name: String? = null,
    val imageUrl: String,
    val isAlreadyScreened: Boolean,
    val email: String
)

fun User.toUiModel(): UserUi {
    return UserUi(
        id = id,
        name = "Vito Andareas Manik",
        imageUrl = avatarUrl,
        isAlreadyScreened = isAlreadyScreened,
        email = email
    )
}