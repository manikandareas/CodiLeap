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
        estimatedDuration = 3000,
        courses = listOf(
            Course(
                id = 1,
                name = "Introduction to Machine Learning",
                learningPathId = 1,
                totalModules = 3,
                description = "Learn the fundamentals of machine learning, including types of learning and the most common algorithms.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 1,
                        courseId = 1,
                        name = "Types of Machine Learning",
                        description = "Understand supervised, unsupervised, and reinforcement learning.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(1, 1, "Supervised Learning", 1, "Introduction to supervised learning methods.", "2024-11-02", "2024-11-02"),
                            Unit(2, 1, "Unsupervised Learning", 2, "Overview of unsupervised learning techniques.", "2024-11-02", "2024-11-02"),
                            Unit(3, 1, "Reinforcement Learning", 3, "Basic concepts of reinforcement learning.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 2,
                        courseId = 1,
                        name = "Algorithms in Machine Learning",
                        description = "Learn about popular algorithms such as linear regression and decision trees.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(4, 2, "Linear Regression", 1, "Understand the basics of linear regression.", "2024-11-02", "2024-11-02"),
                            Unit(5, 2, "Logistic Regression", 2, "Learn how logistic regression is used in classification.", "2024-11-02", "2024-11-02"),
                            Unit(6, 2, "Decision Trees", 3, "Explore decision trees for classification and regression.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 3,
                        courseId = 1,
                        name = "Data Preprocessing",
                        description = "Learn the essential steps for preparing data for machine learning models.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(7, 3, "Data Cleaning", 1, "Handling missing values and outliers in data.", "2024-11-02", "2024-11-02"),
                            Unit(8, 3, "Feature Scaling", 2, "Techniques for scaling data like normalization and standardization.", "2024-11-02", "2024-11-02"),
                            Unit(9, 3, "Feature Selection", 3, "Learn methods for selecting relevant features for the model.", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            ),
            Course(
                id = 2,
                name = "Data Science with Python",
                learningPathId = 1,
                totalModules = 3,
                description = "Learn Python for data science, including libraries like Pandas, NumPy, and Matplotlib.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 2,
                modules = listOf(
                    Module(
                        id = 4,
                        courseId = 2,
                        name = "Pandas for Data Manipulation",
                        description = "Learn how to manipulate data using Pandas in Python.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(10, 4, "DataFrames", 1, "Introduction to Pandas DataFrames.", "2024-11-02", "2024-11-02"),
                            Unit(11, 4, "Data Filtering and Cleaning", 2, "Learn how to filter and clean data in DataFrames.", "2024-11-02", "2024-11-02"),
                            Unit(12, 4, "Data Aggregation", 3, "Explore groupby operations and aggregations in Pandas.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 5,
                        courseId = 2,
                        name = "NumPy for Numerical Computations",
                        description = "Learn to use NumPy for numerical computing in Python.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(13, 5, "NumPy Arrays", 1, "Introduction to NumPy arrays and their operations.", "2024-11-02", "2024-11-02"),
                            Unit(14, 5, "Array Manipulations", 2, "Learn to manipulate NumPy arrays for data processing.", "2024-11-02", "2024-11-02"),
                            Unit(15, 5, "Mathematical Operations", 3, "Use NumPy for mathematical and statistical operations.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 6,
                        courseId = 2,
                        name = "Data Visualization with Matplotlib",
                        description = "Learn how to visualize data using Matplotlib in Python.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(16, 6, "Basic Plotting", 1, "Learn the basics of creating plots with Matplotlib.", "2024-11-02", "2024-11-02"),
                            Unit(17, 6, "Customizing Plots", 2, "Explore how to customize the appearance of plots.", "2024-11-02", "2024-11-02"),
                            Unit(18, 6, "Advanced Visualization", 3, "Learn advanced plotting techniques such as subplots and 3D plotting.", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            ),
            Course(
                id = 3,
                name = "Introduction to Neural Networks",
                learningPathId = 1,
                totalModules = 3,
                description = "Learn the basics of neural networks and how they are used in machine learning.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 3,
                modules = listOf(
                    Module(
                        id = 7,
                        courseId = 3,
                        name = "Neural Network Architecture",
                        description = "Learn the basic architecture of neural networks.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(19, 7, "Neurons and Layers", 1, "Explore the structure of neural networks including neurons and layers.", "2024-11-02", "2024-11-02"),
                            Unit(20, 7, "Activation Functions", 2, "Learn about activation functions like ReLU and Sigmoid.", "2024-11-02", "2024-11-02"),
                            Unit(21, 7, "Feedforward Network", 3, "Understand how feedforward neural networks function.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 8,
                        courseId = 3,
                        name = "Backpropagation",
                        description = "Learn about backpropagation and how it is used to train neural networks.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(22, 8, "Backpropagation Overview", 1, "Understand the backpropagation algorithm and its role in training neural networks.", "2024-11-02", "2024-11-02"),
                            Unit(23, 8, "Gradient Descent", 2, "Learn how gradient descent is used to minimize error.", "2024-11-02", "2024-11-02"),
                            Unit(24, 8, "Learning Rate", 3, "Explore the impact of the learning rate on training neural networks.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 9,
                        courseId = 3,
                        name = "Convolutional Neural Networks (CNNs)",
                        description = "Learn about CNNs and their applications in computer vision.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(25, 9, "What is CNN?", 1, "Introduction to convolutional neural networks.", "2024-11-02", "2024-11-02"),
                            Unit(26, 9, "Convolutional Layers", 2, "Learn about the convolutional layers in a CNN.", "2024-11-02", "2024-11-02"),
                            Unit(27, 9, "Pooling Layers", 3, "Understand pooling layers and their role in CNNs.", "2024-11-02", "2024-11-02")
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
        estimatedDuration = 3000,
        courses = listOf(
            Course(
                id = 4,
                name = "Advanced Supervised Learning",
                learningPathId = 2,
                totalModules = 3,
                description = "Deep dive into advanced supervised learning algorithms and their applications.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 10,
                        courseId = 4,
                        name = "Random Forests and Boosting",
                        description = "Learn about ensemble methods like random forests and boosting.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(28, 10, "Random Forests", 1, "Learn how random forests use multiple decision trees for classification.", "2024-11-02", "2024-11-02"),
                            Unit(29, 10, "Gradient Boosting", 2, "Understand gradient boosting techniques for improving model performance.", "2024-11-02", "2024-11-02"),
                            Unit(30, 10, "XGBoost", 3, "Introduction to XGBoost, a popular gradient boosting algorithm.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 11,
                        courseId = 4,
                        name = "Model Regularization and Tuning",
                        description = "Explore techniques to avoid overfitting and tune model parameters.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(31, 11, "Overfitting and Underfitting", 1, "Learn about overfitting and underfitting in machine learning.", "2024-11-02", "2024-11-02"),
                            Unit(32, 11, "L1 and L2 Regularization", 2, "Introduction to L1 and L2 regularization techniques.", "2024-11-02", "2024-11-02"),
                            Unit(33, 11, "Hyperparameter Tuning", 3, "Learn how to tune hyperparameters using GridSearchCV and RandomizedSearchCV.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 12,
                        courseId = 4,
                        name = "Advanced Classification Models",
                        description = "Learn advanced classification algorithms like KNN and SVM with kernel tricks.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(34, 12, "Advanced K-Nearest Neighbors", 1, "Explore advanced techniques in KNN for classification.", "2024-11-02", "2024-11-02"),
                            Unit(35, 12, "Support Vector Machine Advanced", 2, "Learn advanced concepts of SVM, including kernel methods and tuning.", "2024-11-02", "2024-11-02"),
                            Unit(36, 12, "Handling Imbalanced Data", 3, "Learn methods for dealing with imbalanced datasets in classification.", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            ),
            Course(
                id = 5,
                name = "Neural Networks for Deep Learning",
                learningPathId = 2,
                totalModules = 3,
                description = "Learn the foundations of deep learning with neural networks and their applications.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 2,
                modules = listOf(
                    Module(
                        id = 13,
                        courseId = 5,
                        name = "Feedforward Neural Networks",
                        description = "Learn the structure and training process of feedforward neural networks.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(37, 13, "Feedforward Architecture", 1, "Understand the feedforward architecture in neural networks.", "2024-11-02", "2024-11-02"),
                            Unit(38, 13, "Training Process", 2, "Learn how feedforward neural networks are trained with backpropagation.", "2024-11-02", "2024-11-02"),
                            Unit(39, 13, "Activation Functions Revisited", 3, "Deep dive into activation functions used in feedforward networks.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 14,
                        courseId = 5,
                        name = "Convolutional Neural Networks (CNNs)",
                        description = "Master CNNs for computer vision tasks.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(40, 14, "CNN Structure", 1, "Learn about the layers and architecture of CNNs.", "2024-11-02", "2024-11-02"),
                            Unit(41, 14, "Convolutional Layers in Depth", 2, "Explore convolutional layers in detail, including stride, padding, etc.", "2024-11-02", "2024-11-02"),
                            Unit(42, 14, "CNN Applications", 3, "Understand how CNNs are used in image recognition and classification.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 15,
                        courseId = 5,
                        name = "Recurrent Neural Networks (RNNs)",
                        description = "Learn RNNs and their applications in time-series and sequential data.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(43, 15, "RNN Basics", 1, "Introduction to recurrent neural networks and their architecture.", "2024-11-02", "2024-11-02"),
                            Unit(44, 15, "Long Short-Term Memory (LSTM)", 2, "Learn about LSTM cells and how they solve vanishing gradient problem.", "2024-11-02", "2024-11-02"),
                            Unit(45, 15, "RNN for Time-Series Forecasting", 3, "Learn how RNNs are applied to time-series forecasting.", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            ),
            Course(
                id = 6,
                name = "Unsupervised Learning and Clustering",
                learningPathId = 2,
                totalModules = 3,
                description = "Learn how unsupervised learning and clustering algorithms work and their applications.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 3,
                modules = listOf(
                    Module(
                        id = 16,
                        courseId = 6,
                        name = "Clustering Algorithms",
                        description = "Master clustering algorithms like K-Means and DBSCAN.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(46, 16, "K-Means Clustering", 1, "Deep dive into K-means clustering algorithm.", "2024-11-02", "2024-11-02"),
                            Unit(47, 16, "DBSCAN", 2, "Learn about DBSCAN clustering algorithm for density-based clustering.", "2024-11-02", "2024-11-02"),
                            Unit(48, 16, "Clustering Evaluation", 3, "Learn how to evaluate clustering results with different metrics.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 17,
                        courseId = 6,
                        name = "Dimensionality Reduction",
                        description = "Learn how to reduce dimensionality of high-dimensional datasets.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(49, 17, "PCA (Principal Component Analysis)", 1, "Introduction to PCA for dimensionality reduction.", "2024-11-02", "2024-11-02"),
                            Unit(50, 17, "t-SNE", 2, "Learn about t-SNE for visualizing high-dimensional data.", "2024-11-02", "2024-11-02"),
                            Unit(51, 17, "Feature Selection", 3, "Learn feature selection techniques to improve model performance.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 18,
                        courseId = 6,
                        name = "Association Rule Learning",
                        description = "Understand association rule learning and its applications in market basket analysis.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(52, 18, "Apriori Algorithm", 1, "Learn how the Apriori algorithm works in association rule learning.", "2024-11-02", "2024-11-02"),
                            Unit(53, 18, "Market Basket Analysis", 2, "Understand how association rule learning is used in market basket analysis.", "2024-11-02", "2024-11-02"),
                            Unit(54, 18, "Advanced Rule Mining", 3, "Learn advanced rule mining techniques for better insights.", "2024-11-02", "2024-11-02")
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
        estimatedDuration = 3000,
        courses = listOf(
            Course(
                id = 7,
                name = "Advanced Deep Learning Architectures",
                learningPathId = 3,
                totalModules = 3,
                description = "Explore advanced deep learning models and their practical applications.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 1,
                modules = listOf(
                    Module(
                        id = 19,
                        courseId = 7,
                        name = "Generative Adversarial Networks (GANs)",
                        description = "Learn how GANs work and their applications in image generation.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(55, 19, "GANs Overview", 1, "Introduction to the concept and structure of GANs.", "2024-11-02", "2024-11-02"),
                            Unit(56, 19, "Training GANs", 2, "Learn how to train GANs effectively.", "2024-11-02", "2024-11-02"),
                            Unit(57, 19, "Applications of GANs", 3, "Explore the applications of GANs in fields like image generation.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 20,
                        courseId = 7,
                        name = "Transformers and Attention Mechanism",
                        description = "Deep dive into transformers and attention mechanisms used in NLP.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(58, 20, "Attention Mechanism", 1, "Learn the basics of attention in deep learning.", "2024-11-02", "2024-11-02"),
                            Unit(59, 20, "Transformer Architecture", 2, "Explore the transformer architecture and its applications.", "2024-11-02", "2024-11-02"),
                            Unit(60, 20, "Applications of Transformers", 3, "Learn how transformers are used in NLP tasks like translation.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 21,
                        courseId = 7,
                        name = "Reinforcement Learning",
                        description = "Learn reinforcement learning algorithms and their applications.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(61, 21, "Reinforcement Learning Basics", 1, "Introduction to reinforcement learning algorithms.", "2024-11-02", "2024-11-02"),
                            Unit(62, 21, "Q-Learning", 2, "Learn Q-learning, a value-based RL algorithm.", "2024-11-02", "2024-11-02"),
                            Unit(63, 21, "Deep Q-Networks", 3, "Explore Deep Q-Networks (DQN) and their applications.", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            ),
            Course(
                id = 8,
                name = "Natural Language Processing (NLP) Advanced Techniques",
                learningPathId = 3,
                totalModules = 3,
                description = "Advanced techniques and algorithms in NLP for complex text processing tasks.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 2,
                modules = listOf(
                    Module(
                        id = 22,
                        courseId = 8,
                        name = "Text Generation with Language Models",
                        description = "Learn advanced methods for generating text using large language models.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(64, 22, "Introduction to Text Generation", 1, "Learn the basics of text generation and language modeling.", "2024-11-02", "2024-11-02"),
                            Unit(65, 22, "Training Language Models", 2, "Learn how to train large language models for text generation.", "2024-11-02", "2024-11-02"),
                            Unit(66, 22, "Applications of Text Generation", 3, "Explore real-world applications of text generation in NLP.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 23,
                        courseId = 8,
                        name = "Sentiment Analysis with Deep Learning",
                        description = "Use deep learning techniques for sentiment analysis on large datasets.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(67, 23, "Basics of Sentiment Analysis", 1, "Introduction to sentiment analysis and its importance in NLP.", "2024-11-02", "2024-11-02"),
                            Unit(68, 23, "Deep Learning for Sentiment Analysis", 2, "Learn how deep learning is applied to sentiment analysis tasks.", "2024-11-02", "2024-11-02"),
                            Unit(69, 23, "Advanced Sentiment Analysis Techniques", 3, "Learn advanced techniques for improving sentiment analysis results.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 24,
                        courseId = 8,
                        name = "Named Entity Recognition (NER)",
                        description = "Master Named Entity Recognition (NER) for extracting valuable information from text.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(70, 24, "Introduction to NER", 1, "Learn the basics of Named Entity Recognition.", "2024-11-02", "2024-11-02"),
                            Unit(71, 24, "Training NER Models", 2, "Learn how to train models for Named Entity Recognition.", "2024-11-02", "2024-11-02"),
                            Unit(72, 24, "Applications of NER", 3, "Explore applications of NER in information extraction tasks.", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            ),
            Course(
                id = 9,
                name = "Computer Vision Techniques",
                learningPathId = 3,
                totalModules = 3,
                description = "Learn advanced computer vision techniques for image recognition and analysis.",
                createdAt = "2024-11-02",
                updatedAt = "2024-11-02",
                orderIndex = 3,
                modules = listOf(
                    Module(
                        id = 25,
                        courseId = 9,
                        name = "Object Detection and Localization",
                        description = "Explore advanced techniques for detecting and localizing objects in images.",
                        orderIndex = 1,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(73, 25, "Introduction to Object Detection", 1, "Learn the basics of object detection and localization.", "2024-11-02", "2024-11-02"),
                            Unit(74, 25, "YOLO and SSD Algorithms", 2, "Explore YOLO and SSD algorithms for object detection.", "2024-11-02", "2024-11-02"),
                            Unit(75, 25, "Applications of Object Detection", 3, "Learn real-world applications of object detection.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 26,
                        courseId = 9,
                        name = "Image Segmentation",
                        description = "Learn techniques for image segmentation and pixel-level prediction.",
                        orderIndex = 2,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(76, 26, "Introduction to Image Segmentation", 1, "Learn the basics of image segmentation techniques.", "2024-11-02", "2024-11-02"),
                            Unit(77, 26, "U-Net Architecture", 2, "Explore U-Net architecture for medical image segmentation.", "2024-11-02", "2024-11-02"),
                            Unit(78, 26, "Applications of Image Segmentation", 3, "Explore applications of image segmentation in various fields.", "2024-11-02", "2024-11-02")
                        )
                    ),
                    Module(
                        id = 27,
                        courseId = 9,
                        name = "Face Recognition and Tracking",
                        description = "Advanced techniques for face recognition and real-time tracking in video feeds.",
                        orderIndex = 3,
                        createdAt = "2024-11-02",
                        updatedAt = "2024-11-02",
                        units = listOf(
                            Unit(79, 27, "Introduction to Face Recognition", 1, "Learn the basics of face recognition and tracking.", "2024-11-02", "2024-11-02"),
                            Unit(80, 27, "Deep Learning for Face Recognition", 2, "Learn how deep learning models are applied for face recognition.", "2024-11-02", "2024-11-02"),
                            Unit(81, 27, "Real-Time Face Tracking", 3, "Learn how to implement real-time face tracking in video feeds.", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            )
        )
    )
)
