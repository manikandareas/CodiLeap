package com.manikandareas.codileap.courses.domain

data class Module (
    val id: Int,
    val name: String,
    val description: String,
    val totalLessons: Int,
    val progress: Progress
)

data class Progress (
    val completed: Int,
    val total: Int,
    val percentage: Float
)

