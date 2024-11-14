package com.manikandareas.codileap.home.presentation.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChatBubble
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark

@Composable
fun HomeChatBotFab(modifier: Modifier = Modifier) {
    FloatingActionButton(modifier=modifier, onClick = {}) {
        Icon(
            imageVector = Icons.Default.ChatBubble,
            contentDescription = "Chat with the bot"
        )
    }
}

@PreviewLightDark
@Composable
fun PreviewHomeChatBotFab(modifier: Modifier = Modifier) {
    HomeChatBotFab(modifier = modifier)
}