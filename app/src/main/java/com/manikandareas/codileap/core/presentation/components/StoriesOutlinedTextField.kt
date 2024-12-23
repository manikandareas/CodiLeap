package com.manikandareas.codileap.core.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp


@Composable
fun StoriesOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    isError: Boolean = false,
    errorText: String = "",
    placeholder: String = "John Doe",
    modifier: Modifier = Modifier,
    singleLine: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
    shape: Shape = MaterialTheme.shapes.large,
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
    placeholderColor: Color = MaterialTheme.colorScheme.outline,
    focusedBorderColor: Color = MaterialTheme.colorScheme.primary,
    unfocusedBorderColor: Color = MaterialTheme.colorScheme.outlineVariant,
    errorBorderColor: Color = MaterialTheme.colorScheme.error,
    errorLabelColor: Color = MaterialTheme.colorScheme.error,
) {

    Column(modifier = Modifier, verticalArrangement = Arrangement.spacedBy(8.dp)) {
        OutlinedTextField(
            value = value,
            onValueChange = {onValueChange(it)},
            isError = isError,
            placeholder = {
                Text(
                    text = placeholder,
                    style = textStyle,
                    color = placeholderColor
                )
            },
            modifier = modifier.fillMaxWidth(),
            singleLine = singleLine,
            keyboardOptions = keyboardOptions,
            shape = shape,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = focusedBorderColor,
                unfocusedBorderColor = unfocusedBorderColor,
                errorBorderColor = errorBorderColor,
                errorLabelColor = errorLabelColor
            )
        )
        if (errorText.isNotBlank()) {
            Text(text = errorText, color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall)
        }
    }
}
