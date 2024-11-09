package com.manikandareas.codileap.core.presentation.util

import android.content.Context
import com.manikandareas.codileap.core.domain.util.NetworkError
import com.manikandareas.codileap.R

fun NetworkError.toString(context:Context):String {
    val resId= when(this) {
        NetworkError.REQUEST_TIMEOUT -> R.string.error_request_timeout
        NetworkError.TOO_MANY_REQUESTS -> R.string.error_too_many_requests
        NetworkError.NO_INTERNET -> R.string.error_no_internet
        NetworkError.SERVER_ERROR -> R.string.error_server
        NetworkError.SERIALIZATION -> R.string.error_serialization
        NetworkError.UNAUTHORIZED -> R.string.email_or_password_is_incorrect
        NetworkError.UNKNOWN -> R.string.error_unknown
    }

    return context.getString(resId)
}