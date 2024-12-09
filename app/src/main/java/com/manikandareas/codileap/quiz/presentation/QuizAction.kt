package com.manikandareas.codileap.quiz.presentation

import com.manikandareas.codileap.quiz.presentation.model.AnswerUi


sealed class QuizAction {
    data object NavigateBack : QuizAction()

    data object OnSubmitClick : QuizAction()


    data class OnAnswerSelected(val answer: AnswerUi) : QuizAction()

    data object OnTimerFinished : QuizAction()
}