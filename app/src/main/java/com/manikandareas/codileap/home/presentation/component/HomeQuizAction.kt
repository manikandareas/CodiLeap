package com.manikandareas.codileap.home.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp

@Composable
fun HomeQuizAction(
    modifier: Modifier = Modifier,
    quizTitle: String = "Daily Quiz Challenge",
    quizSubtitle: String = "Test your knowledge!",
    onQuizStart: () -> Unit = {}
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.medium)
            .background(MaterialTheme.colorScheme.surfaceContainer)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = quizTitle,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface
            )
            Text(
                text = quizSubtitle,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        Button(
            onClick = {},
            modifier = Modifier.weight(.2f),
            contentPadding = PaddingValues(0.dp),
        ) {
            Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "Start")
        }
    }
}

// Preview
@PreviewLightDark()
@Composable
fun HomeQuizActionPreview() {
    MaterialTheme {
        HomeQuizAction(
            modifier = Modifier.padding(16.dp),
            quizTitle = "Python Basics Quiz",
            quizSubtitle = "Test your knowledge on variables and data types"
        )
    }
}