package com.manikandareas.codileap.core.domain.validation

class ValidateName {
    fun execute(name: String): ValidationResult {
        if(name.isBlank()) {
            return ValidationResult(
                successful = false,
                errorMessage = "The name can't be blank"
            )
        }
        if(name.length < 3) {
            return ValidationResult(
                successful = false,
                errorMessage = "The name must be at least 3 characters long"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}