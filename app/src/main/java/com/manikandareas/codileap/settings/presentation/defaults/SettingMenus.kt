package com.manikandareas.codileap.settings.presentation.defaults

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.QuestionAnswer
import androidx.compose.material.icons.filled.RoomPreferences
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.settings.presentation.model.SettingItemUi

val SettingMenus = listOf<SettingItemUi>(
    SettingItemUi(
        title = "Personal Data",
        icon = Icons.Default.Person,
        des = Destination.ProfileScreen
    ),
    SettingItemUi(
        title = "Appearance",
        icon = Icons.Default.RoomPreferences,
        des = Destination.ProfileScreen
    ),

    SettingItemUi(
        title = "FAQs",
        icon = Icons.Default.QuestionAnswer,
        des = Destination.FAQsScreen
    ),
    SettingItemUi(
        title = "Sign out",
        icon = Icons.AutoMirrored.Filled.ExitToApp,
        des = Destination.ProfileScreen
    ),
)