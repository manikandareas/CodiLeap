@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.ui.theme


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircleOutline
import androidx.compose.material.icons.filled.ErrorOutline
import androidx.compose.material.icons.filled.WarningAmber
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.DialogProperties

 enum class AlertDialogType {
    ERROR,
    SUCCESS,
    WARNING
}


data class AlertDialogStyle(
    val containerColor: Color,
    val iconContentColor: Color,
    val titleContentColor: Color,
    val textContentColor: Color,
    val shape: Shape,
    val tonalElevation: Dp,
    val icon: ImageVector
)

@Composable
fun rememberAlertDialogStyle(
    containerColor: Color = MaterialTheme.colorScheme.primaryContainer,
    iconContentColor: Color = MaterialTheme.colorScheme.primary,
    titleContentColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    textContentColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    shape: Shape = AlertDialogDefaults.shape,
    tonalElevation: Dp = AlertDialogDefaults.TonalElevation,
    icon: ImageVector = Icons.Default.CheckCircleOutline
): AlertDialogStyle = remember {
    AlertDialogStyle(
        containerColor = containerColor,
        iconContentColor = iconContentColor,
        titleContentColor = titleContentColor,
        textContentColor = textContentColor,
        shape = shape,
        tonalElevation = tonalElevation,
        icon = icon,
    )
}

@Composable
fun ErrorAlertDialogStyle(): AlertDialogStyle = rememberAlertDialogStyle(
    containerColor = MaterialTheme.colorScheme.errorContainer,
    iconContentColor = MaterialTheme.colorScheme.error,
    titleContentColor = MaterialTheme.colorScheme.onErrorContainer,
    textContentColor = MaterialTheme.colorScheme.onErrorContainer,
    icon = Icons.Default.ErrorOutline
)

@Composable
fun SuccessAlertDialogStyle(): AlertDialogStyle = rememberAlertDialogStyle(
    containerColor = MaterialTheme.extendedColorScheme.success.colorContainer,
    iconContentColor = MaterialTheme.extendedColorScheme.success.color,
    titleContentColor = MaterialTheme.extendedColorScheme.success.onColorContainer,
    textContentColor = MaterialTheme.extendedColorScheme.success.onColorContainer,
    icon = Icons.Default.CheckCircleOutline
)

@Composable
fun  WarningAlertDialogStyle(): AlertDialogStyle = rememberAlertDialogStyle(
    containerColor = MaterialTheme.extendedColorScheme.warning.colorContainer,
    iconContentColor = MaterialTheme.extendedColorScheme.warning.color,
    titleContentColor = MaterialTheme.extendedColorScheme.warning.onColorContainer,
    textContentColor = MaterialTheme.extendedColorScheme.warning.onColorContainer,
    icon = Icons.Default.WarningAmber
)