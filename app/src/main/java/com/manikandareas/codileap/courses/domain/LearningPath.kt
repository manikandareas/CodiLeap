package com.manikandareas.codileap.courses.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable


@Parcelize
@Serializable
data class LearningPath(
    val id: Int,
    val name: String,
    val description: String,
    val createdAt: String,
    val updatedAt: String,

    val courses: List<Course> = emptyList()
) : Parcelable
