package com.manikandareas.codileap.core.data.networking

import com.manikandareas.codileap.core.data.preference.PreferenceDataSource
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.network.sockets.ConnectTimeoutException
import io.ktor.client.plugins.HttpRequestRetry
import io.ktor.client.plugins.HttpRequestTimeoutException
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.auth.*
import io.ktor.client.plugins.auth.providers.BearerTokens
import io.ktor.client.plugins.auth.providers.bearer
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.ANDROID
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.encodedPath
import io.ktor.network.sockets.SocketTimeoutException
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.flow.first
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

//
//@OptIn(ExperimentalSerializationApi::class)
//object HttpClientFactory {
//    fun create(engine: HttpClientEngine, dataSource: PreferenceDataSource): HttpClient {
//        return HttpClient(engine) {
//            expectSuccess = true
//            install(Logging) {
//                level = LogLevel.ALL
//                logger = Logger.ANDROID
//            }
//            install(Auth) {
//                bearer {
//                    // Debug logging for token paths
//                    sendWithoutRequest { request ->
//                        val isPublicPath = request.url.encodedPath.contains("login") ||
//                                request.url.encodedPath.contains("register")
//                        println("Request Path: ${request.url.encodedPath}, Is Public: $isPublicPath")
//                        isPublicPath
//                    }
//
//                    loadTokens {
//                        val token = dataSource.getToken().first()
//                        println("Loading Token - Access: ${token?.accessToken}, Refresh: ${token?.refreshToken}")
//                        BearerTokens(
//                            accessToken = token?.accessToken ?: "",
//                            refreshToken = token?.refreshToken ?: ""
//                        )
//                    }
//
//                    refreshTokens {
//                        val currentToken = dataSource.getToken().first()
//                        println("Current Refresh Token: ${currentToken?.refreshToken}")
//
//                        try {
//                            val token = client.post(urlString = constructUrl("/api/auth/refresh")) {
//                                markAsRefreshTokenRequest()
//                                // Choose one based on your API's requirements:
//                                // Option 1: Header
//                                headers {
//                                    append(HttpHeaders.Authorization, "Bearer ${currentToken?.refreshToken}")
//                                }
//                                // Option 2: Body (if needed)
//                                // body = RefreshTokenRequestDto(refreshToken = currentToken?.refreshToken)
//                            }.body<ApiResponse<RefreshTokenResponseDto>>()
//
//                            println("Refresh Response: ${token.data}")
//                            dataSource.clearToken()
//
//                            dataSource.saveToken(
//                                Token(
//                                    accessToken = token.data?.accessToken ?: "",
//                                    refreshToken = token.data?.refreshToken ?: "",
//                                    expiresIn = token.data?.expiresIn ?: 0,
//                                    tokenType = token.data?.tokenType ?: "",
//                                    refreshTokenExpiresIn = token.data?.refreshTokenExpiresIn ?: 0
//                                )
//                            )
//
//                            BearerTokens(
//                                accessToken = token.data?.accessToken ?: "",
//                                refreshToken = token.data?.refreshToken ?: ""
//                            )
//                        } catch (e: Exception) {
//                            println("Token Refresh Error: ${e.message}")
//                            throw e
//                        }
//                    }
//                }
//            }
//
//            install(ContentNegotiation) {
//                json(
//                    json = Json {
//                        isLenient = true
//                        ignoreUnknownKeys = true
//                        allowSpecialFloatingPointValues = true
//                        // Nonaktifkan strict parsing
//                        useAlternativeNames = true
//                        prettyPrint = true
//                        coerceInputValues = true
//                        explicitNulls = false
//                    }
//                )
//            }
//            defaultRequest {
//                contentType(ContentType.Application.Json)
//            }
//        }
//    }
//
//}

@OptIn(ExperimentalSerializationApi::class)
object HttpClientFactory {
    fun create(
        engine: HttpClientEngine,
        dataSource: PreferenceDataSource
    ): HttpClient = HttpClient(engine) {
        expectSuccess = true

        // Logging untuk debugging
        install(Logging) {
            level = LogLevel.BODY
            logger = Logger.ANDROID
        }

        // Configure timeouts at the HttpClient level
        install(HttpTimeout) {
            requestTimeoutMillis = 60_000 // 60 seconds for entire request
            connectTimeoutMillis = 30_000 // 30 seconds for connection
            socketTimeoutMillis = 60_000  // 60 seconds for socket
        }

        // Add retry mechanism
        install(HttpRequestRetry) {
            retryOnServerErrors(maxRetries = 3)
            exponentialDelay()

            // Use requestTimeoutMillis for retry condition
            retryIf { _, throwable ->
                throwable is HttpRequestTimeoutException
            }
        }

        // Manajemen token otomatis
        install(Auth) {
            bearer {
                // Hanya kirim token untuk request non-publik
                sendWithoutRequest { request ->
                    !request.url.encodedPath.contains("/auth/")
                }

                // Selalu ambil token terbaru setiap request
                loadTokens {
                    val token = dataSource.getToken().first()
                    BearerTokens(
                        accessToken = token?.accessToken.orEmpty(),
                        refreshToken = ""  // Diabaikan
                    )
                }
            }
        }

        // Konfigurasi JSON serialization yang fleksibel
        install(ContentNegotiation) {
            json(Json {
                isLenient = true
                ignoreUnknownKeys = true
                useAlternativeNames = true
                coerceInputValues = true
                explicitNulls = false
            })
        }

        // Default request configuration
        defaultRequest {
            contentType(ContentType.Application.Json)
        }
    }
}