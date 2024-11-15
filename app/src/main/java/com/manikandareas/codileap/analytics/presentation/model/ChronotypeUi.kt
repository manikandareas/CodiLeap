package com.manikandareas.codileap.analytics.presentation.model

import androidx.annotation.DrawableRes
import com.manikandareas.codileap.R

data class ChronotypeUi(
    @DrawableRes val chronotypeIcon: Int,
)

object ChronotypeIconOption {
    val lion = R.drawable.ic_lion
    val wolf = R.drawable.ic_wolf
    val dolphin = R.drawable.ic_dolphine
    val bear = R.drawable.ic_bear
}