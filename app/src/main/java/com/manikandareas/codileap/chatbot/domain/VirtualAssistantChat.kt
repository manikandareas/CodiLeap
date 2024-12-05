package com.manikandareas.codileap.chatbot.domain

data class VirtualAssistantChat(
    val id: Int,
    val userId: Int,
    val question: String,
    val answer: String,
    val timestamp: String
)
