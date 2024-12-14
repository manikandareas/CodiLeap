@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)

package com.manikandareas.codileap.chatbot.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.manikandareas.codileap.auth.presentation.AuthAction
import com.manikandareas.codileap.chatbot.presentation.component.VirtualAssistantAppBar
import com.manikandareas.codileap.chatbot.presentation.component.VirtualAssistantChat
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun VirtualAssistantScreen(
    modifier: Modifier = Modifier,
    onBackClicked: (AuthAction) -> Unit = {}
) {
    Column(modifier = modifier.fillMaxSize()) {
        VirtualAssistantAppBar(onBackClicked = onBackClicked)
        VirtualAssistantChat()
    }
}
@PreviewLightDark
@Composable
fun PreviewChatBotScreen() {
    CodiLeapTheme {
        VirtualAssistantScreen(modifier = Modifier)
    }
}
