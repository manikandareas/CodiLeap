package com.manikandareas.codileap.screening.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manikandareas.codileap.R
import com.manikandareas.codileap.ui.compositions.CodiButton

@Composable
fun ScreeningStartQuiz(modifier: Modifier = Modifier) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(R.drawable.presentation), contentDescription = null, modifier = Modifier.size(200.dp))
        Spacer(
            modifier = Modifier.size(50.dp)
        )
        Text(
            text = "Ready to find your perfect fit!",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .size(16.dp)
        )

        Text(
            text = "Let's find the perfect role for you. Answer a few questions to help us understand you better.",
            modifier = Modifier
                .fillMaxWidth(),
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodySmall,
            lineHeight = 24.sp,
            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f),
        )


    }
}

@Preview
@Composable
fun PreviewScreeningStartQuiz() {
    ScreeningStartQuiz()
}