package com.manikandareas.codileap.courses.presentation.module

import com.manikandareas.codileap.courses.presentation.model.ModuleUi

sealed class ModuleAction {
    data object NavigateBack : ModuleAction()

    data class OnContinueClicked(val module: ModuleUi) : ModuleAction()
}