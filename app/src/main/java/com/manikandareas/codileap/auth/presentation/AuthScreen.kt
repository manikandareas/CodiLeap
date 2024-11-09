@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.auth.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manikandareas.codileap.auth.presentation.auth_signIn.AuthSignInAction
import com.manikandareas.codileap.auth.presentation.model.AuthUi
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
                    IconButton(onClick = {onAction(AuthAction.OnBackClicked)}) {
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
                    .background(MaterialTheme.colorScheme.primaryContainer)
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
            ) {
                Button(
                    onClick = {onAction(AuthAction.OnRegisterClicked)},
                    modifier = Modifier
                        .weight(1f).fillMaxHeight(),

                    shape = MaterialTheme.shapes.medium,
                    contentPadding = PaddingValues(0.dp),
                ) {
                    Text(text = "Register")
                }
                TextButton(
                    onClick = {onAction(AuthAction.OnSignInClicked)},
                    modifier = Modifier.weight(1f),
                    contentPadding = PaddingValues(0.dp),
                ) {
                    Text(text = "Sign In")
                }
            }
        }
    )
    { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
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

                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center
            )

            Spacer(
                modifier = Modifier.size(15.dp)
            )

            Text(
                text = AuthUi.AuthData.description,
                modifier = Modifier.fillMaxWidth(),
                fontSize = 14.sp,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.secondary,
                textAlign = TextAlign.Center
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