package com.manikandareas.codileap.courses.data.networking.mappers

import com.manikandareas.codileap.courses.data.networking.dto.CourseDto
import com.manikandareas.codileap.courses.data.networking.dto.LearningPathDto
import com.manikandareas.codileap.courses.domain.LearningPath
import com.manikandareas.codileap.courses.domain.LearningPathLevel

fun LearningPathDto.toDomain(courses: List<CourseDto>? = null) = LearningPath(
    id = id,
    name = name,
    description = description,
    createdAt = createdAt,
    updatedAt = updatedAt,
    courses = courses?.map { it.toDomain() } ?: emptyList(),
    level = LearningPathLevel.values().find { it.level == level }
        ?: throw IllegalArgumentException("Invalid level: $level"),
    estimatedDuration = estimatedDuration
)