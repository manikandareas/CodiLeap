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
        description = "Comprehensive introduction to mobile app development.",
        createdAt = "2024-01-01",
        updatedAt = "2024-01-02",
        estimatedDuration = 3000,
        courses = listOf(
            Course(
                id = 1,
                name = "Getting Started with Mobile Development",
                learningPathId = 1,
                totalModules = 3,
                description = "Foundational mobile development concepts",
                createdAt = "2024-01-01",
                updatedAt = "2024-01-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 1,
                        courseId = 1,
                        name = "Introduction to Mobile Platforms",
                        description = "Understanding mobile development fundamentals",
                        orderIndex = 1,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 1,
                                moduleId = 1,
                                name = "What is Mobile Development?",
                                orderIndex = 1,
                                content = "Overview of mobile development ecosystem",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 2,
                                moduleId = 1,
                                name = "Overview of Mobile Platforms",
                                orderIndex = 2,
                                content = "Exploring iOS and Android platforms",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 3,
                                moduleId = 1,
                                name = "Setting Up Development Environment",
                                orderIndex = 3,
                                content = "Preparing tools for mobile app development",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            )
                        )
                    ),
                    Module(
                        id = 2,
                        courseId = 1,
                        name = "Building Your First App",
                        description = "Creating initial mobile application",
                        orderIndex = 2,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 4,
                                moduleId = 2,
                                name = "Understanding Project Structure",
                                orderIndex = 1,
                                content = "Organizing mobile app project components",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 5,
                                moduleId = 2,
                                name = "Creating Simple User Interface",
                                orderIndex = 2,
                                content = "Designing basic app interface",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 6,
                                moduleId = 2,
                                name = "Running App on Simulator/Device",
                                orderIndex = 3,
                                content = "Deploying and testing mobile applications",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            )
                        )
                    ),
                    Module(
                        id = 3,
                        courseId = 1,
                        name = "Basics of App Functionality",
                        description = "Core mobile app interaction principles",
                        orderIndex = 3,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 7,
                                moduleId = 3,
                                name = "Handling User Inputs",
                                orderIndex = 1,
                                content = "Managing user interaction mechanisms",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 8,
                                moduleId = 3,
                                name = "Displaying Data Dynamically",
                                orderIndex = 2,
                                content = "Techniques for dynamic content rendering",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 9,
                                moduleId = 3,
                                name = "Debugging Basics",
                                orderIndex = 3,
                                content = "Fundamental debugging techniques",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            )
                        )
                    )
                )
            ),
            Course(
                id = 2,
                name = "Designing Mobile User Interfaces",
                learningPathId = 1,
                totalModules = 3,
                description = "Comprehensive mobile UI design principles",
                createdAt = "2024-01-01",
                updatedAt = "2024-01-02",
                orderIndex = 2,
                modules = listOf(
                    Module(
                        id = 4,
                        courseId = 2,
                        name = "Introduction to UI Layouts",
                        description = "Understanding mobile UI layout techniques",
                        orderIndex = 1,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 10,
                                moduleId = 4,
                                name = "Using Common UI Elements",
                                orderIndex = 1,
                                content = "Buttons, TextViews, and basic components",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 11,
                                moduleId = 4,
                                name = "Creating Layouts",
                                orderIndex = 2,
                                content = "Linear and Relative Layouts implementation",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 12,
                                moduleId = 4,
                                name = "Customizing Styles and Themes",
                                orderIndex = 3,
                                content = "Styling mobile application interfaces",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            )
                        )
                    ),
                    Module(
                        id = 5,
                        courseId = 2,
                        name = "User Interaction Basics",
                        description = "Implementing mobile app interactions",
                        orderIndex = 2,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 13,
                                moduleId = 5,
                                name = "Implementing Click Listeners",
                                orderIndex = 1,
                                content = "Handling user touch events",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 14,
                                moduleId = 5,
                                name = "Creating Forms and Input Fields",
                                orderIndex = 2,
                                content = "Designing interactive input interfaces",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 15,
                                moduleId = 5,
                                name = "Handling UI Feedback",
                                orderIndex = 3,
                                content = "Providing user interaction responses",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            )
                        )
                    ),
                    Module(
                        id = 6,
                        courseId = 2,
                        name = "Responsive Design",
                        description = "Creating adaptable mobile interfaces",
                        orderIndex = 3,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 16,
                                moduleId = 6,
                                name = "Screen Sizes and Densities",
                                orderIndex = 1,
                                content = "Handling different device configurations",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 17,
                                moduleId = 6,
                                name = "Using Constraint Layouts",
                                orderIndex = 2,
                                content = "Flexible layout design techniques",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 18,
                                moduleId = 6,
                                name = "Adapting to Screen Orientations",
                                orderIndex = 3,
                                content = "Handling portrait and landscape modes",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            )
                        )
                    )
                )
            ),
            Course(
                id = 3,
                name = "Understanding App Architecture",
                learningPathId = 1,
                totalModules = 3,
                description = "Fundamentals of mobile app structure",
                createdAt = "2024-01-01",
                updatedAt = "2024-01-02",
                orderIndex = 3,
                modules = listOf(
                    Module(
                        id = 7,
                        courseId = 3,
                        name = "Activity Lifecycle",
                        description = "Understanding Android component lifecycle",
                        orderIndex = 1,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 19,
                                moduleId = 7,
                                name = "What is an Activity?",
                                orderIndex = 1,
                                content = "Core concepts of Android activities",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 20,
                                moduleId = 7,
                                name = "Lifecycle Methods",
                                orderIndex = 2,
                                content = "Exploring activity lifecycle stages",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 21,
                                moduleId = 7,
                                name = "Handling Configuration Changes",
                                orderIndex = 3,
                                content = "Managing state during device changes",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            )
                        )
                    ),
                    Module(
                        id = 8,
                        courseId = 3,
                        name = "Navigation Between Screens",
                        description = "Implementing multi-screen navigation",
                        orderIndex = 2,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 22,
                                moduleId = 8,
                                name = "Creating Multiple Activities",
                                orderIndex = 1,
                                content = "Designing multi-screen applications",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 23,
                                moduleId = 8,
                                name = "Using Intents for Navigation",
                                orderIndex = 2,
                                content = "Navigating between app components",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 24,
                                moduleId = 8,
                                name = "Passing Data Between Screens",
                                orderIndex = 3,
                                content = "Sharing information across activities",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            )
                        )
                    ),
                    Module(
                        id = 9,
                        courseId = 3,
                        name = "Local Data Storage",
                        description = "Techniques for storing app data",
                        orderIndex = 3,
                        createdAt = "2024-01-01",
                        updatedAt = "2024-01-02",
                        units = listOf(
                            Unit(
                                id = 25,
                                moduleId = 9,
                                name = "Shared Preferences",
                                orderIndex = 1,
                                content = "Storing key-value data",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 26,
                                moduleId = 9,
                                name = "Internal Storage",
                                orderIndex = 2,
                                content = "Saving files on device",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 27,
                                moduleId = 9,
                                name = "Basic SQLite Operations",
                                orderIndex = 3,
                                content = "Managing local databases",
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
        name = "Mobile Development Intermediate",
        level = LearningPathLevel.INTERMEDIATE,
        description = "Advance your skills with more complex concepts in mobile development.",
        createdAt = "2024-11-01",
        updatedAt = "2024-11-01",
        estimatedDuration = 3000,
        courses = listOf(
            Course(
                id = 4,
                name = "Advanced UI Design",
                learningPathId = 2,
                totalModules = 3,
                description = "Enhance user experience with advanced UI techniques.",
                createdAt = "2024-11-01",
                updatedAt = "2024-11-01",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 10,
                        courseId = 4,
                        name = "Custom Views",
                        description = "Learn how to create and manage custom views.",
                        orderIndex = 1,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(28, 10, "Drawing with Canvas", 1, "Create views using Canvas.", "2024-11-01", "2024-11-01"),
                            Unit(29, 10, "Handling Touch Events", 2, "Respond to user gestures.", "2024-11-01", "2024-11-01"),
                            Unit(30, 10, "Using Custom Attributes", 3, "Add custom attributes to your views.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 11,
                        courseId = 4,
                        name = "Animations",
                        description = "Add motion to your app for better user engagement.",
                        orderIndex = 2,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(31, 11, "Property Animations", 1, "Animate properties like rotation and alpha.", "2024-11-01", "2024-11-01"),
                            Unit(32, 11, "Keyframe Animations", 2, "Control animations with keyframes.", "2024-11-01", "2024-11-01"),
                            Unit(33, 11, "MotionLayout", 3, "Handle complex animations with MotionLayout.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 12,
                        courseId = 4,
                        name = "Material Design",
                        description = "Adopt Material Design principles.",
                        orderIndex = 3,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(34, 12, "Using Material Components", 1, "Implement material components in your UI.", "2024-11-01", "2024-11-01"),
                            Unit(35, 12, "Theme and Style Management", 2, "Manage themes and styles effectively.", "2024-11-01", "2024-11-01"),
                            Unit(36, 12, "Dark Mode Integration", 3, "Add support for dark mode.", "2024-11-01", "2024-11-01")
                        )
                    )
                )
            ),
            Course(
                id = 5,
                name = "State Management",
                learningPathId = 2,
                totalModules = 3,
                description = "Learn how to manage app state efficiently.",
                createdAt = "2024-11-01",
                updatedAt = "2024-11-01",
                orderIndex = 2,
                modules = listOf(
                    Module(
                        id = 13,
                        courseId = 5,
                        name = "ViewModel and LiveData",
                        description = "Manage state with ViewModel and LiveData.",
                        orderIndex = 1,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(37, 13, "Introduction to ViewModel", 1, "Store UI-related data in ViewModel.", "2024-11-01", "2024-11-01"),
                            Unit(38, 13, "Using LiveData", 2, "Observe and manage LiveData.", "2024-11-01", "2024-11-01"),
                            Unit(39, 13, "Handling UI Updates", 3, "Handle UI updates efficiently.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 14,
                        courseId = 5,
                        name = "StateFlow and SharedFlow",
                        description = "Use Flow for managing state and sharing data.",
                        orderIndex = 2,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(40, 14, "Introduction to StateFlow", 1, "Manage state with StateFlow.", "2024-11-01", "2024-11-01"),
                            Unit(41, 14, "Using SharedFlow", 2, "Share events with SharedFlow.", "2024-11-01", "2024-11-01"),
                            Unit(42, 14, "Integration with Jetpack Compose", 3, "Combine Flow with Jetpack Compose.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 15,
                        courseId = 5,
                        name = "Dependency Injection",
                        description = "Simplify state management with DI frameworks.",
                        orderIndex = 3,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(43, 15, "What is Dependency Injection?", 1, "Understand the basics of DI.", "2024-11-01", "2024-11-01"),
                            Unit(44, 15, "Using Hilt", 2, "Inject dependencies using Hilt.", "2024-11-01", "2024-11-01"),
                            Unit(45, 15, "Combining Hilt and ViewModel", 3, "Integrate Hilt with ViewModel.", "2024-11-01", "2024-11-01")
                        )
                    )
                )
            ),
            Course(
                id = 6,
                name = "Networking and Data Storage",
                learningPathId = 2,
                totalModules = 3,
                description = "Understand how to fetch data from APIs and manage data storage effectively.",
                createdAt = "2024-11-01",
                updatedAt = "2024-11-01",
                orderIndex = 3,
                modules = listOf(
                    Module(
                        id = 16,
                        courseId = 6,
                        name = "RESTful APIs",
                        description = "Learn to work with RESTful APIs for mobile apps.",
                        orderIndex = 1,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(46, 16, "Introduction to REST APIs", 1, "Learn the basics of RESTful APIs.", "2024-11-01", "2024-11-01"),
                            Unit(47, 16, "Using Retrofit", 2, "Fetch data using the Retrofit library.", "2024-11-01", "2024-11-01"),
                            Unit(48, 16, "Error Handling in API Calls", 3, "Handle errors effectively when fetching data.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 17,
                        courseId = 6,
                        name = "Local Data Storage",
                        description = "Understand techniques for storing data locally.",
                        orderIndex = 2,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(49, 17, "Using SharedPreferences", 1, "Store simple data with SharedPreferences.", "2024-11-01", "2024-11-01"),
                            Unit(50, 17, "SQLite Database", 2, "Manage structured data with SQLite.", "2024-11-01", "2024-11-01"),
                            Unit(51, 17, "Room Database", 3, "Use Room for an abstraction over SQLite.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 18,
                        courseId = 6,
                        name = "File Management",
                        description = "Learn how to manage files effectively in Android.",
                        orderIndex = 3,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(52, 18, "Reading and Writing Files", 1, "Read and write files in Android storage.", "2024-11-01", "2024-11-01"),
                            Unit(53, 18, "Managing External Storage", 2, "Work with external storage on Android.", "2024-11-01", "2024-11-01"),
                            Unit(54, 18, "File Permissions", 3, "Understand and handle file permissions.", "2024-11-01", "2024-11-01")
                        )
                    )
                )
            )
        ),

    ),
    LearningPath(
        id = 3,
        name = "Mobile Development Advanced",
        level = LearningPathLevel.ADVANCED,
        description = "Master advanced topics to build scalable and robust mobile applications.",
        createdAt = "2024-11-01",
        updatedAt = "2024-11-01",
        estimatedDuration = 3000,
        courses = listOf(
            Course(
                id = 7,
                name = "Performance Optimization",
                learningPathId = 3,
                totalModules = 3,
                description = "Learn techniques to improve app performance.",
                createdAt = "2024-11-01",
                updatedAt = "2024-11-01",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 19,
                        courseId = 7,
                        name = "Memory Management",
                        description = "Optimize memory usage in mobile apps.",
                        orderIndex = 1,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(55, 19, "Understanding Memory Leaks", 1, "Identify and fix memory leaks.", "2024-11-01", "2024-11-01"),
                            Unit(56, 19, "Profiling with Android Studio", 2, "Analyze memory usage with profiler.", "2024-11-01", "2024-11-01"),
                            Unit(57, 19, "Garbage Collection", 3, "Understand and manage garbage collection.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 20,
                        courseId = 7,
                        name = "UI Rendering Optimization",
                        description = "Optimize UI for smoother performance.",
                        orderIndex = 2,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(58, 20, "Avoiding Overdraw", 1, "Minimize overdraw in UI rendering.", "2024-11-01", "2024-11-01"),
                            Unit(59, 20, "Reducing Layout Complexity", 2, "Simplify layouts for better performance.", "2024-11-01", "2024-11-01"),
                            Unit(60, 20, "Asynchronous Rendering", 3, "Use asynchronous rendering to reduce lag.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 21,
                        courseId = 7,
                        name = "Power Consumption",
                        description = "Optimize apps for battery efficiency.",
                        orderIndex = 3,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(61, 21, "Monitoring Power Usage", 1, "Analyze and monitor app's power consumption.", "2024-11-01", "2024-11-01"),
                            Unit(62, 21, "Reducing Background Tasks", 2, "Limit background tasks to save battery.", "2024-11-01", "2024-11-01"),
                            Unit(63, 21, "Efficient Networking", 3, "Optimize network calls for lower battery usage.", "2024-11-01", "2024-11-01")
                        )
                    )
                )
            ),
            Course(
                id = 8,
                name = "Scalable Architecture",
                learningPathId = 3,
                totalModules = 3,
                description = "Learn how to design and implement scalable architectures for mobile apps.",
                createdAt = "2024-11-01",
                updatedAt = "2024-11-01",
                orderIndex = 2,
                modules = listOf(
                    Module(
                        id = 22,
                        courseId = 8,
                        name = "Introduction to MVVM",
                        description = "Understand the MVVM pattern and its benefits.",
                        orderIndex = 1,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(64, 22, "What is MVVM?", 1, "Learn the basics of the MVVM design pattern.", "2024-11-01", "2024-11-01"),
                            Unit(65, 22, "Implementing MVVM", 2, "Implement MVVM in a sample application.", "2024-11-01", "2024-11-01"),
                            Unit(66, 22, "Testing MVVM", 3, "Test and maintain code quality in MVVM.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 23,
                        courseId = 8,
                        name = "Dependency Injection",
                        description = "Explore the role of dependency injection in scalable apps.",
                        orderIndex = 2,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(67, 23, "What is Dependency Injection?", 1, "Learn the basics of dependency injection.", "2024-11-01", "2024-11-01"),
                            Unit(68, 23, "Using Dagger or Hilt", 2, "Use Dagger or Hilt for dependency injection.", "2024-11-01", "2024-11-01"),
                            Unit(69, 23, "Best Practices", 3, "Follow best practices for dependency injection.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 24,
                        courseId = 8,
                        name = "Modularization",
                        description = "Split your app into reusable and scalable modules.",
                        orderIndex = 3,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(70, 24, "Why Modularize?", 1, "Understand the benefits of modularization.", "2024-11-01", "2024-11-01"),
                            Unit(71, 24, "Creating Modules", 2, "Learn how to create independent modules.", "2024-11-01", "2024-11-01"),
                            Unit(72, 24, "Communication Between Modules", 3, "Ensure smooth communication across modules.", "2024-11-01", "2024-11-01")
                        )
                    )
                )
            ),
            Course(
                id = 9,
                name = "Advanced Testing",
                learningPathId = 3,
                totalModules = 3,
                description = "Master testing techniques to ensure app reliability.",
                createdAt = "2024-11-01",
                updatedAt = "2024-11-01",
                orderIndex = 3,
                modules = listOf(
                    Module(
                        id = 25,
                        courseId = 9,
                        name = "Unit Testing",
                        description = "Learn to write robust unit tests for your app.",
                        orderIndex = 1,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(73, 25, "Writing Unit Tests", 1, "Understand and write effective unit tests.", "2024-11-01", "2024-11-01"),
                            Unit(74, 25, "Using Mocking Frameworks", 2, "Utilize mocking frameworks for unit tests.", "2024-11-01", "2024-11-01"),
                            Unit(75, 25, "Code Coverage Tools", 3, "Measure code coverage effectively.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 26,
                        courseId = 9,
                        name = "UI Testing",
                        description = "Ensure seamless UI experiences through testing.",
                        orderIndex = 2,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(76, 26, "Introduction to UI Testing", 1, "Understand the importance of UI testing.", "2024-11-01", "2024-11-01"),
                            Unit(77, 26, "Using Espresso", 2, "Automate UI testing with Espresso.", "2024-11-01", "2024-11-01"),
                            Unit(78, 26, "Handling Flaky Tests", 3, "Address common challenges in UI tests.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 27,
                        courseId = 9,
                        name = "Integration Testing",
                        description = "Test the interaction between app components.",
                        orderIndex = 3,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(79, 27, "What is Integration Testing?", 1, "Learn the fundamentals of integration testing.", "2024-11-01", "2024-11-01"),
                            Unit(80, 27, "Setting Up Integration Tests", 2, "Set up integration tests for your app.", "2024-11-01", "2024-11-01"),
                            Unit(81, 27, "Combining Unit and Integration Tests", 3, "Combine multiple testing techniques.", "2024-11-01", "2024-11-01")
                        )
                    )
                )
            )

        )
    )
)
