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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.R
import com.manikandareas.codileap.core.presentation.util.getRandomIcons
import com.manikandareas.codileap.quiz.domain.AnswerOption
import com.manikandareas.codileap.quiz.domain.Question
import com.manikandareas.codileap.quiz.domain.Quiz
import com.manikandareas.codileap.quiz.presentation.component.QuizAppBar
import com.manikandareas.codileap.quiz.presentation.component.QuizBottomAppBar
import com.manikandareas.codileap.quiz.presentation.model.toUiModel
import com.manikandareas.codileap.screening.data.dummy.interestQuestionsQuiz
import com.manikandareas.codileap.screening.presentation.component.CodiButton
import com.manikandareas.codileap.ui.compositions.CodiDialog
import com.manikandareas.codileap.ui.theme.AlertDialogType
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import com.manikandareas.codileap.ui.theme.ErrorAlertDialogStyle
import com.manikandareas.codileap.ui.theme.SuccessAlertDialogStyle
import com.manikandareas.codileap.ui.theme.WarningAlertDialogStyle

@SuppressLint("DefaultLocale")
@Composable
fun QuizSession(
    state: QuizState,
    onAction: (QuizAction) -> Unit,
    modifier: Modifier = Modifier
) {

    val selectedButtonIndex = remember { mutableIntStateOf(0) }

    val questions = state.quiz.questions

    val isAlertDialogOpen = remember { mutableStateOf(false) }
    var moduleActionType by remember { mutableStateOf(AlertDialogType.ERROR) }


    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    val currentQuestion = questions[currentQuestionIndex]
    val progress = (currentQuestionIndex + 1).toFloat() / questions.size

    // Buat LazyListState baru untuk setiap unit


    val totalTimeInSeconds = 60 * 10
    var timeLeft by remember { mutableIntStateOf(totalTimeInSeconds) }
    val minutes = timeLeft / 60
    val seconds = timeLeft % 60


    BackHandler(enabled = true) {
        if (currentQuestionIndex == 0) {
            moduleActionType = AlertDialogType.ERROR
            isAlertDialogOpen.value = true
        } else {
            currentQuestionIndex--
        }
    }

    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
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
                title = String.format("%02d:%02d", minutes, seconds),
                onClick = {
                    if (currentQuestionIndex < questions.size - 1) {
                        currentQuestionIndex++
                    } else {
                        moduleActionType = AlertDialogType.WARNING
                        isAlertDialogOpen.value = true
                    }
                }
            )
        }

    ) { innerPadding ->

        if (isAlertDialogOpen.value) {
            when (moduleActionType) {
                AlertDialogType.SUCCESS -> {
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
                        title = "Submit Quiz",
                        description = "Check your answers carefully before submitting",
                        style = SuccessAlertDialogStyle(),
                        confirmTitle = "Submit",
                    )
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
                            isAlertDialogOpen.value = false
                            onAction(QuizAction.NavigateBack)
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
            val icons = remember(unit.answerOptions.size) {
                getRandomIcons(unit.answerOptions.size) // Ambil ikon acak hanya sekali
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    unit.text,
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(32.dp))


                unit.answerOptions.forEachIndexed { index, option ->
                    CodiButton(
                        text = option.text,
                        onClick = {
selectedButtonIndex.value = index
                        },
                        icon = icons[index],
                        isSelected = selectedButtonIndex.value == index
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
            onAction = {}
        )

    }
}


val dummyQuiz = Quiz(
    id = 1,
    title = "Linux and Shell Scripting Quiz",
    description = "Test your knowledge on Linux and Shell Scripting",
    createdAt = "2021-08-01T00:00:00Z",
    updatedAt = "2021-08-01T00:00:00Z",
    courseId = 1,
    passingScore = 70,
    timeLimit = 600,
    totalQuestions = 5,
    questions = listOf(
        Question(
            id = 1,
            quizId = 1,
            text = "What is the main purpose of the lazy delegate in Kotlin?",
            pointValue = 10,
            createdAt = "2021-08-01T00:00:00Z",
            updatedAt = "2021-08-01T00:00:00Z",
            answerOptions = listOf(
                AnswerOption(
                    id = 1,
                    questionId = 1,
                    text = "To create variables that are thread-safe by default",
                    isCorrect = false
                ),
                AnswerOption(
                    id = 2,
                    questionId = 1,
                    text = "To initialize variables only when they are first accessed",
                    isCorrect = true
                ),
                AnswerOption(
                    id = 3,
                    questionId = 1,
                    text = "To optimize memory usage for large collections",
                    isCorrect = false
                ),
                AnswerOption(
                    id = 4,
                    questionId = 1,
                    text = "To allow immutable variables to be reassigned",
                    isCorrect = false
                )
            )
        ),
        Question(
            id = 2,
            quizId = 1,
            text = "What is the main purpose of the lazy delegate in Kotlin?",
            pointValue = 10,
            createdAt = "2021-08-01T00:00:00Z",
            updatedAt = "2021-08-01T00:00:00Z",
            answerOptions = listOf(
                AnswerOption(
                    id = 5,
                    questionId = 2,
                    text = "To create variables that are thread-safe by default",
                    isCorrect = false
                ),
                AnswerOption(
                    id = 6,
                    questionId = 2,
                    text = "To initialize variables only when they are first accessed",
                    isCorrect = true
                ),
                AnswerOption(
                    id = 7,
                    questionId = 2,
                    text = "To optimize memory usage for large collections",
                    isCorrect = false
                ),
                AnswerOption(
                    id = 8,
                    questionId = 2,
                    text = "To allow immutable variables to be reassigned",
                    isCorrect = false
                )
            )
        )

    )
)