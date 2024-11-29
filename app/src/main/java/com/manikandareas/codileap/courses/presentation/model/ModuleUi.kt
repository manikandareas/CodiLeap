package com.manikandareas.codileap.courses.presentation.model

import android.os.Parcelable
import com.manikandareas.codileap.courses.domain.Module
import com.manikandareas.codileap.courses.domain.Unit
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class ModuleUi(
    val id: Int,
    val courseId: Int,
    val name: String,
    val description: String,
    val orderIndex: Int,
    val createdAt: String,
    val updatedAt: String,
    val units: List<UnitUi>
) : Parcelable

@Serializable
@Parcelize
data class UnitUi(
    val id: Int,
    val moduleId: Int,
    val name: String,
    val orderIndex: Int,
    val content: String,
    val createdAt: String,
    val updatedAt: String
) : Parcelable


fun Module.toUiModel() = ModuleUi(
    id = id,
    courseId = courseId,
    name = name,
    description = description,
    orderIndex = orderIndex,
    createdAt = createdAt,
    updatedAt = updatedAt,
    units = units.map { it.toUiModel() }
)

fun Unit.toUiModel() = UnitUi(
    id = id,
    moduleId = moduleId,
    name = name,
    orderIndex = orderIndex,
    content = content,
    createdAt = createdAt,
    updatedAt = updatedAt
)