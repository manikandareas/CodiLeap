package com.manikandareas.codileap.core.domain.validation

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)