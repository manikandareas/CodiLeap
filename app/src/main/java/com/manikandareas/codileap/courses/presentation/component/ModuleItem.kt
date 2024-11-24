package com.manikandareas.codileap.courses.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CollectionsBookmark
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.R
import com.manikandareas.codileap.courses.data.dummy.createModulesForCourse
import com.manikandareas.codileap.courses.presentation.model.ModuleUi
import com.manikandareas.codileap.courses.presentation.model.toUiModel
import com.manikandareas.codileap.ui.theme.CodiLeapTheme


@Composable
fun ModuleItem(
    module: ModuleUi,
    onClick: (module: ModuleUi) -> Unit,
    modifier: Modifier,
    containerColor: Color = MaterialTheme.colorScheme.surfaceContainer,
    isLocked: Boolean = false
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = containerColor),
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .clickable(enabled = true, onClick = { onClick(module) }),

        ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_lesson_item),
                contentDescription = "Module Item",
                modifier = Modifier
                    .size(48.dp)
                    .clip(MaterialTheme.shapes.large)
                    .background(MaterialTheme.colorScheme.onSurface)
                    .padding(10.dp)
            )
            Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = Modifier.weight(1F)) {
                Text(
                    text = module.name ?: "No Title",
                    style = MaterialTheme.typography.titleMedium
                )
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.CollectionsBookmark,
                            contentDescription = "Module",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            text = "${module.units.size} Units" ?: "No Units",
                            style = MaterialTheme.typography.labelSmall,
                            modifier = Modifier.padding(start = 4.dp),
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                        )
                    }

                }
            }

            if (isLocked) {
                Image(
                    painter = painterResource(id = R.drawable.ic_lock),
                    contentDescription = "Locked",
                    modifier = Modifier.size(32.dp)
                )
            }

        }
    }
}

@PreviewLightDark
@Composable
private fun PreviewModuleItem(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        ModuleItem(
            modifier = modifier,
            containerColor = MaterialTheme.colorScheme.surface,
            module = createModulesForCourse(
                learningPath = "Android Development Fundamentals",
                moduleName = "Kotlin Basics"
            ).first().toUiModel(),
            onClick = {},
            isLocked = true
        )
    }
}
