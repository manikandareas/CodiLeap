package com.manikandareas.codileap.courses.presentation.model

import com.manikandareas.codileap.courses.domain.Course
import com.manikandareas.codileap.courses.domain.LearningPath
import com.manikandareas.codileap.courses.domain.Progress
import java.time.ZonedDateTime


data class CourseUi(
    override val id: Int,
    override val name: String,
    override val description: String,
    override val totalModules: Int,
    val progress: ProgressUi
): HasBasicCourse

data class ProgressUi(
    val completed: Int,
    val total: Int,
    val percentage: Float
)

fun Course.toUiModel() = CourseUi(
    id = id,
    name = name,
    description = description,
    totalModules = totalModules,
    progress = progress.toUiModel()

)

fun Progress.toUiModel() = ProgressUi(
    completed = completed,
    total = total,
    percentage = percentage
)