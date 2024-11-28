package com.manikandareas.codileap.courses.domain

data class Module(
    val id: Int,
    val courseId: Int,
    val name: String,
    val description: String,
    val orderIndex: Int,
    val createdAt: String,
    val updatedAt: String,
    val units: List<Unit>
)

data class Unit(
    val id: Int,
    val moduleId: Int,
    val name: String,
    val orderIndex: Int,
    val content: String,
    val createdAt: String,
    val updatedAt: String
)
