package com.manikandareas.codileap.courses.data.networking.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class CourseDto(
    val id: Int,
    val name: String,
    val learningPathId: Int,
    val totalModules: Int,
    val description: String,
    val createdAt: String,
    val updatedAt: String,
    val orderIndex: Int,
    val level: String,
    val estimatedDuration: Int,
    val rating: Float,
    val totalEnrollments: Int,
    val modules: List<ModuleDto>? = emptyList()
): Parcelable