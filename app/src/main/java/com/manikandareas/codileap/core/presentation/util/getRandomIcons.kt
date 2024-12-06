package com.manikandareas.codileap.core.presentation.util

import android.content.Context
import com.manikandareas.codileap.R

fun getRandomIcons(size: Int = 4): List<Int> {
    // Daftar ID drawable ikon yang ada di resource
    val icons = listOf(
        R.drawable.miscellaneous_icons_1,
        R.drawable.miscellaneous_icons_2,
        R.drawable.miscellaneous_icons_3,
        R.drawable.miscellaneous_icons_4,
        R.drawable.miscellaneous_icons_5,
        R.drawable.miscellaneous_icons_7,
        R.drawable.miscellaneous_icons_8,
        R.drawable.miscellaneous_icons_9,
        R.drawable.outline_1,
        R.drawable.outline_2,
        R.drawable.outline_3,
        R.drawable.outline_4,
        R.drawable.outline_5,
//        R.drawable.outline_6,
    )

    // Mengacak dan memilih 4 ikon yang berbeda
    return icons.shuffled().take(size)
}