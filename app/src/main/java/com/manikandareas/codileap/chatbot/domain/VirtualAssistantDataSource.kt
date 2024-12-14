package com.manikandareas.codileap.chatbot.domain

import com.manikandareas.codileap.chatbot.data.netowrking.dto.VirtualAssistantAskRequestDto
import com.manikandareas.codileap.chatbot.data.netowrking.dto.VirtualAssistantAskResponseDto
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result

interface VirtualAssistantDataSource {
    suspend fun ask(
        request: VirtualAssistantAskRequestDto,
        userId: Int,
        id: Int
    ): Result<VirtualAssistantChat, NetworkError>
}