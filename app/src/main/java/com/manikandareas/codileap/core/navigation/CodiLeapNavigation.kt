@file:OptIn(ExperimentalSharedTransitionApi::class)

package com.manikandareas.codileap.core.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import co.yml.charts.common.extensions.isNotNull
import com.manikandareas.codileap.analytics.presentation.AnalyticsAction
import com.manikandareas.codileap.analytics.presentation.AnalyticsScreen
import com.manikandareas.codileap.auth.presentation.AuthScreen
import com.manikandareas.codileap.auth.presentation.AuthViewModel
import com.manikandareas.codileap.auth.presentation.auth_register.AuthRegisterScreen
import com.manikandareas.codileap.auth.presentation.auth_register.AuthRegisterViewModel
import com.manikandareas.codileap.auth.presentation.auth_signIn.AuthSignInScreen
import com.manikandareas.codileap.auth.presentation.auth_signIn.AuthSignInViewModel
import com.manikandareas.codileap.chatbot.presentation.VirtualAssistantScreen
import com.manikandareas.codileap.core.presentation.util.ObserveAsEvents
import com.manikandareas.codileap.core.presentation.util.nullableParcelType
import com.manikandareas.codileap.core.presentation.util.parcelableType
import com.manikandareas.codileap.courses.domain.LearningPath
import com.manikandareas.codileap.courses.presentation.CoursesScreen
import com.manikandareas.codileap.courses.presentation.CoursesViewModel
import com.manikandareas.codileap.courses.presentation.model.ModuleUi
import com.manikandareas.codileap.courses.presentation.module.ModuleSession
import com.manikandareas.codileap.courses.presentation.module.ModuleViewModel
import com.manikandareas.codileap.home.presentation.HomeAction
import com.manikandareas.codileap.home.presentation.HomeScreen
import com.manikandareas.codileap.home.presentation.HomeViewModel
import com.manikandareas.codileap.home.presentation.model.toUiModel
import com.manikandareas.codileap.intro.presentation.IntroScreen
import com.manikandareas.codileap.quiz.presentation.QuizSession
import com.manikandareas.codileap.quiz.presentation.QuizViewModel
import com.manikandareas.codileap.screening.presentation.ScreeningScreen
import com.manikandareas.codileap.screening.presentation.ScreeningState
import com.manikandareas.codileap.screening.presentation.ScreeningViewModel
import com.manikandareas.codileap.screening.presentation.screening_result.ScreeningResultScreen
import com.manikandareas.codileap.screening.presentation.screening_result.ScreeningResultViewModel
import com.manikandareas.codileap.settings.presentation.AppearanceScreen
import com.manikandareas.codileap.settings.presentation.AppearanceViewModel
import com.manikandareas.codileap.settings.presentation.FAQsScreen
import com.manikandareas.codileap.settings.presentation.SettingsScreen
import com.manikandareas.codileap.settings.presentation.SettingsState
import com.manikandareas.codileap.settings.presentation.SettingsViewModel
import com.manikandareas.codileap.user.domain.User
import com.manikandareas.codileap.user.presentation.UserProfileScreen
import com.manikandareas.codileap.user.presentation.UserProfileState
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf
import kotlin.reflect.typeOf


