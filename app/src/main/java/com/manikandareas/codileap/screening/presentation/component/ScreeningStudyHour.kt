@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.screening.presentation.component

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TimeInput
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.R
import com.manikandareas.codileap.core.data.preference.PreferenceDataSource
import com.manikandareas.codileap.core.worker.StudyScheduleSetup
import org.koin.compose.getKoin
import java.util.Calendar

@SuppressLint("DefaultLocale")
@Composable
fun ScreeningStudyHour(modifier: Modifier = Modifier) {
    val currentTime = Calendar.getInstance()
    val dataSource = getKoin().get<PreferenceDataSource>()

    val timePickerState = rememberTimePickerState(
        initialHour = currentTime.get(Calendar.HOUR_OF_DAY),
        initialMinute = currentTime.get(Calendar.MINUTE),
        is24Hour = true,
    )

    val formattedTime = remember(timePickerState) {
        String.format("%02d:%02d",
            timePickerState.hour,
            timePickerState.minute
        )
    }
//    val myService = get<MyService>()

    StudyScheduleSetup(
        timeInput = formattedTime,
        onTimeSet = {
        },
        dataSource = dataSource
    )
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            "What time of day do you usually study?",
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),

            )
        Spacer(modifier = Modifier.height(32.dp))

        Image(
            painter = painterResource(id = R.drawable.cactus),
            contentDescription = "Cactus",
            modifier = Modifier.size(138.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))

        TimeInput(
            state = timePickerState,
        )

    }
}