package com.manikandareas.codileap.core.presentation.util

import androidx.compose.ui.text.style.TextAlign
import org.jsoup.Jsoup
import org.jsoup.nodes.Element

sealed class HtmlElement {
    data class Text(
        val content: String,
        val type: TextType = TextType.BODY,
        val style: TextStyle = TextStyle()
    ) : HtmlElement()

    data class Code(
        val content: String,
        val language: String? = null,
        val isInline: Boolean = false
    ) : HtmlElement()

    data class Image(
        val url: String,
        val alt: String,
        val width: Int? = null,
        val height: Int? = null,
        val caption: String? = null
    ) : HtmlElement()

    data class Link(
        val text: String,
        val url: String,
        val isExternal: Boolean = false
    ) : HtmlElement()

    data class HtmlList(
        val items: List<ListItem>,
        val ordered: Boolean = false,
        val level: Int = 0,
        val style: ListStyle? = null
    ) : HtmlElement()

    data class Table(
        val headers: List<String>,
        val rows: List<List<String>>,
        val caption: String? = null
    ) : HtmlElement()

    data class Alert(
        val content: String,
        val type: AlertType,
        val title: String? = null
    ) : HtmlElement()

    data class Divider(val any: Any? = null) : HtmlElement()

    data class Video(
        val url: String,
        val thumbnail: String? = null,
        val title: String? = null
    ) : HtmlElement()

    data class Interactive(
        val type: InteractiveType,
        val data: Map<String, Any>
    ) : HtmlElement()
}

data class ListItem(
    val content: String,
    val subItems: List<ListItem> = emptyList(),
    val isChecked: Boolean? = null // untuk checkbox lists
)

data class TextStyle(
    val isBold: Boolean = false,
    val isItalic: Boolean = false,
    val isUnderline: Boolean = false,
    val isStrikethrough: Boolean = false,
    val textAlign: TextAlign = TextAlign.Start,
    val textColor: String? = null,
    val backgroundColor: String? = null
)

enum class TextType {
    H1, H2, H3, H4, H5, H6, BODY, QUOTE, CAPTION, SUBTITLE
}

enum class TextAlign {
    LEFT, CENTER, RIGHT, JUSTIFY
}

enum class AlertType {
    INFO, SUCCESS, WARNING, ERROR
}

enum class ListStyle {
    BULLET, NUMBER, CHECKBOX, CUSTOM
}

enum class InteractiveType {
    QUIZ,
    CODE_PLAYGROUND,
    FLASHCARD,
    DRAG_AND_DROP,
    FILL_IN_BLANK
}

class HtmlParser {
    fun parseHtml(html: String): List<HtmlElement> {
        val document = Jsoup.parse(html)
        return document.body().children().map { parseElement(it) }.filterNotNull()
    }

    private fun parseElement(element: Element): HtmlElement? {
        return when (element.tagName().toLowerCase()) {
            // Headings
            "h1" -> HtmlElement.Text(element.text(), TextType.H1)
            "h2" -> HtmlElement.Text(element.text(), TextType.H2)
            "h3" -> HtmlElement.Text(element.text(), TextType.H3)
            "h4" -> HtmlElement.Text(element.text(), TextType.H4)
            "h5" -> HtmlElement.Text(element.text(), TextType.H5)
            "h6" -> HtmlElement.Text(element.text(), TextType.H6)

            // Paragraphs and text formatting
            "p" -> parseTextWithStyles(element)
            "strong", "b" -> parseTextWithStyles(element, TextStyle(isBold = true))
            "em", "i" -> parseTextWithStyles(element, TextStyle(isItalic = true))
            "u" -> parseTextWithStyles(element, TextStyle(isUnderline = true))
            "strike", "s", "del" -> parseTextWithStyles(element, TextStyle(isStrikethrough = true))

            // Code blocks
            "pre" -> {
                val code = element.getElementsByTag("code").firstOrNull()
                HtmlElement.Code(
                    content = code?.text() ?: element.text(),
                    language = code?.attr("class")?.removePrefix("language-"),
                    isInline = false
                )
            }

            "code" -> HtmlElement.Code(
                content = element.text(),
                isInline = true
            )

            // Lists
            "ul", "ol" -> parseList(element)

            // Tables
            "table" -> parseTable(element)

            // Media
            "img" -> HtmlElement.Image(
                url = element.attr("src"),
                alt = element.attr("alt"),
                width = element.attr("width").toIntOrNull(),
                height = element.attr("height").toIntOrNull(),
                caption = element.parent()?.getElementsByTag("figcaption")?.text()
            )

            "video" -> HtmlElement.Video(
                url = element.attr("src"),
                thumbnail = element.attr("poster"),
                title = element.attr("title")
            )

            // Links
            "a" -> HtmlElement.Link(
                text = element.text(),
                url = element.attr("href"),
                isExternal = element.attr("href").startsWith("http")
            )

            // Dividers
            "hr" -> HtmlElement.Divider()

            // Custom elements
            "div" -> when {
                element.hasClass("alert") -> parseAlert(element)
                element.hasClass("interactive") -> parseInteractive(element)
                else -> parseTextWithStyles(element)
            }

            // Blockquotes
            "blockquote" -> HtmlElement.Text(
                content = element.text(),
                type = TextType.QUOTE,
                style = TextStyle(isItalic = true)
            )

            else -> null
        }
    }

