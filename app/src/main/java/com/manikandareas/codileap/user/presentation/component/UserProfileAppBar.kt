@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.user.presentation.component

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
fun ProfileAppBar(modifier: Modifier = Modifier,onBackClicked: () -> Unit = {}) {
    TopAppBar(
        title = {
            Text(text = "Profile", style = MaterialTheme.typography.titleLarge)
        },
        navigationIcon = {
            IconButton(
                onClick = {onBackClicked() },
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
fun PreviewProfileAppBar(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        ProfileAppBar(modifier = modifier)
    }
}

