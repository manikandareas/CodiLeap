@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.courses.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun CoursesAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = modifier,
        title = {
            Text(text ="Pemrograman Web", style = MaterialTheme.typography.titleLarge)

        },
        actions = {
            IconButton(onClick = {}, modifier=Modifier) {
                Icon(
                    imageVector = Icons.Default.Apps,
                    contentDescription = "Select Modules"
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