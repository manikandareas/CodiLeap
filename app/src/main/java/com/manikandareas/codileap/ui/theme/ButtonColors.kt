package com.manikandareas.codileap.ui.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

val LocalButtonPadding = staticCompositionLocalOf { PaddingValues(16.dp) }


@Composable
fun rememberButtonColors(
    contentColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    containerColor: Color = MaterialTheme.colorScheme.primaryContainer,
    disabledContentColor: Color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.6f),
    disabledContainerColor: Color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.6f)
): ButtonColors = remember {
    ButtonColors(
        contentColor = contentColor,
        containerColor = containerColor,
        disabledContentColor = disabledContentColor,
        disabledContainerColor = disabledContainerColor
    )
}

@Composable
fun ButtonPrimaryColor(
    contentColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    containerColor: Color = MaterialTheme.colorScheme.primaryContainer,
    disabledContentColor: Color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.6f),
    disabledContainerColor: Color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.6f)
) = rememberButtonColors(
    contentColor = contentColor,
    containerColor = containerColor,
    disabledContentColor = disabledContentColor,
    disabledContainerColor = disabledContainerColor
)

@Composable
fun ButtonSecondaryColor(
    contentColor: Color = MaterialTheme.colorScheme.onSecondaryContainer,
    containerColor: Color = MaterialTheme.colorScheme.secondaryContainer,
    disabledContentColor: Color = MaterialTheme.colorScheme.onSecondaryContainer.copy(alpha = 0.6f),
    disabledContainerColor: Color = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.6f)
) = rememberButtonColors(
    contentColor = contentColor,
    containerColor = containerColor,
    disabledContentColor = disabledContentColor,
    disabledContainerColor = disabledContainerColor
)

@Composable
fun ButtonTertiaryColor(
    contentColor: Color = MaterialTheme.colorScheme.onTertiaryContainer,
    containerColor: Color = MaterialTheme.colorScheme.tertiaryContainer,
    disabledContentColor: Color = MaterialTheme.colorScheme.onTertiaryContainer.copy(alpha = 0.6f),
    disabledContainerColor: Color = MaterialTheme.colorScheme.tertiaryContainer.copy(alpha = 0.6f)
) = rememberButtonColors(
    contentColor = contentColor,
    containerColor = containerColor,
    disabledContentColor = disabledContentColor,
    disabledContainerColor = disabledContainerColor
)

@Composable
fun ButtonSuccessColor(
    contentColor: Color = MaterialTheme.extendedColorScheme.success.onColorContainer,
    containerColor: Color = MaterialTheme.extendedColorScheme.success.colorContainer,
    disabledContentColor: Color = MaterialTheme.extendedColorScheme.success.onColorContainer.copy(
        alpha = 0.6f
    ),
    disabledContainerColor: Color = MaterialTheme.extendedColorScheme.success.colorContainer.copy(
        alpha = 0.6f
    )
) = rememberButtonColors(
    contentColor = contentColor,
    containerColor = containerColor,
    disabledContentColor = disabledContentColor,
    disabledContainerColor = disabledContainerColor
)

@Composable
fun ButtonWarningColor(
    contentColor: Color = MaterialTheme.extendedColorScheme.warning.onColorContainer,
    containerColor: Color = MaterialTheme.extendedColorScheme.warning.colorContainer,
    disabledContentColor: Color = MaterialTheme.extendedColorScheme.warning.onColorContainer.copy(
        alpha = 0.6f
    ),
    disabledContainerColor: Color = MaterialTheme.extendedColorScheme.warning.colorContainer.copy(
        alpha = 0.6f
    )
) = rememberButtonColors(
    contentColor = contentColor,
    containerColor = containerColor,
    disabledContentColor = disabledContentColor,
    disabledContainerColor = disabledContainerColor
)