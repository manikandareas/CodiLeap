package com.manikandareas.codileap.auth.presentation.model

import androidx.annotation.DrawableRes
import com.manikandareas.codileap.R

sealed class AuthUi(
    @DrawableRes val image: Int = 0,
    val title: String,
    val description: String
) {
    object AuthData : AuthUi(
        image = R.drawable.coder_1,
        title = "Start Your Coding Journey!",
        description = "Start coding! Sign up or log in to track your progress, earn rewards, and unlock exclusive content."
    )

    object RegisterData : AuthUi(
        title = "Create Your CodiLeap Account",
        description = "Complete the form to get started."
    )

    object SignInData : AuthUi(
        title = "Let's sign you in.",
        description = "Welcome Back.\nYou've been missed!"
    )
}