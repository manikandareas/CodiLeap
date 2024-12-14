package com.manikandareas.codileap.screening.presentation.model

import androidx.annotation.DrawableRes

sealed class ScreeningItemUi(
    val title: String,
    val description: String? = null,
    @DrawableRes
    val image: Int? = null
) {
    object FirstScreen : ScreeningItemUi(
        title = "Welcome to Codileap",
        description = "let's get started with knowing more about you",
    )

    object SecondScreen : ScreeningItemUi(
        title = "What's your name?",
    )
}