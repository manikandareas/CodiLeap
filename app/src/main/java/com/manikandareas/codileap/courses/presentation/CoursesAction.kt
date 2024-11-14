package com.manikandareas.codileap.courses.presentation

import com.manikandareas.codileap.core.navigation.Destination

sealed class CoursesAction {
  data class NavigateTo(val des: Destination) : CoursesAction()
}