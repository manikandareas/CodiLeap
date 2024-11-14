package com.manikandareas.codileap.settings.presentation.defaults

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.QuestionAnswer
import androidx.compose.material.icons.filled.RoomPreferences
import androidx.compose.material.icons.filled.Style
import com.manikandareas.codileap.settings.presentation.model.SettingItemUi

val SettingMenus = listOf<SettingItemUi>(
    SettingItemUi(
        title = "Personal Data",
        icon = Icons.Default.Person,
        onClick = {}
    ),
    SettingItemUi(
        title = "Appearance",
        icon = Icons.Default.RoomPreferences,
        onClick = {}
    ),

    SettingItemUi(
        title = "FAQs",
        icon = Icons.Default.QuestionAnswer,
        onClick = {}
    ),
    SettingItemUi(
        title = "Sign out",
        icon = Icons.AutoMirrored.Filled.ExitToApp,
        onClick = {}
    ),
)