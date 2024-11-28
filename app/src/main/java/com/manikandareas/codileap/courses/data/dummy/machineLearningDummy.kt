package com.manikandareas.codileap.courses.data.dummy

import com.manikandareas.codileap.courses.domain.Course
import com.manikandareas.codileap.courses.domain.LearningPath
import com.manikandareas.codileap.courses.domain.LearningPathLevel
import com.manikandareas.codileap.courses.domain.Module
import com.manikandareas.codileap.courses.domain.Unit

// Machine Learning Learning Paths
val machineLearningDummy = listOf(
    LearningPath(
        id = 7,
        name = "Machine Learning - Beginner",
        level = LearningPathLevel.BEGINNER,
        description = "Learn the basics of Machine Learning, including concepts and tools.",
        createdAt = "2024-03-01",
        updatedAt = "2024-03-02",
        estimatedDuration = "2 months",
        courses = listOf(
            Course(
                id = 7,
                name = "Introduction to Machine Learning",
                learningPathId = 7,
                totalModules = 2,
                description = "Understand the foundational concepts of Machine Learning.",
                createdAt = "2024-03-01",
                updatedAt = "2024-03-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 8,
                        courseId = 7,
                        name = "Machine Learning Basics",
                        description = "Learn what Machine Learning is and how it works.",
                        orderIndex = 1,
                        createdAt = "2024-03-01",
                        updatedAt = "2024-03-02",
                        units = listOf(
                            Unit(
                                id = 14,
                                moduleId = 8,
                                name = "What is Machine Learning?",
                                orderIndex = 1,
                                content = "Overview of Machine Learning concepts.",
                                createdAt = "2024-03-01",
                                updatedAt = "2024-03-02"
                            ),
                            Unit(
                                id = 15,
                                moduleId = 8,
                                name = "Supervised and Unsupervised Learning",
                                orderIndex = 2,
                                content = "Learn about different types of Machine Learning.",
                                createdAt = "2024-03-01",
                                updatedAt = "2024-03-02"
                            )
                        )
                    )
                )
            )
        )
    ),
    LearningPath(
        id = 8,
        name = "Machine Learning - Intermediate",
        level = LearningPathLevel.INTERMEDIATE,
        description = "Explore advanced Machine Learning models and techniques.",
        createdAt = "2024-03-01",
        updatedAt = "2024-03-02",
        estimatedDuration = "3 months",
        courses = listOf(
            Course(
                id = 8,
                name = "Building Machine Learning Models",
                learningPathId = 8,
                totalModules = 3,
                description = "Learn how to create and optimize Machine Learning models.",
                createdAt = "2024-03-01",
                updatedAt = "2024-03-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 9,
                        courseId = 8,
                        name = "Data Preprocessing",
                        description = "Learn to clean and prepare data for Machine Learning.",
                        orderIndex = 1,
                        createdAt = "2024-03-01",
                        updatedAt = "2024-03-02",
                        units = listOf(
                            Unit(
                                id = 16,
                                moduleId = 9,
                                name = "Handling Missing Data",
                                orderIndex = 1,
                                content = "Learn techniques to handle missing data.",
                                createdAt = "2024-03-01",
                                updatedAt = "2024-03-02"
                            ),
                            Unit(
                                id = 17,
                                moduleId = 9,
                                name = "Feature Scaling",
                                orderIndex = 2,
                                content = "Understand feature scaling and its importance.",
                                createdAt = "2024-03-01",
                                updatedAt = "2024-03-02"
                            )
                        )
                    )
                )
            )
        )
    ),
    LearningPath(
        id = 9,
        name = "Machine Learning - Advanced",
        level = LearningPathLevel.ADVANCED,
        description = "Master advanced Machine Learning techniques and deep learning.",
        createdAt = "2024-03-01",
        updatedAt = "2024-03-02",
        estimatedDuration = "4 months",
        courses = listOf(
            Course(
                id = 9,
                name = "Deep Learning with Neural Networks",
                learningPathId = 9,
                totalModules = 3,
                description = "Learn deep learning concepts and build neural networks.",
                createdAt = "2024-03-01",
                updatedAt = "2024-03-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 10,
                        courseId = 9,
                        name = "Introduction to Neural Networks",
                        description = "Learn the basics of neural networks and their architecture.",
                        orderIndex = 1,
                        createdAt = "2024-03-01",
                        updatedAt = "2024-03-02",
                        units = listOf(
                            Unit(
                                id = 18,
                                moduleId = 10,
                                name = "What is a Neural Network?",
                                orderIndex = 1,
                                content = "Introduction to the structure of a neural network.",
                                createdAt = "2024-03-01",
                                updatedAt = "2024-03-02"
                            ),
                            Unit(
                                id = 19,
                                moduleId = 10,
                                name = "Activation Functions",
                                orderIndex = 2,
                                content = "Understand common activation functions in deep learning.",
                                createdAt = "2024-03-01",
                                updatedAt = "2024-03-02"
                            )
                        )
                    )
                )
            )
        )
    )
)
