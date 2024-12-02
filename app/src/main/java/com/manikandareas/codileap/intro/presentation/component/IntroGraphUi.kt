package com.manikandareas.codileap.intro.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manikandareas.codileap.intro.model.IntroUi

@Composable
fun IntroGraphUi(intro: IntroUi) {

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {


        Image(
            painter = painterResource(id = intro.image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp, 0.dp),
            alignment = Alignment.Center
        )

        Spacer(
            modifier = Modifier.size(50.dp)
        )

        Text(
            text = intro.title,
            modifier = Modifier.fillMaxWidth(),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .size(16.dp)
        )

        Text(
            text = intro.description,
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp, 0.dp),
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodySmall,
            lineHeight = 24.sp,
            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f),
        )

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .size(60.dp)
        )

    }


}


@Preview(showBackground = true)
@Composable
fun IntroGraphUiPreview1() {
    IntroGraphUi(IntroUi.FirstScreen)
}

@Preview(showBackground = true)
@Composable
fun IntroGraphUiPreview2() {
    IntroGraphUi(IntroUi.SecondScreen)
}

@Preview(showBackground = true)
@Composable
fun IntroGraphUiPreview3() {
    IntroGraphUi(IntroUi.ThirdScreen)
}