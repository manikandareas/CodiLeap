package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class LessonDto(
    val id: Int,
    val name: String,
    val status: String,
    val units: List<UnitDto>
)

@Serializable
data class UnitDto(
    val id: Int,
    val order: Int,
    val content: String,
    val type: String,
)
