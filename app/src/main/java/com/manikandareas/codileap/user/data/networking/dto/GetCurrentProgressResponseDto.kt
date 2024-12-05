package com.manikandareas.codileap.user.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class GetCurrentProgressResponseDto(
    val learningPathId: Int,
    val courseId: Int,
    val moduleId: Int
)