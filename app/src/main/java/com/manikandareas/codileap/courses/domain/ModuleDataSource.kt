package com.manikandareas.codileap.courses.domain

import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.courses.data.networking.dto.LessonDto
import com.manikandareas.codileap.courses.data.networking.dto.ModuleDto

interface ModuleDataSource {
    // For get list of modules base on learning path id
    suspend fun getModulesByLearningPathId(learningPathId: Number): Result<ApiResponse<List<Module>>, NetworkError>

    // For get list of lessons base on module id
    suspend fun getLessonsByModuleId(moduleId: Number): Result<ApiResponse<List<Lesson>>, NetworkError>
}