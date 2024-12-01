package com.manikandareas.codileap.courses.domain

import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.courses.data.networking.dto.CourseDto
import com.manikandareas.codileap.courses.data.networking.dto.ModuleDto

interface CourseDataSource {
    // For get list of modules base on learning path id
    suspend fun getCoursesByLearningPathId(learningPathId: Number): Result<ApiResponse<List<CourseDto>>, NetworkError>

    // For get list of lessons base on module id
    suspend fun getModulesByCourseId(courseId: Number): Result<ApiResponse<List<ModuleDto>>, NetworkError>

    suspend fun completeModule(courseId: Number): Result<ApiResponse<Unit>, NetworkError>
}