@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.auth.presentation.auth_signIn

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manikandareas.codileap.auth.presentation.model.AuthUi
import com.manikandareas.codileap.core.presentation.util.ObserveAsEvents
import com.manikandareas.codileap.core.presentation.util.toString
import com.manikandareas.codileap.ui.compositions.CodiButton
import com.manikandareas.codileap.ui.compositions.CodiOutlinedPasswordField
import com.manikandareas.codileap.ui.compositions.CodiOutlinedTextField
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

@Composable
fun AuthSignInScreen(
    state: AuthSignInState,
    events: Flow<AuthSignInEvent>,
    modifier: Modifier = Modifier,
    onAction: (AuthSignInAction) -> Unit
) {
    val context = LocalContext.current

    ObserveAsEvents(events = events) { event ->
        when (event) {
            is AuthSignInEvent.Error -> {
                Toast.makeText(
                    context,
                    event.error.toString(context),
                    Toast.LENGTH_SHORT
                ).show()
            }

            AuthSignInEvent.Success -> {
                Toast.makeText(
                    context,
                    "Welcome to Codileap",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    Scaffold(modifier = modifier
        .background(MaterialTheme.colorScheme.background)
        .fillMaxSize(), topBar = {
        TopAppBar(
            title = { },
            navigationIcon = {
                IconButton(enabled = !state.isLoading, onClick = { onAction(AuthSignInAction.OnBackClicked) }) {
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
                        text = "Don't have an account?",
                        style = MaterialTheme.typography.bodyMedium
                    )
                    TextButton(enabled = !state.isLoading, onClick = { onAction(AuthSignInAction.OnRegisterClicked) }) {
                        Text("Register")
                    }
                }

                CodiButton(
                    enabled = !state.isLoading,
                    onClick = { onAction(AuthSignInAction.OnSignInClicked) },
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {
                    Text(text = "Sign in")
                }
            }
        }) { innerPadding ->
        Box(
            modifier = modifier.padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp),
            ) {
                Text(
                    text = AuthUi.SignInData.title,
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
                    text = AuthUi.SignInData.description,
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

                Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    CodiOutlinedTextField(
                        value = state.email,
                        onValueChange = { onAction(AuthSignInAction.OnEmailChanged(it)) },
                        isError = state.emailError != null,
                        errorText = state.emailError ?: "",
                        placeholder = "Email",
                        modifier = modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Email
                        ),
                    )

                    CodiOutlinedPasswordField(
                        password = state.password,
                        onPasswordChange = { onAction(AuthSignInAction.OnPasswordChanged(it)) },
                        isError = state.passwordError != null,
                        errorText = state.passwordError ?: "",
                        placeholder = "Password",
                        modifier = modifier.fillMaxWidth(),
                    )
                }

            }

            if (state.isLoading) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(48.dp),
                        color = MaterialTheme.colorScheme.primary
                    )
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewAuthSignInScreen(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        AuthSignInScreen(
            modifier = modifier,
            onAction = {},
            events = emptyFlow(),
            state = AuthSignInState()
        )
    }
}