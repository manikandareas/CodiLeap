package com.manikandareas.codileap.courses.data.networking.mappers

import com.manikandareas.codileap.courses.data.networking.dto.ModuleDto
import com.manikandareas.codileap.courses.data.networking.dto.UnitDto
import com.manikandareas.codileap.courses.domain.Module
import com.manikandareas.codileap.courses.domain.Unit

fun ModuleDto.toDomain() = Module(
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