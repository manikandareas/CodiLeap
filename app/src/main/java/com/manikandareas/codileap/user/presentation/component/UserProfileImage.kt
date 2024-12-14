@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.user.presentation.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.tooling.preview.PreviewLightDark
import coil.compose.AsyncImage
import com.manikandareas.codileap.R
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun UserProfileImage(modifier: Modifier = Modifier, imageUrl: String? = null) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .padding(16.dp)
            .size(120.dp)
    ) {

        AsyncImage(
            model = imageUrl,
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(16.dp))
                .background(Color.LightGray)
        )


        Box(
            modifier = Modifier
                .size(36.dp)
                .align(Alignment.BottomEnd)
                .offset(8.dp, 8.dp)
                .clip(CircleShape)
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.CameraAlt,
                contentDescription = "Change Profile Picture",
                tint = Color.Blue,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}


@PreviewLightDark
@Composable
fun PreviewProfileImage(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        UserProfileImage(modifier = modifier)
    }
}
