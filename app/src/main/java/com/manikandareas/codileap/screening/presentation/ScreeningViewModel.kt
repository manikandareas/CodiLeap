package com.manikandareas.codileap.screening.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.core.navigation.Destination.*
import com.manikandareas.codileap.core.navigation.Navigator
import kotlinx.coroutines.launch
import kotlin.collections.orEmpty
import kotlin.collections.toMutableList

class ScreeningViewModel(
    private val navigator: Navigator,
) : ViewModel() {
    var state by mutableStateOf(ScreeningState())
        private set


    fun onAction(action: ScreeningAction) {
        when (action) {
            is ScreeningAction.NavigateTo -> viewModelScope.launch {
                navigator.navigate(action.des)
            }

            ScreeningAction.NavigateToQuizSession -> viewModelScope.launch {
                navigator.navigate(QuizScreen(isScreening = true, screeningState = state))
            }

            is ScreeningAction.OnScreeningNameAction -> viewModelScope.launch {
                state = state.copy(fullName = action.name)
            }

            is ScreeningAction.OnScreeningStudyHourAction -> viewModelScope.launch {
                state = state.copy(studyHour = action.studyHour)
            }

            is ScreeningAction.OnScreeningInterestSelected -> viewModelScope.launch {
                val updatedAnswers = state.interestQuizAnswer.orEmpty().toMutableList().apply {
                    // Cek jika ada jawaban dengan questionId yang sama
                    val existingIndex =
                        indexOfFirst { answer -> answer.questionId == action.answer.questionId }
                    if (existingIndex != -1) {
                        // Ganti jawaban yang sudah ada
                        set(existingIndex, action.answer)
                    } else {
                        // Tambahkan jawaban baru jika tidak ada
                        add(action.answer)
                    }
                }
                state = state.copy(
                    interestQuizAnswer = updatedAnswers
                )
            }
        }
    }


}