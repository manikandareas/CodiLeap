package com.manikandareas.codileap.di

import com.manikandareas.codileap.core.navigation.DefaultNavigator
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.navigation.Navigator
import org.koin.dsl.module

val navigationModule= module{
    single<Navigator> {
        DefaultNavigator(startDestination = Destination.HomeGraph)
    }
}