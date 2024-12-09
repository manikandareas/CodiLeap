@file:OptIn(ExperimentalAnimationApi::class)

package com.manikandareas.codileap.quiz.presentation

import android.annotation.SuppressLint
import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.core.presentation.util.ObserveAsEvents
import com.manikandareas.codileap.core.presentation.util.getRandomIcons
import com.manikandareas.codileap.quiz.data.networking.dto.SubmitQuizResponseDto
import com.manikandareas.codileap.quiz.presentation.component.QuizAppBar
import com.manikandareas.codileap.quiz.presentation.component.QuizBottomAppBar
import com.manikandareas.codileap.quiz.presentation.model.AnswerUi
import com.manikandareas.codileap.quiz.presentation.model.toUiModel
import com.manikandareas.codileap.screening.data.dummy.interestQuestionsQuiz
import com.manikandareas.codileap.screening.presentation.component.CodiButton
import com.manikandareas.codileap.ui.compositions.CodiDialog
import com.manikandareas.codileap.ui.theme.AlertDialogType
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import com.manikandareas.codileap.ui.theme.ErrorAlertDialogStyle
import com.manikandareas.codileap.ui.theme.SuccessAlertDialogStyle
import com.manikandareas.codileap.ui.theme.WarningAlertDialogStyle
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlin.math.roundToInt

