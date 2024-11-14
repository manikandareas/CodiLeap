package com.manikandareas.codileap.home.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.home.presentation.model.BottomBarUi
import com.manikandareas.codileap.ui.theme.CodiLeapTheme


@Composable
fun HomeBottomAppBar(
    modifier: Modifier = Modifier,
    currentRoute: Destination,
    onNavigate: (Destination) -> Unit,
) {
    val items = listOf(
        BottomBarUi.Home,
        BottomBarUi.Courses,
        BottomBarUi.Analytics,
        BottomBarUi.Settings
    )

    Surface(
        color = MaterialTheme.colorScheme.surface,
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEach { item ->
                val selected = currentRoute == item.route

                Button(
                    onClick = { onNavigate(item.route) },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (selected)
                            MaterialTheme.colorScheme.secondaryContainer
                        else
                            Color.Transparent
                    ),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.padding(horizontal = 4.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = if (selected)
                                MaterialTheme.colorScheme.primary
                            else
                                MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                            modifier = Modifier.size(24.dp)
                        )
                        if (selected) {
                            Text(
                                text = item.title,
                                style = MaterialTheme.typography.labelMedium,
                                color = MaterialTheme.colorScheme.primary
                            )
                        }
                    }
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewHomeBottomAppBar(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        HomeBottomAppBar(
            currentRoute = Destination.HomeScreen,
            onNavigate = { }
        )
    }
}