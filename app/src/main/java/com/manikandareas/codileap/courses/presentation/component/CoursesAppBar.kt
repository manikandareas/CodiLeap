@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.courses.presentation.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ImportExport
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun CoursesAppBar(
    title: String = "Learning Path",
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    TopAppBar(
        modifier = modifier,
        title = {
            Text(text = title, style = MaterialTheme.typography.titleLarge, maxLines = 1, overflow = TextOverflow.Ellipsis)
        },
        actions = {
            IconButton(
                onClick = { onClick() },
                modifier = Modifier
                    .padding(end = 12.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ImportExport,
                    contentDescription = "Select Modules",
                )
            }
        }
    )
}

@PreviewLightDark
@Composable
fun PreviewCoursesAppBar(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        CoursesAppBar(modifier = modifier)
    }
}