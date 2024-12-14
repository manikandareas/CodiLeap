package com.manikandareas.codileap.courses.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
enum class CourseLevel(val level: String) {
    BEGINNER("beginner"),
    INTERMEDIATE("intermediate"),
    ADVANCED("advanced")
}

@Serializable
@Parcelize
data class Course(
    val id: Int,
    val name: String,
    val learningPathId: Int,
    val description: String,
    val orderIndex: Int,

    val level: CourseLevel,

    val totalModules: Int,
    val totalEnrollments: Int,
    val rating: Float,
    val estimatedDuration: Int,


    val createdAt: String,
    val updatedAt: String,

    val modules: List<Module>
): Parcelable
