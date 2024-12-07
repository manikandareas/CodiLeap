package com.manikandareas.codileap.courses.domain


data class LearningPath(
    val id: Int,
    val name: String,
    val description: String,
    val createdAt: String,
    val updatedAt: String,
    val courses: List<Course>
)
