package com.manikandareas.codileap.core.data.networking

import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import io.ktor.client.plugins.HttpRequestTimeoutException
import io.ktor.client.plugins.ResponseException
import io.ktor.client.statement.HttpResponse
import io.ktor.util.network.UnresolvedAddressException
import kotlinx.coroutines.ensureActive
import kotlinx.serialization.SerializationException
import kotlin.coroutines.cancellation.CancellationException
import kotlin.coroutines.coroutineContext

//suspend inline fun <reified T> safeCall(
//    execute: () -> HttpResponse
//): Result<T, NetworkError> {
//    val response = try {
//        execute()
//    } catch (e: UnresolvedAddressException) {
//        println(e.printStackTrace())
//        return Result.Error(NetworkError.NO_INTERNET)
//    } catch (e: SerializationException) {
//        println(e.printStackTrace())
//        return Result.Error(NetworkError.SERIALIZATION)
//    }  catch (e: Exception) {
//        println(e.printStackTrace())
//        coroutineContext.ensureActive()
//        return Result.Error(NetworkError.UNKNOWN)
//    }
//
//    return responseToResult(response)
//}

suspend inline fun <reified T> safeCall(
    execute: () -> HttpResponse
): Result<T, NetworkError> {
    return try {
        val response = execute()
        responseToResult(response)
    } catch (e: UnresolvedAddressException) {
        // Error koneksi internet
        Result.Error(NetworkError.NO_INTERNET)
    } catch (e: HttpRequestTimeoutException) {
        // Error timeout koneksi
        Result.Error(NetworkError.REQUEST_TIMEOUT)
    } catch (e: SerializationException) {
        // Error serialisasi
        Result.Error(NetworkError.SERIALIZATION)
    } catch (e: ResponseException) {
        println("SC response exception: ${e.response.status.value}")
        // Tangani exception spesifik response
        when (e.response.status.value) {
            401 -> Result.Error(NetworkError.UNAUTHORIZED)
            403 -> Result.Error(NetworkError.FORBIDDEN)
            404 -> Result.Error(NetworkError.NOT_FOUND)
            408 -> Result.Error(NetworkError.REQUEST_TIMEOUT)
            409 -> Result.Error(NetworkError.CONFLICT)
            429 -> Result.Error(NetworkError.TOO_MANY_REQUESTS)
            in 500..599 -> Result.Error(NetworkError.SERVER_ERROR)
            else -> Result.Error(NetworkError.UNKNOWN)
        }
    } catch (e: CancellationException) {
        // Tangani pembatalan корутины
        throw e
    } catch (e: Exception) {
        // Tangani exception umum yang tidak terduga
        println("Unexpected network error: ${e.javaClass.simpleName} - ${e.message}")
        Result.Error(NetworkError.UNKNOWN)
    }
}