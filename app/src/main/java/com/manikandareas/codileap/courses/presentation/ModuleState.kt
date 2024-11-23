package com.manikandareas.codileap.courses.presentation

import com.manikandareas.codileap.courses.presentation.model.CourseUi
import com.manikandareas.codileap.courses.presentation.model.LearningPathUi
import com.manikandareas.codileap.courses.presentation.model.ModuleUi

data class ModuleState(
    val isLoading: Boolean = false,
    val moduleUi: ModuleUi
)
