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
import com.manikandareas.codileap.screening.presentation.screening_result.learningPaths

class CoursesViewModel(
    private val learningPathDataSource: LearningPathDataSource,
    private val progressDataSource: ProgressDataSource,
    private val navigator: Navigator,
    private val selectedLearningPathId: Int? = null,
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
        println("CHANGED COURSES FROM ${state.value.selectedCourse?.id} to ${courseId} ")
        val selectedCourse = _state.value.courses.find { it.id == courseId }
        _state.update { it.copy(selectedCourse = selectedCourse) }
    }

    private fun changeSelectedLearningPath(learningPathId: Int) {
        println("CHANGED LEARNING PATH FROM ${state.value.selectedLearningPath?.id} to ${learningPathId} ")
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

            val selectedLearningPath =
                if (selectedLearningPathId == null) _state.value.learningPaths.find { it.id == res.learningPathId } else _state.value.learningPaths.find { it.id == selectedLearningPathId }
            val selectedCourse =
                if (selectedLearningPathId == null) selectedLearningPath?.courses?.find { it.id == res.courseId } else selectedLearningPath?.courses?.firstOrNull()


            println("IS ERROR IN THIS LINE")
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