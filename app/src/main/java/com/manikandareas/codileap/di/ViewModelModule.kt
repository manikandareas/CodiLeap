package com.manikandareas.codileap.di

import com.manikandareas.codileap.auth.presentation.AuthViewModel
import com.manikandareas.codileap.auth.presentation.auth_register.AuthRegisterViewModel
import com.manikandareas.codileap.auth.presentation.auth_signIn.AuthSignInViewModel
import com.manikandareas.codileap.courses.presentation.CoursesViewModel
import org.koin.core.module.dsl.viewModelOf

import org.koin.dsl.bind
import org.koin.dsl.module


val viewModelModule = module {
    viewModelOf(::AuthRegisterViewModel).bind<AuthRegisterViewModel>()
    viewModelOf(::AuthSignInViewModel).bind<AuthSignInViewModel>()
    viewModelOf(::AuthViewModel).bind<AuthViewModel>()
    viewModelOf(::CoursesViewModel).bind<CoursesViewModel>()
}