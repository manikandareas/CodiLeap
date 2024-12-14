package com.manikandareas.codileap.home.presentation

import com.manikandareas.codileap.core.navigation.Destination

sealed class HomeAction {
  data class NavigateTo(val des: Destination) : HomeAction()

  data class OnCarouselItemClicked(val learningPathId: Int) : HomeAction()
}