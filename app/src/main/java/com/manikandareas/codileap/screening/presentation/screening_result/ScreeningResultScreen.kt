package com.manikandareas.codileap.screening.presentation.screening_result

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.R
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.presentation.util.ObserveAsEvents
import com.manikandareas.codileap.core.presentation.util.toString
import com.manikandareas.codileap.courses.domain.LearningPath
import com.manikandareas.codileap.quiz.presentation.QuizAction
import com.manikandareas.codileap.ui.compositions.CodiButton
import com.manikandareas.codileap.ui.compositions.CodiDialog
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import com.manikandareas.codileap.ui.theme.SuccessAlertDialogStyle
import kotlinx.coroutines.flow.Flow

@Composable
fun ScreeningResultScreen(
    modifier: Modifier = Modifier,
    state: ScreeningResultState,
    onAction: (ScreeningResultAction) -> Unit,
    events: Flow<ScreeningResultEvent>
) {
    if (state.screeningResult == null) {
        return
    }

    val isAlertDialogOpen = remember { mutableStateOf(false) }

    val context = LocalContext.current

    LaunchedEffect(state.screeningResult) {
        onAction(ScreeningResultAction.OnLearningPathSelected(state.screeningResult))
    }

    ObserveAsEvents(events) { event ->
        when (event) {
            is ScreeningResultEvent.Error -> {
                Toast.makeText(
                    context,
                    event.error.toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }

            is ScreeningResultEvent.OnSuccessEnrolled -> {
                isAlertDialogOpen.value = true
            }
        }
    }

    Scaffold(
        modifier = modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize(),
        bottomBar = {
            Box(modifier = Modifier.padding(16.dp)) {
                CodiButton(
                    onClick = {
                        onAction(ScreeningResultAction.OnEnrollNowAction)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    enabled = state.selectedLearningPath != null && !state.isLoading
                ) {
                    Text("Enroll Now")
                }

            }
        }
    ) { innerPadding ->

        if (isAlertDialogOpen.value) {
            CodiDialog(
                onDismissRequest = {
                    isAlertDialogOpen.value = false
                },
                onDismiss = {
                    isAlertDialogOpen.value = false
                },
                onConfirmRequest = {
                    onAction(ScreeningResultAction.OnContinueClicked)
                    isAlertDialogOpen.value = false
                },
                title = "Your journey begins now!",
                description = "Let's start your journey as ${state.selectedLearningPath?.name}",
                style = SuccessAlertDialogStyle(),
                confirmTitle = "Continue",
                isHideDismissButton = true,
            )
        }

        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "Wow this learning path is perfect for you!",
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(32.dp))
            Image(
                painter = painterResource(id = R.drawable.monsters),
                contentDescription = null,
                modifier = Modifier.size(206.dp)
            )
            Spacer(modifier = Modifier.height(32.dp))

            ScreeningResultItem(
                data = state.screeningResult,
                isSelected = if (state.selectedLearningPath != null) {
                    state.selectedLearningPath.id == state.screeningResult.id
                } else {
                    false
                },
                onClick = {
                    onAction(
                        ScreeningResultAction.OnLearningPathSelected(
                            state.screeningResult
                        )
                    )
                })
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                "Or you can choose from other learning paths",
                style = MaterialTheme.typography.bodySmall,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f),
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(16.dp))

            learningPaths.filter { it.id != state.screeningResult.id }.forEach {
                ScreeningResultItem(
                    data = it,
                    isSelected = state.selectedLearningPath?.id == it.id,
                    onClick = {
                        onAction(
                            ScreeningResultAction.OnLearningPathSelected(
                                it
                            )
                        )
                    })
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}


@Composable
fun ScreeningResultItem(
    data: LearningPath,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    isSelected: Boolean = false
) {
    Card(
        modifier = modifier, onClick = onClick, colors = CardDefaults.cardColors().copy(
            containerColor = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface,
            contentColor = if (isSelected) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurface
        )
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = if (data.id == 1) R.drawable.md else if (data.id == 2) R.drawable.ml else R.drawable.cc),
                contentDescription = null,
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = data.name ?: "Learning Path",
                    style = MaterialTheme.typography.titleSmall
                )
                Text(
                    text = data.description ?: "Description",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

@Preview
@Composable
private fun PreviewScreeningResultItem() {
    CodiLeapTheme {
        ScreeningResultItem(
            data = LearningPath(
                id = 1,
                name = "Machine Learning",
                description = "Learn the basics of machine learning",
                updatedAt = "",
                createdAt = "",
                courses = emptyList(),
            ),
            modifier = Modifier.fillMaxWidth(),
            onClick = {},
            isSelected = true
        )
    }
}

//@Preview
//@Composable
//private fun PreviewScreeningResultScreen() {
//    CodiLeapTheme {
//        ScreeningResultScreen(
//            state = ScreeningResultState()
//        )
//    }
//}