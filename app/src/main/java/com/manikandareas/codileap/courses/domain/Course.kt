package com.manikandareas.codileap.courses.domain

data class Course (
    val id: Int,
    val name: String,
    val description: String,
    val totalModules: Int,
    val progress: Progress
)

data class Progress (
    val completed: Int,
    val total: Int,
    val percentage: Float
)

