package com.manikandareas.codileap.screening.presentation.model

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import com.manikandareas.codileap.R
import com.manikandareas.codileap.intro.model.IntroUi

sealed class ScreeningUi(
    val title: String,
    val description: String? = null,
    @DrawableRes
    val image: Int? = null
) {
    object FirstScreen : ScreeningUi(
        title = "Welcome to Codileap",
        description = "let's get started with knowing more about you",
    )

    object SecondScreen : ScreeningUi(
        title = "What's your name?",
    )
}