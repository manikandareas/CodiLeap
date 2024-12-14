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
import com.manikandareas.codileap.core.presentation.util.getRandomIcons
import com.manikandareas.codileap.quiz.data.networking.dto.SubmitQuizResponseDto
import com.manikandareas.codileap.quiz.presentation.model.AnswerUi
import com.manikandareas.codileap.quiz.presentation.model.QuizUi
import com.manikandareas.codileap.quiz.presentation.model.toUiModel
import com.manikandareas.codileap.screening.data.dummy.interestQuestionsQuiz
import com.manikandareas.codileap.screening.presentation.component.CodiButton
import com.manikandareas.codileap.ui.theme.AlertDialogType
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import kotlinx.coroutines.delay


data class ScreeningInterestQuizState(
    val quiz: QuizUi? = null,
    val state: ScreeningState,
)

@SuppressLint("DefaultLocale")
@Composable
fun ScreeningInterestQuiz(
    state: ScreeningInterestQuizState,
    modifier: Modifier = Modifier,
    onAction: (ScreeningAction) -> Unit,
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


    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
    ) { innerPadding ->


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
                    .padding(innerPadding),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    question.text,
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(32.dp))

                val shuffledOptions = question.answerOptions.shuffled()


                shuffledOptions.forEachIndexed { index, option ->
                    val isSelected = state.state.interestQuizAnswer
                        ?.firstOrNull { it.questionId == question.id } // Cari jawaban untuk question.id
                        ?.let { it.answerOptionId == option.id } == true // Jika tidak ditemukan, default ke false
                    CodiButton(
                        text = option.text,
                        onClick = {
                            onAction(
                                ScreeningAction.OnScreeningInterestSelected(
                                    AnswerUi(
                                        question.id,
                                        option.id
                                    )
                                )
                            )
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
        ScreeningInterestQuiz(
            state = ScreeningInterestQuizState(
                quiz = interestQuestionsQuiz.toUiModel(),
                state = ScreeningState()
            ),
            onAction = {}
        )

    }
}

