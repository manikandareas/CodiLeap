package com.manikandareas.codileap.core.presentation.util

fun String.truncateWithEllipsis(maxLength: Int): String {
    return if (this.length > maxLength) {
        this.take(maxLength) + "..."
    } else {
        this
    }
}