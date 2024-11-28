package com.manikandareas.codileap.courses.presentation.model

import com.manikandareas.codileap.courses.domain.Course
import com.manikandareas.codileap.courses.domain.Module
import java.time.ZonedDateTime


data class CourseUi(
    override val id: Int,
    override val name: String,
    val learningPathId: Int,
    override val totalModules: Int,
    override val description: String,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
    val orderIndex: Int,

    val modules: List<ModuleUi>
) : HasBasicCourse


fun Course.toUiModel() = CourseUi(
    id = id,
    name = name,
    description = description,
    totalModules = totalModules,
    learningPathId = learningPathId,
    createdAt = ZonedDateTime.parse(createdAt),
    updatedAt = ZonedDateTime.parse(updatedAt),
    orderIndex = orderIndex,
    modules = modules.map { it.toUiModel() }
)
