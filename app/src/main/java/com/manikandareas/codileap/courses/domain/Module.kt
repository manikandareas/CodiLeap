package com.manikandareas.codileap.courses.domain

data class Module (
    val id: Int,
    val name: String,
    val status: String,
    val units: List<Unit>
)

data class Unit (
    val id: Int,
    val order: Int,
    val content: String,
    val type: String
)
