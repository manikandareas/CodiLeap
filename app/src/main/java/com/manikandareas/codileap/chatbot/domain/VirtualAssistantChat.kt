package com.manikandareas.codileap.chatbot.domain

import com.manikandareas.codileap.chatbot.data.netowrking.dto.VirtualAssistantAskResponseDto

data class VirtualAssistantChat(
    val id: Int,
    val userId: Int,
    val question: String,
    val answer: String,
    val timestamp: String
)

fun VirtualAssistantAskResponseDto.toDomain(
    userId: Int,
    id: Int,
    question: String
): VirtualAssistantChat {
    return VirtualAssistantChat(
        id = id,
        userId = userId,
        question = question,
        answer = answer,
        timestamp = message
    )
}