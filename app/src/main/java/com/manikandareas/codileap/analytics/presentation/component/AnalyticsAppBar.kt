@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.analytics.presentation.component

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.manikandareas.codileap.ui.theme.CodiLeapTheme


@Composable
fun AnalyticsAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = modifier,
        title = {
            Text(text = "Analytics", style = MaterialTheme.typography.titleLarge)
        },
    )
}

@PreviewLightDark
@Composable
fun PreviewAnalyticsAppBar(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        AnalyticsAppBar(modifier = modifier)
    }
}