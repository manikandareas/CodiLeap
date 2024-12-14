package com.manikandareas.codileap.user.domain

import com.manikandareas.codileap.auth.data.networking.dto.UserResponseDto
import com.manikandareas.codileap.user.data.networking.dto.UpdateUserRequestDto
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.util.Date

@Serializable
data class User(
    val id: Int,
    val email: String,
    val avatarUrl: String,
    val isAlreadyScreened: Boolean,
    val fullName: String? = "",
    val phoneNumber: String? = "",
    val address: String? = "",
    val dob: String? = "",
    val studyHours: String? = "",
)


fun UserResponseDto.toUser(): User {
    return User(
        id = id,
        email = email,
        avatarUrl = avatarUrl,
        isAlreadyScreened = isAlreadyScreened,
        fullName = if (fullName == null) "" else fullName,
        phoneNumber = if (phoneNumber == null) "" else phoneNumber,
        address = if (address == null) "" else address,
        dob = if (dob == null) "" else dob,
        studyHours = if (studyHours == null) "" else studyHours
    )
}


object UserSerializer {
    private val json = Json { prettyPrint = true }

    fun serialize(user: User): String {
        return json.encodeToString(user)
    }

    fun deserialize(jsonString: String): User {
        return json.decodeFromString(jsonString)
    }
}