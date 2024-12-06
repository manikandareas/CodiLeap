@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.auth.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manikandareas.codileap.auth.presentation.model.AuthUi
import com.manikandareas.codileap.ui.compositions.CodiButton
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun AuthScreen(modifier: Modifier = Modifier, onAction: (AuthAction) -> Unit) {
    Scaffold(modifier = modifier
        .background(MaterialTheme.colorScheme.background)
        .fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { },
                navigationIcon = {
                    IconButton(onClick = { onAction(AuthAction.OnBackClicked) }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBackIosNew,
                            contentDescription = "Back",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                },
                actions = { },
                modifier = Modifier.padding(8.dp),
            )
        },
        bottomBar = {
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .clip(MaterialTheme.shapes.medium)
                    .background(MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.3f))
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
            ) {
                CodiButton(
                    onClick = { onAction(AuthAction.OnRegisterClicked) },
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                ) {
                    Text(text = "Register")
                }
                CodiButton(
                    onClick = { onAction(AuthAction.OnSignInClicked) },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = MaterialTheme.colorScheme.onSurface
                    )
                ) {
                    Text(text = "Sign In", color = MaterialTheme.colorScheme.onSurface)
                }
            }
        }
    )
    { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(id = AuthUi.AuthData.image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(40.dp, 0.dp),
                alignment = Alignment.Center
            )

            Spacer(
                modifier = Modifier.size(50.dp)
            )

            Text(
                text = AuthUi.AuthData.title,
                                modifier = Modifier.fillMaxWidth(),
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onBackground
            )

            Spacer(
                modifier = Modifier.size(16.dp)
            )


            Text(
                text = AuthUi.AuthData.description,
                modifier = Modifier.fillMaxWidth(),
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodySmall,
                lineHeight = 24.sp,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f),
            )
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewAuthScreen(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        AuthScreen(modifier = modifier, onAction = {})
    }
}