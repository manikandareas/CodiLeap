package com.manikandareas.codileap.screening.presentation.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.R
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun ScreeningMotive(modifier: Modifier = Modifier) {
    var selectedButton by remember { mutableIntStateOf(0) }
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            "Why are you learning to code?",
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(32.dp))


        CodiButton(
            text = "To become a professional developer",
            onClick = {
                selectedButton = 1
            },
            icon = R.drawable.ic_coding,
            isSelected = selectedButton == 1
        )
        Spacer(modifier = Modifier.height(16.dp))
        CodiButton(
            text = "Just for fun",
            onClick = {
                selectedButton = 2
            },
            icon = R.drawable.ic_ice_cream,
            isSelected = selectedButton == 2
        )
        Spacer(modifier = Modifier.height(16.dp))
        CodiButton(
            text = "For my current job",
            onClick = {
                selectedButton = 3
            },
            icon = R.drawable.ic_find_job,
            isSelected = selectedButton == 3
        )
        Spacer(modifier = Modifier.height(16.dp))
        CodiButton(
            text = "For a different reason",
            onClick = {
                selectedButton = 4
            },
            icon = R.drawable.ic_plant,
            isSelected = selectedButton == 4
        )
    }
}

@Composable
fun CodiButton(
    text: String,
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        contentPadding = PaddingValues(16.dp),
        shape = MaterialTheme.shapes.medium,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isSelected) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surfaceContainer,
            contentColor = if (isSelected) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurface
        )
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text,
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewScreeningMotive() {
    CodiLeapTheme {
        ScreeningMotive()
    }
}