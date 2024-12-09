package com.manikandareas.codileap.di

import com.manikandareas.codileap.auth.presentation.AuthViewModel
import com.manikandareas.codileap.auth.presentation.auth_register.AuthRegisterViewModel
import com.manikandareas.codileap.auth.presentation.auth_signIn.AuthSignInViewModel
import com.manikandareas.codileap.courses.presentation.CoursesViewModel
import com.manikandareas.codileap.courses.presentation.module.ModuleViewModel
import com.manikandareas.codileap.home.presentation.HomeViewModel
import com.manikandareas.codileap.quiz.presentation.QuizViewModel
import com.manikandareas.codileap.settings.presentation.SettingsViewModel
import com.manikandareas.codileap.user.presentation.UserProgressViewModel
import org.koin.core.module.dsl.viewModelOf

import org.koin.dsl.bind
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::AuthRegisterViewModel).bind<AuthRegisterViewModel>()
    viewModelOf(::AuthSignInViewModel).bind<AuthSignInViewModel>()
    viewModelOf(::AuthViewModel).bind<AuthViewModel>()
    viewModelOf(::CoursesViewModel).bind<CoursesViewModel>()
    viewModelOf(::SettingsViewModel).bind<SettingsViewModel>()
    viewModelOf(::UserProgressViewModel).bind<UserProgressViewModel>()
    viewModelOf(::ModuleViewModel).bind<ModuleViewModel>()
    viewModelOf(::QuizViewModel).bind<QuizViewModel>()
    viewModelOf(::HomeViewModel).bind<HomeViewModel>()
}