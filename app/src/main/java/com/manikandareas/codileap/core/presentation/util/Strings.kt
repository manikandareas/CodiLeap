package com.manikandareas.codileap.core.presentation.util



fun String.toUTC (): String {
    return this.replace(" ", "T") + "[UTC]"
}