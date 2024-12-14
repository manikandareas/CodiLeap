package com.manikandareas.codileap.quiz.presentation

import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.core.data.preference.PreferenceDataSource
import com.manikandareas.codileap.core.domain.util.onSuccess
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.navigation.Navigator
import com.manikandareas.codileap.courses.data.networking.mappers.toDomain
import com.manikandareas.codileap.courses.domain.LearningPath
import com.manikandareas.codileap.courses.domain.LearningPathDataSource
import com.manikandareas.codileap.courses.presentation.model.toUiModel
import com.manikandareas.codileap.quiz.data.networking.dto.SubmitQuizRequestDto
import com.manikandareas.codileap.quiz.domain.QuizDataSource
import com.manikandareas.codileap.quiz.presentation.model.toDtoModel
import com.manikandareas.codileap.quiz.presentation.model.toUiModel
import com.manikandareas.codileap.screening.data.dummy.interestQuestionsQuiz
import com.manikandareas.codileap.screening.presentation.ScreeningState
import com.manikandareas.codileap.user.domain.UserDataSource
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class QuizViewModel(
    private val quizDataSource: QuizDataSource,
    private val navigator: Navigator,
    private val snackbarHostState: SnackbarHostState,
    private val learningPathDataSource: LearningPathDataSource,
    private val isScreening: Boolean = false,
    private val screeningState: ScreeningState? = null,
    private val preferenceDataSource: PreferenceDataSource
) : ViewModel() {
    private val _state = MutableStateFlow(QuizState())
    val state = _state
        .onStart {
            if (!isScreening) {
                loadQuiz()
            } else {
                _state.update {
                    it.copy(
                        quiz = interestQuestionsQuiz.toUiModel(),
                    )
                }
            }
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), QuizState())

    private val _events = Channel<QuizEvent>()
    val events = _events.receiveAsFlow()

    fun onAction(action: QuizAction) {
        when (action) {
            QuizAction.NavigateBack -> viewModelScope.launch {
                navigator.navigateUp()
            }

            is QuizAction.OnAnswerSelected -> viewModelScope.launch {
                _state.update {
                    val updatedAnswers = it.userAnswers.orEmpty().toMutableList().apply {
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
                    it.copy(userAnswers = updatedAnswers)
                }
            }

            QuizAction.OnSubmitClick -> viewModelScope.launch {
                if (isScreening) {
                    submitInterestQuiz()
                } else {
                    submitQuiz()
                }
            }

            QuizAction.OnTimerFinished -> viewModelScope.launch {
                submitEmptyQuiz()
            }
        }
    }


    private fun loadQuiz() = viewModelScope.launch {
        _state.update { it.copy(isLoading = true) }

        quizDataSource.getDailyQuiz().onSuccess { quiz ->
            _state.update {
                it.copy(
                    quiz = quiz.toUiModel(),
                )
            }
        }

        _state.update { it.copy(isLoading = false) }
    }

    private fun submitQuiz() = viewModelScope.launch {
        _state.update { it.copy(isLoading = true) }

        if (_state.value.userAnswers == null || _state.value.userAnswers?.size != _state.value.quiz?.questions?.size) {
            _events.send(QuizEvent.InvalidAnswer("Please answer all questions"))
            snackbarHostState.showSnackbar(
                message = "Please answer all questions",
                withDismissAction = true,
                duration = SnackbarDuration.Short
            )
            return@launch
        }
        val requestDto = SubmitQuizRequestDto(
            quizId = _state.value.quiz!!.id,
            answers = _state.value.userAnswers!!.map { it.toDtoModel() }
        )
        quizDataSource.submitQuiz(requestDto).onSuccess { response ->
            _events.send(QuizEvent.Success(response))
        }

        _state.update { it.copy(isLoading = false) }
    }

    private suspend fun submitInterestQuiz()  {
        _state.update { it.copy(isLoading = true) }

        if (_state.value.userAnswers == null || _state.value.userAnswers?.size != interestQuestionsQuiz.questions.size) {
            _events.send(QuizEvent.InvalidAnswer("Please answer all questions"))
            snackbarHostState.showSnackbar(
                message = "Please answer all questions",
                withDismissAction = true,
                duration = SnackbarDuration.Short
            )
            return
        }

        println("QVM ${_state.value}")
        val requestDto = SubmitQuizRequestDto(
            quizId = _state.value.quiz!!.id,
            answers = _state.value.userAnswers!!.map { it.toDtoModel() }
        )
        learningPathDataSource.screeningLearningPath(requestDto).onSuccess { response ->
         updateProfile(response.recommendedLearningPath.toDomain())
        }

        _state.update { it.copy(isLoading = false) }
    }

    private fun submitEmptyQuiz() = viewModelScope.launch {
        _state.update { it.copy(isLoading = true) }

        val requestDto = SubmitQuizRequestDto(
            quizId = _state.value.quiz!!.id,
            answers = emptyList()
        )
        quizDataSource.submitQuiz(requestDto).onSuccess { response ->
            _events.send(QuizEvent.Success(response))
        }

        _state.update { it.copy(isLoading = false) }
    }

    private suspend fun updateProfile(lp: LearningPath)  {
        val currentUser = preferenceDataSource.getUser().first()
        if (currentUser == null) {
            return
        }

        preferenceDataSource.saveUser(
            currentUser.copy(
                fullName = screeningState!!.fullName,
                studyHours = screeningState!!.studyHour,
            )
        )

        preferenceDataSource.saveReminderTime(reminderTime = screeningState.studyHour)
        navigator.navigate(destination = Destination.ScreeningResultScreen(lp))
    }

}