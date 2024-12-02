package com.manikandareas.codileap.core.data.networking

import com.manikandareas.codileap.auth.data.networking.dto.RefreshTokenResponseDto
import com.manikandareas.codileap.auth.data.preference.PreferenceDataSource
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
import io.ktor.client.request.forms.submitForm
import io.ktor.client.request.parameter
import io.ktor.client.request.post
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.Parameters
import io.ktor.http.contentType
import io.ktor.http.encodedPath
import io.ktor.http.headers
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.flow.first
import kotlinx.serialization.json.Json


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
                    // Perbaikan: Gunakan return untuk menentukan path mana yang tidak memerlukan token
                    sendWithoutRequest { request ->
                        request.url.encodedPath.contains("login") || request.url.encodedPath.contains(
                            "register"
                        )
                    }

                    loadTokens {
                        val token = dataSource.getToken().first()
                        BearerTokens(
                            accessToken = token?.accessToken ?: "",
                            refreshToken = token?.refreshToken ?: ""
                        )
                    }

//                    refreshTokens {
//                        val currentToken = dataSource.getToken().first()
//                        val refreshToken = currentToken?.refreshToken ?: ""
//
//                        // Khusus untuk refresh token endpoint, gunakan refresh token di header
//                        val refreshTokenInfo: ApiResponse<RefreshTokenResponseDto> = client.submitForm(
//                            url = constructUrl("/api/auth/refresh"), // URL endpoint refresh token
//                            formParameters = Parameters.build {
//                                append("grant_type", "refresh_token")
//                                append("refresh_token", refreshToken)
//                            }
//                        ) {
//                            // Khusus untuk endpoint refresh, gunakan refresh token di header
//                            headers {
//                                append(HttpHeaders.Authorization, "Bearer $refreshToken")
//                            }
//                            markAsRefreshTokenRequest()
//                        }.body()
//
//                        val newToken = Token(
//                            accessToken = refreshTokenInfo.data!!.accessToken,
//                            refreshToken = refreshTokenInfo.data!!.refreshToken,
//                            expiresIn = refreshTokenInfo.data!!.expiresIn,
//                            tokenType = refreshTokenInfo.data!!.tokenType,
//                            refreshTokenExpiresIn = refreshTokenInfo.data!!.refreshTokenExpiresIn
//                        )
//
//                        dataSource.clearToken()
//                        dataSource.saveToken(newToken)
//
//                        BearerTokens(
//                            accessToken = newToken.accessToken,
//                            refreshToken = newToken.refreshToken
//                        )
//                    }

                    refreshTokens {
                        val currentRefreshToken = dataSource.getToken().first()?.refreshToken

                        val token = client.post(urlString = constructUrl("/api/auth/refresh")) {
                            markAsRefreshTokenRequest()
                            headers {
                                append(HttpHeaders.Authorization, "Bearer $currentRefreshToken")
                            }
                        }.body<ApiResponse<RefreshTokenResponseDto>>()

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
                    }
                }
            }

            install(ContentNegotiation) {
                json(
                    json = Json {
                        ignoreUnknownKeys = true
                    }
                )
            }
            defaultRequest {
                contentType(ContentType.Application.Json)
            }
        }
    }

}