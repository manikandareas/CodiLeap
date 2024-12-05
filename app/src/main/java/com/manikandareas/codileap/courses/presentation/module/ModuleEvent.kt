package com.manikandareas.codileap.courses.presentation.module

import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.courses.presentation.model.CourseUi
import com.manikandareas.codileap.courses.presentation.model.ModuleUi

sealed interface ModuleEvent {
    data class Error(val error: NetworkError) : ModuleEvent

    data class SuccessHasNextModule(val moduleUi: ModuleUi): ModuleEvent

    data class SuccessCourseCompleted(val courseUi: CourseUi): ModuleEvent

    object SuccessLearningPathCompleted: ModuleEvent

    object Exit: ModuleEvent
}

//enum class ModuleEventTypes {
//    Error,
//    SuccessHasNextModule,
//    SuccessCourseCompleted,
//    SuccessLearningPathCompleted,
//    Exit
//}