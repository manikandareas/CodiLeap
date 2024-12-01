package com.manikandareas.codileap.di

import com.manikandareas.codileap.auth.presentation.auth_register.AuthRegisterValidation
import com.manikandareas.codileap.auth.presentation.auth_signIn.AuthSignInValidation
import org.koin.dsl.module

val validationModule = module {
    single { AuthRegisterValidation() }
    single { AuthSignInValidation() }
}