package com.manikandareas.codileap.courses.data.networking.mappers

import com.manikandareas.codileap.courses.data.networking.dto.CourseDto
import com.manikandareas.codileap.courses.data.networking.dto.ModuleDto
import com.manikandareas.codileap.courses.data.networking.dto.UnitDto
import com.manikandareas.codileap.courses.domain.Course
import com.manikandareas.codileap.courses.domain.CourseLevel
import com.manikandareas.codileap.courses.domain.Module
import com.manikandareas.codileap.courses.domain.Unit

fun CourseDto.toDomain() = Course(
    id = id,
    name = name,
    description = description,
    createdAt = createdAt,
    updatedAt = updatedAt,
    orderIndex = orderIndex,
    totalModules = totalModules,
    learningPathId = learningPathId,
    level = CourseLevel.values().find { it.level == level }?: throw IllegalArgumentException("Invalid level: $level"),
    totalEnrollments = totalEnrollments,
    rating = rating,
    estimatedDuration = estimatedDuration,
    modules = modules?.map { it.toDomain() } ?: emptyList()
)

fun ModuleDto.toDomain() = Module(
    id = id,
    name = name,
    courseId = courseId,
    orderIndex = orderIndex,
    description = description,
    createdAt = createdAt,
    updatedAt = updatedAt,
    units = units?.map { it.toDomain() } ?: emptyList()
)

fun UnitDto.toDomain() = Unit(
    id = id,
    name = name,
    content = content,
    orderIndex = orderIndex,
    createdAt = createdAt,
    updatedAt = updatedAt,
    moduleId = moduleId,
)
//
