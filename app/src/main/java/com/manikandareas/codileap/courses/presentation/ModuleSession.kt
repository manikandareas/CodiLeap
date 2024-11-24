@file:OptIn(ExperimentalAnimationApi::class)

package com.manikandareas.codileap.courses.presentation

import android.widget.Toast
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.core.presentation.util.HtmlParser
import com.manikandareas.codileap.core.presentation.util.HtmlRenderer
import com.manikandareas.codileap.core.presentation.util.kotlinModule
import com.manikandareas.codileap.courses.data.dummy.createModulesForCourse
import com.manikandareas.codileap.courses.presentation.component.ModuleAppBar
import com.manikandareas.codileap.courses.presentation.component.ModuleBottomAppBar
import com.manikandareas.codileap.courses.presentation.model.toUiModel
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun ModuleSession(state: ModuleState, modifier: Modifier = Modifier) {
    val parser = HtmlParser()
    val elements = parser.parseHtml(kotlinModule)
    val units = state.moduleUi.units

    var currentUnitIndex by remember { mutableIntStateOf(0) }
    val currentUnit = units[currentUnitIndex]
    val progress = (currentUnitIndex + 1).toFloat() / units.size

    // Buat LazyListState baru untuk setiap unit
    val listState = rememberLazyListState()
    var lastIndex by remember { mutableIntStateOf(0) }
    var lastOffset by remember { mutableIntStateOf(0) }

    val context = LocalContext.current

    val isBottomBarVisible by remember {
        derivedStateOf {
            val firstVisibleItemIndex = listState.firstVisibleItemIndex
            val firstVisibleItemScrollOffset = listState.firstVisibleItemScrollOffset

            val isAtBottom = listState.layoutInfo.let { layout ->
                val visibleItemsInfo = layout.visibleItemsInfo
                if (visibleItemsInfo.isEmpty()) {
                    false
                } else {
                    val lastVisibleItem = visibleItemsInfo.last()
                    val itemCount = layout.totalItemsCount
                    lastVisibleItem.index == itemCount - 1 &&
                            lastVisibleItem.offset + lastVisibleItem.size <= layout.viewportEndOffset
                }
            }

            val isScrollingUp = when {
                firstVisibleItemIndex < lastIndex -> true
                firstVisibleItemIndex > lastIndex -> false
                else -> firstVisibleItemScrollOffset <= lastOffset
            }

            lastIndex = firstVisibleItemIndex
            lastOffset = firstVisibleItemScrollOffset

            isScrollingUp || isAtBottom
        }
    }

    // Reset scroll position when unit changes
    LaunchedEffect(currentUnit.id) {
        listState.scrollToItem(0)
    }

    Scaffold(
        modifier = modifier.fillMaxSize(),  // Hapus background di sini
        topBar = {
            ModuleAppBar(
                unitProgress = progress,
                onBack = {
                    if (currentUnitIndex > 0) {
                        currentUnitIndex--
                    }
                },
                enabled = currentUnitIndex > 0,
            )
        },
        floatingActionButton = {
            AnimatedVisibility(
                visible = isBottomBarVisible,
                enter = slideInVertically(initialOffsetY = { it }),
                exit = slideOutVertically(targetOffsetY = { it * 40 })
            ) {
                ModuleBottomAppBar(
                    modifier = Modifier.offset(y = (40).dp),
                    onContinue = {
                        if (currentUnitIndex < units.size - 1) {
                            currentUnitIndex++
                        } else {
                            Toast.makeText(context, "Module Completed", Toast.LENGTH_SHORT)
                                .show()
                        }
                    }
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
    ) { innerPadding ->
        AnimatedContent(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),  // Pindahkan padding ke sini
            targetState = currentUnit,
            transitionSpec = {
                val targetIndex = targetState.id
                val initialIndex = initialState.id

                if (targetIndex > initialIndex) {
                    // Gerak maju (continue) - slide dari kanan ke kiri
                    slideInHorizontally(
                        initialOffsetX = { it }, // Masuk dari kanan
                        animationSpec = tween(300)
                    ) togetherWith slideOutHorizontally(
                        targetOffsetX = { -it }, // Keluar ke kiri
                        animationSpec = tween(300)
                    )
                } else {
                    // Gerak mundur (back) - slide dari kiri ke kanan
                    slideInHorizontally(
                        initialOffsetX = { -it }, // Masuk dari kiri
                        animationSpec = tween(300)
                    ) togetherWith slideOutHorizontally(
                        targetOffsetX = { it }, // Keluar ke kanan
                        animationSpec = tween(300)
                    )
                }
            },
            label = "AnimatedContent"
        ) { unit ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)  // Pindahkan padding horizontal ke sini
            ) {
//                val elements = parser.parseHtml(unit.content)
                HtmlRenderer(
                    lazyState = listState,
                    elements = elements,
//                    modifier = Modifier.fillMaxSize()  // Tambahkan modifier untuk HtmlRenderer
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun ModuleScreenPreview() {
    CodiLeapTheme {
        ModuleSession(
            state = ModuleState(
                moduleUi = createModulesForCourse(
                    learningPath = "Android Development Fundamentals", courseName = "Kotlin Basics"
                ).first().toUiModel()
            ),
        )
    }
}


