@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.screening.presentation.component

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

data class ScreeningAppBarUi(
    val title: String = "Introduction"
)

@Composable
fun ScreeningAppBar(appBarUi: ScreeningAppBarUi, modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = appBarUi.title,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary
            )
        }
    )
}


@PreviewLightDark
@Composable
fun PreviewScreeningAppBar() {
    CodiLeapTheme {
        ScreeningAppBar(ScreeningAppBarUi())
    }
}