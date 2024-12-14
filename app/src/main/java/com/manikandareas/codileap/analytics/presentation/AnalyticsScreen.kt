package com.manikandareas.codileap.analytics.presentation

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.analytics.presentation.component.AnalyticsAppBar
import com.manikandareas.codileap.analytics.presentation.component.CardChronotype
import com.manikandareas.codileap.analytics.presentation.component.CardDailySpend
import com.manikandareas.codileap.analytics.presentation.component.CardTotalStudyHours
import com.manikandareas.codileap.analytics.presentation.model.ChronotypeIconOption
import com.manikandareas.codileap.analytics.presentation.model.ChronotypeUi
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.home.presentation.component.HomeBottomAppBar
import com.manikandareas.codileap.home.presentation.component.HomeChatBotFab
import com.manikandareas.codileap.home.presentation.component.HomeCourseProgress
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import kotlin.math.roundToInt


@Composable
fun AnalyticsScreen(onAction: (AnalyticsAction) -> Unit, modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    var isBottomBarVisible by remember { mutableStateOf(true) }
    var previousScrollOffset by remember { mutableIntStateOf(0) }

    LaunchedEffect(scrollState.value) {
        if (scrollState.value == 0) {
            isBottomBarVisible = true
            return@LaunchedEffect
        }

        val currentOffset = scrollState.value
        if (currentOffset != previousScrollOffset) {
            isBottomBarVisible = currentOffset < previousScrollOffset
            previousScrollOffset = currentOffset
        }
    }

    val bottomBarOffsetHeightPx = with(LocalDensity.current) { 80.dp.toPx() }
    val bottomBarTranslation by animateFloatAsState(
        targetValue = if (isBottomBarVisible) 0f else bottomBarOffsetHeightPx,
        label = "bottomBarTranslation"
    )

    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        topBar = {
            AnalyticsAppBar(
                modifier = Modifier.fillMaxWidth()
            )
        },
        bottomBar = {
            HomeBottomAppBar(
                currentRoute = Destination.AnalyticsScreen,
                onNavigate = {
                    onAction(AnalyticsAction.NavigateTo(it))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = bottomBarTranslation.roundToInt().dp)
            )
        },

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 16.dp)
                .verticalScroll(scrollState)
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            CardDailySpend(modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(16.dp))

            Row {
                CardChronotype(
                    chronotypeUi = ChronotypeUi(chronotypeIcon = ChronotypeIconOption.lion),
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1 / 1f)
                )
                Spacer(modifier = Modifier.width(16.dp))
                CardTotalStudyHours(modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1 / 1f))
            }

            Spacer(modifier = Modifier.height(16.dp))

            HomeCourseProgress(
                courseProgress = null,
            ){}
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewAnalyticsScreen() {
    CodiLeapTheme {
        AnalyticsScreen(onAction = {})
    }
}