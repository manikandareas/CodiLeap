package com.manikandareas.codileap.screening.presentation

import com.manikandareas.codileap.core.navigation.Destination

sealed class ScreeningAction {
    data class NavigateTo(val des: Destination) : ScreeningAction()
}