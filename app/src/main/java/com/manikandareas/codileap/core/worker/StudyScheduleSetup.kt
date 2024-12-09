package com.manikandareas.codileap.core.worker

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import com.manikandareas.codileap.core.data.preference.PreferenceDataSource

@Composable
fun StudyScheduleSetup(
    timeInput: String, // Asumsi ini adalah waktu dari komponen TimeInput Anda
    onTimeSet: (String) -> Unit,
    dataSource: PreferenceDataSource,
) {
    val context = LocalContext.current
//    val scope = rememberCoroutineScope()

    // Proses penyimpanan dan setup reminder
    LaunchedEffect(timeInput) {
        if (timeInput.isNotBlank()) {
            // Simpan ke DataStore
            dataSource.saveStudyTime(timeInput)
            println("Study time saved: $timeInput")

            // Setup reminder
            setupStudyReminder(context, timeInput)

            // Panggil callback optional
            onTimeSet(timeInput)
        }
    }
}
