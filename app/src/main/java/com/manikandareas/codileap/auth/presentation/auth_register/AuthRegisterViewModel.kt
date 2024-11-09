package com.manikandareas.codileap.auth.presentation.auth_register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.auth.presentation.AuthAction
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.navigation.Navigator
import kotlinx.coroutines.launch

class AuthRegisterViewModel(private val navigator: Navigator) : ViewModel() {
    fun onAction(action: AuthRegisterAction) {
        when (action) {
            AuthRegisterAction.OnSignInClicked -> viewModelScope.launch {
                navigator.navigate(Destination.LoginScreen)
            }

            AuthRegisterAction.OnBackClicked -> viewModelScope.launch {
                navigator.navigate(
                    Destination.AuthScreen
                ) { popUpTo(Destination.AuthScreen) { inclusive = true } }
            }
        }
    }
}