package com.manikandareas.codileap.courses.data.dummy

import com.manikandareas.codileap.courses.domain.Module
import com.manikandareas.codileap.courses.domain.Progress

// Function to create modules for each learning path
fun createModulesForLearningPath(learningPathId: Int, pathName: String): List<Module> {
    return when (pathName) {
        "Android Development Fundamentals" -> listOf(
            Module(
                id = 1,
                name = "Kotlin Basics",
                description = "Introduction to Kotlin programming language",
                totalLessons = 15,
                progress = Progress(completed = 10, total = 15, percentage = 66.7f)
            ),
            Module(
                id = 2,
                name = "Android Studio Setup",
                description = "Setting up development environment and tools",
                totalLessons = 10,
                progress = Progress(completed = 8, total = 10, percentage = 80f)
            ),
            Module(
                id = 3,
                name = "UI/UX Design in Android",
                description = "Creating user interfaces and experience",
                totalLessons = 20,
                progress = Progress(completed = 12, total = 20, percentage = 60f)
            )
        )
        "Full Stack Web Development" -> listOf(
            Module(
                id = 1,
                name = "Frontend Fundamentals",
                description = "HTML, CSS, and JavaScript basics",
                totalLessons = 25,
                progress = Progress(completed = 18, total = 25, percentage = 72f)
            ),
            Module(
                id = 2,
                name = "Backend Development",
                description = "Server-side programming with Node.js",
                totalLessons = 22,
                progress = Progress(completed = 15, total = 22, percentage = 68.2f)
            ),
            Module(
                id = 3,
                name = "Database Management",
                description = "Database design and management",
                totalLessons = 18,
                progress = Progress(completed = 10, total = 18, percentage = 55.6f)
            )
        )
        "DevOps Engineering Mastery" -> listOf(
            Module(
                id = 1,
                name = "Linux and Shell Scripting",
                description = "Advanced Linux administration and scripting",
                totalLessons = 20,
                progress = Progress(completed = 15, total = 20, percentage = 75f)
            ),
            Module(
                id = 2,
                name = "Containerization with Docker",
                description = "Docker and container orchestration",
                totalLessons = 25,
                progress = Progress(completed = 17, total = 25, percentage = 68f)
            ),
            Module(
                id = 3,
                name = "CI/CD Pipelines",
                description = "Continuous Integration and Continuous Deployment",
                totalLessons = 22,
                progress = Progress(completed = 12, total = 22, percentage = 54.5f)
            )
        )
        "Machine Learning Fundamentals" -> listOf(
            Module(
                id = 1,
                name = "Python for Data Science",
                description = "Python programming for machine learning",
                totalLessons = 18,
                progress = Progress(completed = 12, total = 18, percentage = 66.7f)
            ),
            Module(
                id = 2,
                name = "Statistical Learning",
                description = "Statistical foundations of machine learning",
                totalLessons = 15,
                progress = Progress(completed = 8, total = 15, percentage = 53.3f)
            ),
            Module(
                id = 3,
                name = "Supervised Learning Algorithms",
                description = "Introduction to classification and regression",
                totalLessons = 20,
                progress = Progress(completed = 14, total = 20, percentage = 70f)
            )
        )
        "Cybersecurity Fundamentals" -> listOf(
            Module(
                id = 1,
                name = "Network Security Basics",
                description = "Understanding network vulnerabilities and protection",
                totalLessons = 22,
                progress = Progress(completed = 16, total = 22, percentage = 72.7f)
            ),
            Module(
                id = 2,
                name = "Ethical Hacking",
                description = "Penetration testing and security assessment",
                totalLessons = 25,
                progress = Progress(completed = 15, total = 25, percentage = 60f)
            ),
            Module(
                id = 3,
                name = "Cryptography Fundamentals",
                description = "Encryption and security protocols",
                totalLessons = 18,
                progress = Progress(completed = 10, total = 18, percentage = 55.6f)
            )
        )
        "Blockchain and Cryptocurrency Technologies" -> listOf(
            Module(
                id = 1,
                name = "Blockchain Fundamentals",
                description = "Introduction to blockchain technology",
                totalLessons = 20,
                progress = Progress(completed = 14, total = 20, percentage = 70f)
            ),
            Module(
                id = 2,
                name = "Smart Contracts",
                description = "Developing smart contracts with Solidity",
                totalLessons = 25,
                progress = Progress(completed = 17, total = 25, percentage = 68f)
            ),
            Module(
                id = 3,
                name = "Cryptocurrency Ecosystem",
                description = "Understanding cryptocurrencies and tokenomics",
                totalLessons = 18,
                progress = Progress(completed = 12, total = 18, percentage = 66.7f)
            )
        )
        else -> emptyList()
    }
}