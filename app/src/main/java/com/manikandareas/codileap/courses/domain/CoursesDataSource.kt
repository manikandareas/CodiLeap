package com.manikandareas.codileap.courses.domain

import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.courses.data.networking.dto.CompleteModuleResponseDto
import com.manikandareas.codileap.courses.data.networking.dto.CourseDto
import com.manikandareas.codileap.courses.data.networking.dto.ModuleDto

interface CoursesDataSource {
    // For get list of modules base on learning path id
    suspend fun getCoursesByLearningPathId(learningPathId: Number): Result<List<Course>, NetworkError>

    // For get list of lessons base on module id
    suspend fun getModulesByCourseId(courseId: Number): Result<List<Module>, NetworkError>

    suspend fun getUnitsByModuleId(courseId:Number, moduleId: Number): Result<List<Unit>, NetworkError>

    suspend fun completeModule(courseId: Number): Result<CompleteModuleResponseDto, NetworkError>
}