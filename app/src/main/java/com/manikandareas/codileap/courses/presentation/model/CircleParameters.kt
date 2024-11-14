package com.manikandareas.codileap.courses.presentation.model


import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

data class CircleParameters(
    val radius: Dp,
    val backgroundColor: Color,
    val stroke: StrokeParameters? = null,
    @DrawableRes val icon: Int? = null
)
