package com.manikandareas.codileap.courses.domain

enum class CourseLevel(val level: String) {
    BEGINNER("beginner"),
    INTERMEDIATE("intermediate"),
    ADVANCED("advanced")
}

data class Course(
    val id: Int,
    val name: String,
    val learningPathId: Int,
    val description: String,
    val orderIndex: Int,

    val level: CourseLevel,

    val totalModules: Int,
    val totalEnrollments: Int,
    val rating: Double,
    val estimatedDuration: Int,


    val createdAt: String,
    val updatedAt: String,

    val modules: List<Module>
)
