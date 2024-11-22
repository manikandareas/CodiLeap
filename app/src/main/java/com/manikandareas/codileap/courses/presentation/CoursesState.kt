package com.manikandareas.codileap.courses.presentation

import com.manikandareas.codileap.courses.presentation.model.LearningPathUi
import com.manikandareas.codileap.courses.presentation.model.LessonUi
import com.manikandareas.codileap.courses.presentation.model.ModuleUi

data class CoursesState(
    val isLoading: Boolean = false,
    val selectedLearningPath: LearningPathUi? = null,
    val learningPaths: List<LearningPathUi> = emptyList(),
    val selectedModule: ModuleUi? = null,
    val lessons: List<LessonUi> = emptyList()
)
