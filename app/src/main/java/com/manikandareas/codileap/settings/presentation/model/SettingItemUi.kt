package com.manikandareas.codileap.settings.presentation.model

import androidx.compose.ui.graphics.vector.ImageVector
import com.manikandareas.codileap.core.navigation.Destination

data class SettingItemUi(
    val icon: ImageVector,
    val title: String,
    val des: Destination
)

