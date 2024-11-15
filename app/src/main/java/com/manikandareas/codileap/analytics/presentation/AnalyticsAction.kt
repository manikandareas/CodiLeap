package com.manikandareas.codileap.analytics.presentation

import com.manikandareas.codileap.core.navigation.Destination

sealed class AnalyticsAction {
    data class NavigateTo(val des: Destination) : AnalyticsAction()
}