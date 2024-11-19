@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.courses.presentation.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBackIos
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun LessonAppbar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        modifier = modifier,
        navigationIcon = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Default.ArrowBackIos,
                    contentDescription = "Back",

                    )
            }
        },
        title = {
            LinearProgressIndicator(
                progress = { 0.3f },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(12.dp)
            )
        },
        actions = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close",
                )
            }
        }
    )
}

@PreviewLightDark
@Composable
fun LessonAppbarPreview() {
    CodiLeapTheme {
        LessonAppbar()
    }
}