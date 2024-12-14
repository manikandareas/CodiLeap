package com.manikandareas.codileap.settings.presentation

import com.manikandareas.codileap.user.domain.User

data class SettingsState(
    val currentUser: User? = null,
)