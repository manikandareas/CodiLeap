package com.manikandareas.codileap.courses.data.networking.dto

import kotlinx.serialization.Serializable

data class ScreeningLearningPathRequestDto(
    val answers: List<AnswerDto>
)

data class AnswerDto(
    val questionId: Int,
    val selectedAnswerId: Int
)

//
//"answers" : [
//{
//    "questionId": 1,
//    "selectedAnswerId": 1
//},
//{
//    "questionId": 2,
//    "selectedAnswerId": 2
//},
//...
//]