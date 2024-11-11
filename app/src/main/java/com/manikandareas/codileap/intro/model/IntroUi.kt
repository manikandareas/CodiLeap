package com.manikandareas.codileap.intro.model

import androidx.annotation.DrawableRes
import com.manikandareas.codileap.R
sealed class IntroUi (
    @DrawableRes val image: Int,
    val title: String,
    val description: String
) {
    object FirstScreen : IntroUi(
        image = R.drawable.illustration_first_intro,
        title = "Welcome to Codileap",
        description = "Codileap is a platform that helps you to learn and improve your coding skills."
    )

    object SecondScreen : IntroUi(
        image = R.drawable.illustration_second_intro,
        title = "Learn from the best",
        description = "We have a team of experts who will guide you through your learning journey."
    )

    object ThirdScreen : IntroUi(
        image = R.drawable.illustration_third_intro,
        title = "Get certified",
        description = "Get certified by completing our courses and improve your career prospects."
    )
}
