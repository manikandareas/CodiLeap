package com.manikandareas.codileap.core.presentation.util

import android.net.Uri
import android.widget.VideoView
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.AsyncImage

@Composable
fun HtmlRenderer(lazyState: LazyListState = rememberLazyListState(), elements: List<HtmlElement>) {
    LazyColumn(
        state = lazyState,
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(elements) { element ->
            when (element) {
                is HtmlElement.Text -> TextElement(element)
                is HtmlElement.Code -> CodeElement(element)
                is HtmlElement.Image -> ImageElement(element)
                is HtmlElement.Link -> LinkElement(element)
                is HtmlElement.HtmlList -> ListElement(element)
                is HtmlElement.Table -> TableElement(element)
                is HtmlElement.Alert -> AlertElement(element)
                is HtmlElement.Divider -> Divider(modifier = Modifier.padding(vertical = 8.dp))
                is HtmlElement.Video -> VideoElement(element)
                is HtmlElement.Interactive -> InteractiveElement(element)
            }
        }
    }
}

@Composable
private fun TextElement(text: HtmlElement.Text) {
    val style = text.style
    val textAlign = when (style.textAlign) {
        TextAlign.Start -> TextAlign.Left
        TextAlign.Center -> TextAlign.Center
        TextAlign.End -> TextAlign.Right
        TextAlign.Justify -> TextAlign.Justify
        else -> {
            TextAlign.Left
        }
    }

    val annotatedString = buildAnnotatedString {
        append(text.content)
        addStyle(
            SpanStyle(
                fontWeight = if (style.isBold) FontWeight.Bold else FontWeight.Normal,
                fontStyle = if (style.isItalic) FontStyle.Italic else FontStyle.Normal,
                textDecoration = when {
                    style.isUnderline && style.isStrikethrough ->
                        TextDecoration.combine(
                            listOf(
                                TextDecoration.Underline,
                                TextDecoration.LineThrough
                            )
                        )

                    style.isUnderline -> TextDecoration.Underline
                    style.isStrikethrough -> TextDecoration.LineThrough
                    else -> TextDecoration.None
                },
                color = style.textColor?.let { Color(android.graphics.Color.parseColor(it)) }
                    ?: Color.Unspecified,
                background = style.backgroundColor?.let { Color(android.graphics.Color.parseColor(it)) }
                    ?: Color.Unspecified
            ),
            0,
            text.content.length
        )
    }

//    val textStyle = when (text.type) {
//        TextType.H1 -> MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
//        TextType.H2 -> MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
//        TextType.H3 -> MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
//        TextType.H4 -> MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
//        TextType.H5 -> MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold)
//        TextType.H6 -> MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold)
//        TextType.BODY -> MaterialTheme.typography.bodyMedium
//        TextType.QUOTE -> MaterialTheme.typography.bodySmall.copy(fontStyle = FontStyle.Italic)
//        TextType.CAPTION -> MaterialTheme.typography.labelSmall
//        TextType.SUBTITLE -> MaterialTheme.typography.labelMedium
//    }

    val textStyle = when (text.type) {
        TextType.H1 -> MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold)
        TextType.H2 -> MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
        TextType.H3 -> MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
        TextType.H4 -> MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
        TextType.H5 -> MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
        TextType.H6 -> MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
        TextType.BODY -> MaterialTheme.typography.bodyMedium
        TextType.QUOTE -> MaterialTheme.typography.bodySmall.copy(fontStyle = FontStyle.Italic)
        TextType.CAPTION -> MaterialTheme.typography.labelSmall
        TextType.SUBTITLE -> MaterialTheme.typography.labelMedium
    }

    Text(
        text = annotatedString,
        modifier = Modifier
            .fillMaxWidth(),
        style = textStyle,
        textAlign = textAlign
    )
}

@Composable
private fun CodeElement(code: HtmlElement.Code) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        color = MaterialTheme.colorScheme.surfaceVariant,
        shape = MaterialTheme.shapes.small
    ) {
        Text(
            text = code.content,
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.bodyMedium,
            fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace
        )
    }
}

