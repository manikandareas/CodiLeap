package com.manikandareas.codileap.courses.presentation.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.NavigateNext
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.home.presentation.component.HomeChatBotFab
import com.manikandareas.codileap.ui.compositions.CodiButton
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun ModuleBottomAppBar(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onContinue: () -> Unit = {},
    text: String = "Continue",
    onChatBotFABClick : () -> Unit = {}
) {
    Row(modifier = modifier.padding(16.dp)) {
        CodiButton (
            onClick = {onContinue()},
        modifier = Modifier.weight(1f),
            shape = MaterialTheme.shapes.medium,
            contentPadding = PaddingValues(16.dp),
            enabled = enabled
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text)
                Icon(
                    imageVector = Icons.AutoMirrored.Default.NavigateNext,
                    contentDescription = "Next Unit"
                )
            }
        }

        HomeChatBotFab(
            modifier = Modifier.padding(start = 16.dp),
            onClick = {onChatBotFABClick()}
        )
    }
}

@PreviewLightDark
@Composable
private fun ModuleBottomAppBarPreview() {
    CodiLeapTheme {
        ModuleBottomAppBar()
    }
}