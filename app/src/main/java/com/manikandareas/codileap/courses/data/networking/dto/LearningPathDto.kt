package com.manikandareas.codileap.courses.data.networking.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class LearningPathDto(
    val id: Int,
    val name: String,
    val description: String,
    val createdAt: String,
    val updatedAt: String,
    val courses: List<CourseDto>? = null
): Parcelable
