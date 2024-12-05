package com.manikandareas.codileap.user.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.core.domain.util.onError
import com.manikandareas.codileap.core.domain.util.onSuccess
import com.manikandareas.codileap.user.domain.ProgressDataSource
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class UserProgressViewModel(
    private val progressDataSource: ProgressDataSource
) : ViewModel() {
    private val _state = MutableStateFlow(UserProgressState())
    val state = _state
        .onStart { loadProgress() }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), UserProgressState())

    private val _events = Channel<UserProgressEvent>()
    val events = _events.receiveAsFlow()

    private fun loadProgress() = viewModelScope.launch {
        _state.update {
            it.copy(
                isLoading = true,
            )
        }

        progressDataSource.getCurrentProgress().onSuccess { res ->
            _state.update { st ->
                st.copy(
                    currentProgress = res
                )
            }
        }.onError { error ->
            _state.update { it.copy(isLoading = false) }
            _events.send(UserProgressEvent.Error(error = error))
            return@launch
        }

        progressDataSource.getUserProgress().onSuccess { res ->
            _state.update { st ->
                st.copy(
                    userProgress = res,
                    isLoading = false
                )
            }
        }.onError { error ->
            _state.update { it.copy(isLoading = false) }
            _events.send(UserProgressEvent.Error(error = error))
        }

    }
}