@Composable
private fun ImageElement(image: HtmlElement.Image) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = image.url,
            contentDescription = image.alt,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f)
        )

        image.caption?.let {
            Text(
                text = it,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}

@Composable
private fun AlertElement(alert: HtmlElement.Alert) {
    val backgroundColor = when (alert.type) {
        AlertType.INFO -> MaterialTheme.colorScheme.primaryContainer
        AlertType.SUCCESS -> Color(0x8054db4d)
        AlertType.WARNING -> Color(0x80e1ed37)
        AlertType.ERROR -> MaterialTheme.colorScheme.errorContainer
    }

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        color = backgroundColor,
        shape = MaterialTheme.shapes.medium
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            alert.title?.let {
                Text(
                    text = it,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }
            Text(
                text = alert.content,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
private fun ListElement(list: HtmlElement.HtmlList) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        list.items.forEachIndexed { index, item ->
            Row(
                modifier = Modifier.padding(start = (list.level * 16).dp)
            ) {
                Text(
                    text = when {
                        list.ordered -> "${index + 1}. "
                        item.isChecked != null -> if (item.isChecked) "☑ " else "☐ "
                        else -> "• "
                    },
                    style = MaterialTheme.typography.bodyMedium
                )

                Column {
                    Text(
                        text = item.content,
                        style = MaterialTheme.typography.bodyMedium
                    )

                    if (item.subItems.isNotEmpty()) {
                        HtmlRenderer(
                            elements = listOf(
                                HtmlElement.HtmlList(
                                    items = item.subItems,
                                    ordered = list.ordered,
                                    level = list.level + 1
                                )
                            )
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun LinkElement(link: HtmlElement.Link) {
    val uriHandler = LocalUriHandler.current

    Text(
        text = link.text,
        color = MaterialTheme.colorScheme.primary,
        textDecoration = TextDecoration.Underline,
        modifier = Modifier
            .clickable {
                try {
                    uriHandler.openUri(link.url)
                } catch (e: Exception) {
                    // Handle error opening URL
                }
            }
            .padding(horizontal = 16.dp),
        style = MaterialTheme.typography.bodyMedium
    )
}

@Composable
fun TableElement(table: HtmlElement.Table) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        // Optional caption
        table.caption?.let {
            Text(
                text = it,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }

        // Table content with scrollable surface
        Surface(
            modifier = Modifier.fillMaxWidth(),
            shape = MaterialTheme.shapes.small,
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
        ) {
            Column {
                // Headers
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .padding(8.dp)
                ) {
                    table.headers.forEach { header ->
                        Text(
                            text = header,
                            modifier = Modifier
                                .weight(1f)
                                .padding(horizontal = 4.dp),
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                // Rows
                table.rows.forEach { row ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        row.forEach { cell ->
                            Text(
                                text = cell,
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(horizontal = 4.dp),
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                    Divider()
                }
            }
        }
    }
}

@Composable
fun VideoElement(video: HtmlElement.Video) {
    var isPlaying by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        // Video title if available
        video.title?.let {
            Text(
                text = it,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }

        // Video player
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f)
                .clip(MaterialTheme.shapes.medium)
        ) {
            AndroidView(
                factory = { context ->
                    VideoView(context).apply {
                        setVideoURI(Uri.parse(video.url))
                        setOnPreparedListener { mediaPlayer ->
                            mediaPlayer.isLooping = true
                        }
                    }
                },
                modifier = Modifier.fillMaxSize(),
                update = { view ->
                    if (isPlaying) view.start() else view.pause()
                }
            )

            // Play/Pause overlay
            IconButton(
                onClick = { isPlaying = !isPlaying },
                modifier = Modifier.align(Alignment.Center)
            ) {
                Icon(
                    imageVector = if (isPlaying)
                        Icons.Filled.Pause else Icons.Filled.PlayArrow,
                    contentDescription = if (isPlaying) "Pause" else "Play",
                    tint = Color.White
                )
            }
        }
    }
}

@Composable
fun InteractiveElement(interactive: HtmlElement.Interactive) {
    when (interactive.type) {
        InteractiveType.QUIZ -> QuizElement(interactive)
        InteractiveType.CODE_PLAYGROUND -> CodePlaygroundElement(interactive)
        InteractiveType.FLASHCARD -> FlashcardElement(interactive)
        InteractiveType.DRAG_AND_DROP -> DragAndDropElement(interactive)
        InteractiveType.FILL_IN_BLANK -> FillInBlankElement(interactive)
    }
}

@Composable
private fun QuizElement(interactive: HtmlElement.Interactive) {
    var selectedAnswer by remember { mutableStateOf<String?>(null) }
    val questions = interactive.data["questions"] as? List<Map<String, Any>> ?: emptyList()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        questions.forEach { question ->
            Text(
                text = question["question"] as? String ?: "",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            val options = question["options"] as? List<String> ?: emptyList()
            options.forEach { option ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { selectedAnswer = option }
                        .padding(vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = selectedAnswer == option,
                        onClick = { selectedAnswer = option }
                    )
                    Text(
                        text = option,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun CodePlaygroundElement(interactive: HtmlElement.Interactive) {
    var code by remember { mutableStateOf(interactive.data["initialCode"] as? String ?: "") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        TextField(
            value = "",
            onValueChange = {}
        )
        TextField(
            value = code,
            onValueChange = { code = it },
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(200.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            textStyle = TextStyle(
                fontFamily = FontFamily.Monospace,
                fontSize = 14.sp
            )
        )

        Button(
            onClick = { /* Handle run code */ },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Run Code")
        }
    }
}

@Composable
private fun FlashcardElement(interactive: HtmlElement.Interactive) {
    var isFlipped by remember { mutableStateOf(false) }
    val frontContent = interactive.data["front"] as? String ?: ""
    val backContent = interactive.data["back"] as? String ?: ""

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(16.dp)
            .clickable { isFlipped = !isFlipped },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = if (isFlipped) backContent else frontContent,
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
private fun DragAndDropElement(interactive: HtmlElement.Interactive) {
    var items by remember {
        mutableStateOf(
            interactive.data["items"] as? List<String> ?: emptyList()
        )
    }

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        items(items) { item ->
            Card(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Text(
                    text = item,
                    modifier = Modifier.padding(8.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
private fun FillInBlankElement(interactive: HtmlElement.Interactive) {
    val text = interactive.data["text"] as? String ?: ""
    val blanks = interactive.data["blanks"] as? Map<String, String> ?: emptyMap()
    var answers by remember { mutableStateOf(blanks.mapValues { "" }.toMutableMap()) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        blanks.forEach { (key, hint) ->
            OutlinedTextField(
                value = answers[key] ?: "",
                onValueChange = { answers[key] = it },
                label = { Text(hint) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            )
        }
    }
}
