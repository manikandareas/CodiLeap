@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.chatbot.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

data class ChatMessage(
    val message: String,
    val isFromUser: Boolean,
    val timestamp: String = ""
)

@Composable
fun ChatBotChat(
    modifier: Modifier = Modifier,
    messages: List<ChatMessage> = emptyList(),
    onSendMessage: (String) -> Unit = {}
) {
    var messageText by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            reverseLayout = true
        ) {
            items(messages.asReversed()) { message ->
                ChatBubble(message = message)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }

        ChatInput(
            value = messageText,
            onValueChange = { messageText = it },
            onSendClick = {
                if (messageText.isNotBlank()) {
                    onSendMessage(messageText)
                    messageText = ""
                }
            }
        )
    }
}

@Composable
fun ChatBubble(
    modifier: Modifier = Modifier,
    message: ChatMessage
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = if (message.isFromUser) Alignment.End else Alignment.Start
    ) {
        Box(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = 16.dp,
                        topEnd = 16.dp,
                        bottomStart = if (message.isFromUser) 16.dp else 4.dp,
                        bottomEnd = if (message.isFromUser) 4.dp else 16.dp
                    )
                )
                .background(
                    if (message.isFromUser)
                        MaterialTheme.colorScheme.primary
                    else
                        MaterialTheme.colorScheme.secondaryContainer
                )
                .padding(12.dp)
        ) {
            Text(
                text = message.message,
                color = if (message.isFromUser)
                    MaterialTheme.colorScheme.onPrimary
                else
                    MaterialTheme.colorScheme.onSecondaryContainer,
                style = TextStyle(fontSize = 16.sp)
            )
        }

        if (message.timestamp.isNotEmpty()) {
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = message.timestamp,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = TextStyle(fontSize = 12.sp)
            )
        }
    }
}

@Composable
fun ChatInput(
    modifier: Modifier = Modifier,
    value: String = "",
    onValueChange: (String) -> Unit = {},
    onSendClick: () -> Unit = {}
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shadowElevation = 8.dp,
        color = MaterialTheme.colorScheme.surface
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = value,
                onValueChange = onValueChange,
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(24.dp)),
                placeholder = { Text("Type a message") },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = MaterialTheme.colorScheme.surfaceVariant,
                    focusedContainerColor = MaterialTheme.colorScheme.surfaceVariant
                ),
                maxLines = 4
            )

            Spacer(modifier = Modifier.width(8.dp))

            FilledIconButton(
                onClick = onSendClick,
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Send,
                    contentDescription = "Send message"
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewChatBotChat() {
    CodiLeapTheme {
        ChatBotChat(
            messages = listOf(
                ChatMessage("Hello! How can I help you today?", false),
                ChatMessage("I have a question about coding", true)
            )
        )
    }
}

@PreviewLightDark
@Composable
fun PreviewChatBubble() {
    CodiLeapTheme {
        Column {
            ChatBubble(message = ChatMessage("Hello! How can I help you?", false))
            Spacer(modifier = Modifier.height(8.dp))
            ChatBubble(message = ChatMessage("I need help with my learning path", true))
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewChatInput() {
    CodiLeapTheme {
        ChatInput(value = "Hello world")
    }
}
