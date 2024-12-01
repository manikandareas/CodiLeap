package com.manikandareas.codileap.core.presentation.util.validation

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)