package com.manikandareas.codileap.user.data.networking.dto

import com.manikandareas.codileap.user.domain.User
import kotlinx.serialization.Serializable

@Serializable
data class UpdateUserForScreeningRequestDto(
//    val email: String? = null,
    val fullName: String? = null,
//    val phoneNumber: String? = null,
//    val address: String? = null,
//    val dateOfBirth: String? = null,
    val studyHours: String? = null,
//    val avatarUrl: String? = null,
    val isAlreadyScreened: Boolean = false
) {
    // Fungsi untuk membuat salinan data class hanya dengan field yang tidak null
//    fun toUpdateMap(): Map<String, Any> {
//        return buildMap {
//            email?.let { put("email", it) }
//            fullName?.let { put("fullName", it) }
//            phoneNumber?.let { put("phoneNumber", it) }
//            address?.let { put("address", it) }
//            dateOfBirth?.let { put("dateOfBirth", it) }
//            studyHours?.let { put("studyHours", it) }
//            avatarUrl?.let { put("avatarUrl", it) }
//            isAlreadyScreened?.let { put("isAlreadyScreened", it) }
//        }
//    }
}

fun User.toUpdateUserRequestDto(): UpdateUserForScreeningRequestDto {
    return UpdateUserForScreeningRequestDto(
//        email = email,
        fullName = fullName,
//        phoneNumber = phoneNumber,
//        address = address,
//        dateOfBirth = dob,
        studyHours = studyHours,
//        avatarUrl = avatarUrl,
        isAlreadyScreened = isAlreadyScreened
    )
}

//
//@Serializable
//data class UpdateUserRequestDto(
//    val email: String? = null,
//    val fullName: String? = null,
//    val phoneNumber: String? = null,
//    val address: String? = null,
//    val dateOfBirth: String? = null,
//    val studyHours: String? = null,
//    val avatarUrl: String? = null,
//    val isAlreadyScreened: Boolean? = null
//) {
//    // Fungsi untuk membuat salinan data class hanya dengan field yang tidak null
//    fun toUpdateMap(): Map<String, Any> {
//        return buildMap {
//            email?.let { put("email", it) }
//            fullName?.let { put("fullName", it) }
//            phoneNumber?.let { put("phoneNumber", it) }
//            address?.let { put("address", it) }
//            dateOfBirth?.let { put("dateOfBirth", it) }
//            studyHours?.let { put("studyHours", it) }
//            avatarUrl?.let { put("avatarUrl", it) }
//            isAlreadyScreened?.let { put("isAlreadyScreened", it) }
//        }
//    }
//}