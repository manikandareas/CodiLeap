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
        estimatedDuration = "2 months",
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
                                content = "<h1>Introduction to Mobile Development</h1>\n" +
                                        "\n" +
                                        "<h2>Definition of Mobile Development</h2>\n" +
                                        "\n" +
                                        "<p>Mobile development refers to the process of creating applications (apps) that run on mobile devices, such as smartphones and tablets. Apps can be created for various platforms like Android, iOS, and cross-platform environments.</p>\n" +
                                        "\n" +
                                        "<h3>Importance of Mobile Development</h3>\n" +
                                        "\n" +
                                        "<ul>\n" +
                                        "    <li>Mobile devices have become integral to modern life, making mobile apps a crucial part of business, communication, entertainment, and more.</li>\n" +
                                        "    <li>The growing mobile market and the rise of mobile-first digital experiences.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>Types of Mobile Apps</h2>\n" +
                                        "\n" +
                                        "<h3>Native Apps</h3>\n" +
                                        "<p>Apps developed specifically for one platform (iOS or Android) using platform-specific languages like Swift/Objective-C for iOS and Java/Kotlin for Android.</p>\n" +
                                        "<ul>\n" +
                                        "    <li>Advantages: Better performance, access to device hardware, and a native user experience.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Hybrid Apps</h3>\n" +
                                        "<p>Apps developed using web technologies (HTML, CSS, JavaScript) and wrapped in a native container to run on multiple platforms.</p>\n" +
                                        "<ul>\n" +
                                        "    <li>Advantages: One codebase for multiple platforms, faster development.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Web Apps</h3>\n" +
                                        "<p>Mobile-optimized websites accessed via a browser, without installation.</p>\n" +
                                        "<ul>\n" +
                                        "    <li>Advantages: Accessibility from any device with an internet connection, cost-effective.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Progressive Web Apps (PWAs)</h3>\n" +
                                        "<p>Web apps that offer offline capabilities, push notifications, and native-like features but are still accessed through a web browser.</p>\n" +
                                        "<ul>\n" +
                                        "    <li>Advantages: No installation required, works across platforms.</li>\n" +
                                        "</ul>\n",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 2,
                                moduleId = 1,
                                name = "Overview of Mobile Platforms",
                                orderIndex = 2,
                                content = "<h2>Platforms for Mobile Development</h2>\n" +
                                        "\n" +
                                        "<h3>Android</h3>\n" +
                                        "<p>Overview of Android OS and its market share.</p>\n" +
                                        "<ul>\n" +
                                        "    <li>Tools and Technologies: Java, Kotlin, Android Studio.</li>\n" +
                                        "    <li>Key Advantages: Large user base, open-source.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>iOS</h3>\n" +
                                        "<p>Overview of iOS OS and its market share.</p>\n" +
                                        "<ul>\n" +
                                        "    <li>Tools and Technologies: Swift, Objective-C, Xcode.</li>\n" +
                                        "    <li>Key Advantages: High-quality standards, user-centric design.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Cross-Platform Development</h3>\n" +
                                        "<p>Cross-platform development allows building apps for multiple platforms using a single codebase.</p>\n" +
                                        "<ul>\n" +
                                        "    <li>Tools: React Native, Flutter, Xamarin.</li>\n" +
                                        "    <li>Key Advantages: One codebase for multiple platforms, cost-efficiency.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>Key Technologies Used in Mobile Development</h2>\n" +
                                        "\n" +
                                        "<h3>Programming Languages</h3>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Java and Kotlin (Android):</strong> Core languages for Android app development.</li>\n" +
                                        "    <li><strong>Swift and Objective-C (iOS):</strong> Primary languages for iOS development.</li>\n" +
                                        "    <li><strong>JavaScript (Hybrid and Cross-platform):</strong> Used for frameworks like React Native and Ionic.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Mobile Development Frameworks</h3>\n" +
                                        "\n" +
                                        "<ul>\n" +
                                        "    <li><strong>React Native:</strong> A popular framework for building cross-platform mobile apps using JavaScript and React.</li>\n" +
                                        "    <li><strong>Flutter:</strong> A framework developed by Google for creating natively compiled applications for mobile, web, and desktop from a single codebase.</li>\n" +
                                        "    <li><strong>Xamarin:</strong> A Microsoft-owned framework for cross-platform app development using C# and .NET.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>IDEs (Integrated Development Environments)</h3>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Android Studio:</strong> Official IDE for Android development.</li>\n" +
                                        "    <li><strong>Xcode:</strong> Official IDE for iOS development.</li>\n" +
                                        "    <li><strong>Visual Studio Code:</strong> Used for hybrid and cross-platform app development.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Databases and APIs</h3>\n" +
                                        "<ul>\n" +
                                        "    <li>Local storage options like SQLite for mobile apps.</li>\n" +
                                        "    <li>Cloud services such as Firebase, AWS Mobile, and Google Cloud for backend services.</li>\n" +
                                        "</ul>",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 3,
                                moduleId = 1,
                                name = "Setting Up Development Environment",
                                orderIndex = 3,
                                content = "<h1>Introduction to Development Environments</h1>\n" +
                                        "\n" +
                                        "<h2>What is a Development Environment?</h2>\n" +
                                        "\n" +
                                        "<p>A development environment is the set of tools, software, and configurations required to build, test, and deploy mobile applications.</p>\n" +
                                        "\n" +
                                        "<h3>Why Setting Up the Right Environment Matters?</h3>\n" +
                                        "\n" +
                                        "<ul>\n" +
                                        "    <li>An ideal environment ensures efficiency, supports the required platforms, provides debugging tools, and improves collaboration.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>Installing Android Studio</h2>\n" +
                                        "\n" +
                                        "<h3>Step 1: Download Android Studio</h3>\n" +
                                        "<p>Go to the official Android Studio download page and choose the version for your operating system (Windows, macOS, or Linux).</p>\n" +
                                        "\n" +
                                        "<h3>Step 2: Install Android Studio</h3>\n" +
                                        "\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Windows:</strong> Run the installer and follow the on-screen instructions. Select \"Standard\" installation, which includes Android Studio, the Android SDK, and Android Virtual Device (AVD).</li>\n" +
                                        "    <li><strong>macOS/Linux:</strong> Follow the installation instructions specific to your OS.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Step 3: Initial Setup</h3>\n" +
                                        "<p>Launch Android Studio after installation. During the first-time setup, Android Studio will download essential components like the Android SDK, system images, and other necessary tools.</p>\n" +
                                        "\n" +
                                        "<h2>Setting Up Android Studio for Development</h2>\n" +
                                        "\n" +
                                        "<h3>Step 1: Configure Android Studio</h3>\n" +
                                        "<p>When Android Studio starts for the first time, you’ll be prompted to configure some initial settings:</p>\n" +
                                        "<ul>\n" +
                                        "    <li>Choose the theme (Light or Dark mode).</li>\n" +
                                        "    <li>Select whether to import previous settings from a prior installation of Android Studio.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Step 2: Install Android SDK</h3>\n" +
                                        "<p>The Android SDK (Software Development Kit) is required to build Android apps. Android Studio will download and install the SDK during the setup process.</p>\n" +
                                        "<p>You can manage SDK components by going to Preferences (macOS) or Settings (Windows/Linux) → Appearance & Behavior → System Settings → Android SDK.</p>\n" +
                                        "<ul>\n" +
                                        "    <li>Ensure that the latest SDK version is installed.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Step 3: Set Up Android Virtual Device (AVD)</h3>\n" +
                                        "<p>Android Studio uses the AVD Manager to create and manage emulators.</p>\n" +
                                        "<p>Open AVD Manager from the toolbar, select a device (e.g., Pixel 4), and choose a system image (e.g., Android 13).</p>\n" +
                                        "<p>Configure the virtual device settings and start the emulator to simulate an Android device.</p>\n" +
                                        "\n" +
                                        "<hr>\n" +
                                        "\n" +
                                        "<p class=\"text-center\">Happy coding! \uD83D\uDE80</p>\n",
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
                                content = "<h1>Introduction to Mobile App Project Structure</h1>\n" +
                                        "\n" +
                                        "<h2>What is Project Structure?</h2>\n" +
                                        "\n" +
                                        "<p>The project structure defines how your app’s code and resources are organized in your development environment. It influences maintainability, scalability, and team collaboration.</p>\n" +
                                        "\n" +
                                        "<h3>Why Structure Matters:</h3>\n" +
                                        "\n" +
                                        "<ul>\n" +
                                        "    <li>A well-organized project makes it easier to scale, troubleshoot, and collaborate with other developers.</li>\n" +
                                        "    <li>It helps ensure that the code remains clean, understandable, and easy to modify.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>Overview of Android Project Structure</h2>\n" +
                                        "\n" +
                                        "<h3>Basic Anatomy of an Android Studio Project:</h3>\n" +
                                        "\n" +
                                        "<p>When you create a new project in Android Studio, the IDE automatically generates a project with predefined folders and files.</p>\n" +
                                        "\n" +
                                        "<h3>Key Project Folders and Files:</h3>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>app/:</strong> This is the main directory for your app's code and resources.</li>\n" +
                                        "    <li><strong>src/main/:</strong> Contains all the source code and resources for the app.</li>\n" +
                                        "    <li><strong>java/ (or kotlin/ for Kotlin):</strong> Contains the app's Java or Kotlin code.</li>\n" +
                                        "    <li><strong>res/:</strong> Contains resources such as layouts, strings, images, and styles.</li>\n" +
                                        "    <li><strong>AndroidManifest.xml:</strong> The manifest file, which defines the structure of the app, including its components (activities, services, permissions, etc.).</li>\n" +
                                        "    <li><strong>assets/:</strong> Contains raw files like fonts or audio used in the app.</li>\n" +
                                        "    <li><strong>build.gradle:</strong> The project build script, which defines dependencies and configurations.</li>\n" +
                                        "    <li><strong>gradle/:</strong> Contains Gradle-related files for managing dependencies and building the app.</li>\n" +
                                        "    <li><strong>build/:</strong> This folder is automatically created by Android Studio during the build process and contains compiled resources and APKs.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Folder Structure Overview:</h3>\n" +
                                        "<pre><code class=\"language-text\">\n" +
                                        "MyApp/\n" +
                                        "├── app/\n" +
                                        "│   ├── src/\n" +
                                        "│   │   └── main/\n" +
                                        "│   │       ├── java/\n" +
                                        "│   │       │   └── com/\n" +
                                        "│   │       │       └── example/\n" +
                                        "│   │       │           └── myapp/\n" +
                                        "│   │       │               ├── MainActivity.kt\n" +
                                        "│   │       │               ├── LoginActivity.kt\n" +
                                        "│   │       │               ├── viewmodels/\n" +
                                        "│   │       │               │   └── MainViewModel.kt\n" +
                                        "│   │       │               └── repositories/\n" +
                                        "│   │       │                   └── UserRepository.kt\n" +
                                        "│   │       ├── res/\n" +
                                        "│   │       │   ├── layout/\n" +
                                        "│   │       │   │   ├── activity_main.xml\n" +
                                        "│   │       │   │   └── activity_login.xml\n" +
                                        "│   │       │   ├── drawable/\n" +
                                        "│   │       │   │   └── ic_launcher.png\n" +
                                        "│   │       │   ├── values/\n" +
                                        "│   │       │   │   ├── strings.xml\n" +
                                        "│   │       │   │   └── colors.xml\n" +
                                        "│   │       └── AndroidManifest.xml\n" +
                                        "└── build.gradle\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>Best Practices for Organizing Code in Android Projects</h2>\n" +
                                        "\n" +
                                        "<h3>Separation of Concerns</h3>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Activity/Fragment:</strong> Manages UI and interacts with the user.</li>\n" +
                                        "    <li><strong>ViewModel:</strong> Holds UI-related data and is used for managing data in a lifecycle-conscious way.</li>\n" +
                                        "    <li><strong>Repository:</strong> Manages data sources (e.g., databases, APIs, etc.) and provides them to the ViewModel.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Use the Model-View-ViewModel (MVVM) Pattern:</h3>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Model:</strong> Represents the data and business logic.</li>\n" +
                                        "    <li><strong>View:</strong> Represents the UI elements.</li>\n" +
                                        "    <li><strong>ViewModel:</strong> Handles the interaction between the View and the Model.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Modularization</h3>\n" +
                                        "<p>Divide your project into smaller, manageable modules or packages. For example, organize features into their own packages (e.g., auth, profile, settings).</p>\n" +
                                        "\n" +
                                        "<h3>Organizing Activities, Fragments, and Views</h3>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Activities:</strong> Use activities to represent full-screen pages or entry points (e.g., MainActivity, LoginActivity).</li>\n" +
                                        "    <li><strong>Fragments:</strong> Use fragments for reusable UI components (e.g., a fragment showing a list of items).</li>\n" +
                                        "    <li><strong>Views:</strong> Create custom views if you need to reuse a complex UI element across multiple activities or fragments.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Managing Resources</h3>\n" +
                                        "<p>Organize your layouts, images, strings, and other resources under their respective folders:</p>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>res/layout/:</strong> Contains XML files for layouts.</li>\n" +
                                        "    <li><strong>res/drawable/:</strong> Contains images (e.g., icons, background images).</li>\n" +
                                        "    <li><strong>res/values/:</strong> Contains values like strings, colors, and dimensions.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Avoiding Hardcoding</h3>\n" +
                                        "<p>Always place strings, colors, and other constants in XML files (strings.xml, colors.xml) rather than hardcoding them in Java/Kotlin code.</p>\n" +
                                        "\n" +
                                        "<h2>Version Control and Collaboration</h2>\n" +
                                        "\n" +
                                        "<h3>Git for Version Control</h3>\n" +
                                        "<p>Use Git to track changes, collaborate with other developers, and manage different versions of your app.</p>\n" +
                                        "<p>Add a <code>.gitignore</code> file to exclude unnecessary files from being tracked (e.g., build files, local configurations).</p>\n" +
                                        "\n" +
                                        "<h3>Branching and Pull Requests</h3>\n" +
                                        "<ul>\n" +
                                        "    <li>Use branches for different features or bug fixes.</li>\n" +
                                        "    <li>Create pull requests to review and merge changes into the main codebase.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>Testing and Debugging</h2>\n" +
                                        "\n" +
                                        "<h3>Unit Tests:</h3>\n" +
                                        "<p>Place unit tests in the <code>src/test/</code> directory and use frameworks like JUnit for unit testing.</p>\n" +
                                        "\n" +
                                        "<h3>UI Tests:</h3>\n" +
                                        "<p>Use Espresso for testing the user interface in the <code>src/androidTest/</code> directory.</p>\n" +
                                        "\n" +
                                        "<h3>Debugging:</h3>\n" +
                                        "<p>Use Android Studio’s Logcat and debugger to troubleshoot issues in your code.</p>\n" +
                                        "\n" +
                                        "<hr>\n" +
                                        "\n" +
                                        "<p class=\"text-center\">Happy coding! \uD83D\uDE80</p>\n",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 5,
                                moduleId = 2,
                                name = "Creating Simple User Interface",
                                orderIndex = 2,
                                content = "<h1>Introduction to Designing Android App Interfaces</h1>\n" +
                                        "\n" +
                                        "<div class=\"alert alert-info\">\n" +
                                        "    <div class=\"alert-title\">Prasyarat Pembelajaran</div>\n" +
                                        "    <p>Desain antarmuka pengguna (UI) memainkan peran penting dalam menciptakan pengalaman pengguna (UX) yang baik. Dalam pengembangan aplikasi Android, penting untuk memahami elemen-elemen dasar dalam mendesain UI untuk memberikan pengalaman yang mulus bagi pengguna.</p>\n" +
                                        "</div>\n" +
                                        "\n" +
                                        "<h2>What is a User Interface?</h2>\n" +
                                        "\n" +
                                        "<p>A user interface (UI) is the part of the app that users interact with. It includes buttons, text fields, images, and other visual elements that allow users to navigate and interact with the app.</p>\n" +
                                        "\n" +
                                        "<h3>Why UI Design Matters?</h3>\n" +
                                        "\n" +
                                        "<ul>\n" +
                                        "    <li>A well-designed UI ensures a smooth, intuitive user experience (UX). It helps users navigate the app with ease, understand its functionality, and have a positive overall experience.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Key Android UI Elements:</h3>\n" +
                                        "\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Buttons:</strong> Allow users to perform actions.</li>\n" +
                                        "    <li><strong>TextViews:</strong> Display text to users.</li>\n" +
                                        "    <li><strong>EditTexts:</strong> Input fields for text entry.</li>\n" +
                                        "    <li><strong>Images:</strong> Display graphical content (e.g., logos, icons).</li>\n" +
                                        "    <li><strong>Layouts:</strong> Organize UI elements on the screen (LinearLayout, RelativeLayout, ConstraintLayout, etc.).</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>Basics of Layouts in Android</h2>\n" +
                                        "\n" +
                                        "<h3>What are Layouts?</h3>\n" +
                                        "\n" +
                                        "<p>Layouts in Android define the structure and positioning of UI components on the screen. Android provides several layout types that help arrange and organize UI elements.</p>\n" +
                                        "\n" +
                                        "<h3>Common Layout Types:</h3>\n" +
                                        "\n" +
                                        "<ul>\n" +
                                        "    <li><strong>LinearLayout:</strong> Arranges children (views) in a single row or column.</li>\n" +
                                        "    <li><strong>RelativeLayout:</strong> Allows child views to be positioned relative to each other.</li>\n" +
                                        "    <li><strong>ConstraintLayout:</strong> A flexible layout where you define constraints between views, allowing for more complex UI designs.</li>\n" +
                                        "    <li><strong>FrameLayout:</strong> Used to display a single view or as a container for dynamic fragments.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Choosing the Right Layout:</h3>\n" +
                                        "\n" +
                                        "<ul>\n" +
                                        "    <li><strong>LinearLayout:</strong> Good for simple vertical or horizontal arrangements.</li>\n" +
                                        "    <li><strong>RelativeLayout:</strong> Useful when you need to position elements relative to each other.</li>\n" +
                                        "    <li><strong>ConstraintLayout:</strong> Best for more complex designs where elements need to be positioned precisely.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>Creating and Designing the Basic UI</h2>\n" +
                                        "\n" +
                                        "<h3>Step 1: Creating a New Activity Layout</h3>\n" +
                                        "\n" +
                                        "<p>In Android Studio, navigate to <code>res/layout/</code> and open <code>activity_main.xml</code> (or create a new layout file). Android Studio provides a Text Editor (XML code view) and a Design Editor (drag-and-drop UI builder). You can use either, or both, to design your interface.</p>\n" +
                                        "\n" +
                                        "<h3>Step 2: Adding UI Components</h3>\n" +
                                        "\n" +
                                        "<p>To design a basic layout, you can add components such as:</p>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>TextView:</strong> Displays text to the user.</li>\n" +
                                        "    <li><strong>Button:</strong> Allows the user to perform an action.</li>\n" +
                                        "    <li><strong>EditText:</strong> An input field where users can type text.</li>\n" +
                                        "    <li><strong>ImageView:</strong> Displays images, such as logos or icons.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h4>Example Layout:</h4>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                                        "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"match_parent\"\n" +
                                        "    android:orientation=\"vertical\"\n" +
                                        "    android:padding=\"16dp\">\n" +
                                        "\n" +
                                        "    <TextView\n" +
                                        "        android:id=\"@+id/welcomeText\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Welcome to My App\"\n" +
                                        "        android:textSize=\"24sp\"\n" +
                                        "        android:layout_marginBottom=\"20dp\" />\n" +
                                        "\n" +
                                        "    <EditText\n" +
                                        "        android:id=\"@+id/username\"\n" +
                                        "        android:layout_width=\"match_parent\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:hint=\"Enter your username\"\n" +
                                        "        android:layout_marginBottom=\"20dp\"\n" +
                                        "        android:padding=\"16dp\"\n" +
                                        "        android:background=\"@android:drawable/edit_text\" />\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/loginButton\"\n" +
                                        "        android:layout_width=\"match_parent\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Login\"\n" +
                                        "        android:background=\"?android:attr/selectableItemBackground\"\n" +
                                        "        android:textColor=\"@android:color/white\"\n" +
                                        "        android:layout_marginBottom=\"20dp\" />\n" +
                                        "</LinearLayout>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Step 3: Understand the XML Components:</h3>\n" +
                                        "\n" +
                                        "<ul>\n" +
                                        "    <li><strong>LinearLayout:</strong> A layout that arranges its child views in a vertical column (as specified by <code>android:orientation=\"vertical\"</code>).</li>\n" +
                                        "    <li><strong>TextView:</strong> Displays static text. Here, the text is set to “Welcome to My App”, and its size is defined as 24sp.</li>\n" +
                                        "    <li><strong>EditText:</strong> A field where users can input their username. It has a hint text (\"Enter your username\") displayed when the field is empty.</li>\n" +
                                        "    <li><strong>Button:</strong> A clickable button with the label \"Login\".</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>Working with Constraints (Using ConstraintLayout)</h2>\n" +
                                        "\n" +
                                        "<h3>What is ConstraintLayout?</h3>\n" +
                                        "\n" +
                                        "<p>ConstraintLayout is a more powerful layout type that allows you to define rules (constraints) for the positioning of views relative to one another. It helps create complex layouts without nesting multiple layouts.</p>\n" +
                                        "\n" +
                                        "<h3>Using ConstraintLayout in XML:</h3>\n" +
                                        "\n" +
                                        "<h4>Example:</h4>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                                        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"match_parent\">\n" +
                                        "\n" +
                                        "    <TextView\n" +
                                        "        android:id=\"@+id/welcomeText\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Welcome to My App\"\n" +
                                        "        android:textSize=\"24sp\"\n" +
                                        "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                                        "        android:layout_marginTop=\"100dp\" />\n" +
                                        "\n" +
                                        "    <EditText\n" +
                                        "        android:id=\"@+id/username\"\n" +
                                        "        android:layout_width=\"0dp\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:hint=\"Enter your username\"\n" +
                                        "        app:layout_constraintTop_toBottomOf=\"@+id/welcomeText\"\n" +
                                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                                        "        android:layout_marginTop=\"20dp\"\n" +
                                        "        android:padding=\"16dp\"\n" +
                                        "        android:background=\"@android:drawable/edit_text\" />\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/loginButton\"\n" +
                                        "        android:layout_width=\"0dp\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Login\"\n" +
                                        "        app:layout_constraintTop_toBottomOf=\"@+id/username\"\n" +
                                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                                        "        android:layout_marginTop=\"20dp\" />\n" +
                                        "</androidx.constraintlayout.widget.ConstraintLayout>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Explanation:</h3>\n" +
                                        "\n" +
                                        "<ul>\n" +
                                        "    <li><strong>ConstraintLayout:</strong> Used to position the TextView, EditText, and Button relative to each other using constraints.</li>\n" +
                                        "    <li><strong>layout_constraintTop_toTopOf=\"parent\":</strong> Positions the TextView at the top of the screen.</li>\n" +
                                        "    <li><strong>layout_constraintTop_toBottomOf=\"@+id/welcomeText\":</strong> Positions the EditText below the TextView.</li>\n" +
                                        "    <li><strong>layout_constraintTop_toBottomOf=\"@+id/username\":</strong> Positions the Button below the EditText.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>Previewing and Testing the UI</h2>\n" +
                                        "\n" +
                                        "<h3>Previewing in Android Studio:</h3>\n" +
                                        "\n" +
                                        "<p>Android Studio allows you to preview your layouts in real-time. Use the Design tab to see a graphical representation of your app layout, or use the Text tab to edit XML directly. You can also use the Preview tool to see how the layout behaves on different screen sizes and orientations (e.g., portrait or landscape).</p>\n" +
                                        "\n" +
                                        "<h3>Testing the UI:</h3>\n" +
                                        "\n" +
                                        "<p>Run the app on an Android Emulator or a physical device to see the layout in action and check for any UI issues. Ensure that elements are aligned properly, that there is enough space\n",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 6,
                                moduleId = 2,
                                name = "Running App on Simulator/Device",
                                orderIndex = 3,
                                content = "<h1>Introduction to App Deployment and Testing</h1>\n" +
                                        "\n" +
                                        "<div class=\"alert alert-info\">\n" +
                                        "    <div class=\"alert-title\">Prasyarat Pembelajaran</div>\n" +
                                        "    <p>Deployment dan pengujian sangat penting untuk memastikan aplikasi berfungsi dengan baik pada berbagai perangkat dan konfigurasi. Pengujian membantu mengidentifikasi bug, masalah kinerja, dan kompatibilitas sebelum aplikasi diluncurkan kepada pengguna.</p>\n" +
                                        "</div>\n" +
                                        "\n" +
                                        "<h2>Why Deploy and Test?</h2>\n" +
                                        "\n" +
                                        "<p>Deployment and testing are crucial to ensure that the app functions as expected on different devices and configurations. Testing helps identify bugs, performance issues, and compatibility problems before the app reaches users.</p>\n" +
                                        "\n" +
                                        "<h3>Key Steps in Deployment and Testing:</h3>\n" +
                                        "\n" +
                                        "<ul>\n" +
                                        "    <li>Build the app and create an APK.</li>\n" +
                                        "    <li>Deploy the app to an emulator or physical device.</li>\n" +
                                        "    <li>Run tests to check the app’s performance and behavior.</li>\n" +
                                        "    <li>Debug issues that arise during testing.</li>\n" +
                                        "    <li>Create release versions for distribution on the Google Play Store.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>Setting Up an Emulator for Testing</h2>\n" +
                                        "\n" +
                                        "<h3>What is an Emulator?</h3>\n" +
                                        "\n" +
                                        "<p>The Android Emulator simulates Android devices on your computer. It allows you to test your app on various Android versions and screen sizes without needing physical devices.</p>\n" +
                                        "\n" +
                                        "<h3>Creating and Configuring an Emulator:</h3>\n" +
                                        "\n" +
                                        "<ol>\n" +
                                        "    <li>In Android Studio, open the AVD Manager (Android Virtual Device Manager) from the toolbar.</li>\n" +
                                        "    <li>Click \"Create Virtual Device\" and select a device model (e.g., Pixel 4, Nexus 5X).</li>\n" +
                                        "    <li>Choose the system image (Android version) you want to test on (e.g., Android 13, or the latest stable version).</li>\n" +
                                        "    <li>Set device parameters (screen size, RAM, etc.), then click \"Finish.\"</li>\n" +
                                        "</ol>\n" +
                                        "\n" +
                                        "<h3>Running the App on the Emulator:</h3>\n" +
                                        "\n" +
                                        "<p>Once the emulator is set up, select it as the deployment target in Android Studio, and click the Run button (green triangle). The app will compile, deploy, and launch on the emulator.</p>\n" +
                                        "\n" +
                                        "<h2>Deploying and Testing on a Physical Device</h2>\n" +
                                        "\n" +
                                        "<h3>Why Use a Physical Device?</h3>\n" +
                                        "\n" +
                                        "<p>Testing on real devices is important because it gives you a better sense of the app’s performance, responsiveness, and behavior in real-world conditions.</p>\n" +
                                        "\n" +
                                        "<h3>Setting Up Your Device:</h3>\n" +
                                        "\n" +
                                        "<ol>\n" +
                                        "    <li><strong>Enable Developer Options:</strong> Go to Settings > About phone, and tap Build number seven times to unlock developer options.</li>\n" +
                                        "    <li><strong>Enable USB Debugging:</strong> In Settings > Developer options, enable USB debugging.</li>\n" +
                                        "    <li><strong>Connect the Device to Your Computer:</strong> Connect your device via USB. Ensure that Android Studio detects your device. You should see your device listed as a deployment target in the run configuration.</li>\n" +
                                        "</ol>\n" +
                                        "\n" +
                                        "<h3>Deploying to a Physical Device:</h3>\n" +
                                        "\n" +
                                        "<p>Select your physical device as the target in Android Studio and click the Run button. Android Studio will compile and install the app directly onto the device. Test the app on the device, checking for UI behavior, responsiveness, and any other specific device-related issues (e.g., hardware features like GPS, camera).</p>\n" +
                                        "\n" +
                                        "<h2>Build Variants and Debugging Configurations</h2>\n" +
                                        "\n" +
                                        "<h3>Understanding Build Variants:</h3>\n" +
                                        "\n" +
                                        "<p>Android Studio allows you to create multiple build variants, such as debug and release builds. You can use build variants to test different versions of your app with different configurations (e.g., with or without debugging tools, or with production configurations).</p>\n" +
                                        "\n" +
                                        "<h3>Creating Build Variants:</h3>\n" +
                                        "\n" +
                                        "<p>By default, Android projects come with two build variants: debug and release. You can customize build variants in the Build.gradle files (e.g., for product flavors or build types).</p>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "android {\n" +
                                        "    buildTypes {\n" +
                                        "        debug {\n" +
                                        "            // Debug-specific settings\n" +
                                        "            debuggable true\n" +
                                        "            applicationIdSuffix \".debug\"\n" +
                                        "        }\n" +
                                        "        release {\n" +
                                        "            // Release-specific settings\n" +
                                        "            minifyEnabled true\n" +
                                        "            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'\n" +
                                        "        }\n" +
                                        "    }\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Running Different Build Variants:</h3>\n" +
                                        "\n" +
                                        "<p>You can select the desired build variant from the Build Variants tab in Android Studio and run it on your device or emulator.</p>\n" +
                                        "\n" +
                                        "<h3>Debugging the App:</h3>\n" +
                                        "\n" +
                                        "<p>Set breakpoints in your code by clicking on the left margin of the code editor in Android Studio. Click the Debug button (the bug icon) to start a debugging session. Android Studio will connect to the device/emulator and pause execution at your breakpoints, allowing you to inspect variables, step through code, and track down issues.</p>\n" +
                                        "\n" +
                                        "<h2>Running Unit and UI Tests</h2>\n" +
                                        "\n" +
                                        "<h3>Unit Tests:</h3>\n" +
                                        "\n" +
                                        "<p>Unit tests are used to test individual components of your app (e.g., classes, methods). You can write unit tests using JUnit (for logic testing) and run them from the test directory (<code>src/test/java/</code>).</p>\n" +
                                        "\n" +
                                        "<h4>Example of a simple unit test:</h4>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-java\">\n" +
                                        "@Test\n" +
                                        "public void testAddition() {\n" +
                                        "    int result = 2 + 2;\n" +
                                        "    assertEquals(4, result);\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>UI Tests:</h3>\n" +
                                        "\n" +
                                        "<p>UI tests check the behavior of the user interface. Use Espresso to automate UI testing. Espresso allows you to simulate user actions such as clicking buttons, typing text, and scrolling, and it validates that the UI behaves as expected.</p>\n" +
                                        "\n" +
                                        "<h4>Example of a simple UI test:</h4>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-java\">\n" +
                                        "@Rule\n" +
                                        "public ActivityScenarioRule<MainActivity> activityRule =\n" +
                                        "        new ActivityScenarioRule<>(MainActivity.class);\n" +
                                        "\n" +
                                        "@Test\n" +
                                        "public void testButtonClick() {\n" +
                                        "    onView(withId(R.id.loginButton)).perform(click());\n" +
                                        "    onView(withId(R.id.username)).check(matches(withText(\"\")));\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Running Tests in Android Studio:</h3>\n" +
                                        "\n" +
                                        "<p>You can run unit tests from the Run menu or using the Test tab in the Android Studio toolbar. For UI tests, you can run them using AndroidJUnitRunner in the test configuration.</p>\n",
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
                                content = "<h1>Introduction to User Interactions</h1>\n" +
                                        "\n" +
                                        "<h2>What is User Interaction?</h2>\n" +
                                        "<p>User interaction refers to the ways users communicate with an app. These interactions include gestures (taps, swipes), text input, button clicks, and other actions that trigger responses from the app. Effective user interaction management is crucial for a smooth and engaging app experience.</p>\n" +
                                        "\n" +
                                        "<h2>Why is User Interaction Important?</h2>\n" +
                                        "<p>The way users interact with an app affects their overall experience. Managing interactions effectively ensures that the app is responsive, intuitive, and provides users with clear feedback.</p>\n" +
                                        "\n" +
                                        "<h2>Basic UI Elements for User Interaction</h2>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Button:</strong> Used to trigger actions when clicked or tapped.</li>\n" +
                                        "    <li><strong>TextView:</strong> Displays static text to the user. Can be updated programmatically.</li>\n" +
                                        "    <li><strong>EditText:</strong> A text input field where users can enter data.</li>\n" +
                                        "    <li><strong>CheckBox:</strong> A checkbox that can be either checked or unchecked.</li>\n" +
                                        "    <li><strong>RadioButton:</strong> Used when a user must choose one option from a set of options.</li>\n" +
                                        "    <li><strong>ImageView:</strong> Displays images or icons, which can also be clickable for user interaction.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>Handling Button Clicks</h2>\n" +
                                        "<h3>Setting Up Button Click Listeners in Kotlin</h3>\n" +
                                        "\n" +
                                        "<p>In Kotlin, you can easily handle button clicks using <code>setOnClickListener</code> for a button, or you can define the <code>onClick</code> attribute in the XML and reference a method directly in the Kotlin code.</p>\n" +
                                        "\n" +
                                        "<h4>Using XML (OnClick Attribute):</h4>\n" +
                                        "<p>In the layout XML file, you can specify an <code>onClick</code> attribute to call a method when the button is clicked:</p>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<Button\n" +
                                        "    android:id=\"@+id/buttonSubmit\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Submit\"\n" +
                                        "    android:onClick=\"onSubmitClicked\" />\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<p>In the <code>MainActivity.kt</code> file, define the <code>onSubmitClicked</code> method:</p>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "fun onSubmitClicked(view: View) {\n" +
                                        "    Toast.makeText(this, \"Button clicked!\", Toast.LENGTH_SHORT).show()\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>Using Kotlin Code (Set OnClickListener):</h4>\n" +
                                        "<p>In Kotlin, you can set an <code>OnClickListener</code> directly in the code:</p>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)\n" +
                                        "buttonSubmit.setOnClickListener {\n" +
                                        "    Toast.makeText(this, \"Button clicked!\", Toast.LENGTH_SHORT).show()\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>Working with Text Input (EditText)</h2>\n" +
                                        "<h3>Getting User Input</h3>\n" +
                                        "<p>The <code>EditText</code> is used for accepting text input from users. You can capture this input and process it accordingly.</p>\n" +
                                        "\n" +
                                        "<h4>Example layout with an EditText:</h4>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<EditText\n" +
                                        "    android:id=\"@+id/editTextUsername\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:hint=\"Enter your username\"\n" +
                                        "    android:inputType=\"text\" />\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Accessing and Using the Input in Kotlin:</h3>\n" +
                                        "<p>To retrieve text entered in an EditText field, you can use the <code>text</code> property:</p>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val editTextUsername = findViewById<EditText>(R.id.editTextUsername)\n" +
                                        "val username = editTextUsername.text.toString()\n" +
                                        "Toast.makeText(this, \"Hello, $username\", Toast.LENGTH_SHORT).show()\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Handling Input Validation:</h3>\n" +
                                        "<p>It's essential to validate the user input to ensure it is appropriate (e.g., non-empty, correct format).</p>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "if (username.isEmpty()) {\n" +
                                        "    Toast.makeText(this, \"Username cannot be empty\", Toast.LENGTH_SHORT).show()\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>Responding to CheckBox and RadioButton Interactions</h2>\n" +
                                        "\n" +
                                        "<h3>CheckBox</h3>\n" +
                                        "<p>A <strong>CheckBox</strong> allows users to select or deselect an option. You can detect whether it is checked or unchecked using an <code>OnCheckedChangeListener</code>.</p>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<CheckBox\n" +
                                        "    android:id=\"@+id/checkBoxAgree\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"I agree to the terms\" />\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>Handling CheckBox Changes in Kotlin:</h4>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val checkBoxAgree = findViewById<CheckBox>(R.id.checkBoxAgree)\n" +
                                        "checkBoxAgree.setOnCheckedChangeListener { _, isChecked ->\n" +
                                        "    if (isChecked) {\n" +
                                        "        Toast.makeText(this, \"Checked\", Toast.LENGTH_SHORT).show()\n" +
                                        "    } else {\n" +
                                        "        Toast.makeText(this, \"Unchecked\", Toast.LENGTH_SHORT).show()\n" +
                                        "    }\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>RadioButton</h3>\n" +
                                        "<p>A <strong>RadioButton</strong> allows the user to select one option from a group of choices. To ensure only one option can be selected at a time, you group them in a <code>RadioGroup</code>.</p>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<RadioGroup\n" +
                                        "    android:id=\"@+id/radioGroupGender\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\">\n" +
                                        "    \n" +
                                        "    <RadioButton\n" +
                                        "        android:id=\"@+id/radioMale\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Male\" />\n" +
                                        "        \n" +
                                        "    <RadioButton\n" +
                                        "        android:id=\"@+id/radioFemale\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Female\" />\n" +
                                        "</RadioGroup>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>Handling RadioButton Selection in Kotlin:</h4>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val radioGroupGender = findViewById<RadioGroup>(R.id.radioGroupGender)\n" +
                                        "radioGroupGender.setOnCheckedChangeListener { _, checkedId ->\n" +
                                        "    when (checkedId) {\n" +
                                        "        R.id.radioMale -> Toast.makeText(this, \"Male selected\", Toast.LENGTH_SHORT).show()\n" +
                                        "        R.id.radioFemale -> Toast.makeText(this, \"Female selected\", Toast.LENGTH_SHORT).show()\n" +
                                        "    }\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>Gesture Detection and Handling</h2>\n" +
                                        "\n" +
                                        "<h3>Handling Touch Gestures</h3>\n" +
                                        "<p>Android supports several touch gestures, such as taps, swipes, long presses, and more, which can be used to enhance user interaction.</p>\n" +
                                        "\n" +
                                        "<h4>Using GestureDetector:</h4>\n" +
                                        "<p><strong>GestureDetector</strong> is a class that helps detect gestures like a single tap, double-tap, or swipe. You can override its methods to detect and respond to these gestures.</p>\n" +
                                        "\n" +
                                        "<h5>Detecting a Single Tap with GestureDetector in Kotlin:</h5>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val gestureDetector = GestureDetector(this, object : GestureDetector.SimpleOnGestureListener() {\n" +
                                        "    override fun onSingleTapUp(e: MotionEvent?): Boolean {\n" +
                                        "        Toast.makeText(this@MainActivity, \"Single tap detected\", Toast.LENGTH_SHORT).show()\n" +
                                        "        return super.onSingleTapUp(e)\n" +
                                        "    }\n" +
                                        "})\n" +
                                        "\n" +
                                        "override fun onTouchEvent(event: MotionEvent): Boolean {\n" +
                                        "    return gestureDetector.onTouchEvent(event) || super.onTouchEvent(event)\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>Using OnTouchListener for Custom Touch Events:</h4>\n" +
                                        "<p>You can also use an <code>OnTouchListener</code> to handle touch events directly on any view (e.g., buttons, images, etc.).</p>\n" +
                                        "\n" +
                                        "<h5>Custom Touch Handling in Kotlin:</h5>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val someView = findViewById<View>(R.id.someView)\n" +
                                        "someView.setOnTouchListener { v, event ->\n" +
                                        "    when (event.action) {\n" +
                                        "        MotionEvent.ACTION_DOWN -> {\n" +
                                        "            Toast.makeText(this, \"Touch started\", Toast.LENGTH_SHORT).show()\n" +
                                        "        }\n" +
                                        "        MotionEvent.ACTION_UP -> {\n" +
                                        "            Toast.makeText(this, \"Touch ended\", Toast.LENGTH_SHORT).show()\n" +
                                        "        }\n" +
                                        "    }\n" +
                                        "    true\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>Launching New Activities</h2>\n" +
                                        "\n" +
                                        "<h3>What is an Activity?</h3>\n" +
                                        "<p>An <strong>Activity</strong> in Android represents a single screen where the user interacts with the app. Multiple activities form the overall structure of an app.</p>\n" +
                                        "\n" +
                                        "<h3>Launching a New Activity in Kotlin:</h3>\n" +
                                        "<p>To navigate to another screen (Activity), you use an <code>Intent</code>. The Intent allows you to specify the activity to launch.</p>\n" +
                                        "\n" +
                                        "<h5>Launching a New Activity (SecondActivity) in Kotlin:</h5>\n" +
                                        "\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val buttonNext = findViewById<Button>(\n",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 8,
                                moduleId = 3,
                                name = "Displaying Data Dynamically",
                                orderIndex = 2,
                                content = "<h1>Introduction to Dynamic Content Rendering</h1>\n" +
                                        "\n" +
                                        "<p>Dynamic content rendering is the process of updating and displaying content that is not static but changes based on user interaction or external data. In mobile app development, this can refer to things like:</p>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>User Input:</strong> Modifying the UI based on what the user has entered in a form or search box.</li>\n" +
                                        "    <li><strong>External Data:</strong> Updating the UI with information pulled from a remote server, database, or API.</li>\n" +
                                        "    <li><strong>Real-Time Updates:</strong> Displaying live data (e.g., live scores, messages, or notifications).</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<p>Dynamic rendering is crucial for keeping your app interactive and engaging.</p>\n" +
                                        "\n" +
                                        "<h2>Key Components for Dynamic Content Rendering</h2>\n" +
                                        "<p>There are several key Android components used for dynamic content rendering:</p>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>TextView:</strong> Displays text that can be updated at runtime.</li>\n" +
                                        "    <li><strong>ImageView:</strong> Displays images that can be loaded dynamically (e.g., from a URL).</li>\n" +
                                        "    <li><strong>RecyclerView:</strong> Used to display dynamic lists and grids efficiently.</li>\n" +
                                        "    <li><strong>ViewModel:</strong> Manages UI-related data in a lifecycle-conscious manner, especially useful for dynamic content tied to user actions.</li>\n" +
                                        "    <li><strong>LiveData:</strong> A lifecycle-aware data holder that can notify the UI of changes to data.</li>\n" +
                                        "    <li><strong>DataBinding:</strong> Simplifies UI updates by binding UI components directly to data sources.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>Dynamic Text Updates Using TextView</h2>\n" +
                                        "<p><strong>TextView</strong> is a fundamental UI component for displaying text in Android. Dynamically updating the text based on user input or real-time data is a common use case.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Updating Text Based on User Input</h3>\n" +
                                        "\n" +
                                        "<h4>XML Layout:</h4>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<EditText\n" +
                                        "    android:id=\"@+id/editTextName\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:hint=\"Enter your name\" />\n" +
                                        "\n" +
                                        "<Button\n" +
                                        "    android:id=\"@+id/buttonSubmit\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Submit\" />\n" +
                                        "\n" +
                                        "<TextView\n" +
                                        "    android:id=\"@+id/textViewGreeting\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Hello, Guest!\" />\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>Kotlin Code:</h4>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val editTextName = findViewById<EditText>(R.id.editTextName)\n" +
                                        "val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)\n" +
                                        "val textViewGreeting = findViewById<TextView>(R.id.textViewGreeting)\n" +
                                        "\n" +
                                        "buttonSubmit.setOnClickListener {\n" +
                                        "    val userName = editTextName.text.toString()\n" +
                                        "    textViewGreeting.text = \"Hello, $userName!\"\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<p>When the user enters their name and clicks \"Submit\", the TextView dynamically updates to greet the user by name.</p>\n" +
                                        "\n" +
                                        "<h2>Dynamic Image Loading Using ImageView</h2>\n" +
                                        "<p><strong>ImageView</strong> is used to display images, and dynamically loading images from external sources (like URLs) or local storage is a common technique in Android apps.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Loading an Image from a URL using Glide</h3>\n" +
                                        "\n" +
                                        "<h4>Add Glide Dependency in build.gradle:</h4>\n" +
                                        "<pre><code class=\"language-gradle\">\n" +
                                        "implementation 'com.github.bumptech.glide:glide:4.15.0'\n" +
                                        "annotationProcessor 'com.github.bumptech.glide:compiler:4.15.0'\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>XML Layout for ImageView:</h4>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<ImageView\n" +
                                        "    android:id=\"@+id/imageView\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"200dp\" />\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>Kotlin Code to Load Image:</h4>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "import com.bumptech.glide.Glide\n" +
                                        "\n" +
                                        "val imageView = findViewById<ImageView>(R.id.imageView)\n" +
                                        "val imageUrl = \"https://example.com/image.jpg\"\n" +
                                        "\n" +
                                        "Glide.with(this)\n" +
                                        "    .load(imageUrl)\n" +
                                        "    .into(imageView)\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<p><strong>Glide</strong> is a popular image loading library in Android that simplifies loading images from URLs into an ImageView. It handles image caching, transformations, and smooth loading.</p>\n" +
                                        "\n" +
                                        "<h2>Dynamic Lists with RecyclerView</h2>\n" +
                                        "<p><strong>RecyclerView</strong> is an efficient widget for displaying lists of data, especially when the data changes or needs to be updated dynamically. Unlike ListView, RecyclerView supports advanced features such as layout management and view recycling.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Displaying a Dynamic List of Users</h3>\n" +
                                        "\n" +
                                        "<h4>Data Model Class:</h4>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "data class User(val name: String, val age: Int)\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>Adapter Class for RecyclerView:</h4>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "class UserAdapter(private val users: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {\n" +
                                        "\n" +
                                        "    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {\n" +
                                        "        val nameTextView: TextView = view.findViewById(R.id.nameTextView)\n" +
                                        "        val ageTextView: TextView = view.findViewById(R.id.ageTextView)\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {\n" +
                                        "        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)\n" +
                                        "        return UserViewHolder(view)\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {\n" +
                                        "        val user = users[position]\n" +
                                        "        holder.nameTextView.text = user.name\n" +
                                        "        holder.ageTextView.text = user.age.toString()\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    override fun getItemCount() = users.size\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>XML Layout for RecyclerView:</h4>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<androidx.recyclerview.widget.RecyclerView\n" +
                                        "    android:id=\"@+id/recyclerView\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"match_parent\" />\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>Activity Code to Set Up RecyclerView:</h4>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)\n" +
                                        "recyclerView.layoutManager = LinearLayoutManager(this)\n" +
                                        "\n" +
                                        "val users = listOf(User(\"Alice\", 25), User(\"Bob\", 30))\n" +
                                        "val adapter = UserAdapter(users)\n" +
                                        "recyclerView.adapter = adapter\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<p><strong>RecyclerView</strong> is used to display a list of users. The <code>UserAdapter</code> binds the <code>User</code> data to each list item, and the layout manager handles how the items are displayed in a vertical or horizontal list. The adapter efficiently manages the list data and updates as needed.</p>\n",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 9,
                                moduleId = 3,
                                name = "Debugging Basics",
                                orderIndex = 3,
                                content = "<h1>Basic Debugging Techniques</h1>\n" +
                                        "\n" +
                                        "<h2>4.1. Using Breakpoints in Android Studio</h2>\n" +
                                        "<p>Breakpoints are one of the most effective ways to stop code execution at a specific line and inspect what’s happening in your app.</p>\n" +
                                        "\n" +
                                        "<h3>Setting Breakpoints</h3>\n" +
                                        "<p>In Android Studio, click in the gutter next to the line number (left side of the editor) where you want the breakpoint. A red dot will appear, indicating the breakpoint is set.</p>\n" +
                                        "\n" +
                                        "<h3>Running the Debugger</h3>\n" +
                                        "<p>Once the breakpoint is set, click on the <strong>Debug</strong> icon (the bug icon) in Android Studio or use the shortcut <code>Shift + F9</code> to start the debugger. Your app will run normally, but when it reaches the breakpoint, it will pause execution, and you can inspect the current state of variables, objects, and the call stack.</p>\n" +
                                        "\n" +
                                        "<h3>Inspecting Variables</h3>\n" +
                                        "<p>While paused at a breakpoint, you can hover over variables to see their values. You can also add variables to the <strong>Variables</strong> tab in the Debugger window to monitor them continuously as the app runs.</p>\n" +
                                        "\n" +
                                        "<h3>Step Over, Step Into, Step Out</h3>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Step Over (F8)</strong>: Executes the current line of code and moves to the next line.</li>\n" +
                                        "    <li><strong>Step Into (F7)</strong>: Jumps into a function/method call to see what happens inside it.</li>\n" +
                                        "    <li><strong>Step Out (Shift + F8)</strong>: If you’re inside a method, it allows you to step out and return to the previous context.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>4.2. Using Log Statements (Logcat)</h2>\n" +
                                        "<p>Another common debugging tool is Logcat, which shows logs and runtime messages from the app while it is running.</p>\n" +
                                        "\n" +
                                        "<h3>Using Log Statements</h3>\n" +
                                        "<p>To print out log messages, use the <code>Log</code> class in Kotlin:</p>\n" +
                                        "<pre><code class=\"language-kotlin\">Log.d(\"MyTag\", \"This is a debug message\")</code></pre>\n" +
                                        "<p>You can use different log levels based on the severity of the message:</p>\n" +
                                        "<ul>\n" +
                                        "    <li><code>Log.d(\"MyTag\", \"Debug message\")</code> – For general debugging.</li>\n" +
                                        "    <li><code>Log.i(\"MyTag\", \"Info message\")</code> – For informative messages.</li>\n" +
                                        "    <li><code>Log.e(\"MyTag\", \"Error message\")</code> – For error messages.</li>\n" +
                                        "    <li><code>Log.w(\"MyTag\", \"Warning message\")</code> – For warning messages.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Viewing Logs</h3>\n" +
                                        "<p>Use the <strong>Logcat</strong> window in Android Studio to view your logs. You can filter logs by Log Level (e.g., Debug, Error) and by Tag (e.g., \"MyTag\"). This is extremely useful for tracking down issues related to data flow, network responses, or understanding the app's behavior at runtime.</p>\n" +
                                        "\n" +
                                        "<h2>4.3. Inspecting the UI with Layout Inspector</h2>\n" +
                                        "<p>UI-related bugs, such as incorrect layouts, views not displaying as expected, or overlapping components, are common in Android development. The Layout Inspector tool allows you to inspect the app's UI in real-time and troubleshoot these kinds of issues.</p>\n" +
                                        "\n" +
                                        "<h3>Using Layout Inspector</h3>\n" +
                                        "<p>While your app is running, open the Layout Inspector by navigating to <code>View → Tool Windows → Layout Inspector</code>.</p>\n" +
                                        "<p>This tool gives you a live view of your app’s UI, showing the widget hierarchy, properties, and layout constraints. You can inspect properties of each view, like its dimensions, position, padding, and margins.</p>\n" +
                                        "\n" +
                                        "<h3>Debugging UI Performance Issues</h3>\n" +
                                        "<p>Use the UI Debugger to inspect how views are being drawn and whether there are any performance bottlenecks.</p>\n" +
                                        "\n" +
                                        "<h2>4.4. Using Android Studio Profiler for Performance Issues</h2>\n" +
                                        "<p>Performance issues, such as high CPU usage, excessive memory consumption, or network delays, can often cause apps to crash or lag. The Android Profiler in Android Studio helps you identify and resolve these issues.</p>\n" +
                                        "\n" +
                                        "<h3>Using the Profiler</h3>\n" +
                                        "<p>Open the Profiler by selecting <code>View → Tool Windows → Profiler</code>. The Profiler shows real-time data on CPU, Memory, and Network usage. You can monitor app performance over time and identify resource spikes, memory leaks, or long-running operations.</p>\n" +
                                        "\n" +
                                        "<h3>Tracking Memory Leaks</h3>\n" +
                                        "<p>The Memory Profiler allows you to track memory usage, which is particularly useful when diagnosing memory leaks. Memory leaks occur when objects are not properly cleared from memory, leading to reduced app performance or crashes.</p>\n" +
                                        "\n" +
                                        "<h2>4.5. Handling Crashes with Exception Handling</h2>\n" +
                                        "<p>Crashes often occur due to unhandled exceptions. To prevent crashes and improve app stability, it’s important to handle exceptions properly.</p>\n" +
                                        "\n" +
                                        "<h3>Using Try-Catch Blocks</h3>\n" +
                                        "<p>In Kotlin, use <code>try-catch</code> blocks to catch exceptions and handle errors gracefully:</p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "try {\n" +
                                        "    val result = 10 / 0\n" +
                                        "} catch (e: ArithmeticException) {\n" +
                                        "    Log.e(\"Error\", \"Cannot divide by zero\", e)\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "<p>This prevents your app from crashing if an exception occurs, and you can log the error for further investigation.</p>\n" +
                                        "\n" +
                                        "<h3>Crash Reporting</h3>\n" +
                                        "<p>Use crash reporting tools like <strong>Firebase Crashlytics</strong> to get detailed logs of uncaught exceptions in production. This can help you identify bugs that only occur in certain conditions.</p>\n",
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
                                content = "<h1>Introduction to Common UI Elements</h1>\n" +
                                        "<p>In Android development, UI elements are the building blocks for creating interactive user interfaces. Common UI elements include components like <strong>TextView</strong>, <strong>Button</strong>, <strong>EditText</strong>, and <strong>ImageView</strong>. These elements help users interact with the app and display information.</p>\n" +
                                        "\n" +
                                        "<h2>2. Using TextView for Displaying Text</h2>\n" +
                                        "<p><strong>TextView</strong> is used to display static or dynamic text in Android apps.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Displaying Static Text:</h3>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<TextView\n" +
                                        "    android:id=\"@+id/textView\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Hello, World!\" />\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Example: Changing Text Dynamically in Kotlin:</h3>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val textView = findViewById<TextView>(R.id.textView)\n" +
                                        "textView.text = \"Welcome to Android!\"\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>3. Using Button for User Interaction</h2>\n" +
                                        "<p><strong>Button</strong> is a clickable UI element that triggers an action when pressed.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Creating a Button:</h3>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<Button\n" +
                                        "    android:id=\"@+id/button\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Click Me\" />\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Example: Handling Button Click in Kotlin:</h3>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val button = findViewById<Button>(R.id.button)\n" +
                                        "button.setOnClickListener {\n" +
                                        "    Toast.makeText(this, \"Button Clicked!\", Toast.LENGTH_SHORT).show()\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>4. Using EditText for User Input</h2>\n" +
                                        "<p><strong>EditText</strong> is used for collecting user input in the form of text.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Creating an EditText:</h3>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<EditText\n" +
                                        "    android:id=\"@+id/editText\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:hint=\"Enter your name\" />\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Example: Accessing User Input in Kotlin:</h3>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val editText = findViewById<EditText>(R.id.editText)\n" +
                                        "val userInput = editText.text.toString()\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>5. Using ImageView for Displaying Images</h2>\n" +
                                        "<p><strong>ImageView</strong> is used to display images such as icons or pictures.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Creating an ImageView:</h3>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<ImageView\n" +
                                        "    android:id=\"@+id/imageView\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"200dp\"\n" +
                                        "    android:src=\"@drawable/sample_image\" />\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Example: Changing Image Dynamically in Kotlin:</h3>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val imageView = findViewById<ImageView>(R.id.imageView)\n" +
                                        "imageView.setImageResource(R.drawable.new_image)\n" +
                                        "</code></pre>\n",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 11,
                                moduleId = 4,
                                name = "Creating Layouts",
                                orderIndex = 2,
                                content = "1. Introduction to Layouts in Android\n" +
                                        "In Android, layouts are containers that define the structure of the UI by arranging views and UI elements. The most commonly used layouts are LinearLayout and RelativeLayout. Each serves a different purpose for arranging UI elements.\n" +
                                        "\n" +
                                        "LinearLayout: Arranges children views in a single horizontal or vertical row.\n" +
                                        "RelativeLayout: Positions children views relative to each other or to the parent container.\n" +
                                        "2. Using LinearLayout\n" +
                                        "LinearLayout is a simple layout manager that arranges its children either vertically or horizontally. You can control the orientation using the android:orientation attribute.\n" +
                                        "\n" +
                                        "Example 1: Vertical LinearLayout\n" +
                                        "In a vertical LinearLayout, views are arranged one below the other.\n" +
                                        "\n" +
                                        "XML Layout:\n" +
                                        "\n" +
                                        "<LinearLayout\n" +
                                        "    android:id=\"@+id/linearLayoutVertical\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:orientation=\"vertical\"\n" +
                                        "    android:padding=\"16dp\">\n" +
                                        "\n" +
                                        "    <TextView\n" +
                                        "        android:id=\"@+id/textView\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Hello, World!\"\n" +
                                        "        android:textSize=\"18sp\" />\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/button\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Click Me\" />\n" +
                                        "</LinearLayout>\n" +
                                        "Example 2: Horizontal LinearLayout\n" +
                                        "In a horizontal LinearLayout, views are arranged side by side.\n" +
                                        "\n" +
                                        "XML Layout:\n" +
                                        "\n" +
                                        "<LinearLayout\n" +
                                        "    android:id=\"@+id/linearLayoutHorizontal\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:orientation=\"horizontal\"\n" +
                                        "    android:padding=\"16dp\">\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/button1\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Button 1\" />\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/button2\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Button 2\" />\n" +
                                        "</LinearLayout>\n" +
                                        "Explanation:\n" +
                                        "\n" +
                                        "android:orientation: Defines the direction (vertical or horizontal) in which child views are laid out.\n" +
                                        "android:layout_width and android:layout_height: Control the size of the layout and views.\n" +
                                        "3. Using RelativeLayout\n" +
                                        "RelativeLayout allows you to position views relative to each other or to the parent container. Views can be aligned to the top, bottom, left, right, or center of the layout.\n" +
                                        "\n" +
                                        "Example 1: Simple RelativeLayout with Views Positioned Relative to Each Other\n" +
                                        "XML Layout:\n" +
                                        "\n" +
                                        "<RelativeLayout\n" +
                                        "    android:id=\"@+id/relativeLayout\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:padding=\"16dp\">\n" +
                                        "\n" +
                                        "    <TextView\n" +
                                        "        android:id=\"@+id/textView\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Welcome to Android!\"\n" +
                                        "        android:textSize=\"18sp\"\n" +
                                        "        android:layout_alignParentTop=\"true\"\n" +
                                        "        android:layout_centerHorizontal=\"true\" />\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/button\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Click Me\"\n" +
                                        "        android:layout_below=\"@id/textView\"\n" +
                                        "        android:layout_centerHorizontal=\"true\" />\n" +
                                        "</RelativeLayout>\n" +
                                        "Explanation:\n" +
                                        "\n" +
                                        "android:layout_alignParentTop=\"true\": Positions the TextView at the top of the RelativeLayout.\n" +
                                        "android:layout_below=\"@id/textView\": Positions the Button below the TextView.\n" +
                                        "android:layout_centerHorizontal=\"true\": Centers the TextView and Button horizontally.\n" +
                                        "Example 2: Aligning Views to Parent Container in RelativeLayout\n" +
                                        "XML Layout:\n" +
                                        "\n" +
                                        "<RelativeLayout\n" +
                                        "    android:id=\"@+id/relativeLayout2\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"match_parent\"\n" +
                                        "    android:padding=\"16dp\">\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/buttonLeft\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Left\"\n" +
                                        "        android:layout_alignParentLeft=\"true\"\n" +
                                        "        android:layout_marginTop=\"20dp\" />\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/buttonRight\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Right\"\n" +
                                        "        android:layout_alignParentRight=\"true\"\n" +
                                        "        android:layout_marginTop=\"20dp\" />\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/buttonCenter\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Center\"\n" +
                                        "        android:layout_centerInParent=\"true\" />\n" +
                                        "</RelativeLayout>\n" +
                                        "Explanation:\n" +
                                        "\n" +
                                        "android:layout_alignParentLeft=\"true\": Aligns the buttonLeft to the left of the parent.\n" +
                                        "android:layout_alignParentRight=\"true\": Aligns the buttonRight to the right of the parent.\n" +
                                        "android:layout_centerInParent=\"true\": Centers the buttonCenter within the parent container.\n",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 12,
                                moduleId = 4,
                                name = "Customizing Styles and Themes",
                                orderIndex = 3,
                                content = "<h1>1. Introduction to Styles and Themes in Android</h1>\n" +
                                        "<p>In Android, styles and themes are used to define the appearance of UI elements (like text size, colors, padding, etc.). While styles apply to individual UI components, themes are applied to the entire app or activity, influencing the overall look and feel.</p>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Style:</strong> A set of attributes that define the visual appearance of a single UI element (e.g., Button, TextView).</li>\n" +
                                        "    <li><strong>Theme:</strong> A collection of styles applied to an entire app or activity to define the global look and feel.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>2. Understanding and Creating Styles</h2>\n" +
                                        "<p>Styles allow you to define reusable sets of properties for individual UI components. This helps you maintain consistency across your app.</p>\n" +
                                        "\n" +
                                        "<h3>Creating a Style:</h3>\n" +
                                        "<p>Define a Style in <code>res/values/styles.xml</code>:</p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<resources>\n" +
                                        "    <!-- Defining a custom style for TextView -->\n" +
                                        "    <style name=\"CustomTextViewStyle\">\n" +
                                        "        <item name=\"android:textSize\">18sp</item>\n" +
                                        "        <item name=\"android:textColor\">#FF5722</item>\n" +
                                        "        <item name=\"android:fontFamily\">sans-serif</item>\n" +
                                        "    </style>\n" +
                                        "\n" +
                                        "    <!-- Defining a custom style for Button -->\n" +
                                        "    <style name=\"CustomButtonStyle\">\n" +
                                        "        <item name=\"android:background\">@drawable/button_background</item>\n" +
                                        "        <item name=\"android:textColor\">#FFFFFF</item>\n" +
                                        "        <item name=\"android:padding\">16dp</item>\n" +
                                        "    </style>\n" +
                                        "</resources>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Applying the Style to a UI Component in XML:</h3>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<Button\n" +
                                        "    android:id=\"@+id/customButton\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Click Me\"\n" +
                                        "    style=\"@style/CustomButtonStyle\" />\n" +
                                        "</code></pre>\n" +
                                        "<p>In this example, the button will use the <code>CustomButtonStyle</code>, which defines its background, text color, and padding.</p>\n" +
                                        "\n" +
                                        "<h3>Overriding Style Attributes:</h3>\n" +
                                        "<p>You can override specific attributes of a style for individual components:</p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<Button\n" +
                                        "    android:id=\"@+id/customButton\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Click Me\"\n" +
                                        "    style=\"@style/CustomButtonStyle\"\n" +
                                        "    android:textColor=\"#4CAF50\" />\n" +
                                        "</code></pre>\n" +
                                        "<p>In this case, <code>textColor</code> will be overridden with the value <code>#4CAF50</code>, while other properties defined in the style will still apply.</p>\n" +
                                        "\n" +
                                        "<h2>3. Understanding and Creating Themes</h2>\n" +
                                        "<p>Themes define the overall style for the entire app or specific activity. A theme can include colors, fonts, buttons, and other UI elements that apply globally.</p>\n" +
                                        "\n" +
                                        "<h3>Creating a Theme:</h3>\n" +
                                        "<p>Define a Theme in <code>res/values/styles.xml</code>:</p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<resources>\n" +
                                        "    <!-- App-wide theme -->\n" +
                                        "    <style name=\"AppTheme\" parent=\"Theme.AppCompat.Light.DarkActionBar\">\n" +
                                        "        <item name=\"android:colorPrimary\">#FF5722</item>\n" +
                                        "        <item name=\"android:colorPrimaryDark\">#E64A19</item>\n" +
                                        "        <item name=\"android:colorAccent\">#8BC34A</item>\n" +
                                        "        <item name=\"android:textColorPrimary\">#212121</item>\n" +
                                        "        <item name=\"android:textColorSecondary\">#757575</item>\n" +
                                        "    </style>\n" +
                                        "</resources>\n" +
                                        "</code></pre>\n" +
                                        "<p>In this example, the theme defines:</p>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Primary Color (colorPrimary):</strong> Used for the app’s main interface.</li>\n" +
                                        "    <li><strong>Primary Dark Color (colorPrimaryDark):</strong> Used for the status bar.</li>\n" +
                                        "    <li><strong>Accent Color (colorAccent):</strong> Used for highlights, like buttons and floating action buttons.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Applying the Theme:</h3>\n" +
                                        "<p>Apply Theme in <code>AndroidManifest.xml</code> for the Entire App:</p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<application\n" +
                                        "    android:theme=\"@style/AppTheme\"\n" +
                                        "    android:label=\"@string/app_name\"\n" +
                                        "    android:icon=\"@mipmap/ic_launcher\">\n" +
                                        "    <activity android:name=\".MainActivity\">\n" +
                                        "        <!-- You can also apply a theme to specific activities -->\n" +
                                        "    </activity>\n" +
                                        "</application>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Apply a Theme to an Individual Activity:</h3>\n" +
                                        "<p>You can also apply a theme to a specific activity by setting it in the <code>&lt;activity&gt;</code> tag in the <code>AndroidManifest.xml</code>:</p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<activity android:name=\".MainActivity\"\n" +
                                        "    android:theme=\"@style/CustomActivityTheme\">\n" +
                                        "</activity>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>4. Working with Color Resources</h2>\n" +
                                        "<p>You can define colors in the <code>res/values/colors.xml</code> file for consistent usage across your app.</p>\n" +
                                        "\n" +
                                        "<h3>Define Colors in <code>res/values/colors.xml</code>:</h3>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<resources>\n" +
                                        "    <color name=\"primaryColor\">#FF5722</color>\n" +
                                        "    <color name=\"primaryDarkColor\">#E64A19</color>\n" +
                                        "    <color name=\"accentColor\">#8BC34A</color>\n" +
                                        "    <color name=\"textColorPrimary\">#212121</color>\n" +
                                        "    <color name=\"textColorSecondary\">#757575</color>\n" +
                                        "</resources>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Using Colors in Styles and Themes:</h3>\n" +
                                        "<p>You can refer to these colors in your styles and themes:</p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<resources>\n" +
                                        "    <style name=\"AppTheme\" parent=\"Theme.AppCompat.Light.DarkActionBar\">\n" +
                                        "        <item name=\"android:colorPrimary\">@color/primaryColor</item>\n" +
                                        "        <item name=\"android:colorPrimaryDark\">@color/primaryDarkColor</item>\n" +
                                        "        <item name=\"android:colorAccent\">@color/accentColor</item>\n" +
                                        "        <item name=\"android:textColorPrimary\">@color/textColorPrimary</item>\n" +
                                        "    </style>\n" +
                                        "</resources>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>5. Creating and Using Custom Drawables</h2>\n" +
                                        "<p>Custom drawables (such as images, gradients, and shapes) can be used in buttons, backgrounds, or other UI elements to enhance the visual design.</p>\n" +
                                        "\n" +
                                        "<h3>Creating a Custom Drawable for Button Background:</h3>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<selector xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                                        "    <item android:drawable=\"@color/colorPrimary\" android:state_pressed=\"true\" />\n" +
                                        "    <item android:drawable=\"@color/colorAccent\" />\n" +
                                        "</selector>\n" +
                                        "</code></pre>\n" +
                                        "<p>This drawable will change the background color of a button when it is pressed.</p>\n" +
                                        "\n" +
                                        "<h3>Using Custom Drawable in Styles:</h3>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<style name=\"CustomButtonStyle\">\n" +
                                        "    <item name=\"android:background\">@drawable/button_background</item>\n" +
                                        "</style>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>6. Supporting Dark Mode</h2>\n" +
                                        "<p>With the introduction of dark mode in Android, you can define different themes for light and dark modes.</p>\n" +
                                        "\n" +
                                        "<h3>Create Dark and Light Themes:</h3>\n" +
                                        "<p><strong>Light theme:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<style name=\"AppTheme.Light\" parent=\"Theme.AppCompat.Light.DarkActionBar\">\n" +
                                        "    <item name=\"android:colorPrimary\">#FF5722</item>\n" +
                                        "    <item name=\"android:colorPrimaryDark\">#E64A19</item>\n" +
                                        "    <item name=\"android:colorAccent\">#8BC34A</item>\n" +
                                        "</style>\n" +
                                        "</code></pre>\n" +
                                        "<p><strong>Dark theme:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<style name=\"AppTheme.Dark\" parent=\"Theme.AppCompat.DayNight.DarkActionBar\">\n" +
                                        "    <item name=\"android:colorPrimary\">#212121</item>\n" +
                                        "    <item name=\"android:colorPrimaryDark\">#000000</item>\n" +
                                        "    <item name=\"android:colorAccent\">#FF4081</item>\n" +
                                        "</style>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h3>Enable Dark Mode in the App:</h3>\n" +
                                        "<p>In your <code>AndroidManifest.xml</code>, set the app to use the AppTheme with DayNight support:</p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<application\n" +
                                        "    android:theme=\"@style/Theme.AppCompat.DayNight\">\n" +
                                        "    <activity android:name=\".MainActivity\">\n" +
                                        "    </activity>\n" +
                                        "</application>\n" +
                                        "</code></pre>\n",
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
                                content = "<h1>1. Introduction to Click Listeners</h1>\n" +
                                        "<p>In Android, a click listener is an event handler that detects when the user taps or clicks on a UI component (such as a button, image, or any clickable element). The most common way to implement click handling is by using the <code>setOnClickListener</code> method.</p>\n" +
                                        "\n" +
                                        "<h2>Why Click Listeners?</h2>\n" +
                                        "<ul>\n" +
                                        "    <li>Respond to user taps or clicks.</li>\n" +
                                        "    <li>Trigger specific actions when a UI element is clicked (e.g., navigating to another screen, showing a message).</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>2. Implementing Click Listeners with <code>setOnClickListener</code></h2>\n" +
                                        "<p>To handle click events, we use the <code>setOnClickListener</code> method on the view (like a Button or ImageView). Here's how you can implement it in Kotlin:</p>\n" +
                                        "\n" +
                                        "<h3>Example 1: Handling Button Click</h3>\n" +
                                        "<p><strong>XML Layout:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<Button\n" +
                                        "    android:id=\"@+id/buttonClick\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Click Me\" />\n" +
                                        "</code></pre>\n" +
                                        "<p><strong>Kotlin Code to Handle Click:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "// Inside your Activity or Fragment\n" +
                                        "val button = findViewById<Button>(R.id.buttonClick)\n" +
                                        "\n" +
                                        "button.setOnClickListener {\n" +
                                        "    // Action to be performed when button is clicked\n" +
                                        "    Toast.makeText(this, \"Button clicked!\", Toast.LENGTH_SHORT).show()\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>findViewById<Button>(R.id.buttonClick)</code>: Finds the button by its ID.</li>\n" +
                                        "    <li><code>setOnClickListener { }</code>: Sets a listener that listens for click events on the button.</li>\n" +
                                        "    <li>Inside the listener block, you can define the action that should be triggered (e.g., showing a toast).</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Example 2: Handling ImageView Click</h3>\n" +
                                        "<p><strong>XML Layout:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<ImageView\n" +
                                        "    android:id=\"@+id/imageViewClick\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:src=\"@drawable/sample_image\" />\n" +
                                        "</code></pre>\n" +
                                        "<p><strong>Kotlin Code to Handle Click:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val imageView = findViewById<ImageView>(R.id.imageViewClick)\n" +
                                        "\n" +
                                        "imageView.setOnClickListener {\n" +
                                        "    // Action to be performed when image is clicked\n" +
                                        "    Toast.makeText(this, \"Image clicked!\", Toast.LENGTH_SHORT).show()\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>3. Implementing Long Click Listeners</h2>\n" +
                                        "<p>A long click is a touch event where the user presses and holds an element for a longer duration. To handle this, you can use <code>setOnLongClickListener</code>.</p>\n" +
                                        "\n" +
                                        "<h3>Example 1: Handling Long Click on Button</h3>\n" +
                                        "<p><strong>XML Layout:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<Button\n" +
                                        "    android:id=\"@+id/buttonLongClick\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Long Click Me\" />\n" +
                                        "</code></pre>\n" +
                                        "<p><strong>Kotlin Code to Handle Long Click:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val buttonLongClick = findViewById<Button>(R.id.buttonLongClick)\n" +
                                        "\n" +
                                        "buttonLongClick.setOnLongClickListener {\n" +
                                        "    // Action to be performed on long click\n" +
                                        "    Toast.makeText(this, \"Button long clicked!\", Toast.LENGTH_SHORT).show()\n" +
                                        "    true  // Return true to indicate the event was handled\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li>The <code>setOnLongClickListener</code> method is used to detect long clicks.</li>\n" +
                                        "    <li>The method returns <code>true</code> to indicate that the long click event has been handled. If <code>false</code> is returned, the event may also trigger a regular click.</li>\n" +
                                        "</ul>\n",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 14,
                                moduleId = 5,
                                name = "Creating Forms and Input Fields",
                                orderIndex = 2,
                                content = "<h1>1. Introduction to Forms and Input Fields in Android</h1>\n" +
                                        "<p>Forms are essential in mobile apps for gathering user input, such as text, numbers, choices, or dates. Android provides a variety of UI components for creating interactive and user-friendly forms.</p>\n" +
                                        "\n" +
                                        "<h2>Common input fields in Android:</h2>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>EditText:</strong> For single-line or multi-line text input.</li>\n" +
                                        "    <li><strong>RadioButton:</strong> For selecting one option from a group.</li>\n" +
                                        "    <li><strong>CheckBox:</strong> For selecting multiple options.</li>\n" +
                                        "    <li><strong>Spinner:</strong> For selecting an item from a drop-down list.</li>\n" +
                                        "    <li><strong>Button:</strong> For submitting the form or performing an action.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>2. Creating Text Input Fields with EditText</h2>\n" +
                                        "<p>The most common input field in forms is EditText, used for capturing text from the user.</p>\n" +
                                        "\n" +
                                        "<h3>Example 1: Single-line Text Input (Username Field)</h3>\n" +
                                        "<p><strong>XML Layout:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<EditText\n" +
                                        "    android:id=\"@+id/editTextUsername\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:hint=\"Enter your username\"\n" +
                                        "    android:inputType=\"text\" />\n" +
                                        "</code></pre>\n" +
                                        "<p><strong>Kotlin Code to Capture Input:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val usernameEditText = findViewById<EditText>(R.id.editTextUsername)\n" +
                                        "val username = usernameEditText.text.toString()\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>android:inputType=\"text\"</code>: Specifies that the input is a regular text string.</li>\n" +
                                        "    <li><code>text.toString()</code>: Retrieves the text entered by the user.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Example 2: Multi-line Text Input (Comment Field)</h3>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<EditText\n" +
                                        "    android:id=\"@+id/editTextComment\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:hint=\"Enter your comment\"\n" +
                                        "    android:inputType=\"textMultiLine\"\n" +
                                        "    android:lines=\"4\"\n" +
                                        "    android:maxLines=\"6\"\n" +
                                        "    android:scrollbars=\"vertical\" />\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>android:inputType=\"textMultiLine\"</code>: Specifies that the input field can accept multiple lines of text.</li>\n" +
                                        "    <li><code>android:lines</code> and <code>android:maxLines</code>: Define the minimum and maximum number of visible lines in the text field.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>3. Using RadioButton for Single Choice Selections</h2>\n" +
                                        "<p>RadioButton is used when you want the user to select one option from a set of predefined options.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Single Choice Options (Gender Selection)</h3>\n" +
                                        "<p><strong>XML Layout:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<RadioGroup\n" +
                                        "    android:id=\"@+id/radioGroupGender\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\">\n" +
                                        "\n" +
                                        "    <RadioButton\n" +
                                        "        android:id=\"@+id/radioMale\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Male\" />\n" +
                                        "\n" +
                                        "    <RadioButton\n" +
                                        "        android:id=\"@+id/radioFemale\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Female\" />\n" +
                                        "</RadioGroup>\n" +
                                        "</code></pre>\n" +
                                        "<p><strong>Kotlin Code to Capture Selected Option:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val genderGroup = findViewById<RadioGroup>(R.id.radioGroupGender)\n" +
                                        "val selectedGenderId = genderGroup.checkedRadioButtonId\n" +
                                        "val selectedGender = findViewById<RadioButton>(selectedGenderId).text.toString()\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>RadioGroup</code>: A container that groups the RadioButton elements together so that only one option can be selected at a time.</li>\n" +
                                        "    <li><code>checkedRadioButtonId</code>: Returns the ID of the selected RadioButton.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>4. Using CheckBox for Multiple Choices</h2>\n" +
                                        "<p>CheckBox allows users to select one or more options from a list of choices.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Multiple Choice Options (Hobbies Selection)</h3>\n" +
                                        "<p><strong>XML Layout:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<CheckBox\n" +
                                        "    android:id=\"@+id/checkBoxReading\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Reading\" />\n" +
                                        "\n" +
                                        "<CheckBox\n" +
                                        "    android:id=\"@+id/checkBoxGaming\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Gaming\" />\n" +
                                        "\n" +
                                        "<CheckBox\n" +
                                        "    android:id=\"@+id/checkBoxTraveling\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Traveling\" />\n" +
                                        "</code></pre>\n" +
                                        "<p><strong>Kotlin Code to Capture Selected Options:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val readingCheckBox = findViewById<CheckBox>(R.id.checkBoxReading)\n" +
                                        "val gamingCheckBox = findViewById<CheckBox>(R.id.checkBoxGaming)\n" +
                                        "val travelingCheckBox = findViewById<CheckBox>(R.id.checkBoxTraveling)\n" +
                                        "\n" +
                                        "val hobbies = mutableListOf<String>()\n" +
                                        "\n" +
                                        "if (readingCheckBox.isChecked) hobbies.add(\"Reading\")\n" +
                                        "if (gamingCheckBox.isChecked) hobbies.add(\"Gaming\")\n" +
                                        "if (travelingCheckBox.isChecked) hobbies.add(\"Traveling\")\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>isChecked</code>: A boolean property that indicates whether the checkbox is checked or not.</li>\n" +
                                        "    <li>The selected options are stored in a list for further processing.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>5. Using Spinner for Dropdown Selections</h2>\n" +
                                        "<p>A Spinner is used for displaying a dropdown menu, allowing the user to select an option from a list.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Dropdown Menu for Country Selection</h3>\n" +
                                        "<p><strong>XML Layout:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<Spinner\n" +
                                        "    android:id=\"@+id/spinnerCountry\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"wrap_content\" />\n" +
                                        "</code></pre>\n" +
                                        "<p><strong>Kotlin Code to Set Up Spinner:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val spinnerCountry = findViewById<Spinner>(R.id.spinnerCountry)\n" +
                                        "\n" +
                                        "val countries = listOf(\"USA\", \"Canada\", \"Mexico\", \"UK\", \"Australia\")\n" +
                                        "val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)\n" +
                                        "adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)\n" +
                                        "\n" +
                                        "spinnerCountry.adapter = adapter\n" +
                                        "\n" +
                                        "spinnerCountry.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {\n" +
                                        "    override fun onItemSelected(parentView: AdapterView<*>?, view: View?, position: Int, id: Long) {\n" +
                                        "        val selectedCountry = parentView?.getItemAtPosition(position).toString()\n" +
                                        "        Toast.makeText(applicationContext, \"Selected Country: $selectedCountry\", Toast.LENGTH_SHORT).show()\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    override fun onNothingSelected(parentView: AdapterView<*>?) {}\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>ArrayAdapter</code>: Adapts a list of items (in this case, country names) to be displayed in the Spinner.</li>\n" +
                                        "    <li><code>onItemSelectedListener</code>: Detects when the user selects an item from the dropdown.</li>\n" +
                                        "</ul>\n",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 15,
                                moduleId = 5,
                                name = "Handling UI Feedback",
                                orderIndex = 3,
                                content = "<h1>1. Introduction to UI Feedback</h1>\n" +
                                        "<p>UI feedback provides users with visual or interactive cues to indicate that their actions have been acknowledged by the app. Proper feedback ensures a smooth and engaging user experience.</p>\n" +
                                        "\n" +
                                        "<h2>Types of feedback:</h2>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Toasts:</strong> Brief, non-intrusive messages that appear for a short period.</li>\n" +
                                        "    <li><strong>Snackbars:</strong> Similar to Toasts but can contain actions (e.g., undo).</li>\n" +
                                        "    <li><strong>Dialogs:</strong> Modal windows for displaying important information or confirming actions.</li>\n" +
                                        "    <li><strong>Progress Indicators:</strong> Show that a task is ongoing (e.g., loading spinner, progress bar).</li>\n" +
                                        "    <li><strong>Button State Changes:</strong> Change button appearance based on user interaction.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>2. Displaying Brief Feedback with Toasts</h2>\n" +
                                        "<p>Toasts are used to show short, non-blocking messages to the user. They disappear automatically after a few seconds.</p>\n" +
                                        "\n" +
                                        "<h3>Example 1: Displaying a Simple Toast</h3>\n" +
                                        "<p><strong>Kotlin Code:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "Toast.makeText(this, \"Operation Successful\", Toast.LENGTH_SHORT).show()\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>Toast.makeText()</code>: Creates a toast message.</li>\n" +
                                        "    <li>The first argument is the Context, usually <code>this</code> in an Activity or <code>getContext()</code> in a Fragment.</li>\n" +
                                        "    <li>The second argument is the message to display.</li>\n" +
                                        "    <li>The third argument is the duration (<code>Toast.LENGTH_SHORT</code> or <code>Toast.LENGTH_LONG</code>).</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Example 2: Displaying a Toast with a Custom Message</h3>\n" +
                                        "<p><strong>Kotlin Code:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val username = findViewById<EditText>(R.id.editTextUsername).text.toString()\n" +
                                        "if (username.isEmpty()) {\n" +
                                        "    Toast.makeText(this, \"Please enter a username\", Toast.LENGTH_SHORT).show()\n" +
                                        "} else {\n" +
                                        "    Toast.makeText(this, \"Hello, $username!\", Toast.LENGTH_SHORT).show()\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li>Dynamic content can be inserted into the Toast message.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>3. Using Snackbars for Actionable Feedback</h2>\n" +
                                        "<p>A Snackbar is a more advanced form of feedback compared to a Toast. Snackbars appear at the bottom of the screen and can include an action (e.g., an undo button).</p>\n" +
                                        "\n" +
                                        "<h3>Example 1: Simple Snackbar with Message</h3>\n" +
                                        "<p><strong>XML Layout:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<Button\n" +
                                        "    android:id=\"@+id/buttonShowSnackbar\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:text=\"Show Snackbar\" />\n" +
                                        "</code></pre>\n" +
                                        "<p><strong>Kotlin Code to Show Snackbar:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val button = findViewById<Button>(R.id.buttonShowSnackbar)\n" +
                                        "\n" +
                                        "button.setOnClickListener {\n" +
                                        "    Snackbar.make(it, \"Item deleted\", Snackbar.LENGTH_SHORT).show()\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>Snackbar.make(view, message, duration)</code>: Creates and shows a Snackbar.</li>\n" +
                                        "    <li>The first argument is the view (typically the root view) from which the Snackbar will be displayed.</li>\n" +
                                        "    <li>The second argument is the message you want to show.</li>\n" +
                                        "    <li>The third argument is the duration (<code>Snackbar.LENGTH_SHORT</code> or <code>Snackbar.LENGTH_LONG</code>).</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Example 2: Snackbar with Action</h3>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "Snackbar.make(view, \"Item deleted\", Snackbar.LENGTH_LONG)\n" +
                                        "    .setAction(\"UNDO\") {\n" +
                                        "        // Undo action logic here\n" +
                                        "        Toast.makeText(this, \"Undo clicked\", Toast.LENGTH_SHORT).show()\n" +
                                        "    }\n" +
                                        "    .show()\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>setAction(\"UNDO\", actionListener)</code>: Adds an action (like an undo button) to the Snackbar.</li>\n" +
                                        "    <li>The <code>actionListener</code> defines what happens when the action is clicked (in this case, showing a Toast message).</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>4. Displaying Information with Dialogs</h2>\n" +
                                        "<p>Dialogs are useful for displaying important information or asking for confirmation from the user. Android provides several types of dialogs, such as AlertDialog, ProgressDialog, and custom dialogs.</p>\n" +
                                        "\n" +
                                        "<h3>Example 1: Basic AlertDialog</h3>\n" +
                                        "<p>An AlertDialog is a common dialog for simple messages, warnings, or confirmation.</p>\n" +
                                        "\n" +
                                        "<p><strong>Kotlin Code for AlertDialog:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val builder = AlertDialog.Builder(this)\n" +
                                        "builder.setTitle(\"Confirm Deletion\")\n" +
                                        "    .setMessage(\"Are you sure you want to delete this item?\")\n" +
                                        "    .setPositiveButton(\"Yes\") { dialog, which ->\n" +
                                        "        // Code for deleting the item\n" +
                                        "        Toast.makeText(this, \"Item deleted\", Toast.LENGTH_SHORT).show()\n" +
                                        "    }\n" +
                                        "    .setNegativeButton(\"No\") { dialog, which ->\n" +
                                        "        // Code for canceling the operation\n" +
                                        "        Toast.makeText(this, \"Operation canceled\", Toast.LENGTH_SHORT).show()\n" +
                                        "    }\n" +
                                        "    .show()\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>setTitle()</code> and <code>setMessage()</code> set the dialog’s title and message.</li>\n" +
                                        "    <li><code>setPositiveButton()</code> and <code>setNegativeButton()</code> define actions for the positive (e.g., \"Yes\") and negative (e.g., \"No\") buttons.</li>\n" +
                                        "    <li><code>show()</code> displays the dialog.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Example 2: Customizing the Dialog Layout</h3>\n" +
                                        "<p>You can customize the layout of the dialog by using a custom view.</p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val dialogView = layoutInflater.inflate(R.layout.custom_dialog, null)\n" +
                                        "val builder = AlertDialog.Builder(this)\n" +
                                        "    .setView(dialogView)\n" +
                                        "    .setPositiveButton(\"Confirm\") { dialog, which ->\n" +
                                        "        // Handle confirmation\n" +
                                        "    }\n" +
                                        "    .setNegativeButton(\"Cancel\") { dialog, which ->\n" +
                                        "        // Handle cancellation\n" +
                                        "    }\n" +
                                        "builder.show()\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>setView(dialogView)</code>: Inflates a custom layout for the dialog.</li>\n" +
                                        "    <li>Custom layouts allow for more complex dialog designs.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>5. Showing Progress Indicators</h2>\n" +
                                        "<p>Progress indicators are used to inform the user that a process is ongoing, and it can take time to complete (e.g., downloading, uploading).</p>\n" +
                                        "\n" +
                                        "<h3>Example 1: ProgressBar for Indeterminate Progress</h3>\n" +
                                        "<p><strong>XML Layout:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<ProgressBar\n" +
                                        "    android:id=\"@+id/progressBar\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:visibility=\"gone\" />\n" +
                                        "</code></pre>\n" +
                                        "<p><strong>Kotlin Code to Show/Hide ProgressBar:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val progressBar = findViewById<ProgressBar>(R.id.progressBar)\n" +
                                        "\n" +
                                        "// Show progress bar\n" +
                                        "progressBar.visibility = View.VISIBLE\n" +
                                        "\n" +
                                        "// Simulate a task\n" +
                                        "Handler(Looper.getMainLooper()).postDelayed({\n" +
                                        "    // Hide progress bar after task completion\n" +
                                        "    progressBar.visibility = View.GONE\n" +
                                        "}, 2000)\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li>Set the visibility of the ProgressBar to <code>View.VISIBLE</code> to show it and <code>View.GONE</code> to hide it.</li>\n" +
                                        "    <li>You can simulate an operation (e.g., loading) using <code>Handler.postDelayed()</code>.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Example 2: Determinate ProgressBar (Showing Progress Percentage)</h3>\n" +
                                        "<p><strong>XML Layout:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<ProgressBar\n" +
                                        "    android:id=\"@+id/determinateProgressBar\"\n" +
                                        "    android:layout_width=\"wrap_content\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:progress=\"0\"\n" +
                                        "    android:max=\"100\" />\n" +
                                        "</code></pre>\n" +
                                        "<p><strong>Kotlin Code to Update Progress:</strong></p>\n" +
                                        "<pre><code class=\"language-kotlin\">\n" +
                                        "val progressBar = findViewById<ProgressBar>(R.id.determinateProgressBar)\n" +
                                        "\n" +
                                        "for (i in 0..100) {\n" +
                                        "    progressBar.progress = i\n" +
                                        "    Thread.sleep(50)  // Simulate progress update delay\n" +
                                        "}\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li>The ProgressBar with a max value of 100 is used to show the progress in percentage.</li>\n" +
                                        "    <li>The progress is updated with <\n",
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
                                content = "<h1>1. Introduction to Screen Sizes and Densities in Android</h1>\n" +
                                        "<p>Mobile devices come in a wide variety of screen sizes and resolutions, which can impact how an app’s UI looks on different devices. Android provides tools and techniques for building apps that adapt to these different screen configurations, ensuring a consistent user experience.</p>\n" +
                                        "\n" +
                                        "<h2>Key Concepts:</h2>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Screen Size:</strong> The physical dimensions of the device display (e.g., small, normal, large, extra-large).</li>\n" +
                                        "    <li><strong>Screen Density:</strong> The number of pixels per inch (PPI) on the screen, which affects the clarity of the display.</li>\n" +
                                        "    <li><strong>Density-independent Pixels (dp):</strong> A unit of measurement for UI components that ensures consistent sizing across devices with different screen densities.</li>\n" +
                                        "    <li><strong>Scaled Pixels (sp):</strong> Similar to dp but adjusted for user font size preferences.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>2. Understanding Screen Density and Resolution</h2>\n" +
                                        "<p>Screen density refers to the number of pixels per inch (PPI) on a screen. Android categorizes screen densities into buckets:</p>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>ldpi (Low):</strong> 120 dpi</li>\n" +
                                        "    <li><strong>mdpi (Medium):</strong> 160 dpi (baseline)</li>\n" +
                                        "    <li><strong>hdpi (High):</strong> 240 dpi</li>\n" +
                                        "    <li><strong>xhdpi (Extra High):</strong> 320 dpi</li>\n" +
                                        "    <li><strong>xxhdpi (Extra Extra High):</strong> 480 dpi</li>\n" +
                                        "    <li><strong>xxxhdpi (Extra Extra Extra High):</strong> 640 dpi</li>\n" +
                                        "</ul>\n" +
                                        "<p>Screen Resolution refers to the total number of pixels (width × height) that can be displayed on the screen.</p>\n" +
                                        "\n" +
                                        "<p><strong>Density-independent Pixels (dp)</strong> are used to ensure consistent layout across devices with different screen densities.</p>\n" +
                                        "\n" +
                                        "<p><strong>Example:</strong></p>\n" +
                                        "<pre><code>\n" +
                                        "A button with a width of 100dp will appear approximately the same physical size on devices with different screen densities.\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h2>3. Handling Different Screen Sizes</h2>\n" +
                                        "<p>Android supports multiple screen sizes, such as small phones, medium tablets, large tablets, etc. The platform provides a set of configuration qualifiers that can be used to target different screen sizes.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Specifying Layouts for Different Screen Sizes</h3>\n" +
                                        "<p><strong>Default Layout (for mdpi, normal-sized screens):</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<LinearLayout\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:orientation=\"vertical\">\n" +
                                        "    \n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/buttonSubmit\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Submit\" />\n" +
                                        "</LinearLayout>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<p><strong>Layout for Large Screens (res/layout-large/):</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<!-- res/layout-large/activity_main.xml -->\n" +
                                        "<LinearLayout\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:orientation=\"horizontal\">\n" +
                                        "    \n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/buttonSubmit\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Submit\" />\n" +
                                        "\n" +
                                        "    <!-- More UI elements for larger screen -->\n" +
                                        "</LinearLayout>\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li>Android automatically selects the correct layout based on the screen size of the device.</li>\n" +
                                        "    <li>Place layouts for large screens inside the <code>res/layout-large/</code> directory, and for extra-large screens, place them inside <code>res/layout-xlarge/</code>.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Example: Using layout-sw600dp/ for Devices with a Minimum Width of 600dp</h3>\n" +
                                        "<p><strong>Layout for Screens with Minimum Width of 600dp:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<!-- res/layout-sw600dp/activity_main.xml -->\n" +
                                        "<LinearLayout\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"match_parent\"\n" +
                                        "    android:orientation=\"vertical\">\n" +
                                        "    \n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/buttonSubmit\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Submit\" />\n" +
                                        "    \n" +
                                        "    <!-- Other UI elements -->\n" +
                                        "</LinearLayout>\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li>The <code>sw600dp</code> qualifier is used to define layouts for devices with a minimum width of 600dp, typically tablets.</li>\n" +
                                        "    <li>Android selects the correct layout based on the screen width.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>4. Handling Different Screen Densities with Resources</h2>\n" +
                                        "<p>To ensure that images and other visual elements look crisp on high-density screens, you need to provide different versions of your resources for various screen densities.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Providing Different Drawable Resources</h3>\n" +
                                        "<p>Place different versions of your images in the appropriate density-specific folders:</p>\n" +
                                        "<pre><code class=\"language-plaintext\">\n" +
                                        "res/drawable-mdpi/ (for medium density screens)\n" +
                                        "res/drawable-hdpi/ (for high density screens)\n" +
                                        "res/drawable-xhdpi/ (for extra high density screens)\n" +
                                        "res/drawable-xxhdpi/ (for extra extra high density screens)\n" +
                                        "</code></pre>\n" +
                                        "<p><strong>Folder structure:</strong></p>\n" +
                                        "<pre><code class=\"language-plaintext\">\n" +
                                        "res/\n" +
                                        "    drawable-mdpi/\n" +
                                        "        image.png\n" +
                                        "    drawable-hdpi/\n" +
                                        "        image.png\n" +
                                        "    drawable-xhdpi/\n" +
                                        "        image.png\n" +
                                        "    drawable-xxhdpi/\n" +
                                        "        image.png\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li>When Android displays an image, it automatically selects the appropriate drawable based on the screen density.</li>\n" +
                                        "    <li>Use high-quality images in higher density folders to ensure crisp visuals on high-density screens.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>5. Using dp and sp for Consistent Layouts</h2>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>dp (density-independent pixels):</strong> Use dp for defining view dimensions (width, height, margins) to ensure consistency across different screen densities.</li>\n" +
                                        "    <li><strong>sp (scale-independent pixels):</strong> Use sp for font sizes. This unit respects the user’s font size preferences (e.g., if the user has increased the font size in the system settings).</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Example: Using dp and sp for UI Elements</h3>\n" +
                                        "<p><strong>XML Layout with dp and sp:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<LinearLayout\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"wrap_content\"\n" +
                                        "    android:padding=\"16dp\"\n" +
                                        "    android:orientation=\"vertical\">\n" +
                                        "\n" +
                                        "    <TextView\n" +
                                        "        android:id=\"@+id/textViewLabel\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Label\"\n" +
                                        "        android:textSize=\"18sp\" />\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/buttonSubmit\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:layout_marginTop=\"8dp\"\n" +
                                        "        android:text=\"Submit\" />\n" +
                                        "</LinearLayout>\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>android:padding=\"16dp\"</code> ensures the padding is consistent across all screen densities.</li>\n" +
                                        "    <li><code>android:textSize=\"18sp\"</code> ensures the text size respects the user’s preference for font size.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>6. Using ConstraintLayout for Flexible and Responsive UIs</h2>\n" +
                                        "<p>ConstraintLayout is a flexible and powerful layout that allows you to create responsive UIs that adapt to different screen sizes and densities without requiring multiple layout files. It’s especially useful for building UIs that work well across a wide variety of devices.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Creating a Responsive Layout with ConstraintLayout</h3>\n" +
                                        "<p><strong>XML Layout with ConstraintLayout:</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<androidx.constraintlayout.widget.ConstraintLayout\n" +
                                        "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"match_parent\">\n" +
                                        "\n" +
                                        "    <TextView\n" +
                                        "        android:id=\"@+id/textViewLabel\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Welcome\"\n" +
                                        "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                                        "        android:textSize=\"20sp\" />\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/buttonSubmit\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Submit\"\n" +
                                        "        app:layout_constraintTop_toBottomOf=\"@id/textViewLabel\"\n" +
                                        "        app:layout_constraintStart_toStartOf=\"parent\" />\n" +
                                        "</androidx.constraintlayout.widget.ConstraintLayout>\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</\n",
                                createdAt = "2024-01-01",
                                updatedAt = "2024-01-02"
                            ),
                            Unit(
                                id = 17,
                                moduleId = 6,
                                name = "Using Constraint Layouts",
                                orderIndex = 2,
                                content = "<h1>1. Introduction to ConstraintLayout</h1>\n" +
                                        "<p>ConstraintLayout is a powerful, flexible, and efficient layout manager in Android that allows you to create complex UIs with a flat view hierarchy. It is designed to help developers create responsive, adaptable layouts without the need for nested layouts (e.g., LinearLayouts or RelativeLayouts), which can negatively impact performance.</p>\n" +
                                        "\n" +
                                        "<h2>Key Benefits:</h2>\n" +
                                        "<ul>\n" +
                                        "    <li><strong>Flat View Hierarchy:</strong> Reduces the need for nested layouts, improving performance.</li>\n" +
                                        "    <li><strong>Flexibility:</strong> Allows you to create complex layouts using relative positioning.</li>\n" +
                                        "    <li><strong>Guidelines:</strong> Helps align elements consistently without relying on fixed margins or paddings.</li>\n" +
                                        "    <li><strong>Responsive:</strong> Adapts well to different screen sizes and orientations.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>2. Basics of ConstraintLayout</h2>\n" +
                                        "<p>To create a layout with ConstraintLayout, you define constraints on views relative to other views or the parent layout. These constraints specify how the view should be positioned, sized, and aligned.</p>\n" +
                                        "\n" +
                                        "<h3>Basic Syntax for ConstraintLayout</h3>\n" +
                                        "<p>Define the layout in XML:</p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<androidx.constraintlayout.widget.ConstraintLayout\n" +
                                        "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"match_parent\">\n" +
                                        "\n" +
                                        "    <!-- Views go here -->\n" +
                                        "\n" +
                                        "</androidx.constraintlayout.widget.ConstraintLayout>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<p>Define constraints on views:</p>\n" +
                                        "<p>Use <code>app:layout_constraint*</code> attributes to define the relationships between views and their parent or sibling views.</p>\n" +
                                        "\n" +
                                        "<h3>Example: Basic Layout with ConstraintLayout</h3>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<androidx.constraintlayout.widget.ConstraintLayout\n" +
                                        "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"match_parent\">\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/buttonSubmit\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Submit\"\n" +
                                        "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                                        "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                                        "\n" +
                                        "</androidx.constraintlayout.widget.ConstraintLayout>\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li>The Button is constrained to the top, start, and end of the parent <code>ConstraintLayout</code>. This makes it centered horizontally and aligned to the top edge of the screen.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>3. Working with Constraints</h2>\n" +
                                        "<p>Constraints define how a view is positioned in the layout relative to other views or its parent container.</p>\n" +
                                        "\n" +
                                        "<h3>Types of Constraints:</h3>\n" +
                                        "<h4>Horizontal Constraints:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>app:layout_constraintStart_toStartOf=\"parent\"</code>: Positions the view's left edge to the left edge of the parent.</li>\n" +
                                        "    <li><code>app:layout_constraintEnd_toEndOf=\"parent\"</code>: Positions the view's right edge to the right edge of the parent.</li>\n" +
                                        "    <li><code>app:layout_constraintHorizontal_bias</code>: A float value between 0.0 and 1.0 that adjusts the horizontal position of the view.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h4>Vertical Constraints:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>app:layout_constraintTop_toTopOf=\"parent\"</code>: Positions the view’s top edge to the top edge of the parent.</li>\n" +
                                        "    <li><code>app:layout_constraintBottom_toBottomOf=\"parent\"</code>: Positions the view’s bottom edge to the bottom edge of the parent.</li>\n" +
                                        "    <li><code>app:layout_constraintVertical_bias</code>: A float value between 0.0 and 1.0 that adjusts the vertical position of the view.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h4>Dimension Constraints:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li><code>app:layout_constraintWidth_default</code>: Defines how the width is determined (e.g., wrap_content, match_parent).</li>\n" +
                                        "    <li><code>app:layout_constraintHeight_default</code>: Defines how the height is determined.</li>\n" +
                                        "    <li><code>app:layout_constraintDimensionRatio</code>: Specifies a ratio between width and height.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h3>Example: Button with Multiple Constraints</h3>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<androidx.constraintlayout.widget.ConstraintLayout\n" +
                                        "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"match_parent\">\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/buttonSubmit\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Submit\"\n" +
                                        "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                                        "        app:layout_constraintVertical_bias=\"0.4\" />\n" +
                                        "\n" +
                                        "</androidx.constraintlayout.widget.ConstraintLayout>\n" +
                                        "</code></pre>\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li>This button is constrained to the parent’s top, start, and end edges.</li>\n" +
                                        "    <li>The <code>Vertical_bias</code> of 0.4 means the button will be positioned 40% of the way down from the top.</li>\n" +
                                        "</ul>\n" +
                                        "\n" +
                                        "<h2>4. Using Guidelines for Layout Design</h2>\n" +
                                        "<p>Guidelines are invisible lines used to position UI elements relative to the layout. They help you align views without having to use fixed margins.</p>\n" +
                                        "\n" +
                                        "<h3>Adding a Horizontal or Vertical Guideline</h3>\n" +
                                        "<p><strong>XML Example: Adding a Vertical Guideline</strong></p>\n" +
                                        "<pre><code class=\"language-xml\">\n" +
                                        "<androidx.constraintlayout.widget.ConstraintLayout\n" +
                                        "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                        "    android:layout_width=\"match_parent\"\n" +
                                        "    android:layout_height=\"match_parent\">\n" +
                                        "\n" +
                                        "    <androidx.constraintlayout.widget.Guideline\n" +
                                        "        android:id=\"@+id/guidelineVertical\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"match_parent\"\n" +
                                        "        app:layout_constraintGuide_percent=\"0.5\" />\n" +
                                        "\n" +
                                        "    <Button\n" +
                                        "        android:id=\"@+id/buttonSubmit\"\n" +
                                        "        android:layout_width=\"wrap_content\"\n" +
                                        "        android:layout_height=\"wrap_content\"\n" +
                                        "        android:text=\"Submit\"\n" +
                                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                                        "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                                        "        app:layout_constraintVertical_bias=\"0.4\" />\n" +
                                        "</androidx.constraintlayout.widget.ConstraintLayout>\n" +
                                        "</code></pre>\n" +
                                        "\n" +
                                        "<h4>Explanation:</h4>\n" +
                                        "<ul>\n" +
                                        "    <li>The <code>Guideline</code> with the <code>layout_constraintGuide_percent</code> attribute specifies that the guideline should be positioned at 50% of the layout width (the center of the screen).</li>\n" +
                                        "    <li>The Button can be aligned relative to this guideline.</li>\n" +
                                        "</ul>\n",
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
        estimatedDuration = "3 months",
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
        estimatedDuration = "4 months",
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
