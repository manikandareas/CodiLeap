package com.manikandareas.codileap.user.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.user.presentation.component.ProfileAppBar
import com.manikandareas.codileap.user.presentation.component.UserProfileImage
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.manikandareas.codileap.home.presentation.model.UserUi
import com.manikandareas.codileap.ui.compositions.CodiButton

@Composable
fun UserProfileScreen(
    onBack: () -> Unit = {},
    modifier: Modifier = Modifier,
    state: UserProfileState
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            ProfileAppBar(onBackClicked = onBack)
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.Companion.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            UserProfileImage(
                modifier = Modifier.Companion.align(Alignment.Companion.CenterHorizontally),
                imageUrl = state.user?.avatarUrl
            )


            var gender by remember { mutableStateOf("Male") }

            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.Companion.fillMaxWidth()
            ) {

                OutlinedTextField(
                    value = state.user?.fullName ?: "",
                    onValueChange = {},
                    label = { Text("Your Name") },
                    modifier = Modifier.Companion.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium,
                )
                OutlinedTextField(
                    value = "13 July 2024",
                    onValueChange = {},
                    label = { Text("Date of Birth") },
                    modifier = Modifier.Companion.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                )
                OutlinedTextField(
                    value = state.user?.email ?: "",
                    onValueChange = {},
                    label = { Text("Email") },
                    modifier = Modifier.Companion.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                )
                OutlinedTextField(
                    value = state.user?.studyHours ?: "09:00",
                    onValueChange = {},
                    label = { Text("Study Hour") },
                    modifier = Modifier.Companion.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                )


                Column {
                    Text(
                        text = "Gender",
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.Companion.padding(bottom = 4.dp)
                    )
                    Row(
                        modifier = Modifier.Companion.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalAlignment = Alignment.Companion.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.Companion.CenterVertically) {
                            RadioButton(
                                selected = gender == "Male",
                                onClick = { gender = "Male" }
                            )
                            Text(
                                text = "Male",
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier.Companion.padding(start = 8.dp)
                            )
                        }
                        Row(verticalAlignment = Alignment.Companion.CenterVertically) {
                            RadioButton(
                                selected = gender == "Female",
                                onClick = { gender = "Female" }
                            )
                            Text(
                                text = "Female",
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier.Companion.padding(start = 8.dp)
                            )
                        }
                    }
                }
            }

            CodiButton(
                onClick = { },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Update Profile")
            }
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewProfileScreen() {
    CodiLeapTheme {
        UserProfileScreen(state = UserProfileState())
    }
}