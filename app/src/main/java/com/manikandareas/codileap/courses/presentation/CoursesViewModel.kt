package com.manikandareas.codileap.courses.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.onError
import com.manikandareas.codileap.core.domain.util.onSuccess
import com.manikandareas.codileap.core.navigation.Navigator
import com.manikandareas.codileap.courses.domain.CoursesDataSource
import com.manikandareas.codileap.courses.domain.LearningPath
import com.manikandareas.codileap.courses.domain.LearningPathDataSource
import com.manikandareas.codileap.courses.presentation.model.toUiModel
import com.manikandareas.codileap.user.domain.CurrentProgress
import com.manikandareas.codileap.user.domain.ProgressDataSource
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.navigation.Destination.*

class CoursesViewModel(
    private val learningPathDataSource: LearningPathDataSource,
    private val progressDataSource: ProgressDataSource,
    private val navigator: Navigator
) : ViewModel() {
    private val _state = MutableStateFlow(CoursesState())
    val state = _state
        .onStart { loadCourses() }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), CoursesState())

    private val _events = Channel<CoursesEvent>()
    val events = _events.receiveAsFlow()

    fun onAction(action: CoursesAction) {
        when (action) {
            is CoursesAction.NavigateTo -> viewModelScope.launch {
                navigator.navigate(action.des) {
                    popUpTo(Destination.CoursesScreen()) { inclusive = true }
                }
            }

            is CoursesAction.OnModuleClicked -> viewModelScope.launch {
                navigator.navigate(ModuleScreen(action.module))
            }

            is CoursesAction.OnCourseChanged -> viewModelScope.launch {
                changeSelectedCourse(action.courseId)
            }

            is CoursesAction.OnLearningPathChanged -> viewModelScope.launch {
                changeSelectedLearningPath(action.learningPathId)
            }
        }
    }

    private fun changeSelectedCourse(courseId: Int) {
        val selectedCourse = _state.value.courses.find { it.id == courseId }
        _state.update { it.copy(selectedCourse = selectedCourse) }
    }

    private fun changeSelectedLearningPath(learningPathId: Int) {
        val selectedLearningPath = _state.value.learningPaths.find { it.id == learningPathId }
        val selectedCourse = selectedLearningPath?.courses?.first()
        _state.update {
            it.copy(
                selectedLearningPath = selectedLearningPath,
                selectedCourse = selectedCourse,
                courses = selectedLearningPath?.courses ?: emptyList(),
            )
        }
    }

    private fun loadCourses() = viewModelScope.launch {
        _state.update { it.copy(isLoading = true) }

        val learningPathsResult = learningPathDataSource.getAllLearningPathsWithCourses()
        val progressResult = progressDataSource.getCurrentProgress()

        handleLearningPathsResult(learningPathsResult)
        handleProgressResult(progressResult)

        _state.update { it.copy(isLoading = false) }
    }

    private suspend fun handleLearningPathsResult(result: Result<List<LearningPath>, NetworkError>) {
        result.onSuccess { res ->
            _state.update { st ->
                st.copy(learningPaths = res.map { it.toUiModel() })
            }
        }.onError { error ->
            _state.update { it.copy(isLoading = false) }
            _events.send(CoursesEvent.Error(error = error))
        }
    }

    private suspend fun handleProgressResult(result: Result<CurrentProgress, NetworkError>) {
        result.onSuccess { res ->
            val selectedLearningPath =
                _state.value.learningPaths.find { it.id == res.learningPathId }
            val selectedCourse = selectedLearningPath?.courses?.find { it.id == res.courseId }

            _state.update { st ->
                st.copy(
                    selectedCourse = selectedCourse,
                    selectedLearningPath = selectedLearningPath,
                    currentModuleId = res.moduleId,
                    courses = selectedLearningPath?.courses ?: emptyList()
                )
            }
        }.onError { error ->
            _state.update { it.copy(isLoading = false) }
            _events.send(CoursesEvent.Error(error = error))
        }
    }


}