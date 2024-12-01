package com.manikandareas.codileap.courses.presentation


sealed class QuizAction {
    data object NavigateBack : QuizAction()

    data object OnSubmitClick : QuizAction()
}