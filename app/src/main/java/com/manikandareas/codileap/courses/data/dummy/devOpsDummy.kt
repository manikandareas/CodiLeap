package com.manikandareas.codileap.courses.data.dummy

import com.manikandareas.codileap.courses.domain.Course
import com.manikandareas.codileap.courses.domain.LearningPath
import com.manikandareas.codileap.courses.domain.LearningPathLevel
import com.manikandareas.codileap.courses.domain.Module
import com.manikandareas.codileap.courses.domain.Unit

// DevOps Learning Paths
val devOpsDummy = listOf(
    LearningPath(
        id = 4,
        name = "DevOps - Beginner",
        level = LearningPathLevel.BEGINNER,
        description = "Introduction to DevOps principles and practices.",
        createdAt = "2024-02-01",
        updatedAt = "2024-02-02",
        estimatedDuration = "2 months",
        courses = listOf(
            Course(
                id = 4,
                name = "DevOps Fundamentals",
                learningPathId = 4,
                totalModules = 2,
                description = "Learn the basics of DevOps, CI/CD, and automation.",
                createdAt = "2024-02-01",
                updatedAt = "2024-02-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 5,
                        courseId = 4,
                        name = "Introduction to DevOps",
                        description = "Understand DevOps culture and practices.",
                        orderIndex = 1,
                        createdAt = "2024-02-01",
                        updatedAt = "2024-02-02",
                        units = listOf(
                            Unit(
                                id = 8,
                                moduleId = 5,
                                name = "What is DevOps?",
                                orderIndex = 1,
                                content = "An overview of DevOps and its importance.",
                                createdAt = "2024-02-01",
                                updatedAt = "2024-02-02"
                            ),
                            Unit(
                                id = 9,
                                moduleId = 5,
                                name = "DevOps Practices",
                                orderIndex = 2,
                                content = "Learn common practices in DevOps.",
                                createdAt = "2024-02-01",
                                updatedAt = "2024-02-02"
                            )
                        )
                    )
                )
            )
        )
    ),
    LearningPath(
        id = 5,
        name = "DevOps - Intermediate",
        level = LearningPathLevel.INTERMEDIATE,
        description = "Deep dive into DevOps tools and workflows.",
        createdAt = "2024-02-01",
        updatedAt = "2024-02-02",
        estimatedDuration = "3 months",
        courses = listOf(
            Course(
                id = 5,
                name = "Continuous Integration and Deployment",
                learningPathId = 5,
                totalModules = 2,
                description = "Learn to automate CI/CD pipelines.",
                createdAt = "2024-02-01",
                updatedAt = "2024-02-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 6,
                        courseId = 5,
                        name = "CI/CD Fundamentals",
                        description = "Understanding continuous integration and deployment.",
                        orderIndex = 1,
                        createdAt = "2024-02-01",
                        updatedAt = "2024-02-02",
                        units = listOf(
                            Unit(
                                id = 10,
                                moduleId = 6,
                                name = "What is CI/CD?",
                                orderIndex = 1,
                                content = "Introduction to CI/CD pipelines.",
                                createdAt = "2024-02-01",
                                updatedAt = "2024-02-02"
                            ),
                            Unit(
                                id = 11,
                                moduleId = 6,
                                name = "Setting Up CI/CD",
                                orderIndex = 2,
                                content = "Steps to create a simple CI/CD pipeline.",
                                createdAt = "2024-02-01",
                                updatedAt = "2024-02-02"
                            )
                        )
                    )
                )
            )
        )
    ),
    LearningPath(
        id = 6,
        name = "DevOps - Advanced",
        level = LearningPathLevel.ADVANCED,
        description = "Master advanced DevOps practices and cloud automation.",
        createdAt = "2024-02-01",
        updatedAt = "2024-02-02",
        estimatedDuration = "4 months",
        courses = listOf(
            Course(
                id = 6,
                name = "Cloud Automation and Orchestration",
                learningPathId = 6,
                totalModules = 3,
                description = "Explore advanced tools for cloud automation.",
                createdAt = "2024-02-01",
                updatedAt = "2024-02-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 7,
                        courseId = 6,
                        name = "Infrastructure as Code",
                        description = "Learn to manage infrastructure using code.",
                        orderIndex = 1,
                        createdAt = "2024-02-01",
                        updatedAt = "2024-02-02",
                        units = listOf(
                            Unit(
                                id = 12,
                                moduleId = 7,
                                name = "Introduction to Terraform",
                                orderIndex = 1,
                                content = "Set up infrastructure using Terraform.",
                                createdAt = "2024-02-01",
                                updatedAt = "2024-02-02"
                            ),
                            Unit(
                                id = 13,
                                moduleId = 7,
                                name = "Ansible Basics",
                                orderIndex = 2,
                                content = "Automate configuration management with Ansible.",
                                createdAt = "2024-02-01",
                                updatedAt = "2024-02-02"
                            )
                        )
                    )
                )
            )
        )
    )
)
