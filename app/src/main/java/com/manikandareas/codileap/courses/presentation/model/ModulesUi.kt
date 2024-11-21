package com.manikandareas.codileap.courses.presentation.model
//
//
//data class Module (
//    val id: Int,
//    val name: String,
//    val description: String,
//    val totalLessons: Int,
//    val progress: Progress
//)
//
//data class Progress (
//    val completed: Int,
//    val total: Int,
//    val percentage: Float
//)
//


data class ModuleUi(
    val id: Int,
    val name: String,
    val description: String,
    val totalLesson: Int,
    val progress: ProgressUi
)

data class ProgressUi(
    val completed: Int,
    val total: Int,
    val percentage: Float
)

data class LessonUi(
    val id: Int,
    val name: String,
    val status: String,
    val units: List<UnitUi>
)

data class UnitUi (
    val id: Int,
    val order: Int,
    val content: String,
    val type: String
)

//
//
//data class Lesson (
//    val id: Int,
//    val name: String,
//    val status: String,
//    val units: List<Unit>
//)
//
//data class Unit (
//    val id: Int,
//    val order: Int,
//    val content: String,
//    val type: String
//)

