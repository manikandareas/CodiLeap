package com.manikandareas.codileap.ui.compositions

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.manikandareas.codileap.ui.theme.AlertDialogStyle
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import com.manikandareas.codileap.ui.theme.ErrorAlertDialogStyle
import com.manikandareas.codileap.ui.theme.SuccessAlertDialogStyle
import com.manikandareas.codileap.ui.theme.WarningAlertDialogStyle
import com.manikandareas.codileap.ui.theme.rememberAlertDialogStyle


@Composable
fun CodiDialog(
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
    style: AlertDialogStyle = rememberAlertDialogStyle(),
    title: String = "",
    description: String = "",
    onConfirmRequest: () -> Unit,
    dismissTitle: String = "Cancel",
    confirmTitle: String = "Continue"
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = properties,
        content = {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .padding(16.dp),

                shape = MaterialTheme.shapes.medium,
                colors = CardDefaults.cardColors(
                    containerColor = AlertDialogDefaults.containerColor,
                )
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp),
                    contentAlignment = Alignment.Center

                ) {
                    IconButton(
                        onClick = onDismissRequest,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .border(
                                width = 1.dp,
                                color = style.iconContentColor.copy(
                                    alpha = .2f
                                ),
                                shape = MaterialTheme.shapes.small
                            )
                            .size(32.dp),


                        ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close",
                            tint = style.iconContentColor
                        )
                    }
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(MaterialTheme.shapes.extraLarge)
                                .background(
                                    style.iconContentColor.copy(
                                        alpha = .1f
                                    )
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = style.icon,
                                contentDescription = title,
                                tint = style.iconContentColor
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = title,
                            style = MaterialTheme.typography.titleMedium,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = description,
                            style = MaterialTheme.typography.bodyMedium,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Row {
                            TextButton(
                                onClick = onDismissRequest,
                                modifier = Modifier.weight(1f),
                                colors = ButtonColors(
                                    contentColor = MaterialTheme.colorScheme.onSurface,
                                    containerColor = Color.Transparent,
                                    disabledContentColor = style.iconContentColor.copy(alpha = .6f),
                                    disabledContainerColor = style.containerColor.copy(alpha = .6f)
                                )
                            ) {
                                Text(text = dismissTitle, color = MaterialTheme.colorScheme.outline)
                            }
                            CodiButton(
                                onClick = onConfirmRequest,
                                colors = ButtonDefaults.buttonColors(
                                    contentColor = style.titleContentColor,
                                    containerColor = style.containerColor,
                                    disabledContentColor = style.textContentColor.copy(alpha = .6f),
                                    disabledContainerColor = style.containerColor.copy(alpha = .6f)
                                ),
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(text = confirmTitle)
                            }
                        }
                    }
                }
            }
        }
    )
}

@PreviewLightDark
@Composable
private fun PreviewCodiAlertDialog() {
    CodiLeapTheme {
        CodiDialog(
            onDismissRequest = {},
            title = "Title for default",
            description = "Description alert dialog default",
            onConfirmRequest = {}
        )
    }
}

@PreviewLightDark
@Composable
private fun PreviewErrorCodiAlertDialog() {
    CodiLeapTheme {
        CodiDialog(
            onDismissRequest = {},
            title = "Title for error",
            description = "Description alert dialog error",
            style = ErrorAlertDialogStyle(),
            onConfirmRequest = {}
        )
    }
}

@PreviewLightDark
@Composable
private fun PreviewSuccessCodiAlertDialog() {
    CodiLeapTheme {
        CodiDialog(
            onDismissRequest = {},
            title = "Title for success",
            description = "Description alert dialog success",
            style = SuccessAlertDialogStyle(),
            onConfirmRequest = {}
        )
    }
}

@PreviewLightDark
@Composable
private fun PreviewWarningCodiAlertDialog() {
    CodiLeapTheme {
        CodiDialog(
            onDismissRequest = {},
            title = "Title for warning",
            description = "Description alert dialog warning",
            style = WarningAlertDialogStyle(),
            onConfirmRequest = {}
        )
    }
}