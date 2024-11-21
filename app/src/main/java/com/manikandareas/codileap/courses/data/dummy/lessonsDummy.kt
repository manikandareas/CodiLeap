package com.manikandareas.codileap.courses.data.dummy

import com.manikandareas.codileap.courses.domain.Lesson
import     com.manikandareas.codileap.courses.domain.Unit

// Function to create lessons for each module
fun createLessonsForModule(learningPath: String, moduleName: String): List<Lesson> {
    return when {
        learningPath == "Android Development Fundamentals" && moduleName == "Kotlin Basics" -> listOf(
            Lesson(
                id = 1,
                name = "Introduction to Kotlin",
                status = "Completed",
                units = listOf(
                    Unit(
                        id = 1,
                        order = 1,
                        content = "What is Kotlin? Overview of the Language",
                        type = "Video Lecture"
                    ),
                    Unit(
                        id = 2,
                        order = 2,
                        content = "Setting Up Kotlin Development Environment",
                        type = "Tutorial"
                    ),
                    Unit(
                        id = 3,
                        order = 3,
                        content = "Basic Syntax and Variables",
                        type = "Interactive Coding"
                    )
                )
            ),
            Lesson(
                id = 2,
                name = "Kotlin Functions and OOP",
                status = "In Progress",
                units = listOf(
                    Unit(
                        id = 1,
                        order = 1,
                        content = "Defining and Calling Functions",
                        type = "Video Lecture"
                    ),
                    Unit(
                        id = 2,
                        order = 2,
                        content = "Object-Oriented Programming Concepts",
                        type = "Tutorial"
                    ),
                    Unit(
                        id = 3,
                        order = 3,
                        content = "Classes and Inheritance in Kotlin",
                        type = "Coding Exercise"
                    )
                )
            )
        )

        learningPath == "DevOps Engineering Mastery" && moduleName == "Linux and Shell Scripting" -> listOf(
            Lesson(
                id = 1,
                name = "Linux Command Line Basics",
                status = "Completed",
                units = listOf(
                    Unit(
                        id = 1,
                        order = 1,
                        content = "Introduction to Linux Terminal",
                        type = "Video Lecture"
                    ),
                    Unit(
                        id = 2,
                        order = 2,
                        content = "File System Navigation",
                        type = "Hands-on Lab"
                    ),
                    Unit(
                        id = 3,
                        order = 3,
                        content = "File Manipulation Commands",
                        type = "Interactive Exercise"
                    )
                )
            ),
            Lesson(
                id = 2,
                name = "Shell Scripting Fundamentals",
                status = "In Progress",
                units = listOf(
                    Unit(
                        id = 1,
                        order = 1,
                        content = "Writing First Bash Script",
                        type = "Tutorial"
                    ),
                    Unit(
                        id = 2,
                        order = 2,
                        content = "Conditional Statements in Bash",
                        type = "Coding Exercise"
                    ),
                    Unit(
                        id = 3,
                        order = 3,
                        content = "Loops and Script Automation",
                        type = "Advanced Lab"
                    )
                )
            )
        )

        learningPath == "Machine Learning Fundamentals" && moduleName == "Python for Data Science" -> listOf(
            Lesson(
                id = 1,
                name = "Python Programming Basics",
                status = "Completed",
                units = listOf(
                    Unit(
                        id = 1,
                        order = 1,
                        content = "Python Syntax and Data Types",
                        type = "Video Lecture"
                    ),
                    Unit(
                        id = 2,
                        order = 2,
                        content = "Control Structures and Functions",
                        type = "Interactive Coding"
                    ),
                    Unit(
                        id = 3,
                        order = 3,
                        content = "Working with Lists and Dictionaries",
                        type = "Coding Exercise"
                    )
                )
            ),
            Lesson(
                id = 2,
                name = "Data Science Libraries",
                status = "In Progress",
                units = listOf(
                    Unit(
                        id = 1,
                        order = 1,
                        content = "NumPy Fundamentals",
                        type = "Tutorial"
                    ),
                    Unit(
                        id = 2,
                        order = 2,
                        content = "Pandas for Data Manipulation",
                        type = "Hands-on Lab"
                    ),
                    Unit(
                        id = 3,
                        order = 3,
                        content = "Data Visualization with Matplotlib",
                        type = "Project-based Learning"
                    )
                )
            )
        )

        else -> emptyList()
    }
}