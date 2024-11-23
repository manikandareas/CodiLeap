package com.manikandareas.codileap.courses.presentation.model

import com.manikandareas.codileap.courses.domain.Course
import com.manikandareas.codileap.courses.domain.Progress


data class CourseUi(
    val id: Int,
    val name: String,
    val description: String,
    val totalModules: Int,
    val progress: ProgressUi
)

data class ProgressUi(
    val completed: Int,
    val total: Int,
    val percentage: Float
)

fun Course.toUiModel() = CourseUi(
    id = id,
    name = name,
    description = description,
    totalModules = totalModules,
    progress = progress.toUiModel()

)

fun Progress.toUiModel() = ProgressUi(
    completed = completed,
    total = total,
    percentage = percentage
)