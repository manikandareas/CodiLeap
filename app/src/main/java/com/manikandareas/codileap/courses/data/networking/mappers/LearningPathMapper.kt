package com.manikandareas.codileap.courses.data.networking.mappers

import com.manikandareas.codileap.courses.data.networking.dto.LearningPathDto
import com.manikandareas.codileap.courses.domain.LearningPath

fun LearningPathDto.toDomain() = LearningPath(
    id = id,
    name = name,
    description = description,
    createdAt = createdAt,
    updatedAt = updatedAt,
    level = level,
    totalModules = totalModules,
    estimatedDuration = estimatedDuration
)