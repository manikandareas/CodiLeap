package com.manikandareas.codileap.user.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manikandareas.codileap.auth.presentation.auth_register.AuthRegisterState
import com.manikandareas.codileap.core.data.preference.PreferenceDataSource
import com.manikandareas.codileap.core.domain.util.onSuccess
import com.manikandareas.codileap.home.presentation.model.UserUi
import com.manikandareas.codileap.home.presentation.model.toUpdateUserRequestDto
import com.manikandareas.codileap.user.domain.User
import com.manikandareas.codileap.user.domain.UserDataSource
import kotlinx.coroutines.launch

class UserProfileViewModel(
    private val preferenceDataSource: PreferenceDataSource,
    private val userDatasource: UserDataSource
) : ViewModel() {
    var state by mutableStateOf(UserProfileState())
        private set


    private fun updateUser(user: UserUi) = viewModelScope.launch {
        state = state.copy(
            user = user.copy(
                fullName = state.fullName,
                phoneNumber = state.phoneNumber,
                address = state.address,
                dob = state.dob,
                studyHours = state.studyHours
            )
        )

        if (state.user != null) {
            return@launch
        }

        userDatasource.updateUser(state.user?.toUpdateUserRequestDto()!!).onSuccess { res->
            preferenceDataSource.saveUser(
                User(
                    id = res.id,
                    email = res.email,
                    avatarUrl = res.avatarUrl,
                    isAlreadyScreened = res.isAlreadyScreened,
                    fullName = res.fullName,
                    phoneNumber = res.phoneNumber,
                    address = res.address,
                    dob = res.dateOfBirth,
                    studyHours = res.studyHours
                )
            )
        }
    }

}