package com.manikandareas.codileap.courses.presentation.defaults

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.courses.presentation.model.CircleParameters
import com.manikandareas.codileap.courses.presentation.model.StrokeParameters


object CircleParametersDefaults {

    private val defaultCircleRadius = 20.dp

    fun circleParameters(
        radius: Dp = defaultCircleRadius,
        backgroundColor: Color = Color.Cyan,
        stroke: StrokeParameters? = null,
        @DrawableRes
        icon: Int? = null
    ) = CircleParameters(
        radius,
        backgroundColor,
        stroke,
        icon
    )
}