package com.manikandareas.codileap.home.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun HomeModuleProgress(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.medium)
            .background(MaterialTheme.colorScheme.surfaceContainer)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Text(text = "24 Steps completed!", style = MaterialTheme.typography.titleMedium)
            Text(
                text = "Variables - Module 2, lesson 9!",
                style = MaterialTheme.typography.labelMedium
            )
            LinearProgressIndicator(progress = { 0.5f }, modifier = Modifier.height(8.dp))
        }
        Spacer(modifier = Modifier.width(4.dp))

        Button(
            onClick = {},
            modifier = Modifier.weight(.2f),
            contentPadding = PaddingValues(0.dp),
        ) {
//            Row(
//                modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.Center
//            ) {
                Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "Play")
//                Text(text = "Continue", style = MaterialTheme.typography.titleSmall, fontSize = 12.sp)
//            }
        }

    }
}

@PreviewLightDark()
@Composable
fun PreviewHomeModuleProgress(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        HomeModuleProgress(modifier = modifier)
    }
}