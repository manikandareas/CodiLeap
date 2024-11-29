package com.manikandareas.codileap.intro.presentation.component

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manikandareas.codileap.ui.compositions.CodiButton
import com.manikandareas.codileap.ui.theme.ButtonPrimaryColor

@Composable
fun ButtonUi(
    text: String = "Next",
    colors: ButtonColors = ButtonPrimaryColor(),
    textStyle: TextStyle = MaterialTheme.typography.titleMedium,
    fontSize: Int = 14,
    onClick: () -> Unit
) {

    CodiButton(
        onClick = onClick,
        colors = colors,
    ) {
        Text(
            text = text, fontSize = fontSize.sp, style = textStyle
        )
    }


}


@Preview
@Composable
fun NextButton() {

    ButtonUi (text = "Next") {

    }

}

@Preview
@Composable
fun BackButton() {

    ButtonUi(text = "Back",
        textStyle = MaterialTheme.typography.bodySmall,
        fontSize = 13) {
    }


}