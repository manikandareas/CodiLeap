package com.manikandareas.codileap.chatbot.presentation.model

import com.manikandareas.codileap.chatbot.domain.VirtualAssistantChat
import java.time.ZonedDateTime


data class VirtualAssistantChatUi(
    val id: Int,
    val userId: Int,
    val question: String,
    val answer: String,
    val timestamp: ZonedDateTime
)

fun VirtualAssistantChat.toModelUi(): VirtualAssistantChatUi {
    return VirtualAssistantChatUi(
        id = id,
        userId = userId,
        question = question,
        answer = answer,
        timestamp = ZonedDateTime.parse(timestamp)
    )
}