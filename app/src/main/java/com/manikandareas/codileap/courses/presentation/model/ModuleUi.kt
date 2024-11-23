package com.manikandareas.codileap.courses.presentation.model

import android.os.Parcelable
import com.manikandareas.codileap.courses.domain.Module
import com.manikandareas.codileap.courses.domain.Unit
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class ModuleUi (
    val id: Int,
    val name: String,
    val status: String,
    val units: List<UnitUi>
) : Parcelable

@Serializable
@Parcelize
data class UnitUi (
    val id: Int,
    val order: Int,
    val content: String,
    val type: String
) : Parcelable


fun Module.toUiModel() = ModuleUi(
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