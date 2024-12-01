package com.manikandareas.codileap.auth.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.navigation.Navigator
import kotlinx.coroutines.launch

class AuthViewModel(private val navigator: Navigator) : ViewModel() {

    fun onAction(action: AuthAction) {
        when (action) {
            AuthAction.OnSignInClicked -> viewModelScope.launch {
                navigator.navigate(Destination.LoginScreen)
            }

            AuthAction.OnRegisterClicked -> viewModelScope.launch {
                navigator.navigate(Destination.RegisterScreen)
            }

            AuthAction.OnBackClicked -> viewModelScope.launch {
                navigator.navigateUp()
            }
        }
    }
}