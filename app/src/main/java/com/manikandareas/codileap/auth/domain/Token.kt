package com.manikandareas.codileap.auth.domain

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


@Serializable
data class Token(
    val accessToken: String,
    val tokenType: String,
    val expiresIn: Long,
    val refreshToken: String,
    val refreshTokenExpiresIn: Long
)

object TokenSerializer {

    private val json = Json { prettyPrint = true }

    // Serialisasi objek Token menjadi JSON string
    fun serialize(token: Token): String {
        return json.encodeToString(token)
    }

    // Deserialisasi JSON string menjadi objek Token
    fun deserialize(jsonString: String): Token {
        return json.decodeFromString(jsonString)
    }
}