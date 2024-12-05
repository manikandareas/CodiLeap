package com.manikandareas.codileap.courses.presentation

import com.manikandareas.codileap.courses.presentation.model.CourseUi
import com.manikandareas.codileap.courses.presentation.model.LearningPathUi

data class CoursesState(
    val isLoading: Boolean = false,
    val selectedLearningPath: LearningPathUi? = null,
    val learningPaths: List<LearningPathUi> = emptyList(),
    val selectedCourse: CourseUi? = null,
    val currentModuleId: Int? = null,
    val courses: List<CourseUi> = emptyList()
)
