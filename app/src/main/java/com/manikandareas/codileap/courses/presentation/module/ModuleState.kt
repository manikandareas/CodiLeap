package com.manikandareas.codileap.courses.presentation.module

import com.manikandareas.codileap.courses.presentation.model.ModuleUi

data class ModuleState(
    val isLoading: Boolean = false,
    val moduleUi: ModuleUi
)
