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
import com.manikandareas.codileap.chatbot.domain.VirtualAssistantChat
import com.manikandareas.codileap.ui.theme.CodiLeapTheme


@Composable
fun ChatBotChat(
    modifier: Modifier = Modifier,
    messages: List<VirtualAssistantChat> = emptyList(),
) {

    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
//            reverseLayout = true
        ) {
            items(messages.asReversed()) { message ->
                ChatBubble(
                    state = BubbleChatUi(
                        message = message.question,
                        position = Alignment.End
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                ChatBubble(
                    state = BubbleChatUi(
                        message = message.answer,
                        position = Alignment.Start
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }


    }
}

data class BubbleChatUi(
    val message: String,
    val position: Alignment.Horizontal = Alignment.End,
    val timestamp: String = "",

    )

@Composable
fun ChatBubble(
    modifier: Modifier = Modifier,
    state: BubbleChatUi,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = state.position
    ) {
        Box(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = 16.dp,
                        topEnd = 16.dp,
                        bottomStart = if (state.position == Alignment.End) 16.dp else 4.dp,
                        bottomEnd = if (state.position == Alignment.End) 4.dp else 16.dp
                    )
                )
                .background(
                    if (state.position == Alignment.End)
                        MaterialTheme.colorScheme.primary
                    else
                        MaterialTheme.colorScheme.secondaryContainer
                )
                .padding(12.dp)
        ) {
            Text(
                text = state.message,
                color = if (state.position == Alignment.End)
                    MaterialTheme.colorScheme.onPrimary
                else
                    MaterialTheme.colorScheme.onSecondaryContainer,
                style = TextStyle(fontSize = 16.sp)
            )
        }

        if (state.timestamp.isNotEmpty()) {
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = state.timestamp,
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
                VirtualAssistantChat(
                    question = "Hi can i get some help?",
                    answer = "Sure, how can I help you?",
                    timestamp = "12:00 AM",
                    id = 1,
                    userId = 1
                ),
            )
        )
    }
}
//
//@PreviewLightDark
//@Composable
//fun PreviewChatBubble() {
//    CodiLeapTheme {
//        Column {
//            ChatBubble()
//            Spacer(modifier = Modifier.height(8.dp))
//            ChatBubble(message = ChatMessage("I need help with my learning path", true))
//        }
//    }
//}

@PreviewLightDark
@Composable
fun PreviewChatInput() {
    CodiLeapTheme {
        ChatInput(value = "Hello world")
    }
}
