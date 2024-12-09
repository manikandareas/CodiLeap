@file:OptIn(ExperimentalAnimationApi::class, ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.courses.presentation.module

import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.chatbot.presentation.ChatBotSheet
import com.manikandareas.codileap.core.presentation.util.HtmlParser
import com.manikandareas.codileap.core.presentation.util.HtmlRenderer
import com.manikandareas.codileap.core.presentation.util.ObserveAsEvents
import com.manikandareas.codileap.courses.presentation.component.ModuleAppBar
import com.manikandareas.codileap.courses.presentation.component.ModuleBottomAppBar
import com.manikandareas.codileap.courses.presentation.model.ModuleUi
import com.manikandareas.codileap.courses.presentation.model.UnitUi
import com.manikandareas.codileap.ui.compositions.CodiDialog
import com.manikandareas.codileap.ui.compositions.CodiDialogProps
import com.manikandareas.codileap.ui.theme.AlertDialogType
import com.manikandareas.codileap.ui.theme.ErrorAlertDialogStyle
import com.manikandareas.codileap.ui.theme.SuccessAlertDialogStyle
import kotlinx.coroutines.flow.Flow


@Composable
fun ModuleSession(
    state: ModuleState,
    onAction: (ModuleAction) -> Unit,
    modifier: Modifier = Modifier,
    events: Flow<ModuleEvent>
) {
    val parser = HtmlParser()
    // Add null safety for units
    val units = state.moduleUi?.units ?: return

    var codiDialogProps by remember { mutableStateOf<CodiDialogProps?>(null) }

    var codiDialogStyle by rememberSaveable { mutableStateOf(AlertDialogType.ERROR) }

    var currentUnitIndex by rememberSaveable {
        mutableIntStateOf(0.coerceIn(0, units.size - 1))
    }

    val currentUnit = units.getOrNull(currentUnitIndex) ?: return
    val progress = (currentUnitIndex + 1).toFloat() / units.size

    val listState = rememberLazyListState()
    var lastIndex by rememberSaveable { mutableIntStateOf(0) }
    var lastOffset by rememberSaveable { mutableIntStateOf(0) }


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

    var isAlertDialogOpen by rememberSaveable { mutableStateOf(false) }

    var showBottomSheet by remember { mutableStateOf(false) }

    val chatBotSheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false
    )

    LaunchedEffect(currentUnit.id) {
        listState.scrollToItem(0)
    }

    BackHandler(enabled = true) {
        if (currentUnitIndex == 0) {
            onAction(ModuleAction.Exit)
        } else {
            currentUnitIndex--
        }
    }

    ObserveAsEvents(events) { event ->
        when (event) {
            is ModuleEvent.Error -> {
                isAlertDialogOpen = true
                codiDialogStyle = AlertDialogType.ERROR
                codiDialogProps = CodiDialogProps(
                    onDismissRequest = {
                        isAlertDialogOpen = false
                    },
                    onConfirmRequest = {
                        isAlertDialogOpen = false
                    },
                    title = "Oops! Something Went Wrong",
                    description = "An unexpected error occurred. Don't worry, you can try again!",
                    confirmTitle = "Got It"
                )
            }

            is ModuleEvent.SuccessCourseCompleted -> {
                isAlertDialogOpen = true
                codiDialogStyle = AlertDialogType.SUCCESS
                codiDialogProps = CodiDialogProps(
                    onDismissRequest = {
                        isAlertDialogOpen = false
                        onAction(ModuleAction.NavigateBack)
                    },
                    onConfirmRequest = {
                        isAlertDialogOpen = false
                        onAction(ModuleAction.NavigateBack)
                    },
                    title = "Congratulations, You Did It!",
                    description = "You've successfully completed the course! Ready to take on the next challenge?",
                    confirmTitle = "Next Adventure",
                    dismissTitle = "Maybe Later"
                )
            }

            is ModuleEvent.SuccessHasNextModule -> {
                isAlertDialogOpen = true
                codiDialogStyle = AlertDialogType.SUCCESS
                codiDialogProps = CodiDialogProps(
                    onDismissRequest = {
                        isAlertDialogOpen = false
                    },
                    onDismiss = {
                        isAlertDialogOpen = false
                        onAction(ModuleAction.NavigateBack)
                    },
                    onConfirmRequest = {
                        isAlertDialogOpen = false
                        onAction(ModuleAction.GotoNextModule(event.moduleUi))
                    },
                    title = "Way to Go!",
                    description = "You’ve completed this module! The next one is waiting for you.",
                    confirmTitle = "Start Next Module",
                    dismissTitle = "Not Now"
                )
            }

            ModuleEvent.SuccessLearningPathCompleted -> {
                isAlertDialogOpen = true
                codiDialogStyle = AlertDialogType.SUCCESS
                codiDialogProps = CodiDialogProps(
                    onDismissRequest = {
                        isAlertDialogOpen = false
                        onAction(ModuleAction.NavigateBack)
                    },
                    onConfirmRequest = {
                        isAlertDialogOpen = false
                        onAction(ModuleAction.NavigateBack)
                    },
                    title = "You’re a Learning Star!",
                    description = "Amazing work! You’ve completed this learning path. Ready for the next one?",
                    confirmTitle = "Explore More",
                    dismissTitle = "Take a Break"
                )
            }

            ModuleEvent.Exit -> {
                isAlertDialogOpen = true
                codiDialogStyle = AlertDialogType.ERROR
                codiDialogProps = CodiDialogProps(
                    onDismissRequest = {
                        isAlertDialogOpen = false
                    },
                    onConfirmRequest = {
                        isAlertDialogOpen = false
                        onAction(ModuleAction.NavigateBack)
                    },
                    dismissTitle = "Stay Here",
                    confirmTitle = "Yes, Exit",
                    title = "Leave Already?",
                    description = "Exiting now means your progress won’t be saved. Are you sure?",
                )
            }
        }
    }



    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            ModuleAppBar(
                unitProgress = progress,
                onBack = {
                    if (currentUnitIndex > 0) {
                        currentUnitIndex--
                    }
                },
                enabled = currentUnitIndex > 0,
                onExit = {
                    onAction(ModuleAction.Exit)
                }
            )
        },
        floatingActionButton = {
            AnimatedVisibility(
                visible = isBottomBarVisible,
                enter = slideInVertically(initialOffsetY = { it }),
                exit = slideOutVertically(targetOffsetY = { it * 40 })
            ) {
                if (state.currentModuleId > state.moduleUi.id) {
                    ModuleBottomAppBar(
                        modifier = Modifier.offset(y = 40.dp),
                        onContinue = {
                            if (currentUnitIndex < units.size - 1) {
                                currentUnitIndex++
                            } else {
                                onAction(ModuleAction.OnContinueClicked)
                            }
                        },
                        text = if (currentUnitIndex < units.size - 1) "Continue" else "Completed",
                        enabled = currentUnitIndex != units.size - 1,
                        onChatBotFABClick = {
                            showBottomSheet = true
                        }
                    )
                } else {
                    ModuleBottomAppBar(
                        modifier = Modifier.offset(y = 40.dp),
                        onContinue = {
                            if (currentUnitIndex < units.size - 1) {
                                currentUnitIndex++
                            } else {
                                onAction(ModuleAction.OnContinueClicked)
                            }
                        },
                        text = if (currentUnitIndex < units.size - 1) "Continue" else "Complete",
                        onChatBotFABClick = {
                            showBottomSheet = true
                        }
                    )
                }
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
    ) { innerPadding ->
        if (isAlertDialogOpen && codiDialogProps != null) {
            CodiDialog(
                onDismissRequest = {
                    isAlertDialogOpen = false
                },
                onConfirmRequest = {
                    isAlertDialogOpen = false
                    codiDialogProps?.onConfirmRequest?.invoke()
                },
                onDismiss = {
                    isAlertDialogOpen = false
                    codiDialogProps?.onDismissRequest?.invoke()
                },
                title = codiDialogProps!!.title,
                description = codiDialogProps!!.description,
                style = if (codiDialogStyle == AlertDialogType.SUCCESS) SuccessAlertDialogStyle() else ErrorAlertDialogStyle(),
                confirmTitle = codiDialogProps!!.confirmTitle,
                dismissTitle = codiDialogProps!!.dismissTitle
            )
        }

        if (showBottomSheet) {
            ChatBotSheet(
                onDismiss = { showBottomSheet = false },
                onClick = { },
                sheetState = chatBotSheetState
            )
        }

        Box(modifier = Modifier.fillMaxSize()) {
            AnimatedContent(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                targetState = currentUnit,
                transitionSpec = {
                    val targetIndex = targetState.id
                    val initialIndex = initialState.id

                    if (targetIndex > initialIndex) {
                        slideInHorizontally(
                            initialOffsetX = { it },
                            animationSpec = tween(300)
                        ) togetherWith slideOutHorizontally(
                            targetOffsetX = { -it },
                            animationSpec = tween(300)
                        )
                    } else {
                        slideInHorizontally(
                            initialOffsetX = { -it },
                            animationSpec = tween(300)
                        ) togetherWith slideOutHorizontally(
                            targetOffsetX = { it },
                            animationSpec = tween(300)
                        )
                    }
                },
                label = "AnimatedContent"
            ) { unit ->
                val elements = parser.parseHtml(unit.content)
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp)
                ) {
                    HtmlRenderer(
                        lazyState = listState,
                        elements = elements,
                    )
                }
            }

            if (state.isLoading) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }
        }


    }
}

val defaultModule = listOf(
    ModuleUi(
        id = 1,
        description = "Loading",
        courseId = 1,
        name = "Loading",
        orderIndex = 0,
        createdAt = "",
        updatedAt = "",
        units = listOf(
            UnitUi(
                id = 1,
                createdAt = "",
                updatedAt = "",
                moduleId = 1,
                name = "Loading",
                orderIndex = 0,
                content = "Loading"
            )
        )
    )
)