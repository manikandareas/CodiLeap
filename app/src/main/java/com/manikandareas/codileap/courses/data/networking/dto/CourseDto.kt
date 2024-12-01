package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CourseDto(
    val id: Int,
    val name: String,
    val learningPathId: Int,
    val totalModules: Int,
    val description: String,
    val orderIndex: Int,
    val createdAt: String,
    val updatedAt: String
)