package com.manikandareas.codileap.courses.presentation.module

import com.manikandareas.codileap.courses.presentation.model.CourseUi
import com.manikandareas.codileap.courses.presentation.model.ModuleUi

sealed class ModuleAction {
    data object NavigateBack : ModuleAction()

    data object OnContinueClicked : ModuleAction()

    data class GotoNextModule(val moduleUi: ModuleUi) : ModuleAction()
    data class GotoNextCourse(val courseUi: CourseUi) : ModuleAction()

    data object Exit : ModuleAction()
}