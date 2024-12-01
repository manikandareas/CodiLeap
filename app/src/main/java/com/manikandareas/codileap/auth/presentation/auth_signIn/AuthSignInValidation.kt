package com.manikandareas.codileap.auth.presentation.auth_signIn

import com.manikandareas.codileap.core.presentation.util.validation.ValidateEmail
import com.manikandareas.codileap.core.presentation.util.validation.ValidatePassword

data class AuthSignInValidation(
    val validateEmail: ValidateEmail = ValidateEmail(),
    val validatePassword: ValidatePassword = ValidatePassword(),
)