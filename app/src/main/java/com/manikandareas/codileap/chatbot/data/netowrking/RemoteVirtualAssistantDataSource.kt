package com.manikandareas.codileap.chatbot.data.netowrking

import com.manikandareas.codileap.chatbot.data.netowrking.dto.VirtualAssistantAskRequestDto
import com.manikandareas.codileap.chatbot.data.netowrking.dto.VirtualAssistantAskResponseDto
import com.manikandareas.codileap.chatbot.domain.VirtualAssistantChat
import com.manikandareas.codileap.chatbot.domain.VirtualAssistantDataSource
import com.manikandareas.codileap.chatbot.domain.toDomain
import com.manikandareas.codileap.core.data.networking.constructUrl
import com.manikandareas.codileap.core.data.networking.safeCall
import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.core.domain.util.map
import io.ktor.client.HttpClient
import io.ktor.client.request.post
import io.ktor.client.request.setBody

class RemoteVirtualAssistantDataSource(private val httpClient: HttpClient) :
    VirtualAssistantDataSource {
    override suspend fun ask(
        request: VirtualAssistantAskRequestDto,
        userId: Int,
        id: Int
    ): Result<VirtualAssistantChat, NetworkError> {
        return safeCall<ApiResponse<VirtualAssistantAskResponseDto>> {
            httpClient.post(
                urlString = constructUrl("/api/virtual/ask")
            ) {
                setBody(request)
            }
        }.map {
            it.data!!.toDomain(
                userId = userId,
                question = request.question,
                id = id
            )
        }
    }

}