package com.manikandareas.codileap.core.worker

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import java.util.Calendar

// Fungsi setup reminder yang disederhanakan
fun setupStudyReminder(context: Context, studyTime: String) {
    val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager

    // Parse waktu
    val (hours, minutes) = studyTime.split(":").map { it.toInt() }

    // Buat intent untuk alarm
    val intent = Intent(context, StudyReminderReceiver::class.java).apply {
        putExtra("STUDY_TIME", studyTime)
    }

    val pendingIntent = PendingIntent.getBroadcast(
        context,
        0,
        intent,
        PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
    )

    // Hitung waktu trigger (5 menit sebelum)
    val calendar = Calendar.getInstance().apply {
        set(Calendar.HOUR_OF_DAY, hours)
        set(Calendar.MINUTE, minutes - 5)
        set(Calendar.SECOND, 0)

        // Pastikan waktu adalah di masa depan
        if (timeInMillis <= System.currentTimeMillis()) {
            add(Calendar.DAY_OF_YEAR, 1)
        }
    }

    // Set alarm sekali dalam sehari
    alarmManager.setRepeating(
        AlarmManager.RTC_WAKEUP,
        calendar.timeInMillis,
        AlarmManager.INTERVAL_DAY,
        pendingIntent
    )
}