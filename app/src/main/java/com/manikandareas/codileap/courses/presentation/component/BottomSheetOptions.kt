package com.manikandareas.codileap.courses.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.CollectionsBookmark
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalBottomSheetProperties
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.manikandareas.codileap.R
//import com.manikandareas.codileap.courses.data.dummy.learningPathsDummy
import com.manikandareas.codileap.courses.presentation.model.HasBasicCourse
import com.manikandareas.codileap.courses.presentation.model.LearningPathUi
import com.manikandareas.codileap.courses.presentation.model.toUiModel
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

enum class Options {
    COURSE,
    LEARNING
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun <T : HasBasicCourse> BottomSheetOptions(
    onDismiss: () -> Unit,
    onItemClick: (String) -> Unit,
    title: String = "Learning Path",
    type: Options,
    items: List<T>,
    sheetState: SheetState,
    modifier: Modifier = Modifier
) {
    val typeString = when (type) {
        Options.LEARNING -> "Learning Path"
        Options.COURSE -> "Course"
    }
    ModalBottomSheet(
        onDismissRequest = {
            onDismiss()
        },
        sheetState = sheetState,
        properties = ModalBottomSheetProperties(
            shouldDismissOnBackPress = true
        ),
        dragHandle = {}
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = title, style = MaterialTheme.typography.titleMedium)
                    },
                    actions = {
                        IconButton(onClick = { onDismiss() }) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "Close",
                            )
                        }
                    },
                )
            },

            modifier = modifier.fillMaxSize(),
        ) { innerPadding ->

            LazyColumn(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(22.dp)
            ) {


                items(items, key = { it.id }) { item ->
                    Card(
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer),
                        modifier = modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .clickable(enabled = true, onClick = { onItemClick("") }),

                        ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_lesson_item),
                                contentDescription = typeString,
                                modifier = Modifier
                                    .size(48.dp)
                                    .clip(MaterialTheme.shapes.large)
                                    .background(MaterialTheme.colorScheme.onSurface)
                                    .padding(10.dp)
                            )
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                Text(
                                    text = item.name ?: "No Title",
                                    style = MaterialTheme.typography.titleMedium
                                )
                                Row(
                                    modifier = Modifier,
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                                ) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Icon(
                                            imageVector = Icons.Default.CollectionsBookmark,
                                            contentDescription = typeString,
                                            tint = MaterialTheme.colorScheme.primary,
                                            modifier = Modifier.size(16.dp)
                                        )
                                        Text(
                                            text = "${item.totalModules} $typeString"
                                                ?: "No $typeString",
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
            }
        }
    }
}

//@OptIn(ExperimentalMaterial3Api::class)
//@PreviewLightDark
//@Composable
//fun PreviewLearningPathOption(modifier: Modifier = Modifier) {
//    CodiLeapTheme {
//        BottomSheetOptions<LearningPathUi>(
//            onDismiss = {},
//            sheetState = rememberModalBottomSheetState(),
//            onItemClick = {},
//            title = "Learning Path",
//            items = learningPathsDummy.map { it.toUiModel() },
//            type = Options.LEARNING
//        )
//    }
//}