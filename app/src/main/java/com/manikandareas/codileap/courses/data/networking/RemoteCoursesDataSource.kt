package com.manikandareas.codileap.courses.data.networking

import com.manikandareas.codileap.core.data.networking.constructUrl
import com.manikandareas.codileap.core.data.networking.safeCall
import com.manikandareas.codileap.core.domain.networking.ApiResponse
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.core.domain.util.map
import com.manikandareas.codileap.courses.data.networking.dto.CompleteModuleResponseDto
import com.manikandareas.codileap.courses.data.networking.dto.CourseDto
import com.manikandareas.codileap.courses.data.networking.dto.ModuleDto
import com.manikandareas.codileap.courses.data.networking.dto.UnitDto
import com.manikandareas.codileap.courses.data.networking.mappers.toDomain
import com.manikandareas.codileap.courses.domain.Course
import com.manikandareas.codileap.courses.domain.CoursesDataSource
import com.manikandareas.codileap.courses.domain.Module
import com.manikandareas.codileap.courses.domain.Unit
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.put

class RemoteCoursesDataSource(private val httpClient: HttpClient) : CoursesDataSource {

    override suspend fun getCoursesByLearningPathId(learningPathId: Number): Result<List<Course>, NetworkError> {
        return safeCall<ApiResponse<List<CourseDto>>> {
            httpClient.get(
                urlString = constructUrl("/api/courses/$learningPathId")
            )
        }.map {
            it.data!!.map { c ->
                c.toDomain().copy(
                    modules = emptyList()
                )
            }
        }

    }

    override suspend fun getModulesByCourseId(courseId: Number): Result<List<Module>, NetworkError> {
        return safeCall<ApiResponse<List<ModuleDto>>> {
            httpClient.get(
                urlString = constructUrl("/api/courses/$courseId/modules")
            )
        }.map {
            it.data!!.map { m ->
                m.toDomain()
            }
        }
    }

    override suspend fun getUnitsByModuleId(
        courseId: Number,
        moduleId: Number
    ): Result<List<Unit>, NetworkError> {
        return safeCall<ApiResponse<List<UnitDto>>> {
            httpClient.get(
                urlString = constructUrl("/api/courses/$courseId/modules/$moduleId/units")
            )
        }.map {
            it.data!!.map {
                it.toDomain()
            }
        }
    }

    override suspend fun completeModule(courseId: Number): Result<CompleteModuleResponseDto, NetworkError> {
        return safeCall<ApiResponse<CompleteModuleResponseDto>> {
            httpClient.put(
                urlString = constructUrl("/api/courses/$courseId/modules/complete")
            )
        }.map {
            it.data!!
        }
    }
}