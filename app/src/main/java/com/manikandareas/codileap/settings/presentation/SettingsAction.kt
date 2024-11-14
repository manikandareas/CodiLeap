package com.manikandareas.codileap.settings.presentation

import com.manikandareas.codileap.core.navigation.Destination

sealed class SettingsAction {
    data class NavigateTo(val des: Destination) : SettingsAction()
}