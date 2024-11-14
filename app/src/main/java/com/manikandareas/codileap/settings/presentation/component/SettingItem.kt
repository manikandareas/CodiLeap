package com.manikandareas.codileap.settings.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.settings.presentation.model.SettingItemUi
import com.manikandareas.codileap.ui.theme.CodiLeapTheme


@Composable
fun SettingItem(settingUi: SettingItemUi, modifier: Modifier = Modifier) {
    TextButton  (
        modifier = modifier,
        onClick = settingUi.onClick,
        shape = MaterialTheme.shapes.medium,
        contentPadding = PaddingValues(vertical = 12.dp, horizontal = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                imageVector = settingUi.icon,
                contentDescription = settingUi.title
            )
            Text(
                text = settingUi.title,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.weight(1f)
            )
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForwardIos,
                contentDescription = settingUi.title
            )
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewSettingItem(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        SettingItem(
            settingUi = SettingItemUi(
                icon = Icons.Default.Person,
                title = "Personal Data",
                onClick = {}
            ),
            modifier = modifier
        )
    }
}