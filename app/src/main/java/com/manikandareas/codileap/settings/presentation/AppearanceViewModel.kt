package com.manikandareas.codileap.settings.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.core.data.preference.PreferenceDataSource
import com.manikandareas.codileap.core.navigation.Navigator
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.update

class AppearanceViewModel(
    private val preferenceDataSource: PreferenceDataSource,
    private val navigator: Navigator,
) : ViewModel() {

    private val _state = MutableStateFlow(AppearanceState())
    val state = _state
        .onStart { loadSettings() }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), AppearanceState())

    private fun loadSettings() {
        viewModelScope.launch {
            // Menggunakan combine untuk menggabungkan beberapa Flow
            combine(
                preferenceDataSource.isDarkMode,
                preferenceDataSource.reminderTime,
                preferenceDataSource.isStudyReminderEnabled
            ) { isDarkMode, reminderTime, isReminderEnabled ->
                _state.update {
                    it.copy(
                        isDarkMode = isDarkMode,
                        reminderTime = reminderTime,
                        isReminderEnabled = isReminderEnabled
                    )
                }
            }.launchIn(viewModelScope)
        }
    }

    fun onAction(action: AppearanceAction) {
        when (action) {
            AppearanceAction.NavigateBack -> viewModelScope.launch {
                navigator.navigateUp()
            }

            AppearanceAction.OnReminderTimeEnableChange -> viewModelScope.launch {
                preferenceDataSource.saveStudyReminder(!state.value.isReminderEnabled)
            }

            AppearanceAction.OnToggleThemeClick -> viewModelScope.launch {
                preferenceDataSource.saveDarkModePreference(!state.value.isDarkMode)
            }
        }
    }
}