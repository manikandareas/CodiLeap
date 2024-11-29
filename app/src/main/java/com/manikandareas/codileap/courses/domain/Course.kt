package com.manikandareas.codileap.courses.domain

data class Course(
    val id: Int,
    val name: String,
    val learningPathId: Int,
    val totalModules: Int,
    val description: String,
    val createdAt: String,
    val updatedAt: String,
    val orderIndex: Int,

    val modules: List<Module>
)
