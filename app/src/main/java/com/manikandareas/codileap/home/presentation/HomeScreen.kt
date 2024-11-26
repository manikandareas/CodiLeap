package com.manikandareas.codileap.home.presentation

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
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
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.home.presentation.component.HomeAppBar
import com.manikandareas.codileap.home.presentation.component.HomeBanner
import com.manikandareas.codileap.home.presentation.component.HomeBottomAppBar
import com.manikandareas.codileap.home.presentation.component.HomeCarousel
import com.manikandareas.codileap.home.presentation.component.HomeChatBotFab
import com.manikandareas.codileap.home.presentation.component.HomeCourseProgress
import com.manikandareas.codileap.home.presentation.component.HomeQuizAction
import com.manikandareas.codileap.home.presentation.component.userUi
import com.manikandareas.codileap.home.presentation.model.DummyCarouselUi
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import kotlin.math.roundToInt

@Composable
fun HomeScreen(onAction: (HomeAction) -> Unit, modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    var isBottomBarVisible by remember { mutableStateOf(true) }
    var previousScrollOffset by remember { mutableIntStateOf(0) }

    // Observe scroll position and update bottom bar visibility
    LaunchedEffect(scrollState.value) {
        // Always show bottom bar when at the top
        if (scrollState.value == 0) {
            isBottomBarVisible = true
            return@LaunchedEffect
        }

        val currentOffset = scrollState.value
        if (currentOffset != previousScrollOffset) {
            // Scrolling down (positive direction) -> hide
            // Scrolling up (negative direction) -> show
            isBottomBarVisible = currentOffset < previousScrollOffset
            previousScrollOffset = currentOffset
        }
    }

    // Animate bottom bar translation
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
            HomeAppBar(
                data = userUi,
                modifier = Modifier.fillMaxWidth(),
                onProfileClick = {
                    onAction(HomeAction.NavigateTo(Destination.ProfileScreen))
                }
            )
        },
        bottomBar = {
            HomeBottomAppBar(
                currentRoute = Destination.HomeScreen,
                onNavigate = {
                    onAction(HomeAction.NavigateTo(it))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = bottomBarTranslation.roundToInt().dp)
            )
        },
        floatingActionButton = {
            HomeChatBotFab(onClick = {
                onAction(HomeAction.NavigateTo(Destination.ChatBotScreen))
            })
        }

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 16.dp)
                .verticalScroll(scrollState)
        ) {
            Spacer(modifier = Modifier.height(8.dp))
            HomeBanner(modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(16.dp))
            HomeCourseProgress(modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(16.dp))
            HomeQuizAction(onClick = {onAction(HomeAction.NavigateTo(Destination.QuizScreen))}, modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(16.dp))
            HomeCarousel(modifier = Modifier.fillMaxWidth(), carouselUi = DummyCarouselUi)
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewHomeScreen() {
    CodiLeapTheme {
        HomeScreen(onAction = {})
    }
}