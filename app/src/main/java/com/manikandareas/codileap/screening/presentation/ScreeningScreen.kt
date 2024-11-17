package com.manikandareas.codileap.screening.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.screening.presentation.component.ScreeningAppBar
import com.manikandareas.codileap.screening.presentation.component.ScreeningAppBarUi
import com.manikandareas.codileap.screening.presentation.component.ScreeningExperience
import com.manikandareas.codileap.screening.presentation.component.ScreeningMotive
import com.manikandareas.codileap.screening.presentation.component.ScreeningName
import com.manikandareas.codileap.screening.presentation.component.ScreeningWelcome
import com.manikandareas.codileap.screening.presentation.model.ScreeningUi
import com.manikandareas.codileap.ui.theme.CodiLeapTheme


@Composable
fun ScreeningScreen(onAction: (ScreeningAction) -> Unit, modifier: Modifier = Modifier) {

    val pages: List<@Composable () -> Unit> = listOf(
        { ScreeningWelcome(modifier = Modifier.fillMaxWidth()) },
        { ScreeningName(modifier = Modifier.fillMaxWidth()) },
        { ScreeningMotive(modifier = Modifier.fillMaxWidth()) },
        { ScreeningExperience(modifier = Modifier.fillMaxWidth()) },
    )

    val pagerState = rememberPagerState(initialPage = 0) {
        pages.size
    }

    val appBarState = remember {
        derivedStateOf {
            when (pagerState.currentPage) {
                0 -> ScreeningAppBarUi(title = "Introduction")
                1 -> ScreeningAppBarUi(title = "Personal Information")
                2 -> ScreeningAppBarUi(title = "Motive")
                3 -> ScreeningAppBarUi(title = "Experience")
                else -> ScreeningAppBarUi()
            }
        }
    }
    val buttonState = remember {
        derivedStateOf {
            when (pagerState.currentPage) {
                0 -> "Let's Go"
                1 -> "Continue"
                2 -> "Continue"
                3 -> "Finish"
                else -> listOf("", "")
            }
        }
    }

    val scope = rememberCoroutineScope()


    Scaffold(
        topBar = {
            ScreeningAppBar(
                appBarUi = appBarState.value,
                modifier = Modifier.fillMaxWidth()
            )
        },
        bottomBar = {
            Box(modifier = Modifier.padding(16.dp)) {
                Button(
                    onClick = { onAction(ScreeningAction.NavigateTo(Destination.HomeGraph)) },
                    modifier = Modifier.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Text("Let's Go")
                }
            }
        },
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {

//            if (pagerState.currentPage != 0) {
//                Text(
//                    text = "Steps 1/6",
//                    style = MaterialTheme.typography.bodyMedium,
//                    color = MaterialTheme.colorScheme.onSurface.copy(
//                        alpha = 0.6F
//                    )
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//            }
            HorizontalPager(
                state = pagerState, modifier = Modifier.fillMaxWidth(),
                pageContent = { page ->
                    pages[page]()
                }
            )
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewScreeningScreen(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        ScreeningScreen(modifier = modifier, onAction = {})
    }
}