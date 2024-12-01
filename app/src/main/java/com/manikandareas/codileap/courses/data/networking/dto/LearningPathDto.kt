package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class LearningPathDto(
    val id: Int,
    val name: String,
    val level: String,
    val description: String,
    val estimatedDuration: Int,
    val createdAt: String,
    val updatedAt: String,
    val courses: List<CourseDto>
)
