@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.home.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
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
import com.manikandareas.codileap.home.presentation.model.UserUi

@Composable
fun HomeAppBar(data: UserUi, modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = modifier,
        title = {
            Column {
                Text(text = data.name, style = MaterialTheme.typography.titleMedium)
                Text(
                    text = "Let's learn something new today!",
                    style = MaterialTheme.typography.labelSmall
                )
            }
        },
        actions = {

            IconButton(onClick = {}, modifier=Modifier.padding(end = 8.dp)) {
                AsyncImage(
                    data.imageUrl,
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(MaterialTheme.shapes.extraLarge),
                )
            }
        }
    )
}

@PreviewLightDark
@Composable
fun PreviewHomeAppBar(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        HomeAppBar(modifier = modifier, data = userUi)
    }
}

val userUi = UserUi(
    name = "Vito Manik",
    imageUrl = "https://avatars.githubusercontent.com/u/86580600?v=4"
)