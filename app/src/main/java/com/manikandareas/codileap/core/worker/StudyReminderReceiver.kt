package com.manikandareas.codileap.core.worker

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.manikandareas.codileap.R

// Receiver untuk menangani alarm
class StudyReminderReceiver : BroadcastReceiver() {
    @SuppressLint("MissingPermission")
    override fun onReceive(context: Context, intent: Intent) {
        val studyTime = intent.getStringExtra("STUDY_TIME") ?: return

        // Buat dan tampilkan notifikasi
        val notification = NotificationCompat.Builder(context, NotificationHelper.STUDY_REMINDER_CHANNEL_ID)
            .setContentTitle("Waktunya Belajar")
            .setContentText("Anda akan belajar pada pukul $studyTime")
            .setSmallIcon(R.drawable.logo_codi_leap) // Ganti dengan icon notifikasi Anda
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .build()

        NotificationManagerCompat.from(context).notify(1, notification)
    }
}