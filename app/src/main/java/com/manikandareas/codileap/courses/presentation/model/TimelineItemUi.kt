package com.manikandareas.codileap.courses.presentation.model

import androidx.annotation.DrawableRes
import com.manikandareas.codileap.R

data class TimelineItemUi(
    val title: String,
    @DrawableRes val icon: Int = R.drawable.ic_lesson_item,
    val unitCount: Int = 0,
    val durationInMinutes: Int = 0,
    val onClick: () -> Unit = {}
)