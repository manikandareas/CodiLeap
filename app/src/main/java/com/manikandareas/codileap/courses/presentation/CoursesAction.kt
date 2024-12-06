package com.manikandareas.codileap.courses.presentation

import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.courses.presentation.model.ModuleUi

sealed class CoursesAction {
    data class NavigateTo(val des: Destination) : CoursesAction()

    data class OnModuleClicked(val module: ModuleUi) : CoursesAction()

    data class OnCourseChanged (val courseId: Int) : CoursesAction()

    data class OnLearningPathChanged (val learningPathId: Int) : CoursesAction()
}