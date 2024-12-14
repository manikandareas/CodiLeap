package com.manikandareas.codileap.home.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.core.domain.util.onError
import com.manikandareas.codileap.core.domain.util.onSuccess
import com.manikandareas.codileap.courses.domain.LearningPathDataSource
import com.manikandareas.codileap.courses.presentation.CoursesEvent
import com.manikandareas.codileap.courses.presentation.model.toUiModel
import com.manikandareas.codileap.user.domain.ProgressDataSource
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModel(
    private val learningPathDataSource: LearningPathDataSource,
    private val progressDataSource: ProgressDataSource
) : ViewModel() {
    private val _state = MutableStateFlow(HomeState())
    val state = _state
        .onStart { loadData() }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), HomeState())

    private val _events = Channel<CoursesEvent>()
    val events = _events.receiveAsFlow()

    private fun loadData() = viewModelScope.launch {
        _state.update { it.copy(isLoading = true) }

        learningPathDataSource.getAllLearningPathsWithCourses().onSuccess { res ->
            _state.update { it.copy(learningPaths = res.map { it.toUiModel() }) }
        }.onError {
            println("ERROR HOME VIEWMODEL: $it")
        }

        progressDataSource.getCurrentProgress().onSuccess { res ->
            _state.update { it.copy(currentProgress = res) }
        }.onError {
            println("ERROR HOME VIEWMODEL: $it")
        }

        progressDataSource.getUserProgress().onSuccess { res ->
            _state.update { it.copy(userProgress = res) }
        }.onError {
            println("ERROR HOME VIEWMODEL: $it")
        }


        _state.update { it.copy(isLoading = false) }
    }

}