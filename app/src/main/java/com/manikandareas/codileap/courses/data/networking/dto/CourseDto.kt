package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CourseDto(
    val id: Int,
    val name: String,
    val description: String,
    val totalModules: Int,
    val progress: CourseProgressDto
)


@Serializable
data class CourseProgressDto (
    val completed: Int,
    val total: Int,
    val percentage: Float,
)