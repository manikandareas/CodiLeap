package com.manikandareas.codileap.core.navigation

import com.manikandareas.codileap.courses.presentation.model.ModuleUi
import kotlinx.serialization.Serializable

sealed interface Destination {
    @Serializable
    data object AuthGraph : Destination

    @Serializable
    data object AuthScreen : Destination

    @Serializable
    data object LoginScreen : Destination

    @Serializable
    data object RegisterScreen : Destination

    @Serializable
    data object IntroGraph : Destination

    @Serializable
    data object IntroScreen : Destination

    @Serializable
    data object ScreeningGraph : Destination

    @Serializable
    data object ScreeningScreen : Destination

    @Serializable
    data object HomeGraph : Destination

    @Serializable
    data object HomeScreen : Destination

    @Serializable
    data object CoursesScreen : Destination

    @Serializable
    data object ModuleGraph : Destination

    @Serializable
    data class ModuleScreen(val moduleUi: ModuleUi) : Destination

    @Serializable
    data object AnalyticsScreen : Destination

    @Serializable
    data object SettingsScreen : Destination

    @Serializable
    data object ProfileScreen : Destination


}