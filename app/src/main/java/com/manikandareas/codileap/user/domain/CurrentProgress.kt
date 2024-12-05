package com.manikandareas.codileap.user.domain

import com.manikandareas.codileap.user.data.networking.dto.GetCurrentProgressResponseDto

data class CurrentProgress(
    val learningPathId: Int,
    val courseId: Int,
    val moduleId: Int
)

fun GetCurrentProgressResponseDto.toDomain () = CurrentProgress(
    learningPathId = learningPathId,
    courseId = courseId,
    moduleId = moduleId
)