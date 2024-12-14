package com.manikandareas.codileap.settings.presentation

import com.manikandareas.codileap.core.navigation.Destination


sealed class AppearanceAction {
    object NavigateBack : AppearanceAction()

    object OnToggleThemeClick : AppearanceAction()

    object OnReminderTimeEnableChange : AppearanceAction()
}