package com.manikandareas.codileap.screening.presentation.screening_result

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.core.data.preference.PreferenceDataSource
import com.manikandareas.codileap.core.domain.util.onError
import com.manikandareas.codileap.core.domain.util.onSuccess
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.core.navigation.Navigator
import com.manikandareas.codileap.courses.domain.LearningPathDataSource
import com.manikandareas.codileap.user.data.networking.dto.toUpdateUserRequestDto
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

class ScreeningResultViewModel(
    private val navigator: Navigator,
    private val learningPathDataSource: LearningPathDataSource,
    private val userDataSource: UserDataSource,
    private val preferenceDataSource: PreferenceDataSource,
) : ViewModel() {
    private val _state = MutableStateFlow(ScreeningResultState())
    val state = _state
        .onStart {
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), ScreeningResultState())

    private val _events = Channel<ScreeningResultEvent>()
    val events = _events.receiveAsFlow()

    fun onAction(action: ScreeningResultAction) {
        when (action) {
            is ScreeningResultAction.OnLearningPathSelected -> {
                _state.update {
                    it.copy(selectedLearningPath = action.learningPathUi)
                }
            }

            is ScreeningResultAction.NavigateTo -> viewModelScope.launch {
                navigator.navigate(action.des)
            }

            ScreeningResultAction.OnEnrollNowAction -> viewModelScope.launch {
                onEnrollNow()
            }

            ScreeningResultAction.OnContinueClicked -> viewModelScope.launch {
                saveUserData()
            }
        }

    }

    fun onEnrollNow() = viewModelScope.launch {
        _state.update {
            it.copy(isLoading = true)
        }

        if (_state.value.selectedLearningPath == null) {
            return@launch
        }

        learningPathDataSource.enrollLearningPath(_state.value.selectedLearningPath!!.id)
            .onSuccess { res ->
                _state.update {
                    it.copy(isLoading = false)
                }
                _events.send(ScreeningResultEvent.OnSuccessEnrolled(_state.value.selectedLearningPath!!))
            }.onError { err ->
                _state.update {
                    _events.send(ScreeningResultEvent.Error(err))
                    it.copy(isLoading = false)
                }
            }
    }

    private fun saveUserData() = viewModelScope.launch {
        println("SRVM saveUserData")
        val currentUser = preferenceDataSource.getUser().first()
        if (currentUser == null) {
            return@launch
        }

        userDataSource.updateUserForScreening(
//            UpdateUserRequestDto(
//                fullName = currentUser?.fullName ?: "",
//                studyHours = currentUser?.studyHours ?: "",
//                isAlreadyScreened = true
//            )
            currentUser.toUpdateUserRequestDto().copy(
                isAlreadyScreened = true,
            )
        ).onSuccess {
            println("SRVM saveUserData")

            preferenceDataSource.saveUser(
                currentUser.copy(
                    isAlreadyScreened = true
                )
            )

            navigator.navigate(Destination.HomeGraph) {
                popUpTo(Destination.HomeGraph) {
                    inclusive = true
                }
            }
        }.onError {

            println("SRVM ERROR $it")
            _events.send(ScreeningResultEvent.Error(it))
        }

    }
}