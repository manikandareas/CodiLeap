package com.manikandareas.codileap.courses.presentation

import com.manikandareas.codileap.courses.presentation.model.LearningPathUi
import com.manikandareas.codileap.courses.presentation.model.ModuleUi
import com.manikandareas.codileap.courses.presentation.model.CourseUi

data class CoursesState(
    val isLoading: Boolean = false,
    val selectedLearningPath: LearningPathUi? = null,
    val learningPaths: List<LearningPathUi> = emptyList(),
    val selectedCourse: CourseUi? = null,
    val modules: List<ModuleUi> = emptyList()
)
