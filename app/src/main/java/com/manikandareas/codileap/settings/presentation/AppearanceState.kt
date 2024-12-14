package com.manikandareas.codileap.settings.presentation

data class AppearanceState(
    val isDarkMode: Boolean = true,
    val reminderTime: String? = null,
    val isReminderEnabled: Boolean = false
)
