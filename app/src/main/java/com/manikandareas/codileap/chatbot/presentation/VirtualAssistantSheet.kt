@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.chatbot.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Summarize
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SheetState
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.R
import com.manikandareas.codileap.chatbot.presentation.component.VirtualAssistantBubbleUi
import com.manikandareas.codileap.chatbot.presentation.component.VirtualAssistantBubble
import com.manikandareas.codileap.chatbot.presentation.model.VirtualAssistantChatUi
import com.manikandareas.codileap.ui.compositions.CodiButton
import com.manikandareas.codileap.ui.compositions.CodiOutlinedTextField
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun VirtualAssistantSheet(
    onDismiss: () -> Unit,
    onClick: (String) -> Unit,
    sheetState: SheetState,
    modifier: Modifier = Modifier,
    isLoading: Boolean = false,
    chats: List<VirtualAssistantChatUi> = emptyList()
) {
    var message by remember {
        mutableStateOf("")
    }

    // State to track long loading
    var showLongLoadingMessage by remember { mutableStateOf(false) }

    // Timeout logic for long loading
    LaunchedEffect(isLoading) {
        if (isLoading) {
            launch {
                delay(5_000) // 10 seconds threshold
                showLongLoadingMessage = true
            }
        } else {
            showLongLoadingMessage = false
        }
    }

    // Snackbar host state
    val snackBarHostState = remember { SnackbarHostState() }

    // Show Snackbar when loading takes too long
    LaunchedEffect(showLongLoadingMessage) {
        if (showLongLoadingMessage) {
            snackBarHostState.showSnackbar(
                message = "Codi is thinking about your question... please be patient.",
                duration = SnackbarDuration.Long
            )
        }
    }

    ModalBottomSheet(
        onDismissRequest = {
            onDismiss()
        },
        sheetState = sheetState,
        containerColor = MaterialTheme.colorScheme.surfaceContainer,
    ) {
        Scaffold(
            modifier = modifier.fillMaxSize(),
            snackbarHost = {
                SnackbarHost(hostState = snackBarHostState)
            },
            bottomBar = {
                val focusManager = LocalFocusManager.current // Mendapatkan FocusManager
                Box(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(IntrinsicSize.Min)
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.Top
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .heightIn(min = 56.dp, max = 120.dp)
                        ) {
                            CodiOutlinedTextField(
                                value = message,
                                onValueChange = {
                                    message = it
                                },
                                modifier = Modifier
                                    .fillMaxWidth(),
                                placeholder = "What is ...",
                                singleLine = false,
                                maxLines = 5
                            )
                        }

                        Spacer(modifier = Modifier.width(16.dp))

                        CodiButton(
                            onClick = {
                                onClick(message)
                                message = ""
                                focusManager.clearFocus()
                            },
                            modifier = Modifier
                                .height(56.dp)
                                .width(IntrinsicSize.Min),
                            enabled = !isLoading
                        ) {
                            Icon(
                                imageVector = Icons.Default.Send,
                                contentDescription = "Send",
                                tint = Color.White,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }
                }
            }
        ) { innerPadding ->
            LazyColumn(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.surfaceContainer)
                    .padding(innerPadding)
                    .padding(horizontal = 16.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                item {
                    Image(
                        painter = painterResource(id = R.drawable.chat_bot_1),
                        contentDescription = "Chat Bot",
                        modifier = Modifier.size(100.dp)
                    )
                }

                item {
                    Text(
                        text = "How can i help you today?",
                        style = MaterialTheme.typography.titleMedium,
                        textAlign = TextAlign.Center
                    )
                }

                item {
                    Text(
                        text = "Codi will answer your questions and help you learn",
                        style = MaterialTheme.typography.titleMedium,
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                    )
                }

                item {
                    ChatBotOption(
                        onClick = { onClick("Courses") },
                        icon = Icons.Default.Summarize,
                        iconTint = MaterialTheme.colorScheme.primary,
                        title = "Summarize",
                        description = "Simplifies long content into brief, key highlights for quick understanding.",
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.size(16.dp))
                }

                items(chats.sortedByDescending { it.timestamp }.asReversed()) { message ->
                    VirtualAssistantBubble(
                        state = VirtualAssistantBubbleUi(
                            message = message.question,
                            position = Alignment.End
                        )
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    VirtualAssistantBubble(
                        state = VirtualAssistantBubbleUi(
                            message = message.answer,
                            position = Alignment.Start
                        )
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
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
        VirtualAssistantSheet(
            onDismiss = {},
            onClick = {},
            sheetState = rememberModalBottomSheetState(),
            modifier = Modifier
        )
    }
}