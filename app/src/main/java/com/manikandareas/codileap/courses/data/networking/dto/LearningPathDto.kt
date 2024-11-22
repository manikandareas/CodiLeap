package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class LearningPathDto(
    val id: Int,
    val name: String,
    val description: String,
    val level: String,
    val totalModules: Int,
    val estimatedDuration: String,
    val createdAt: String,
    val updatedAt: String
)