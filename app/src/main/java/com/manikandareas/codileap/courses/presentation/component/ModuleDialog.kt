package com.manikandareas.codileap.courses.presentation.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.manikandareas.codileap.ui.theme.CodiLeapTheme


enum class DialogType {
    SUCCESS,
    ERROR,
}

@Composable
fun ModuleDialog(
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit,
    dialogTitle: String = "",
    dialogText: String = "",
    icon: ImageVector = Icons.Default.CheckCircle,
    dialogType: DialogType = DialogType.SUCCESS,
    dismissTitle: String = "Later",
    confirmTitle: String = "Continue"
) {
    val containerColor = when (dialogType) {
        DialogType.SUCCESS -> MaterialTheme.colorScheme.primaryContainer
        DialogType.ERROR -> MaterialTheme.colorScheme.errorContainer
    }

    AlertDialog(
        icon = {
            Icon(icon, contentDescription = "Example Icon")
        },
        title = {
            Text(text = dialogTitle, textAlign = TextAlign.Center)
        },
        text = {
            Text(text = dialogText)
        },
        onDismissRequest = {
            onDismissRequest()
        },
        confirmButton = {
            TextButton(
                onClick = {
                    onConfirmation()
                }
            ) {
                Text(confirmTitle, color = if (dialogType == DialogType.SUCCESS) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error)
            }
        },
        dismissButton = {
            TextButton(
                onClick = {
                    onDismissRequest()
                }
            ) {
                Text(dismissTitle ,color = if (dialogType == DialogType.SUCCESS) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error)
            }
        },
        containerColor = containerColor,
        textContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
        iconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
        titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
    )
}

@Preview
@Composable
private fun PreviewModuleDialog() {
    CodiLeapTheme {
        ModuleDialog(
            onConfirmation = {},
            onDismissRequest = {},
            dialogTitle = "Yeay, you have completed the lesson!",
            dialogText = "You have completed the lesson, you can now move to the next lesson",
        )
    }

}