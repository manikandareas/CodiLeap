package com.manikandareas.codileap.ui.compositions

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

data class CodiDialogProps(
    val onDismissRequest: () -> Unit,
    val properties: DialogProperties = DialogProperties(),
    val style: AlertDialogStyle? = null,
    val title: String = "",
    val description: String = "",
    val onConfirmRequest: () -> Unit,
    val dismissTitle: String = "Cancel",
    val confirmTitle: String = "Continue",
    val onDismiss: (() -> Unit)? = null
)


@Composable
fun CodiDialog(
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
    style: AlertDialogStyle = rememberAlertDialogStyle(),
    title: String = "",
    description: String = "",
    onConfirmRequest: () -> Unit,
    dismissTitle: String = "Cancel",
    confirmTitle: String = "Continue",
    onDismiss: (() -> Unit)? = null,
    isHideDismissButton: Boolean = false,
    enabled: Boolean = true
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = properties,
        content = {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(intrinsicSize = IntrinsicSize.Min)
                    .padding(8.dp),

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
                        onClick = {
                            if (onDismiss != null) {
                                onDismiss()
                            } else {
                                onDismissRequest()
                            }
                        },
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
                        Column(modifier = Modifier.fillMaxWidth()) {
                            CodiButton(
                                onClick = onConfirmRequest,
                                colors = ButtonDefaults.buttonColors(
                                    contentColor = style.titleContentColor,
                                    containerColor = style.containerColor,
                                    disabledContentColor = style.textContentColor.copy(alpha = .6f),
                                    disabledContainerColor = style.containerColor.copy(alpha = .6f)
                                ),
                                modifier = Modifier.fillMaxWidth(),
                                enabled = enabled
                            ) {
                                Text(text = confirmTitle, color = style.titleContentColor)
                            }
                            Spacer(modifier = Modifier.height(8.dp))

                            if (!isHideDismissButton) {
                                CodiButton(
                                    onClick = onDismissRequest,
                                    modifier = Modifier.fillMaxWidth(),
                                    colors = ButtonColors(
                                        contentColor = MaterialTheme.colorScheme.onBackground,
                                        containerColor = MaterialTheme.colorScheme.surfaceDim,
                                        disabledContentColor = style.iconContentColor.copy(alpha = .6f),
                                        disabledContainerColor = style.containerColor.copy(alpha = .6f)
                                    ),
                                    enabled = enabled
                                ) {
                                    Text(
                                        text = dismissTitle,
                                        color = MaterialTheme.colorScheme.onSurface
                                    )
                                }
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