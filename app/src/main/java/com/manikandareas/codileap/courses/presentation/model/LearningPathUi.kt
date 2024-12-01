package com.manikandareas.codileap.courses.presentation.model

import com.manikandareas.codileap.courses.domain.Course
import com.manikandareas.codileap.courses.domain.LearningPath
import com.manikandareas.codileap.courses.domain.LearningPathLevel
import java.time.ZonedDateTime

data class LearningPathUi(
    override val id: Int,
    override val name: String,
    val level: LearningPathLevel,
    override val description: String,
    val estimatedDuration: Int,

    override val totalModules: Int,

    val courses: List<CourseUi>,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime
): HasBasicCourse


fun LearningPath.toUiModel() = LearningPathUi(
    id = id,
    name = name,
    level = level,
    description = description,
    estimatedDuration = estimatedDuration,
    totalModules = courses.sumOf { it.totalModules },
    courses = courses.map { it.toUiModel() },
    createdAt = ZonedDateTime.parse(createdAt),
    updatedAt = ZonedDateTime.parse(updatedAt)
)


