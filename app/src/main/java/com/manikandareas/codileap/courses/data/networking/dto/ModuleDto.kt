package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class ModuleDto(
    val id: Int,
    val name: String,
    val description: String,
    val totalLessons: Int,
    val progress: ModuleProgressDto
)


@Serializable
data class ModuleProgressDto (
    val completed: Int,
    val total: Int,
    val percentage: Float,
)