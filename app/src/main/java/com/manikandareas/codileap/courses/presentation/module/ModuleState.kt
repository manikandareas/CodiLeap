package com.manikandareas.codileap.courses.presentation.module

import com.manikandareas.codileap.chatbot.domain.VirtualAssistantChat
import com.manikandareas.codileap.chatbot.presentation.model.VirtualAssistantChatUi
import com.manikandareas.codileap.courses.presentation.model.ModuleUi

data class ModuleState(
    val isLoading: Boolean = false,
    val moduleUi: ModuleUi? = null,
    val currentModuleId: Int = 0,
    
    val chat: List<VirtualAssistantChatUi> = emptyList()
)
