package com.manikandareas.codileap.settings.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.auth.domain.AuthDataSource

import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.navigation.Navigator
import kotlinx.coroutines.launch

class SettingsViewModel(
    private val navigator: Navigator,
    private val authDataSource: AuthDataSource,
) : ViewModel() {
    fun onAction(action: SettingsAction) {
        when (action) {
            is SettingsAction.NavigateTo -> viewModelScope.launch {
                navigator.navigate(action.des)
            }
            SettingsAction.OnSignOutClick -> onSignOutClick()
        }
    }


    fun onSignOutClick() = viewModelScope.launch {
        authDataSource.logout()
        navigator.navigate(Destination.AuthGraph) {
            popUpTo(Destination.AuthGraph) { inclusive = true }
        }
    }
}