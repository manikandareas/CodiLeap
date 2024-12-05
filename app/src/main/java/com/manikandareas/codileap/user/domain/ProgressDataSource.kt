package com.manikandareas.codileap.user.domain

import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result

interface ProgressDataSource {
    suspend fun getCurrentProgress(): Result<CurrentProgress, NetworkError>
    suspend fun getUserProgress(): Result<UserProgress, NetworkError>
}
