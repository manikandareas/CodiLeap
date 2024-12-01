package com.manikandareas.codileap.quiz.presentation


sealed class QuizAction {
    data object NavigateBack : QuizAction()

    data object OnSubmitClick : QuizAction()
}