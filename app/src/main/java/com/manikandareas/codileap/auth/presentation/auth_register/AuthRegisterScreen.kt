@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.auth.presentation.auth_register

import android.R
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manikandareas.codileap.auth.presentation.model.AuthUi
import com.manikandareas.codileap.ui.compositions.CodiButton
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun AuthRegisterScreen(modifier: Modifier = Modifier, onAction: (AuthRegisterAction) -> Unit) {
    Scaffold(modifier = modifier
        .background(MaterialTheme.colorScheme.background)
        .fillMaxSize(), topBar = {
        TopAppBar(
            title = { },
            navigationIcon = {
                IconButton(onClick = { onAction(AuthRegisterAction.OnBackClicked) }) {
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
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .height(IntrinsicSize.Min)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Already have an account? ",
                        style = MaterialTheme.typography.bodyMedium
                    )
                    TextButton(onClick = { onAction(AuthRegisterAction.OnSignInClicked) }) {
                        Text("Sign in")
                    }
                }

                CodiButton(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Register")
                }
            }
        }) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 16.dp),
        ) {
            Text(
                text = AuthUi.RegisterData.title,
                modifier = Modifier.fillMaxWidth(),
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Start
            )

            Spacer(
                modifier = Modifier.size(15.dp)
            )

            Text(
                text = AuthUi.RegisterData.description,
                modifier = Modifier.fillMaxWidth(),
                fontSize = 24.sp,
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.W300,
                letterSpacing = 0.8.sp,
                lineHeight = 30.sp,
                color = MaterialTheme.colorScheme.onSurface,
                textAlign = TextAlign.Start
            )

            Spacer(
                modifier = Modifier.size(50.dp)
            )

            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Email") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Password") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Confirm Password") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                )
            }

        }
    }
}

@PreviewLightDark
@Composable
fun PreviewAuthRegisterScreen(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        AuthRegisterScreen(modifier = modifier, onAction = {})
    }
}