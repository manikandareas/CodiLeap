@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.chatbot.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Summarize
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.courses.presentation.component.Options
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import com.manikandareas.codileap.R
import com.manikandareas.codileap.chatbot.domain.VirtualAssistantChat
import com.manikandareas.codileap.chatbot.presentation.component.ChatBotChat

@Composable
fun ChatBotSheet(
    onDismiss: () -> Unit,
    onClick: (String) -> Unit,

    sheetState: SheetState,
    modifier: Modifier = Modifier
) {
    ModalBottomSheet(
        onDismissRequest = {
            onDismiss()
        },
        sheetState = sheetState
    ) {
        Column(
            modifier = modifier.padding(horizontal = 16.dp, ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.chat_bot_1),
                contentDescription = "Chat Bot",
                modifier = Modifier.size(100.dp)
            )
            Text(
                text = "How can i help you today?",
                style = MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Codi will answer your questions and help you learn",
                style = MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )

            ChatBotOption(
                onClick = { onClick("Courses") },
                icon = Icons.Default.Summarize,
                iconTint = MaterialTheme.colorScheme.primary,
                title = "Summarize",
                description = "Simplifies long content into brief, key highlights for quick understanding.",
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.size(16.dp))

            ChatBotChat(
                modifier = Modifier.fillMaxWidth(),
                messages = listOf(
                    VirtualAssistantChat(
                        id = 1,
                        userId = 1,
                        question = "Please help me summarize this content",
                        answer = "Sure, I can help you with that",
                        timestamp = "12:00 AM"
                    )
                )
            )
        }
    }
}

@Composable
fun ChatBotOption(
    onClick: () -> Unit,
    icon: ImageVector = Icons.Default.Summarize,
    iconTint: Color = MaterialTheme.colorScheme.primary,
    modifier: Modifier,
    title: String,
    description: String,
) {
    Card(modifier = Modifier.clickable(onClick = onClick)) {
        Column(
            modifier = modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                contentDescription = "Chat Option Icon",
                imageVector = icon,
                tint = iconTint,
                modifier = Modifier.size(42.dp),
            )
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center
            )
            Text(
                text = description,
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )
        }
    }
}

@Preview
@Composable
private fun PreviewChatBotSheet() {
    CodiLeapTheme {
        ChatBotSheet(
            onDismiss = {},
            onClick = {},
            sheetState = rememberModalBottomSheetState(),
            modifier = Modifier
        )
    }
}