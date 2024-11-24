@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.courses.presentation

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ImportExport
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.courses.data.dummy.createCoursesForLearningPath
import com.manikandareas.codileap.courses.data.dummy.createModulesForCourse
import com.manikandareas.codileap.courses.data.dummy.learningPathsDummy
import com.manikandareas.codileap.courses.presentation.component.BottomSheetOptions
import com.manikandareas.codileap.courses.presentation.component.CoursesAppBar
import com.manikandareas.codileap.courses.presentation.component.ModuleItem
import com.manikandareas.codileap.courses.presentation.component.ModuleNode
import com.manikandareas.codileap.courses.presentation.component.Options
import com.manikandareas.codileap.courses.presentation.defaults.CircleParametersDefaults
import com.manikandareas.codileap.courses.presentation.defaults.LineParametersDefaults
import com.manikandareas.codileap.courses.presentation.model.ModuleNodePosition
import com.manikandareas.codileap.courses.presentation.model.toUiModel
import com.manikandareas.codileap.home.presentation.component.HomeBottomAppBar
import com.manikandareas.codileap.home.presentation.component.HomeChatBotFab
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import kotlin.math.roundToInt

@Composable
fun CoursesScreen(
    state: CoursesState,
    onAction: (CoursesAction) -> Unit,
    modifier: Modifier = Modifier
) {
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

    // Animate bottom bar translation
    val bottomBarOffsetHeightPx = with(LocalDensity.current) { 80.dp.toPx() }
    val bottomBarTranslation by animateFloatAsState(
        targetValue = if (isBottomBarVisible) 0f else bottomBarOffsetHeightPx,
        label = "bottomBarTranslation"
    )

    // module sheet
    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true
    )
    var showBottomSheet by remember { mutableStateOf(false) }
    var clickedOptionsType by remember { mutableStateOf(Options.LEARNING) }

    Scaffold(
        topBar = {
            CoursesAppBar(onClick = {
                showBottomSheet = true
                clickedOptionsType = Options.LEARNING
            }, modifier = Modifier.fillMaxWidth())
        },
        bottomBar = {
            HomeBottomAppBar(
                currentRoute = Destination.CoursesScreen,
                onNavigate = { des ->
                    onAction(CoursesAction.NavigateTo(des))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = bottomBarTranslation.roundToInt().dp)
            )
        },
        floatingActionButton = {
            HomeChatBotFab()
        },
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) { innerPadding ->
        if (showBottomSheet) {
            when (clickedOptionsType) {
                Options.COURSE -> {
                    BottomSheetOptions(
                        onDismiss = {
                            showBottomSheet = false
                        },
                        sheetState = sheetState,
                        items = state.courses,
                        title = state.selectedCourse?.name ?: "Select Learning Path",
                        onItemClick = {},
                        type = Options.COURSE,
                    )
                }

                Options.LEARNING -> {
                    BottomSheetOptions(
                        onDismiss = {
                            showBottomSheet = false
                        },
                        sheetState = sheetState,
                        items = state.learningPaths,
                        title = state.selectedLearningPath?.name ?: "Select Learning Path",
                        onItemClick = {},
                        type = Options.LEARNING,
                    )
                }
            }
        }
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            item {
                Button(
                    onClick = {
                        showBottomSheet = true
                        clickedOptionsType = Options.COURSE
                    },
                    modifier = Modifier.fillMaxWidth(),
                    contentPadding = PaddingValues(vertical = 12.dp, horizontal = 16.dp),
                    shape = MaterialTheme.shapes.medium,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.surfaceContainer,
                        contentColor = MaterialTheme.colorScheme.onSurface
                    )
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Introduction to Machine Learning",
                            style = MaterialTheme.typography.titleMedium,

                            )
//                        Icon(
//
//                            imageVector = Icons.Default.ClearAll,
//                            contentDescription = "Select Module"
//                        )
                        Icon(
                            imageVector = Icons.Default.ImportExport,
                            contentDescription = "Select Modules",
                        )
                    }
                }
                Spacer(modifier = Modifier.height(32.dp))
            }
            items(
                items = createModulesForCourse(
                    learningPath = state.selectedLearningPath?.name ?: "",
                    moduleName = state.selectedCourse?.name ?: ""
                ).map { it.toUiModel() },

                key = { item -> item.id }
            ) { item ->
                // Calculate position dynamically based on index
                val position = when (item) {
                    state.courses.first() -> ModuleNodePosition.FIRST
                    state.courses.last() -> ModuleNodePosition.LAST
                    else -> ModuleNodePosition.MIDDLE
                }

                // Line parameters change based on position
                val lineParameters = when (position) {
                    ModuleNodePosition.LAST -> null
                    ModuleNodePosition.FIRST -> LineParametersDefaults.linearGradient(
                        startColor = Color(0xFF00FF9C).copy(alpha = 0.2F),
                        endColor = Color(0xFF049C61).copy(alpha = 0.2F)
                    )

                    ModuleNodePosition.MIDDLE -> LineParametersDefaults.linearGradient(
                        startColor = Color(0xFF049C61).copy(alpha = 0.2F),
                        endColor = Color(0xFF00FF9C).copy(alpha = 0.2F)
                    )
                }

                // Circle radius changes based on position
                val circleColor = when (position) {
                    ModuleNodePosition.FIRST -> Color(0xFF00FF9C)
                    else -> Color(0xFF00FF9C).copy(alpha = 0.3F)
                }

                ModuleNode(
                    position = position,
                    circleParameters = CircleParametersDefaults.circleParameters(
                        backgroundColor = circleColor,
                        radius = 12.dp
                    ),
                    lineParameters = lineParameters
                ) { modifier ->
                    ModuleItem(
                        modifier = modifier,
                        module = item,
                        onClick = {
                            println("Clicked on module: ${item.name}")
                            onAction(CoursesAction.OnModuleClicked(item))
                        }
                    )
                }
            }
        }
    }
}


@PreviewLightDark
@Composable
fun PreviewCoursesScreen(modifier: Modifier = Modifier) {
    val selectedLearningPath = learningPathsDummy.first().toUiModel()
    val selectedModule = createCoursesForLearningPath(
        learningPathId = selectedLearningPath.id,
        pathName = selectedLearningPath.name
    ).first().toUiModel()
    val state = CoursesState(
        isLoading = false,
        selectedLearningPath = selectedLearningPath,
        learningPaths = learningPathsDummy.map { it.toUiModel() },
        selectedCourse = selectedModule,
        courses = createCoursesForLearningPath(
            learningPathId = selectedLearningPath.id,
            pathName = selectedLearningPath.name
        ).map { it.toUiModel() }
    )
    CodiLeapTheme {
        CoursesScreen(modifier = modifier, state = state, onAction = {})
    }
}