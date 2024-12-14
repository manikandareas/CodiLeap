package com.manikandareas.codileap.screening.presentation

import android.annotation.SuppressLint
import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.screening.presentation.component.ScreeningAppBar
import com.manikandareas.codileap.screening.presentation.component.ScreeningAppBarUi
import com.manikandareas.codileap.screening.presentation.component.ScreeningName
import com.manikandareas.codileap.screening.presentation.component.ScreeningStartQuiz
import com.manikandareas.codileap.screening.presentation.component.ScreeningStudyHour
import com.manikandareas.codileap.screening.presentation.component.ScreeningWelcome
import com.manikandareas.codileap.ui.compositions.CodiButton
import com.manikandareas.codileap.ui.theme.AlertDialogType

//
//@Composable
//fun ScreeningScreen(
//    state: ScreeningState,
//    onAction: (ScreeningAction) -> Unit,
//    modifier: Modifier = Modifier
//) {
//
//    val pages: List<@Composable () -> Unit> = listOf(
//        { ScreeningWelcome(modifier = Modifier.fillMaxWidth()) },
//        {
//            ScreeningName(modifier = Modifier.fillMaxWidth(), state = state, onAction = {
//                onAction(
//                    ScreeningAction.OnScreeningNameAction(it)
//                )
//            })
//        },
//        {
//            ScreeningStudyHour(modifier = Modifier.fillMaxWidth(), state = state, onAction = {
//                onAction(
//                    ScreeningAction.OnScreeningStudyHourAction(it)
//                )
//            })
//        },
//    )
//
//    val pagerState = rememberPagerState(initialPage = 0) {
//        pages.size
//    }
//
//    val appBarState = remember {
//        derivedStateOf {
//            when (pagerState.currentPage) {
//                0 -> ScreeningAppBarUi(title = "Introduction")
//                1 -> ScreeningAppBarUi(title = "Personal Information")
//                2 -> ScreeningAppBarUi(title = "Motive")
//                3 -> ScreeningAppBarUi(title = "Experience")
//                4 -> ScreeningAppBarUi(title = "Study Hour")
//                else -> ScreeningAppBarUi()
//            }
//        }
//    }
//    val buttonState = remember {
//        derivedStateOf {
//            when (pagerState.currentPage) {
//                0 -> "Let's Go"
//                1 -> "Continue"
//                2 -> "Continue"
//                3 -> "Continue"
//                4 -> "Finish"
//                else -> ""
//            }
//        }
//    }
//
//    Scaffold(
//        topBar = {
//            ScreeningAppBar(
//                appBarUi = appBarState.value,
//                modifier = Modifier.fillMaxWidth()
//            )
//        },
//        bottomBar = {
//            Box(modifier = Modifier.padding(16.dp)) {
//                CodiButton(
//                    onClick = { onAction(ScreeningAction.NavigateTo(Destination.HomeGraph)) },
//                    modifier = Modifier.fillMaxWidth(),
//                ) {
//                    Text(buttonState.value)
//                }
//            }
//        },
//        modifier = modifier
//            .fillMaxSize()
//            .background(MaterialTheme.colorScheme.background)
//    ) { innerPadding ->
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(innerPadding)
//                .padding(16.dp),
//            verticalArrangement = Arrangement.Center
//        ) {
//
//            HorizontalPager(
//                state = pagerState, modifier = Modifier.fillMaxWidth(),
//                pageContent = { page ->
//                    pages[page]()
//                }
//            )
//        }
//    }
//}

data class ScreeningPages(
    val id: Int,
    val comp: @Composable () -> Unit
)

@SuppressLint("DefaultLocale")
@Composable
fun ScreeningScreen(
    state: ScreeningState,
    onAction: (ScreeningAction) -> Unit,
    modifier: Modifier = Modifier,
) {

    val pages: List<ScreeningPages> = listOf(
        ScreeningPages(
            id = 1,
            comp = { ScreeningWelcome(modifier = Modifier.fillMaxWidth()) }
        ),
        ScreeningPages(
            id = 2,
            comp = {
                ScreeningName(modifier = Modifier.fillMaxWidth(), state = state, onAction = {
                    onAction(
                        ScreeningAction.OnScreeningNameAction(it)
                    )
                })
            }
        ),

        ScreeningPages(
            id = 3,
            comp = {
                ScreeningStudyHour(modifier = Modifier.fillMaxWidth(), state = state, onAction = {
                    onAction(
                        ScreeningAction.OnScreeningStudyHourAction(it)
                    )
                })
            }
        ),
        ScreeningPages(
            id = 4,
            comp = {
                ScreeningStartQuiz(
                    modifier = Modifier.fillMaxSize(),
                )
            }
        ),
    )


    val isAlertDialogOpen = remember { mutableStateOf(false) }
    var moduleActionType by remember { mutableStateOf(AlertDialogType.ERROR) }

    var currentPageIndex by rememberSaveable {
        mutableIntStateOf(0.coerceIn(0, pages.size - 1))
    }
    val currentPage = pages.getOrNull(currentPageIndex) ?: return

    val progress = (currentPageIndex + 1).toFloat() / pages.size


    val appBarState = remember {
        derivedStateOf {
            when (currentPageIndex) {
                0 -> ScreeningAppBarUi(title = "Introduction")
                1 -> ScreeningAppBarUi(title = "Personal Information")
                2 -> ScreeningAppBarUi(title = "Study Hour")
                3 -> ScreeningAppBarUi(title = "Learning Path")
                4 -> ScreeningAppBarUi(title = "Study Hour")
                else -> ScreeningAppBarUi()
            }
        }
    }
    val buttonState = remember {
        derivedStateOf {
            when (currentPageIndex) {
                0 -> "Let's Go"
                1 -> "Continue"
                2 -> "Continue"
                3 -> "Continue"
                4 -> "Finish"
                else -> ""
            }
        }
    }



    BackHandler(enabled = true) {
        if (currentPageIndex == 0) {
            moduleActionType = AlertDialogType.ERROR
            isAlertDialogOpen.value = true
        } else {
            currentPageIndex--
        }
    }


    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),

        topBar = {
            ScreeningAppBar(
                appBarUi = appBarState.value,
                modifier = Modifier.fillMaxWidth()
            )
        },
        bottomBar = {
            Box(modifier = Modifier.padding(16.dp)) {
                if (currentPage.id == 4) {
                    CodiButton(
                        onClick = {
                            onAction(ScreeningAction.NavigateToQuizSession)
                        },
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Text("Start Quiz")
                    }
                } else {
                    CodiButton(
                        onClick = {
                            if (currentPageIndex < pages.size - 1) {
                                currentPageIndex++
                            } else {
                                moduleActionType = AlertDialogType.WARNING
                                isAlertDialogOpen.value = true
                            }
                        },
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Text(buttonState.value)
                    }
                }
            }
        },

        ) { innerPadding ->


        AnimatedContent(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),  // Pindahkan padding ke sini
            targetState = currentPage,
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
        ) { page ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                page.comp()
            }
        }
    }
}

//@PreviewLightDark
//@Composable
//fun PreviewScreeningScreen(modifier: Modifier = Modifier) {
//    CodiLeapTheme {
//        ScreeningScreen(modifier = modifier, onAction = {}, state = ScreeningState())
//    }
//}