package com.manikandareas.codileap.courses.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.core.domain.util.onError
import com.manikandareas.codileap.core.domain.util.onSuccess
import com.manikandareas.codileap.core.navigation.Navigator
import com.manikandareas.codileap.courses.domain.LearningPathDataSource
import com.manikandareas.codileap.courses.presentation.model.CoursesEvent
import com.manikandareas.codileap.courses.presentation.model.toUiModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CoursesViewModel(
    private val learningPathDataSource: LearningPathDataSource,
    private val navigator: Navigator
) : ViewModel() {
    private val _state = MutableStateFlow(CoursesState())
    val state = _state
        .onStart { loadCourses() }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), CoursesState())

    private val _events = Channel<CoursesEvent>()
    val events = _events.receiveAsFlow()

    private fun loadCourses() = viewModelScope.launch {
        _state.update {
            it.copy(
                isLoading = true,
            )
        }

        learningPathDataSource.getAllLearningPathsWithCourses().onSuccess { res ->
            _state.update { st ->
                st.copy(
                    isLoading = false,
                    learningPaths = res.map { it.toUiModel() },
                )
            }
        }.onError { error ->
            _state.update { it.copy(isLoading = false) }
            _events.send(CoursesEvent.Error(error = error))
        }

    }

}