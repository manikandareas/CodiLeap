package com.manikandareas.codileap.settings.presentation.model

import androidx.compose.ui.graphics.vector.ImageVector

data class SettingItemUi(
    val icon: ImageVector,
    val title: String,
    val onClick: () -> Unit
)