    private fun parseTextWithStyles(
        element: Element,
        baseStyle: TextStyle = TextStyle()
    ): HtmlElement.Text {
        val style = baseStyle.copy(
            textAlign = when {
                element.hasClass("text-center") -> TextAlign.Center
                element.hasClass("text-right") -> TextAlign.End
                element.hasClass("text-justify") -> TextAlign.Justify
                else -> TextAlign.Start
            },
            textColor = element.attr("color").takeIf { it.isNotEmpty() },
            backgroundColor = element.attr("background-color").takeIf { it.isNotEmpty() }
        )

        return HtmlElement.Text(
            content = element.text(),
            type = TextType.BODY,
            style = style
        )
    }

    private fun parseList(element: Element): HtmlElement.HtmlList {
        val items = element.children().map { listItem ->
            ListItem(
                content = listItem.ownText(),
                subItems = listItem.getElementsByTag("ul")
                    .firstOrNull()
                    ?.children()
                    ?.map { ListItem(it.text()) }
                    ?: emptyList(),
                isChecked = when {
                    listItem.hasClass("checked") -> true
                    listItem.hasClass("unchecked") -> false
                    else -> null
                }
            )
        }

        return HtmlElement.HtmlList(
            items = items,
            ordered = element.tagName() == "ol",
            style = when {
                element.hasClass("checklist") -> ListStyle.CHECKBOX
                element.hasClass("custom") -> ListStyle.CUSTOM
                else -> if (element.tagName() == "ol") ListStyle.NUMBER else ListStyle.BULLET
            }
        )
    }

    private fun parseTable(element: Element): HtmlElement.Table {
        val headers = element.getElementsByTag("th").map { it.text() }
        val rows = element.getElementsByTag("tr")
            .map { row ->
                row.getElementsByTag("td").map { it.text() }
            }
            .filter { it.isNotEmpty() }

        return HtmlElement.Table(
            headers = headers,
            rows = rows,
            caption = element.getElementsByTag("caption").firstOrNull()?.text()
        )
    }

    private fun parseAlert(element: Element): HtmlElement.Alert {
        val type = when {
            element.hasClass("alert-info") -> AlertType.INFO
            element.hasClass("alert-success") -> AlertType.SUCCESS
            element.hasClass("alert-warning") -> AlertType.WARNING
            element.hasClass("alert-error") -> AlertType.ERROR
            else -> AlertType.INFO
        }

        return HtmlElement.Alert(
            content = element.text(),
            type = type,
            title = element.getElementsByClass("alert-title").firstOrNull()?.text()
        )
    }

    private fun parseInteractive(element: Element): HtmlElement.Interactive {
        val type = when {
            element.hasClass("quiz") -> InteractiveType.QUIZ
            element.hasClass("code-playground") -> InteractiveType.CODE_PLAYGROUND
            element.hasClass("flashcard") -> InteractiveType.FLASHCARD
            element.hasClass("drag-drop") -> InteractiveType.DRAG_AND_DROP
            element.hasClass("fill-blank") -> InteractiveType.FILL_IN_BLANK
            else -> InteractiveType.QUIZ
        }

        val data = mutableMapOf<String, Any>()
        element.attributes().forEach { attr ->
            data[attr.key] = attr.value
        }

        return HtmlElement.Interactive(type, data)
    }
}