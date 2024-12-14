package com.manikandareas.codileap.home.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.screening.presentation.screening_result.learningPaths
import com.manikandareas.codileap.ui.compositions.CodiButton
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import com.manikandareas.codileap.user.domain.UserProgress

@Composable
fun HomeCourseProgress(
    modifier: Modifier = Modifier,
    courseProgress: UserProgress? = null,
    onStartCourseClick: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.medium)
            .background(
                if (courseProgress?.learningPathProgress.isNullOrEmpty())
                    MaterialTheme.colorScheme.surfaceContainerLowest
                else
                    MaterialTheme.colorScheme.surfaceContainer
            )
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        // Check if there's no progress
        if (courseProgress?.learningPathProgress.isNullOrEmpty() || (courseProgress.learningPathProgress[0].progress == 0f)) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Start Your Learning Journey",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = "Begin your first course today!",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            CodiButton(
                onClick = { onStartCourseClick() },
                modifier = Modifier.weight(.2f),
                contentPadding = PaddingValues(0.dp),
            ) {
                Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "Start")
            }
        } else {
            // Existing progress view
            val learningPath = learningPaths.find {
                it.id == courseProgress.learningPathProgress[0].pathId
            }

            val progress = courseProgress.learningPathProgress[0].progress

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = "${courseProgress.overallProgress?.completedCourse} Steps completed!",
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "${learningPath?.name} - total ${courseProgress.overallProgress?.totalCourse}!",
                    style = MaterialTheme.typography.labelMedium
                )
                LinearProgressIndicator(
                    progress = { progress / 100 },
                    modifier = Modifier.height(12.dp),
                    color = MaterialTheme.colorScheme.primaryContainer,
                    trackColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
            Spacer(modifier = Modifier.width(4.dp))

            CodiButton(
                onClick = onStartCourseClick,
                modifier = Modifier.weight(.2f),
                contentPadding = PaddingValues(0.dp),
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Continue Learning"
                )
            }
        }
    }
}

@PreviewLightDark()
@Composable
fun PreviewHomeModuleProgress(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        HomeCourseProgress(modifier = modifier, courseProgress = null) {}
    }
}