@Composable
fun CodiLeapNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: Destination,
    navigator: Navigator,
    currentUser: User? = null,
    snackbarHostState: SnackbarHostState
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
            navController = navController, startDestination = startDestination
        ) {
            navigation<Destination.IntroGraph>(
                startDestination = Destination.IntroScreen
            ) {
                composable<Destination.IntroScreen> {
                    IntroScreen(onFinished = {
                        navController.navigate(Destination.AuthGraph) {
                            popUpTo(Destination.AuthGraph) { inclusive = true }
                        }
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
                    AuthRegisterScreen(
                        state = viewModel.state,
                        events = viewModel.events,
                        onAction = viewModel::onAction
                    )
                }
                composable<Destination.LoginScreen> {
                    val viewModel = koinViewModel<AuthSignInViewModel>()
                    AuthSignInScreen(
                        state = viewModel.state,
                        events = viewModel.events,
                        onAction = viewModel::onAction
                    )
                }
            }

            navigation<Destination.ScreeningGraph>(
                startDestination = Destination.ScreeningScreen
            ) {
                composable<Destination.ScreeningScreen> {
                    val viewModel = koinViewModel<ScreeningViewModel>()
                    ScreeningScreen(onAction = viewModel::onAction, state = viewModel.state)
                }

                composable<Destination.ScreeningResultScreen>(
                    typeMap = mapOf(typeOf<LearningPath>() to parcelableType<LearningPath>())
                ) {
                    val arg = it.toRoute<Destination.ScreeningResultScreen>()

                    val viewModel: ScreeningResultViewModel =
                        koinViewModel { parametersOf(arg.data) }
                    val state by viewModel.state.collectAsStateWithLifecycle()
                    ScreeningResultScreen(
                        onAction = viewModel::onAction,
                        state = state.copy(
                            screeningResult = arg.data,
                        ),
                        events = viewModel.events
                    )
                }
            }


            navigation<Destination.HomeGraph>(
                startDestination = Destination.HomeScreen
            ) {
                composable<Destination.HomeScreen> {
//                    val state = HomeState(user = currentUser?.toUiModel())

                    val viewModel = koinViewModel<HomeViewModel>()
                    val state = viewModel.state.collectAsStateWithLifecycle().value

                    HomeScreen(
                        state = state.copy(
                            user = currentUser?.toUiModel()
                        ), onAction = {
                            when (it) {
                                is HomeAction.NavigateTo -> navController.navigate(it.des) {
                                    popUpTo(it.des) { inclusive = true }
                                }

                                is HomeAction.OnCarouselItemClicked -> {
                                    navController.navigate(Destination.CoursesScreen(it.learningPathId))
                                }
                            }
                        })
                }

                composable<Destination.CoursesScreen>(
                ) {
//                    val arg = it.toRoute<Destination.CoursesScreen>()
//
//                    val viewModel = koinViewModel<CoursesViewModel>()
//
//                    val state by viewModel.state.collectAsStateWithLifecycle()
//
//                    CoursesScreen(state = if (arg.selectedLearningPathId != null) {
//                        val selectedLearningPath =
//                            state.learningPaths.find { it.id == arg.selectedLearningPathId }
//                                ?: state.selectedLearningPath
//
//                        val courses = selectedLearningPath?.courses ?: emptyList()
//                        state.copy(
//                            selectedLearningPath = selectedLearningPath,
//                            selectedCourse = selectedLearningPath?.courses?.first(),
//                            courses = courses,
//                            learningPaths = state.learningPaths,
//                        )
//                    } else {
//                        state
//                    }, onAction = viewModel::onAction)

                    val arg = it.toRoute<Destination.CoursesScreen>()

                    val viewModel: CoursesViewModel = if (arg.isNotNull()) {
                        koinViewModel {
                            parametersOf(arg.selectedLearningPathId)
                        }
                    } else koinViewModel()

                    val state by viewModel.state.collectAsStateWithLifecycle()

                    CoursesScreen(
                        state = state,
                        onAction = viewModel::onAction,
                    )
                }

                composable<Destination.ModuleScreen>(
                    typeMap = mapOf(typeOf<ModuleUi>() to parcelableType<ModuleUi>())
                ) {
                    val arg = it.toRoute<Destination.ModuleScreen>()

                    val viewModel: ModuleViewModel =
                        koinViewModel { parametersOf(arg.moduleUi) }

                    val state by viewModel.state.collectAsStateWithLifecycle()

                    ModuleSession(
                        state = state,
                        onAction = viewModel::onAction,
                        events = viewModel.events
                    )
                }



                composable<Destination.AnalyticsScreen> {
                    AnalyticsScreen(onAction = {
                        when (it) {
                            is AnalyticsAction.NavigateTo -> navController.navigate(it.des) {
                                popUpTo(it.des) { inclusive = true }
                            }
                        }
                    })
                }

                composable<Destination.ChatBotScreen> {
                    VirtualAssistantScreen()
                }

                composable<Destination.QuizScreen>(
                    typeMap = mapOf(
                        typeOf<ScreeningState?>() to nullableParcelType<ScreeningState>()
                    )
                ) {
                    // Gunakan default value jika null
                    val arg = it.toRoute<Destination.QuizScreen>()
                    val screeningState = arg.screeningState ?: ScreeningState()

                    val viewModel: QuizViewModel = koinViewModel {
                        parametersOf(
                            snackbarHostState,
                            arg.isScreening ?: false,
                            screeningState
                        )
                    }

                    val state by viewModel.state.collectAsStateWithLifecycle()

                    QuizSession(
                        state = state,
                        onAction = viewModel::onAction,
                        snackbarHostState = snackbarHostState,
                        events = viewModel.events
                    )
                }

            }

            navigation<Destination.SettingsGraph>(
                startDestination = Destination.SettingsScreen
            ) {
                composable<Destination.SettingsScreen> {
                    val viewModel = koinViewModel<SettingsViewModel>()
                    SettingsScreen(
                        onAction = viewModel::onAction, state = SettingsState(
                            currentUser
                        )
                    )
                }

                composable<Destination.ProfileScreen> {
                    UserProfileScreen(
                        state = UserProfileState(
                            user = currentUser?.toUiModel(),
                            isLoading = false
                        ),
                        onBack = {
                            navController.navigateUp()
                        }
                    )
                }

                composable<Destination.AppearanceScreen> {
                    val viewModel = koinViewModel<AppearanceViewModel>()

                    val state by viewModel.state.collectAsStateWithLifecycle()
                    AppearanceScreen(
                        onAction = viewModel::onAction,
                        state = state
                    )
                }

                composable<Destination.FAQsScreen> {
                    FAQsScreen(
                        onBack = {
                            navController.navigateUp()
                        }
                    )
                }
            }
        }
    }
}

