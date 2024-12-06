package com.manikandareas.codileap.courses.presentation.model

import com.manikandareas.codileap.core.presentation.util.toUTC
import com.manikandareas.codileap.courses.domain.Course
import com.manikandareas.codileap.courses.domain.CourseLevel
import com.manikandareas.codileap.courses.domain.Module
import java.time.Instant
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter


data class CourseUi(
    override val id: Int,
    override val name: String,
    val learningPathId: Int,
    override val description: String,
    val orderIndex: Int,

    val level: CourseLevel,

    override val totalModules: Int,

    val totalEnrollments: Int,
    val rating: Float,
    val estimatedDuration: Int,


    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
    val modules: List<ModuleUi>
) : HasBasicCourse


fun Course.toUiModel(): CourseUi {
    return CourseUi(
        id = id,
        name = name,
        learningPathId = learningPathId,
        description = description,
        orderIndex = orderIndex,
        level = level,
        totalModules = totalModules,
        totalEnrollments = totalEnrollments,
        rating = rating,
        estimatedDuration = estimatedDuration,
        createdAt = ZonedDateTime.parse(createdAt.toUTC()),
        updatedAt = ZonedDateTime.parse(updatedAt.toUTC()),
        modules = modules.map { it.toUiModel() }
    )
}
