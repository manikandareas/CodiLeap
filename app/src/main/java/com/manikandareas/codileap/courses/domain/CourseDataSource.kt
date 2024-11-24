package com.manikandareas.codileap.courses.domain

import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result

interface CourseDataSource {
    // For get list of modules base on learning path id
    suspend fun getCoursesByLearningPathId(learningPathId: Number): Result<ApiResponse<List<Course>>, NetworkError>

    // For get list of lessons base on module id
    suspend fun getModulesByCourseId(courseId: Number): Result<ApiResponse<List<Module>>, NetworkError>
}