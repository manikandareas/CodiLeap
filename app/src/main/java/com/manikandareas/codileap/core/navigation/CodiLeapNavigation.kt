@file:OptIn(ExperimentalSharedTransitionApi::class)

package com.manikandareas.codileap.core.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import com.manikandareas.codileap.analytics.presentation.AnalyticsAction
import com.manikandareas.codileap.analytics.presentation.AnalyticsScreen
import com.manikandareas.codileap.auth.presentation.AuthScreen
import com.manikandareas.codileap.auth.presentation.AuthViewModel
import com.manikandareas.codileap.auth.presentation.auth_register.AuthRegisterScreen
import com.manikandareas.codileap.auth.presentation.auth_register.AuthRegisterViewModel
import com.manikandareas.codileap.auth.presentation.auth_signIn.AuthSignInScreen
import com.manikandareas.codileap.auth.presentation.auth_signIn.AuthSignInViewModel
import com.manikandareas.codileap.core.presentation.util.ObserveAsEvents
import com.manikandareas.codileap.core.presentation.util.parcelableType
import com.manikandareas.codileap.courses.data.dummy.createCoursesForLearningPath
import com.manikandareas.codileap.courses.data.dummy.learningPathsDummy
import com.manikandareas.codileap.courses.presentation.CoursesAction
import com.manikandareas.codileap.courses.presentation.CoursesScreen
import com.manikandareas.codileap.courses.presentation.CoursesState
import com.manikandareas.codileap.courses.presentation.ModuleSession
import com.manikandareas.codileap.courses.presentation.ModuleState
import com.manikandareas.codileap.courses.presentation.model.ModuleUi
import com.manikandareas.codileap.courses.presentation.model.toUiModel
import com.manikandareas.codileap.home.presentation.HomeAction
import com.manikandareas.codileap.home.presentation.HomeScreen
import com.manikandareas.codileap.intro.presentation.IntroScreen
import com.manikandareas.codileap.screening.presentation.ScreeningAction
import com.manikandareas.codileap.screening.presentation.ScreeningScreen
import com.manikandareas.codileap.settings.presentation.SettingsAction
import com.manikandareas.codileap.settings.presentation.SettingsScreen
import org.koin.androidx.compose.koinViewModel
import kotlin.reflect.typeOf


@Composable
fun CodiLeapNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: Destination,
    navigator: Navigator,
) {

    ObserveAsEvents(events = navigator.navigationActions) { action ->
        when (action) {
            is NavigationAction.Navigate -> navController.navigate(
                action.destination
            ) {
                action.navOptions(this)
            }

            NavigationAction.NavigateUp -> navController.navigateUp()
        }
    }
    SharedTransitionLayout {
        NavHost(
            navController = navController,
            startDestination = startDestination
        ) {
            navigation<Destination.IntroGraph>(
                startDestination = Destination.IntroScreen
            ) {
                composable<Destination.IntroScreen> {
                    IntroScreen(onFinished = {
                        navController.navigate(Destination.AuthGraph)
                    })
                }
            }

            navigation<Destination.AuthGraph>(
                startDestination = Destination.AuthScreen
            ) {

                composable<Destination.AuthScreen> {
                    val viewModel = koinViewModel<AuthViewModel>()
                    AuthScreen(onAction = viewModel::onAction)
                }
                composable<Destination.RegisterScreen> {
                    val viewModel = koinViewModel<AuthRegisterViewModel>()
                    AuthRegisterScreen(onAction = viewModel::onAction)
                }
                composable<Destination.LoginScreen> {
                    val viewModel = koinViewModel<AuthSignInViewModel>()
                    AuthSignInScreen(onAction = viewModel::onAction)
                }
            }

            navigation<Destination.ScreeningGraph>(
                startDestination = Destination.ScreeningScreen
            ) {
                composable<Destination.ScreeningScreen> {
                    ScreeningScreen(
                        onAction = {
                            when (it) {
                                is ScreeningAction.NavigateTo -> navController.navigate(it.des)
                            }
                        }
                    )
                }
            }


            navigation<Destination.HomeGraph>(
                startDestination = Destination.HomeScreen
            ) {
                composable<Destination.HomeScreen> {
                    HomeScreen(onAction = {
                        when (it) {
                            is HomeAction.NavigateTo -> navController.navigate(it.des)
                        }
                    })
                }

                composable<Destination.CoursesScreen> {
                    val selectedLearningPath = learningPathsDummy[2].toUiModel()
                    val selectedCourse = createCoursesForLearningPath(
                        learningPathId = selectedLearningPath.id,
                        pathName = selectedLearningPath.name
                    ).first().toUiModel()
                    val state = CoursesState(
                        isLoading = false,
                        selectedLearningPath = selectedLearningPath,
                        learningPaths = learningPathsDummy.map { it.toUiModel() },
                        selectedCourse = selectedCourse,
                        courses = createCoursesForLearningPath(
                            learningPathId = selectedLearningPath.id,
                            pathName = selectedLearningPath.name
                        ).map { it.toUiModel() }
                    )
                    CoursesScreen(
                        state = state,
                        onAction = {
                            when (it) {
                                is CoursesAction.NavigateTo -> navController.navigate(it.des)
                                is CoursesAction.OnModuleClicked -> {
                                    navController.navigate(Destination.ModuleScreen(it.module))
                                }
                            }
                        })
                }

                composable<Destination.ModuleScreen>(
                    typeMap = mapOf(typeOf<ModuleUi>() to parcelableType<ModuleUi>())
                ) {
                    val arg = it.toRoute<Destination.ModuleScreen>()
                    val state = ModuleState(
                        isLoading = false,
                        moduleUi = arg.moduleUi
                    )
                    ModuleSession(state = state)
                }

                composable<Destination.AnalyticsScreen> {
                    AnalyticsScreen(onAction = {
                        when (it) {
                            is AnalyticsAction.NavigateTo -> navController.navigate(it.des)
                        }
                    })
                }
                composable<Destination.SettingsScreen> {
                    SettingsScreen(onAction = {
                        when (it) {
                            is SettingsAction.NavigateTo -> navController.navigate(it.des)
                        }
                    })
                }
            }


        }
    }
}

