package com.manikandareas.codileap.core.domain.networking

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse<T>(
    val message: String,
    val status: String,
    val data: T?,
)