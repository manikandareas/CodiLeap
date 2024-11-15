package com.manikandareas.codileap.analytics.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import co.yml.charts.axis.AxisData
import co.yml.charts.common.model.AccessibilityConfig
import co.yml.charts.common.model.Point
import co.yml.charts.ui.barchart.BarChart
import co.yml.charts.ui.barchart.models.BarChartData
import co.yml.charts.ui.barchart.models.BarData
import co.yml.charts.ui.barchart.models.BarStyle
import co.yml.charts.ui.barchart.models.SelectionHighlightData
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun CardDailySpend(modifier: Modifier = Modifier) {
    val maxRange = 7

    val barData: List<BarData> = listOf(
        BarData(
            point = Point(0f, 2f),
            color = MaterialTheme.colorScheme.primary,
            label = "Mon"
        ),
        BarData(
            point = Point(1f, 5f),
            color = MaterialTheme.colorScheme.primary,
            label = "Tue"
        ),
        BarData(
            point = Point(2f, 8f),
            color = MaterialTheme.colorScheme.primary,
            label = "Wed"
        ),
        BarData(
            point = Point(3f, 11f),
            color = MaterialTheme.colorScheme.primary,
            label = "Thu"
        ),
        BarData(
            point = Point(4f, 14f),
            color = MaterialTheme.colorScheme.primary,
            label = "Fri"
        ),
        BarData(
            point = Point(5f, 20f),
            color = MaterialTheme.colorScheme.primary,
            label = "Sun"
        ),
        BarData(
            point = Point(6f, 17f),
            color = MaterialTheme.colorScheme.primary,
            label = "Sat"
        ),
    )
    val yStepSize = 10

    val xAxisData = AxisData.Builder()
        .axisStepSize(30.dp)
        .steps(barData.size - 1)
        .startDrawPadding(46.dp)
        .labelData { index -> barData[index].label }
        .axisLabelColor(MaterialTheme.colorScheme.onSurface)
        .axisLineColor(Color.Transparent)
        .build()
    val yAxisData = AxisData.Builder()
        .steps(yStepSize)
        .labelAndAxisLinePadding(20.dp)
        .axisOffset(20.dp)
        .labelData { index -> (index * (maxRange / yStepSize)).toString() }
        .build()

    val barChartData = BarChartData(
        chartData = barData,
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        barStyle = BarStyle(
            paddingBetweenBars = 16.dp,
            barWidth = 32.dp,
            isGradientEnabled = false,
            selectionHighlightData = SelectionHighlightData(
                highlightBarColor = MaterialTheme.colorScheme.onPrimary,
                popUpLabel = { x, y ->
                    "$y H"
                },
                highlightTextBackgroundColor = MaterialTheme.colorScheme.primary,
                highlightTextColor = MaterialTheme.colorScheme.onPrimary
            )
        ),
        showYAxis = false,
        showXAxis = true,
        accessibilityConfig = AccessibilityConfig(
            dividerColor = MaterialTheme.colorScheme.onPrimary,
        ),
        horizontalExtraSpace = 30.dp, // Increase the extra space
        backgroundColor = MaterialTheme.colorScheme.surfaceContainer,
        paddingEnd = 0.dp,
    )
    Card(
        modifier = modifier
            .clip(MaterialTheme.shapes.medium)
            .fillMaxWidth()
            .height(230.dp)
            .background(MaterialTheme.colorScheme.surfaceContainer),
        shape = MaterialTheme.shapes.medium,
    ) {
        Box {
            BarChart(modifier = Modifier, barChartData = barChartData)
        }
    }

}

@PreviewLightDark
@Composable
fun PreviewCardDailySpend(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        CardDailySpend(modifier = modifier.fillMaxWidth())
    }
}