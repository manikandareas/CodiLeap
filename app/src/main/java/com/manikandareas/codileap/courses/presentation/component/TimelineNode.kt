package com.manikandareas.codileap.courses.presentation.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.courses.presentation.defaults.CircleParametersDefaults
import com.manikandareas.codileap.courses.presentation.defaults.LineParametersDefaults
import com.manikandareas.codileap.courses.presentation.model.CircleParameters
import com.manikandareas.codileap.courses.presentation.model.LineParameters
import com.manikandareas.codileap.courses.presentation.model.StrokeParameters
import com.manikandareas.codileap.courses.presentation.model.TimelineNodePosition
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import com.manikandareas.codileap.R

@Composable
fun TimelineNode(
    position: TimelineNodePosition,
    circleParameters: CircleParameters,
    lineParameters: LineParameters? = null,
    contentStartOffset: Dp = 16.dp,
    spacer: Dp = 32.dp,
    content: @Composable BoxScope.(modifier: Modifier) -> Unit
) {
    val iconPainter = circleParameters.icon?.let { painterResource(id = it) }
    Box(
        modifier = Modifier
            .wrapContentSize()
            .drawBehind {
                val circleRadiusInPx = circleParameters.radius.toPx()

                lineParameters?.let {
                    drawLine(
                        brush = it.brush,
                        start = Offset(x = circleRadiusInPx, y = circleRadiusInPx * 2),
                        end = Offset(x = circleRadiusInPx, y = this.size.height),
                        strokeWidth = it.strokeWidth.toPx()
                    )
                }

                drawCircle(
                    circleParameters.backgroundColor,
                    circleRadiusInPx,
                    center = Offset(x = circleRadiusInPx, y = circleRadiusInPx)
                )

                circleParameters.stroke?.let { stroke ->
                    val strokeWidthInPx = stroke.width.toPx()
                    drawCircle(
                        color = stroke.color,
                        radius = circleRadiusInPx - strokeWidthInPx / 2,
                        center = Offset(x = circleRadiusInPx, y = circleRadiusInPx),
                        style = Stroke(width = strokeWidthInPx)
                    )
                }

                iconPainter?.let { painter ->
                    this.withTransform(
                        transformBlock = {
                            translate(
                                left = circleRadiusInPx - painter.intrinsicSize.width / 2f,
                                top = circleRadiusInPx - painter.intrinsicSize.height / 2f
                            )
                        },
                        drawBlock = {
                            this.drawIntoCanvas {
                                with(painter) {
                                    draw(intrinsicSize)
                                }
                            }
                        })
                }
            }
    ) {
        content(
            Modifier
                .defaultMinSize(minHeight = circleParameters.radius * 2)
                .padding(
                    start = circleParameters.radius * 2 + contentStartOffset,
                    bottom = if (position != TimelineNodePosition.LAST) spacer else 0.dp
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TimelinePreview() {
    CodiLeapTheme() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            TimelineNode(
                position = TimelineNodePosition.FIRST,
                circleParameters = CircleParametersDefaults.circleParameters(
                    backgroundColor = Color.LightGray
                ),
                lineParameters = LineParametersDefaults.linearGradient(
                    startColor = Color.Blue,
                    endColor = Color.Blue
                )
            ) { modifier ->
                TimelineItem(
                    modifier = modifier,
                    lesson = dummyTimelineItem
                )
            }

            TimelineNode(
                position = TimelineNodePosition.MIDDLE,
                circleParameters = CircleParametersDefaults.circleParameters(
                    backgroundColor = Color.Magenta
                ),
                contentStartOffset = 16.dp,
                lineParameters = LineParametersDefaults.linearGradient(
                    startColor = Color.Cyan,
                    endColor = Color.Cyan
                )
            ) { modifier ->
                TimelineItem(
                    modifier = modifier,
                    lesson = dummyTimelineItem
                )
            }

            TimelineNode(
                TimelineNodePosition.LAST,
                circleParameters = CircleParametersDefaults.circleParameters(
                    backgroundColor = Color.Yellow,
                    stroke = StrokeParameters(color = Color.Yellow, width = 2.dp),
                    icon = R.drawable.ic_lock
                )
            ) { modifier ->
                TimelineItem(
                    modifier = modifier,
                    lesson = dummyTimelineItem
                )
            }
        }
    }
}
