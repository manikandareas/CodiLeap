package com.manikandareas.codileap.core.worker

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.manikandareas.codileap.ui.theme.primaryLight

class NotificationHelper(private val context: Context) {
    companion object {
        const val STUDY_REMINDER_CHANNEL_ID = "study_reminder_channel"
        const val STUDY_REMINDER_CHANNEL_NAME = "Study Reminder"
    }

    @SuppressLint("ObsoleteSdkInt")
    fun createNotificationChannel() {
        // Cek jika Android Oreo atau lebih tinggi
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                STUDY_REMINDER_CHANNEL_ID,
                STUDY_REMINDER_CHANNEL_NAME,
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "Channel untuk pengingat waktu belajar"
                enableLights(true)
                lightColor = primaryLight.toArgb()
                enableVibration(true)
            }

            // Daftarkan channel ke sistem
            val notificationManager: NotificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}