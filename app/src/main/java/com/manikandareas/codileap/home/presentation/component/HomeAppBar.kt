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
import com.manikandareas.codileap.home.presentation.model.UserUi
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun HomeAppBar(onProfileClick: () -> Unit, data: UserUi, modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = modifier,
        title = {
            Column {
                Text(text = data.name?: "Unknown", style = MaterialTheme.typography.titleMedium)
                Text(
                    text = "Let's learn something new today!",
                    style = MaterialTheme.typography.labelSmall
                )
            }
        },
        actions = {

            IconButton(onClick = {onProfileClick()}, modifier = Modifier.padding(end = 8.dp)) {
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
        HomeAppBar(modifier = modifier, data = userUi, onProfileClick = {})
    }
}

val userUi = UserUi(
    name = "Vito Manik",
    imageUrl = "https://avatars.githubusercontent.com/u/86580600?v=4",
    isAlreadyScreened = false,
    email = "",
    id = 0
)