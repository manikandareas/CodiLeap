package com.manikandareas.codileap.courses.presentation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.FabPosition
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.core.presentation.util.HtmlParser
import com.manikandareas.codileap.core.presentation.util.HtmlRenderer
import com.manikandareas.codileap.core.presentation.util.kotlinLesson
import com.manikandareas.codileap.courses.presentation.component.LessonAppbar
import com.manikandareas.codileap.courses.presentation.component.LessonBottomAppBar
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun LessonScreen(modifier: Modifier = Modifier) {
    val parser = HtmlParser()
    val elements = parser.parseHtml(kotlinLesson)

    val listState = rememberLazyListState()
    var lastIndex by remember { mutableIntStateOf(0) }
    var lastOffset by remember { mutableIntStateOf(0) }

    // Track scroll direction
    val isBottomBarVisible by remember {
        derivedStateOf {
            val firstVisibleItemIndex = listState.firstVisibleItemIndex
            val firstVisibleItemScrollOffset = listState.firstVisibleItemScrollOffset

            // Check if we're at the bottom of the list
            val isAtBottom = listState.layoutInfo.let { layout ->
                val visibleItemsInfo = layout.visibleItemsInfo
                if (visibleItemsInfo.isEmpty()) {
                    false
                } else {
                    val lastVisibleItem = visibleItemsInfo.last()
                    val itemCount = layout.totalItemsCount

                    // Check if the last visible item is the last item in the list
                    // and it's fully visible
                    lastVisibleItem.index == itemCount - 1 &&
                            lastVisibleItem.offset + lastVisibleItem.size <= layout.viewportEndOffset
                }
            }

            // Determine scroll direction
            val isScrollingUp = when {
                firstVisibleItemIndex < lastIndex -> true // Scrolled to previous items
                firstVisibleItemIndex > lastIndex -> false // Scrolled to next items
                else -> firstVisibleItemScrollOffset <= lastOffset // Check offset in same item
            }

            // Update last known position
            lastIndex = firstVisibleItemIndex
            lastOffset = firstVisibleItemScrollOffset

            // Show bottom bar if scrolling up OR at the bottom of the list
            isScrollingUp || isAtBottom
        }
    }


    Surface {
        Scaffold(
            modifier = modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            topBar = {
                LessonAppbar()
            },
            floatingActionButton = {
                AnimatedVisibility(
                    visible = isBottomBarVisible,
                    enter = slideInVertically(initialOffsetY = { it }),
                    exit = slideOutVertically(targetOffsetY = { it * 40 })
                ) {
                    LessonBottomAppBar(modifier = Modifier.offset(y = (40).dp))
                }
            },
            floatingActionButtonPosition = FabPosition.Center,
            ) { innerPadding ->
            Column(
                modifier = modifier
                    .padding(innerPadding)
                    .padding(horizontal = 16.dp)
            ) {
                HtmlRenderer(lazyState = listState, elements = elements)
            }
        }
    }
}

@PreviewLightDark
@Composable
fun LessonScreenPreview() {
    CodiLeapTheme {
        LessonScreen()
    }
}


