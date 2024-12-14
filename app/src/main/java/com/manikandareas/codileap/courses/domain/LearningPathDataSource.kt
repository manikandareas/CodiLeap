package com.manikandareas.codileap.courses.domain

import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.core.domain.util.Result
import com.manikandareas.codileap.courses.data.networking.dto.EnrollLearningPathResponseDto
import com.manikandareas.codileap.courses.data.networking.dto.ScreeningLearningPathResponseDto
import com.manikandareas.codileap.quiz.data.networking.dto.SubmitQuizRequestDto

interface LearningPathDataSource {
    suspend fun getAllLearningPathsWithCourses(): Result<List<LearningPath>, NetworkError>
    suspend fun enrollLearningPath(learningPathId: Int): Result<EnrollLearningPathResponseDto, NetworkError>
    suspend fun screeningLearningPath(request: SubmitQuizRequestDto): Result<ScreeningLearningPathResponseDto, NetworkError>
}