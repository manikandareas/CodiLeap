package com.manikandareas.codileap.auth.presentation.auth_register

import com.manikandareas.codileap.core.presentation.util.validation.ValidateEmail
import com.manikandareas.codileap.core.presentation.util.validation.ValidateName
import com.manikandareas.codileap.core.presentation.util.validation.ValidatePassword
import com.manikandareas.codileap.core.presentation.util.validation.ValidateRepeatedPassword

data class AuthRegisterValidation(
    val validateEmail: ValidateEmail = ValidateEmail(),
    val validatePassword: ValidatePassword = ValidatePassword(),
    val validateRepeatedPassword: ValidateRepeatedPassword = ValidateRepeatedPassword(),
)