package com.manikandareas.codileap.auth.domain

import com.manikandareas.codileap.auth.data.networking.dto.UserResponseDto
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class User(
    val id: Int,
    val email: String,
    val avatarUrl: String,
    val isAlreadyScreened: Boolean
)


fun UserResponseDto.toUser(): User {
    return User(
        id = id,
        email = email,
        avatarUrl = avatarUrl,
        isAlreadyScreened = isAlreadyScreened
    )
}


object  UserSerializer {
    private val json = Json { prettyPrint = true }

    fun serialize(user: User): String {
        return json.encodeToString(user)
    }

    fun deserialize(jsonString: String): User {
        return json.decodeFromString(jsonString)
    }
}