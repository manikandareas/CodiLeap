package com.manikandareas.codileap.screening.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.R
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun ScreeningExperience(modifier: Modifier = Modifier) {
    var selectedButton by remember { mutableIntStateOf(0) }
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            "How much experience coding do you have?",
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_code_play),
            contentDescription = "Book of code",
            modifier = Modifier.size(138.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))
        var sliderValue by remember { mutableStateOf(.5f) }

        CustomSlider(
            value = sliderValue,
            onValueChange = { newValue ->
                sliderValue = newValue
            },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
fun CustomSlider(
    modifier: Modifier = Modifier,
    value: Float,
    onValueChange: (Float) -> Unit
) {
    val steps = listOf("NONE", "A LITTLE", "A LOT")
    val stepCount = steps.size - 1
    val trackColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f)
    val thumbColor = MaterialTheme.colorScheme.primary

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Label Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            steps.forEachIndexed { index, label ->
                Text(
                    text = label,
                    color = if ((value * stepCount).toInt() == index) thumbColor else trackColor,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Slider
        Slider(
            value = value,
            onValueChange = onValueChange,
            valueRange = 0f..1f,
            steps = stepCount - 1, // Number of steps between 0 and 1
            colors = SliderDefaults.colors(
                thumbColor = thumbColor,
                activeTrackColor = thumbColor,
                inactiveTrackColor = trackColor
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
}


@PreviewLightDark
@Composable
fun PreviewScreeningExperience() {
    CodiLeapTheme {
        ScreeningExperience()
    }
}