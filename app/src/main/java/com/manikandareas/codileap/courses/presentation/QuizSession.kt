package com.manikandareas.codileap.courses.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.R
import com.manikandareas.codileap.courses.presentation.component.QuizAppBar
import com.manikandareas.codileap.courses.presentation.component.QuizBottomAppBar
import com.manikandareas.codileap.screening.presentation.component.CodiButton
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun QuizSession(modifier: Modifier = Modifier) {
    var selectedButton by remember { mutableIntStateOf(0) }
    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        topBar = {
            QuizAppBar()
        },
        bottomBar = {
            QuizBottomAppBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "What is the main purpose of the lazy delegate in Kotlin?",
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(32.dp))


            CodiButton(
                text = "To create variables that are thread-safe by default",
                onClick = {
                    selectedButton = 1
                },
                icon = R.drawable.ic_coding,
                isSelected = selectedButton == 1
            )
            Spacer(modifier = Modifier.height(16.dp))
            CodiButton(
                text = "To initialize variables only when they are first accessed",
                onClick = {
                    selectedButton = 2
                },
                icon = R.drawable.ic_ice_cream,
                isSelected = selectedButton == 2
            )
            Spacer(modifier = Modifier.height(16.dp))
            CodiButton(
                text = "To optimize memory usage for large collections",
                onClick = {
                    selectedButton = 3
                },
                icon = R.drawable.ic_find_job,
                isSelected = selectedButton == 3
            )
            Spacer(modifier = Modifier.height(16.dp))
            CodiButton(
                text = "To allow immutable variables to be reassigned",
                onClick = {
                    selectedButton = 4
                },
                icon = R.drawable.ic_plant,
                isSelected = selectedButton == 4
            )
        }
    }
}

@Preview
@Composable
private fun PreviewQuizScreen() {
    CodiLeapTheme {
        QuizSession()
    }
}