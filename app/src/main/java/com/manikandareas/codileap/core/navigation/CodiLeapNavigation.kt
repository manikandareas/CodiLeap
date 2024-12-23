@file:OptIn(ExperimentalSharedTransitionApi::class)

package com.manikandareas.codileap.core.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
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
import com.manikandareas.codileap.chatbot.presentation.ChatBotScreen
import com.manikandareas.codileap.core.presentation.util.ObserveAsEvents
import com.manikandareas.codileap.core.presentation.util.parcelableType
import com.manikandareas.codileap.courses.presentation.CoursesAction
import com.manikandareas.codileap.courses.presentation.CoursesScreen
import com.manikandareas.codileap.courses.presentation.CoursesViewModel
import com.manikandareas.codileap.courses.presentation.model.ModuleUi
import com.manikandareas.codileap.courses.presentation.module.ModuleAction
import com.manikandareas.codileap.courses.presentation.module.ModuleSession
import com.manikandareas.codileap.courses.presentation.module.ModuleState
import com.manikandareas.codileap.courses.presentation.module.ModuleViewModel
import com.manikandareas.codileap.home.presentation.HomeAction
import com.manikandareas.codileap.home.presentation.HomeScreen
import com.manikandareas.codileap.home.presentation.HomeState
import com.manikandareas.codileap.home.presentation.model.toUiModel
import com.manikandareas.codileap.intro.presentation.IntroScreen
import com.manikandareas.codileap.quiz.presentation.QuizAction
import com.manikandareas.codileap.quiz.presentation.QuizSession
import com.manikandareas.codileap.quiz.presentation.QuizState
import com.manikandareas.codileap.quiz.presentation.model.toUiModel
import com.manikandareas.codileap.screening.data.dummy.interestQuestionsQuiz
import com.manikandareas.codileap.screening.presentation.ScreeningAction
import com.manikandareas.codileap.screening.presentation.ScreeningScreen
import com.manikandareas.codileap.settings.presentation.FAQsScreen
import com.manikandareas.codileap.settings.presentation.SettingsScreen
import com.manikandareas.codileap.settings.presentation.SettingsViewModel
import com.manikandareas.codileap.user.domain.User
import com.manikandareas.codileap.user.presentation.UserProfileScreen
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf
import kotlin.reflect.typeOf


@Composable
fun CodiLeapNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: Destination,
    navigator: Navigator,
    currentUser: User? = null
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
                    ScreeningScreen(onAction = {
                        when (it) {
                            is ScreeningAction.NavigateTo -> navController.navigate(it.des) {
                                popUpTo(it.des) { inclusive = true }
                            }
                        }
                    })
                }
            }


            navigation<Destination.HomeGraph>(
                startDestination = Destination.HomeScreen
            ) {
                composable<Destination.HomeScreen> {
                    val state = HomeState(user = currentUser?.toUiModel())

                    HomeScreen(
                        state = state, onAction = {
                            when (it) {
                                is HomeAction.NavigateTo -> navController.navigate(it.des) {
                                    popUpTo(it.des) { inclusive = true }
                                }
                            }
                        })
                }

                composable<Destination.CoursesScreen> {
                    val viewModel = koinViewModel<CoursesViewModel>()

                    val state by viewModel.state.collectAsStateWithLifecycle()

                    CoursesScreen(state = state, onAction = viewModel::onAction)
                }

                composable<Destination.ModuleScreen>(
                    typeMap = mapOf(typeOf<ModuleUi>() to parcelableType<ModuleUi>())
                ) {
                    val arg = it.toRoute<Destination.ModuleScreen>()

                    val viewModel: ModuleViewModel =
                        koinViewModel { parametersOf(arg.moduleUi) }

                    val state by viewModel.state.collectAsStateWithLifecycle()

                    ModuleSession(state = state, onAction = viewModel::onAction, events = viewModel.events)
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
                    ChatBotScreen()
                }

            }

            navigation<Destination.QuizGraph>(
                startDestination = Destination.QuizScreen
            ) {
                composable<Destination.QuizScreen> {
                    QuizSession(
                        state = QuizState(
                            quiz = interestQuestionsQuiz.toUiModel(),
                            isLoading = false
                        ),
                        onAction = {
                            when (it) {

                                QuizAction.NavigateBack -> {
                                    navController.navigateUp()
                                }

                                QuizAction.OnSubmitClick -> {
                                    navController.navigateUp()
                                }
                            }
                        }
                    )
                }
            }


            navigation<Destination.SettingsGraph>(
                startDestination = Destination.SettingsScreen
            ) {
                composable<Destination.SettingsScreen> {
                    val viewModel = koinViewModel<SettingsViewModel>()
                    SettingsScreen(onAction = viewModel::onAction)
                }

                composable<Destination.ProfileScreen> {
                    UserProfileScreen(
                        onBack = {
                            navController.navigateUp()
                        }
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

