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
    estimatedDuration = 1200,
        courses = listOf(
            Course(
                id = 1,
                name = "Introduction to DevOps",
                learningPathId = 1,
                totalModules = 3,
                description = "Understand the basics of DevOps, its practices, and its importance.",
                createdAt = "2024-11-01",
                updatedAt = "2024-11-01",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 1,
                        courseId = 1,
                        name = "What is DevOps?",
                        description = "Learn the core concepts of DevOps.",
                        orderIndex = 1,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(1, 1, "DevOps Overview", 1, "Understand the definition and goals of DevOps.", "2024-11-01", "2024-11-01"),
                            Unit(2, 1, "Benefits of DevOps", 2, "Explore the advantages of adopting DevOps.", "2024-11-01", "2024-11-01"),
                            Unit(3, 1, "DevOps vs Traditional IT", 3, "Compare DevOps with traditional IT practices.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 2,
                        courseId = 1,
                        name = "DevOps Lifecycle",
                        description = "Explore the phases of the DevOps lifecycle.",
                        orderIndex = 2,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(4, 2, "Plan and Develop", 1, "Understand planning and development in DevOps.", "2024-11-01", "2024-11-01"),
                            Unit(5, 2, "Build and Test", 2, "Learn about building and testing in DevOps.", "2024-11-01", "2024-11-01"),
                            Unit(6, 2, "Release and Monitor", 3, "Explore release and monitoring phases.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 3,
                        courseId = 1,
                        name = "Version Control",
                        description = "Learn the basics of version control using Git.",
                        orderIndex = 3,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(7, 3, "What is Version Control?", 1, "Understand the role of version control in DevOps.", "2024-11-01", "2024-11-01"),
                            Unit(8, 3, "Basic Git Commands", 2, "Learn common Git commands.", "2024-11-01", "2024-11-01"),
                            Unit(9, 3, "Branching and Merging", 3, "Work with branches and merge changes in Git.", "2024-11-01", "2024-11-01")
                        )
                    )
                )
            ),
            Course(
                id = 2,
                name = "Continuous Integration Basics",
                learningPathId = 1,
                totalModules = 3,
                description = "Learn the principles of Continuous Integration (CI) and its implementation.",
                createdAt = "2024-11-01",
                updatedAt = "2024-11-01",
                orderIndex = 2,
                modules = listOf(
                    Module(
                        id = 4,
                        courseId = 2,
                        name = "Introduction to CI",
                        description = "Understand the fundamentals of CI.",
                        orderIndex = 1,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(10, 4, "What is CI?", 1, "Learn the concept and benefits of CI.", "2024-11-01", "2024-11-01"),
                            Unit(11, 4, "Setting Up CI", 2, "Understand how to set up CI pipelines.", "2024-11-01", "2024-11-01"),
                            Unit(12, 4, "Tools for CI", 3, "Explore tools commonly used for CI.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 5,
                        courseId = 2,
                        name = "Build Automation",
                        description = "Learn how to automate build processes.",
                        orderIndex = 2,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(13, 5, "Automating Builds", 1, "Understand the role of build automation.", "2024-11-01", "2024-11-01"),
                            Unit(14, 5, "Using Build Tools", 2, "Learn to use tools like Maven or Gradle.", "2024-11-01", "2024-11-01"),
                            Unit(15, 5, "Best Practices", 3, "Follow best practices for build automation.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 6,
                        courseId = 2,
                        name = "Testing Automation",
                        description = "Understand the role of automated testing in CI.",
                        orderIndex = 3,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(16, 6, "Why Automate Tests?", 1, "Learn why automated testing is critical.", "2024-11-01", "2024-11-01"),
                            Unit(17, 6, "Creating Test Suites", 2, "Create effective test suites for CI pipelines.", "2024-11-01", "2024-11-01"),
                            Unit(18, 6, "Common Pitfalls", 3, "Avoid common pitfalls in testing automation.", "2024-11-01", "2024-11-01")
                        )
                    )
                )
            ),
            Course(
                id = 3,
                name = "Introduction to Cloud Deployment",
                learningPathId = 1,
                totalModules = 3,
                description = "Learn how to deploy applications to the cloud effectively.",
                createdAt = "2024-11-01",
                updatedAt = "2024-11-01",
                orderIndex = 3,
                modules = listOf(
                    Module(
                        id = 7,
                        courseId = 3,
                        name = "Cloud Platforms Overview",
                        description = "Understand the basics of cloud computing platforms.",
                        orderIndex = 1,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(19, 7, "What is Cloud Computing?", 1, "Learn the concept of cloud computing.", "2024-11-01", "2024-11-01"),
                            Unit(20, 7, "Popular Platforms", 2, "Explore AWS, Azure, and Google Cloud.", "2024-11-01", "2024-11-01"),
                            Unit(21, 7, "Choosing the Right Platform", 3, "Factors to consider when selecting a cloud provider.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 8,
                        courseId = 3,
                        name = "Basic Deployment",
                        description = "Learn the basics of deploying applications to the cloud.",
                        orderIndex = 2,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(22, 8, "Deploying a Static Website", 1, "Steps to deploy a simple static website.", "2024-11-01", "2024-11-01"),
                            Unit(23, 8, "Deploying a Simple App", 2, "Deploy a basic application to the cloud.", "2024-11-01", "2024-11-01"),
                            Unit(24, 8, "Troubleshooting Deployments", 3, "Address common deployment issues.", "2024-11-01", "2024-11-01")
                        )
                    ),
                    Module(
                        id = 9,
                        courseId = 3,
                        name = "Monitoring Basics",
                        description = "Learn how to monitor applications in the cloud.",
                        orderIndex = 3,
                        createdAt = "2024-11-01",
                        updatedAt = "2024-11-01",
                        units = listOf(
                            Unit(25, 9, "What is Monitoring?", 1, "Understand the importance of monitoring.", "2024-11-01", "2024-11-01"),
                            Unit(26, 9, "Using Cloud Monitoring Tools", 2, "Explore monitoring tools like CloudWatch.", "2024-11-01", "2024-11-01"),
                            Unit(27, 9, "Setting Alerts", 3, "Set up alerts to track performance issues.", "2024-11-01", "2024-11-01")
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
        estimatedDuration = 1200,
        courses = listOf(
            Course(
                id = 4,
                name = "Advanced Version Control",
                learningPathId = 2,
                totalModules = 3,
                description = "Master advanced techniques in Git and other version control systems.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 10,
                        courseId = 4,
                        name = "Branching Strategies",
                        description = "Explore advanced branching workflows in Git.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(28, 10, "Git Flow", 1, "Learn the Git Flow branching strategy.", "2024-11-02", "2024-11-02"),
                            Unit(29, 10, "Trunk-Based Development", 2, "Explore trunk-based development.", "2024-11-02", "2024-11-02"),
                            Unit(30, 10, "Feature Branching", 3, "Understand feature branching best practices.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 11,
                        courseId = 4,
                        name = "Conflict Resolution",
                        description = "Learn how to handle and resolve merge conflicts.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(31, 11, "Understanding Conflicts", 1, "Learn why conflicts occur in Git.", "2024-11-02", "2024-11-02"),
                            Unit(32, 11, "Manual Conflict Resolution", 2, "Resolve conflicts manually with Git.", "2024-11-02", "2024-11-02"),
                            Unit(33, 11, "Tools for Conflict Resolution", 3, "Use tools like VS Code and Sourcetree.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 12,
                        courseId = 4,
                        name = "Repository Management",
                        description = "Understand advanced repository management techniques.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(34, 12, "Optimizing Repos", 1, "Learn to optimize repository performance.", "2024-11-02", "2024-11-02"),
                            Unit(35, 12, "Repo Maintenance", 2, "Best practices for repository maintenance.", "2024-11-02", "2024-11-02"),
                            Unit(36, 12, "Working with Monorepos", 3, "Understand monorepos and their benefits.", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            ),
            Course(
                id = 5,
                name = "Continuous Delivery (CD)",
                learningPathId = 2,
                totalModules = 3,
                description = "Understand the core principles of Continuous Delivery.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 2,
                modules = listOf(
                    Module(
                        id = 13,
                        courseId = 5,
                        name = "Introduction to CD",
                        description = "Learn the basics of Continuous Delivery.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(37, 13, "What is CD?", 1, "Understand the concept of CD.", "2024-11-02", "2024-11-02"),
                            Unit(38, 13, "CD vs CI", 2, "Differentiate between Continuous Delivery and CI.", "2024-11-02", "2024-11-02"),
                            Unit(39, 13, "Benefits of CD", 3, "Explore the advantages of adopting CD.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 14,
                        courseId = 5,
                        name = "Deployment Automation",
                        description = "Automate the deployment process for faster delivery.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(40, 14, "Automated Deployment", 1, "Steps for setting up automated deployments.", "2024-11-02", "2024-11-02"),
                            Unit(41, 14, "Using Tools for CD", 2, "Explore Jenkins, GitHub Actions, and other CD tools.", "2024-11-02", "2024-11-02"),
                            Unit(42, 14, "Managing Rollbacks", 3, "Learn how to manage rollbacks in CD.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 15,
                        courseId = 5,
                        name = "CD Best Practices",
                        description = "Learn best practices for implementing Continuous Delivery.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(43, 15, "Monitoring CD Pipelines", 1, "Set up effective monitoring for CD pipelines.", "2024-11-02", "2024-11-02"),
                            Unit(44, 15, "Using Infrastructure as Code", 2, "Understand how IaC integrates with CD.", "2024-11-02", "2024-11-02"),
                            Unit(45, 15, "Security in CD", 3, "Learn to secure your CD pipelines.", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            ),
            Course(
                id = 6,
                name = "Containerization with Docker",
                learningPathId = 2,
                totalModules = 3,
                description = "Learn the principles of containerization and its implementation using Docker.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 3,
                modules = listOf(
                    Module(
                        id = 16,
                        courseId = 6,
                        name = "Introduction to Containers",
                        description = "Understand the fundamentals of containerization.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(46, 16, "What are Containers?", 1, "Understand containerization concepts.", "2024-11-02", "2024-11-02"),
                            Unit(47, 16, "Benefits of Containers", 2, "Explore the advantages of using containers.", "2024-11-02", "2024-11-02"),
                            Unit(48, 16, "Container vs Virtual Machine", 3, "Differentiate between containers and VMs.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 17,
                        courseId = 6,
                        name = "Getting Started with Docker",
                        description = "Learn to use Docker for containerization.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(49, 17, "Installing Docker", 1, "Learn how to set up Docker on your system.", "2024-11-02", "2024-11-02"),
                            Unit(50, 17, "Docker CLI Basics", 2, "Understand common Docker commands.", "2024-11-02", "2024-11-02"),
                            Unit(51, 17, "Creating Docker Images", 3, "Build Docker images from a Dockerfile.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 18,
                        courseId = 6,
                        name = "Working with Docker Containers",
                        description = "Learn how to manage Docker containers effectively.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(52, 18, "Running Containers", 1, "Run and manage containers effectively.", "2024-11-02", "2024-11-02"),
                            Unit(53, 18, "Data Persistence", 2, "Learn about volumes and data persistence.", "2024-11-02", "2024-11-02"),
                            Unit(54, 18, "Networking in Docker", 3, "Understand Docker networking concepts.", "2024-11-02", "2024-11-02")
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
        estimatedDuration = 1200,
        courses = listOf(
            Course(
                id = 7,
                name = "Advanced Container Orchestration with Kubernetes",
                learningPathId = 2,
                totalModules = 3,
                description = "Master Kubernetes for container orchestration in production environments.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 19,
                        courseId = 7,
                        name = "Kubernetes Architecture",
                        description = "Understand the architecture and components of Kubernetes.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(55, 19, "Kubernetes Master", 1, "Learn the role of the master node in Kubernetes.", "2024-11-02", "2024-11-02"),
                            Unit(56, 19, "Worker Nodes", 2, "Understand the role of worker nodes.", "2024-11-02", "2024-11-02"),
                            Unit(57, 19, "Kubernetes API Server", 3, "Dive into the Kubernetes API server.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 20,
                        courseId = 7,
                        name = "Pod and Service Management",
                        description = "Learn to manage Pods and Services in Kubernetes.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(58, 20, "Pods in Kubernetes", 1, "Learn the role and management of Pods.", "2024-11-02", "2024-11-02"),
                            Unit(59, 20, "Kubernetes Services", 2, "Understand how Services work in Kubernetes.", "2024-11-02", "2024-11-02"),
                            Unit(60, 20, "StatefulSets and Deployments", 3, "Learn the difference between Deployments and StatefulSets.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 21,
                        courseId = 7,
                        name = "Kubernetes Networking",
                        description = "Master networking in Kubernetes, including ingress and services.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(61, 21, "Cluster Networking", 1, "Understand Kubernetes networking fundamentals.", "2024-11-02", "2024-11-02"),
                            Unit(62, 21, "Ingress Controllers", 2, "Learn how to set up ingress controllers for traffic routing.", "2024-11-02", "2024-11-02"),
                            Unit(63, 21, "Service Discovery", 3, "Explore service discovery techniques in Kubernetes.", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            ),
            Course(
                id = 8,
                name = "Infrastructure as Code (IaC)",
                learningPathId = 2,
                totalModules = 3,
                description = "Learn to define infrastructure in code using tools like Terraform and Ansible.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 2,
                modules = listOf(
                    Module(
                        id = 22,
                        courseId = 8,
                        name = "Terraform Basics",
                        description = "Get started with Terraform for provisioning infrastructure.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(64, 22, "What is Terraform?", 1, "Understand the fundamentals of Terraform.", "2024-11-02", "2024-11-02"),
                            Unit(65, 22, "Writing Terraform Configurations", 2, "Learn how to write Terraform configuration files.", "2024-11-02", "2024-11-02"),
                            Unit(66, 22, "Terraform Providers", 3, "Learn how to use Terraform providers to interact with cloud platforms.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 23,
                        courseId = 8,
                        name = "Managing Infrastructure with Ansible",
                        description = "Use Ansible to manage infrastructure automation.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(67, 23, "Introduction to Ansible", 1, "Understand the basics of Ansible.", "2024-11-02", "2024-11-02"),
                            Unit(68, 23, "Writing Playbooks", 2, "Learn how to write Ansible playbooks for automation.", "2024-11-02", "2024-11-02"),
                            Unit(69, 23, "Managing Configurations", 3, "Automate configuration management with Ansible.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 24,
                        courseId = 8,
                        name = "Versioning Infrastructure",
                        description = "Learn best practices for versioning infrastructure using Git.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(70, 24, "Git for IaC", 1, "Learn how to version control your infrastructure code using Git.", "2024-11-02", "2024-11-02"),
                            Unit(71, 24, "Managing Terraform State", 2, "Learn to manage and store Terraform state files.", "2024-11-02", "2024-11-02"),
                            Unit(72, 24, "Collaborating on Infrastructure", 3, "Best practices for collaborating on infrastructure code.", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            ),
            Course(
                id = 9,
                name = "Continuous Integration/Continuous Deployment (CI/CD) Automation",
                learningPathId = 2,
                totalModules = 3,
                description = "Learn to automate the software development lifecycle using CI/CD pipelines.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 3,
                modules = listOf(
                    Module(
                        id = 25,
                        courseId = 9,
                        name = "CI/CD Pipeline Basics",
                        description = "Understand the core principles and practices behind CI/CD pipelines.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(73, 25, "Introduction to CI/CD", 1, "Understand the principles of Continuous Integration and Continuous Deployment.", "2024-11-02", "2024-11-02"),
                            Unit(74, 25, "CI/CD Tools Overview", 2, "Explore tools like Jenkins, GitHub Actions, and GitLab CI.", "2024-11-02", "2024-11-02"),
                            Unit(75, 25, "Setting up a Basic Pipeline", 3, "Learn how to set up your first CI/CD pipeline.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 26,
                        courseId = 9,
                        name = "Automating Tests and Builds",
                        description = "Automate tests and builds within CI/CD pipelines.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(76, 26, "Automating Unit Tests", 1, "Learn how to automate unit testing.", "2024-11-02", "2024-11-02"),
                            Unit(77, 26, "Building and Deploying Apps", 2, "Understand how to automate building and deployment.", "2024-11-02", "2024-11-02"),
                            Unit(78, 26, "CI/CD Pipeline Failures", 3, "Handle failures in your CI/CD pipeline.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 27,
                        courseId = 9,
                        name = "Advanced CI/CD Automation",
                        description = "Master advanced CI/CD automation strategies.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(79, 27, "Containerized Pipelines", 1, "Learn how to containerize CI/CD pipelines.", "2024-11-02", "2024-11-02"),
                            Unit(80, 27, "Scaling CI/CD Pipelines", 2, "Learn how to scale pipelines for large teams.", "2024-11-02", "2024-11-02"),
                            Unit(81, 27, "Advanced Deployment Strategies", 3, "Explore blue-green and canary deployments.", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            )
        )
    )
)
