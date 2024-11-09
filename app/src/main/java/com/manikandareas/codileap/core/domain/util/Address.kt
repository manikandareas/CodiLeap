package com.manikandareas.codileap.core.domain.util

import kotlinx.serialization.Serializable

@Serializable
data class Address(
    val countryName: String?,
    val countryCode: String?,
    val latitude: Double?,
    val longitude: Double?
)