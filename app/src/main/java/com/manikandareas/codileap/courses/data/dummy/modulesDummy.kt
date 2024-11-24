package com.manikandareas.codileap.courses.data.dummy

import com.manikandareas.codileap.courses.domain.Module
import     com.manikandareas.codileap.courses.domain.Unit

// Function to create lessons for each module
fun createModulesForCourse(learningPath: String, courseName: String): List<Module> {
    return when {
        learningPath == "Android Development Fundamentals" && courseName == "Kotlin Basics" -> listOf(
            Module(
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
            Module(
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

        learningPath == "DevOps Engineering Mastery" && courseName == "Linux and Shell Scripting" -> listOf(
            Module(
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
            Module(
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

        learningPath == "Machine Learning Fundamentals" && courseName == "Python for Data Science" -> listOf(
            Module(
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
            Module(
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


//fun createModulesForCourse(learningPath: String, courseName: String): List<Module> {
//    return when {
//        // Android Development Path Modules
//        learningPath == "Android Development Fundamentals" -> when(courseName) {
//            "Kotlin Basics" -> listOf(
//                Module(
//                    id = 1,
//                    name = "Introduction to Kotlin",
//                    status = "Completed",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "What is Kotlin?", type = "Video Lecture"),
//                        Unit(id = 2, order = 2, content = "Setting Up Development Environment", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Basic Syntax and Variables", type = "Interactive Coding"),
//                        Unit(id = 4, order = 4, content = "Control Flow", type = "Practice Exercise")
//                    )
//                ),
//                Module(
//                    id = 2,
//                    name = "Functions and Lambda",
//                    status = "Completed",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Function Basics", type = "Video Lecture"),
//                        Unit(id = 2, order = 2, content = "Lambda Expressions", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Higher-Order Functions", type = "Interactive Coding"),
//                        Unit(id = 4, order = 4, content = "Function Types", type = "Quiz")
//                    )
//                ),
//                Module(
//                    id = 3,
//                    name = "Object-Oriented Programming",
//                    status = "In Progress",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Classes and Objects", type = "Video Lecture"),
//                        Unit(id = 2, order = 2, content = "Properties and Fields", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Inheritance", type = "Interactive Coding"),
//                        Unit(id = 4, order = 4, content = "Interfaces", type = "Project")
//                    )
//                ),
//                Module(
//                    id = 4,
//                    name = "Kotlin Advanced Features",
//                    status = "Not Started",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Coroutines", type = "Video Lecture"),
//                        Unit(id = 2, order = 2, content = "Collections", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Generics", type = "Interactive Coding"),
//                        Unit(id = 4, order = 4, content = "Extension Functions", type = "Project")
//                    )
//                )
//            )
//            "Android Studio Setup" -> listOf(
//                Module(
//                    id = 1,
//                    name = "Installation and Setup",
//                    status = "Completed",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Download and Install", type = "Video Tutorial"),
//                        Unit(id = 2, order = 2, content = "Basic Configuration", type = "Guide"),
//                        Unit(id = 3, order = 3, content = "SDK Setup", type = "Interactive Tutorial"),
//                        Unit(id = 4, order = 4, content = "Emulator Setup", type = "Practice")
//                    )
//                ),
//                Module(
//                    id = 2,
//                    name = "Project Structure",
//                    status = "Completed",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Android Project Files", type = "Video Lecture"),
//                        Unit(id = 2, order = 2, content = "Resource Management", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Gradle Configuration", type = "Interactive Guide"),
//                        Unit(id = 4, order = 4, content = "Build Variants", type = "Exercise")
//                    )
//                ),
//                Module(
//                    id = 3,
//                    name = "IDE Features",
//                    status = "In Progress",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Code Navigation", type = "Video Tutorial"),
//                        Unit(id = 2, order = 2, content = "Debugging Tools", type = "Guide"),
//                        Unit(id = 3, order = 3, content = "Performance Profiler", type = "Interactive Demo"),
//                        Unit(id = 4, order = 4, content = "Version Control", type = "Practice")
//                    )
//                ),
//                Module(
//                    id = 4,
//                    name = "Custom Settings",
//                    status = "Not Started",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Code Style", type = "Video Guide"),
//                        Unit(id = 2, order = 2, content = "Live Templates", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Custom Plugins", type = "Interactive Setup"),
//                        Unit(id = 4, order = 4, content = "Key Mappings", type = "Exercise")
//                    )
//                )
//            )
//            "UI/UX Design in Android" -> listOf(
//                Module(
//                    id = 1,
//                    name = "Layout Fundamentals",
//                    status = "Completed",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "View Hierarchy", type = "Video Lecture"),
//                        Unit(id = 2, order = 2, content = "Layout Types", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Constraints Layout", type = "Interactive Design"),
//                        Unit(id = 4, order = 4, content = "Responsive Layouts", type = "Project")
//                    )
//                ),
//                Module(
//                    id = 2,
//                    name = "Material Design",
//                    status = "In Progress",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Material Components", type = "Video Guide"),
//                        Unit(id = 2, order = 2, content = "Theming", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Colors and Typography", type = "Interactive Design"),
//                        Unit(id = 4, order = 4, content = "Custom Styles", type = "Project")
//                    )
//                ),
//                Module(
//                    id = 3,
//                    name = "User Interaction",
//                    status = "Not Started",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Touch Events", type = "Video Lecture"),
//                        Unit(id = 2, order = 2, content = "Gestures", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Custom Views", type = "Interactive Coding"),
//                        Unit(id = 4, order = 4, content = "Animations", type = "Project")
//                    )
//                ),
//                Module(
//                    id = 4,
//                    name = "Advanced UI",
//                    status = "Not Started",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Custom Animations", type = "Video Guide"),
//                        Unit(id = 2, order = 2, content = "Motion Layout", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Transitions", type = "Interactive Design"),
//                        Unit(id = 4, order = 4, content = "Complex UIs", type = "Project")
//                    )
//                )
//            )
//
//            // DevOps Engineering Path Modules
//            "Linux and Shell Scripting" -> listOf(
//                Module(
//                    id = 1,
//                    name = "Linux Fundamentals",
//                    status = "Completed",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Linux Architecture", type = "Video Lecture"),
//                        Unit(id = 2, order = 2, content = "File System", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Basic Commands", type = "Interactive Shell"),
//                        Unit(id = 4, order = 4, content = "User Management", type = "Practice Lab")
//                    )
//                ),
//                Module(
//                    id = 2,
//                    name = "Shell Basics",
//                    status = "Completed",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Shell Types", type = "Video Tutorial"),
//                        Unit(id = 2, order = 2, content = "Variables", type = "Guide"),
//                        Unit(id = 3, order = 3, content = "Control Flow", type = "Interactive Shell"),
//                        Unit(id = 4, order = 4, content = "Functions", type = "Project")
//                    )
//                ),
//                Module(
//                    id = 3,
//                    name = "Advanced Scripting",
//                    status = "In Progress",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Regular Expressions", type = "Video Lecture"),
//                        Unit(id = 2, order = 2, content = "Text Processing", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Process Management", type = "Lab Exercise"),
//                        Unit(id = 4, order = 4, content = "Shell Script Projects", type = "Project")
//                    )
//                ),
//                Module(
//                    id = 4,
//                    name = "System Administration",
//                    status = "Not Started",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "System Monitoring", type = "Video Guide"),
//                        Unit(id = 2, order = 2, content = "Backup Scripts", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Automation Tools", type = "Lab Exercise"),
//                        Unit(id = 4, order = 4, content = "Security Scripts", type = "Project")
//                    )
//                )
//            )
//
//            // Continue with similar pattern for other courses...
//            // I'll show one more example for Machine Learning path
//
//            "Python for Data Science" -> listOf(
//                Module(
//                    id = 1,
//                    name = "Python Fundamentals",
//                    status = "Completed",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Python Basics", type = "Video Lecture"),
//                        Unit(id = 2, order = 2, content = "Data Types", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Control Structures", type = "Interactive Coding"),
//                        Unit(id = 4, order = 4, content = "Functions", type = "Practice")
//                    )
//                ),
//                Module(
//                    id = 2,
//                    name = "Data Structures",
//                    status = "Completed",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Lists and Tuples", type = "Video Tutorial"),
//                        Unit(id = 2, order = 2, content = "Dictionaries", type = "Guide"),
//                        Unit(id = 3, order = 3, content = "Sets", type = "Interactive Practice"),
//                        Unit(id = 4, order = 4, content = "Advanced Collections", type = "Project")
//                    )
//                ),
//                Module(
//                    id = 3,
//                    name = "NumPy and Pandas",
//                    status = "In Progress",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "NumPy Arrays", type = "Video Lecture"),
//                        Unit(id = 2, order = 2, content = "Pandas DataFrames", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Data Manipulation", type = "Lab Exercise"),
//                        Unit(id = 4, order = 4, content = "Data Analysis", type = "Project")
//                    )
//                ),
//                Module(
//                    id = 4,
//                    name = "Data Visualization",
//                    status = "Not Started",
//                    units = listOf(
//                        Unit(id = 1, order = 1, content = "Matplotlib", type = "Video Guide"),
//                        Unit(id = 2, order = 2, content = "Seaborn", type = "Tutorial"),
//                        Unit(id = 3, order = 3, content = "Interactive Plots", type = "Lab Exercise"),
//                        Unit(id = 4, order = 4, content = "Dashboard Creation", type = "Project")
//                    )
//                )
//            )
//            else -> emptyList()
//        }
//        else -> emptyList()
//    }
//}