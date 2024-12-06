package com.manikandareas.codileap.courses.presentation.model

import com.manikandareas.codileap.core.presentation.util.toUTC
import com.manikandareas.codileap.courses.domain.LearningPath
import java.time.ZonedDateTime

data class LearningPathUi(
    override val id: Int,
    override val name: String,
    override val description: String,

    override val totalModules: Int,

    val courses: List<CourseUi>,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime
) : HasBasicCourse


fun LearningPath.toUiModel(): LearningPathUi {

    return LearningPathUi(
        id = id,
        name = name,
        description = description,

        totalModules = courses.sumOf { it.totalModules },

        courses = courses.map { it.toUiModel() },
        createdAt = ZonedDateTime.parse(createdAt.toUTC()),
        updatedAt = ZonedDateTime.parse(updatedAt.toUTC()),
    )
}