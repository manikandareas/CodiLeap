package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class ModuleDto(
    val id: Int,
    val courseId: Int,
    val name: String,
    val description: String,
    val orderIndex: Int,
    val createdAt: String,
    val updatedAt: String,
    val units: List<UnitDto>
)

@Serializable
data class UnitDto(
    val id: Int,
    val moduleId: Int,
    val name: String,
    val content: String,
    val orderIndex: Int,
    val createdAt: String,
    val updatedAt: String
)