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
                            Unit(1, 1, "Supervised Learning", 1, "<h1>1. Introduction to Supervised Learning</h1>\n" +
                                    "<p>Supervised learning is a type of machine learning where the model is trained on labeled data. The goal is to learn a mapping from input features to output labels, allowing the model to make predictions on unseen data.</p>\n" +
                                    "<p>In supervised learning, the training data consists of input-output pairs, where the output is known and used to guide the model's learning process.</p>\n" +
                                    "\n" +
                                    "<h2>Key Concepts:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Labeled Data:</strong> Each input in the training set is paired with the correct output (label).</li>\n" +
                                    "    <li><strong>Goal:</strong> The model learns to predict the correct output for new, unseen data based on patterns learned from the training data.</li>\n" +
                                    "    <li><strong>Supervised Learning Tasks:</strong> Typically categorized into two main types:\n" +
                                    "        <ul>\n" +
                                    "            <li><strong>Classification:</strong> Predicting a discrete label or category.</li>\n" +
                                    "            <li><strong>Regression:</strong> Predicting a continuous value.</li>\n" +
                                    "        </ul>\n" +
                                    "    </li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>2. Classification vs. Regression</h1>\n" +
                                    "<p>Supervised learning problems can generally be divided into two categories:</p>\n" +
                                    "\n" +
                                    "<h2>Classification:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>The output variable is categorical (discrete).</li>\n" +
                                    "    <li><strong>Example:</strong> Predicting whether an email is spam or not (yes/no), diagnosing a disease based on symptoms (positive/negative).</li>\n" +
                                    "    <li><strong>Common algorithms:</strong> Logistic Regression, Decision Trees, Random Forests, Support Vector Machines (SVM).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Regression:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>The output variable is continuous.</li>\n" +
                                    "    <li><strong>Example:</strong> Predicting house prices based on features like location, square footage, etc., predicting the temperature for the next day.</li>\n" +
                                    "    <li><strong>Common algorithms:</strong> Linear Regression, Ridge Regression, Decision Trees for Regression.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>3. How Supervised Learning Works</h1>\n" +
                                    "<p>In supervised learning, the process typically follows these steps:</p>\n" +
                                    "<ol>\n" +
                                    "    <li><strong>Data Collection:</strong> Collect a labeled dataset where each input is associated with the correct output.</li>\n" +
                                    "    <li><strong>Model Selection:</strong> Choose an appropriate model or algorithm (e.g., Decision Tree, Neural Network, Linear Regression).</li>\n" +
                                    "    <li><strong>Training:</strong> The model is trained on the labeled data, learning to map inputs to outputs by minimizing the error between predicted and actual outputs.</li>\n" +
                                    "    <li><strong>Evaluation:</strong> After training, evaluate the model's performance using test data that it hasn’t seen before.</li>\n" +
                                    "    <li><strong>Prediction:</strong> The trained model is then used to make predictions on new, unseen data.</li>\n" +
                                    "</ol>\n" +
                                    "\n" +
                                    "<h1>4. Key Supervised Learning Algorithms</h1>\n" +
                                    "<p>Here are some of the most common supervised learning algorithms:</p>\n" +
                                    "\n" +
                                    "<h2>Linear Regression (For Regression Problems)</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>Predicts a continuous value based on the relationship between the input features and the output.</li>\n" +
                                    "    <li><strong>Example:</strong> Predicting the price of a house based on features like size, location, and age.</li>\n" +
                                    "    <li><strong>Formula:</strong> <code>y = mx + b</code></li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Logistic Regression (For Classification Problems)</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>Used for binary classification tasks where the output is a binary label (0 or 1, true or false).</li>\n" +
                                    "    <li><strong>Example:</strong> Predicting if a patient has a certain disease based on medical test results.</li>\n" +
                                    "    <li><strong>Formula:</strong> <code>p = 1 / (1 + e^-z)</code> (Sigmoid function).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Decision Trees (For Both Classification and Regression)</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>A tree-like model used for both classification (categorical output) and regression (continuous output).</li>\n" +
                                    "    <li><strong>Example:</strong> Predicting customer churn based on features like age, income, etc.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Random Forests (For Both Classification and Regression)</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>An ensemble method that combines multiple decision trees to improve model accuracy and prevent overfitting.</li>\n" +
                                    "    <li><strong>Example:</strong> Predicting whether a customer will click on an ad based on their browsing history.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Support Vector Machines (SVM) (For Classification)</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>A classifier that finds the optimal hyperplane that best separates the data into different classes.</li>\n" +
                                    "    <li><strong>Example:</strong> Classifying images into different categories (e.g., cats vs. dogs).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>K-Nearest Neighbors (KNN) (For Classification and Regression)</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>A non-parametric method where predictions are made based on the majority label of the k-nearest data points in the training set.</li>\n" +
                                    "    <li><strong>Example:</strong> Recommending products based on user preferences.</li>\n" +
                                    "</ul>\n.", "2024-11-02", "2024-11-02"),
                            Unit(2, 1, "Unsupervised Learning", 2, "<h1>1. Introduction to Unsupervised Learning</h1>\n" +
                                    "<p>Unsupervised learning is a type of machine learning where the model is trained using unlabeled data. Unlike supervised learning, where the model learns from data with known outputs (labels), in unsupervised learning, the model must identify patterns, structures, or relationships within the data on its own.</p>\n" +
                                    "\n" +
                                    "<h2>Key Characteristics of Unsupervised Learning:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Unlabeled Data:</strong> There are no target labels provided for training. The model must infer the underlying structure.</li>\n" +
                                    "    <li><strong>Goal:</strong> To uncover hidden patterns or groupings in the data without explicit guidance.</li>\n" +
                                    "    <li><strong>Common Tasks:</strong> Clustering, anomaly detection, dimensionality reduction.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>2. Types of Unsupervised Learning Techniques</h1>\n" +
                                    "<p>Unsupervised learning techniques can be broadly divided into three main types based on their purpose:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Clustering</strong></li>\n" +
                                    "    <li><strong>Anomaly Detection</strong></li>\n" +
                                    "    <li><strong>Dimensionality Reduction</strong></li>\n" +
                                    "</ul>\n" +
                                    "<p>Each of these techniques serves different purposes and can be applied to various real-world problems.</p>\n" +
                                    "\n" +
                                    "<h1>3. Clustering</h1>\n" +
                                    "<p>Clustering is a technique that groups similar data points together based on certain characteristics. It’s one of the most popular techniques in unsupervised learning. The goal is to find intrinsic groups within the data without knowing what these groups are in advance.</p>\n" +
                                    "\n" +
                                    "<h2>Key Clustering Algorithms:</h2>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>K-Means:</strong> A widely-used clustering algorithm that partitions the data into K clusters based on distance metrics (e.g., Euclidean distance). It assigns each point to the nearest centroid and then re-calculates the centroid until convergence.\n" +
                                    "        <ul>\n" +
                                    "            <li><strong>Example Use Case:</strong> Customer segmentation based on purchasing behavior.</li>\n" +
                                    "        </ul>\n" +
                                    "    </li>\n" +
                                    "\n" +
                                    "    <li><strong>Hierarchical Clustering:</strong> Builds a hierarchy of clusters either by merging small clusters (agglomerative) or by splitting larger clusters (divisive).\n" +
                                    "        <ul>\n" +
                                    "            <li><strong>Example Use Case:</strong> Organizing documents based on content similarity.</li>\n" +
                                    "        </ul>\n" +
                                    "    </li>\n" +
                                    "\n" +
                                    "    <li><strong>DBSCAN (Density-Based Spatial Clustering of Applications with Noise):</strong> Identifies clusters based on density, allowing the algorithm to find arbitrarily shaped clusters and handle noise (outliers).\n" +
                                    "        <ul>\n" +
                                    "            <li><strong>Example Use Case:</strong> Detecting groups of similar users or events in social media data.</li>\n" +
                                    "        </ul>\n" +
                                    "    </li>\n" +
                                    "</ul>\n.", "2024-11-02", "2024-11-02"),
                            Unit(3, 1, "Reinforcement Learning", 3, "<h1>1. Introduction to Reinforcement Learning</h1>\n" +
                                    "<p>Reinforcement learning (RL) is a type of machine learning where an agent learns to make decisions by performing actions in an environment to achieve a goal. Unlike supervised learning, where the model learns from labeled data, reinforcement learning relies on trial and error and feedback from the environment to improve performance over time.</p>\n" +
                                    "\n" +
                                    "<p>In RL, the agent explores the environment, takes actions, and receives feedback in the form of rewards or punishments. The goal of the agent is to maximize the cumulative reward over time by learning which actions lead to favorable outcomes.</p>\n" +
                                    "\n" +
                                    "<h1>2. Key Components of Reinforcement Learning</h1>\n" +
                                    "<p>There are several key components in a reinforcement learning problem that define how the agent learns and interacts with its environment:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Agent:</strong> The decision-maker that interacts with the environment and takes actions. It learns from the feedback provided by the environment to improve its behavior over time.</li>\n" +
                                    "    <li><strong>Environment:</strong> The external system with which the agent interacts. The environment provides feedback (rewards or punishments) in response to the agent’s actions.</li>\n" +
                                    "    <li><strong>State (s):</strong> The current situation or configuration of the environment. The state contains all the necessary information the agent needs to make decisions at any given time.</li>\n" +
                                    "    <li><strong>Action (a):</strong> The set of all possible moves or decisions the agent can make in any given state. The agent selects an action based on its current state.</li>\n" +
                                    "    <li><strong>Reward (r):</strong> A scalar feedback signal that the agent receives after taking an action in a specific state. Rewards can be positive (rewarding the agent) or negative (punishing the agent). The agent's goal is to maximize cumulative rewards.</li>\n" +
                                    "    <li><strong>Policy (π):</strong> A strategy or mapping from states to actions. The policy dictates the agent's behavior at any given time — which action to take in which state.</li>\n" +
                                    "    <li><strong>Value Function (V):</strong> A function that estimates the long-term reward an agent can expect to receive from a given state, following a particular policy. The value function helps the agent determine which states are more valuable to reach.</li>\n" +
                                    "    <li><strong>Q-Function (Q):</strong> A function that estimates the expected future reward for an agent when taking a certain action in a given state and following a particular policy thereafter. The Q-function is often used to guide action selection.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>3. The Reinforcement Learning Process</h1>\n" +
                                    "<p>Reinforcement learning operates through an iterative process:</p>\n" +
                                    "\n" +
                                    "<ol>\n" +
                                    "    <li><strong>Initialization:</strong> The agent starts in a random state (or an initial state).</li>\n" +
                                    "    <li><strong>Action Selection:</strong> The agent chooses an action based on its current policy (e.g., using exploration or exploitation).</li>\n" +
                                    "    <li><strong>Environment Interaction:</strong> The agent performs the chosen action in the environment, transitioning to a new state.</li>\n" +
                                    "    <li><strong>Reward Feedback:</strong> The environment provides a reward or punishment based on the agent's action.</li>\n" +
                                    "    <li><strong>Learning:</strong> The agent uses the reward feedback to update its knowledge and improve its policy, so it can make better decisions in the future.</li>\n" +
                                    "    <li><strong>Repeat:</strong> This process is repeated over multiple steps, and the agent continuously refines its policy to maximize cumulative rewards.</li>\n" +
                                    "</ol>\n" +
                                    "\n" +
                                    "<p>This trial-and-error learning process allows the agent to adapt and improve its behavior as it interacts more with the environment.</p>\n.", "2024-11-02", "2024-11-02")
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
                            Unit(4, 2, "Linear Regression", 1, "<h1>1. Introduction to Linear Regression</h1>\n" +
                                    "<p>Linear Regression is one of the most fundamental and widely used statistical techniques for modeling the relationship between a dependent variable (also called the target or response) and one or more independent variables (also called predictors or features).</p>\n" +
                                    "\n" +
                                    "<p>In linear regression, the goal is to find the best-fitting line (in the case of one variable) or hyperplane (for multiple variables) that best describes the relationship between the dependent and independent variables.</p>\n" +
                                    "\n" +
                                    "<p>Mathematically, the relationship between the dependent variable <i>y</i> and the independent variable(s) <i>X</i> is modeled as:</p>\n" +
                                    "\n" +
                                    "<pre>y = β<sub>0</sub> + β<sub>1</sub>x + ϵ</pre>\n" +
                                    "\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><i>y</i> is the dependent variable (the output we are trying to predict).</li>\n" +
                                    "    <li><i>x</i> is the independent variable (the input feature).</li>\n" +
                                    "    <li>β<sub>0</sub> is the intercept (the value of <i>y</i> when <i>x = 0</i>).</li>\n" +
                                    "    <li>β<sub>1</sub> is the slope (the rate of change of <i>y</i> with respect to <i>x</i>).</li>\n" +
                                    "    <li>ϵ is the error term (the difference between the predicted and actual values).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>2. Key Concepts in Linear Regression</h1>\n" +
                                    "<p><strong>Dependent vs. Independent Variables:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>The dependent variable <i>y</i> is the variable we are trying to predict or explain.</li>\n" +
                                    "    <li>The independent variable <i>x</i> is the variable used to make predictions about <i>y</i>.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Intercept (β<sub>0</sub>):</strong></p>\n" +
                                    "<p>This is the value of the dependent variable when all independent variables are zero. It is where the regression line intersects the y-axis.</p>\n" +
                                    "\n" +
                                    "<p><strong>Slope (β<sub>1</sub>):</strong></p>\n" +
                                    "<p>The slope represents the change in the dependent variable for each unit change in the independent variable. It quantifies the relationship between the two variables.</p>\n" +
                                    "\n" +
                                    "<p><strong>Error Term (ϵ):</strong></p>\n" +
                                    "<p>The error term accounts for the difference between the observed value of <i>y</i> and the predicted value. Ideally, the error term is normally distributed with a mean of zero.</p>\n" +
                                    "\n" +
                                    "<h1>3. Simple vs. Multiple Linear Regression</h1>\n" +
                                    "<p><strong>Simple Linear Regression:</strong></p>\n" +
                                    "<p>In simple linear regression, we model the relationship between a single independent variable <i>x</i> and a dependent variable <i>y</i>. The equation for simple linear regression is:</p>\n" +
                                    "\n" +
                                    "<pre>y = β<sub>0</sub> + β<sub>1</sub>x + ϵ</pre>\n" +
                                    "\n" +
                                    "<p>This is appropriate when we believe that <i>y</i> is influenced by just one variable.</p>\n" +
                                    "\n" +
                                    "<p><strong>Multiple Linear Regression:</strong></p>\n" +
                                    "<p>When there are multiple independent variables (i.e., more than one feature), we extend the linear regression model to account for more predictors. The equation for multiple linear regression becomes:</p>\n" +
                                    "\n" +
                                    "<pre>y = β<sub>0</sub> + β<sub>1</sub>x<sub>1</sub> + β<sub>2</sub>x<sub>2</sub> + ⋯ + β<sub>n</sub>x<sub>n</sub> + ϵ</pre>\n" +
                                    "\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><i>x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>n</sub></i> are the independent variables.</li>\n" +
                                    "    <li>β<sub>1</sub>, β<sub>2</sub>, ..., β<sub>n</sub> are the coefficients for each independent variable.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>4. Assumptions of Linear Regression</h1>\n" +
                                    "<p>For linear regression to work well and produce valid results, the following assumptions must be met:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Linearity:</strong> The relationship between the dependent variable and independent variables should be linear.</li>\n" +
                                    "    <li><strong>Independence:</strong> The residuals (errors) should be independent of each other.</li>\n" +
                                    "    <li><strong>Homoscedasticity:</strong> The variance of residuals should be constant across all levels of the independent variables.</li>\n" +
                                    "    <li><strong>Normality of Errors:</strong> The residuals should be normally distributed (for hypothesis testing and confidence intervals).</li>\n" +
                                    "</ul>\n.", "2024-11-02", "2024-11-02"),
                            Unit(5, 2, "Logistic Regression", 2, "<h1>Introduction to Logistic Regression</h1>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-info\">\n" +
                                    "    <div class=\"alert-title\">Prasyarat Pembelajaran</div>\n" +
                                    "    <p>Sebelum memulai course ini, pastikan Anda telah memahami dasar-dasar statistik dan pemrograman Python.</p>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<h2>1. What is Logistic Regression?</h2>\n" +
                                    "\n" +
                                    "<p>Logistic Regression is a classification algorithm used to predict the probability of a binary outcome. Unlike linear regression, which predicts continuous values, logistic regression predicts probabilities that are then mapped to one of two classes (typically 0 or 1).</p>\n" +
                                    "\n" +
                                    "<p>In logistic regression, the goal is to model the relationship between the input features (independent variables) and the probability of the target being 1 (or the positive class). The algorithm uses the sigmoid function to map any real-valued number into a probability between 0 and 1.</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-math\">\n" +
                                    "\uD835\uDC66 = \uD835\uDF0E(\uD835\uDEFD₀ + \uD835\uDEFD₁\uD835\uDC65₁ + \uD835\uDEFD₂\uD835\uDC65₂ + ⋯ + \uD835\uDEFDₙ\uD835\uDC65ₙ)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>y</strong> is the predicted probability of the positive class (i.e., the likelihood that the outcome is 1).</li>\n" +
                                    "    <li><strong>x₁, x₂, ..., xₙ</strong> are the input features.</li>\n" +
                                    "    <li><strong>β₀, β₁, ..., βₙ</strong> are the model coefficients (weights) that the model learns.</li>\n" +
                                    "    <li><strong>σ</strong> is the sigmoid function.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. The Sigmoid Function and Its Role in Logistic Regression</h2>\n" +
                                    "\n" +
                                    "<p>The sigmoid function, also known as the logistic function, is used in logistic regression to transform the output of the linear equation into a probability. It maps any real-valued number to a value between 0 and 1, which is ideal for classification problems.</p>\n" +
                                    "\n" +
                                    "<p>The formula for the sigmoid function is:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-math\">\n" +
                                    "\uD835\uDF0E(\uD835\uDC67) = 1 / (1 + e^(-\uD835\uDC67))\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>Where z is the linear combination of the input features:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-math\">\n" +
                                    "\uD835\uDC67 = \uD835\uDEFD₀ + \uD835\uDEFD₁\uD835\uDC65₁ + \uD835\uDEFD₂\uD835\uDC65₂ + ⋯ + \uD835\uDEFDₙ\uD835\uDC65ₙ\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>As the value of z increases (more positive), the output of the sigmoid function gets closer to 1. As z decreases (more negative), the output gets closer to 0. This allows logistic regression to output probabilities for binary classification.</p>\n" +
                                    "\n" +
                                    "<p>For example, if the sigmoid function outputs a value greater than 0.5, the prediction is class 1 (positive class). Otherwise, it is class 0 (negative class).</p>\n" +
                                    "\n" +
                                    "<h2>3. Interpreting the Coefficients in Logistic Regression</h2>\n" +
                                    "\n" +
                                    "<p>The coefficients in logistic regression correspond to the weights of the input features. These coefficients determine the influence of each feature on the predicted probability.</p>\n" +
                                    "\n" +
                                    "<p>For each coefficient βᵢ, the model interprets the effect of a one-unit change in xᵢ on the odds of the target being 1. Specifically:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>βᵢ</strong> is the log-odds change in the outcome for a one-unit increase in xᵢ.</li>\n" +
                                    "    <li>The exponentiated coefficient <strong>eᵇᵢ</strong> represents the odds ratio, which tells us how the odds of the outcome change with each unit increase in the feature.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p>For example, if β₁ = 0.5, then a one-unit increase in x₁ increases the odds of the target being 1 by a factor of eᵇ₁ ≈ 1.65.</p>\n" +
                                    "\n" +
                                    "<h2>4. The Logistic Loss Function (Binary Cross-Entropy)</h2>\n" +
                                    "\n" +
                                    "<p>The logistic loss function, also called binary cross-entropy, is used to measure the performance of a logistic regression model. It calculates the difference between the predicted probability and the actual outcome.</p>\n" +
                                    "\n" +
                                    "<p>The formula for the binary cross-entropy loss is:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-math\">\n" +
                                    "\uD835\uDC3D(\uD835\uDEFD) = −[\uD835\uDC66 log(\uD835\uDC5D) + (1−\uD835\uDC66) log(1−\uD835\uDC5D)]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>y</strong> is the true label (0 or 1),</li>\n" +
                                    "    <li><strong>p</strong> is the predicted probability of the positive class (1).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p>The goal is to minimize this loss function during training, which is typically done using an optimization algorithm such as gradient descent. By minimizing the loss, the model adjusts its coefficients to improve the predictions.</p>\n" +
                                    "\n" +
                                    "<h2>5. Gradient Descent in Logistic Regression</h2>\n" +
                                    "\n" +
                                    "<p>Gradient descent is an optimization technique used to minimize the loss function by adjusting the model's coefficients.</p>\n" +
                                    "\n" +
                                    "<p>The basic idea is to compute the gradient (derivative) of the loss function with respect to each coefficient and update the coefficients in the opposite direction of the gradient to minimize the error.</p>\n" +
                                    "\n" +
                                    "<p>The update rule for each coefficient βᵢ is:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-math\">\n" +
                                    "\uD835\uDEFDᵢ := \uD835\uDEFDᵢ − α ∂\uD835\uDC3D / ∂\uD835\uDEFDᵢ\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>α</strong> is the learning rate (the step size for each update),</li>\n" +
                                    "    <li><strong>∂\uD835\uDC3D / ∂\uD835\uDEFDᵢ</strong> is the gradient of the cost function with respect to the coefficient βᵢ.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p>By iterating over the training data and applying this update rule, the model gradually improves its coefficients and learns the optimal parameters for predicting the probability of the target class.</p>\n" +
                                    "\n" +
                                    "<h2>6. Implementing Logistic Regression in Python</h2>\n" +
                                    "\n" +
                                    "<p>Now, let’s see how to implement logistic regression using Python and the popular machine learning library Scikit-learn. Below is an example using the Iris dataset to predict whether a flower is of a particular species (binary classification).</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "from sklearn.model_selection import train_test_split\n" +
                                    "from sklearn.linear_model import LogisticRegression\n" +
                                    "from sklearn.metrics import accuracy_score\n" +
                                    "\n" +
                                    "# Load data\n" +
                                    "from sklearn.datasets import load_iris\n" +
                                    "data = load_iris()\n" +
                                    "X = data.data\n" +
                                    "y = (data.target == 0).astype(int)  # Target: 1 if setosa, else 0\n" +
                                    "\n" +
                                    "# Split the data\n" +
                                    "X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=42)\n" +
                                    "\n" +
                                    "# Create and fit the logistic regression model\n" +
                                    "model = LogisticRegression()\n" +
                                    "model.fit(X_train, y_train)\n" +
                                    "\n" +
                                    "# Make predictions\n" +
                                    "y_pred = model.predict(X_test)\n" +
                                    "\n" +
                                    "# Evaluate the model\n" +
                                    "accuracy = accuracy_score(y_test, y_pred)\n" +
                                    "print(f\"Accuracy: {accuracy}\")\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-success\">\n" +
                                    "    <div class=\"alert-title\">Next Steps</div>\n" +
                                    "    <p>After completing this module, you can continue learning:</p>\n" +
                                    "    <ul>\n" +
                                    "        <li>Evaluating Model Performance</li>\n" +
                                    "        <li>Advanced Topics in Logistic Regression</li>\n" +
                                    "        <li>Implementing Other Machine Learning Algorithms</li>\n" +
                                    "    </ul>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<hr>\n" +
                                    "\n" +
                                    "<p class=\"text-center\">Happy learning! \uD83D\uDE80</p>\n.", "2024-11-02", "2024-11-02"),
                            Unit(6, 2, "Decision Trees", 3, "<h1>Introduction to Decision Trees</h1>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-info\">\n" +
                                    "    <div class=\"alert-title\">Prasyarat Pembelajaran</div>\n" +
                                    "    <p>Sebelum memulai course ini, pastikan Anda memiliki pemahaman dasar tentang algoritma klasifikasi dan regresi.</p>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<h2>1. What is a Decision Tree?</h2>\n" +
                                    "\n" +
                                    "<p>A Decision Tree is a versatile algorithm used for both classification and regression tasks. It models data by recursively splitting it into subsets based on feature values, ultimately leading to predictions at the leaf nodes.</p>\n" +
                                    "\n" +
                                    "<p>In classification, decision trees predict a class label, and in regression, they predict a continuous value. The goal is to create the simplest tree that makes accurate predictions.</p>\n" +
                                    "\n" +
                                    "<h2>2. How Decision Trees Work</h2>\n" +
                                    "\n" +
                                    "<p>A decision tree splits the data based on feature values at each node, choosing the feature that best separates the data. This is done using metrics like Gini impurity or Entropy (for classification) and Mean Squared Error (MSE) (for regression). The tree grows until a stopping condition (such as tree depth or minimum samples in a leaf) is met.</p>\n" +
                                    "\n" +
                                    "<h2>3. Splitting Criteria</h2>\n" +
                                    "\n" +
                                    "<p>The following are the main criteria for splitting nodes in a decision tree:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Gini Impurity (for classification)</strong>: Measures the \"impurity\" of a node. A lower Gini score indicates a better split.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-math\">\n" +
                                    "\uD835\uDC3A\uD835\uDC56\uD835\uDC5B\uD835\uDC56 = 1 − ∑\uD835\uDC56=1\uD835\uDC36 \uD835\uDC5D\uD835\uDC56²\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>Where <strong>pᵢ</strong> is the probability of a class in a node.</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Entropy (for classification)</strong>: Measures the uncertainty in a node. The tree aims to minimize entropy.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-math\">\n" +
                                    "\uD835\uDC38\uD835\uDC5B\uD835\uDC61\uD835\uDC5F\uD835\uDC5C\uD835\uDC5D\uD835\uDC66 = −∑\uD835\uDC56=1\uD835\uDC36 \uD835\uDC5D\uD835\uDC56 log₂(\uD835\uDC5D\uD835\uDC56)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Mean Squared Error (MSE) (for regression)</strong>: Measures the variance of the target variable within a node. Lower MSE indicates better splits.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Overfitting and Pruning</h2>\n" +
                                    "\n" +
                                    "<p>Decision trees are prone to overfitting, especially with deep trees. Pruning is a technique used to reduce overfitting by removing branches that add little predictive value.</p>\n" +
                                    "\n" +
                                    "<p>There are two types of pruning:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Pre-pruning</strong>: Stops the tree from growing too deep by setting constraints (e.g., max depth, min samples per leaf).</li>\n" +
                                    "    <li><strong>Post-pruning</strong>: Prunes branches after the tree is fully grown by evaluating performance on a validation set.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5. Advantages and Disadvantages</h2>\n" +
                                    "\n" +
                                    "<h3>Advantages:</h3>\n" +
                                    "<ul>\n" +
                                    "    <li>Easy to interpret and visualize.</li>\n" +
                                    "    <li>Handles both numerical and categorical data.</li>\n" +
                                    "    <li>No need for feature scaling.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Disadvantages:</h3>\n" +
                                    "<ul>\n" +
                                    "    <li>Prone to overfitting, especially with deep trees.</li>\n" +
                                    "    <li>Can be biased toward features with more levels.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>6. Implementing Decision Trees in Python</h2>\n" +
                                    "\n" +
                                    "<p>Here’s how to implement a decision tree for classification using Scikit-learn:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "from sklearn.tree import DecisionTreeClassifier\n" +
                                    "from sklearn.model_selection import train_test_split\n" +
                                    "from sklearn.datasets import load_iris\n" +
                                    "from sklearn.metrics import accuracy_score\n" +
                                    "\n" +
                                    "# Load dataset\n" +
                                    "data = load_iris()\n" +
                                    "X = data.data\n" +
                                    "y = data.target\n" +
                                    "\n" +
                                    "# Train-test split\n" +
                                    "X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=42)\n" +
                                    "\n" +
                                    "# Initialize and train the model\n" +
                                    "model = DecisionTreeClassifier()\n" +
                                    "model.fit(X_train, y_train)\n" +
                                    "\n" +
                                    "# Predict and evaluate\n" +
                                    "y_pred = model.predict(X_test)\n" +
                                    "accuracy = accuracy_score(y_test, y_pred)\n" +
                                    "print(f\"Accuracy: {accuracy}\")\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-success\">\n" +
                                    "    <div class=\"alert-title\">Next Steps</div>\n" +
                                    "    <p>After completing this module, you can continue learning:</p>\n" +
                                    "    <ul>\n" +
                                    "        <li>Evaluating Model Performance</li>\n" +
                                    "        <li>Advanced Topics in Decision Trees</li>\n" +
                                    "        <li>Implementing Random Forests and Gradient Boosting</li>\n" +
                                    "    </ul>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<hr>\n" +
                                    "\n" +
                                    "<p class=\"text-center\">Happy learning! \uD83D\uDE80</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(7, 3, "Data Cleaning", 1, "<h1>Introduction to Data Cleaning</h1>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-info\">\n" +
                                    "    <div class=\"alert-title\">Prasyarat Pembelajaran</div>\n" +
                                    "    <p>Sebelum memulai course ini, pastikan Anda memiliki pemahaman dasar tentang data science dan teknik-teknik dasar dalam analisis data.</p>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<h2>1. What is Data Cleaning?</h2>\n" +
                                    "\n" +
                                    "<p>Data cleaning is the process of preparing raw data by handling missing values and outliers. This step is essential for ensuring that machine learning models receive high-quality, reliable data.</p>\n" +
                                    "\n" +
                                    "<p>Proper data cleaning improves the accuracy and performance of models, as messy data can lead to incorrect insights and predictions.</p>\n" +
                                    "\n" +
                                    "<h2>2. Handling Missing Values</h2>\n" +
                                    "\n" +
                                    "<p>Missing data can arise for various reasons, such as errors in data collection or incomplete records. It's important to handle missing values appropriately to prevent biased or incomplete analysis.</p>\n" +
                                    "\n" +
                                    "<p>Common methods for dealing with missing values:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Removing missing data:</strong> Delete rows or columns with missing values (useful when missing data is minimal).</li>\n" +
                                    "    <li><strong>Imputation:</strong> Replace missing values with an estimated value:\n" +
                                    "        <ul>\n" +
                                    "            <li><strong>Mean/Median/Mode imputation:</strong> Fill missing values with the mean (numerical data), median, or mode (categorical data) of the feature.</li>\n" +
                                    "            <li><strong>Forward/Backward Fill:</strong> Use the previous or next value in time series data.</li>\n" +
                                    "            <li><strong>Model-based imputation:</strong> Use algorithms (e.g., KNN, regression) to predict missing values.</li>\n" +
                                    "        </ul>\n" +
                                    "    </li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Example (mean imputation in Python):</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "from sklearn.impute import SimpleImputer\n" +
                                    "import pandas as pd\n" +
                                    "\n" +
                                    "# Sample data\n" +
                                    "data = pd.DataFrame({'A': [1, 2, None, 4], 'B': [None, 2, 3, 4]})\n" +
                                    "\n" +
                                    "# Impute missing values with mean\n" +
                                    "imputer = SimpleImputer(strategy='mean')\n" +
                                    "data_imputed = pd.DataFrame(imputer.fit_transform(data), columns=data.columns)\n" +
                                    "\n" +
                                    "print(data_imputed)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>3. Handling Outliers</h2>\n" +
                                    "\n" +
                                    "<p>Outliers are data points that significantly differ from other observations. They can distort statistical analyses and machine learning models, leading to inaccurate predictions. It's important to detect and handle them.</p>\n" +
                                    "\n" +
                                    "<p>Methods to deal with outliers:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Detection:</strong> Use statistical techniques or visualization (boxplots, scatter plots) to identify outliers.</li>\n" +
                                    "    <li><strong>Z-score:</strong> Outliers are data points where the z-score (standard deviation from the mean) exceeds a threshold (e.g., |z| > 3).</li>\n" +
                                    "    <li><strong>IQR (Interquartile Range):</strong> Outliers are defined as values beyond 1.5 times the IQR below Q1 or above Q3.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-math\">\n" +
                                    "Outlier range = [Q1 - 1.5 * IQR, Q3 + 1.5 * IQR]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>Handling Outliers:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Remove outliers:</strong> Remove rows where outliers are present (useful when outliers are erroneous).</li>\n" +
                                    "    <li><strong>Cap or Transform:</strong> Cap outliers to a certain threshold or apply transformations (e.g., log transformation) to reduce their impact.</li>\n" +
                                    "    <li><strong>Impute outliers:</strong> Replace extreme outliers with a more reasonable value (e.g., mean, median).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Example (IQR method in Python):</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "import pandas as pd\n" +
                                    "\n" +
                                    "# Sample data\n" +
                                    "data = pd.DataFrame({'A': [1, 2, 3, 100, 5]})\n" +
                                    "\n" +
                                    "# Calculate IQR\n" +
                                    "Q1 = data['A'].quantile(0.25)\n" +
                                    "Q3 = data['A'].quantile(0.75)\n" +
                                    "IQR = Q3 - Q1\n" +
                                    "\n" +
                                    "# Define outlier range\n" +
                                    "lower_bound = Q1 - 1.5 * IQR\n" +
                                    "upper_bound = Q3 + 1.5 * IQR\n" +
                                    "\n" +
                                    "# Remove outliers\n" +
                                    "data_no_outliers = data[(data['A'] >= lower_bound) & (data['A'] <= upper_bound)]\n" +
                                    "print(data_no_outliers)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>4. Techniques for Efficient Data Cleaning</h2>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Consistency Checks:</strong> Ensure that data follows consistent formats (e.g., date formats, categorical labels).</li>\n" +
                                    "    <li><strong>Scaling/Normalization:</strong> After cleaning, scale or normalize data if needed, especially for algorithms sensitive to feature magnitude (e.g., KNN, SVM).</li>\n" +
                                    "    <li><strong>Data Transformation:</strong> Apply transformations like log, square root, or Box-Cox to stabilize variance or make distributions more normal.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5. Tools for Data Cleaning</h2>\n" +
                                    "\n" +
                                    "<p>Popular Python libraries for data cleaning include:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Pandas:</strong> Provides functionality for handling missing values, outliers, and various data manipulations.</li>\n" +
                                    "    <li><strong>Scikit-learn:</strong> Offers imputation methods and utilities for preprocessing data.</li>\n" +
                                    "    <li><strong>Matplotlib/Seaborn:</strong> For visualizing missing values and outliers.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-success\">\n" +
                                    "    <div class=\"alert-title\">Next Steps</div>\n" +
                                    "    <p>After completing this module, you can continue learning:</p>\n" +
                                    "    <ul>\n" +
                                    "        <li>Exploratory Data Analysis (EDA)</li>\n" +
                                    "        <li>Feature Engineering</li>\n" +
                                    "        <li>Advanced Data Preprocessing Techniques</li>\n" +
                                    "    </ul>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<hr>\n" +
                                    "\n" +
                                    "<p class=\"text-center\">Happy learning! \uD83D\uDE80</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(8, 3, "Feature Scaling", 2, "<h1>Introduction to Feature Scaling</h1>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-info\">\n" +
                                    "    <div class=\"alert-title\">Prasyarat Pembelajaran</div>\n" +
                                    "    <p>Sebelum memulai topik ini, pastikan Anda memahami dasar-dasar statistik dan konsep dasar dalam data preprocessing, seperti data numerik dan distribusi data.</p>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<h2>1. What is Feature Scaling?</h2>\n" +
                                    "\n" +
                                    "<p>Feature scaling is the process of adjusting the values of numerical features in your dataset so they have a consistent range or distribution. Many machine learning algorithms (e.g., KNN, SVM, gradient descent) are sensitive to the scale of the features, and improper scaling can lead to biased or poor performance.</p>\n" +
                                    "\n" +
                                    "<p>Common techniques for scaling include normalization and standardization, both of which transform features to different ranges.</p>\n" +
                                    "\n" +
                                    "<h2>2. Normalization (Min-Max Scaling)</h2>\n" +
                                    "\n" +
                                    "<p>Normalization scales the data to a specific range, typically [0, 1]. It’s particularly useful when features have different units or ranges, ensuring that no feature dominates the learning process.</p>\n" +
                                    "\n" +
                                    "<p>The formula for Min-Max normalization is:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-math\">\n" +
                                    "X_scaled = (X - X_min) / (X_max - X_min)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>X</strong> is the original value.</li>\n" +
                                    "    <li><strong>X_min</strong> and <strong>X_max</strong> are the minimum and maximum values of the feature.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Normalization is useful when:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Features have different scales.</li>\n" +
                                    "    <li>You want to preserve the relationship between data points within a specific range.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Example (Min-Max Normalization in Python):</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "from sklearn.preprocessing import MinMaxScaler\n" +
                                    "import pandas as pd\n" +
                                    "\n" +
                                    "# Sample data\n" +
                                    "data = pd.DataFrame({'A': [1, 2, 3, 4, 5]})\n" +
                                    "\n" +
                                    "# Apply Min-Max Scaling\n" +
                                    "scaler = MinMaxScaler()\n" +
                                    "data_scaled = scaler.fit_transform(data)\n" +
                                    "\n" +
                                    "print(data_scaled)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>3. Standardization (Z-score Scaling)</h2>\n" +
                                    "\n" +
                                    "<p>Standardization scales data to have a mean of 0 and a standard deviation of 1. It’s useful when the features have different units or when the data is not uniformly distributed. Standardization does not bound the values within a specific range like normalization.</p>\n" +
                                    "\n" +
                                    "<p>The formula for standardization (Z-score scaling) is:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-math\">\n" +
                                    "X_scaled = (X - μ) / σ\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>X</strong> is the original value.</li>\n" +
                                    "    <li><strong>μ</strong> is the mean of the feature.</li>\n" +
                                    "    <li><strong>σ</strong> is the standard deviation of the feature.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Standardization is useful when:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>The algorithm assumes data is normally distributed (e.g., linear regression, SVM).</li>\n" +
                                    "    <li>You want to handle outliers effectively, as standardization reduces the influence of extreme values compared to normalization.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Example (Z-score Standardization in Python):</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "from sklearn.preprocessing import StandardScaler\n" +
                                    "import pandas as pd\n" +
                                    "\n" +
                                    "# Sample data\n" +
                                    "data = pd.DataFrame({'A': [1, 2, 3, 4, 5]})\n" +
                                    "\n" +
                                    "# Apply Standardization\n" +
                                    "scaler = StandardScaler()\n" +
                                    "data_scaled = scaler.fit_transform(data)\n" +
                                    "\n" +
                                    "print(data_scaled)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>4. When to Use Normalization vs Standardization</h2>\n" +
                                    "\n" +
                                    "<p><strong>Normalization</strong> is ideal when the features have different units and when you want the features to be on the same scale, especially when the data has a known range and is bounded.</p>\n" +
                                    "\n" +
                                    "<p><strong>Standardization</strong> is more appropriate when the data follows a normal distribution or when using algorithms that assume Gaussian distribution (e.g., linear regression, logistic regression, PCA).</p>\n" +
                                    "\n" +
                                    "<h2>5. Other Scaling Techniques</h2>\n" +
                                    "\n" +
                                    "<p>Besides Min-Max scaling and standardization, there are other scaling techniques that may be useful in specific situations:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Robust Scaling:</strong> This method uses the median and interquartile range (IQR) for scaling, making it less sensitive to outliers.</li>\n" +
                                    "    <li><strong>Formula:</strong></li>\n" +
                                    "    <pre><code class=\"language-math\">\n" +
                                    "    X_scaled = (X - median(X)) / IQR(X)\n" +
                                    "    </code></pre>\n" +
                                    "    \n" +
                                    "    <li><strong>MaxAbs Scaling:</strong> Scales the data by dividing each feature by its maximum absolute value, keeping the data within the range [-1, 1].</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-success\">\n" +
                                    "    <div class=\"alert-title\">Next Steps</div>\n" +
                                    "    <p>After completing this module, you can explore:</p>\n" +
                                    "    <ul>\n" +
                                    "        <li>Data Preprocessing Techniques for Machine Learning</li>\n" +
                                    "        <li>Feature Engineering and Selection</li>\n" +
                                    "        <li>Hyperparameter Tuning in Machine Learning Algorithms</li>\n" +
                                    "    </ul>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<hr>\n" +
                                    "\n" +
                                    "<p class=\"text-center\">Happy learning! \uD83D\uDE80</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(9, 3, "Feature Selection", 3, "<h1>Introduction to Feature Selection</h1>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-info\">\n" +
                                    "    <div class=\"alert-title\">Prasyarat Pembelajaran</div>\n" +
                                    "    <p>Sebelum memulai topik ini, pastikan Anda memahami konsep dasar dalam machine learning dan teknik data preprocessing, termasuk pentingnya memilih fitur yang relevan untuk model prediktif.</p>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<h2>1. What is Feature Selection?</h2>\n" +
                                    "\n" +
                                    "<p>Feature selection is the process of selecting the most relevant features (or variables) for building a predictive model. Removing irrelevant or redundant features helps improve model performance, reduce overfitting, and enhance interpretability. It is a critical part of the data preprocessing pipeline, especially when dealing with high-dimensional datasets.</p>\n" +
                                    "\n" +
                                    "<p>Common feature selection techniques include filter methods, wrapper methods, and embedded methods.</p>\n" +
                                    "\n" +
                                    "<h2>2. Filter Methods</h2>\n" +
                                    "\n" +
                                    "<p>Filter methods assess the relevance of features based on statistical metrics without involving a machine learning algorithm. They are computationally efficient and simple to implement.</p>\n" +
                                    "\n" +
                                    "<p><strong>Common filter methods:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Correlation:</strong> Features with high correlation to the target variable are selected, while those highly correlated with each other are discarded. Use Pearson’s correlation coefficient for continuous features or Chi-square test for categorical data.</li>\n" +
                                    "    <li><strong>Chi-square test:</strong> A statistical test used to determine the independence of a feature with the target variable in classification problems.</li>\n" +
                                    "    <li><strong>ANOVA (Analysis of Variance):</strong> Used for selecting features that differ significantly across multiple categories in classification tasks.</li>\n" +
                                    "    <li><strong>Mutual Information:</strong> Measures the dependency between two variables. Higher mutual information indicates a more relevant feature.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Example (using correlation for feature selection in Python):</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "import pandas as pd\n" +
                                    "\n" +
                                    "# Sample data\n" +
                                    "data = pd.DataFrame({'A': [1, 2, 3, 4, 5], 'B': [5, 4, 3, 2, 1], 'target': [0, 1, 0, 1, 0]})\n" +
                                    "\n" +
                                    "# Calculate correlation matrix\n" +
                                    "corr_matrix = data.corr()\n" +
                                    "\n" +
                                    "# Select features highly correlated with the target\n" +
                                    "selected_features = corr_matrix['target'].sort_values(ascending=False)\n" +
                                    "print(selected_features)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>3. Wrapper Methods</h2>\n" +
                                    "\n" +
                                    "<p>Wrapper methods evaluate feature subsets based on model performance. They involve using a machine learning algorithm to assess which feature subsets lead to the best model performance. These methods tend to be more computationally expensive but can result in better feature sets.</p>\n" +
                                    "\n" +
                                    "<p><strong>Common wrapper methods:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Forward Selection:</strong> Starts with no features and iteratively adds the feature that improves model performance the most until no further improvement is seen.</li>\n" +
                                    "    <li><strong>Backward Elimination:</strong> Starts with all features and iteratively removes the least important feature based on model performance.</li>\n" +
                                    "    <li><strong>Recursive Feature Elimination (RFE):</strong> Recursively removes the least important features and trains the model on the remaining features until the desired number of features is reached.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Example (using RFE in Python):</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "from sklearn.feature_selection import RFE\n" +
                                    "from sklearn.linear_model import LogisticRegression\n" +
                                    "import pandas as pd\n" +
                                    "\n" +
                                    "# Sample data\n" +
                                    "data = pd.DataFrame({'A': [1, 2, 3, 4, 5], 'B': [5, 4, 3, 2, 1], 'target': [0, 1, 0, 1, 0]})\n" +
                                    "X = data[['A', 'B']]\n" +
                                    "y = data['target']\n" +
                                    "\n" +
                                    "# Fit RFE with Logistic Regression\n" +
                                    "model = LogisticRegression()\n" +
                                    "rfe = RFE(model, n_features_to_select=1)\n" +
                                    "X_rfe = rfe.fit_transform(X, y)\n" +
                                    "\n" +
                                    "# Get the ranking of features\n" +
                                    "print(rfe.support_)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>4. Embedded Methods</h2>\n" +
                                    "\n" +
                                    "<p>Embedded methods perform feature selection during the model training process. These methods are usually less computationally expensive than wrapper methods and provide a more automated way to select features.</p>\n" +
                                    "\n" +
                                    "<p><strong>Common embedded methods:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Lasso (L1 Regularization):</strong> Lasso regression adds a penalty to the model that forces some feature coefficients to be zero, effectively selecting a subset of features.</li>\n" +
                                    "    <li><strong>Decision Trees and Random Forests:</strong> These models can be used to assess feature importance, allowing you to rank features by their contribution to the model.</li>\n" +
                                    "    <li><strong>Gradient Boosting:</strong> Like random forests, gradient boosting models also provide feature importance metrics that can be used for selection.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Example (using Lasso for feature selection in Python):</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "from sklearn.linear_model import Lasso\n" +
                                    "import pandas as pd\n" +
                                    "\n" +
                                    "# Sample data\n" +
                                    "data = pd.DataFrame({'A': [1, 2, 3, 4, 5], 'B': [5, 4, 3, 2, 1], 'target': [0, 1, 0, 1, 0]})\n" +
                                    "X = data[['A', 'B']]\n" +
                                    "y = data['target']\n" +
                                    "\n" +
                                    "# Fit Lasso regression\n" +
                                    "lasso = Lasso(alpha=0.1)\n" +
                                    "lasso.fit(X, y)\n" +
                                    "\n" +
                                    "# Get feature coefficients\n" +
                                    "print(lasso.coef_)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>5. Feature Importance</h2>\n" +
                                    "\n" +
                                    "<p>Feature importance is a technique used to rank the relative importance of features based on their contribution to the model’s prediction. It is particularly useful for tree-based models (e.g., decision trees, random forests, and gradient boosting).</p>\n" +
                                    "\n" +
                                    "<p><strong>Common methods to evaluate feature importance:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Mean Decrease Impurity (MDI):</strong> Used by decision trees to assess how much each feature reduces the impurity at each split.</li>\n" +
                                    "    <li><strong>Permutation Importance:</strong> Measures the change in model performance when a feature’s values are randomly shuffled.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Example (using Random Forest for feature importance in Python):</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "from sklearn.ensemble import RandomForestClassifier\n" +
                                    "import pandas as pd\n" +
                                    "\n" +
                                    "# Sample data\n" +
                                    "data = pd.DataFrame({'A': [1, 2, 3, 4, 5], 'B': [5, 4, 3, 2, 1], 'target': [0, 1, 0, 1, 0]})\n" +
                                    "X = data[['A', 'B']]\n" +
                                    "y = data['target']\n" +
                                    "\n" +
                                    "# Fit Random Forest\n" +
                                    "rf = RandomForestClassifier()\n" +
                                    "rf.fit(X, y)\n" +
                                    "\n" +
                                    "# Get feature importance\n" +
                                    "print(rf.feature_importances_)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-success\">\n" +
                                    "    <div class=\"alert-title\">Next Steps</div>\n" +
                                    "    <p>After completing this module, consider exploring:</p>\n" +
                                    "    <ul>\n" +
                                    "        <li>Hyperparameter tuning techniques for model optimization</li>\n" +
                                    "        <li>Advanced feature engineering methods</li>\n" +
                                    "        <li>How to combine feature selection techniques with cross-validation for robust model evaluation</li>\n" +
                                    "    </ul>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<hr>\n" +
                                    "\n" +
                                    "<p class=\"text-center\">Happy learning! \uD83D\uDE80</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(10, 4, "DataFrames", 1, "<h1>Introduction to Pandas DataFrames</h1>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-info\">\n" +
                                    "    <div class=\"alert-title\">Prasyarat Pembelajaran</div>\n" +
                                    "    <p>Pastikan Anda sudah memahami dasar-dasar Python sebelum melanjutkan ke Pandas DataFrames. Pandas adalah pustaka Python yang sangat kuat untuk manipulasi dan analisis data.</p>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<h2>1. What is a DataFrame?</h2>\n" +
                                    "\n" +
                                    "<p>A DataFrame is a two-dimensional, size-mutable, and heterogeneous tabular data structure in Pandas, a powerful Python library for data manipulation and analysis. It is one of the most commonly used structures in data science, as it can hold various types of data (numeric, strings, dates) in columns and rows, similar to an Excel spreadsheet or SQL table.</p>\n" +
                                    "\n" +
                                    "<p>DataFrames allow you to store and manipulate large datasets efficiently, supporting a wide range of operations, such as filtering, grouping, reshaping, and statistical analysis.</p>\n" +
                                    "\n" +
                                    "<h2>2. Creating a DataFrame</h2>\n" +
                                    "\n" +
                                    "<p>You can create a DataFrame in various ways, such as from:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Lists or Dictionaries.</li>\n" +
                                    "    <li>CSV files or Excel spreadsheets.</li>\n" +
                                    "    <li>Numpy arrays or other Pandas DataFrames.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Example 1 (Creating a DataFrame from a Dictionary):</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "import pandas as pd\n" +
                                    "\n" +
                                    "# Create a DataFrame from a dictionary\n" +
                                    "data = {\n" +
                                    "    'Name': ['Alice', 'Bob', 'Charlie'],\n" +
                                    "    'Age': [25, 30, 35],\n" +
                                    "    'City': ['New York', 'Los Angeles', 'Chicago']\n" +
                                    "}\n" +
                                    "\n" +
                                    "df = pd.DataFrame(data)\n" +
                                    "\n" +
                                    "print(df)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>Output:</strong></p>\n" +
                                    "<pre><code class=\"language-markdown\">\n" +
                                    "      Name  Age         City\n" +
                                    "0    Alice   25     New York\n" +
                                    "1      Bob   30  Los Angeles\n" +
                                    "2  Charlie   35      Chicago\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>Example 2 (Creating a DataFrame from a CSV file):</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df = pd.read_csv('data.csv')  # Reads data from a CSV file\n" +
                                    "print(df.head())  # Display the first few rows\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>3. DataFrame Structure</h2>\n" +
                                    "\n" +
                                    "<p>A DataFrame is essentially a collection of Series (each column), and each Series is indexed by default, with an optional row index.</p>\n" +
                                    "\n" +
                                    "<p><strong>Key attributes:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>df.columns:</strong> Lists all the column names.</li>\n" +
                                    "    <li><strong>df.index:</strong> Shows the row index (default is a range of integers).</li>\n" +
                                    "    <li><strong>df.shape:</strong> Returns the number of rows and columns (e.g., (n_rows, n_columns)).</li>\n" +
                                    "    <li><strong>df.dtypes:</strong> Displays the data types of each column.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Example:</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "print(df.columns)   # Output: Index(['Name', 'Age', 'City'], dtype='object')\n" +
                                    "print(df.index)     # Output: RangeIndex(start=0, stop=3, step=1)\n" +
                                    "print(df.shape)     # Output: (3, 3)\n" +
                                    "print(df.dtypes)    # Output: Name     object, Age      int64, City     object\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-success\">\n" +
                                    "    <div class=\"alert-title\">Next Steps</div>\n" +
                                    "    <p>After completing this module, consider exploring:</p>\n" +
                                    "    <ul>\n" +
                                    "        <li>How to filter and select data from a DataFrame</li>\n" +
                                    "        <li>How to handle missing data in DataFrames</li>\n" +
                                    "        <li>Advanced operations like merging and joining multiple DataFrames</li>\n" +
                                    "    </ul>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<hr>\n" +
                                    "\n" +
                                    "<p class=\"text-center\">Happy coding with Pandas! \uD83D\uDE80</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(11, 4, "Data Filtering and Cleaning", 2, "<h1>Introduction to Pandas DataFrames</h1>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-info\">\n" +
                                    "    <div class=\"alert-title\">Prasyarat Pembelajaran</div>\n" +
                                    "    <p>Pastikan Anda sudah memahami dasar-dasar Python sebelum melanjutkan ke Pandas DataFrames. Pandas adalah pustaka Python yang sangat kuat untuk manipulasi dan analisis data.</p>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<h2>1. What is a DataFrame?</h2>\n" +
                                    "\n" +
                                    "<p>A DataFrame is a two-dimensional, size-mutable, and heterogeneous tabular data structure in Pandas, a powerful Python library for data manipulation and analysis. It is one of the most commonly used structures in data science, as it can hold various types of data (numeric, strings, dates) in columns and rows, similar to an Excel spreadsheet or SQL table.</p>\n" +
                                    "\n" +
                                    "<p>DataFrames allow you to store and manipulate large datasets efficiently, supporting a wide range of operations, such as filtering, grouping, reshaping, and statistical analysis.</p>\n" +
                                    "\n" +
                                    "<h2>2. Creating a DataFrame</h2>\n" +
                                    "\n" +
                                    "<p>You can create a DataFrame in various ways, such as from:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Lists or Dictionaries.</li>\n" +
                                    "    <li>CSV files or Excel spreadsheets.</li>\n" +
                                    "    <li>Numpy arrays or other Pandas DataFrames.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Example 1 (Creating a DataFrame from a Dictionary):</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "import pandas as pd\n" +
                                    "\n" +
                                    "# Create a DataFrame from a dictionary\n" +
                                    "data = {\n" +
                                    "    'Name': ['Alice', 'Bob', 'Charlie'],\n" +
                                    "    'Age': [25, 30, 35],\n" +
                                    "    'City': ['New York', 'Los Angeles', 'Chicago']\n" +
                                    "}\n" +
                                    "\n" +
                                    "df = pd.DataFrame(data)\n" +
                                    "\n" +
                                    "print(df)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>Output:</strong></p>\n" +
                                    "<pre><code class=\"language-markdown\">\n" +
                                    "      Name  Age         City\n" +
                                    "0    Alice   25     New York\n" +
                                    "1      Bob   30  Los Angeles\n" +
                                    "2  Charlie   35      Chicago\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>Example 2 (Creating a DataFrame from a CSV file):</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df = pd.read_csv('data.csv')  # Reads data from a CSV file\n" +
                                    "print(df.head())  # Display the first few rows\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>3. DataFrame Structure</h2>\n" +
                                    "\n" +
                                    "<p>A DataFrame is essentially a collection of Series (each column), and each Series is indexed by default, with an optional row index.</p>\n" +
                                    "\n" +
                                    "<p><strong>Key attributes:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>df.columns:</strong> Lists all the column names.</li>\n" +
                                    "    <li><strong>df.index:</strong> Shows the row index (default is a range of integers).</li>\n" +
                                    "    <li><strong>df.shape:</strong> Returns the number of rows and columns (e.g., (n_rows, n_columns)).</li>\n" +
                                    "    <li><strong>df.dtypes:</strong> Displays the data types of each column.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Example:</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "print(df.columns)   # Output: Index(['Name', 'Age', 'City'], dtype='object')\n" +
                                    "print(df.index)     # Output: RangeIndex(start=0, stop=3, step=1)\n" +
                                    "print(df.shape)     # Output: (3, 3)\n" +
                                    "print(df.dtypes)    # Output: Name     object, Age      int64, City     object\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>4. Basic DataFrame Operations</h2>\n" +
                                    "\n" +
                                    "<p>Once you have a DataFrame, you can perform a variety of operations:</p>\n" +
                                    "\n" +
                                    "<p><strong>Selecting Columns:</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df['Age']  # Returns the 'Age' column as a Series\n" +
                                    "df[['Name', 'City']]  # Returns multiple columns\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>Selecting Rows by Index:</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df.loc[1]  # Selects row by label (index 1, i.e., Bob's data)\n" +
                                    "df.iloc[1]  # Selects row by integer position (index 1, same as loc)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>Filtering Rows:</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df[df['Age'] > 30]  # Selects rows where Age is greater than 30\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>Adding a New Column:</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df['Country'] = ['USA', 'USA', 'USA']  # Adds a new column 'Country'\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>Renaming Columns:</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df.rename(columns={'Name': 'Full Name', 'City': 'Location'}, inplace=True)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>5. Data Cleaning with DataFrames</h2>\n" +
                                    "\n" +
                                    "<p>Pandas DataFrames offer robust functionality for cleaning data, such as handling missing values, duplicates, and data type conversions.</p>\n" +
                                    "\n" +
                                    "<p><strong>Handling Missing Data:</strong></p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Drop missing values:</strong></li>\n" +
                                    "    <pre><code class=\"language-python\">\n" +
                                    "df.dropna()  # Removes rows with missing values\n" +
                                    "</code></pre>\n" +
                                    "    <li><strong>Fill missing values:</strong></li>\n" +
                                    "    <pre><code class=\"language-python\">\n" +
                                    "df.fillna(value={'Age': 30})  # Replaces NaN in 'Age' with 30\n" +
                                    "</code></pre>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Removing Duplicates:</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df.drop_duplicates()  # Removes duplicate rows\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>Converting Data Types:</strong></p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df['Age'] = df['Age'].astype(float)  # Converts the 'Age' column to float\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<div class=\"alert alert-success\">\n" +
                                    "    <div class=\"alert-title\">Next Steps</div>\n" +
                                    "    <p>After completing this module, consider exploring:</p>\n" +
                                    "    <ul>\n" +
                                    "        <li>How to group data using <code>groupby()</code></li>\n" +
                                    "        <li>Handling more advanced data manipulations like merging and joining DataFrames</li>\n" +
                                    "        <li>Exploring time series data with Pandas</li>\n" +
                                    "    </ul>\n" +
                                    "</div>\n" +
                                    "\n" +
                                    "<hr>\n" +
                                    "\n" +
                                    "<p class=\"text-center\">Happy coding with Pandas! \uD83D\uDE80</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(12, 4, "Data Aggregation", 3, "<h1>6. DataFrame Operations for Analysis</h1>\n" +
                                    "\n" +
                                    "<p>Pandas DataFrames support various functions for summarizing and analyzing data, allowing users to quickly gain insights from the data.</p>\n" +
                                    "\n" +
                                    "<h2>Descriptive Statistics:</h2>\n" +
                                    "<p>Summary statistics such as mean, standard deviation, and count can be easily computed using <code>describe()</code>:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df.describe()  # Summarizes statistics (mean, std, count, etc.)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>GroupBy:</h2>\n" +
                                    "<p>You can group data based on certain columns and apply aggregate functions (like mean, sum, etc.) on each group:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df.groupby('City').mean()  # Groups by 'City' and calculates the mean of each group\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>Sorting Data:</h2>\n" +
                                    "<p>Sorting the data by columns can be done using <code>sort_values()</code>:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df.sort_values(by='Age', ascending=False)  # Sorts DataFrame by 'Age' in descending order\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>Applying Functions:</h2>\n" +
                                    "<p>You can apply custom functions to columns using <code>apply()</code>. Here's an example that increases all ages by 1:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df['Age'] = df['Age'].apply(lambda x: x + 1)  # Increases all ages by 1\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h1>7. DataFrame Indexing and Selection</h1>\n" +
                                    "\n" +
                                    "<p>Pandas offers powerful indexing capabilities, allowing for more flexible and efficient data selection.</p>\n" +
                                    "\n" +
                                    "<h2>Setting an Index:</h2>\n" +
                                    "<p>You can set a column as the index for easier lookup and selection:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df.set_index('Name', inplace=True)  # Sets 'Name' column as the index\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>Resetting the Index:</h2>\n" +
                                    "<p>To revert back to the default integer index, use <code>reset_index()</code>:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df.reset_index(inplace=True)  # Resets the index to the default integer index\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>Slicing Data:</h2>\n" +
                                    "<p>You can slice rows and columns using <code>loc[]</code>, providing a flexible way to select portions of the DataFrame:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df.loc[0:2, 'Age':'City']  # Slices rows 0 to 2, columns 'Age' to 'City'\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h1>8. Merging and Concatenating DataFrames</h1>\n" +
                                    "\n" +
                                    "<p>Pandas allows you to combine multiple DataFrames in various ways: concatenating and merging.</p>\n" +
                                    "\n" +
                                    "<h2>Concatenating DataFrames:</h2>\n" +
                                    "<p>You can concatenate DataFrames either vertically or horizontally:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df1 = pd.DataFrame({'A': [1, 2], 'B': [3, 4]})\n" +
                                    "df2 = pd.DataFrame({'A': [5, 6], 'B': [7, 8]})\n" +
                                    "result = pd.concat([df1, df2], ignore_index=True)  # Concatenates DataFrames vertically\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>Merging DataFrames:</h2>\n" +
                                    "<p>You can merge two DataFrames based on a common column, similar to SQL joins:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "df1 = pd.DataFrame({'ID': [1, 2], 'Name': ['Alice', 'Bob']})\n" +
                                    "df2 = pd.DataFrame({'ID': [1, 2], 'Age': [25, 30]})\n" +
                                    "merged_df = pd.merge(df1, df2, on='ID')  # Merges based on 'ID' column\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<hr>\n" +
                                    "\n" +
                                    "<p class=\"text-center\">Master these techniques to efficiently manipulate and analyze data with Pandas! \uD83D\uDE80</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(13, 5, "NumPy Arrays", 1, "<h1>1. Introduction to NumPy Arrays</h1>\n" +
                                    "\n" +
                                    "<p>NumPy (Numerical Python) is a powerful library for numerical computing in Python. At the core of NumPy is the <strong>ndarray</strong> (n-dimensional array), which is a highly efficient and flexible way to store and manipulate large datasets. NumPy arrays are faster and more memory-efficient than Python lists, especially when performing mathematical operations on large datasets.</p>\n" +
                                    "\n" +
                                    "<p>NumPy arrays are <strong>homogeneous</strong>, meaning they contain elements of the same data type (e.g., integers, floats), unlike Python lists, which can store mixed data types.</p>\n" +
                                    "\n" +
                                    "<h1>2. Creating NumPy Arrays</h1>\n" +
                                    "\n" +
                                    "<p>You can create NumPy arrays from lists, tuples, or other data structures. Some of the common ways to create NumPy arrays include:</p>\n" +
                                    "\n" +
                                    "<h3>From a Python list:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "import numpy as np\n" +
                                    "arr = np.array([1, 2, 3, 4, 5])\n" +
                                    "print(arr)\n" +
                                    "</code></pre>\n" +
                                    "<p><strong>Output:</strong></p>\n" +
                                    "<pre><code class=\"language-csharp\">\n" +
                                    "[1 2 3 4 5]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>From a Python list of lists (creates a 2D array):</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr_2d = np.array([[1, 2], [3, 4], [5, 6]])\n" +
                                    "print(arr_2d)\n" +
                                    "</code></pre>\n" +
                                    "<p><strong>Output:</strong></p>\n" +
                                    "<pre><code class=\"language-lua\">\n" +
                                    "[[1 2]\n" +
                                    " [3 4]\n" +
                                    " [5 6]]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Using <code>np.zeros</code> (creates an array filled with zeros):</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "zeros_arr = np.zeros((3, 3))  # 3x3 array of zeros\n" +
                                    "print(zeros_arr)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Using <code>np.ones</code> (creates an array filled with ones):</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "ones_arr = np.ones((2, 3))  # 2x3 array of ones\n" +
                                    "print(ones_arr)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Using <code>np.arange</code> (creates an array with a range of numbers):</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "range_arr = np.arange(0, 10, 2)  # Array of numbers from 0 to 10 with step 2\n" +
                                    "print(range_arr)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Using <code>np.linspace</code> (creates an array with evenly spaced numbers):</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "linspace_arr = np.linspace(0, 1, 5)  # 5 equally spaced numbers between 0 and 1\n" +
                                    "print(linspace_arr)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h1>3. Array Attributes</h1>\n" +
                                    "\n" +
                                    "<p>NumPy arrays come with several useful attributes to inspect and understand the array structure:</p>\n" +
                                    "\n" +
                                    "<h3>Shape:</h3>\n" +
                                    "<p>Returns the dimensions of the array (rows, columns):</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "print(arr.shape)  # Output: (5,)\n" +
                                    "print(arr_2d.shape)  # Output: (3, 2)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Size:</h3>\n" +
                                    "<p>Returns the total number of elements in the array:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "print(arr.size)  # Output: 5\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Data Type:</h3>\n" +
                                    "<p>Returns the data type of the elements in the array:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "print(arr.dtype)  # Output: int64 (depends on platform)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Dimension:</h3>\n" +
                                    "<p>Returns the number of axes (dimensions) of the array:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "print(arr.ndim)  # Output: 1 (1D array)\n" +
                                    "print(arr_2d.ndim)  # Output: 2 (2D array)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Item Size:</h3>\n" +
                                    "<p>Returns the size (in bytes) of each element in the array:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "print(arr.itemsize)  # Output: 8 (for 64-bit integers)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h1>4. Array Indexing and Slicing</h1>\n" +
                                    "\n" +
                                    "<p>Like Python lists, NumPy arrays support indexing and slicing to access and modify elements.</p>\n" +
                                    "\n" +
                                    "<h3>Basic Indexing:</h3>\n" +
                                    "<p>You can access individual elements using indexing:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([10, 20, 30, 40, 50])\n" +
                                    "print(arr[0])  # Output: 10 (first element)\n" +
                                    "print(arr[2])  # Output: 30 (third element)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Slicing:</h3>\n" +
                                    "<p>You can slice arrays to access a range of elements:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "print(arr[1:4])  # Output: [20 30 40] (from index 1 to 3)\n" +
                                    "print(arr[:3])   # Output: [10 20 30] (first 3 elements)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Slicing for 2D Arrays:</h3>\n" +
                                    "<p>You can slice 2D arrays in both rows and columns:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr_2d = np.array([[1, 2], [3, 4], [5, 6]])\n" +
                                    "print(arr_2d[1, 0])  # Output: 3 (row 1, column 0)\n" +
                                    "print(arr_2d[:, 1])   # Output: [2 4 6] (all rows, column 1)\n" +
                                    "</code></pre>\n", "2024-11-02", "2024-11-02"),
                            Unit(14, 5, "Array Manipulations", 2, "<h1>5. Array Operations</h1>\n" +
                                    "\n" +
                                    "<p>NumPy arrays allow you to perform a wide range of mathematical operations element-wise. These operations are fast due to NumPy's optimized implementation in C.</p>\n" +
                                    "\n" +
                                    "<h3>Element-wise Operations:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr1 = np.array([1, 2, 3])\n" +
                                    "arr2 = np.array([4, 5, 6])\n" +
                                    "print(arr1 + arr2)  # Output: [5 7 9] (element-wise addition)\n" +
                                    "print(arr1 - arr2)  # Output: [-3 -3 -3] (element-wise subtraction)\n" +
                                    "print(arr1 * arr2)  # Output: [4 10 18] (element-wise multiplication)\n" +
                                    "print(arr1 / arr2)  # Output: [0.25 0.4 0.5] (element-wise division)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Universal Functions (ufuncs):</h3>\n" +
                                    "<p>These are NumPy functions that operate element-wise on arrays:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "print(np.sqrt(arr1))  # Output: [1.         1.41421356 1.73205081] (square root of each element)\n" +
                                    "print(np.exp(arr1))   # Output: [ 2.71828183  7.3890561  20.08553692] (exponentiation)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Matrix Operations (for 2D arrays):</h3>\n" +
                                    "<p>Matrix operations such as dot product can be performed on 2D arrays:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "mat1 = np.array([[1, 2], [3, 4]])\n" +
                                    "mat2 = np.array([[5, 6], [7, 8]])\n" +
                                    "\n" +
                                    "# Matrix multiplication (dot product)\n" +
                                    "print(np.dot(mat1, mat2))  # Output: [[19 22] [43 50]]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Aggregration Functions:</h3>\n" +
                                    "<p>NumPy provides several aggregation functions that summarize data:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1, 2, 3, 4, 5])\n" +
                                    "print(np.sum(arr))   # Output: 15 (sum of elements)\n" +
                                    "print(np.mean(arr))  # Output: 3.0 (mean of elements)\n" +
                                    "print(np.min(arr))   # Output: 1 (minimum element)\n" +
                                    "print(np.max(arr))   # Output: 5 (maximum element)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h1>6. Reshaping Arrays</h1>\n" +
                                    "\n" +
                                    "<p>You can change the shape of an array without changing its data using the <code>reshape()</code> method. This is particularly useful when preparing data for machine learning models.</p>\n" +
                                    "\n" +
                                    "<h3>Reshaping an Array:</h3>\n" +
                                    "<p>Reshape an array to a different shape:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1, 2, 3, 4, 5, 6])\n" +
                                    "reshaped_arr = arr.reshape((2, 3))  # 2 rows, 3 columns\n" +
                                    "print(reshaped_arr)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Flattening an Array:</h3>\n" +
                                    "<p>Convert a multi-dimensional array to a 1D array:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "flattened_arr = reshaped_arr.flatten()\n" +
                                    "print(flattened_arr)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Transposing an Array:</h3>\n" +
                                    "<p>Swap rows and columns:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "transposed_arr = reshaped_arr.T  # Transposes the array\n" +
                                    "print(transposed_arr)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h1>7. Broadcasting</h1>\n" +
                                    "\n" +
                                    "<p>Broadcasting allows NumPy to perform element-wise operations on arrays of different shapes, making operations more efficient without needing to manually align dimensions.</p>\n" +
                                    "\n" +
                                    "<h3>Example of Broadcasting:</h3>\n" +
                                    "<p>Broadcasting a scalar to each element of the array:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1, 2, 3])\n" +
                                    "scalar = 5\n" +
                                    "print(arr + scalar)  # Output: [6 7 8] (scalar is broadcasted to each element of the array)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Broadcasting with Arrays:</h3>\n" +
                                    "<p>Broadcasting works when arrays of different shapes are involved, aligning smaller arrays with larger ones:</p>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr1 = np.array([[1, 2], [3, 4]])\n" +
                                    "arr2 = np.array([10, 20])\n" +
                                    "print(arr1 + arr2)  # Output: [[11 22] [13 24]] (arr2 is broadcasted to each row of arr1)\n" +
                                    "</code></pre>\n", "2024-11-02", "2024-11-02"),
                            Unit(15, 5, "Mathematical Operations", 3, "<h1>1. Introduction to Mathematical Operations with NumPy</h1>\n" +
                                    "\n" +
                                    "<p>NumPy is a powerful library in Python designed for numerical computations. It provides a wide range of functions for performing mathematical operations on arrays. These operations can be applied element-wise, or in the case of multi-dimensional arrays, can operate on entire rows, columns, or axes.</p>\n" +
                                    "\n" +
                                    "<p>In this section, we’ll explore how to use NumPy for basic mathematical, statistical, and linear algebra operations.</p>\n" +
                                    "\n" +
                                    "<h1>2. Element-wise Mathematical Operations</h1>\n" +
                                    "<p>NumPy allows you to perform mathematical operations on entire arrays, applying them element by element.</p>\n" +
                                    "\n" +
                                    "<h3>Addition:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "import numpy as np\n" +
                                    "arr1 = np.array([1, 2, 3])\n" +
                                    "arr2 = np.array([4, 5, 6])\n" +
                                    "result = arr1 + arr2  # Element-wise addition\n" +
                                    "print(result)  # Output: [5 7 9]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Subtraction:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "result = arr1 - arr2  # Element-wise subtraction\n" +
                                    "print(result)  # Output: [-3 -3 -3]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Multiplication:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "result = arr1 * arr2  # Element-wise multiplication\n" +
                                    "print(result)  # Output: [ 4 10 18]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Division:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "result = arr1 / arr2  # Element-wise division\n" +
                                    "print(result)  # Output: [0.25 0.4 0.5]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Exponentiation:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "result = arr1 ** 2  # Element-wise squaring\n" +
                                    "print(result)  # Output: [1 4 9]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Square Root:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "result = np.sqrt(arr1)  # Element-wise square root\n" +
                                    "print(result)  # Output: [1.         1.41421356 1.73205081]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h1>3. Mathematical Functions in NumPy</h1>\n" +
                                    "<p>NumPy provides a variety of universal functions (ufuncs) to perform mathematical operations on arrays. These are optimized for fast performance.</p>\n" +
                                    "\n" +
                                    "<h3>Trigonometric Functions:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "angles = np.array([0, np.pi / 2, np.pi])\n" +
                                    "print(np.sin(angles))  # Output: [0. 1. 0.]\n" +
                                    "print(np.cos(angles))  # Output: [1. 0. -1.]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Logarithmic and Exponential Functions:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1, 10, 100])\n" +
                                    "print(np.log(arr))   # Natural logarithm (base e)\n" +
                                    "print(np.log10(arr))  # Logarithm base 10\n" +
                                    "print(np.exp(arr))    # Exponential (e^x)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Rounding Functions:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1.234, 5.678])\n" +
                                    "print(np.floor(arr))  # Output: [1. 5.]\n" +
                                    "print(np.ceil(arr))   # Output: [2. 6.]\n" +
                                    "print(np.round(arr))  # Output: [1. 6.]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Absolute Value:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([-1, -2, 3, -4])\n" +
                                    "print(np.abs(arr))  # Output: [1 2 3 4]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h1>4. Statistical Operations with NumPy</h1>\n" +
                                    "<p>NumPy also provides many functions to perform statistical analysis on data, helping to summarize and understand datasets.</p>\n" +
                                    "\n" +
                                    "<h3>Mean:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1, 2, 3, 4, 5])\n" +
                                    "mean = np.mean(arr)  # Average of all elements\n" +
                                    "print(mean)  # Output: 3.0\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Median:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1, 2, 3, 4, 5])\n" +
                                    "median = np.median(arr)  # Middle value in the dataset\n" +
                                    "print(median)  # Output: 3.0\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Standard Deviation:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1, 2, 3, 4, 5])\n" +
                                    "std_dev = np.std(arr)  # Measures the spread of data\n" +
                                    "print(std_dev)  # Output: 1.4142135623730951\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Variance:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1, 2, 3, 4, 5])\n" +
                                    "variance = np.var(arr)  # Square of the standard deviation\n" +
                                    "print(variance)  # Output: 2.0\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Sum:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1, 2, 3, 4, 5])\n" +
                                    "total = np.sum(arr)  # Sum of all elements\n" +
                                    "print(total)  # Output: 15\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Minimum and Maximum:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1, 2, 3, 4, 5])\n" +
                                    "min_val = np.min(arr)  # Minimum value in the array\n" +
                                    "max_val = np.max(arr)  # Maximum value in the array\n" +
                                    "print(min_val, max_val)  # Output: 1 5\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Percentiles:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1, 2, 3, 4, 5])\n" +
                                    "p50 = np.percentile(arr, 50)  # Median (50th percentile)\n" +
                                    "p25 = np.percentile(arr, 25)  # 25th percentile\n" +
                                    "print(p50, p25)  # Output: 3.0 2.0\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h1>5. Aggregating and Reducing Operations</h1>\n" +
                                    "<p>NumPy provides functions to perform reduction and aggregation operations, such as summing up the array values along a specific axis.</p>\n" +
                                    "\n" +
                                    "<h3>Sum along an axis:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([[1, 2, 3], [4, 5, 6]])\n" +
                                    "row_sum = np.sum(arr, axis=1)  # Sum along each row\n" +
                                    "col_sum = np.sum(arr, axis=0)  # Sum along each column\n" +
                                    "print(row_sum)  # Output: [ 6 15]\n" +
                                    "print(col_sum)  # Output: [5 7 9]\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Cumulative Sum:</h3>\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "arr = np.array([1, 2, 3, 4])\n" +
                                    "cum_sum = np.cumsum(arr)  # Cumulative sum\n" +
                                    "print(cum_sum)  # Output: [1 3 6 10]\n" +
                                    "</code></pre>\n", "2024-11-02", "2024-11-02")
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
                            Unit(16, 6, "Basic Plotting", 1, "<h1>1. Introduction to Basic Plotting with Matplotlib</h1>\n" +
                                    "\n" +
                                    "<p>Matplotlib is one of the most widely used libraries for creating visualizations in Python. It is highly customizable and provides functions for creating a variety of plots, including line charts, bar graphs, histograms, scatter plots, and more. This section covers the basics of creating plots using Matplotlib.</p>\n" +
                                    "\n" +
                                    "<h1>2. Installing Matplotlib</h1>\n" +
                                    "<p>Before you start using Matplotlib, you need to install it. You can install it using pip:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-bash\">\n" +
                                    "pip install matplotlib\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>Once installed, you can import the pyplot module to create plots:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "import matplotlib.pyplot as plt\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h1>3. Creating a Basic Line Plot</h1>\n" +
                                    "<p>The most basic plot you can create with Matplotlib is a line plot. This is useful for visualizing the relationship between two variables.</p>\n" +
                                    "\n" +
                                    "<h3>Example: Plotting a Simple Line Graph:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "import matplotlib.pyplot as plt\n" +
                                    "\n" +
                                    "# Data for plotting\n" +
                                    "x = [1, 2, 3, 4, 5]\n" +
                                    "y = [1, 4, 9, 16, 25]\n" +
                                    "\n" +
                                    "# Create a line plot\n" +
                                    "plt.plot(x, y)\n" +
                                    "\n" +
                                    "# Add a title and labels\n" +
                                    "plt.title(\"Basic Line Plot\")\n" +
                                    "plt.xlabel(\"X Axis\")\n" +
                                    "plt.ylabel(\"Y Axis\")\n" +
                                    "\n" +
                                    "# Display the plot\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>This will create a simple line graph where x values are plotted on the x-axis and y values on the y-axis.</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(17, 6, "Customizing Plots", 2, "<h1>4. Customizing Line Plots</h1>\n" +
                                    "<p>You can customize the appearance of the plot in various ways, such as changing the color, style, and width of the line.</p>\n" +
                                    "\n" +
                                    "<h3>Change Line Color and Style:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "plt.plot(x, y, color='red', linestyle='--', linewidth=2)\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>color='red':</strong> Specifies the color of the line.<br>\n" +
                                    "<strong>linestyle='--':</strong> Creates a dashed line.<br>\n" +
                                    "<strong>linewidth=2:</strong> Sets the thickness of the line.</p>\n" +
                                    "\n" +
                                    "<h3>Add Markers:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "plt.plot(x, y, marker='o', markersize=8, color='blue')\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>marker='o':</strong> Adds circular markers at each data point.<br>\n" +
                                    "<strong>markersize=8:</strong> Adjusts the size of the markers.</p>\n" +
                                    "\n" +
                                    "<h1>5. Bar Plots</h1>\n" +
                                    "<p>Bar plots are useful for comparing quantities across different categories. They can be vertical or horizontal.</p>\n" +
                                    "\n" +
                                    "<h3>Example: Vertical Bar Plot:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "categories = ['A', 'B', 'C', 'D']\n" +
                                    "values = [3, 7, 2, 5]\n" +
                                    "\n" +
                                    "plt.bar(categories, values, color='green')\n" +
                                    "plt.title('Bar Plot Example')\n" +
                                    "plt.xlabel('Categories')\n" +
                                    "plt.ylabel('Values')\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>plt.bar():</strong> Creates a bar plot where categories are the x-axis labels and values are the heights of the bars.</p>\n" +
                                    "\n" +
                                    "<h3>Example: Horizontal Bar Plot:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "plt.barh(categories, values, color='purple')\n" +
                                    "plt.title('Horizontal Bar Plot Example')\n" +
                                    "plt.xlabel('Values')\n" +
                                    "plt.ylabel('Categories')\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>plt.barh():</strong> Creates a horizontal bar plot.</p>\n" +
                                    "\n" +
                                    "<h1>6. Scatter Plots</h1>\n" +
                                    "<p>Scatter plots are used to visualize the relationship between two continuous variables. Each point on the plot represents an individual data point.</p>\n" +
                                    "\n" +
                                    "<h3>Example: Basic Scatter Plot:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "x = [1, 2, 3, 4, 5]\n" +
                                    "y = [5, 4, 3, 2, 1]\n" +
                                    "\n" +
                                    "plt.scatter(x, y, color='orange')\n" +
                                    "plt.title('Scatter Plot Example')\n" +
                                    "plt.xlabel('X Axis')\n" +
                                    "plt.ylabel('Y Axis')\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>plt.scatter():</strong> Creates a scatter plot with x and y data points.</p>\n" +
                                    "\n" +
                                    "<h3>Scatter Plot with Custom Markers:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "plt.scatter(x, y, color='purple', marker='^')  # Triangle markers\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>marker='^':</strong> Specifies triangle markers.</p>\n" +
                                    "\n" +
                                    "<h1>7. Histograms</h1>\n" +
                                    "<p>Histograms are useful for visualizing the distribution of a dataset. They divide the data into bins and count the number of data points in each bin.</p>\n" +
                                    "\n" +
                                    "<h3>Example: Basic Histogram:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "data = [1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5]\n" +
                                    "\n" +
                                    "plt.hist(data, bins=5, color='skyblue', edgecolor='black')\n" +
                                    "plt.title('Histogram Example')\n" +
                                    "plt.xlabel('Data')\n" +
                                    "plt.ylabel('Frequency')\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>bins=5:</strong> Specifies the number of bins to divide the data into.<br>\n" +
                                    "<strong>edgecolor='black':</strong> Adds a border to each bin.</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(18, 6, "Advanced Visualization", 3, "<h1>1. Introduction to Basic Plotting with Matplotlib</h1>\n" +
                                    "<p>Matplotlib is one of the most widely used libraries for creating visualizations in Python. It is highly customizable and provides functions for creating a variety of plots, including line charts, bar graphs, histograms, scatter plots, and more. This section covers the basics of creating plots using Matplotlib.</p>\n" +
                                    "\n" +
                                    "<h1>2. Installing Matplotlib</h1>\n" +
                                    "<p>Before you start using Matplotlib, you need to install it. You can install it using pip:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-bash\">\n" +
                                    "pip install matplotlib\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>Once installed, you can import the pyplot module to create plots:</p>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "import matplotlib.pyplot as plt\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h1>3. Creating a Basic Line Plot</h1>\n" +
                                    "<p>The most basic plot you can create with Matplotlib is a line plot. This is useful for visualizing the relationship between two variables.</p>\n" +
                                    "\n" +
                                    "<h3>Example: Plotting a Simple Line Graph:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "import matplotlib.pyplot as plt\n" +
                                    "\n" +
                                    "# Data for plotting\n" +
                                    "x = [1, 2, 3, 4, 5]\n" +
                                    "y = [1, 4, 9, 16, 25]\n" +
                                    "\n" +
                                    "# Create a line plot\n" +
                                    "plt.plot(x, y)\n" +
                                    "\n" +
                                    "# Add a title and labels\n" +
                                    "plt.title(\"Basic Line Plot\")\n" +
                                    "plt.xlabel(\"X Axis\")\n" +
                                    "plt.ylabel(\"Y Axis\")\n" +
                                    "\n" +
                                    "# Display the plot\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>This will create a simple line graph where x values are plotted on the x-axis and y values on the y-axis.</p>\n" +
                                    "\n" +
                                    "<h1>4. Customizing Line Plots</h1>\n" +
                                    "<p>You can customize the appearance of the plot in various ways, such as changing the color, style, and width of the line.</p>\n" +
                                    "\n" +
                                    "<h3>Change Line Color and Style:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "plt.plot(x, y, color='red', linestyle='--', linewidth=2)\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>color='red':</strong> Specifies the color of the line.<br>\n" +
                                    "<strong>linestyle='--':</strong> Creates a dashed line.<br>\n" +
                                    "<strong>linewidth=2:</strong> Sets the thickness of the line.</p>\n" +
                                    "\n" +
                                    "<h3>Add Markers:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "plt.plot(x, y, marker='o', markersize=8, color='blue')\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>marker='o':</strong> Adds circular markers at each data point.<br>\n" +
                                    "<strong>markersize=8:</strong> Adjusts the size of the markers.</p>\n" +
                                    "\n" +
                                    "<h1>5. Bar Plots</h1>\n" +
                                    "<p>Bar plots are useful for comparing quantities across different categories. They can be vertical or horizontal.</p>\n" +
                                    "\n" +
                                    "<h3>Example: Vertical Bar Plot:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "categories = ['A', 'B', 'C', 'D']\n" +
                                    "values = [3, 7, 2, 5]\n" +
                                    "\n" +
                                    "plt.bar(categories, values, color='green')\n" +
                                    "plt.title('Bar Plot Example')\n" +
                                    "plt.xlabel('Categories')\n" +
                                    "plt.ylabel('Values')\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>plt.bar():</strong> Creates a bar plot where categories are the x-axis labels and values are the heights of the bars.</p>\n" +
                                    "\n" +
                                    "<h3>Example: Horizontal Bar Plot:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "plt.barh(categories, values, color='purple')\n" +
                                    "plt.title('Horizontal Bar Plot Example')\n" +
                                    "plt.xlabel('Values')\n" +
                                    "plt.ylabel('Categories')\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>plt.barh():</strong> Creates a horizontal bar plot.</p>\n" +
                                    "\n" +
                                    "<h1>6. Scatter Plots</h1>\n" +
                                    "<p>Scatter plots are used to visualize the relationship between two continuous variables. Each point on the plot represents an individual data point.</p>\n" +
                                    "\n" +
                                    "<h3>Example: Basic Scatter Plot:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "x = [1, 2, 3, 4, 5]\n" +
                                    "y = [5, 4, 3, 2, 1]\n" +
                                    "\n" +
                                    "plt.scatter(x, y, color='orange')\n" +
                                    "plt.title('Scatter Plot Example')\n" +
                                    "plt.xlabel('X Axis')\n" +
                                    "plt.ylabel('Y Axis')\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>plt.scatter():</strong> Creates a scatter plot with x and y data points.</p>\n" +
                                    "\n" +
                                    "<h3>Scatter Plot with Custom Markers:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "plt.scatter(x, y, color='purple', marker='^')  # Triangle markers\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>marker='^':</strong> Specifies triangle markers.</p>\n" +
                                    "\n" +
                                    "<h1>7. Histograms</h1>\n" +
                                    "<p>Histograms are useful for visualizing the distribution of a dataset. They divide the data into bins and count the number of data points in each bin.</p>\n" +
                                    "\n" +
                                    "<h3>Example: Basic Histogram:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "data = [1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5]\n" +
                                    "\n" +
                                    "plt.hist(data, bins=5, color='skyblue', edgecolor='black')\n" +
                                    "plt.title('Histogram Example')\n" +
                                    "plt.xlabel('Data')\n" +
                                    "plt.ylabel('Frequency')\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>bins=5:</strong> Specifies the number of bins to divide the data into.<br>\n" +
                                    "<strong>edgecolor='black':</strong> Adds a border to each bin.</p>\n" +
                                    "\n" +
                                    "<h1>8. Subplots</h1>\n" +
                                    "<p>Matplotlib allows you to create multiple plots in a single figure using subplots.</p>\n" +
                                    "\n" +
                                    "<h3>Example: Multiple Subplots:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "x = [1, 2, 3, 4, 5]\n" +
                                    "y1 = [1, 4, 9, 16, 25]\n" +
                                    "y2 = [25, 20, 15, 10, 5]\n" +
                                    "\n" +
                                    "fig, (ax1, ax2) = plt.subplots(1, 2)  # 1 row, 2 columns\n" +
                                    "\n" +
                                    "ax1.plot(x, y1, color='blue')\n" +
                                    "ax1.set_title('Plot 1: Line Plot')\n" +
                                    "\n" +
                                    "ax2.plot(x, y2, color='red')\n" +
                                    "ax2.set_title('Plot 2: Line Plot')\n" +
                                    "\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>fig, (ax1, ax2) = plt.subplots():</strong> Creates a figure with multiple axes (subplots).<br>\n" +
                                    "<strong>ax1 and ax2:</strong> Individual axes for each plot.</p>\n" +
                                    "\n" +
                                    "<h1>9. Customizing Plots</h1>\n" +
                                    "<p>Matplotlib provides extensive options to customize your plots, including adding titles, labels, grid lines, legends, and more.</p>\n" +
                                    "\n" +
                                    "<h3>Adding Title, Labels, and Grid:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "x = [1, 2, 3, 4, 5]\n" +
                                    "y = [2, 3, 5, 7, 11]\n" +
                                    "\n" +
                                    "plt.plot(x, y, color='blue')\n" +
                                    "\n" +
                                    "plt.title('Customized Plot')\n" +
                                    "plt.xlabel('X Axis')\n" +
                                    "plt.ylabel('Y Axis')\n" +
                                    "plt.grid(True)  # Add gridlines\n" +
                                    "\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>Adding a Legend:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "x = [1, 2, 3, 4, 5]\n" +
                                    "y1 = [1, 2, 3, 4, 5]\n" +
                                    "y2 = [5, 4, 3, 2, 1]\n" +
                                    "\n" +
                                    "plt.plot(x, y1, label='Line 1', color='blue')\n" +
                                    "plt.plot(x, y2, label='Line 2', color='red')\n" +
                                    "plt.legend()  # Display legend\n" +
                                    "\n" +
                                    "plt.show()\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>label:</strong> Adds labels to the lines.<br>\n" +
                                    "<strong>plt.legend():</strong> Displays the legend.</p>\n" +
                                    "\n" +
                                    "<h1>10. Saving Plots</h1>\n" +
                                    "<p>Once you create a plot, you can save it to a file (e.g., PNG, JPG, PDF) for later use.</p>\n" +
                                    "\n" +
                                    "<h3>Example: Saving a Plot:</h3>\n" +
                                    "\n" +
                                    "<pre><code class=\"language-python\">\n" +
                                    "plt.plot(x, y1, label='Line 1', color='blue')\n" +
                                    "plt.xlabel('X Axis')\n" +
                                    "plt.ylabel('Y Axis')\n" +
                                    "plt.title('Saved Plot')\n" +
                                    "\n" +
                                    "plt.savefig('my_plot.png')  # Save as PNG file\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p><strong>plt.savefig():</strong> Saves the plot to a file.</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(19, 7, "Neurons and Layers", 1, "<h1>1. Introduction to Neurons and Layers in Neural Networks</h1>\n" +
                                    "<p>Neural networks are the backbone of many machine learning and deep learning models. They are composed of interconnected layers of nodes called neurons. Understanding the structure and function of neurons and layers is key to grasping how neural networks learn and make predictions.</p>\n" +
                                    "\n" +
                                    "<h1>2. The Basic Building Block: The Neuron</h1>\n" +
                                    "<p>A neuron in a neural network is a computational unit that takes one or more inputs, processes them, and produces an output. The basic function of a neuron can be understood as a mathematical model that mimics the way biological neurons work.</p>\n" +
                                    "\n" +
                                    "<h2>Neuron Structure:</h2>\n" +
                                    "<p>Each neuron has the following components:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Input:</strong> The inputs are the data or features passed to the neuron. For a simple neural network, these could be values like pixel intensities, numerical values, etc.</li>\n" +
                                    "    <li><strong>Weights (w):</strong> Each input is assigned a weight, which determines the importance of that input to the neuron. These weights are learned during training.</li>\n" +
                                    "    <li><strong>Bias (b):</strong> A bias term is added to the weighted sum of the inputs. This helps the model learn better by shifting the activation function.</li>\n" +
                                    "    <li><strong>Activation Function:</strong> After computing the weighted sum of the inputs and adding the bias, the neuron passes the result through an activation function. This function introduces non-linearity into the model, enabling it to learn more complex patterns. Common activation functions include the sigmoid, ReLU (Rectified Linear Unit), and tanh.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>The Mathematical Expression of a Neuron:</h2>\n" +
                                    "<p>The mathematical model of a neuron can be written as:</p>\n" +
                                    "\n" +
                                    "<p><strong>y = Activation(∑<sub>i=1</sub><sup>n</sup> (x<sub>i</sub> ⋅ w<sub>i</sub>) + b)</strong></p>\n" +
                                    "\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>x<sub>i</sub>:</strong> The inputs to the neuron.</li>\n" +
                                    "    <li><strong>w<sub>i</sub>:</strong> The corresponding weights for each input.</li>\n" +
                                    "    <li><strong>b:</strong> The bias term.</li>\n" +
                                    "    <li>The sum of (x<sub>i</sub> ⋅ w<sub>i</sub>) is passed through the activation function to produce the output y.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(20, 7, "Activation Functions", 2, "<h1>3. Types of Activation Functions</h1>\n" +
                                    "<p>The activation function determines how the output of a neuron is calculated from its input. Some common activation functions are:</p>\n" +
                                    "\n" +
                                    "<h2>Sigmoid:</h2>\n" +
                                    "<p>Maps input values to a range between 0 and 1. Often used in binary classification problems.</p>\n" +
                                    "<p><strong>σ(x) = 1 / (1 + e<sup>-x</sup>)</strong></p>\n" +
                                    "\n" +
                                    "<h2>ReLU (Rectified Linear Unit):</h2>\n" +
                                    "<p>A non-linear activation function that outputs 0 if the input is negative and the input itself if it is positive. ReLU is commonly used in deep learning models because of its efficiency and ability to combat vanishing gradients.</p>\n" +
                                    "<p><strong>ReLU(x) = max(0, x)</strong></p>\n" +
                                    "\n" +
                                    "<h2>Tanh:</h2>\n" +
                                    "<p>Similar to the sigmoid function but maps the input to a range between -1 and 1.</p>\n" +
                                    "<p><strong>tanh(x) = (e<sup>x</sup> - e<sup>-x</sup>) / (e<sup>x</sup> + e<sup>-x</sup>)</strong></p>\n" +
                                    "\n" +
                                    "<p>Each activation function introduces a different type of non-linearity, which is essential for the neural network to learn complex patterns in the data.</p>\n" +
                                    "\n" +
                                    "<h1>4. Layers in Neural Networks</h1>\n" +
                                    "<p>A neural network consists of layers of neurons that work together to process and transform the input data. Layers can be classified into three types:</p>\n" +
                                    "\n" +
                                    "<h2>1. Input Layer</h2>\n" +
                                    "<p>The input layer is the first layer of the neural network, where the raw data enters the model. Each neuron in the input layer represents one feature of the input data. For example, in an image classification problem, each pixel of the image might correspond to one neuron in the input layer.</p>\n" +
                                    "\n" +
                                    "<h2>2. Hidden Layers</h2>\n" +
                                    "<p>The hidden layers are intermediate layers between the input and output layers. These layers perform computations using neurons, and their purpose is to learn complex representations of the data. A neural network can have one or more hidden layers. The number of hidden layers and the number of neurons in each hidden layer are hyperparameters that affect the performance of the model.</p>\n" +
                                    "<p>Each neuron in a hidden layer takes input from the previous layer, performs a weighted sum, applies the activation function, and passes the output to the next layer.</p>\n" +
                                    "\n" +
                                    "<h2>3. Output Layer</h2>\n" +
                                    "<p>The output layer produces the final predictions of the neural network. The number of neurons in the output layer depends on the specific task. For example:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>In a binary classification problem, there will typically be one neuron in the output layer.</li>\n" +
                                    "    <li>In multi-class classification, there will be as many neurons in the output layer as there are classes, with each neuron representing a probability of belonging to a class.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The activation function used in the output layer depends on the task:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Sigmoid:</strong> For binary classification.</li>\n" +
                                    "    <li><strong>Softmax:</strong> For multi-class classification, as it produces a probability distribution over all possible classes.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(21, 7, "Feedforward Network", 3, "<h1>5. Forward Propagation</h1>\n" +
                                    "<p>Forward propagation refers to the process of passing the input data through the layers of the neural network to obtain the output. Here's how it works:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Input Layer:</strong> Data is passed into the input layer, which represents the features of the dataset.</li>\n" +
                                    "    <li><strong>Hidden Layers:</strong> The data is then processed through one or more hidden layers. Each hidden layer computes the weighted sum of its inputs, applies the activation function, and passes the result to the next layer.</li>\n" +
                                    "    <li><strong>Output Layer:</strong> Finally, the processed data reaches the output layer, which produces the prediction.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>6. Example: A Simple Neural Network</h1>\n" +
                                    "<p>Consider a neural network with 1 input layer, 1 hidden layer, and 1 output layer. Here's how the data flows:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Input Layer:</strong> Assume we have 2 input features, <em>x<sub>1</sub></em> and <em>x<sub>2</sub></em>.</li>\n" +
                                    "    <li><strong>Hidden Layer:</strong> The hidden layer has 3 neurons, each with its own set of weights and bias. The output from this layer is passed through an activation function.</li>\n" +
                                    "    <li><strong>Output Layer:</strong> The output layer has 1 neuron, which produces the final prediction.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p>Mathematically, the output for each layer can be computed as:</p>\n" +
                                    "\n" +
                                    "<h2>Hidden Layer:</h2>\n" +
                                    "<p><strong>z<sub>1</sub> = w<sub>1</sub> ⋅ x<sub>1</sub> + w<sub>2</sub> ⋅ x<sub>2</sub> + b<sub>1</sub></strong></p>\n" +
                                    "<p><strong>a<sub>1</sub> = Activation(z<sub>1</sub>)</strong></p>\n" +
                                    "\n" +
                                    "<h2>Output Layer:</h2>\n" +
                                    "<p><strong>z<sub>2</sub> = w<sub>3</sub> ⋅ a<sub>1</sub> + b<sub>2</sub></strong></p>\n" +
                                    "<p><strong>y = Activation(z<sub>2</sub>)</strong></p>\n" +
                                    "\n" +
                                    "<h1>7. Backpropagation and Training the Network</h1>\n" +
                                    "<p>Once the neural network has made a prediction, it is evaluated using a loss function (e.g., Mean Squared Error or Cross-Entropy). The difference between the predicted output and the actual target is used to compute the error.</p>\n" +
                                    "\n" +
                                    "<p>Backpropagation is a method used to adjust the weights and biases of the network based on the error. It works by propagating the error backward through the network, adjusting the parameters using an optimization technique like gradient descent.</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(22, 8, "Backpropagation Overview", 1, "<h1>1. Introduction to Backpropagation</h1>\n" +
                                    "<p>Backpropagation is a key algorithm used to train neural networks. It is responsible for updating the weights and biases of a network by propagating the error backward from the output layer to the input layer. This process allows the network to adjust its parameters (weights and biases) in order to minimize the error and improve its predictions. Backpropagation is an essential part of training a neural network using the gradient descent optimization method.</p>\n" +
                                    "\n" +
                                    "<h1>2. How Backpropagation Works</h1>\n" +
                                    "<p>Backpropagation involves two key phases: Forward Propagation and Backward Propagation. Here's a step-by-step breakdown of how it works.</p>\n" +
                                    "\n" +
                                    "<h2>1. Forward Propagation:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Input:</strong> The input data is passed through the neural network, starting from the input layer, moving through the hidden layers, and reaching the output layer.</li>\n" +
                                    "    <li><strong>Prediction:</strong> Each neuron in the network performs a weighted sum of its inputs, applies an activation function, and passes the output to the next layer. This continues until the output layer produces a prediction.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. Loss Calculation:</h2>\n" +
                                    "<p>The difference between the predicted output and the true target (actual label) is computed using a loss function. The loss function quantifies how far the model's predictions are from the true values. Common loss functions include:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Mean Squared Error (MSE)</strong> for regression tasks.</li>\n" +
                                    "    <li><strong>Cross-Entropy Loss</strong> for classification tasks.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The goal of training is to minimize the loss function, which corresponds to minimizing the error between the predicted and actual outputs.</p>\n" +
                                    "\n" +
                                    "<h2>3. Backward Propagation:</h2>\n" +
                                    "<p>This is where the magic of backpropagation happens. The error is propagated backward through the network, and the gradients of the loss function with respect to the weights and biases are computed.</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Gradient Calculation:</strong> The gradients are calculated using the chain rule of calculus, which allows us to find how much each weight and bias contributed to the error. These gradients tell us how to adjust the weights and biases to reduce the error.</li>\n" +
                                    "    <li><strong>Error Propagation:</strong> The error is propagated backward from the output layer to the input layer. This is done by calculating the derivative of the loss function with respect to the weights and biases of each layer, updating them accordingly.</li>\n" +
                                    "    <li><strong>Weight Update:</strong> The weights and biases are updated using an optimization algorithm like gradient descent. In gradient descent, the weights are adjusted in the opposite direction of the gradient, by a certain learning rate.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(23, 8, "Gradient Descent", 2, "<h1>3. Mathematical Formulation</h1>\n" +
                                    "<p>Let’s break down the math involved in backpropagation:</p>\n" +
                                    "\n" +
                                    "<h2>1. Loss Function:</h2>\n" +
                                    "<p>The first step in backpropagation is to compute the loss (error) using a loss function <em>L(y, y^)</em>, where <em>y</em> is the true value and <em>y^</em> is the predicted value.</p>\n" +
                                    "<p>For example, in a regression task, the Mean Squared Error (MSE) loss is calculated as:</p>\n" +
                                    "<pre>\n" +
                                    "L = (1/2) * (y - y^)²\n" +
                                    "</pre>\n" +
                                    "<p>In a classification task, the Cross-Entropy Loss is often used.</p>\n" +
                                    "\n" +
                                    "<h2>2. Gradient of the Loss:</h2>\n" +
                                    "<p>Next, we compute the gradient of the loss function with respect to each weight and bias in the network. This involves calculating the partial derivatives of the loss function with respect to the weights and biases. The gradient tells us how much a small change in the weights will affect the loss.</p>\n" +
                                    "\n" +
                                    "<p>Let’s take the example of a simple 2-layer neural network:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Output Layer:</strong> The output of the network is <em>y^</em>.</li>\n" +
                                    "    <li><strong>Hidden Layer:</strong> The output of the hidden layer is <em>h</em>.</li>\n" +
                                    "    <li>The weights and biases are denoted by <em>w</em> and <em>b</em>.</li>\n" +
                                    "</ul>\n" +
                                    "<p>Using the chain rule, we compute the gradients as follows:</p>\n" +
                                    "\n" +
                                    "<p>First, calculate the gradient of the loss with respect to the output layer:</p>\n" +
                                    "<pre>\n" +
                                    "∂L / ∂y^ = y^ - y\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<p>Then, calculate the gradient of the loss with respect to the weights of the output layer:</p>\n" +
                                    "<pre>\n" +
                                    "∂L / ∂w2 = (∂L / ∂y^) * (∂y^ / ∂w2)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<p>For the hidden layer, we propagate the gradient backward using the chain rule to calculate the gradients of the hidden layer weights:</p>\n" +
                                    "<pre>\n" +
                                    "∂L / ∂w1 = (∂L / ∂y^) * (∂y^ / ∂h) * (∂h / ∂w1)\n" +
                                    "</pre>\n" +
                                    "<p>The process of backpropagation continues layer by layer, calculating the gradient for each weight and bias in the network.</p>\n" +
                                    "\n" +
                                    "<h2>3. Gradient Descent:</h2>\n" +
                                    "<p>Once the gradients are computed, the weights and biases are updated using an optimization technique like gradient descent:</p>\n" +
                                    "<pre>\n" +
                                    "w = w - η * (∂L / ∂w)\n" +
                                    "</pre>\n" +
                                    "<pre>\n" +
                                    "b = b - η * (∂L / ∂b)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<p>Here:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>η (eta):</strong> The learning rate, which controls the step size in the gradient descent process.</li>\n" +
                                    "    <li><strong>∂L / ∂w:</strong> The gradient of the loss function with respect to the weights.</li>\n" +
                                    "    <li><strong>∂L / ∂b:</strong> The gradient of the loss function with respect to the biases.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Key Steps in Backpropagation:</h2>\n" +
                                    "<ol>\n" +
                                    "    <li><strong>Initialize Weights and Biases:</strong> Start with random initial values for the weights and biases.</li>\n" +
                                    "    <li><strong>Forward Propagation:</strong> Pass the input data through the network and compute the predictions.</li>\n" +
                                    "    <li><strong>Compute the Loss:</strong> Calculate the error between the predicted output and the true target using a loss function.</li>\n" +
                                    "    <li><strong>Backward Propagation:</strong>\n" +
                                    "        <ul>\n" +
                                    "            <li>Calculate the gradients of the loss function with respect to the weights and biases using the chain rule.</li>\n" +
                                    "            <li>Propagate the error backward from the output layer to the input layer.</li>\n" +
                                    "        </ul>\n" +
                                    "    </li>\n" +
                                    "    <li><strong>Update Weights and Biases:</strong> Adjust the weights and biases using gradient descent to minimize the loss.</li>\n" +
                                    "    <li><strong>Repeat:</strong> Repeat the forward and backward propagation steps for many iterations (epochs) until the network converges to an optimal solution.</li>\n" +
                                    "</ol>\n" +
                                    "\n" +
                                    "<h2>5. The Role of Backpropagation in Neural Networks:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Learning:</strong> Backpropagation is the process by which the neural network learns. By updating the weights and biases in each iteration, the network becomes better at making accurate predictions.</li>\n" +
                                    "    <li><strong>Optimization:</strong> It allows the network to optimize the parameters in such a way that the loss function is minimized, improving the performance of the model.</li>\n" +
                                    "    <li><strong>Efficiency:</strong> Backpropagation is an efficient algorithm that enables the training of deep neural networks by allowing the error to be propagated backward through many layers, even in very deep networks.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>6. Challenges and Solutions:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Vanishing Gradients:</strong> In very deep networks, gradients can become very small, which makes it hard for the network to learn. This is known as the vanishing gradient problem. Solutions include using activation functions like ReLU and He initialization for weights.</li>\n" +
                                    "    <li><strong>Exploding Gradients:</strong> Gradients can become very large, causing instability during training. This can be mitigated by gradient clipping and careful weight initialization.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(24, 8, "Learning Rate", 3, "<h1>1. Introduction to Learning Rate</h1>\n" +
                                    "<p>The learning rate is a hyperparameter in machine learning and deep learning that controls how much to change the model’s weights with respect to the loss gradient during each step of the optimization process. Specifically, it determines the size of the step taken in the direction of the gradient during gradient descent (or its variants like stochastic gradient descent).</p>\n" +
                                    "<p>The learning rate plays a crucial role in training neural networks, influencing both the speed and quality of convergence to a minimum in the loss function.</p>\n" +
                                    "\n" +
                                    "<h1>2. Impact of Learning Rate on Training</h1>\n" +
                                    "<p>The learning rate has a direct impact on the optimization process. If it's too small, the network might take a long time to converge, and if it's too large, it might overshoot the optimal point and even lead to divergence.</p>\n" +
                                    "\n" +
                                    "<p>Here’s a breakdown of how different learning rates affect training:</p>\n" +
                                    "\n" +
                                    "<h2>1. Small Learning Rate:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Slow Convergence:</strong> A very small learning rate means the network takes tiny steps in the direction of the gradient. This can lead to a slow convergence, requiring many iterations (or epochs) to reach the minimum of the loss function.</li>\n" +
                                    "    <li><strong>Risk of Getting Stuck:</strong> A small learning rate might prevent the network from escaping local minima or saddle points, especially in complex networks with multiple local minima.</li>\n" +
                                    "    <li><strong>Precision:</strong> The network will make small, gradual changes to weights, which could be beneficial for fine-tuning a model once it's already close to the optimal solution.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Pros:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>More precise adjustments, particularly in later stages of training.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Cons:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Very slow learning, often requiring more epochs and computational resources.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. Large Learning Rate:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Fast but Risky:</strong> A large learning rate makes large updates to the weights, which might help the model converge faster initially, but it can cause the network to overshoot the optimal point.</li>\n" +
                                    "    <li><strong>Divergence:</strong> If the learning rate is too large, the weights can oscillate around the optimal value and may not converge at all. Instead of minimizing the loss, the optimization process may cause the loss to increase over time.</li>\n" +
                                    "    <li><strong>Instability:</strong> Large learning rates can make the model's training unstable and lead to inconsistent results.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Pros:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Faster convergence, especially in the early stages of training.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Cons:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>May lead to overshooting and unstable training.</li>\n" +
                                    "    <li>The network may fail to converge to the optimal solution.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Optimal Learning Rate:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Convergence to Global Minimum:</strong> An optimal learning rate allows the network to converge efficiently while avoiding overshooting or stagnation. It's large enough to speed up training but small enough to prevent instability.</li>\n" +
                                    "    <li><strong>Balanced Updates:</strong> The right learning rate leads to steady, controlled updates to the weights, allowing the model to learn effectively.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Pros:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Balanced convergence.</li>\n" +
                                    "    <li>Faster training without overshooting.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Cons:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Determining the optimal learning rate can require experimentation.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>3. How to Choose the Learning Rate</h1>\n" +
                                    "<p>Choosing the right learning rate is a critical step in training neural networks. Here are some techniques to help choose an appropriate learning rate:</p>\n" +
                                    "\n" +
                                    "<h2>1. Manual Tuning:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Grid Search:</strong> One common method is to manually test different learning rates and observe the training performance. You can experiment with a range of values, typically starting from values like 10<sup>-1</sup>, 10<sup>-2</sup>, and 10<sup>-3</sup>, and adjusting based on performance.</li>\n" +
                                    "    <li><strong>Learning Rate Schedules:</strong> Some practitioners use a learning rate schedule to adjust the learning rate over time. This can include:\n" +
                                    "        <ul>\n" +
                                    "            <li><strong>Step Decay:</strong> Gradually reduce the learning rate at fixed intervals.</li>\n" +
                                    "            <li><strong>Exponential Decay:</strong> Decrease the learning rate exponentially over time.</li>\n" +
                                    "            <li><strong>Cosine Annealing:</strong> Start with a high learning rate and gradually decrease it in a cosine curve.</li>\n" +
                                    "        </ul>\n" +
                                    "    </li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. Learning Rate Finder:</h2>\n" +
                                    "<p>This is a more advanced technique where you start with a very small learning rate and gradually increase it during training. You then plot the loss against the learning rate to identify a \"sweet spot\" where the loss decreases the most rapidly. Once you find this range, you can select a learning rate within that region.</p>\n" +
                                    "\n" +
                                    "<h2>3. Learning Rate Schedulers:</h2>\n" +
                                    "<p>Some modern optimizers (e.g., Adam, RMSprop) have built-in learning rate schedules that adjust the learning rate automatically during training. For example, the Adam optimizer adjusts the learning rate based on estimates of first and second moments of the gradients.</p>\n" +
                                    "\n" +
                                    "<h2>4. Adaptive Learning Rate:</h2>\n" +
                                    "<p>Some algorithms, like Adagrad, RMSprop, and Adam, adapt the learning rate based on the gradient information at each step. This means the learning rate can be larger when the gradient is small and smaller when the gradient is large, potentially speeding up convergence and improving training stability.</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(25, 9, "What is CNN?", 1, "<h1>1. Introduction to Convolutional Neural Networks (CNNs)</h1>\n" +
                                    "<p>A Convolutional Neural Network (CNN) is a specialized type of deep neural network designed for processing data with a grid-like structure, such as images. CNNs have been highly successful in tasks like image classification, object detection, facial recognition, and many other computer vision applications. The core advantage of CNNs is their ability to automatically detect and learn spatial hierarchies in data without the need for manual feature extraction.</p>\n" +
                                    "<p>CNNs are inspired by the visual processing mechanisms in the human brain, where neurons in the visual cortex are responsive to specific regions of the visual field, and they work together to recognize patterns in the images we see.</p>\n" +
                                    "\n" +
                                    "<h1>2. Key Components of a CNN</h1>\n" +
                                    "<p>A CNN consists of several layers that transform input data (such as an image) into useful features. The main layers in a typical CNN include:</p>\n" +
                                    "\n" +
                                    "<h2>1. Convolutional Layer:</h2>\n" +
                                    "<p>The core operation in CNNs is convolution, which involves a mathematical operation where a small filter (also known as a kernel) slides across the input data (such as an image). This filter detects local patterns, such as edges, textures, or simple shapes.</p>\n" +
                                    "<p><strong>Convolution Operation:</strong> The filter performs a dot product between its weights and the input image patch, producing a feature map that highlights regions of the image that match the filter’s learned features.</p>\n" +
                                    "<p><strong>Purpose:</strong> The convolution layer helps the network learn spatial features, such as edges, corners, and textures, that are important for image recognition.</p>\n" +
                                    "<p><strong>Example:</strong> In an image of a cat, early convolutional layers might learn to detect edges or color gradients, while later layers might detect higher-level features like fur patterns or shapes.</p>\n" +
                                    "\n" +
                                    "<h2>2. ReLU (Rectified Linear Unit) Layer:</h2>\n" +
                                    "<p>After the convolution operation, a ReLU activation function is typically applied to introduce non-linearity to the network. This is important because without non-linearity, a CNN would essentially be a linear transformation, limiting its ability to learn complex patterns.</p>\n" +
                                    "<p><strong>ReLU Function:</strong> <code>ReLU(x) = max(0, x)</code>, meaning it outputs the input if it’s positive and zero if it's negative.</p>\n" +
                                    "<p><strong>Purpose:</strong> Introduces non-linearity into the network, enabling it to learn complex patterns.</p>\n" +
                                    "\n" +
                                    "<h2>3. Pooling (Subsampling) Layer:</h2>\n" +
                                    "<p>Pooling is used to reduce the spatial dimensions (height and width) of the feature maps while retaining important information. The most common type of pooling is max pooling, where the maximum value from a specific region of the feature map is selected.</p>\n" +
                                    "<p>Pooling layers help reduce the computational complexity, control overfitting, and improve the model’s generalization ability.</p>\n" +
                                    "<p><strong>Types of Pooling:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Max Pooling:</strong> Takes the maximum value from each patch of the feature map.</li>\n" +
                                    "    <li><strong>Average Pooling:</strong> Computes the average value from each patch of the feature map.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Purpose:</strong> Reduces dimensionality and computational load, while retaining important features.</p>\n" +
                                    "\n" +
                                    "<h2>4. Fully Connected (FC) Layer:</h2>\n" +
                                    "<p>After several convolutional and pooling layers, the CNN typically includes one or more fully connected layers (dense layers), where each neuron is connected to every neuron in the previous layer. These layers perform high-level reasoning by combining features learned in earlier layers.</p>\n" +
                                    "<p>The fully connected layers are typically used for classification tasks, where the final output is a probability distribution over different classes.</p>\n" +
                                    "<p><strong>Purpose:</strong> Combines features extracted in previous layers and maps them to the output space (e.g., class labels).</p>\n" +
                                    "\n" +
                                    "<h2>5. Softmax Layer:</h2>\n" +
                                    "<p>In the final layer, a softmax function is often applied to output a probability distribution over the different possible classes (in classification problems).</p>\n" +
                                    "<p>The softmax function ensures that the sum of the output probabilities is 1, which allows us to interpret the output as a probability for each class.</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(26, 9, "Convolutional Layers", 2, "<h1>3. How CNNs Work</h1>\n" +
                                    "<p>CNNs operate by learning filters (also called kernels) that capture different features at various levels of abstraction. The layers of the network work together in the following manner:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Early Layers (Convolution + ReLU):</strong> Detect low-level features such as edges, textures, and simple shapes.</li>\n" +
                                    "    <li><strong>Intermediate Layers (Convolution + ReLU):</strong> Combine low-level features to detect more complex patterns, like parts of objects (e.g., eyes or wheels).</li>\n" +
                                    "    <li><strong>Later Layers (Convolution + ReLU):</strong> Detect high-level concepts like objects or specific patterns (e.g., a cat’s face or a car).</li>\n" +
                                    "    <li><strong>Fully Connected Layer:</strong> Combine these high-level features for final prediction (e.g., classifying the image as a \"cat\" or \"dog\").</li>\n" +
                                    "    <li><strong>Output:</strong> Use a softmax function to output probabilities for each possible class.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>4. Advantages of CNNs</h1>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Automatic Feature Extraction:</strong> Unlike traditional machine learning techniques where features have to be manually engineered, CNNs can automatically learn relevant features directly from raw data (e.g., pixels in an image).</li>\n" +
                                    "    <li><strong>Translation Invariance:</strong> CNNs can detect features no matter where they appear in the input. For example, a cat can be recognized in different positions within an image.</li>\n" +
                                    "    <li><strong>Parameter Sharing:</strong> Instead of learning separate parameters for each location in the input, CNNs use the same filter across the entire input, significantly reducing the number of parameters and computational complexity.</li>\n" +
                                    "    <li><strong>Handling Large Inputs:</strong> CNNs are highly efficient at handling large inputs (like high-resolution images), thanks to their hierarchical structure, where complex features are built from simpler ones.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>5. Applications of CNNs</h1>\n" +
                                    "<p>CNNs are primarily used in the following domains:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Image Classification:</strong> Categorizing images into predefined classes (e.g., identifying whether an image contains a dog or a cat).</li>\n" +
                                    "    <li><strong>Object Detection:</strong> Detecting and localizing multiple objects within an image (e.g., detecting faces or vehicles in an image).</li>\n" +
                                    "    <li><strong>Image Segmentation:</strong> Classifying each pixel in an image into a category, which is used in applications like medical imaging (e.g., detecting tumors in MRI scans).</li>\n" +
                                    "    <li><strong>Video Analysis:</strong> Understanding actions and events in videos (e.g., activity recognition or gesture recognition).</li>\n" +
                                    "    <li><strong>Facial Recognition:</strong> Identifying or verifying individuals based on facial features.</li>\n" +
                                    "    <li><strong>Natural Language Processing:</strong> Though typically used in computer vision, CNNs have also found applications in processing text for tasks such as sentiment analysis and document classification.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(27, 9, "Pooling Layers", 3, "<h1>1. Introduction to Pooling Layers</h1>\n" +
                                    "<p>In Convolutional Neural Networks (CNNs), a pooling layer is used to reduce the spatial dimensions (height and width) of the feature maps while retaining the most important information. Pooling helps to decrease the computational load, reduce the number of parameters, and prevent overfitting, making the model more efficient and robust.</p>\n" +
                                    "<p>The key idea behind pooling is that by reducing the spatial size, the model becomes less sensitive to small translations, rotations, or distortions in the input image. Pooling layers are placed between convolutional layers and help progressively reduce the spatial size of the data.</p>\n" +
                                    "\n" +
                                    "<h1>2. Purpose of Pooling Layers</h1>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Dimensionality Reduction:</strong> Pooling reduces the size of the feature maps, which helps in reducing the number of parameters and computations in the network, thereby speeding up the training process.</li>\n" +
                                    "    <li><strong>Invariance to Translation:</strong> Pooling makes the model more invariant to small translations in the input, meaning that the CNN can recognize patterns in different positions within the image.</li>\n" +
                                    "    <li><strong>Preventing Overfitting:</strong> By summarizing the information and reducing the complexity of the feature maps, pooling layers help to prevent the network from overfitting to the training data.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>3. Types of Pooling Layers</h1>\n" +
                                    "<p>There are several types of pooling operations, but the two most commonly used are max pooling and average pooling.</p>\n" +
                                    "\n" +
                                    "<h2>1. Max Pooling</h2>\n" +
                                    "<p>Max pooling is the most widely used pooling operation in CNNs. In max pooling, the input feature map is divided into non-overlapping rectangular regions (called windows), and for each region, the maximum value is selected. This operation is useful because it retains the most prominent features in the feature map, such as edges or textures.</p>\n" +
                                    "<p><strong>Example:</strong> Suppose we have a 2x2 region in the feature map:</p>\n" +
                                    "<pre>\n" +
                                    "1  3\n" +
                                    "2  4\n" +
                                    "</pre>\n" +
                                    "<p>After max pooling (with a 2x2 window), the result would be:</p>\n" +
                                    "<pre>\n" +
                                    "4\n" +
                                    "</pre>\n" +
                                    "<p><strong>Why it works:</strong> Max pooling captures the most significant activations from the feature map, which helps preserve the key features for object recognition.</p>\n" +
                                    "\n" +
                                    "<h2>2. Average Pooling</h2>\n" +
                                    "<p>Average pooling works similarly to max pooling, but instead of selecting the maximum value, it computes the average of all values in the pooling region. This method retains more information than max pooling, but it is less likely to highlight the most prominent features.</p>\n" +
                                    "<p><strong>Example:</strong> Consider the same 2x2 region:</p>\n" +
                                    "<pre>\n" +
                                    "1  3\n" +
                                    "2  4\n" +
                                    "</pre>\n" +
                                    "<p>After average pooling (with a 2x2 window), the result would be:</p>\n" +
                                    "<pre>\n" +
                                    "(1+3+2+4) / 4 = 2.5\n" +
                                    "</pre>\n" +
                                    "<p><strong>Why it works:</strong> Average pooling can help preserve the overall pattern, but it might smooth out important features, making it less effective in certain applications compared to max pooling.</p>\n" +
                                    "\n" +
                                    "<h2>3. Global Pooling</h2>\n" +
                                    "<p>Global pooling reduces each feature map to a single value. It is typically used at the end of the CNN to summarize the entire feature map. Common types include Global Max Pooling (selecting the maximum value from the entire feature map) and Global Average Pooling (calculating the average of all the values in the feature map).</p>\n" +
                                    "<p>Global pooling is often used in architectures where we want to reduce the output to a fixed size (for example, for use in fully connected layers).</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(28, 10, "Random Forests", 1, "<h1>1. Introduction to Random Forests</h1>\n" +
                                    "<p>Random Forests is an ensemble learning method that uses a collection (or \"forest\") of decision trees to improve the accuracy and robustness of predictive models. It is widely used for both classification and regression tasks. A random forest model aggregates the predictions from multiple decision trees to produce a final result, typically by voting for classification or averaging for regression.</p>\n" +
                                    "<p>The primary strength of random forests lies in their ability to reduce overfitting (which is common in individual decision trees) and increase prediction accuracy through the combined output of many diverse models.</p>\n" +
                                    "\n" +
                                    "<h1>2. Key Concepts in Random Forests</h1>\n" +
                                    "\n" +
                                    "<h2>1. Ensemble Learning</h2>\n" +
                                    "<p>Random Forests are an example of an ensemble learning method, where multiple models (decision trees) are trained and their predictions are aggregated to make a final decision. The idea is that by combining multiple trees, the model is more likely to produce a correct prediction compared to individual decision trees, especially when some trees might make errors.</p>\n" +
                                    "\n" +
                                    "<h2>2. Decision Trees in a Forest</h2>\n" +
                                    "<p>Each individual tree in a random forest is a decision tree—a flowchart-like structure used for classification or regression. Each node in the tree represents a decision based on an attribute of the data, and the leaves represent the final prediction (class label or value). Unlike a single decision tree that might overfit to training data, random forests reduce overfitting by averaging multiple trees' results.</p>\n" +
                                    "\n" +
                                    "<h2>3. Bagging (Bootstrap Aggregating)</h2>\n" +
                                    "<p>Random Forests use bagging (Bootstrap Aggregating), where each tree is trained on a random subset of the data. These subsets are created by randomly selecting data points with replacement (meaning some data points may appear multiple times in a subset, while others may be left out). Bagging helps to reduce variance and prevent overfitting, as each tree is trained on a slightly different version of the dataset.</p>\n" +
                                    "\n" +
                                    "<h2>4. Feature Randomness</h2>\n" +
                                    "<p>In addition to random subsets of the data, Random Forests also introduce randomness in the feature selection. When splitting a node, each tree considers only a random subset of features rather than all available features. This further reduces correlation between the trees, promoting diversity and improving the overall model's performance.</p>\n" +
                                    "\n" +
                                    "<h1>3. How Random Forests Work</h1>\n" +
                                    "<p>The process of training and making predictions with a random forest follows these steps:</p>\n" +
                                    "\n" +
                                    "<h2>1. Bootstrap Sampling</h2>\n" +
                                    "<p>From the original dataset, generate multiple random samples (with replacement). Each sample is used to train an individual decision tree.</p>\n" +
                                    "\n" +
                                    "<h2>2. Training Decision Trees</h2>\n" +
                                    "<p>For each bootstrap sample, a decision tree is trained using the training data. When training each tree, at every node, a random subset of features is selected. The best feature from this subset is used to split the node. This process introduces diversity among the trees in the forest.</p>\n" +
                                    "\n" +
                                    "<h2>3. Voting for Classification</h2>\n" +
                                    "<p>In classification tasks, each tree in the forest predicts a class label for a given input. The final prediction for a given input is determined by majority voting. The class label that most trees predict is chosen as the final output.</p>\n" +
                                    "\n" +
                                    "<h2>4. Averaging for Regression</h2>\n" +
                                    "<p>In regression tasks, the trees in the forest predict a continuous value. The final output is the average of all the predicted values from each tree.</p>\n" +
                                    "\n" +
                                    "<h1>4. Advantages of Random Forests</h1>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>High Accuracy:</strong> Random Forests often deliver high accuracy because they combine multiple weak models (decision trees) to create a stronger overall model.</li>\n" +
                                    "    <li><strong>Handles Overfitting:</strong> By aggregating predictions from multiple trees and introducing randomness both in data and features, random forests are less prone to overfitting compared to individual decision trees.</li>\n" +
                                    "    <li><strong>Works Well with Imbalanced Data:</strong> Random forests can handle imbalanced datasets better than many other models, as the randomness and bagging process reduce bias toward the majority class.</li>\n" +
                                    "    <li><strong>Feature Importance:</strong> Random Forests can be used to assess the importance of different features in predicting the target variable. Features that contribute more to reducing impurity in the trees are considered more important.</li>\n" +
                                    "    <li><strong>Robust to Noise:</strong> Random Forests are less sensitive to noise in the data compared to single decision trees, as the ensemble approach helps to smooth out the impact of noisy or anomalous data points.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>5. Disadvantages of Random Forests</h1>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Complexity and Interpretability:</strong> While decision trees are easy to interpret, Random Forests are more like \"black boxes.\" Since they consist of many trees, it is difficult to visualize or interpret the model’s decision-making process in a simple way.</li>\n" +
                                    "    <li><strong>Computationally Intensive:</strong> Random Forests can be computationally expensive, especially when dealing with large datasets and many trees. Training a large number of trees and performing predictions on large datasets can require substantial time and memory.</li>\n" +
                                    "    <li><strong>Slower Predictions:</strong> Since predictions require aggregating the outputs of multiple trees, Random Forests can be slower at making predictions compared to simpler models, such as individual decision trees.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(29, 10, "Gradient Boosting", 2, "<h1>1. Introduction to Gradient Boosting</h1>\n" +
                                    "<p>Gradient Boosting is an ensemble learning technique that builds models sequentially, where each new model attempts to correct the errors made by the previous ones. The goal is to convert weak learners (typically decision trees) into a strong learner by combining their outputs. The method focuses on reducing the model's bias and variance, leading to improved predictive performance.</p>\n" +
                                    "<p>Unlike Random Forests, which train multiple models independently (in parallel), Gradient Boosting builds trees sequentially and uses the errors (or residuals) of the previous trees to guide the learning of the next tree.</p>\n" +
                                    "\n" +
                                    "<h1>2. Key Concepts in Gradient Boosting</h1>\n" +
                                    "\n" +
                                    "<h2>1. Ensemble Learning</h2>\n" +
                                    "<p>Gradient Boosting is an ensemble technique, meaning it combines multiple models (trees) to produce a final output. However, unlike other ensemble methods (e.g., Random Forest), the models in Gradient Boosting are trained sequentially, where each model tries to improve on the previous one.</p>\n" +
                                    "\n" +
                                    "<h2>2. Weak Learners</h2>\n" +
                                    "<p>In Gradient Boosting, the individual models are typically decision trees, but they are not full trees. These are known as weak learners because they don't perform well individually but can be combined to make strong predictions.</p>\n" +
                                    "\n" +
                                    "<h2>3. Residuals/Errors</h2>\n" +
                                    "<p>The key idea behind Gradient Boosting is that each new tree is trained to predict the residuals (errors) of the previous tree’s predictions. Essentially, the new tree tries to correct the mistakes made by the model in earlier iterations.</p>\n" +
                                    "\n" +
                                    "<h2>4. Gradient Descent</h2>\n" +
                                    "<p>Gradient Boosting uses the gradient descent optimization technique to minimize the residual errors. It does this by fitting each successive tree to the negative gradient of the loss function, hence the name \"gradient boosting.\" The process of updating models is akin to how gradient descent is used in other machine learning algorithms, where each update moves in the direction that reduces the error.</p>\n" +
                                    "\n" +
                                    "<h1>3. How Gradient Boosting Works</h1>\n" +
                                    "<p>The process of training and making predictions with Gradient Boosting follows these steps:</p>\n" +
                                    "\n" +
                                    "<h2>1. Initial Model (First Tree)</h2>\n" +
                                    "<p>Start with an initial model, which could simply predict the mean of the target variable (for regression) or a constant value (for classification).</p>\n" +
                                    "\n" +
                                    "<h2>2. Compute Residuals (Errors)</h2>\n" +
                                    "<p>After the first tree is built, compute the residuals (i.e., the difference between the true values and the predicted values from the first tree).</p>\n" +
                                    "\n" +
                                    "<h2>3. Fit New Tree to Residuals</h2>\n" +
                                    "<p>Train a second decision tree to predict the residuals (errors) of the first tree’s predictions.</p>\n" +
                                    "\n" +
                                    "<h2>4. Update Predictions</h2>\n" +
                                    "<p>Add the predictions of the second tree to the first tree's predictions. This improves the model by reducing the residuals.</p>\n" +
                                    "\n" +
                                    "<h2>5. Iterate</h2>\n" +
                                    "<p>Repeat steps 2–4 for a set number of iterations or until the model performance stops improving. Each new tree is fitted to the residuals (errors) of the combined predictions from all the previous trees, and their predictions are added together to form the final model.</p>\n" +
                                    "\n" +
                                    "<h2>6. Final Model</h2>\n" +
                                    "<p>The final prediction is the sum of the predictions from all the trees, adjusted by the learning rate.</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(30, 10, "XGBoost", 3, "<h1>1. Introduction to XGBoost</h1>\n" +
                                    "<p>XGBoost (Extreme Gradient Boosting) is a highly efficient and scalable implementation of the Gradient Boosting algorithm. It has become one of the most popular machine learning algorithms, particularly in competitive machine learning environments (like Kaggle) and for real-world applications. XGBoost was designed to address the shortcomings of traditional Gradient Boosting methods, such as computation time, overfitting, and handling of missing data.</p>\n" +
                                    "<p>XGBoost stands out because it includes advanced features like regularization, parallelization, and the use of tree pruning, making it more powerful and faster than other gradient boosting methods.</p>\n" +
                                    "\n" +
                                    "<h1>2. Key Features of XGBoost</h1>\n" +
                                    "\n" +
                                    "<h2>1. Gradient Boosting Framework</h2>\n" +
                                    "<p>XGBoost follows the same principle as Gradient Boosting, where models (typically decision trees) are trained sequentially to correct the errors of previous models. The algorithm combines weak learners to create a strong predictive model. It focuses on minimizing a loss function using gradient descent, where each new tree is trained to predict the residuals (errors) of the combined predictions from previous trees.</p>\n" +
                                    "\n" +
                                    "<h2>2. Regularization</h2>\n" +
                                    "<p>One of the key improvements in XGBoost over traditional Gradient Boosting is the introduction of L1 (Lasso) and L2 (Ridge) regularization. This helps control overfitting by penalizing overly complex trees. Regularization ensures that the model generalizes better to unseen data, making XGBoost less prone to overfitting compared to other boosting methods.</p>\n" +
                                    "\n" +
                                    "<h2>3. Tree Pruning</h2>\n" +
                                    "<p>XGBoost uses a technique called Max Depth and Pre-pruning for tree building, which stops the tree from growing when further splits do not add value. Traditional Gradient Boosting typically grows the trees fully and then prunes them, but XGBoost does this in a more efficient manner during the tree-building process itself.</p>\n" +
                                    "\n" +
                                    "<h2>4. Handling Missing Data</h2>\n" +
                                    "<p>XGBoost has built-in functionality to handle missing values during training. It can learn which direction (left or right) is optimal when splitting a node even when some data points have missing values.</p>\n" +
                                    "\n" +
                                    "<h2>5. Parallelization</h2>\n" +
                                    "<p>Unlike traditional Gradient Boosting, which builds trees sequentially, XGBoost allows for parallelization of tree construction. It performs the computation of gradients and updates in parallel, improving speed significantly.</p>\n" +
                                    "\n" +
                                    "<h2>6. Scalability</h2>\n" +
                                    "<p>XGBoost is designed to scale well with large datasets. It supports both distributed computing environments and GPU acceleration for training models, making it one of the fastest boosting algorithms available.</p>\n" +
                                    "\n" +
                                    "<h1>3. How XGBoost Works</h1>\n" +
                                    "<p>XGBoost builds upon the standard Gradient Boosting algorithm but adds several optimizations. Here’s a simplified breakdown of how XGBoost works:</p>\n" +
                                    "\n" +
                                    "<h2>1. Initial Model</h2>\n" +
                                    "<p>Start with a base model. In regression tasks, this is often just the average of the target values. In classification tasks, it’s typically the log-odds of the classes.</p>\n" +
                                    "\n" +
                                    "<h2>2. Compute Residuals</h2>\n" +
                                    "<p>After the first model is trained, compute the residuals (errors) between the true labels and the predicted values.</p>\n" +
                                    "\n" +
                                    "<h2>3. Train New Trees on Residuals</h2>\n" +
                                    "<p>Build a decision tree that predicts the residuals (errors) from the previous model’s predictions. Each tree is added sequentially, and its predictions are added to the combined predictions from previous trees.</p>\n" +
                                    "\n" +
                                    "<h2>4. Update with Regularization</h2>\n" +
                                    "<p>XGBoost applies regularization to each tree during the training process to prevent overfitting. Both L1 and L2 regularization penalize the complexity of the trees.</p>\n" +
                                    "\n" +
                                    "<h2>5. Optimize with Gradient Descent</h2>\n" +
                                    "<p>The model uses gradient descent to minimize the residuals. The gradient (or direction) is computed based on the loss function and is used to update the parameters of the model (the decision trees).</p>\n" +
                                    "\n" +
                                    "<h2>6. Final Prediction</h2>\n" +
                                    "<p>After a specified number of trees (or iterations), the final prediction is the combined output from all trees. For regression, this is the sum of the predicted values from all trees. For classification, this is typically the majority vote (in classification problems).</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(31, 11, "Overfitting and Underfitting", 1, "<h1>1. Introduction to Overfitting and Underfitting</h1>\n" +
                                    "<p>In machine learning, overfitting and underfitting are two common problems that can negatively affect the performance of a model. Both arise from different types of errors in the learning process and are crucial to understand when developing machine learning models.</p>\n" +
                                    "<p>Overfitting occurs when a model learns too much from the training data, including the noise or random fluctuations, leading to poor performance on unseen data.</p>\n" +
                                    "<p>Underfitting happens when the model is too simple to capture the underlying patterns of the data, resulting in poor performance both on the training set and the test set.</p>\n" +
                                    "<p>Understanding and balancing these two concepts is key to building accurate and generalizable models.</p>\n" +
                                    "\n" +
                                    "<h1>2. What is Overfitting?</h1>\n" +
                                    "<p>Overfitting happens when a model learns not only the underlying patterns in the training data but also the noise or random fluctuations. This means the model becomes too tailored to the training data, capturing specific details that do not generalize to new, unseen data.</p>\n" +
                                    "\n" +
                                    "<h2>How Overfitting Occurs:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Complexity of the Model:</strong> When a model is too complex, it can create overly detailed rules that fit the training data very well, but fail to generalize to new data.</li>\n" +
                                    "    <li><strong>Too Many Features:</strong> Including irrelevant or unnecessary features can lead to overfitting because the model may pick up on patterns that don’t truly exist in the broader population.</li>\n" +
                                    "    <li><strong>Insufficient Data:</strong> When the dataset is small, the model might \"memorize\" the training data rather than learning the true patterns.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Signs of Overfitting:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>High accuracy on the training set but poor performance on the test set or validation set.</li>\n" +
                                    "    <li>The model may have very high variance — small changes in the input data lead to large fluctuations in predictions.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Example:</h2>\n" +
                                    "<p>Imagine a regression model predicting house prices. If the model is too complex, it might start memorizing specific details about the training houses (e.g., individual features like specific neighborhood quirks or weather conditions during open houses), leading to poor predictions when applied to new data.</p>\n" +
                                    "\n" +
                                    "<h1>3. What is Underfitting?</h1>\n" +
                                    "<p>Underfitting occurs when a model is too simple to capture the underlying structure of the data. The model fails to learn the important relationships between the features and the target variable, resulting in poor performance on both the training and testing data.</p>\n" +
                                    "\n" +
                                    "<h2>How Underfitting Occurs:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Too Simple Model:</strong> A model with too few parameters or one that makes overly simplistic assumptions may not be flexible enough to learn the data’s true patterns.</li>\n" +
                                    "    <li><strong>High Bias:</strong> Underfitting is often associated with high bias, where the model makes strong assumptions about the data that may not be true.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Signs of Underfitting:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>Both training and test set performance are poor.</li>\n" +
                                    "    <li>The model's predictions are too simple or inaccurate, and it shows low variance (the model’s predictions do not change much with different inputs).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Example:</h2>\n" +
                                    "<p>In the same housing price prediction task, if you use a linear regression model with just one feature (e.g., the number of rooms) to predict house prices, the model might be too simplistic and unable to capture the full range of factors (such as location, age of the house, etc.), leading to poor performance on both training and test data.</p>\n" +
                                    "\n" +
                                    "<h1>4. The Bias-Variance Tradeoff</h1>\n" +
                                    "<p>The concepts of overfitting and underfitting are closely related to the bias-variance tradeoff, a fundamental concept in machine learning that helps explain the behavior of models as their complexity increases.</p>\n" +
                                    "\n" +
                                    "<h2>Bias</h2>\n" +
                                    "<p>Bias refers to errors due to overly simplistic assumptions made by the model. A model with high bias may underfit the data because it’s not flexible enough to learn the true patterns.</p>\n" +
                                    "\n" +
                                    "<h2>Variance</h2>\n" +
                                    "<p>Variance refers to the model’s sensitivity to small changes in the training data. A model with high variance can lead to overfitting because it learns to fit the noise in the data rather than the true signal.</p>\n" +
                                    "\n" +
                                    "<p>The goal in machine learning is to find a balance between bias and variance:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>High bias → Underfitting:</strong> simple models, too much assumption</li>\n" +
                                    "    <li><strong>High variance → Overfitting:</strong> complex models, too much flexibility</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p>Ideally, you want a model with low bias and low variance, meaning it makes accurate predictions without being too sensitive to the noise in the training data.</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(32, 11, "L1 and L2 Regularization", 2, "<h1>1. Introduction to L1 and L2 Regularization</h1>\n" +
                                    "<p>Regularization techniques are crucial in machine learning to prevent overfitting, ensuring that the model generalizes well to unseen data. Two common regularization methods are L1 Regularization and L2 Regularization. Both techniques add a penalty to the loss function, discouraging the model from fitting the noise in the data by controlling the complexity of the model.</p>\n" +
                                    "<p>L1 Regularization is also known as Lasso Regularization.</p>\n" +
                                    "<p>L2 Regularization is also known as Ridge Regularization.</p>\n" +
                                    "<p>These techniques help balance the model's ability to fit the data and its ability to generalize to new, unseen data.</p>\n" +
                                    "\n" +
                                    "<h1>2. What is L1 Regularization (Lasso)?</h1>\n" +
                                    "<p>L1 Regularization adds a penalty equal to the absolute value of the coefficients to the loss function. This penalty term forces some of the model’s coefficients to become exactly zero, effectively removing some features from the model.</p>\n" +
                                    "\n" +
                                    "<h2>Mathematical Formulation:</h2>\n" +
                                    "<p>For a linear regression model with weights <code>w1, w2, ..., wn</code>, the L1 regularized cost function is:</p>\n" +
                                    "<pre>\n" +
                                    "J(w) = Loss Function + λ ∑ |wi|\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Loss Function:</strong> The typical loss function (e.g., Mean Squared Error for regression).</li>\n" +
                                    "    <li><strong>λ:</strong> The regularization parameter that controls the strength of the penalty.</li>\n" +
                                    "    <li><strong>|wi|:</strong> The absolute value of the weight.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Key Characteristics of L1 Regularization:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Feature Selection:</strong> L1 regularization can result in sparse models, where some feature weights are exactly zero. This property is particularly useful when we suspect that only a small subset of features is important, effectively performing feature selection.</li>\n" +
                                    "    <li><strong>Sparsity:</strong> Lasso (L1 regularization) tends to produce models that use fewer features because it drives some coefficients to zero, making it easier to interpret.</li>\n" +
                                    "    <li><strong>Promotes Simplicity:</strong> L1 regularization can lead to simpler models that are less prone to overfitting.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>When to Use L1 Regularization:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>When you have many features and suspect that only a subset of them is useful for making predictions.</li>\n" +
                                    "    <li>When you want to perform automatic feature selection.</li>\n" +
                                    "    <li>In problems with high-dimensional datasets (many features).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>3. What is L2 Regularization (Ridge)?</h1>\n" +
                                    "<p>L2 Regularization adds a penalty equal to the square of the coefficients to the loss function. This penalty discourages large coefficients but does not force them to become exactly zero, unlike L1 regularization. L2 regularization helps keep the model weights small and evenly distributed, making it more stable.</p>\n" +
                                    "\n" +
                                    "<h2>Mathematical Formulation:</h2>\n" +
                                    "<p>For a linear regression model, the L2 regularized cost function is:</p>\n" +
                                    "<pre>\n" +
                                    "J(w) = Loss Function + λ ∑ wi²\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Loss Function:</strong> The usual loss function (e.g., Mean Squared Error).</li>\n" +
                                    "    <li><strong>λ:</strong> The regularization parameter that controls the penalty's strength.</li>\n" +
                                    "    <li><strong>wi²:</strong> The square of the weight.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Key Characteristics of L2 Regularization:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>No Feature Selection:</strong> L2 regularization doesn’t set coefficients to exactly zero. Instead, it shrinks them towards zero, encouraging smaller weights across the model.</li>\n" +
                                    "    <li><strong>Smoothness:</strong> L2 regularization is good at handling situations where many small effects exist. It spreads the model's complexity over multiple features, preventing overfitting while keeping all features in the model.</li>\n" +
                                    "    <li><strong>Stable Solutions:</strong> Because L2 regularization doesn’t eliminate features, it is less likely to result in an overly simplified or underfit model.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>When to Use L2 Regularization:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>When you want to reduce overfitting but keep all features in the model.</li>\n" +
                                    "    <li>When you believe that most features are relevant and should be included in the model, but you want to constrain their influence.</li>\n" +
                                    "    <li>When working with datasets where multicollinearity (correlated features) might be an issue.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>4. L1 vs. L2 Regularization</h1>\n" +
                                    "<p>Both L1 and L2 regularization have the goal of reducing overfitting by penalizing large coefficients, but they achieve this in different ways and have distinct properties:</p>\n" +
                                    "\n" +
                                    "<table border=\"1\">\n" +
                                    "    <tr>\n" +
                                    "        <th>Feature</th>\n" +
                                    "        <th>L1 Regularization (Lasso)</th>\n" +
                                    "        <th>L2 Regularization (Ridge)</th>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td><strong>Penalty term</strong></td>\n" +
                                    "        <td>Sum of the absolute values of the coefficients (∑ |wi|)</td>\n" +
                                    "        <td>Sum of the squares of the coefficients (∑ wi²)</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td><strong>Effect on coefficients</strong></td>\n" +
                                    "        <td>Some coefficients become exactly zero, leading to feature selection.</td>\n" +
                                    "        <td>Coefficients are shrunk towards zero but do not become exactly zero.</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td><strong>Use case</strong></td>\n" +
                                    "        <td>Feature selection, high-dimensional datasets with irrelevant features.</td>\n" +
                                    "        <td>Handling multicollinearity, keeping all features, improving model stability.</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td><strong>Sparse solution</strong></td>\n" +
                                    "        <td>Produces sparse models (some features are eliminated).</td>\n" +
                                    "        <td>Produces dense models (all features are retained).</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td><strong>Interpretability</strong></td>\n" +
                                    "        <td>Easier to interpret due to fewer non-zero features.</td>\n" +
                                    "        <td>Less interpretable, since it retains all features.</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td><strong>Computational cost</strong></td>\n" +
                                    "        <td>Can be computationally expensive for large datasets.</td>\n" +
                                    "        <td>Generally more efficient than L1 in large datasets.</td>\n" +
                                    "    </tr>\n" +
                                    "</table>\n" +
                                    "\n" +
                                    "<h1>5. Combined Approach: Elastic Net Regularization</h1>\n" +
                                    "<p>In practice, sometimes a combination of both L1 and L2 regularization is used. This is known as Elastic Net regularization, which combines the strengths of both methods. The Elastic Net regularization term is:</p>\n" +
                                    "<pre>\n" +
                                    "J(w) = Loss Function + λ1 ∑ |wi| + λ2 ∑ wi²\n" +
                                    "</pre>\n" +
                                    "<p>Where <strong>λ1</strong> and <strong>λ2</strong> control the strength of L1 and L2 regularization, respectively. Elastic Net is useful when there are correlations between features and is often used when both feature selection and regularization are needed.</p>\n" +
                                    "\n" +
                                    "<h1>6. Choosing the Right Regularization Technique</h1>\n" +
                                    "<p><strong>Use L1 Regularization (Lasso) when:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>You believe only a subset of features are important.</li>\n" +
                                    "    <li>You want the model to perform feature selection and produce sparse solutions.</li>\n" +
                                    "    <li>You want to improve interpretability by reducing the number of features.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Use L2 Regularization (Ridge) when:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>You believe most features are relevant and should be retained.</li>\n" +
                                    "    <li>You want to prevent overfitting by shrinking coefficients without eliminating features.</li>\n" +
                                    "    <li>You are dealing with multicollinearity and want to improve the stability of your model.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p><strong>Use Elastic Net Regularization when:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>You have many correlated features.</li>\n" +
                                    "    <li>You want the benefits of both L1 and L2 regularization, such as feature selection and model stability.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>7. Impact of Regularization Parameter (λ)</h1>\n" +
                                    "<p>The regularization strength is controlled by the parameter <strong>λ</strong>, also known as the regularization coefficient. This parameter determines the weight of the penalty term:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Small λ:</strong> A small regularization parameter means the penalty term has little impact on the loss function, and the model will be more flexible. This can lead to overfitting if the model becomes too complex.</li>\n" +
                                    "    <li><strong>Large λ:</strong> A large regularization parameter means the penalty term has a stronger influence on the loss function, which can shrink the coefficients too much and lead to underfitting.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The optimal value of <strong>λ</strong> is usually determined through techniques like cross-validation.</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(33, 11, "Hyperparameter Tuning", 3, "<h1>1. Introduction to Hyperparameter Tuning</h1>\n" +
                                    "<p>In machine learning, hyperparameters are parameters that are set before training a model and control the learning process. These parameters cannot be learned directly from the data (unlike model parameters such as weights in neural networks).</p>\n" +
                                    "\n" +
                                    "<p>Examples of hyperparameters include:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Learning rate for gradient descent</li>\n" +
                                    "    <li>Number of trees in a Random Forest</li>\n" +
                                    "    <li>Depth of a decision tree</li>\n" +
                                    "    <li>Regularization strength (e.g., in Lasso or Ridge regression)</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p>Hyperparameter tuning refers to the process of selecting the best combination of hyperparameters that will lead to the best performance of the model. This is crucial because a well-tuned model can significantly outperform an untuned one.</p>\n" +
                                    "\n" +
                                    "<p>Two popular techniques for hyperparameter tuning are GridSearchCV and RandomizedSearchCV.</p>\n" +
                                    "\n" +
                                    "<h1>2. What is GridSearchCV?</h1>\n" +
                                    "<p>GridSearchCV (Grid Search Cross Validation) is an exhaustive search method that evaluates all possible combinations of hyperparameters within a given grid. It is called \"grid\" search because the hyperparameters are arranged in a grid, and the search process tries every possible combination.</p>\n" +
                                    "\n" +
                                    "<h2>How GridSearchCV Works:</h2>\n" +
                                    "<ol>\n" +
                                    "    <li>You define a grid of hyperparameter values.</li>\n" +
                                    "    <li>GridSearchCV trains the model for every possible combination of hyperparameters in the grid.</li>\n" +
                                    "    <li>Cross-validation is used to evaluate the model’s performance on different subsets of the training data, ensuring that the evaluation is not biased by any single subset.</li>\n" +
                                    "    <li>The combination of hyperparameters that results in the best cross-validation score is selected.</li>\n" +
                                    "</ol>\n" +
                                    "\n" +
                                    "<h2>Example:</h2>\n" +
                                    "<p>Suppose you are tuning a decision tree and want to search for the best <strong>max_depth</strong> and <strong>min_samples_split</strong> hyperparameters. You could define a grid as:</p>\n" +
                                    "<pre>\n" +
                                    "max_depth: [2, 4, 6, 8]\n" +
                                    "min_samples_split: [2, 5, 10]\n" +
                                    "</pre>\n" +
                                    "<p>GridSearchCV will train the model for each combination of these values:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>(max_depth=2, min_samples_split=2)</li>\n" +
                                    "    <li>(max_depth=2, min_samples_split=5)</li>\n" +
                                    "    <li>(max_depth=2, min_samples_split=10)</li>\n" +
                                    "    <li>(max_depth=4, min_samples_split=2), and so on.</li>\n" +
                                    "</ul>\n" +
                                    "<p>GridSearchCV performs an exhaustive search, meaning it will evaluate all possible combinations.</p>\n" +
                                    "\n" +
                                    "<h2>Pros of GridSearchCV:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>Exhaustive search ensures you try all combinations in the specified grid, so you don't miss the optimal set of hyperparameters.</li>\n" +
                                    "    <li>Cross-validation gives a more reliable estimate of performance by splitting the data into multiple training and validation sets.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Cons of GridSearchCV:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>Computationally expensive: The method can be slow, especially if the grid is large or the model takes time to train.</li>\n" +
                                    "    <li>It doesn’t work well when the number of hyperparameters is very large, as the search space grows exponentially.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>3. What is RandomizedSearchCV?</h1>\n" +
                                    "<p>RandomizedSearchCV is another method for hyperparameter tuning, but instead of evaluating all possible combinations, it samples a fixed number of hyperparameter combinations from a specified distribution. This method allows for faster exploration of hyperparameter spaces by evaluating a random subset of all possible combinations.</p>\n" +
                                    "\n" +
                                    "<h2>How RandomizedSearchCV Works:</h2>\n" +
                                    "<ol>\n" +
                                    "    <li>You specify the range or distribution for each hyperparameter.</li>\n" +
                                    "    <li>RandomizedSearchCV then samples a given number of hyperparameter combinations at random from these ranges.</li>\n" +
                                    "    <li>It evaluates these random combinations using cross-validation and returns the combination that results in the best performance.</li>\n" +
                                    "</ol>\n" +
                                    "\n" +
                                    "<h2>Example:</h2>\n" +
                                    "<p>You want to tune a Random Forest model, and you decide that the following hyperparameters should be sampled:</p>\n" +
                                    "<pre>\n" +
                                    "n_estimators: [50, 100, 200, 300]\n" +
                                    "max_depth: [None, 10, 20, 30]\n" +
                                    "min_samples_split: [2, 5, 10]\n" +
                                    "</pre>\n" +
                                    "<p>Instead of trying all combinations (as GridSearchCV does), RandomizedSearchCV will sample a specified number (e.g., 10 combinations) from this space, train the model for each, and return the best-performing set of hyperparameters.</p>\n" +
                                    "\n" +
                                    "<h2>Pros of RandomizedSearchCV:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>Faster: Because it samples a fixed number of combinations, it is faster than GridSearchCV, especially when the hyperparameter space is large.</li>\n" +
                                    "    <li>Better for large search spaces: In cases where you have many hyperparameters with large possible values, RandomizedSearchCV can provide a good estimate of the optimal set of hyperparameters without needing to evaluate every single combination.</li>\n" +
                                    "    <li>Less computational cost: Can save computation time, especially in models that are computationally expensive to train.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Cons of RandomizedSearchCV:</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>Not exhaustive: There is no guarantee that RandomizedSearchCV will find the optimal hyperparameters, since it only samples a subset of the possible combinations.</li>\n" +
                                    "    <li>Randomness: The results might vary between runs, as the method selects hyperparameters at random.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>4. Comparison Between GridSearchCV and RandomizedSearchCV</h1>\n" +
                                    "<table border=\"1\">\n" +
                                    "    <tr>\n" +
                                    "        <th>Feature</th>\n" +
                                    "        <th>GridSearchCV</th>\n" +
                                    "        <th>RandomizedSearchCV</th>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td><strong>Search Method</strong></td>\n" +
                                    "        <td>Exhaustive (searches all combinations)</td>\n" +
                                    "        <td>Random sampling from a range/distribution</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td><strong>Computation Time</strong></td>\n" +
                                    "        <td>Can be slow (exponential growth in combinations)</td>\n" +
                                    "        <td>Faster (evaluates fewer combinations)</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td><strong>Search Space</strong></td>\n" +
                                    "        <td>Fixed set of hyperparameter combinations</td>\n" +
                                    "        <td>Flexible range or distribution of values</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td><strong>Best for</strong></td>\n" +
                                    "        <td>Small hyperparameter search space</td>\n" +
                                    "        <td>Large search space or when computational resources are limited</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td><strong>Guarantees Optimality</strong></td>\n" +
                                    "        <td>Yes (if the grid is fine enough)</td>\n" +
                                    "        <td>No (only samples a subset of possible combinations)</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td><strong>Cross-Validation</strong></td>\n" +
                                    "        <td>Yes (uses cross-validation)</td>\n" +
                                    "        <td>Yes (uses cross-validation)</td>\n" +
                                    "    </tr>\n" +
                                    "</table>\n" +
                                    "\n" +
                                    "<h1>5. Hyperparameter Tuning Example</h1>\n" +
                                    "<p>Let’s walk through an example of hyperparameter tuning using both GridSearchCV and RandomizedSearchCV on a RandomForestClassifier.</p>\n" +
                                    "\n" +
                                    "<h2>Example with GridSearchCV:</h2>\n" +
                                    "<pre>\n" +
                                    "from sklearn.model_selection import GridSearchCV\n" +
                                    "from sklearn.ensemble import RandomForestClassifier\n" +
                                    "from sklearn.datasets import load_iris\n" +
                                    "\n" +
                                    "# Load dataset\n" +
                                    "X, y = load_iris(return_X_y=True)\n" +
                                    "\n" +
                                    "# Define the model\n" +
                                    "rf = RandomForestClassifier()\n" +
                                    "\n" +
                                    "# Define the parameter grid\n" +
                                    "param_grid = {\n" +
                                    "    'n_estimators': [50, 100, 200],\n" +
                                    "    'max_depth': [None, 10, 20],\n" +
                                    "    'min_samples_split': [2, 5]\n" +
                                    "}\n" +
                                    "\n" +
                                    "# Perform GridSearchCV\n" +
                                    "grid_search = GridSearchCV(estimator=rf, param_grid=param_grid, cv=5, n_jobs=-1)\n" +
                                    "grid_search.fit(X, y)\n" +
                                    "\n" +
                                    "# Best parameters and score\n" +
                                    "print(\"Best parameters found: \", grid_search.best_params_)\n" +
                                    "print(\"Best cross-validation score: \", grid_search.best_score_)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>Example with RandomizedSearchCV:</h2>\n" +
                                    "<pre>\n" +
                                    "from sklearn.model_selection import RandomizedSearchCV\n" +
                                    "from sklearn.ensemble import RandomForestClassifier\n" +
                                    "from sklearn.datasets import load_iris\n" +
                                    "from scipy.stats import randint\n" +
                                    "\n" +
                                    "# Load dataset\n" +
                                    "X, y = load_iris(return_X_y=True)\n" +
                                    "\n" +
                                    "# Define the model\n" +
                                    "rf = RandomForestClassifier()\n" +
                                    "\n" +
                                    "# Define the parameter distribution\n" +
                                    "param_dist = {\n" +
                                    "    'n_estimators': randint(50, 200),\n" +
                                    "    'max_depth': [None, 10, 20, 30],\n" +
                                    "    'min_samples_split': [2, 5, 10]\n" +
                                    "}\n" +
                                    "\n" +
                                    "# Perform RandomizedSearchCV\n" +
                                    "random_search = RandomizedSearchCV(estimator=rf, param_distributions=param_dist, n_iter=10, cv=5, n_jobs=-1)\n" +
                                    "random_search.fit(X, y)\n" +
                                    "\n" +
                                    "# Best parameters and score\n" +
                                    "print(\"Best parameters found: \", random_search.best_params_)\n" +
                                    "print(\"Best cross-validation score: \", random_search.best_score_)\n" +
                                    "</pre>\n", "2024-11-02", "2024-11-02")
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
                            Unit(34, 12, "Advanced K-Nearest Neighbors", 1, "<h1>1. Introduction to Advanced K-Nearest Neighbors (KNN)</h1>\n" +
                                    "<p>K-Nearest Neighbors (KNN) is one of the simplest and most intuitive algorithms for classification and regression. The algorithm works by finding the k nearest training examples in the feature space and making predictions based on their majority label (in classification) or average value (in regression).</p>\n" +
                                    "\n" +
                                    "<p>While the basic KNN algorithm is easy to understand and implement, there are several advanced techniques and considerations that can improve its performance, particularly for complex datasets. In this module, we will explore several advanced aspects of KNN for classification, including:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Distance metrics and weight functions</li>\n" +
                                    "    <li>Dimensionality reduction techniques</li>\n" +
                                    "    <li>Choosing the optimal value of k</li>\n" +
                                    "    <li>Efficient search algorithms for large datasets</li>\n" +
                                    "    <li>Handling imbalanced datasets</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>2. Advanced Distance Metrics in KNN</h1>\n" +
                                    "<p>KNN relies on a distance metric to find the closest neighbors. The most commonly used distance metric is the Euclidean distance, but for many datasets, other distance metrics might be more appropriate. Some of the advanced distance metrics include:</p>\n" +
                                    "\n" +
                                    "<h2>2.1. Manhattan Distance (L1 Norm)</h2>\n" +
                                    "<p>Manhattan distance is the sum of the absolute differences of the coordinates. It is useful when the features are not isotropic or have a large variance.</p>\n" +
                                    "<pre>\n" +
                                    "d(x, y) = ∑<sub>i=1</sub><sup>n</sup> |x<sub>i</sub> - y<sub>i</sub>|\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>2.2. Minkowski Distance</h2>\n" +
                                    "<p>The Minkowski distance is a generalization of both the Euclidean and Manhattan distances. It is defined as:</p>\n" +
                                    "<pre>\n" +
                                    "d(x, y) = (∑<sub>i=1</sub><sup>n</sup> |x<sub>i</sub> - y<sub>i</sub>|<sup>p</sup>)<sup>1/p</sup>\n" +
                                    "</pre>\n" +
                                    "<p>When p = 2, it becomes the Euclidean distance, and when p = 1, it becomes the Manhattan distance. Choosing the right value of p can help tune the sensitivity of KNN to outliers.</p>\n" +
                                    "\n" +
                                    "<h2>2.3. Cosine Similarity</h2>\n" +
                                    "<p>Cosine similarity measures the cosine of the angle between two vectors. It is particularly useful when the magnitude of the vectors does not matter (e.g., text data represented as word vectors or TF-IDF scores).</p>\n" +
                                    "<pre>\n" +
                                    "Cosine Similarity = (x ⋅ y) / (||x|| ||y||)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>2.4. Hamming Distance</h2>\n" +
                                    "<p>Hamming distance is used when the features are categorical, particularly for string or binary data. It counts the number of positions at which two strings or binary vectors differ.</p>\n" +
                                    "<pre>\n" +
                                    "d(x, y) = ∑<sub>i=1</sub><sup>n</sup> I(x<sub>i</sub> ≠ y<sub>i</sub>)\n" +
                                    "</pre>\n" +
                                    "<p>Choosing the appropriate distance metric is critical, especially when dealing with diverse datasets, as it affects the performance of the KNN algorithm.</p>\n" +
                                    "\n" +
                                    "<h1>3. Weighting Neighbors in KNN</h1>\n" +
                                    "<p>In the basic KNN algorithm, each neighbor contributes equally to the final prediction. However, in some cases, it may be beneficial to give more weight to closer neighbors, since they are more likely to be similar to the query point. This is known as distance-weighted KNN.</p>\n" +
                                    "\n" +
                                    "<h2>3.1. Inverse Distance Weighting (IDW)</h2>\n" +
                                    "<p>One common approach is to give more weight to neighbors that are closer. The weight for each neighbor can be calculated using the inverse of the distance:</p>\n" +
                                    "<pre>\n" +
                                    "w<sub>i</sub> = 1 / d(x, x<sub>i</sub>)\n" +
                                    "</pre>\n" +
                                    "<p>Where d(x, x<sub>i</sub>) is the distance between the query point x and the neighbor x<sub>i</sub>. This way, closer neighbors have higher influence on the final decision.</p>\n" +
                                    "\n" +
                                    "<h2>3.2. Gaussian Weighting</h2>\n" +
                                    "<p>In some cases, you may want to use a Gaussian function to weight the neighbors. This can be especially useful when dealing with noisy data or outliers. The weight for a neighbor can be computed as:</p>\n" +
                                    "<pre>\n" +
                                    "w<sub>i</sub> = e<sup>-d(x, x<sub>i</sub>)<sup>2</sup> / (2σ<sup>2</sup>)</sup>\n" +
                                    "</pre>\n" +
                                    "<p>Where σ is a parameter that controls the spread of the Gaussian distribution.</p>\n" +
                                    "\n" +
                                    "<p>By adjusting the weighting function, KNN can become more sensitive to local patterns in the data.</p>\n" +
                                    "\n" +
                                    "<h1>4. Dimensionality Reduction for KNN</h1>\n" +
                                    "<p>One of the challenges with KNN, especially for high-dimensional data, is the curse of dimensionality. As the number of dimensions (features) increases, the distance between points becomes less meaningful, making it harder for KNN to differentiate between neighbors.</p>\n" +
                                    "\n" +
                                    "<p>To mitigate this, dimensionality reduction techniques can be applied before running KNN to reduce the number of features. Common techniques include:</p>\n" +
                                    "\n" +
                                    "<h2>4.1. Principal Component Analysis (PCA)</h2>\n" +
                                    "<p>PCA is a technique that reduces the dimensionality of the data while retaining as much variance as possible. By projecting the data into a lower-dimensional space, KNN can be more effective in high-dimensional spaces.</p>\n" +
                                    "\n" +
                                    "<h2>4.2. t-Distributed Stochastic Neighbor Embedding (t-SNE)</h2>\n" +
                                    "<p>While t-SNE is typically used for visualization of high-dimensional data, it can also help KNN in understanding the local structure of data in lower-dimensional space. However, t-SNE is computationally expensive, so it’s best used in small to medium-sized datasets.</p>\n" +
                                    "\n" +
                                    "<h2>4.3. Linear Discriminant Analysis (LDA)</h2>\n" +
                                    "<p>LDA is a supervised dimensionality reduction method that attempts to maximize the separability of the classes in the reduced space. It works well when the classes in the data are distinct and well-separated.</p>\n" +
                                    "\n" +
                                    "<p>Reducing dimensionality can improve both the accuracy and efficiency of the KNN algorithm, especially in cases with many irrelevant or correlated features.</p>\n" +
                                    "\n" +
                                    "<h1>5. Choosing the Optimal Value of k</h1>\n" +
                                    "<p>The choice of k, the number of nearest neighbors, is crucial for the performance of the KNN algorithm. A small value of k makes the model sensitive to noise (overfitting), while a large value of k makes it too smooth (underfitting).</p>\n" +
                                    "\n" +
                                    "<h2>5.1. Cross-Validation for Optimal k</h2>\n" +
                                    "<p>The most common method for selecting k is to use cross-validation. By splitting the data into training and validation sets, you can evaluate the model's performance for different values of k.</p>\n" +
                                    "\n" +
                                    "<p>For example:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Try values of k ranging from 1 to 20.</li>\n" +
                                    "    <li>Train and evaluate the model using cross-validation.</li>\n" +
                                    "    <li>Select the k that gives the best validation accuracy.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5.2. Rule of Thumb for k</h2>\n" +
                                    "<p>A simple rule of thumb is to choose k as the square root of the number of training samples (n), but this may need to be adjusted based on the dataset’s complexity.</p>\n" +
                                    "\n" +
                                    "<h2>5.3. Odd vs. Even k</h2>\n" +
                                    "<p>For binary classification, it is usually recommended to choose an odd value for k to avoid ties in the voting process (since ties can cause uncertainty in the prediction).</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(35, 12, "Support Vector Machine Advanced", 2, "<h1>1. Introduction to Advanced Support Vector Machines (SVM)</h1>\n" +
                                    "<p>Support Vector Machines (SVM) are powerful supervised learning models used for classification and regression tasks. The basic SVM algorithm is based on finding a hyperplane that best separates the classes in the feature space. However, SVMs have many advanced concepts that can significantly improve their performance and applicability, especially for complex datasets.</p>\n" +
                                    "<p>In this module, we will explore advanced concepts of SVM, including:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Kernel methods for handling non-linear data</li>\n" +
                                    "    <li>Hyperparameter tuning to optimize SVM performance</li>\n" +
                                    "    <li>Support Vector Regression (SVR)</li>\n" +
                                    "    <li>Handling imbalanced classes</li>\n" +
                                    "    <li>Advanced optimization techniques in SVM</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. Kernel Methods in SVM</h2>\n" +
                                    "<p>One of the key strengths of SVM is its ability to use kernel functions to handle non-linearly separable data. The kernel trick allows SVM to implicitly map data into higher-dimensional spaces, where a linear hyperplane can be used for classification.</p>\n" +
                                    "\n" +
                                    "<h3>2.1. Linear Kernel</h3>\n" +
                                    "<p>The simplest kernel is the linear kernel, which does not transform the data and assumes the data is already linearly separable:</p>\n" +
                                    "<pre>\n" +
                                    "K(x, y) = x ⋅ y\n" +
                                    "</pre>\n" +
                                    "<p>It is suitable for data that is already linearly separable or close to it.</p>\n" +
                                    "\n" +
                                    "<h3>2.2. Polynomial Kernel</h3>\n" +
                                    "<p>The polynomial kernel maps the data into a higher-dimensional space using polynomial functions. It is useful when the decision boundary is a polynomial curve:</p>\n" +
                                    "<pre>\n" +
                                    "K(x, y) = (x ⋅ y + c)^d\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>c is a constant</li>\n" +
                                    "    <li>d is the degree of the polynomial</li>\n" +
                                    "</ul>\n" +
                                    "<p>This kernel can capture complex, curved decision boundaries.</p>\n" +
                                    "\n" +
                                    "<h3>2.3. Radial Basis Function (RBF) Kernel (Gaussian Kernel)</h3>\n" +
                                    "<p>The RBF kernel is one of the most commonly used kernels in SVM. It maps the data into an infinite-dimensional space and can handle highly non-linear data. The kernel function is:</p>\n" +
                                    "<pre>\n" +
                                    "K(x, y) = e^(- ||x - y||² / (2 * σ²))\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>σ (gamma) is a hyperparameter that controls the width of the Gaussian distribution.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The RBF kernel can create highly flexible decision boundaries, making it suitable for complex datasets.</p>\n" +
                                    "\n" +
                                    "<h3>2.4. Sigmoid Kernel</h3>\n" +
                                    "<p>The sigmoid kernel is based on the sigmoid function used in neural networks:</p>\n" +
                                    "<pre>\n" +
                                    "K(x, y) = tanh(α * (x ⋅ y) + c)\n" +
                                    "</pre>\n" +
                                    "<p>Where α and c are user-defined parameters. This kernel behaves similarly to a neural network with a single layer.</p>\n" +
                                    "\n" +
                                    "<h3>2.5. Choosing the Right Kernel</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Linear kernel:</strong> Use when the data is linearly separable.</li>\n" +
                                    "    <li><strong>Polynomial kernel:</strong> Suitable for datasets with polynomial decision boundaries.</li>\n" +
                                    "    <li><strong>RBF kernel:</strong> Best for datasets with complex, non-linear boundaries.</li>\n" +
                                    "    <li><strong>Sigmoid kernel:</strong> Rarely used but can be effective for certain types of data with a neural network-like decision boundary.</li>\n" +
                                    "</ul>\n" +
                                    "<p>Choosing the right kernel is essential for ensuring SVM performs well on your dataset. Often, a kernel that provides better flexibility (such as RBF) will outperform a linear kernel, but at the cost of increased computational complexity.</p>\n" +
                                    "\n" +
                                    "<h2>3. Hyperparameter Tuning in SVM</h2>\n" +
                                    "<p>SVM models have several important hyperparameters that need to be tuned to optimize performance. Key hyperparameters include:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>C (Regularization parameter)</li>\n" +
                                    "    <li>Gamma (for RBF kernel)</li>\n" +
                                    "    <li>Kernel choice</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>3.1. The Regularization Parameter C</h3>\n" +
                                    "<p>The parameter C controls the trade-off between achieving a low error on the training data and maintaining a large margin between the classes. A small value of C allows for more margin violations (errors), leading to a simpler model with more generalization. A large value of C focuses on minimizing errors but may lead to overfitting.</p>\n" +
                                    "\n" +
                                    "<h3>3.2. The Gamma Parameter</h3>\n" +
                                    "<p>The gamma parameter controls the influence of a single training example on the decision boundary. A small gamma value means that the influence of each data point is spread out, resulting in a smoother decision boundary. A large gamma value results in a model that fits the training data more closely, potentially leading to overfitting.</p>\n" +
                                    "\n" +
                                    "<h3>3.3. Grid Search for Hyperparameter Tuning</h3>\n" +
                                    "<p>One common method to find the best combination of hyperparameters is grid search. It involves testing various combinations of parameters and selecting the combination that yields the best model performance on the validation set.</p>\n" +
                                    "\n" +
                                    "<h2>4. Support Vector Regression (SVR)</h2>\n" +
                                    "<p>Support Vector Regression (SVR) is an adaptation of SVM for regression tasks. It is used to predict continuous values rather than categorical classes. The goal of SVR is to find a function that approximates the true underlying relationship in the data, while maintaining a margin of tolerance (epsilon).</p>\n" +
                                    "<p>The SVR model works by mapping the input data to a higher-dimensional space and then fitting the regression function that minimizes the error within a specified margin.</p>\n" +
                                    "\n" +
                                    "<h3>4.1. The SVR Objective</h3>\n" +
                                    "<p>The objective of SVR is to find a function that approximates the data points, but any data points within the margin are ignored (not penalized). This makes SVR robust to outliers, as long as they fall outside the margin.</p>\n" +
                                    "\n" +
                                    "<h3>4.2. The Epsilon Margin</h3>\n" +
                                    "<p>The epsilon margin defines the tolerance zone around the regression function where no penalty is applied to errors. Points within this margin do not contribute to the loss function, making SVR less sensitive to small deviations.</p>\n" +
                                    "\n" +
                                    "<h2>5. Handling Imbalanced Classes in SVM</h2>\n" +
                                    "<p>In classification tasks, SVM may struggle when the classes are imbalanced. That is, when one class significantly outnumbers the other. Several techniques can be used to address this issue:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Class Weighting:</strong> Assign higher weights to the minority class to make it more important in the optimization process.</li>\n" +
                                    "    <li><strong>Oversampling the Minority Class:</strong> Duplicate instances from the minority class to balance the dataset.</li>\n" +
                                    "    <li><strong>Undersampling the Majority Class:</strong> Remove some instances from the majority class to balance the dataset.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>6. Advanced Optimization Techniques in SVM</h2>\n" +
                                    "<p>Optimizing SVMs can involve advanced techniques to improve training efficiency and model performance:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>SMO (Sequential Minimal Optimization):</strong> A popular algorithm used to solve the quadratic programming problem efficiently in SVMs.</li>\n" +
                                    "    <li><strong>Linear Programming:</strong> Used to optimize the parameters for linearly separable cases.</li>\n" +
                                    "    <li><strong>Stochastic Gradient Descent (SGD):</strong> An alternative method used for optimization in large-scale datasets.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(36, 12, "Handling Imbalanced Data", 3, "<h1>Introduction to Handling Imbalanced Data</h1>\n" +
                                    "<p>Imbalanced datasets are common in many real-world classification problems, where one class (the majority class) has significantly more instances than the other class (the minority class). This imbalance can lead to poor performance in machine learning models, as they tend to be biased toward predicting the majority class. Therefore, handling imbalanced data is critical for building robust models, especially in scenarios like fraud detection, disease prediction, or spam classification.</p>\n" +
                                    "<p>In this module, we will cover various techniques to handle imbalanced datasets in classification, including:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Resampling methods (oversampling and undersampling)</li>\n" +
                                    "    <li>Synthetic data generation (e.g., SMOTE)</li>\n" +
                                    "    <li>Cost-sensitive learning</li>\n" +
                                    "    <li>Evaluation metrics for imbalanced datasets</li>\n" +
                                    "    <li>Algorithmic adjustments</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. Resampling Methods</h2>\n" +
                                    "<p>Resampling is one of the most common strategies to address imbalanced datasets. It involves modifying the dataset to balance the class distribution before training the model.</p>\n" +
                                    "\n" +
                                    "<h3>2.1. Oversampling the Minority Class</h3>\n" +
                                    "<p>Oversampling involves increasing the number of instances in the minority class, typically by duplicating existing instances or generating new ones. This method helps the classifier better learn the minority class patterns.</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Random Oversampling: Randomly duplicates examples from the minority class.</li>\n" +
                                    "    <li>SMOTE (Synthetic Minority Over-sampling Technique): Creates synthetic examples by interpolating between existing minority class instances. It helps generate more varied instances rather than simply duplicating the data.</li>\n" +
                                    "</ul>\n" +
                                    "<h4>Example of Random Oversampling using imblearn:</h4>\n" +
                                    "<pre><code>\n" +
                                    "from imblearn.over_sampling import RandomOverSampler\n" +
                                    "\n" +
                                    "ros = RandomOverSampler(random_state=42)\n" +
                                    "X_resampled, y_resampled = ros.fit_resample(X_train, y_train)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h4>Example of SMOTE using imblearn:</h4>\n" +
                                    "<pre><code>\n" +
                                    "from imblearn.over_sampling import SMOTE\n" +
                                    "\n" +
                                    "smote = SMOTE(random_state=42)\n" +
                                    "X_resampled, y_resampled = smote.fit_resample(X_train, y_train)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>2.2. Undersampling the Majority Class</h3>\n" +
                                    "<p>Undersampling reduces the number of instances from the majority class to match the number of instances in the minority class. While this can help balance the dataset, it may lead to the loss of valuable data, especially in cases where the majority class contains many relevant examples.</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Random Undersampling: Randomly removes instances from the majority class until the class distribution is balanced.</li>\n" +
                                    "</ul>\n" +
                                    "<h4>Example of Random Undersampling using imblearn:</h4>\n" +
                                    "<pre><code>\n" +
                                    "from imblearn.under_sampling import RandomUnderSampler\n" +
                                    "\n" +
                                    "rus = RandomUnderSampler(random_state=42)\n" +
                                    "X_resampled, y_resampled = rus.fit_resample(X_train, y_train)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>2.3. Combined Over- and Under-sampling</h3>\n" +
                                    "<p>A balanced approach can be achieved by applying both oversampling to the minority class and undersampling to the majority class. This approach allows for better use of available data without heavily reducing the majority class.</p>\n" +
                                    "<h4>Example of Combined Sampling using imblearn:</h4>\n" +
                                    "<pre><code>\n" +
                                    "from imblearn.combine import SMOTEENN\n" +
                                    "\n" +
                                    "smote_enn = SMOTEENN(random_state=42)\n" +
                                    "X_resampled, y_resampled = smote_enn.fit_resample(X_train, y_train)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>3. Synthetic Data Generation (SMOTE)</h2>\n" +
                                    "<p>SMOTE (Synthetic Minority Over-sampling Technique) is an advanced oversampling technique that creates synthetic samples rather than duplicating existing instances. It works by selecting two or more similar instances from the minority class and creating new synthetic samples by interpolation.</p>\n" +
                                    "\n" +
                                    "<p>How SMOTE works: For each instance in the minority class, SMOTE selects a certain number of nearest neighbors, and new synthetic data points are created by randomly choosing one of the neighbors and generating a point between the two.</p>\n" +
                                    "<h4>Example of SMOTE in imblearn:</h4>\n" +
                                    "<pre><code>\n" +
                                    "from imblearn.over_sampling import SMOTE\n" +
                                    "\n" +
                                    "smote = SMOTE(sampling_strategy='auto', random_state=42)\n" +
                                    "X_resampled, y_resampled = smote.fit_resample(X_train, y_train)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<p>Advantages: SMOTE reduces the risk of overfitting (compared to random oversampling) and helps the model generalize better by generating diverse synthetic samples.</p>\n" +
                                    "<p>Challenges: SMOTE may increase the likelihood of noise being introduced into the model, especially when the minority class instances are already noisy or misclassified.</p>\n" +
                                    "\n" +
                                    "<h2>4. Cost-sensitive Learning</h2>\n" +
                                    "<p>Cost-sensitive learning involves adjusting the learning algorithm to penalize misclassifications of the minority class more heavily than misclassifications of the majority class. This can be done by modifying the algorithm’s loss function or introducing class weights to prioritize the minority class.</p>\n" +
                                    "\n" +
                                    "<h3>4.1. Weighted Loss Function</h3>\n" +
                                    "<p>Most classification algorithms support a class_weight parameter that allows the assignment of higher weights to the minority class. This adjusts the decision threshold and encourages the model to pay more attention to the minority class during training.</p>\n" +
                                    "\n" +
                                    "<h4>Example in Logistic Regression:</h4>\n" +
                                    "<pre><code>\n" +
                                    "from sklearn.linear_model import LogisticRegression\n" +
                                    "\n" +
                                    "model = LogisticRegression(class_weight='balanced', random_state=42)\n" +
                                    "model.fit(X_train, y_train)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>4.2. Weighted SVM</h3>\n" +
                                    "<p>In Support Vector Machines (SVM), the class_weight parameter can also be used to adjust the importance of the minority class. This allows the SVM to focus on minimizing the classification error for the minority class.</p>\n" +
                                    "<pre><code>\n" +
                                    "from sklearn.svm import SVC\n" +
                                    "\n" +
                                    "model = SVC(class_weight='balanced', random_state=42)\n" +
                                    "model.fit(X_train, y_train)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h3>4.3. Cost-sensitive Random Forests and Decision Trees</h3>\n" +
                                    "<p>Random Forests and Decision Trees also allow the use of class weights for imbalanced datasets. This can be done by setting the class_weight='balanced' parameter, ensuring that the algorithm focuses more on correctly classifying the minority class.</p>\n" +
                                    "<pre><code>\n" +
                                    "from sklearn.ensemble import RandomForestClassifier\n" +
                                    "\n" +
                                    "model = RandomForestClassifier(class_weight='balanced', random_state=42)\n" +
                                    "model.fit(X_train, y_train)\n" +
                                    "</code></pre>\n" +
                                    "\n" +
                                    "<h2>5. Evaluation Metrics for Imbalanced Datasets</h2>\n" +
                                    "<p>When dealing with imbalanced datasets, traditional evaluation metrics like accuracy can be misleading. Instead, focus on metrics that better reflect the performance on the minority class.</p>\n" +
                                    "\n" +
                                    "<h3>5.1. Precision, Recall, and F1-Score</h3>\n" +
                                    "<p><strong>Precision:</strong> Measures the proportion of positive predictions that are correct. It is important when the cost of false positives is high.</p>\n" +
                                    "<p><strong>Recall:</strong> Measures the proportion of actual positives that are correctly identified. It is important when the cost of false negatives is high.</p>\n" +
                                    "<p><strong>F1-Score:</strong> The harmonic mean of precision and recall. It balances both metrics, making it a good overall measure of model performance.</p>\n" +
                                    "\n" +
                                    "<h4>Formulas:</h4>\n" +
                                    "<p><strong>Precision = TP / (TP + FP)</strong></p>\n" +
                                    "<p><strong>Recall = TP / (TP + FN)</strong></p>\n" +
                                    "<p><strong>F1-Score = 2 × (Precision × Recall) / (Precision + Recall)</strong></p>\n" +
                                    "\n" +
                                    "<h3>5.2. ROC Curve and AUC</h3>\n" +
                                    "<p><strong>ROC Curve:</strong> The Receiver Operating Characteristic curve plots the true positive rate (recall) against the false positive rate, showing the trade-off between sensitivity and specificity at various thresholds.</p>\n" +
                                    "<p><strong>AUC (Area Under the Curve):</strong> The area under the ROC curve. A higher AUC indicates better performance, particularly in distinguishing between classes.</p>\n" +
                                    "\n" +
                                    "<h3>5.3. Precision-Recall Curve</h3>\n" +
                                    "<p>For highly imbalanced datasets, the precision-recall curve is often more informative than the ROC curve. It specifically focuses on the performance of the classifier on the positive (minority) class.</p>\n" +
                                    "\n" +
                                    "<h3>5.4. Matthews Correlation Coefficient (MCC)</h3>\n" +
                                    "<p>MCC is another evaluation metric that considers true positives, true negatives, false positives, and false negatives in its computation, and is particularly useful for imbalanced datasets.</p>\n" +
                                    "\n" +
                                    "<p><strong>MCC = (TP × TN − FP × FN) / √((TP + FP)(TP + FN)(TN + FP)(TN + FN))</strong></p>\n" +
                                    "\n", "2024-11-02", "2024-11-02")
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
        estimatedDuration = "4 months",
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
