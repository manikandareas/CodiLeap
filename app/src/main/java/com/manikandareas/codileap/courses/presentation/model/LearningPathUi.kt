package com.manikandareas.codileap.courses.presentation.model

import com.manikandareas.codileap.core.presentation.util.toUTC
import com.manikandareas.codileap.courses.domain.LearningPath
import com.manikandareas.codileap.home.presentation.model.CarouselItemUi
import com.manikandareas.codileap.home.presentation.model.CarouselUi
import com.manikandareas.codileap.home.presentation.model.DummyCarouselUi
import java.time.ZonedDateTime

data class LearningPathUi(
    override val id: Int,
    override val name: String,
    override val description: String,

    override val totalModules: Int,

    val courses: List<CourseUi>,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime
) : HasBasicCourse


fun LearningPath.toUiModel(): LearningPathUi {

    return LearningPathUi(
        id = id,
        name = name,
        description = description,

        totalModules = courses.sumOf { it.totalModules },

        courses = courses.map { it.toUiModel() },
        createdAt = ZonedDateTime.parse(createdAt.toUTC()),
        updatedAt = ZonedDateTime.parse(updatedAt.toUTC()),
    )
}

fun LearningPathUi.toCarouselItemUi( onClick: ()->Unit, index: Int=0) = CarouselItemUi(
    title = name,
    subtitle = description,
    moduleCount = totalModules,
    userCount = courses.first().totalEnrollments,
    imageUrl = DummyCarouselUi.items[index].imageUrl,
    onClick = onClick
)