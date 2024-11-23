package com.manikandareas.codileap.courses.presentation.model

import com.manikandareas.codileap.courses.domain.Module
import com.manikandareas.codileap.courses.domain.Progress


data class ModuleUi(
    val id: Int,
    val name: String,
    val description: String,
    val totalLessons: Int,
    val progress: ProgressUi
)

data class ProgressUi(
    val completed: Int,
    val total: Int,
    val percentage: Float
)

fun Module.toUiModel() = ModuleUi(
    id = id,
    name = name,
    description = description,
    totalLessons = totalLessons,
    progress = progress.toUiModel()

)

fun Progress.toUiModel() = ProgressUi(
    completed = completed,
    total = total,
    percentage = percentage
)