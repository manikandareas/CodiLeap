package com.manikandareas.codileap.ui.compositions


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.ui.theme.ButtonPrimaryColor
import com.manikandareas.codileap.ui.theme.ButtonSecondaryColor
import com.manikandareas.codileap.ui.theme.ButtonSuccessColor
import com.manikandareas.codileap.ui.theme.ButtonTertiaryColor
import com.manikandareas.codileap.ui.theme.ButtonWarningColor
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun CodiButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = MaterialTheme.shapes.medium,
    colors: ButtonColors = ButtonDefaults.buttonColors(
        contentColor = MaterialTheme.colorScheme.primary,
        containerColor = MaterialTheme.colorScheme.onPrimary,
        disabledContentColor = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.6f),
        disabledContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.6f)
    ),
    elevation: ButtonElevation? = ButtonDefaults.buttonElevation(),
    border: BorderStroke? = null,
    contentPadding: PaddingValues = PaddingValues(vertical = 14.dp, horizontal = 16.dp),
    interactionSource: MutableInteractionSource? = null,
    content: @Composable (RowScope.() -> Unit)
) {
    Button(
        onClick,
        modifier,
        enabled,
        shape,
        colors,
        elevation,
        border,
        contentPadding,
        interactionSource,
        content
    )
}

@PreviewLightDark
@Composable
private fun PreviewCodiButton() {
    CodiLeapTheme {
        CodiButton(onClick = {}, colors = ButtonPrimaryColor()) {
            Text("Button")
        }
    }

}



@PreviewLightDark
@Composable
private fun PreviewCodiButtonSecondary() {
    CodiLeapTheme {
        CodiButton(onClick = {}, colors = ButtonSecondaryColor()) {
            Text("Button")
        }
    }

}

@PreviewLightDark
@Composable
private fun PreviewCodiButtonTertiary() {
    CodiLeapTheme {
        CodiButton(onClick = {}, colors = ButtonTertiaryColor()) {
            Text("Button")
        }
    }

}

@PreviewLightDark
@Composable
private fun PreviewCodiButtonSuccess() {
    CodiLeapTheme {
        CodiButton(onClick = {}, colors = ButtonSuccessColor()) {
            Text("Button")
        }
    }

}

@PreviewLightDark
@Composable
private fun PreviewCodiButtonWarning() {
    CodiLeapTheme {
        CodiButton(onClick = {}, colors = ButtonWarningColor()) {
            Text("Button")
        }
    }

}

@PreviewLightDark
@Composable
private fun PreviewCodiButtonDisabled() {
    CodiLeapTheme {
        CodiButton(onClick = {}, enabled = false) {
            Text("Button")
        }
    }

}