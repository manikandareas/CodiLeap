package com.manikandareas.codileap.courses.presentation.model

import com.manikandareas.codileap.courses.domain.LearningPath
import java.time.ZonedDateTime

data class LearningPathUi(
    val id: Int,
    val name: String,
    val description: String,
    val level: String,
    val totalModules: Int,
    val estimatedDuration: String,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime
)


fun LearningPath.toUiModel() = LearningPathUi(
    id = id,
    name = name,
    description = description,
    level = level,
    totalModules = totalModules,
    estimatedDuration = estimatedDuration,
    createdAt = ZonedDateTime.parse(createdAt),
    updatedAt = ZonedDateTime.parse(updatedAt)
)