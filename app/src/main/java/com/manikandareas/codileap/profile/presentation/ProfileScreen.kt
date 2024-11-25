package com.manikandareas.codileap.profile.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.profile.presentation.component.ProfileAppBar
import com.manikandareas.codileap.profile.presentation.component.ProfileImage
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            ProfileAppBar { }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            ProfileImage(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )


            var name by remember { mutableStateOf("") }
            var dateOfBirth by remember { mutableStateOf("") }
            var job by remember { mutableStateOf("") }
            var specialty by remember { mutableStateOf("") }
            var gender by remember { mutableStateOf("Male") }

            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {

//                InputFieldWithLabel(
//                    label = "Your Name",
//                    value = name,
//                    onValueChange = { name = it }
//                )
//
//
//                InputFieldWithLabel(
//                    label = "Date of Birth",
//                    value = dateOfBirth,
//                    onValueChange = { dateOfBirth = it },
//                    keyboardType = KeyboardType.Text
//                )
//
//
//                InputFieldWithLabel(
//                    label = "Your Job",
//                    value = job,
//                    onValueChange = { job = it }
//                )
//
//
//                InputFieldWithLabel(
//                    label = "Specialty",
//                    value = specialty,
//                    onValueChange = { specialty = it },
//                    keyboardType = KeyboardType.Text
//                )

                OutlinedTextField(
                    value = "Vito Andareas Manik",
                    onValueChange = {},
                    label = { Text("Your Name") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                )
                OutlinedTextField(
                    value = "13 July 2024",
                    onValueChange = {},
                    label = { Text("Date of Birth") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                )
                OutlinedTextField(
                    value = "Fullstack Developer",
                    onValueChange = {},
                    label = { Text("Your Job") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                )
                OutlinedTextField(
                    value = "Backend",
                    onValueChange = {},
                    label = { Text("Specialty") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                )


                Column {
                    Text(
                        text = "Gender",
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = gender == "Male",
                                onClick = { gender = "Male" }
                            )
                            Text(
                                text = "Male",
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = gender == "Female",
                                onClick = { gender = "Female" }
                            )
                            Text(
                                text = "Female",
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }
            }


            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Text(text = "Update Profile")
            }
        }
    }
}

@Composable
fun InputFieldWithLabel(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    keyboardType: KeyboardType = KeyboardType.Text
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        TextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
        )
    }
}

@PreviewLightDark
@Composable
fun PreviewProfileScreen() {
    CodiLeapTheme {
        ProfileScreen()
    }
}
