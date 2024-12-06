@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.quiz.presentation.component

import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBackIos
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun QuizAppBar(
    onBack: () -> Unit,
    onExit: () -> Unit,
    enabled: Boolean = true,
    quizProgress: Float,
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(
        modifier = modifier,
        navigationIcon = {
            IconButton(
                onClick = { onBack() },
                enabled = enabled,
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Default.ArrowBackIos,
                    contentDescription = "Back",

                    )
            }
        },
        title = {
            LinearProgressIndicator(
                progress = { quizProgress },
                modifier = Modifier.height(12.dp),
                color = MaterialTheme.colorScheme.primaryContainer,
                trackColor = MaterialTheme.colorScheme.onPrimaryContainer
            )
        },
        actions = {
            IconButton(
                onClick = { onExit() }
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close",
                )
            }
        }
    )
}

@Preview
@Composable
private fun PreviewQuizAppBar() {
    CodiLeapTheme {
        QuizAppBar(onBack = {}, onExit = {}, quizProgress = 0.5f)
    }
}