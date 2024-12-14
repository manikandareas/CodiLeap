package com.manikandareas.codileap.chatbot.data.netowrking.dto

import kotlinx.serialization.Serializable

@Serializable
data class VirtualAssistantAskRequestDto(
    val context: String,
    val question: String
)