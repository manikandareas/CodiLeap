package com.manikandareas.codileap.home.presentation.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocalLibrary
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.manikandareas.codileap.core.navigation.Destination

sealed class BottomBarUi(
    val title: String,
    val icon: ImageVector,
    val route: Destination
) {
    object Home : BottomBarUi(
        title = "Home",
        icon = Icons.Default.Home,
        route = Destination.HomeScreen
    )

    object Courses : BottomBarUi(
        title = "Courses",
        icon = Icons.Default.LocalLibrary,
        route = Destination.CoursesScreen()
    )

    object Analytics : BottomBarUi(
        title = "Analytics",
        icon = Icons.Default.Analytics,
        route = Destination.AnalyticsScreen
    )

    object Settings : BottomBarUi(
        title = "Settings",
        icon = Icons.Default.Settings,
        route = Destination.SettingsScreen
    )
}