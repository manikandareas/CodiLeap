package com.manikandareas.codileap.courses.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class Module(
    val id: Int,
    val courseId: Int,
    val name: String,
    val description: String,
    val orderIndex: Int,
    val createdAt: String,
    val updatedAt: String,
    val units: List<Unit>
) : Parcelable

@Serializable
@Parcelize
data class Unit(
    val id: Int,
    val moduleId: Int,
    val name: String,
    val orderIndex: Int,
    val content: String,
    val createdAt: String,
    val updatedAt: String
) : Parcelable
