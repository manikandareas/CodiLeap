package com.manikandareas.codileap.courses.presentation.model

data class ModuleUi(
    val title: String,
    val description: String,
    val lessons: List<LessonUi>
)

data class LessonUi(
    val title: String,
    val durationInMinutes: Int,
    val units: List<UnitUi>
)

data class UnitUi (
    val title:String,
    val durationInMinutes:Int
)

// Data untuk setiap learning path dengan lessons dan units
val DummyLearningPaths = mapOf(
    // Machine Learning Path
    "Machine Learning" to listOf(
        ModuleUi(
            title = "Introduction to Machine Learning",
            description = "Learn the basics and foundations of Machine Learning.",
            lessons = listOf(
                LessonUi(
                    title = "What is Machine Learning?",
                    durationInMinutes = 10,
                    units = listOf(
                        UnitUi("Definition and Overview", 5),
                        UnitUi("Key Applications", 5)
                    )
                ),
                LessonUi(
                    title = "History of Machine Learning",
                    durationInMinutes = 8,
                    units = listOf(
                        UnitUi("Early Beginnings", 4),
                        UnitUi("Modern Developments", 4)
                    )
                ),
                LessonUi(
                    title = "Types of Machine Learning",
                    durationInMinutes = 12,
                    units = listOf(
                        UnitUi("Supervised Learning", 6),
                        UnitUi("Unsupervised Learning", 6)
                    )
                )
            )
        ),
        ModuleUi(
            title = "Supervised Learning",
            description = "Explore the concepts of supervised learning.",
            lessons = listOf(
                LessonUi(
                    title = "Linear Regression",
                    durationInMinutes = 15,
                    units = listOf(
                        UnitUi("Understanding Linear Relationships", 7),
                        UnitUi("Implementing Linear Regression", 8)
                    )
                ),
                LessonUi(
                    title = "Classification Algorithms",
                    durationInMinutes = 18,
                    units = listOf(
                        UnitUi("Decision Trees", 9),
                        UnitUi("Support Vector Machines", 9)
                    )
                )
            )
        )
    ),

    // Mobile Development Path
    "Mobile Development" to listOf(
        ModuleUi(
            title = "Introduction to Mobile Development",
            description = "Understand mobile platforms and development tools.",
            lessons = listOf(
                LessonUi(
                    title = "Overview of Mobile Platforms",
                    durationInMinutes = 8,
                    units = listOf(
                        UnitUi("Android vs iOS", 4),
                        UnitUi("Development Ecosystems", 4)
                    )
                ),
                LessonUi(
                    title = "Setting up Development Environment",
                    durationInMinutes = 12,
                    units = listOf(
                        UnitUi("Installing SDKs", 6),
                        UnitUi("Configuring IDEs", 6)
                    )
                )
            )
        ),
        ModuleUi(
            title = "User Interface Design",
            description = "Learn the principles of UI design for mobile apps.",
            lessons = listOf(
                LessonUi(
                    title = "Introduction to UI Design",
                    durationInMinutes = 10,
                    units = listOf(
                        UnitUi("UI Principles", 5),
                        UnitUi("UX Basics", 5)
                    )
                )
            )
        )
    ),

    // Cloud Computing Path
    "Cloud Computing" to listOf(
        ModuleUi(
            title = "Introduction to Cloud Computing",
            description = "Understand the basics of cloud services and infrastructure.",
            lessons = listOf(
                LessonUi(
                    title = "What is Cloud Computing?",
                    durationInMinutes = 10,
                    units = listOf(
                        UnitUi("Cloud Basics", 5),
                        UnitUi("Importance in Modern Tech", 5)
                    )
                ),
                LessonUi(
                    title = "Types of Cloud Models",
                    durationInMinutes = 8,
                    units = listOf(
                        UnitUi("Public Cloud", 4),
                        UnitUi("Private Cloud", 4)
                    )
                )
            )
        )
    )
)
