package com.manikandareas.codileap.chatbot.data.netowrking.dto

import kotlinx.serialization.Serializable

@Serializable
data class VirtualAssistantAskResponseDto(
    val answer: String,
    val score: Double,
    val message: String
)



//
//"answer": "Vito sangat ganteng",
//"score": 0.2000623196363449,
//"message": "Chat successfully processed and saved"