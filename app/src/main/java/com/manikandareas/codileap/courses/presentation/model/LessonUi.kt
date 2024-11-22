package com.manikandareas.codileap.courses.presentation.model

import com.manikandareas.codileap.courses.domain.Lesson
import com.manikandareas.codileap.courses.domain.Unit
data class LessonUi (
    val id: Int,
    val name: String,
    val status: String,
    val units: List<UnitUi>
)

data class UnitUi (
    val id: Int,
    val order: Int,
    val content: String,
    val type: String
)


fun Lesson.toUiModel() = LessonUi(
    id = id,
    name = name,
    status = status,
    units = units.map { it.toUiModel() }
)

fun Unit.toUiModel() = UnitUi(
    id = id,
    order = order,
    content = content,
    type = type
)