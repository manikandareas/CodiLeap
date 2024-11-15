package com.manikandareas.codileap.analytics.presentation.component

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CatchingPokemon
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import co.yml.charts.ui.barchart.BarChart
import com.manikandareas.codileap.R
import com.manikandareas.codileap.analytics.presentation.model.ChronotypeIconOption
import com.manikandareas.codileap.analytics.presentation.model.ChronotypeUi
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun CardChronotype(chronotypeUi: ChronotypeUi, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .clip(MaterialTheme.shapes.medium)
            .background(MaterialTheme.colorScheme.surfaceContainer),
        shape = MaterialTheme.shapes.medium,
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    imageVector = Icons.Default.CatchingPokemon,
                    contentDescription = "Chronotype Icon"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Chronotype",
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = chronotypeUi.chronotypeIcon),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(fraction = 0.8F)
                )
            }

        }
    }
}

@PreviewLightDark
@Composable
fun PreviewCardChronotype(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        CardChronotype(
            modifier = modifier,
            chronotypeUi = ChronotypeUi(chronotypeIcon = ChronotypeIconOption.bear)
        )
    }
}