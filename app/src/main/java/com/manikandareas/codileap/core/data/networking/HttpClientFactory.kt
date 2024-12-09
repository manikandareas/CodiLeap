package com.manikandareas.codileap.core.data.networking

import com.manikandareas.codileap.auth.data.networking.dto.RefreshTokenResponseDto
import com.manikandareas.codileap.core.data.preference.PreferenceDataSource
import com.manikandareas.codileap.auth.domain.Token
import com.manikandareas.codileap.core.domain.networking.ApiResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.auth.*
import io.ktor.client.plugins.auth.providers.BearerTokens
import io.ktor.client.plugins.auth.providers.bearer
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.ANDROID
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.post
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.contentType
import io.ktor.http.encodedPath
import io.ktor.http.headers
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.flow.first
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json


@OptIn(ExperimentalSerializationApi::class)
object HttpClientFactory {
    fun create(engine: HttpClientEngine, dataSource: PreferenceDataSource): HttpClient {
        return HttpClient(engine) {
            expectSuccess = true
            install(Logging) {
                level = LogLevel.ALL
                logger = Logger.ANDROID
            }
            install(Auth) {
                bearer {
                    // Debug logging for token paths
                    sendWithoutRequest { request ->
                        val isPublicPath = request.url.encodedPath.contains("login") ||
                                request.url.encodedPath.contains("register")
                        println("Request Path: ${request.url.encodedPath}, Is Public: $isPublicPath")
                        isPublicPath
                    }

                    loadTokens {
                        val token = dataSource.getToken().first()
                        println("Loading Token - Access: ${token?.accessToken}, Refresh: ${token?.refreshToken}")
                        BearerTokens(
                            accessToken = token?.accessToken ?: "",
                            refreshToken = token?.refreshToken ?: ""
                        )
                    }

                    refreshTokens {
                        val currentToken = dataSource.getToken().first()
                        println("Current Refresh Token: ${currentToken?.refreshToken}")

                        try {
                            val token = client.post(urlString = constructUrl("/api/auth/refresh")) {
                                markAsRefreshTokenRequest()
                                // Choose one based on your API's requirements:
                                // Option 1: Header
                                headers {
                                    append(HttpHeaders.Authorization, "Bearer ${currentToken?.refreshToken}")
                                }
                                // Option 2: Body (if needed)
                                // body = RefreshTokenRequestDto(refreshToken = currentToken?.refreshToken)
                            }.body<ApiResponse<RefreshTokenResponseDto>>()

                            println("Refresh Response: ${token.data}")
                            dataSource.clearToken()

                            dataSource.saveToken(
                                Token(
                                    accessToken = token.data?.accessToken ?: "",
                                    refreshToken = token.data?.refreshToken ?: "",
                                    expiresIn = token.data?.expiresIn ?: 0,
                                    tokenType = token.data?.tokenType ?: "",
                                    refreshTokenExpiresIn = token.data?.refreshTokenExpiresIn ?: 0
                                )
                            )

                            BearerTokens(
                                accessToken = token.data?.accessToken ?: "",
                                refreshToken = token.data?.refreshToken ?: ""
                            )
                        } catch (e: Exception) {
                            println("Token Refresh Error: ${e.message}")
                            throw e
                        }
                    }
                }
            }

            install(ContentNegotiation) {
                json(
                    json = Json {
                        isLenient = true
                        ignoreUnknownKeys = true
                        allowSpecialFloatingPointValues = true
                        // Nonaktifkan strict parsing
                        useAlternativeNames = true
                        prettyPrint = true
                        coerceInputValues = true
                        explicitNulls = false
                    }
                )
            }
            defaultRequest {
                contentType(ContentType.Application.Json)
            }
        }
    }

}