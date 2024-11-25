package com.manikandareas.codileap.courses.data.dummy

import com.manikandareas.codileap.courses.domain.Course
import com.manikandareas.codileap.courses.domain.Progress

fun createCoursesForLearningPath(learningPathId: Int, pathName: String): List<Course> {
    return when (pathName) {
        "Android Development Fundamentals" -> listOf(
            Course(
                id = 1,
                name = "Kotlin Basics",
                description = "Introduction to Kotlin programming language",
                totalModules = 15,
                progress = Progress(completed = 10, total = 15, percentage = 66.7f)
            ),
            Course(
                id = 2,
                name = "Android Studio Setup",
                description = "Setting up development environment and tools",
                totalModules = 10,
                progress = Progress(completed = 8, total = 10, percentage = 80f)
            ),
            Course(
                id = 3,
                name = "UI/UX Design in Android",
                description = "Creating user interfaces and experience",
                totalModules = 20,
                progress = Progress(completed = 12, total = 20, percentage = 60f)
            )
        )
        "Full Stack Web Development" -> listOf(
            Course(
                id = 1,
                name = "Frontend Fundamentals",
                description = "HTML, CSS, and JavaScript basics",
                totalModules = 25,
                progress = Progress(completed = 18, total = 25, percentage = 72f)
            ),
            Course(
                id = 2,
                name = "Backend Development",
                description = "Server-side programming with Node.js",
                totalModules = 22,
                progress = Progress(completed = 15, total = 22, percentage = 68.2f)
            ),
            Course(
                id = 3,
                name = "Database Management",
                description = "Database design and management",
                totalModules = 18,
                progress = Progress(completed = 10, total = 18, percentage = 55.6f)
            )
        )
        "DevOps Engineering Mastery" -> listOf(
            Course(
                id = 1,
                name = "Linux and Shell Scripting",
                description = "Advanced Linux administration and scripting",
                totalModules = 20,
                progress = Progress(completed = 15, total = 20, percentage = 75f)
            ),
            Course(
                id = 2,
                name = "Containerization with Docker",
                description = "Docker and container orchestration",
                totalModules = 25,
                progress = Progress(completed = 17, total = 25, percentage = 68f)
            ),
            Course(
                id = 3,
                name = "CI/CD Pipelines",
                description = "Continuous Integration and Continuous Deployment",
                totalModules = 22,
                progress = Progress(completed = 12, total = 22, percentage = 54.5f)
            )
        )
        "Cloud Infrastructure and Automation" -> listOf(
            Course(
                id = 1,
                name = "Cloud Computing Fundamentals",
                description = "Introduction to cloud services and architecture",
                totalModules = 18,
                progress = Progress(completed = 12, total = 18, percentage = 66.7f)
            ),
            Course(
                id = 2,
                name = "Infrastructure as Code",
                description = "Terraform and CloudFormation",
                totalModules = 20,
                progress = Progress(completed = 14, total = 20, percentage = 70f)
            ),
            Course(
                id = 3,
                name = "Cloud Security",
                description = "Security best practices for cloud infrastructure",
                totalModules = 15,
                progress = Progress(completed = 8, total = 15, percentage = 53.3f)
            )
        )
        "Machine Learning Fundamentals" -> listOf(
            Course(
                id = 1,
                name = "Python for Data Science",
                description = "Python programming for machine learning",
                totalModules = 18,
                progress = Progress(completed = 12, total = 18, percentage = 66.7f)
            ),
            Course(
                id = 2,
                name = "Statistical Learning",
                description = "Statistical foundations of machine learning",
                totalModules = 15,
                progress = Progress(completed = 8, total = 15, percentage = 53.3f)
            ),
            Course(
                id = 3,
                name = "Supervised Learning Algorithms",
                description = "Introduction to classification and regression",
                totalModules = 20,
                progress = Progress(completed = 14, total = 20, percentage = 70f)
            )
        )
        "Advanced Deep Learning" -> listOf(
            Course(
                id = 1,
                name = "Neural Networks Architecture",
                description = "Deep dive into neural network design",
                totalModules = 22,
                progress = Progress(completed = 15, total = 22, percentage = 68.2f)
            ),
            Course(
                id = 2,
                name = "Computer Vision",
                description = "Image processing and recognition",
                totalModules = 25,
                progress = Progress(completed = 18, total = 25, percentage = 72f)
            ),
            Course(
                id = 3,
                name = "Natural Language Processing",
                description = "Text processing and language models",
                totalModules = 20,
                progress = Progress(completed = 12, total = 20, percentage = 60f)
            )
        )
        "Data Science and Analytics" -> listOf(
            Course(
                id = 1,
                name = "Data Analysis Fundamentals",
                description = "Basic concepts of data analysis",
                totalModules = 18,
                progress = Progress(completed = 14, total = 18, percentage = 77.8f)
            ),
            Course(
                id = 2,
                name = "Data Visualization",
                description = "Creating effective data visualizations",
                totalModules = 15,
                progress = Progress(completed = 10, total = 15, percentage = 66.7f)
            ),
            Course(
                id = 3,
                name = "Predictive Modeling",
                description = "Building predictive models",
                totalModules = 20,
                progress = Progress(completed = 13, total = 20, percentage = 65f)
            )
        )
        "Cybersecurity Fundamentals" -> listOf(
            Course(
                id = 1,
                name = "Network Security Basics",
                description = "Understanding network vulnerabilities and protection",
                totalModules = 22,
                progress = Progress(completed = 16, total = 22, percentage = 72.7f)
            ),
            Course(
                id = 2,
                name = "Ethical Hacking",
                description = "Penetration testing and security assessment",
                totalModules = 25,
                progress = Progress(completed = 15, total = 25, percentage = 60f)
            ),
            Course(
                id = 3,
                name = "Cryptography Fundamentals",
                description = "Encryption and security protocols",
                totalModules = 18,
                progress = Progress(completed = 10, total = 18, percentage = 55.6f)
            )
        )
        "Blockchain and Cryptocurrency Technologies" -> listOf(
            Course(
                id = 1,
                name = "Blockchain Fundamentals",
                description = "Introduction to blockchain technology",
                totalModules = 20,
                progress = Progress(completed = 14, total = 20, percentage = 70f)
            ),
            Course(
                id = 2,
                name = "Smart Contracts",
                description = "Developing smart contracts with Solidity",
                totalModules = 25,
                progress = Progress(completed = 17, total = 25, percentage = 68f)
            ),
            Course(
                id = 3,
                name = "Cryptocurrency Ecosystem",
                description = "Understanding cryptocurrencies and tokenomics",
                totalModules = 18,
                progress = Progress(completed = 12, total = 18, percentage = 66.7f)
            )
        )
        else -> emptyList()
    }
}