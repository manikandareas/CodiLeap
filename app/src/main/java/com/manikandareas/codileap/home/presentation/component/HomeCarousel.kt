package com.manikandareas.codileap.home.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material3.Badge
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import coil.compose.AsyncImage
import coil.compose.SubcomposeAsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.manikandareas.codileap.home.presentation.model.CarouselItemUi
import com.manikandareas.codileap.home.presentation.model.CarouselUi
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import kotlin.math.absoluteValue
import com.manikandareas.codileap.R
import com.manikandareas.codileap.core.presentation.util.truncateWithEllipsis
import com.manikandareas.codileap.home.presentation.model.DummyCarouselUi

@Composable
fun HomeCarousel(carouselUi: CarouselUi, modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState(initialPage = 0) {
        carouselUi.items.size
    }

    // Calculate the total padding for showing part of next/previous items
    val horizontalPadding = 32.dp
    val contentPadding = PaddingValues(horizontal = horizontalPadding)

    HorizontalPager(
        state = pagerState,
        modifier = modifier
    ) { index ->
        CardContent(carouselUi.items[index], index, pagerState)
    }
}

@Composable
fun CardContent(itemUi: CarouselItemUi, index: Int, pagerState: PagerState) {
    val pageOffset = (pagerState.currentPage - index) + pagerState.currentPageOffsetFraction
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .graphicsLayer {
                lerp(
                    start = 0.85f.dp,
                    stop = 1f.dp,
                    fraction = 1f - pageOffset.absoluteValue.coerceIn(0f, 1f),
                ).also { scale ->
                    scaleX = scale.value
                    scaleY = scale.value
                }
                alpha = lerp(
                    start = 0.5.dp,
                    stop = 1f.dp,
                    fraction = 1f - pageOffset.absoluteValue.coerceIn(0f, 1f),
                ).value
            }
            .height(250.dp),
        colors = CardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer,
            contentColor = MaterialTheme.colorScheme.onSurface,
            disabledContentColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
            disabledContainerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.6f),
            )
    ) {
        Column {
            SubcomposeAsyncImage(
                modifier = Modifier
                    .height(122.dp)
                    .fillMaxWidth(),
                model = ImageRequest.Builder(LocalContext.current)
                    .data(itemUi.imageUrl)
                    .crossfade(true)
                    .scale(Scale.FILL)
                    .build(),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                error = {
                    if (LocalInspectionMode.current) {
                        Image(
                            painter = painterResource(R.drawable.ic_placeholder),
                            contentDescription
                        )
                    }
                }
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = itemUi.title?.truncateWithEllipsis(30) ?: "No Title",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier
                        .fillMaxWidth()
                )

                Text(
                    text = itemUi.subtitle?.truncateWithEllipsis(24) ?: "No Description",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                    modifier = Modifier
                        .fillMaxWidth()
                )

                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Book,
                            contentDescription = "Module",
                            tint = MaterialTheme.colorScheme.primary
                        )
                        Text(
                            text = "${itemUi.moduleCount} Modules" ?: "No Module",
                            style = MaterialTheme.typography.labelSmall,
                            modifier = Modifier.padding(start = 4.dp),
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                        )
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Groups,
                            contentDescription = "Users",
                            tint = MaterialTheme.colorScheme.primary,

                            )
                        Text(
                            text = "${itemUi.userCount} Users" ?: "No Module",
                            style = MaterialTheme.typography.labelSmall,
                            modifier = Modifier.padding(start = 4.dp),
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                        )
                    }
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
fun PreviewHomeCarousel(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        HomeCarousel(carouselUi = DummyCarouselUi)
    }
}