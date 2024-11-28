package com.manikandareas.codileap.courses.data.dummy

import com.manikandareas.codileap.courses.domain.Course
import com.manikandareas.codileap.courses.domain.LearningPath
import com.manikandareas.codileap.courses.domain.LearningPathLevel
import com.manikandareas.codileap.courses.domain.Module
import com.manikandareas.codileap.courses.domain.Unit

val mobileDevelopmentDummy = listOf(
    LearningPath(
        id = 1,
        name = "Mobile Development - Beginner",
        level = LearningPathLevel.BEGINNER,
        description = "Introduction to mobile app development.",
        createdAt = "2024-01-01",
        updatedAt = "2024-01-02",
        estimatedDuration = "2 months",
        courses = listOf(
            Course(
                id = 1,
                name = "Kotlin Basics",
                learningPathId = 1,
                totalModules = 2,
                description = "Learn the fundamentals of Kotlin.",
                createdAt = "2024-01-01",
                updatedAt = "2024-01-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 1,
                        courseId = 1,
                        name = "Introduction to Kotlin",
                        description = "Understanding Kotlin basics.",
                        orderIndex = 1,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 1,
                                moduleId = 1,
                                name = "Hello World in Kotlin",
                                orderIndex = 1,
                                content = "Learn to create your first program in Kotlin.",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 2,
                                moduleId = 1,
                                name = "Variables and Data Types",
                                orderIndex = 2,
                                content = "Understanding variables and data types in Kotlin.",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            )
                        )
                    ),
                    Module(
                        id = 2,
                        courseId = 1,
                        name = "Control Flow in Kotlin",
                        description = "Learn about conditions and loops.",
                        orderIndex = 2,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 3,
                                moduleId = 2,
                                name = "If-Else Statements",
                                orderIndex = 1,
                                content = "How to use if-else in Kotlin.",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 4,
                                moduleId = 2,
                                name = "Loops in Kotlin",
                                orderIndex = 2,
                                content = "Understanding loops (for, while) in Kotlin.",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            )
                        )
                    )
                )
            )
        )
    ),
    LearningPath(
        id = 2,
        name = "Mobile Development - Intermediate",
        level = LearningPathLevel.INTERMEDIATE,
        description = "Advance your mobile app development skills.",
        createdAt = "2024-01-01",
        updatedAt = "2024-01-02",
        estimatedDuration = "3 months",
        courses = listOf(
            Course(
                id = 2,
                name = "Android UI Design",
                learningPathId = 2,
                totalModules = 2,
                description = "Learn to design interactive user interfaces for Android apps.",
                createdAt = "2024-01-01",
                updatedAt = "2024-01-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 3,
                        courseId = 2,
                        name = "Layouts in Android",
                        description = "Explore different layouts like LinearLayout and ConstraintLayout.",
                        orderIndex = 1,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 5,
                                moduleId = 3,
                                name = "LinearLayout Basics",
                                orderIndex = 1,
                                content = "Learn to structure UI with LinearLayout.",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 6,
                                moduleId = 3,
                                name = "ConstraintLayout Overview",
                                orderIndex = 2,
                                content = "How to use ConstraintLayout effectively.",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            )
                        )
                    )
                )
            )
        )
    ),
    LearningPath(
        id = 3,
        name = "Mobile Development - Advanced",
        level = LearningPathLevel.ADVANCED,
        description = "Master mobile app development.",
        createdAt = "2024-01-01",
        updatedAt = "2024-01-02",
        estimatedDuration = "4 months",
        courses = listOf(
            Course(
                id = 3,
                name = "Advanced Android Architecture",
                learningPathId = 3,
                totalModules = 3,
                description = "Learn modern architecture for scalable apps.",
                createdAt = "2024-01-01",
                updatedAt = "2024-01-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 4,
                        courseId = 3,
                        name = "MVVM Architecture",
                        description = "Understand MVVM pattern for app development.",
                        orderIndex = 1,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 7,
                                moduleId = 4,
                                name = "ViewModel and LiveData",
                                orderIndex = 1,
                                content = "Integrating ViewModel and LiveData in your app.",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            )
                        )
                    )
                )
            )
        )
    )
)

// Repeat for DevOps and Machine Learning with similar structures
