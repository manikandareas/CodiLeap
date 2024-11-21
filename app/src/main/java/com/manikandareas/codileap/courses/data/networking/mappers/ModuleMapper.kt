package com.manikandareas.codileap.courses.data.networking.mappers

import com.manikandareas.codileap.courses.data.networking.dto.LessonDto
import com.manikandareas.codileap.courses.data.networking.dto.UnitDto
import com.manikandareas.codileap.courses.domain.Lesson
import com.manikandareas.codileap.courses.domain.Unit

fun LessonDto.toDomain() = Lesson(
    id = id,
    name = name,
    status = status,
    units = units.map { it.toDomain() }
)

fun UnitDto.toDomain() = Unit(
    id = id,
    order = order,
    content = content,
    type = type,
)