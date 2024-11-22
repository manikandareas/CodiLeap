package com.manikandareas.codileap.core.domain.networking

data class ApiResponse<T>(
    val message: String,
    val status: String,
    val data: T?,
)