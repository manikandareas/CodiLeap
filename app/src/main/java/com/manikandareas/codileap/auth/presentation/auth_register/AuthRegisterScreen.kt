@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.auth.presentation.auth_register

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
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
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
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
import com.manikandareas.codileap.ui.compositions.CodiDialog
import com.manikandareas.codileap.ui.compositions.CodiOutlinedPasswordField
import com.manikandareas.codileap.ui.compositions.CodiOutlinedTextField
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import com.manikandareas.codileap.ui.theme.SuccessAlertDialogStyle
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

@Composable
fun AuthRegisterScreen(
    state: AuthRegisterState,
    events: Flow<AuthRegisterEvent>,
    onAction: (AuthRegisterAction) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val isDialogOpen = remember { mutableStateOf(false) }
    ObserveAsEvents(events = events) { event ->
        when (event) {
            is AuthRegisterEvent.Error -> {
                Toast.makeText(
                    context,
                    event.error.toString(context),
                    Toast.LENGTH_SHORT
                ).show()
            }

            AuthRegisterEvent.RegisterSuccess -> {
                isDialogOpen.value = true
            }
        }
    }

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
                    onClick = { onAction(AuthRegisterAction.OnSubmitClicked) },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Register")
                }
            }
        }) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),

        ) {
            if (isDialogOpen.value) {
                CodiDialog(
                    title = "Yeay! Welcome to Codileap",
                    description = "You have successfully registered to Codileap. Please login to continue",
                    style = SuccessAlertDialogStyle(),
                    confirmTitle = "Log in Now",
                    dismissTitle = "Later",
                    onDismiss = { isDialogOpen.value = false },
                    onConfirmRequest = {
                        isDialogOpen.value = false
                        onAction(AuthRegisterAction.OnSignInClicked)
                    },
                    onDismissRequest = { isDialogOpen.value = false }
                )
            }

            Column(
                modifier = Modifier
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

                Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {

                    CodiOutlinedTextField(
                        value = state.email,
                        onValueChange = { onAction(AuthRegisterAction.OnEmailChanged(it)) },
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
                        onPasswordChange = { onAction(AuthRegisterAction.OnPasswordChanged(it)) },
                        isError = state.passwordError != null,
                        errorText = state.passwordError ?: "",
                        placeholder = "Password",
                        modifier = modifier.fillMaxWidth(),
                    )

                    CodiOutlinedPasswordField(
                        password = state.repeatedPassword,
                        onPasswordChange = { onAction(AuthRegisterAction.OnRepeatedPasswordChanged(it)) },
                        isError = state.repeatedPasswordError != null,
                        errorText = state.repeatedPasswordError ?: "",
                        placeholder = "Confirm Password",
                        modifier = modifier.fillMaxWidth(),
                    )
                }

            }

            if (state.isLoading) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.6f)),
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
fun PreviewAuthRegisterScreen(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        AuthRegisterScreen(
            modifier = modifier,
            onAction = {},
            state = AuthRegisterState(),
            events = emptyFlow()
        )
    }
}