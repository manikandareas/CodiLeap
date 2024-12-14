package com.manikandareas.codileap.core.presentation.util

import android.os.Build
import android.os.Parcelable
import androidx.core.bundle.Bundle
import androidx.navigation.NavType
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

inline fun <reified T : Parcelable> parcelableType(
    isNullableAllowed: Boolean = false,
    json: Json = Json,
) = object : NavType<T>(isNullableAllowed = isNullableAllowed) {
    override fun get(bundle: Bundle, key: String) =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            bundle.getParcelable(key, T::class.java)
        } else {
            @Suppress("DEPRECATION")
            bundle.getParcelable(key)
        }

    override fun parseValue(value: String): T = json.decodeFromString(value)

    override fun serializeAsValue(value: T): String = json.encodeToString(value)

    override fun put(bundle: Bundle, key: String, value: T) = bundle.putParcelable(key, value)
}

//inline fun <reified T : Parcelable> nullableParcelType(
//    isNullableAllowed: Boolean = false,
//    json: Json = Json,
//) = object : NavType<T>(isNullableAllowed = isNullableAllowed) {
//    override fun get(bundle: Bundle, key: String) =
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
//            bundle.getParcelable(key, T::class.java)
//        } else {
//            @Suppress("DEPRECATION")
//            bundle.getParcelable(key)
//        }
//
//    override fun parseValue(value: String): T = json.decodeFromString(value)
//
//    override fun serializeAsValue(value: T): String = json.encodeToString(value)
//
//    override fun put(bundle: Bundle, key: String, value: T) = bundle.putParcelable(key, value)
//}

inline fun <reified T : Parcelable> nullableParcelType(
    json: Json = Json
) = object : NavType<T?>(isNullableAllowed = true) {
    override fun get(bundle: Bundle, key: String): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            bundle.getParcelable(key, T::class.java)
        } else {
            @Suppress("DEPRECATION")
            bundle.getParcelable(key)
        }

    override fun parseValue(value: String): T? =
        if (value.isBlank()) null
        else json.decodeFromString(value)

    override fun serializeAsValue(value: T?): String =
        value?.let { json.encodeToString(it) } ?: ""

    //    override fun put(bundle: Bundle, key: String, value: T?) =
//        value?.let { bundle.putParcelable(key, it) }
    override fun put(bundle: Bundle, key: String, value: T?) = bundle.putParcelable(key, value)
}
