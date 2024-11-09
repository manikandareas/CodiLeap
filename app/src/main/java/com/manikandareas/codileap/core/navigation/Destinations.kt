package com.manikandareas.codileap.core.navigation

import kotlinx.serialization.Serializable

sealed interface Destination {
    @Serializable
    data object AuthGraph : Destination

    @Serializable
    data object LoginScreen : Destination

    @Serializable
    data object RegisterScreen : Destination

    @Serializable
    data object HomeGraph : Destination

    @Serializable
    data object IntroGraph : Destination

    @Serializable
    data object IntroScreen : Destination

}