@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.settings.presentation.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.auth.presentation.AuthAction
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun FAQsAppBar(modifier: Modifier = Modifier,onBack: () -> Unit = {}) {
    TopAppBar(
        title = {
            Text(text = "FAQs", style = MaterialTheme.typography.titleLarge)
        },
        navigationIcon = {
            IconButton(
                onClick = { onBack() },
                modifier = Modifier.padding(start = 12.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBackIosNew,
                    contentDescription = "Back",
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    )
}

@PreviewLightDark
@Composable
fun PreviewFAQsAppBar(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        FAQsAppBar(modifier = modifier)
    }
}

