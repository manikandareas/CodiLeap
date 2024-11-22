@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)

package com.manikandareas.codileap.chatbot.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import com.manikandareas.codileap.auth.presentation.AuthAction
import com.manikandareas.codileap.chatbot.presentation.component.ChatBotAppBar
import com.manikandareas.codileap.chatbot.presentation.component.ChatBotChat
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun ChatBotScreen(
    modifier: Modifier = Modifier,
    onBackClicked: (AuthAction) -> Unit = {}
) {
    Column(modifier = modifier.fillMaxSize()) {
        ChatBotAppBar(onBackClicked = onBackClicked)
        ChatBotChat()
    }
}
@PreviewLightDark
@Composable
fun PreviewChatBotScreen() {
    CodiLeapTheme {
        ChatBotScreen(modifier = Modifier)
    }
}