@SuppressLint("DefaultLocale")
@Composable
fun QuizSession(
    state: QuizState,
    onAction: (QuizAction) -> Unit,
    modifier: Modifier = Modifier,
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() },
    events: Flow<QuizEvent>
) {

    val questions = state.quiz?.questions ?: return


    val isAlertDialogOpen = remember { mutableStateOf(false) }
    var moduleActionType by remember { mutableStateOf(AlertDialogType.ERROR) }

    var resultQuiz by remember { mutableStateOf<SubmitQuizResponseDto?>(null) }


    var currentQuestionIndex by rememberSaveable {
        mutableIntStateOf(0.coerceIn(0, questions.size - 1))
    }
    val currentQuestion = questions.getOrNull(currentQuestionIndex) ?: return

    val progress = (currentQuestionIndex + 1).toFloat() / questions.size

    // Buat LazyListState baru untuk setiap unit


    val totalTimeInSeconds = state.quiz.timeLimit * 60
    var timeLeft by remember { mutableIntStateOf(totalTimeInSeconds) }

    // Menghitung menit dan detik
    val minutes = timeLeft / 60
    val seconds = timeLeft % 60

    // Mengatur countdown timer
    LaunchedEffect(timeLeft) {
        if (timeLeft > 0) {
            delay(1000L) // Delay 1 detik
            timeLeft -= 1 // Kurangi waktu setiap detik
        }

        if (timeLeft == 0) {
            onAction(QuizAction.OnTimerFinished)
        }
    }



    BackHandler(enabled = true) {
        if (currentQuestionIndex == 0) {
            moduleActionType = AlertDialogType.ERROR
            isAlertDialogOpen.value = true
        } else {
            currentQuestionIndex--
        }
    }

    ObserveAsEvents(events) { event ->
        when (event) {
            is QuizEvent.Error -> TODO()
            is QuizEvent.InvalidAnswer -> {
                isAlertDialogOpen.value = false
            }

            is QuizEvent.Success -> {
                resultQuiz = event.result
                moduleActionType = AlertDialogType.SUCCESS
                isAlertDialogOpen.value = true
            }
        }
    }

    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        snackbarHost = {
            SnackbarHost(snackbarHostState)
        },
        topBar = {
            QuizAppBar(
                quizProgress = progress,
                onBack = {
                    if (currentQuestionIndex > 0) {
                        currentQuestionIndex--
                    }
                },
                enabled = currentQuestionIndex > 0,
                onExit = {
                    moduleActionType = AlertDialogType.ERROR
                    isAlertDialogOpen.value = true
                }
            )
        },
        bottomBar = {
            QuizBottomAppBar(
                timerTitle = String.format("%02d:%02d", minutes, seconds),
                title = if (currentQuestionIndex < questions.size - 1) "Next" else "Submit",
                onClick = {
                    if (currentQuestionIndex < questions.size - 1) {
                        currentQuestionIndex++
                    } else {
                        moduleActionType = AlertDialogType.WARNING
                        isAlertDialogOpen.value = true
                    }
                },
            )
        },


        ) { innerPadding ->

        if (isAlertDialogOpen.value) {
            when (moduleActionType) {
                AlertDialogType.SUCCESS -> {
                    if (resultQuiz != null) {
                        val maxPoints = 17
                        val pointInPercent =
                            (resultQuiz?.totalScore?.toDouble()?.div(maxPoints))?.times(
                                100
                            )?.roundToInt()
                        if (resultQuiz?.status == "completed") {
                            CodiDialog(
                                onDismissRequest = {
                                    isAlertDialogOpen.value = false
                                    onAction(QuizAction.NavigateBack)
                                },
                                onDismiss = {
                                    isAlertDialogOpen.value = false
                                },
                                onConfirmRequest = {
                                    isAlertDialogOpen.value = false
                                    onAction(QuizAction.NavigateBack)
                                },
                                title = "You have completed the quiz",
                                description = "Your score is $pointInPercent out of 100",
                                style = SuccessAlertDialogStyle(),
                                confirmTitle = "Continue",
                                isHideDismissButton = true,
                            )
                        } else if (resultQuiz?.status == "failed") {
                            CodiDialog(
                                onDismissRequest = {
                                    isAlertDialogOpen.value = false
                                    onAction(QuizAction.NavigateBack)
                                },
                                onDismiss = {
                                    isAlertDialogOpen.value = false
                                },
                                onConfirmRequest = {
                                    isAlertDialogOpen.value = false
                                    onAction(QuizAction.NavigateBack)
                                },
                                title = "You have failed the quiz",
                                description = "Your score is $pointInPercent out of 100",
                                style = ErrorAlertDialogStyle(),
                                confirmTitle = "Continue",
                                isHideDismissButton = true,
                            )
                        }
                    }
                }

                AlertDialogType.ERROR -> {
                    CodiDialog(
                        onDismissRequest = {
                            isAlertDialogOpen.value = false
                        },
                        onConfirmRequest = {
                            isAlertDialogOpen.value = false
                            onAction(QuizAction.NavigateBack)
                        },
                        dismissTitle = "Cancel",
                        confirmTitle = "Yes, Exit",
                        title = "Are you sure!",
                        description = "If you exit now, your progress will not be saved",
                        style = ErrorAlertDialogStyle()
                    )
                }

                AlertDialogType.WARNING -> {
                    CodiDialog(
                        onDismissRequest = {
                            isAlertDialogOpen.value = false
                            onAction(QuizAction.NavigateBack)
                        },
                        onDismiss = {
                            isAlertDialogOpen.value = false
                        },
                        onConfirmRequest = {
                            onAction(QuizAction.OnSubmitClick)
                        },
                        title = "Submit Quiz",
                        description = "Check your answers carefully before submitting",
                        style = WarningAlertDialogStyle(),
                        confirmTitle = "Continue",
                    )
                }
            }
        }

        AnimatedContent(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),  // Pindahkan padding ke sini
            targetState = currentQuestion,
            transitionSpec = {

                val targetIndex = state.quiz.questions.indexOfFirst { it.id == targetState.id }
                val initialIndex = state.quiz.questions.indexOfFirst { it.id == initialState.id }

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
        ) { question ->
            val icons = remember(question.answerOptions.size) {
                getRandomIcons(question.answerOptions.size) // Ambil ikon acak hanya sekali
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    question.text,
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(32.dp))


                question.answerOptions.forEachIndexed { index, option ->
                    val isSelected = state.userAnswers
                        ?.firstOrNull { it.questionId == question.id } // Cari jawaban untuk question.id
                        ?.let { it.answerOptionId == option.id } == true // Jika tidak ditemukan, default ke false
                    CodiButton(
                        text = option.text,
                        onClick = {
                            onAction(QuizAction.OnAnswerSelected(AnswerUi(question.id, option.id)))
                        },
                        icon = icons[index],
                        isSelected = isSelected
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                }


            }
        }
    }
}

@PreviewLightDark
@Composable
private fun ModuleScreenPreview() {
    CodiLeapTheme {
        QuizSession(
            state = QuizState(
                isLoading = false,
                quiz = interestQuestionsQuiz.toUiModel()
            ),
            onAction = {},
            events = emptyFlow()
        )

    }
}

