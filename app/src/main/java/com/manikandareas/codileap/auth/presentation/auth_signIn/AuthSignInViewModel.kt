package com.manikandareas.codileap.auth.presentation.auth_signIn

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.navigation.Navigator
import kotlinx.coroutines.launch

class AuthSignInViewModel(private val navigator: Navigator) : ViewModel() {
    fun onAction(action: AuthSignInAction) {
        when (action) {
            AuthSignInAction.OnRegisterClicked -> viewModelScope.launch {
                navigator.navigate(Destination.RegisterScreen)
            }

            AuthSignInAction.OnBackClicked -> viewModelScope.launch {
                navigator.navigateUp()
            }
        }
    }
}