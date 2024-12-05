package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CompleteModuleResponseDto(
    val isLearningPathCompleted: Boolean,
    val isCourseCompleted: Boolean,
    val nextModule: ModuleDto? = null,
    val nextCourse: CourseDto? = null,
)
