package com.manikandareas.codileap.courses.domain

enum class LearningPathLevel(val level: String) {
    BEGINNER("beginner"),
    INTERMEDIATE("intermediate"),
    ADVANCED("advanced")
}

data class LearningPath(
    val id: Int,
    val name: String,
    val level: LearningPathLevel,
    val description: String,
    val createdAt: String,
    val updatedAt: String,
    val estimatedDuration: Int,

    val courses: List<Course>
)
