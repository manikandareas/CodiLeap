package com.manikandareas.codileap.settings.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.settings.presentation.component.AppearanceAppBar
import com.manikandareas.codileap.ui.theme.CodiLeapTheme


@Composable
fun AppearanceScreen(
    modifier: Modifier = Modifier,
    state: AppearanceState,
    onAction: (AppearanceAction) -> Unit = {},
) {

    Scaffold(
        topBar = {
            AppearanceAppBar(onBack = { onAction(AppearanceAction.NavigateBack) })
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text("Dark Mode", style = MaterialTheme.typography.titleMedium)
                Switch(
                    checked = state.isDarkMode,
                    onCheckedChange = { onAction(AppearanceAction.OnToggleThemeClick) }
                )
            }
        }
    }
}

@Preview
@Composable
private fun PreviewAppearanceScreen() {
    CodiLeapTheme {
        AppearanceScreen(
            state = AppearanceState()
        )
    }
}