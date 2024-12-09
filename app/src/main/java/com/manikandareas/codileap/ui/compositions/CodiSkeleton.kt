package com.manikandareas.codileap.ui.compositions

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.runtime.getValue

@Composable
fun CodiSkeleton(
    modifier: Modifier = Modifier, isShow: Boolean = true,
    content: @Composable BoxScope.() -> Unit
) {
    val shimmerColors = listOf(
        MaterialTheme.colorScheme.surfaceContainer.copy(alpha = 1f),
        MaterialTheme.colorScheme.surfaceContainer.copy(alpha = 0.6f),
        MaterialTheme.colorScheme.surfaceContainer.copy(alpha = 1f)
    )

    val transition = rememberInfiniteTransition(label = "")
    val translateAnim by transition.animateFloat(
        initialValue = 0f, targetValue = 1000f, animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1700, delayMillis = 200),
            repeatMode = RepeatMode.Restart
        ), label = ""
    )

    val brush = Brush.linearGradient(
        colors = shimmerColors,
        start = Offset.Zero,
        end = Offset(x = translateAnim, y = translateAnim)
    )


    if (isShow) {
        Box(
            modifier = modifier.background(brush)
        ) {
            Box(modifier = Modifier
                .matchParentSize()
                .graphicsLayer { alpha = 1f })
        }
    } else {
        Box(
            modifier = modifier
        ) {
            content()
        }

    }
}