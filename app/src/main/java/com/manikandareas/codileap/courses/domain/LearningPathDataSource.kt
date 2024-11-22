package com.manikandareas.codileap.courses.domain

import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.courses.data.networking.dto.ScreeningLearningPathRequestDto
import com.manikandareas.codileap.courses.data.networking.dto.ScreeningLearningPathResponseDto

interface LearningPathDataSource {
    suspend fun getAllLearningPaths(): Result<ApiResponse<List<LearningPath>>, NetworkError>
    suspend fun screeningLearningPath(request: ScreeningLearningPathRequestDto): Result<ApiResponse<ScreeningLearningPathResponseDto>, NetworkError>
}