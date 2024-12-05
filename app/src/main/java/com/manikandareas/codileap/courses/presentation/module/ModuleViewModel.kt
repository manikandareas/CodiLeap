package com.manikandareas.codileap.courses.presentation.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.onError
import com.manikandareas.codileap.core.domain.util.onSuccess
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.navigation.Destination.*
import com.manikandareas.codileap.core.navigation.Navigator
import com.manikandareas.codileap.courses.data.networking.mappers.toDomain
import com.manikandareas.codileap.courses.domain.CoursesDataSource
import com.manikandareas.codileap.courses.presentation.model.ModuleUi
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

class ModuleViewModel(
    private val coursesDataSource: CoursesDataSource,
    private val progressDataSource: ProgressDataSource,
    private val navigator: Navigator,
    private val moduleUi: ModuleUi
) : ViewModel() {
    private val _state = MutableStateFlow(ModuleState())
    val state = _state
        .onStart { loadUnits() }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), ModuleState())

    private val _events = Channel<ModuleEvent>()
    val events = _events.receiveAsFlow()

    fun onAction(action: ModuleAction) {
        when (action) {
            ModuleAction.NavigateBack -> viewModelScope.launch {
                navigator.navigate(Destination.CoursesScreen) {
                    popUpTo(CoursesScreen) {
                        inclusive = true
                    }
                }
            }

            ModuleAction.OnContinueClicked -> viewModelScope.launch {
                completeModule()
            }

            is ModuleAction.GotoNextCourse -> {}
            is ModuleAction.GotoNextModule -> viewModelScope.launch {
                navigator.navigate(ModuleScreen(action.moduleUi)) {
                    popUpTo(ModuleScreen(action.moduleUi)) {
                        inclusive = false
                    }
                }
            }

            ModuleAction.Exit -> viewModelScope.launch {
                _events.send(ModuleEvent.Exit)
            }
        }
    }

    private fun loadUnits() = viewModelScope.launch {
        _state.update {
            it.copy(isLoading = true)
        }

        coursesDataSource.getUnitsByModuleId(moduleId = moduleUi.id, courseId = moduleUi.courseId)
            .onSuccess { res ->
                _state.update {
                    it.copy(
                        moduleUi = moduleUi.copy(units = res.map { it.toUiModel() })
                    )
                }
            }.onError { error ->
                _state.update { it.copy(isLoading = false) }
                _events.send(ModuleEvent.Error(error = error))
            }

        progressDataSource.getCurrentProgress()
            .onSuccess { res ->
                _state.update {
                    it.copy(currentModuleId = res.moduleId)
                }
            }.onError { error ->
                _state.update { it.copy(isLoading = false) }
                _events.send(ModuleEvent.Error(error = error))
            }

        _state.update { it.copy(isLoading = false) }

    }

    private fun completeModule() = viewModelScope.launch {
        _state.update { it.copy(isLoading = true) }

        try {
            val result = coursesDataSource.completeModule(courseId = moduleUi.courseId)

            _state.update { it.copy(isLoading = false) }

            result.onSuccess { successResult ->

                when {
                    successResult.nextModule != null -> {
                        _state.update {
                            it.copy(
                                currentModuleId = successResult.nextModule.id
                            )
                        }
                        _events.send(
                            ModuleEvent.SuccessHasNextModule(
                                moduleUi = successResult.nextModule.toDomain().toUiModel()
                            )
                        )
                    }

                    successResult.nextCourse != null -> {
                        _state.update {
                            it.copy(
                                currentModuleId = 0
                            )
                        }
                        _events.send(
                            ModuleEvent.SuccessCourseCompleted(
                                courseUi = successResult.nextCourse.toDomain().toUiModel()
                            )
                        )
                    }

                    else -> {
                        _events.send(ModuleEvent.SuccessLearningPathCompleted)
                    }
                }

            }.onError { error ->

                _events.send(ModuleEvent.Error(error))

            }


        } catch (e: Exception) {
            _state.update { it.copy(isLoading = false) }
            _events.send(ModuleEvent.Error(error = NetworkError.UNKNOWN))
        }
    }

}