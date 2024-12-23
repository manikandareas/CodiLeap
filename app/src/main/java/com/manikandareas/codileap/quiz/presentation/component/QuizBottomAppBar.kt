package com.manikandareas.codileap.quiz.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.NavigateNext
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.ui.compositions.CodiButton
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun QuizBottomAppBar(onClick: ()-> Unit,title: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        Button(
            onClick = {},
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .weight(.2f),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainer,
                contentColor = MaterialTheme.colorScheme.onSurface
            ),
            contentPadding = PaddingValues(vertical = 16.dp, horizontal = 4.dp),
            shape = MaterialTheme.shapes.medium
        ) {
            Text(
                title,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.width(2.dp))
            Icon(
                imageVector = Icons.Default.Timer,
                contentDescription = "Next",
                modifier = Modifier.size(16.dp),
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
        CodiButton(
            onClick = {onClick()},
            modifier = Modifier.weight(.8f),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Next")
                Icon(
                    imageVector = Icons.AutoMirrored.Default.NavigateNext,
                    contentDescription = "Next"
                )
            }
        }
    }
}

@Preview
@Composable
private fun PreviewQuizBottomAppBar() {
    CodiLeapTheme {
        QuizBottomAppBar(onClick = {}, title = "10:00")
    }
}