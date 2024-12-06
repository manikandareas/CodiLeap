package com.manikandareas.codileap.home.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.R

@Composable
fun HomeChatBotFab(onClick: () -> Unit, modifier: Modifier = Modifier) {
    FloatingActionButton(modifier=modifier, onClick = {onClick()}) {
        Image(
            painter = painterResource(id = R.drawable.chat_bot_1),
            modifier = Modifier.size(32.dp),
            contentDescription = "Chat with the bot"
        )
    }
}

@PreviewLightDark
@Composable
fun PreviewHomeChatBotFab(modifier: Modifier = Modifier) {
    HomeChatBotFab(modifier = modifier, onClick = {})
}