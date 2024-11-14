package com.manikandareas.codileap.home.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import com.manikandareas.codileap.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeBanner(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .height(188.dp)
            .fillMaxSize(),
        shape = MaterialTheme.shapes.medium
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.banner),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewHomeBanner(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        HomeBanner(modifier = modifier)
    }
}