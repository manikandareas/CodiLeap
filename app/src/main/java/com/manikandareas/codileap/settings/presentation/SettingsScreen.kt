package com.manikandareas.codileap.settings.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.HeadsetMic
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import com.manikandareas.codileap.R
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.home.presentation.component.HomeBottomAppBar
import com.manikandareas.codileap.settings.presentation.component.SettingItem
import com.manikandareas.codileap.settings.presentation.component.SettingsAppBar
import com.manikandareas.codileap.settings.presentation.defaults.SettingMenus
import com.manikandareas.codileap.ui.compositions.CodiDialog
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import com.manikandareas.codileap.ui.theme.ErrorAlertDialogStyle

@Composable
fun SettingsScreen(onAction: (SettingsAction) -> Unit, modifier: Modifier = Modifier) {
    val isDialogOpen = remember { mutableStateOf(false) }
    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        topBar = {
            SettingsAppBar(
                modifier = Modifier.fillMaxWidth()
            )
        },
        bottomBar = {
            HomeBottomAppBar(
                currentRoute = Destination.SettingsScreen,
                onNavigate = {
                    onAction(SettingsAction.NavigateTo(it))
                },
                modifier = Modifier
                    .fillMaxWidth()
            )
        },

        ) { innerPadding ->

        if (isDialogOpen.value) {
            CodiDialog(
                title = "Are you sure want to log out?",
                description = "Your account will be logged out from this device",
                style = ErrorAlertDialogStyle(),
                confirmTitle = "Log out",
                dismissTitle = "Cancel",
                onDismiss = { isDialogOpen.value = false },
                onConfirmRequest = {
                    isDialogOpen.value = false
                    onAction(SettingsAction.OnSignOutClick)
                },
                onDismissRequest = { isDialogOpen.value = false }
            )
        }

        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(22.dp)
        ) {
            item(key = "settings") {
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = {}, modifier = Modifier.padding(end = 8.dp)) {
                        SubcomposeAsyncImage(
                            model = "null",
                            contentDescription = null,
                            modifier = Modifier
                                .size(52.dp)
                                .clip(MaterialTheme.shapes.extraLarge),
                            error = {
                                Image(
                                    painter = painterResource(id = R.drawable.me),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(52.dp)
                                        .clip(MaterialTheme.shapes.extraLarge),
                                )
                            }
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Vito Andareas Manik",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(
                            text = "vitoandareas@mail.com",
                            style = MaterialTheme.typography.labelMedium,
                        )
                    }
                    IconButton(modifier = Modifier, onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "Edit Profile"
                        )
                    }
                }

            }
            item(key = "divider") {
                HorizontalDivider()
            }
            items(SettingMenus, key = { it.title }) { settingItem ->
                SettingItem(
                    settingUi = settingItem,
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        if (settingItem.des == Destination.AuthGraph) {
                            isDialogOpen.value = true
                        } else {
                            onAction(SettingsAction.NavigateTo(settingItem.des))
                        }
                    }

                )
            }
            item(key = "Customer Support") {
                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth(),
                    contentPadding = PaddingValues(vertical = 20.dp),
                    shape = MaterialTheme.shapes.medium,
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.HeadsetMic,
                            contentDescription = "Customer Service"
                        )
                        Text(text = "Feel Free to Ask, We're Here to Help")
                    }
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewSettingsScreen(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        SettingsScreen(onAction = {}, modifier = modifier)
    }
}