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
                            Unit(37, 13, "Feedforward Architecture", 1, "<h1>1. Introduction to Feedforward Neural Networks</h1>\n" +
                                    "<p>Feedforward Neural Networks (FNNs) are the simplest type of artificial neural networks, where connections between the nodes do not form a cycle. Data flows in one direction—from the input layer, through the hidden layers, and finally to the output layer. This architecture is fundamental in deep learning and is widely used in tasks such as image classification, natural language processing, and regression analysis.</p>\n" +
                                    "<p>FNNs are foundational to understanding more advanced neural network architectures. Their training process involves optimizing weights and biases to minimize error in predictions, enabling the network to learn patterns and relationships in the data.</p>\n" +
                                    "\n" +
                                    "<h1>2. Key Concepts in Feedforward Neural Networks</h1>\n" +
                                    "\n" +
                                    "<h2>1. Feedforward Architecture</h2>\n" +
                                    "<p>Feedforward Neural Networks consist of the following components:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Input Layer:</strong> Receives the raw data as input.</li>\n" +
                                    "    <li><strong>Hidden Layers:</strong> Perform computations using activation functions to capture nonlinear relationships. The network can have one or more hidden layers.</li>\n" +
                                    "    <li><strong>Output Layer:</strong> Produces the final prediction or output, such as a class label or a continuous value.</li>\n" +
                                    "</ul>\n" +
                                    "<p>Each layer is composed of neurons, and every neuron in a layer is connected to every neuron in the next layer through weighted connections.</p>\n" +
                                    "\n" +
                                    "<h2>2. Activation Functions</h2>\n" +
                                    "<p>Neurons in FNNs use activation functions to introduce nonlinearity into the model. Common activation functions include:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>ReLU (Rectified Linear Unit):</strong> Outputs the input if it is positive; otherwise, it outputs zero.</li>\n" +
                                    "    <li><strong>Sigmoid:</strong> Outputs a value between 0 and 1, making it useful for binary classification tasks.</li>\n" +
                                    "    <li><strong>Tanh (Hyperbolic Tangent):</strong> Outputs values between -1 and 1, centered at 0, making it useful when negative values are significant.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Forward Propagation</h2>\n" +
                                    "<p>In forward propagation, input data is passed through the network layer by layer. Each neuron computes a weighted sum of its inputs, adds a bias term, and applies an activation function. The final layer generates predictions for the task at hand.</p>\n" +
                                    "\n" +
                                    "<h1>3. How Feedforward Neural Networks Work</h1>\n" +
                                    "\n" +
                                    "<h2>1. Initializing Weights and Biases</h2>\n" +
                                    "<p>The model starts by assigning initial values (usually random) to weights and biases. These parameters are then updated during the training process to improve the network's performance.</p>\n" +
                                    "\n" +
                                    "<h2>2. Forward Propagation</h2>\n" +
                                    "<p>Data flows through the network:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>For each neuron, compute <code>z = ∑ w<sub>i</sub>x<sub>i</sub> + b</code>, where <code>w</code> represents the weights, <code>x</code> the inputs, and <code>b</code> the bias.</li>\n" +
                                    "    <li>Apply an activation function to <code>z</code> to produce the neuron’s output.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Loss Function</h2>\n" +
                                    "<p>The network uses a loss function to measure the difference between the predicted and actual values. Common loss functions include:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Mean Squared Error (MSE):</strong> Used for regression tasks.</li>\n" +
                                    "    <li><strong>Cross-Entropy Loss:</strong> Used for classification tasks.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Backward Propagation</h2>\n" +
                                    "<p>Backward propagation (or backpropagation) computes the gradients of the loss function with respect to weights and biases. It uses the chain rule to determine how each parameter contributed to the error.</p>\n" +
                                    "\n" +
                                    "<h2>5. Optimization (Gradient Descent)</h2>\n" +
                                    "<p>Optimization algorithms adjust the weights and biases based on the gradients calculated during backpropagation to minimize the loss function. Popular optimization algorithms include:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Stochastic Gradient Descent (SGD)</li>\n" +
                                    "    <li>Adam Optimizer</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>6. Training Iterations</h2>\n" +
                                    "<p>The training process involves repeatedly performing forward propagation, calculating loss, backpropagating errors, and updating weights until the model converges or a predefined number of epochs is reached.</p>\n" +
                                    "\n" +
                                    "<h1>4. Advantages of Feedforward Neural Networks</h1>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Simple and Versatile:</strong> FNNs are straightforward to implement and adapt for a wide range of tasks, such as classification, regression, and function approximation.</li>\n" +
                                    "    <li><strong>Captures Nonlinear Relationships:</strong> Through activation functions, FNNs can model complex, nonlinear dependencies in data.</li>\n" +
                                    "    <li><strong>Foundation for Advanced Models:</strong> Many advanced architectures, such as Convolutional Neural Networks (CNNs) and Recurrent Neural Networks (RNNs), are built upon the basic feedforward structure.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(38, 13, "Training Process", 2, "<h1>1. Introduction to Feedforward Neural Networks</h1>\n" +
                                    "<p>Feedforward Neural Networks (FNNs) are the simplest type of artificial neural networks, where connections between the nodes do not form a cycle. Data flows in one direction—from the input layer, through the hidden layers, and finally to the output layer. This architecture is fundamental in deep learning and is widely used in tasks such as image classification, natural language processing, and regression analysis.</p>\n" +
                                    "<p>FNNs are foundational to understanding more advanced neural network architectures. Their training process involves optimizing weights and biases to minimize error in predictions, enabling the network to learn patterns and relationships in the data.</p>\n" +
                                    "\n" +
                                    "<h1>2. Key Concepts in Feedforward Neural Networks</h1>\n" +
                                    "\n" +
                                    "<h2>1. Feedforward Architecture</h2>\n" +
                                    "<p>Feedforward Neural Networks consist of the following components:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Input Layer:</strong> Receives the raw data as input.</li>\n" +
                                    "    <li><strong>Hidden Layers:</strong> Perform computations using activation functions to capture nonlinear relationships. The network can have one or more hidden layers.</li>\n" +
                                    "    <li><strong>Output Layer:</strong> Produces the final prediction or output, such as a class label or a continuous value.</li>\n" +
                                    "</ul>\n" +
                                    "<p>Each layer is composed of neurons, and every neuron in a layer is connected to every neuron in the next layer through weighted connections.</p>\n" +
                                    "\n" +
                                    "<h2>2. Activation Functions</h2>\n" +
                                    "<p>Neurons in FNNs use activation functions to introduce nonlinearity into the model. Common activation functions include:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>ReLU (Rectified Linear Unit):</strong> Outputs the input if it is positive; otherwise, it outputs zero.</li>\n" +
                                    "    <li><strong>Sigmoid:</strong> Outputs a value between 0 and 1, making it useful for binary classification tasks.</li>\n" +
                                    "    <li><strong>Tanh (Hyperbolic Tangent):</strong> Outputs values between -1 and 1, centered at 0, making it useful when negative values are significant.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Forward Propagation</h2>\n" +
                                    "<p>In forward propagation, input data is passed through the network layer by layer. Each neuron computes a weighted sum of its inputs, adds a bias term, and applies an activation function. The final layer generates predictions for the task at hand.</p>\n" +
                                    "\n" +
                                    "<h1>3. How Feedforward Neural Networks Work</h1>\n" +
                                    "\n" +
                                    "<h2>1. Initializing Weights and Biases</h2>\n" +
                                    "<p>The model starts by assigning initial values (usually random) to weights and biases. These parameters are then updated during the training process to improve the network's performance.</p>\n" +
                                    "\n" +
                                    "<h2>2. Forward Propagation</h2>\n" +
                                    "<p>Data flows through the network:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>For each neuron, compute <code>z = ∑ w<sub>i</sub>x<sub>i</sub> + b</code>, where <code>w</code> represents the weights, <code>x</code> the inputs, and <code>b</code> the bias.</li>\n" +
                                    "    <li>Apply an activation function to <code>z</code> to produce the neuron’s output.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Loss Function</h2>\n" +
                                    "<p>The network uses a loss function to measure the difference between the predicted and actual values. Common loss functions include:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Mean Squared Error (MSE):</strong> Used for regression tasks.</li>\n" +
                                    "    <li><strong>Cross-Entropy Loss:</strong> Used for classification tasks.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Backward Propagation</h2>\n" +
                                    "<p>Backward propagation (or backpropagation) computes the gradients of the loss function with respect to weights and biases. It uses the chain rule to determine how each parameter contributed to the error.</p>\n" +
                                    "\n" +
                                    "<h2>5. Optimization (Gradient Descent)</h2>\n" +
                                    "<p>Optimization algorithms adjust the weights and biases based on the gradients calculated during backpropagation to minimize the loss function. Popular optimization algorithms include:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Stochastic Gradient Descent (SGD)</li>\n" +
                                    "    <li>Adam Optimizer</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>6. Training Iterations</h2>\n" +
                                    "<p>The training process involves repeatedly performing forward propagation, calculating loss, backpropagating errors, and updating weights until the model converges or a predefined number of epochs is reached.</p>\n" +
                                    "\n" +
                                    "<h1>4. Advantages of Feedforward Neural Networks</h1>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Simple and Versatile:</strong> FNNs are straightforward to implement and adapt for a wide range of tasks, such as classification, regression, and function approximation.</li>\n" +
                                    "    <li><strong>Captures Nonlinear Relationships:</strong> Through activation functions, FNNs can model complex, nonlinear dependencies in data.</li>\n" +
                                    "    <li><strong>Foundation for Advanced Models:</strong> Many advanced architectures, such as Convolutional Neural Networks (CNNs) and Recurrent Neural Networks (RNNs), are built upon the basic feedforward structure.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(39, 13, "Activation Functions Revisited", 3, "<h1>1. Introduction to Activation Functions</h1>\n" +
                                    "<p>Activation functions are key components of neural networks, including feedforward neural networks. These functions introduce nonlinearity to the network, allowing it to model complex relationships between inputs and outputs. Without activation functions, a neural network would behave like a linear regression model, regardless of the number of layers.</p>\n" +
                                    "<p>Activation functions transform the output of each neuron and help in deciding whether a neuron should be activated or not. This transformation helps the neural network learn patterns from the data.</p>\n" +
                                    "\n" +
                                    "<h2>2. Key Activation Functions in Feedforward Neural Networks</h2>\n" +
                                    "\n" +
                                    "<h3>1. Sigmoid Activation Function</h3>\n" +
                                    "<p>The sigmoid function outputs a value between 0 and 1, making it useful for binary classification tasks. It squashes the input into a range between 0 and 1.</p>\n" +
                                    "<p><strong>Formula:</strong><br>\n" +
                                    "    <code>σ(z) = 1 / (1 + e<sup>-z</sup>)</code>\n" +
                                    "</p>\n" +
                                    "<p><strong>Example Calculation:</strong> For <code>z = 0.5</code>, the sigmoid output would be:</p>\n" +
                                    "<p><code>σ(0.5) = 1 / (1 + e<sup>-0.5</sup>) ≈ 0.622</code></p>\n" +
                                    "<p><strong>Pros:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Smooth and differentiable.</li>\n" +
                                    "    <li>Suitable for probabilistic outputs (binary classification).</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Cons:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Susceptible to the vanishing gradient problem for very large or small inputs.</li>\n" +
                                    "    <li>Outputs are not zero-centered, which can slow down training.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Tanh (Hyperbolic Tangent) Activation Function</h3>\n" +
                                    "<p>The tanh function maps inputs to a range between -1 and 1, making it zero-centered, unlike the sigmoid.</p>\n" +
                                    "<p><strong>Formula:</strong><br>\n" +
                                    "    <code>tanh(z) = (e<sup>z</sup> - e<sup>-z</sup>) / (e<sup>z</sup> + e<sup>-z</sup>)</code>\n" +
                                    "</p>\n" +
                                    "<p><strong>Example Calculation:</strong> For <code>z = -1</code>, the tanh output would be:</p>\n" +
                                    "<p><code>tanh(-1) = (e<sup>-1</sup> - e<sup>1</sup>) / (e<sup>-1</sup> + e<sup>1</sup>) ≈ -0.761</code></p>\n" +
                                    "<p><strong>Pros:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Zero-centered output helps in faster convergence during training.</li>\n" +
                                    "    <li>Better gradient flow compared to sigmoid.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Cons:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Still suffers from vanishing gradients for extreme values of <code>z</code>.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>3. ReLU (Rectified Linear Unit) Activation Function</h3>\n" +
                                    "<p>The ReLU activation function outputs the input directly if it is positive, otherwise, it outputs zero. ReLU is widely used in deep learning due to its simplicity and efficiency.</p>\n" +
                                    "<p><strong>Formula:</strong><br>\n" +
                                    "    <code>ReLU(z) = max(0, z)</code>\n" +
                                    "</p>\n" +
                                    "<p><strong>Example Calculation:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>If <code>z = -2</code>: <code>ReLU(-2) = 0</code></li>\n" +
                                    "    <li>If <code>z = 3</code>: <code>ReLU(3) = 3</code></li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Pros:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Helps mitigate the vanishing gradient problem.</li>\n" +
                                    "    <li>Computationally efficient and simple.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Cons:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Can result in dead neurons where the neuron always outputs zero for all inputs.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>4. Leaky ReLU Activation Function</h3>\n" +
                                    "<p>Leaky ReLU is a variation of ReLU that allows a small, non-zero output for negative inputs, preventing the \"dead neuron\" problem. This small slope is controlled by a parameter <code>α</code>.</p>\n" +
                                    "<p><strong>Formula:</strong><br>\n" +
                                    "    <code>Leaky ReLU(z) = { z, if z &gt; 0; αz, if z ≤ 0 }</code>\n" +
                                    "</p>\n" +
                                    "<p>Here, <code>α</code> is a small constant (e.g., 0.01).</p>\n" +
                                    "<p><strong>Example Calculation:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>If <code>z = -4</code> and <code>α = 0.01</code>: <code>Leaky ReLU(-4) = 0.01 × -4 = -0.04</code></li>\n" +
                                    "    <li>If <code>z = 5</code>: <code>Leaky ReLU(5) = 5</code></li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Pros:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Prevents dead neurons and is more flexible than ReLU.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Cons:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>The value of <code>α</code> needs to be chosen carefully, and it may require tuning.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>5. Softmax Activation Function</h3>\n" +
                                    "<p>The softmax function is typically used in the output layer for multi-class classification tasks. It converts raw scores (logits) into a probability distribution over multiple classes, where the sum of all probabilities is 1.</p>\n" +
                                    "<p><strong>Formula:</strong><br>\n" +
                                    "    <code>Softmax(z<sub>i</sub>) = e<sup>z<sub>i</sub></sup> / ∑<sub>j</sub> e<sup>z<sub>j</sub></sup></code>\n" +
                                    "</p>\n" +
                                    "<p><strong>Example Calculation:</strong> For logits <code>z = [2, 1, 0]</code>, the softmax outputs would be:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><code>Softmax(z<sub>1</sub>) = e<sup>2</sup> / (e<sup>2</sup> + e<sup>1</sup> + e<sup>0</sup>) ≈ 0.665</code></li>\n" +
                                    "    <li><code>Softmax(z<sub>2</sub>) = e<sup>1</sup> / (e<sup>2</sup> + e<sup>1</sup> + e<sup>0</sup>) ≈ 0.244</code></li>\n" +
                                    "    <li><code>Softmax(z<sub>3</sub>) = e<sup>0</sup> / (e<sup>2</sup> + e<sup>1</sup> + e<sup>0</sup>) ≈ 0.090</code></li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Pros:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Converts logits into interpretable probabilities.</li>\n" +
                                    "    <li>Ideal for multi-class classification.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Cons:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Computationally expensive, especially for large output layers.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Corrected Python Code Example</h2>\n" +
                                    "<pre>\n" +
                                    "import tensorflow as tf\n" +
                                    "from tensorflow.keras.models import Sequential\n" +
                                    "from tensorflow.keras.layers import Dense\n" +
                                    "\n" +
                                    "# Sample Feedforward Neural Network\n" +
                                    "model = Sequential([\n" +
                                    "    Dense(128, activation='relu', input_shape=(64,)),  # ReLU for hidden layer\n" +
                                    "    Dense(64, activation='tanh'),                     # Tanh for hidden layer\n" +
                                    "    Dense(10, activation='softmax')                   # Softmax for output layer (multi-class)\n" +
                                    "])\n" +
                                    "\n" +
                                    "# Compile the model\n" +
                                    "model.compile(optimizer='adam', \n" +
                                    "              loss='sparse_categorical_crossentropy', \n" +
                                    "              metrics=['accuracy'])\n" +
                                    "\n" +
                                    "# Model summary\n" +
                                    "model.summary()\n" +
                                    "\n" +
                                    "# Assume X_train and y_train are preprocessed datasets\n" +
                                    "# Training the model\n" +
                                    "history = model.fit(X_train, y_train, epochs=10, batch_size=32, validation_split=0.2)\n" +
                                    "\n" +
                                    "# Evaluate the model on test data\n" +
                                    "loss, accuracy = model.evaluate(X_test, y_test)\n" +
                                    "print(f\"Test Accuracy: {accuracy:.2f}\")\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>4. Choosing the Right Activation Function</h2>\n" +
                                    "<p><strong>For Hidden Layers:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>ReLU is typically used for its simplicity and faster training time.</li>\n" +
                                    "    <li>Leaky ReLU is a good choice if you are facing issues with dead neurons.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>For Output Layers:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Sigmoid is ideal for binary classification problems (output between 0 and 1).</li>\n" +
                                    "    <li>Softmax is used when\n", "2024-11-02", "2024-11-02")
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
                            Unit(40, 14, "CNN Structure", 1, "<h1>1. Introduction to CNN Structure</h1>\n" +
                                    "<p>Convolutional Neural Networks (CNNs) are a specialized type of neural network primarily used for processing data that has a grid-like topology, such as images. CNNs have been extremely successful in computer vision tasks like image classification, object detection, and facial recognition, but they can also be applied to other types of data, like audio or time series.</p>\n" +
                                    "<p>A CNN consists of several layers that perform different operations on the input data, allowing it to learn spatial hierarchies and features.</p>\n" +
                                    "\n" +
                                    "<h2>2. Layers of a Convolutional Neural Network</h2>\n" +
                                    "\n" +
                                    "<h3>1. Input Layer</h3>\n" +
                                    "<p>The input layer receives the raw data, typically an image in the case of a CNN. The image data is usually represented as a matrix of pixel values. For a color image, the input will be a 3D matrix with dimensions corresponding to the height, width, and color channels (RGB).</p>\n" +
                                    "<p>For example, an image of size 64x64 pixels with 3 color channels (RGB) would have the shape:</p>\n" +
                                    "<p><strong>Shape:</strong> (64, 64, 3)</p>\n" +
                                    "\n" +
                                    "<h3>2. Convolutional Layer</h3>\n" +
                                    "<p>The convolutional layer is the core building block of a CNN. It applies filters (kernels) to the input image to extract spatial features like edges, textures, or patterns. These filters slide over the input image, performing a mathematical operation called convolution, and produce feature maps.</p>\n" +
                                    "<p>Each filter is a small matrix (e.g., 3x3 or 5x5) that slides over the image. The output is a set of feature maps, each corresponding to a different filter applied to the image.</p>\n" +
                                    "<p><strong>Operation:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>A filter (e.g., 3x3) is convolved over the input image.</li>\n" +
                                    "    <li>The result of the convolution operation is passed through an activation function (usually ReLU) to introduce non-linearity.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example:</strong></p>\n" +
                                    "<p>If we have an image of size 5x5 and apply a 3x3 filter, the result will be a 3x3 feature map.</p>\n" +
                                    "\n" +
                                    "<h3>3. Activation Function (ReLU)</h3>\n" +
                                    "<p>After the convolution operation, an activation function (usually ReLU) is applied to the resulting feature map. This introduces non-linearity into the network, allowing it to learn complex patterns and features.</p>\n" +
                                    "<p><strong>ReLU (Rectified Linear Unit):</strong></p>\n" +
                                    "<p>Formula:</p>\n" +
                                    "<pre>f(x) = max(0, x)</pre>\n" +
                                    "<p>This function ensures that negative values are set to zero, while positive values remain unchanged.</p>\n" +
                                    "\n" +
                                    "<h3>4. Pooling Layer</h3>\n" +
                                    "<p>The pooling layer is used to reduce the spatial dimensions (height and width) of the feature maps, making the model more computationally efficient and reducing the risk of overfitting. The most common pooling operation is max pooling, which selects the maximum value from a small region (e.g., 2x2) of the feature map.</p>\n" +
                                    "<p><strong>Types of Pooling:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Max Pooling:</strong> Selects the maximum value in each pool region.</li>\n" +
                                    "    <li><strong>Average Pooling:</strong> Selects the average value in each pool region.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example:</strong></p>\n" +
                                    "<p>If you have a 4x4 feature map and apply 2x2 max pooling, the output will be a 2x2 feature map, where each value corresponds to the maximum value from each 2x2 region.</p>\n" +
                                    "\n" +
                                    "<h3>5. Fully Connected Layer (Dense Layer)</h3>\n" +
                                    "<p>The fully connected layer comes after several convolutional and pooling layers. In this layer, all neurons are connected to each neuron in the previous layer. It is similar to the layers of a traditional feedforward neural network.</p>\n" +
                                    "<p>The fully connected layer is typically used to combine the features learned by the convolutional layers and produce the final output, such as class probabilities in classification tasks.</p>\n" +
                                    "\n" +
                                    "<h3>6. Output Layer</h3>\n" +
                                    "<p>The output layer is responsible for producing the final predictions of the network. For classification tasks, this layer typically has one neuron per class, and the softmax activation function is often used to convert the raw output scores into probabilities.</p>\n" +
                                    "<p><strong>Example for Classification:</strong></p>\n" +
                                    "<p>For a 10-class classification problem, the output layer would have 10 neurons, and each neuron would output a probability representing the likelihood of the input image belonging to each class.</p>\n" +
                                    "\n" +
                                    "<h2>3. CNN Architecture Example</h2>\n" +
                                    "<p>Here's an example of a simple CNN architecture designed for image classification:</p>\n" +
                                    "<p><strong>Example Architecture:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Input Layer:</strong> An image of size 64x64x3.</li>\n" +
                                    "    <li><strong>Convolutional Layer:</strong> 32 filters of size 3x3, followed by ReLU activation.</li>\n" +
                                    "    <li><strong>Max Pooling Layer:</strong> 2x2 pooling.</li>\n" +
                                    "    <li><strong>Convolutional Layer:</strong> 64 filters of size 3x3, followed by ReLU activation.</li>\n" +
                                    "    <li><strong>Max Pooling Layer:</strong> 2x2 pooling.</li>\n" +
                                    "    <li><strong>Fully Connected Layer:</strong> 128 neurons.</li>\n" +
                                    "    <li><strong>Output Layer:</strong> 10 neurons (for 10-class classification), using softmax activation.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Python Code Example Using Keras:</h3>\n" +
                                    "<pre>\n" +
                                    "import tensorflow as tf\n" +
                                    "from tensorflow.keras.models import Sequential\n" +
                                    "from tensorflow.keras.layers import Conv2D, MaxPooling2D, Flatten, Dense\n" +
                                    "\n" +
                                    "# Create a simple CNN model\n" +
                                    "model = Sequential([\n" +
                                    "    # Convolutional Layer with 32 filters of size 3x3, ReLU activation\n" +
                                    "    Conv2D(32, (3, 3), activation='relu', input_shape=(64, 64, 3)),\n" +
                                    "    \n" +
                                    "    # Max Pooling Layer with 2x2 pool size\n" +
                                    "    MaxPooling2D(pool_size=(2, 2)),\n" +
                                    "    \n" +
                                    "    # Convolutional Layer with 64 filters of size 3x3, ReLU activation\n" +
                                    "    Conv2D(64, (3, 3), activation='relu'),\n" +
                                    "    \n" +
                                    "    # Max Pooling Layer with 2x2 pool size\n" +
                                    "    MaxPooling2D(pool_size=(2, 2)),\n" +
                                    "    \n" +
                                    "    # Flatten the 3D feature maps into a 1D vector\n" +
                                    "    Flatten(),\n" +
                                    "    \n" +
                                    "    # Fully Connected Layer with 128 neurons\n" +
                                    "    Dense(128, activation='relu'),\n" +
                                    "    \n" +
                                    "    # Output Layer for 10-class classification with Softmax activation\n" +
                                    "    Dense(10, activation='softmax')\n" +
                                    "])\n" +
                                    "\n" +
                                    "# Compile the model\n" +
                                    "model.compile(optimizer='adam', \n" +
                                    "              loss='sparse_categorical_crossentropy', \n" +
                                    "              metrics=['accuracy'])\n" +
                                    "\n" +
                                    "# Model summary\n" +
                                    "model.summary()\n" +
                                    "</pre>\n", "2024-11-02", "2024-11-02"),
                            Unit(41, 14, "Convolutional Layers in Depth", 2, "<h1>1. Convolutional Layers in Depth</h1>\n" +
                                    "<p>Convolutional layers are the core building blocks of Convolutional Neural Networks (CNNs). They are responsible for extracting features from input data, such as edges, textures, and complex patterns. Understanding the details of how convolution works, including stride, padding, and filters, is critical for designing effective CNNs.</p>\n" +
                                    "\n" +
                                    "<h2>2. Core Concepts of Convolutional Layers</h2>\n" +
                                    "\n" +
                                    "<h3>1. Filters (Kernels)</h3>\n" +
                                    "<p>A filter, also known as a kernel, is a small matrix (e.g., 3x3, 5x5) that slides over the input data and performs element-wise multiplication and summation.</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Filters are used to detect specific patterns or features in the input, such as edges, corners, or textures.</li>\n" +
                                    "    <li>Each convolutional layer typically uses multiple filters, where each filter learns to extract a different feature.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Input image size: 5x5</li>\n" +
                                    "    <li>Filter size: 3x3</li>\n" +
                                    "    <li>Resulting feature map size: 3x3 (assuming no padding).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Stride</h3>\n" +
                                    "<p>The stride defines how far the filter moves during the convolution operation. It controls the \"step size\" of the filter as it slides across the input.</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Stride = 1:</strong> The filter moves one pixel at a time, producing a detailed feature map.</li>\n" +
                                    "    <li><strong>Stride > 1:</strong> The filter skips pixels, resulting in smaller feature maps and faster computation.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example Calculation:</strong> For a 5x5 input, 3x3 filter, and stride = 1 (without padding):</p>\n" +
                                    "<p>\n" +
                                    "<pre>Output size = (Input Size - Filter Size) / Stride + 1 = (5 - 3) / 1 + 1 = 3</pre>\n" +
                                    "</p>\n" +
                                    "\n" +
                                    "<h3>3. Padding</h3>\n" +
                                    "<p>Padding involves adding extra pixels (usually zeros) around the borders of the input data to control the size of the output feature map. There are two common padding strategies:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Valid Padding:</strong> No padding is applied, so the output feature map is smaller than the input.</li>\n" +
                                    "    <li><strong>Same Padding:</strong> Padding is added so that the output size matches the input size.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example:</strong> For a 5x5 input and a 3x3 filter:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Valid Padding:</strong> Output size = 3x3.</li>\n" +
                                    "    <li><strong>Same Padding:</strong> Output size = 5x5 (padding of 1 pixel is added around the input).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>4. Depth of Filters</h3>\n" +
                                    "<p>Each filter processes all input channels. For color images with three channels (RGB), a 3x3 filter would actually be a 3x3x3 filter.</p>\n" +
                                    "<ul>\n" +
                                    "    <li>The depth of the filter matches the number of input channels.</li>\n" +
                                    "    <li>After convolution, each filter produces one feature map, so if there are 64 filters, the output will have 64 feature maps.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. How Convolution Works (Step-by-Step)</h2>\n" +
                                    "<p><strong>Example: 2D Convolution</strong></p>\n" +
                                    "\n" +
                                    "<p><strong>Input Matrix (Image):</strong></p>\n" +
                                    "<pre>\n" +
                                    "Input =\n" +
                                    "[[1, 2, 3, 4],\n" +
                                    " [5, 6, 7, 8],\n" +
                                    " [9, 10, 11, 12],\n" +
                                    " [13, 14, 15, 16]]\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<p><strong>Filter (Kernel):</strong></p>\n" +
                                    "<pre>\n" +
                                    "Filter =\n" +
                                    "[[1, 0, -1],\n" +
                                    " [1, 0, -1],\n" +
                                    " [1, 0, -1]]\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<p><strong>Convolution Operation:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Slide the filter across the input matrix, performing element-wise multiplication and summing the results.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Feature Map Output (Stride = 1, No Padding):</strong></p>\n" +
                                    "<pre>\n" +
                                    "Output =\n" +
                                    "[[0, -4],\n" +
                                    " [-8, -12]]\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>4. Visualizing Stride and Padding</h2>\n" +
                                    "\n" +
                                    "<h3>Stride Visualization:</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Input:</strong> 5x5 matrix.</li>\n" +
                                    "    <li><strong>Filter:</strong> 3x3.</li>\n" +
                                    "    <li><strong>Stride = 2:</strong> The filter skips every other pixel, reducing computation.</li>\n" +
                                    "</ul>\n" +
                                    "<p>\n" +
                                    "<pre>Output size = (5 - 3) / 2 + 1 = 2</pre>\n" +
                                    "</p>\n" +
                                    "\n" +
                                    "<h3>Padding Visualization:</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Input:</strong> 5x5 matrix.</li>\n" +
                                    "    <li><strong>Filter:</strong> 3x3.</li>\n" +
                                    "    <li><strong>Padding = 1 (Same Padding):</strong> A border of zeros is added around the input.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Output size:</strong> 5x5 (unchanged).</p>\n" +
                                    "\n" +
                                    "<h2>5. Example Python Code</h2>\n" +
                                    "<pre>\n" +
                                    "import numpy as np\n" +
                                    "from tensorflow.keras.models import Sequential\n" +
                                    "from tensorflow.keras.layers import Conv2D\n" +
                                    "\n" +
                                    "# Example Input Data: 4x4 image with 1 channel\n" +
                                    "input_data = np.array([[[[1], [2], [3], [4]],\n" +
                                    "                        [[5], [6], [7], [8]],\n" +
                                    "                        [[9], [10], [11], [12]],\n" +
                                    "                        [[13], [14], [15], [16]]]])\n" +
                                    "\n" +
                                    "# CNN Model with a Single Convolutional Layer\n" +
                                    "model = Sequential([\n" +
                                    "    Conv2D(filters=1, kernel_size=(3, 3), strides=(1, 1), padding='valid', input_shape=(4, 4, 1))\n" +
                                    "])\n" +
                                    "\n" +
                                    "# Get the Model Output\n" +
                                    "output = model.predict(input_data)\n" +
                                    "\n" +
                                    "print(\"Output Shape:\", model.output_shape)\n" +
                                    "print(\"Output Data:\", output)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>6. Applications of Convolutional Layers</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Edge Detection:</strong> Filters can detect horizontal, vertical, or diagonal edges.</li>\n" +
                                    "    <li><strong>Feature Extraction:</strong> Higher layers in a CNN extract complex patterns like shapes or textures.</li>\n" +
                                    "    <li><strong>Dimensionality Reduction:</strong> Convolution combined with pooling reduces data size while preserving essential features.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(42, 14, "CNN Applications", 3, "<h1>1. Introduction to CNN Applications</h1>\n" +
                                    "<p>Convolutional Neural Networks (CNNs) are a specialized type of deep neural network designed to handle data with a spatial structure, such as images. CNNs have revolutionized fields like computer vision by enabling machines to process and understand visual data with remarkable accuracy.</p>\n" +
                                    "<p>This section explores the key applications of CNNs in image recognition and classification, along with practical examples and use cases.</p>\n" +
                                    "\n" +
                                    "<h2>2. What Are Image Recognition and Classification?</h2>\n" +
                                    "\n" +
                                    "<h3>1. Image Recognition</h3>\n" +
                                    "<p>Image recognition is the process of identifying objects, patterns, or features in an image. It involves analyzing the visual content and determining what the image contains.</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Identifying a cat or a dog in an image.</li>\n" +
                                    "    <li>Detecting a specific object, like a car or a tree, in a photo.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Image Classification</h3>\n" +
                                    "<p>Image classification goes a step further by categorizing images into predefined classes. The CNN processes the input image and outputs the probability of the image belonging to each class.</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Classifying handwritten digits in the MNIST dataset (digits 0–9).</li>\n" +
                                    "    <li>Sorting images into categories like \"animals,\" \"vehicles,\" or \"nature.\"</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>3. Why Are CNNs Ideal for Image Recognition and Classification?</h3>\n" +
                                    "<p>CNNs are particularly well-suited for image-related tasks due to their ability to:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Automatically extract relevant features (edges, textures, shapes, etc.) from images.</li>\n" +
                                    "    <li>Handle spatial hierarchies, understanding both local and global features.</li>\n" +
                                    "    <li>Reduce the need for manual feature engineering, thanks to learnable filters and layers.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Applications of CNNs in Image Recognition and Classification</h2>\n" +
                                    "\n" +
                                    "<h3>1. Object Recognition and Detection</h3>\n" +
                                    "<p>CNNs are used to recognize and localize objects within images, often as part of larger systems like autonomous vehicles or security cameras.</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Self-driving Cars:</strong> Recognizing pedestrians, traffic signs, and vehicles.</li>\n" +
                                    "    <li><strong>Facial Recognition:</strong> Identifying faces in security systems or social media tagging.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Medical Imaging</h3>\n" +
                                    "<p>CNNs are employed to analyze medical images for diagnostics and treatment planning.</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Radiology:</strong> Detecting tumors or abnormalities in X-rays, CT scans, or MRIs.</li>\n" +
                                    "    <li><strong>Dermatology:</strong> Classifying skin lesions as benign or malignant.</li>\n" +
                                    "    <li><strong>Ophthalmology:</strong> Identifying diabetic retinopathy in retinal images.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>3. Content Categorization</h3>\n" +
                                    "<p>CNNs are used to organize and label large collections of visual content automatically.</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Photo Management:</strong> Grouping photos by events or subjects in apps like Google Photos.</li>\n" +
                                    "    <li><strong>E-commerce:</strong> Categorizing product images for online stores.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>4. Autonomous Systems</h3>\n" +
                                    "<p>CNNs enable machines to understand their surroundings visually.</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Drones:</strong> Navigating and recognizing obstacles.</li>\n" +
                                    "    <li><strong>Robots:</strong> Identifying objects to manipulate or interact with.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>5. Creative Applications</h3>\n" +
                                    "<p>CNNs are employed in generative and artistic applications.</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Style Transfer:</strong> Transforming photos into artistic styles.</li>\n" +
                                    "    <li><strong>Image Synthesis:</strong> Generating new images (e.g., GANs for creating realistic faces).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5. Example: Image Classification Workflow</h2>\n" +
                                    "\n" +
                                    "<h3>Step-by-Step Process</h3>\n" +
                                    "\n" +
                                    "<h4>Dataset Preparation</h4>\n" +
                                    "<ul>\n" +
                                    "    <li>Collect and preprocess images.</li>\n" +
                                    "    <li>Label images with their respective classes.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example Dataset:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>MNIST (handwritten digits):</strong> Each image is labeled as 0–9.</li>\n" +
                                    "    <li><strong>CIFAR-10 (general objects):</strong> Contains images labeled into 10 categories (e.g., airplane, car, bird).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h4>CNN Architecture Design</h4>\n" +
                                    "<p>Create a CNN model with convolutional layers, pooling layers, and fully connected layers.</p>\n" +
                                    "<p><strong>Example Architecture:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Input Layer:</strong> Image (e.g., 28x28 pixels).</li>\n" +
                                    "    <li><strong>Convolutional Layers:</strong> Extract features.</li>\n" +
                                    "    <li><strong>Pooling Layers:</strong> Reduce feature map size.</li>\n" +
                                    "    <li><strong>Fully Connected Layers:</strong> Map features to classes.</li>\n" +
                                    "    <li><strong>Output Layer:</strong> Softmax for probabilities.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h4>Training</h4>\n" +
                                    "<ul>\n" +
                                    "    <li>Train the model using labeled images.</li>\n" +
                                    "    <li>Use a loss function (e.g., cross-entropy) and an optimizer (e.g., Adam).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h4>Evaluation</h4>\n" +
                                    "<p>Test the model on unseen data to measure its accuracy and generalization.</p>\n" +
                                    "\n" +
                                    "<h4>Prediction</h4>\n" +
                                    "<p>Use the trained model to classify new images.</p>\n" +
                                    "\n" +
                                    "<h2>6. Example Python Implementation</h2>\n" +
                                    "<pre>\n" +
                                    "import tensorflow as tf\n" +
                                    "from tensorflow.keras.models import Sequential\n" +
                                    "from tensorflow.keras.layers import Conv2D, MaxPooling2D, Flatten, Dense\n" +
                                    "from tensorflow.keras.datasets import cifar10\n" +
                                    "from tensorflow.keras.utils import to_categorical\n" +
                                    "\n" +
                                    "# Load CIFAR-10 dataset\n" +
                                    "(X_train, y_train), (X_test, y_test) = cifar10.load_data()\n" +
                                    "\n" +
                                    "# Normalize data\n" +
                                    "X_train, X_test = X_train / 255.0, X_test / 255.0\n" +
                                    "\n" +
                                    "# One-hot encode labels\n" +
                                    "y_train = to_categorical(y_train, 10)\n" +
                                    "y_test = to_categorical(y_test, 10)\n" +
                                    "\n" +
                                    "# Define CNN model\n" +
                                    "model = Sequential([\n" +
                                    "    Conv2D(32, (3, 3), activation='relu', input_shape=(32, 32, 3)),\n" +
                                    "    MaxPooling2D((2, 2)),\n" +
                                    "    Conv2D(64, (3, 3), activation='relu'),\n" +
                                    "    MaxPooling2D((2, 2)),\n" +
                                    "    Flatten(),\n" +
                                    "    Dense(128, activation='relu'),\n" +
                                    "    Dense(10, activation='softmax')  # 10 classes for CIFAR-10\n" +
                                    "])\n" +
                                    "\n" +
                                    "# Compile the model\n" +
                                    "model.compile(optimizer='adam',\n" +
                                    "              loss='categorical_crossentropy',\n" +
                                    "              metrics=['accuracy'])\n" +
                                    "\n" +
                                    "# Train the model\n" +
                                    "model.fit(X_train, y_train, epochs=10, batch_size=32, validation_split=0.2)\n" +
                                    "\n" +
                                    "# Evaluate the model\n" +
                                    "test_loss, test_acc = model.evaluate(X_test, y_test)\n" +
                                    "print(f\"Test Accuracy: {test_acc}\")\n" +
                                    "</pre>\n", "2024-11-02", "2024-11-02")
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
                            Unit(43, 15, "RNN Basics", 1, "<h1>1. Introduction to Recurrent Neural Networks (RNNs)</h1>\n" +
                                    "<p>Recurrent Neural Networks (RNNs) are a type of neural network designed for sequential data. Unlike feedforward networks, RNNs have connections that form cycles, allowing information to persist. This makes them particularly suited for tasks where the order or context of inputs matters, such as time series analysis, natural language processing, and speech recognition.</p>\n" +
                                    "\n" +
                                    "<h2>2. Key Concepts in RNNs</h2>\n" +
                                    "\n" +
                                    "<h3>1. Sequential Data</h3>\n" +
                                    "<p>Sequential data consists of data points ordered in time or sequence. Examples include:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Text:</strong> Sequence of words or characters.</li>\n" +
                                    "    <li><strong>Audio:</strong> Sequence of sound samples.</li>\n" +
                                    "    <li><strong>Time Series:</strong> Data like stock prices or weather measurements.</li>\n" +
                                    "</ul>\n" +
                                    "<p>RNNs process these sequences one step at a time, maintaining a memory of previous inputs through a hidden state.</p>\n" +
                                    "\n" +
                                    "<h3>2. Recurrent Architecture</h3>\n" +
                                    "<p>The architecture of an RNN includes:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Input Layer:</strong> Accepts the input sequence data.</li>\n" +
                                    "    <li><strong>Hidden Layer:</strong> Contains recurrent connections to store and process sequential context.</li>\n" +
                                    "    <li><strong>Output Layer:</strong> Produces predictions for each step in the sequence.</li>\n" +
                                    "</ul>\n" +
                                    "<p>Each time step <code>t</code> processes:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Input (x<sub>t</sub>):</strong> Current data point in the sequence.</li>\n" +
                                    "    <li><strong>Hidden State (h<sub>t</sub>):</strong> Memory of past inputs.</li>\n" +
                                    "    <li><strong>Output (y<sub>t</sub>):</strong> Prediction for the current step.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The recurrent connection means the hidden state at time <code>t</code>, <code>h<sub>t</sub></code>, depends on both the input <code>x<sub>t</sub></code> and the previous hidden state <code>h<sub>t-1</sub></code>.</p>\n" +
                                    "\n" +
                                    "<h3>3. How RNNs Work</h3>\n" +
                                    "\n" +
                                    "<h4>1. Step-by-Step Process</h4>\n" +
                                    "<ol>\n" +
                                    "    <li><strong>Input Sequence:</strong> The RNN takes an input sequence, e.g., <code>x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>T</sub></code>.</li>\n" +
                                    "    <li><strong>Hidden State Update:</strong></li>\n" +
                                    "</ol>\n" +
                                    "<pre>\n" +
                                    "h<sub>t</sub> = f(W<sub>xh</sub>x<sub>t</sub> + W<sub>hh</sub>h<sub>t-1</sub> + b<sub>h</sub>)\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><code>W<sub>xh</sub></code>: Weight matrix for the input.</li>\n" +
                                    "    <li><code>W<sub>hh</sub></code>: Weight matrix for the previous hidden state.</li>\n" +
                                    "    <li><code>b<sub>h</sub></code>: Bias term.</li>\n" +
                                    "    <li><code>f</code>: Activation function (e.g., tanh or ReLU).</li>\n" +
                                    "</ul>\n" +
                                    "<ol start=\"3\">\n" +
                                    "    <li><strong>Output Prediction:</strong></li>\n" +
                                    "</ol>\n" +
                                    "<pre>\n" +
                                    "y<sub>t</sub> = g(W<sub>hy</sub>h<sub>t</sub> + b<sub>y</sub>)\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><code>W<sub>hy</sub></code>: Weight matrix for the output.</li>\n" +
                                    "    <li><code>b<sub>y</sub></code>: Bias term.</li>\n" +
                                    "    <li><code>g</code>: Activation function (e.g., softmax or sigmoid).</li>\n" +
                                    "</ul>\n" +
                                    "<ol start=\"4\">\n" +
                                    "    <li><strong>Loop Over Sequence:</strong> The above process repeats for each time step in the sequence.</li>\n" +
                                    "</ol>\n" +
                                    "\n" +
                                    "<h4>2. Unrolling the RNN</h4>\n" +
                                    "<p>While the RNN processes sequences step-by-step, it can also be represented as an \"unrolled\" network, where each time step corresponds to a layer in a feedforward network. This helps in understanding how backpropagation works through time (BPTT), the method used to train RNNs.</p>\n" +
                                    "\n" +
                                    "<h2>4. Example Application of RNNs</h2>\n" +
                                    "\n" +
                                    "<h3>1. Sentiment Analysis</h3>\n" +
                                    "<p><strong>Input:</strong> A sequence of words from a movie review.</p>\n" +
                                    "<p><strong>Goal:</strong> Predict whether the review is positive or negative.</p>\n" +
                                    "<p><strong>Process:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Each word is fed into the RNN step by step.</li>\n" +
                                    "    <li>The hidden state stores the context of the review so far.</li>\n" +
                                    "    <li>The final hidden state is used to classify the sentiment.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Time Series Prediction</h3>\n" +
                                    "<p><strong>Input:</strong> Historical stock prices.</p>\n" +
                                    "<p><strong>Goal:</strong> Predict future prices.</p>\n" +
                                    "<p><strong>Process:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>Each time step represents one day's stock price.</li>\n" +
                                    "    <li>The RNN learns patterns in the price changes over time.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5. Example Python Code</h2>\n" +
                                    "<pre>\n" +
                                    "import numpy as np\n" +
                                    "from tensorflow.keras.models import Sequential\n" +
                                    "from tensorflow.keras.layers import SimpleRNN, Dense\n" +
                                    "\n" +
                                    "# Generate toy sequential data\n" +
                                    "time_steps = 10\n" +
                                    "input_features = 1\n" +
                                    "output_features = 1\n" +
                                    "\n" +
                                    "X_train = np.random.rand(1000, time_steps, input_features)  # 1000 sequences\n" +
                                    "y_train = np.random.rand(1000, output_features)             # 1000 outputs\n" +
                                    "\n" +
                                    "# Define RNN Model\n" +
                                    "model = Sequential([\n" +
                                    "    SimpleRNN(32, activation='tanh', input_shape=(time_steps, input_features)),\n" +
                                    "    Dense(output_features, activation='linear')\n" +
                                    "])\n" +
                                    "\n" +
                                    "# Compile the model\n" +
                                    "model.compile(optimizer='adam', loss='mse')\n" +
                                    "\n" +
                                    "# Train the model\n" +
                                    "model.fit(X_train, y_train, epochs=10, batch_size=32)\n" +
                                    "\n" +
                                    "# Summary of the model\n" +
                                    "model.summary()\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>6. Limitations of Standard RNNs</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Vanishing Gradient Problem:</strong> During training, gradients can become very small, leading to difficulty in learning long-term dependencies.</li>\n" +
                                    "    <li><strong>Exploding Gradient Problem:</strong> Gradients can grow too large, causing instability in training.</li>\n" +
                                    "    <li><strong>Short-Term Memory:</strong> Standard RNNs struggle to retain information over long sequences.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>7. Variants of RNNs</h2>\n" +
                                    "<p>To address the limitations, advanced RNN architectures have been developed:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Long Short-Term Memory (LSTM):</strong> Uses gates to control the flow of information, enabling better handling of long-term dependencies.</li>\n" +
                                    "    <li><strong>Gated Recurrent Unit (GRU):</strong> A simpler alternative to LSTM with comparable performance.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(44, 15, "Long Short-Term Memory (LSTM)", 2, "<h1>1. Introduction to Long Short-Term Memory (LSTM)</h1>\n" +
                                    "<p>Long Short-Term Memory (LSTM) is a special type of Recurrent Neural Network (RNN) designed to overcome the vanishing gradient problem and effectively learn long-term dependencies in sequential data. LSTMs achieve this by using a carefully designed memory cell and gating mechanism, which allows them to selectively retain or discard information over time.</p>\n" +
                                    "\n" +
                                    "<h2>2. Challenges with Standard RNNs</h2>\n" +
                                    "<p>The primary limitation of standard RNNs is their inability to capture long-term dependencies in sequences. This is caused by:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Vanishing Gradients:</strong> Gradients become too small to update weights effectively during backpropagation through time (BPTT).</li>\n" +
                                    "    <li><strong>Exploding Gradients:</strong> Occasionally, gradients become excessively large, causing instability.</li>\n" +
                                    "</ul>\n" +
                                    "<p>These issues make standard RNNs unsuitable for tasks that require understanding context over long sequences, such as text generation or video analysis.</p>\n" +
                                    "\n" +
                                    "<h2>3. LSTM Architecture</h2>\n" +
                                    "<p>LSTMs address these challenges by introducing a memory cell and three gates:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Forget Gate:</strong> Determines which information to discard from the cell state.</li>\n" +
                                    "    <li><strong>Input Gate:</strong> Controls what new information to add to the cell state.</li>\n" +
                                    "    <li><strong>Output Gate:</strong> Decides what part of the cell state to output as the hidden state.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>1. Memory Cell</h3>\n" +
                                    "<p>The memory cell (<code>C<sub>t</sub></code>) acts as a conveyor belt, allowing information to flow through the sequence with minimal modifications, mitigating vanishing gradients.</p>\n" +
                                    "\n" +
                                    "<h3>2. Gates</h3>\n" +
                                    "<p>Each gate is implemented using a sigmoid activation function (<code>σ</code>), which outputs a value between 0 (completely discard) and 1 (completely keep). This selective flow of information enables the LSTM to learn both short-term and long-term dependencies.</p>\n" +
                                    "\n" +
                                    "<h2>4. LSTM Equations</h2>\n" +
                                    "<p>At each time step <code>t</code>:</p>\n" +
                                    "\n" +
                                    "<h3>Forget Gate</h3>\n" +
                                    "<pre>\n" +
                                    "f<sub>t</sub> = σ(W<sub>f</sub> ⋅ [h<sub>t-1</sub>, x<sub>t</sub>] + b<sub>f</sub>)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h3>Input Gate</h3>\n" +
                                    "<pre>\n" +
                                    "i<sub>t</sub> = σ(W<sub>i</sub> ⋅ [h<sub>t-1</sub>, x<sub>t</sub>] + b<sub>i</sub>)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h3>Candidate Cell State</h3>\n" +
                                    "<pre>\n" +
                                    "C<sub>t~</sub> = tanh(W<sub>C</sub> ⋅ [h<sub>t-1</sub>, x<sub>t</sub>] + b<sub>C</sub>)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h3>Update Cell State</h3>\n" +
                                    "<pre>\n" +
                                    "C<sub>t</sub> = f<sub>t</sub> ⋅ C<sub>t-1</sub> + i<sub>t</sub> ⋅ C<sub>t~</sub>\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h3>Output Gate</h3>\n" +
                                    "<pre>\n" +
                                    "o<sub>t</sub> = σ(W<sub>o</sub> ⋅ [h<sub>t-1</sub>, x<sub>t</sub>] + b<sub>o</sub>)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h3>Hidden State</h3>\n" +
                                    "<pre>\n" +
                                    "h<sub>t</sub> = o<sub>t</sub> ⋅ tanh(C<sub>t</sub>)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>5. How LSTMs Solve the Vanishing Gradient Problem</h2>\n" +
                                    "<ul>\n" +
                                    "    <li>The cell state (<code>C<sub>t</sub></code>) is updated through element-wise addition and multiplication, minimizing the accumulation of vanishing gradients.</li>\n" +
                                    "    <li>The gates allow gradients to flow more effectively during backpropagation, ensuring that relevant information persists over long sequences.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>6. Applications of LSTMs</h2>\n" +
                                    "<h3>1. Natural Language Processing (NLP)</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Text Generation:</strong> Generating coherent sentences or paragraphs.</li>\n" +
                                    "    <li><strong>Machine Translation:</strong> Translating sentences between languages.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Time Series Prediction</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Stock Price Forecasting:</strong> Predicting future trends based on historical data.</li>\n" +
                                    "    <li><strong>Weather Prediction:</strong> Estimating future weather patterns.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>3. Speech Processing</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Speech Recognition:</strong> Converting audio into text.</li>\n" +
                                    "    <li><strong>Speech Synthesis:</strong> Generating human-like speech.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>7. Example Python Implementation of LSTM</h2>\n" +
                                    "<pre>\n" +
                                    "import numpy as np\n" +
                                    "from tensorflow.keras.models import Sequential\n" +
                                    "from tensorflow.keras.layers import LSTM, Dense\n" +
                                    "\n" +
                                    "# Generate toy sequential data\n" +
                                    "time_steps = 10\n" +
                                    "input_features = 1\n" +
                                    "output_features = 1\n" +
                                    "\n" +
                                    "X_train = np.random.rand(1000, time_steps, input_features)  # 1000 sequences\n" +
                                    "y_train = np.random.rand(1000, output_features)             # 1000 outputs\n" +
                                    "\n" +
                                    "# Define LSTM Model\n" +
                                    "model = Sequential([\n" +
                                    "    LSTM(50, activation='tanh', input_shape=(time_steps, input_features)),\n" +
                                    "    Dense(output_features, activation='linear')\n" +
                                    "])\n" +
                                    "\n" +
                                    "# Compile the model\n" +
                                    "model.compile(optimizer='adam', loss='mse')\n" +
                                    "\n" +
                                    "# Train the model\n" +
                                    "model.fit(X_train, y_train, epochs=10, batch_size=32)\n" +
                                    "\n" +
                                    "# Summary of the model\n" +
                                    "model.summary()\n" +
                                    "</pre>\n", "2024-11-02", "2024-11-02"),
                            Unit(45, 15, "RNN for Time-Series Forecasting", 3, "<h1>1. Introduction to Time-Series Forecasting with RNNs</h1>\n" +
                                    "<p>Time-series forecasting involves predicting future values based on historical data. Recurrent Neural Networks (RNNs) are well-suited for this task because they can process sequential data and retain information about previous time steps. By leveraging their recurrent architecture, RNNs can learn temporal patterns and dependencies, making them powerful tools for forecasting applications like weather prediction, stock market analysis, and energy demand estimation.</p>\n" +
                                    "\n" +
                                    "<h2>2. Why Use RNNs for Time-Series Forecasting?</h2>\n" +
                                    "<h3>1. Capturing Temporal Dependencies</h3>\n" +
                                    "<p>RNNs maintain a hidden state that stores information about previous inputs, enabling them to capture relationships between past and future values.</p>\n" +
                                    "\n" +
                                    "<h3>2. Sequential Nature</h3>\n" +
                                    "<p>Time-series data is inherently sequential, and RNNs are designed to handle sequences, processing data one step at a time.</p>\n" +
                                    "\n" +
                                    "<h3>3. Flexibility</h3>\n" +
                                    "<p>RNNs can handle varying input lengths, making them adaptable to different forecasting problems.</p>\n" +
                                    "\n" +
                                    "<h2>3. Steps to Apply RNNs for Time-Series Forecasting</h2>\n" +
                                    "<h3>1. Data Preparation</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Collect Historical Data:</strong> Gather past observations of the variable you want to predict.</li>\n" +
                                    "    <li><strong>Sliding Window Technique:</strong> Segment the time-series into overlapping sequences. Example: If your series is <code>[x<sub>1</sub>, x<sub>2</sub>, x<sub>3</sub>, ..., x<sub>T</sub>]</code>, use <code>[x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>k</sub>]</code> to predict <code>x<sub>k+1</sub></code>.</li>\n" +
                                    "    <li><strong>Normalize the Data:</strong> Scale the values to a range (e.g., 0 to 1) to improve model training stability.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Build the RNN Model</h3>\n" +
                                    "<ul>\n" +
                                    "    <li>Choose an RNN variant (e.g., standard RNN, LSTM, or GRU) based on the complexity of the problem.</li>\n" +
                                    "    <li>Define the architecture with an input layer, one or more RNN layers, and an output layer.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>3. Train the Model</h3>\n" +
                                    "<ul>\n" +
                                    "    <li>Use historical data to train the model by minimizing the error between predicted and actual values.</li>\n" +
                                    "    <li>Apply techniques like early stopping to prevent overfitting.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>4. Make Predictions</h3>\n" +
                                    "<ul>\n" +
                                    "    <li>Use the trained model to predict future values step by step.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Example Python Implementation</h2>\n" +
                                    "<pre>\n" +
                                    "import numpy as np\n" +
                                    "from tensorflow.keras.models import Sequential\n" +
                                    "from tensorflow.keras.layers import LSTM, Dense\n" +
                                    "\n" +
                                    "# Generate synthetic time-series data\n" +
                                    "time_steps = 10  # Number of previous steps to consider\n" +
                                    "num_samples = 1000\n" +
                                    "\n" +
                                    "# Create a sine wave as a sample time-series\n" +
                                    "x = np.linspace(0, 100, num_samples)\n" +
                                    "y = np.sin(x)\n" +
                                    "\n" +
                                    "# Prepare the dataset\n" +
                                    "X = []\n" +
                                    "y_target = []\n" +
                                    "for i in range(num_samples - time_steps):\n" +
                                    "    X.append(y[i:i+time_steps])  # Input sequence\n" +
                                    "    y_target.append(y[i+time_steps])  # Target value\n" +
                                    "\n" +
                                    "X = np.array(X).reshape(-1, time_steps, 1)  # Reshape to [samples, time_steps, features]\n" +
                                    "y_target = np.array(y_target).reshape(-1, 1)\n" +
                                    "\n" +
                                    "# Split into training and testing sets\n" +
                                    "split = int(0.8 * len(X))\n" +
                                    "X_train, X_test = X[:split], X[split:]\n" +
                                    "y_train, y_test = y_target[:split], y_target[split:]\n" +
                                    "\n" +
                                    "# Define the RNN model with LSTM\n" +
                                    "model = Sequential([\n" +
                                    "    LSTM(50, activation='tanh', input_shape=(time_steps, 1)),\n" +
                                    "    Dense(1, activation='linear')  # Predict a single value\n" +
                                    "])\n" +
                                    "\n" +
                                    "# Compile the model\n" +
                                    "model.compile(optimizer='adam', loss='mse')\n" +
                                    "\n" +
                                    "# Train the model\n" +
                                    "model.fit(X_train, y_train, epochs=20, batch_size=32, validation_split=0.2)\n" +
                                    "\n" +
                                    "# Evaluate the model\n" +
                                    "loss = model.evaluate(X_test, y_test)\n" +
                                    "print(f\"Test Loss: {loss}\")\n" +
                                    "\n" +
                                    "# Make predictions\n" +
                                    "predictions = model.predict(X_test)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>5. Practical Considerations</h2>\n" +
                                    "<h3>1. Hyperparameter Tuning</h3>\n" +
                                    "<ul>\n" +
                                    "    <li>Number of time steps (sliding window size).</li>\n" +
                                    "    <li>Number of neurons in the RNN layer.</li>\n" +
                                    "    <li>Batch size and learning rate.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Handling Non-Stationary Data</h3>\n" +
                                    "<ul>\n" +
                                    "    <li>Apply techniques like differencing or detrending if the data has trends or seasonality.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>3. Feature Engineering</h3>\n" +
                                    "<ul>\n" +
                                    "    <li>Include external factors (e.g., temperature, holidays) as additional features if relevant to the forecasting task.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>4. Performance Metrics</h3>\n" +
                                    "<ul>\n" +
                                    "    <li>Use metrics like Mean Squared Error (MSE), Mean Absolute Error (MAE), or Root Mean Squared Error (RMSE) to evaluate the model.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02")
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
                            Unit(46, 16, "K-Means Clustering", 1, "<h1>1. Introduction to K-Means Clustering</h1>\n" +
                                    "<p>K-Means clustering is one of the most popular unsupervised machine learning algorithms used to partition data into distinct groups (clusters). The algorithm works by minimizing the variance within each cluster and maximizing the variance between clusters. It is widely used for tasks like market segmentation, image compression, and anomaly detection.</p>\n" +
                                    "\n" +
                                    "<h2>2. Key Concepts in K-Means Clustering</h2>\n" +
                                    "<h3>1. Unsupervised Learning</h3>\n" +
                                    "<p>K-Means is an unsupervised learning algorithm, meaning that it does not require labeled data. Instead, it learns the inherent structure of the data by grouping similar data points together.</p>\n" +
                                    "\n" +
                                    "<h3>2. Clusters</h3>\n" +
                                    "<p>A cluster is a collection of similar data points. The K-Means algorithm assigns each data point to a cluster based on the similarity between the data points and the cluster's centroid.</p>\n" +
                                    "\n" +
                                    "<h3>3. Centroid</h3>\n" +
                                    "<p>A centroid is the \"center\" of a cluster, representing the average position of all data points within the cluster. The centroid is recalculated in each iteration to ensure that the cluster is as compact as possible.</p>\n" +
                                    "\n" +
                                    "<h2>3. K-Means Algorithm Steps</h2>\n" +
                                    "<p>K-Means works by following a simple iterative procedure:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Initialization:</strong>\n" +
                                    "        <p>Choose the number of clusters, <em>K</em>. Randomly initialize <em>K</em> centroids, either by selecting random data points or using methods like the K-Means++ initialization.</p>\n" +
                                    "    </li>\n" +
                                    "    <li><strong>Assign Points to Closest Centroid:</strong>\n" +
                                    "        <p>For each data point, compute the distance to each centroid (typically using Euclidean distance). Assign each data point to the nearest centroid. This forms the clusters.</p>\n" +
                                    "    </li>\n" +
                                    "    <li><strong>Update Centroids:</strong>\n" +
                                    "        <p>Once all points are assigned to clusters, recalculate the centroids by finding the mean of all data points within each cluster.</p>\n" +
                                    "    </li>\n" +
                                    "    <li><strong>Repeat:</strong>\n" +
                                    "        <p>Repeat steps 2 and 3 until the centroids no longer change significantly, indicating that the algorithm has converged.</p>\n" +
                                    "    </li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. K-Means Objective</h2>\n" +
                                    "<p>The goal of K-Means is to minimize the within-cluster sum of squares (WCSS), also known as the inertia or distortion, which measures how compact the clusters are.</p>\n" +
                                    "\n" +
                                    "<pre>\n" +
                                    "WCSS = ∑(i=1 to K) ∑(xj ∈ Ci) || xj - μi ||²\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><em>K</em> is the number of clusters.</li>\n" +
                                    "    <li><em>Ci</em> is the set of points in the <em>i</em><sup>th</sup> cluster.</li>\n" +
                                    "    <li><em>μi</em> is the centroid of cluster <em>Ci</em>.</li>\n" +
                                    "    <li><em>xj</em> is a data point in <em>Ci</em>.</li>\n" +
                                    "    <li><em>||xj - μi||²</em> is the squared Euclidean distance between point <em>xj</em> and centroid <em>μi</em>.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The algorithm iterates to minimize this quantity, producing well-separated and compact clusters.</p>\n" +
                                    "\n" +
                                    "<h2>5. K-Means Algorithm Example</h2>\n" +
                                    "<p>Let's say we want to apply K-Means clustering to a dataset with two features (e.g., height and weight of individuals) to group them into <em>K=3</em> clusters. Here's how we would approach the problem step by step:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Initialization:</strong> Suppose we initialize 3 centroids randomly from the dataset. The centroids might represent three groups: light, medium, and heavy individuals.</li>\n" +
                                    "    <li><strong>Assign Points to Clusters:</strong> For each individual, calculate the distance from each centroid (e.g., Euclidean distance). Each individual is assigned to the closest centroid.</li>\n" +
                                    "    <li><strong>Update Centroids:</strong> After assigning the individuals to the clusters, recalculate the centroids by averaging the height and weight of all individuals in each group.</li>\n" +
                                    "    <li><strong>Repeat:</strong> Reassign individuals to the closest centroid based on the new centroids and update the centroids again. Repeat this process until the centroids stabilize.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>6. Evaluation of K-Means</h2>\n" +
                                    "<h3>1. Choosing the Value of K</h3>\n" +
                                    "<p>Choosing the optimal number of clusters <em>K</em> is a crucial step. Several methods can be used to determine the best value of <em>K</em>:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Elbow Method:</strong> Plot the WCSS against different values of <em>K</em> and look for an \"elbow,\" where the rate of decrease in WCSS slows down. This is considered the optimal number of clusters.</li>\n" +
                                    "    <li><strong>Silhouette Score:</strong> A silhouette score measures how similar an object is to its own cluster compared to other clusters. A high silhouette score indicates that the clustering is well-formed.</li>\n" +
                                    "    <li><strong>Gap Statistic:</strong> Compares the total WCSS with that expected under a null reference distribution of the data to help determine the number of clusters.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Scalability</h3>\n" +
                                    "<p>K-Means is generally scalable and efficient, but its performance can degrade with very large datasets. The algorithm’s time complexity is <em>O(n ⋅ K ⋅ t)</em>, where <em>n</em> is the number of data points, <em>K</em> is the number of clusters, and <em>t</em> is the number of iterations.</p>\n" +
                                    "\n" +
                                    "<h3>3. Limitations</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Sensitivity to Initialization:</strong> K-Means can converge to a local minimum, and different initializations can produce different results. This is addressed by using multiple initializations (K-Means++).</li>\n" +
                                    "    <li><strong>Assumes Spherical Clusters:</strong> K-Means works best when clusters are spherical and evenly sized, which may not be true for all datasets.</li>\n" +
                                    "    <li><strong>Outliers:</strong> K-Means is sensitive to outliers, as they can heavily influence the position of centroids.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>7. K-Means Python Implementation</h2>\n" +
                                    "<p>Here is a Python implementation of the K-Means algorithm using the scikit-learn library:</p>\n" +
                                    "\n" +
                                    "<pre>\n" +
                                    "import numpy as np\n" +
                                    "import matplotlib.pyplot as plt\n" +
                                    "from sklearn.cluster import KMeans\n" +
                                    "from sklearn.datasets import make_blobs\n" +
                                    "\n" +
                                    "# Generate synthetic data\n" +
                                    "X, _ = make_blobs(n_samples=100, centers=3, cluster_std=0.60, random_state=0)\n" +
                                    "\n" +
                                    "# Determine the optimal number of clusters using the Elbow Method\n" +
                                    "wcss = []\n" +
                                    "for i in range(1, 11):\n" +
                                    "    kmeans = KMeans(n_clusters=i, init='k-means++', max_iter=300, n_init=10, random_state=0)\n" +
                                    "    kmeans.fit(X)\n" +
                                    "    wcss.append(kmeans.inertia_)\n" +
                                    "\n" +
                                    "# Plot WCSS for different K values\n" +
                                    "plt.plot(range(1, 11), wcss)\n" +
                                    "plt.title('Elbow Method')\n" +
                                    "plt.xlabel('Number of Clusters')\n" +
                                    "plt.ylabel('WCSS')\n" +
                                    "plt.show()\n" +
                                    "\n" +
                                    "# Fit K-Means with the optimal K value (3 clusters in this case)\n" +
                                    "kmeans = KMeans(n_clusters=3, init='k-means++', max_iter=300, n_init=10, random_state=0)\n" +
                                    "y_kmeans = kmeans.fit_predict(X)\n" +
                                    "\n" +
                                    "# Plot the clusters\n" +
                                    "plt.scatter(X[:, 0], X[:, 1], c=y_kmeans, s=50, cmap='viridis')\n" +
                                    "plt.scatter(kmeans.cluster_centers_[:, 0], kmeans.cluster_centers_[:, 1], s=200, c='red', label='Centroids')\n" +
                                    "plt.title('K-Means Clustering')\n" +
                                    "plt.xlabel('Feature 1')\n" +
                                    "plt.ylabel('Feature 2')\n" +
                                    "plt.legend()\n" +
                                    "plt.show()\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<p>In this example, we generate synthetic data with three clusters and use the Elbow Method to find the optimal number of clusters. The clusters are then visualized along with the centroids.</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(47, 16, "DBSCAN", 2, "<h1>1. Introduction to DBSCAN</h1>\n" +
                                    "<p>DBSCAN (Density-Based Spatial Clustering of Applications with Noise) is a clustering algorithm that focuses on the density of data points to form clusters. Unlike K-Means, which requires a predefined number of clusters, DBSCAN automatically finds clusters of varying shapes and sizes, making it particularly effective for datasets with noise and outliers. It is widely applied in fields like geospatial analysis, anomaly detection, and image segmentation.</p>\n" +
                                    "\n" +
                                    "<h2>2. Key Concepts in DBSCAN</h2>\n" +
                                    "\n" +
                                    "<h3>1. Density-Based Clustering</h3>\n" +
                                    "<p>DBSCAN creates clusters based on the density of points, where dense regions of points are considered a cluster, and sparser regions are seen as noise. The algorithm identifies three types of points:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Core Points:</strong> Points that have at least <em>MinPts</em> points within a radius of <em>ϵ</em>.</li>\n" +
                                    "    <li><strong>Border Points:</strong> Points that are within the <em>ϵ</em>-radius of a core point but do not have enough neighbors to be core points themselves.</li>\n" +
                                    "    <li><strong>Noise Points:</strong> Points that are neither core nor border points, often representing outliers.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Parameters of DBSCAN</h3>\n" +
                                    "<p>DBSCAN requires two important parameters:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>ϵ (Epsilon):</strong> The maximum radius that defines the neighborhood of a point.</li>\n" +
                                    "    <li><strong>MinPts:</strong> The minimum number of points required to form a dense region (core point).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. DBSCAN Algorithm Steps</h2>\n" +
                                    "<ol>\n" +
                                    "    <li><strong>Initialization:</strong> Set the <em>ϵ</em> and <em>MinPts</em> values and mark all data points as unvisited.</li>\n" +
                                    "    <li><strong>Explore Core Points:</strong> Check if a point has at least <em>MinPts</em> neighbors within the <em>ϵ</em>-radius. If it does, it is marked as a core point, and a new cluster is created.</li>\n" +
                                    "    <li><strong>Expand Clusters:</strong> The algorithm expands the cluster by recursively adding neighboring points of core points.</li>\n" +
                                    "    <li><strong>Mark Noise Points:</strong> Points that don't meet the core or border point criteria are considered noise.</li>\n" +
                                    "    <li><strong>Repeat:</strong> This process continues until all points are visited.</li>\n" +
                                    "</ol>\n" +
                                    "\n" +
                                    "<h2>4. Example of DBSCAN</h2>\n" +
                                    "<p>Consider a dataset of points in 2D space:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>ϵ = 0.5</strong> (radius) and <strong>MinPts = 3</strong> (minimum number of points for a core point).</li>\n" +
                                    "    <li>Points that have at least 3 neighbors within the 0.5 radius become core points.</li>\n" +
                                    "    <li>Neighboring points of core points form clusters, while points that are too far apart or don't meet the core point criteria are marked as noise.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5. DBSCAN Distance Measure</h2>\n" +
                                    "<p>DBSCAN typically uses <strong>Euclidean distance</strong> to calculate the distance between points:</p>\n" +
                                    "<pre>\n" +
                                    "d(P1, P2) = sqrt((x2 - x1)^2 + (y2 - y1)^2)\n" +
                                    "</pre>\n" +
                                    "<p>If the distance between two points is less than or equal to <em>ϵ</em>, they are considered neighbors.</p>\n" +
                                    "\n" +
                                    "<h2>6. Advantages of DBSCAN</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Arbitrary Shapes:</strong> Can detect clusters of any shape, not limited to spherical clusters.</li>\n" +
                                    "    <li><strong>No Need for Predefined Clusters:</strong> Unlike K-Means, DBSCAN does not require you to specify the number of clusters.</li>\n" +
                                    "    <li><strong>Noise Robustness:</strong> DBSCAN can effectively handle noise and outliers by classifying them as noise points.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>7. Disadvantages of DBSCAN</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Sensitive to Parameters:</strong> The performance of DBSCAN is highly sensitive to the choice of <em>ϵ</em> and <em>MinPts</em>. Incorrect choices can lead to poor clustering.</li>\n" +
                                    "    <li><strong>Varying Density:</strong> DBSCAN struggles with data that has clusters of varying densities, as it assumes all clusters have similar density.</li>\n" +
                                    "    <li><strong>High Dimensionality:</strong> In high-dimensional spaces, the concept of density becomes less meaningful, and DBSCAN's performance can degrade.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>8. DBSCAN Python Implementation</h2>\n" +
                                    "<p>Here's an example of applying DBSCAN using Python's scikit-learn library:</p>\n" +
                                    "\n" +
                                    "<pre>\n" +
                                    "import numpy as np\n" +
                                    "import matplotlib.pyplot as plt\n" +
                                    "from sklearn.cluster import DBSCAN\n" +
                                    "from sklearn.datasets import make_blobs\n" +
                                    "\n" +
                                    "# Generate synthetic data with noise\n" +
                                    "X, _ = make_blobs(n_samples=300, centers=3, cluster_std=0.60, random_state=0)\n" +
                                    "\n" +
                                    "# Add some random noise\n" +
                                    "X = np.vstack([X, np.random.rand(50, 2) * 10])\n" +
                                    "\n" +
                                    "# Apply DBSCAN\n" +
                                    "db = DBSCAN(eps=1, min_samples=5)\n" +
                                    "y_db = db.fit_predict(X)\n" +
                                    "\n" +
                                    "# Plot the clusters\n" +
                                    "plt.scatter(X[:, 0], X[:, 1], c=y_db, cmap='viridis')\n" +
                                    "plt.title('DBSCAN Clustering')\n" +
                                    "plt.xlabel('Feature 1')\n" +
                                    "plt.ylabel('Feature 2')\n" +
                                    "plt.show()\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h3>Explanation:</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Data Generation:</strong> The dataset is synthetically created with 3 clusters and added noise.</li>\n" +
                                    "    <li><strong>DBSCAN Application:</strong> DBSCAN is applied with <em>ϵ = 1</em> and <em>MinPts = 5</em>.</li>\n" +
                                    "    <li><strong>Plotting:</strong> The clusters are visualized, with different colors representing different clusters. Noise points are typically labeled as <code>-1</code>.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(48, 16, "Clustering Evaluation", 3, "<h1>1. Introduction to Clustering Evaluation</h1>\n" +
                                    "<p>\n" +
                                    "Clustering is an unsupervised learning technique where the goal is to group similar data points together into clusters. Unlike supervised learning, where we have labeled data to compare against, clustering evaluation is more challenging because we typically don't know the \"true\" cluster labels. As a result, various metrics are used to assess how well a clustering algorithm has performed, based on the similarity of the clusters, their compactness, and their separation.\n" +
                                    "</p>\n" +
                                    "<p>Evaluating clustering results can be done using two types of metrics:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Internal evaluation metrics:</strong> These are based solely on the dataset and measure the quality of the clustering without reference to external data or true labels.</li>\n" +
                                    "    <li><strong>External evaluation metrics:</strong> These compare the clustering results to ground truth labels (if available).</li>\n" +
                                    "</ul>\n" +
                                    "<p>In this module, we will explore common clustering evaluation metrics in both categories.</p>\n" +
                                    "\n" +
                                    "<h2>2. Internal Evaluation Metrics</h2>\n" +
                                    "<p>Internal metrics assess the clustering quality based on the intrinsic properties of the clusters, such as their compactness (how close the data points within a cluster are) and their separation (how distinct the clusters are from each other).</p>\n" +
                                    "\n" +
                                    "<h3>1. Silhouette Score</h3>\n" +
                                    "<p>The silhouette score measures how similar each point is to its own cluster compared to other clusters. It provides an indication of both the cohesion and separation of the clusters.</p>\n" +
                                    "<p><strong>Formula:</strong></p>\n" +
                                    "<pre>\n" +
                                    "S(i) = (b(i) - a(i)) / max(a(i), b(i))\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>a(i):</strong> The average distance between point <em>i</em> and all other points in the same cluster.</li>\n" +
                                    "    <li><strong>b(i):</strong> The average distance between point <em>i</em> and all points in the nearest cluster.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Interpretation:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li>A silhouette score close to +1 indicates that the points are well-clustered.</li>\n" +
                                    "    <li>A score close to 0 means the point lies between two clusters.</li>\n" +
                                    "    <li>A negative score suggests that the point may have been assigned to the wrong cluster.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example:</strong></p>\n" +
                                    "<pre>\n" +
                                    "from sklearn.metrics import silhouette_score\n" +
                                    "from sklearn.cluster import DBSCAN\n" +
                                    "from sklearn.datasets import make_blobs\n" +
                                    "\n" +
                                    "# Generate synthetic data\n" +
                                    "X, _ = make_blobs(n_samples=300, centers=3, random_state=42)\n" +
                                    "\n" +
                                    "# Apply DBSCAN\n" +
                                    "db = DBSCAN(eps=0.5, min_samples=5)\n" +
                                    "y_db = db.fit_predict(X)\n" +
                                    "\n" +
                                    "# Calculate the silhouette score\n" +
                                    "score = silhouette_score(X, y_db)\n" +
                                    "print(f'Silhouette Score: {score}')\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h3>2. Davies-Bouldin Index</h3>\n" +
                                    "<p>The Davies-Bouldin index measures the average similarity ratio of each cluster with respect to the one that is most similar to it. A lower Davies-Bouldin index indicates better clustering.</p>\n" +
                                    "<p><strong>Formula:</strong></p>\n" +
                                    "<pre>\n" +
                                    "DB = (1/N) * Σ(max((σ_i + σ_j) / d(C_i, C_j)))\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>σ_i, σ_j:</strong> The standard deviations (spread) of clusters <em>C_i</em> and <em>C_j</em>.</li>\n" +
                                    "    <li><strong>d(C_i, C_j):</strong> The distance between the centroids of clusters <em>C_i</em> and <em>C_j</em>.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Interpretation:</strong> A smaller Davies-Bouldin index indicates better clustering.</p>\n" +
                                    "<p><strong>Example:</strong></p>\n" +
                                    "<pre>\n" +
                                    "from sklearn.metrics import davies_bouldin_score\n" +
                                    "from sklearn.cluster import KMeans\n" +
                                    "\n" +
                                    "# Generate synthetic data\n" +
                                    "X, _ = make_blobs(n_samples=300, centers=3, random_state=42)\n" +
                                    "\n" +
                                    "# Apply KMeans clustering\n" +
                                    "kmeans = KMeans(n_clusters=3)\n" +
                                    "y_kmeans = kmeans.fit_predict(X)\n" +
                                    "\n" +
                                    "# Calculate the Davies-Bouldin score\n" +
                                    "score_db = davies_bouldin_score(X, y_kmeans)\n" +
                                    "print(f'Davies-Bouldin Index: {score_db}')\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h3>3. Inertia (Within-Cluster Sum of Squares)</h3>\n" +
                                    "<p>Inertia measures the compactness of the clusters by calculating the sum of squared distances from each point to the centroid of the cluster it belongs to.</p>\n" +
                                    "<p><strong>Formula:</strong></p>\n" +
                                    "<pre>\n" +
                                    "Inertia = Σ Σ ||x_j - μ_i||²\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>C_i:</strong> The set of points in cluster <em>i</em>.</li>\n" +
                                    "    <li><strong>x_j:</strong> A data point in cluster <em>C_i</em>.</li>\n" +
                                    "    <li><strong>μ_i:</strong> The centroid of cluster <em>C_i</em>.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Interpretation:</strong> A smaller inertia indicates better clustering.</p>\n" +
                                    "<p><strong>Example:</strong></p>\n" +
                                    "<pre>\n" +
                                    "from sklearn.cluster import KMeans\n" +
                                    "\n" +
                                    "# Generate synthetic data\n" +
                                    "X, _ = make_blobs(n_samples=300, centers=3, random_state=42)\n" +
                                    "\n" +
                                    "# Apply KMeans clustering\n" +
                                    "kmeans = KMeans(n_clusters=3)\n" +
                                    "kmeans.fit(X)\n" +
                                    "\n" +
                                    "# Get the inertia value\n" +
                                    "inertia = kmeans.inertia_\n" +
                                    "print(f'Inertia: {inertia}')\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>3. External Evaluation Metrics</h2>\n" +
                                    "<p>External metrics evaluate clustering performance by comparing the results against a known set of true labels.</p>\n" +
                                    "\n" +
                                    "<h3>1. Adjusted Rand Index (ARI)</h3>\n" +
                                    "<p>The Adjusted Rand Index measures the similarity between two data clusterings while correcting for the chance grouping of elements.</p>\n" +
                                    "<p><strong>Example:</strong></p>\n" +
                                    "<pre>\n" +
                                    "from sklearn.metrics import adjusted_rand_score\n" +
                                    "from sklearn.cluster import KMeans\n" +
                                    "from sklearn.datasets import make_blobs\n" +
                                    "\n" +
                                    "# Generate synthetic data with true labels\n" +
                                    "X, y_true = make_blobs(n_samples=300, centers=3, random_state=42)\n" +
                                    "\n" +
                                    "# Apply KMeans clustering\n" +
                                    "kmeans = KMeans(n_clusters=3)\n" +
                                    "y_pred = kmeans.fit_predict(X)\n" +
                                    "\n" +
                                    "# Calculate Adjusted Rand Index\n" +
                                    "ari = adjusted_rand_score(y_true, y_pred)\n" +
                                    "print(f'Adjusted Rand Index: {ari}')\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h3>2. Fowlkes-Mallows Index (FMI)</h3>\n" +
                                    "<p>The Fowlkes-Mallows Index measures the similarity between the clusters and the true labels based on the geometric mean of the pairwise precision and recall.</p>\n" +
                                    "<p><strong>Example:</strong></p>\n" +
                                    "<pre>\n" +
                                    "from sklearn.metrics import fowlkes_mallows_score\n" +
                                    "from sklearn.cluster import KMeans\n" +
                                    "\n" +
                                    "# Generate synthetic data with true labels\n" +
                                    "X, y_true = make_blobs(n_samples=300, centers=3, random_state=42)\n" +
                                    "\n" +
                                    "# Apply KMeans clustering\n" +
                                    "kmeans = KMeans(n_clusters=3)\n" +
                                    "y_pred = kmeans.fit_predict(X)\n" +
                                    "\n" +
                                    "# Calculate Fowlkes-Mallows Index\n" +
                                    "fmi = fowlkes_mallows_score(y_true, y_pred)\n" +
                                    "print(f'Fowlkes-Mallows Index: {fmi}')\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>4. Summary of Clustering Evaluation Metrics</h2>\n" +
                                    "<table>\n" +
                                    "    <thead>\n" +
                                    "        <tr>\n" +
                                    "            <th>Metric</th>\n" +
                                    "            <th>Type</th>\n" +
                                    "            <th>Interpretation</th>\n" +
                                    "            <th>Use Case</th>\n" +
                                    "        </tr>\n" +
                                    "    </thead>\n" +
                                    "    <tbody>\n" +
                                    "        <tr>\n" +
                                    "            <td>Silhouette Score</td>\n" +
                                    "            <td>Internal</td>\n" +
                                    "            <td>Measures how similar points are within their cluster versus others.</td>\n" +
                                    "            <td>Useful for assessing cluster cohesion and separation.</td>\n" +
                                    "        </tr>\n" +
                                    "        <tr>\n" +
                                    "            <td>Davies-Bouldin Index</td>\n" +
                                    "            <td>Internal</td>\n" +
                                    "            <td>Measures the ratio of within-cluster dispersion to between-cluster distance.</td>\n" +
                                    "            <td>Lower value indicates better clustering.</td>\n" +
                                    "        </tr>\n" +
                                    "        <tr>\n" +
                                    "            <td>Inertia</td>\n" +
                                    "            <td>Internal</td>\n" +
                                    "            <td>Measures compactness of clusters in terms of distance from centroids.</td>\n" +
                                    "            <td>Commonly used with K-Means clustering.</td>\n" +
                                    "        </tr>\n" +
                                    "        <tr>\n" +
                                    "            <td>Adjusted Rand Index (ARI)</td>\n" +
                                    "            <td>External</td>\n" +
                                    "            <td>Compares the clustering to true labels, correcting for chance.</td>\n" +
                                    "            <td>Used when true labels are available for comparison.</td>\n" +
                                    "        </tr>\n" +
                                    "        <tr>\n" +
                                    "            <td>Fowlkes-Mallows Index (FMI)</td>\n" +
                                    "            <td>External</td>\n" +
                                    "            <td>Measures the geometric mean of pairwise precision and recall.</td>\n" +
                                    "            <td>Useful when true labels are available to assess clustering quality.</td>\n" +
                                    "        </tr>\n" +
                                    "    </tbody>\n" +
                                    "</table>\n", "2024-11-02", "2024-11-02")
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
                            Unit(49, 17, "PCA (Principal Component Analysis)", 1, "<h1>Introduction to Principal Component Analysis (PCA)</h1>\n" +
                                    "<p>\n" +
                                    "    Principal Component Analysis (PCA) is a statistical technique used for dimensionality reduction, feature extraction, and data visualization. By transforming data into a set of orthogonal components, PCA allows us to reduce the number of features in a dataset while retaining as much variance as possible.\n" +
                                    "</p>\n" +
                                    "\n" +
                                    "<h2>Key Concepts of PCA</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Variance:</strong> Measures how much data points differ from the mean. PCA seeks to maximize variance, ensuring that the most important information in the dataset is retained.</li>\n" +
                                    "    <li><strong>Principal Components:</strong> Linear combinations of the original features, capturing directions of maximum variance.</li>\n" +
                                    "    <li><strong>Dimensionality Reduction:</strong> Reducing the number of features by selecting the most significant components.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>How PCA Works</h2>\n" +
                                    "<ol>\n" +
                                    "    <li><strong>Standardization:</strong> Standardize the dataset to ensure features contribute equally to PCA.</li>\n" +
                                    "    <li><strong>Covariance Matrix:</strong> Compute the relationships between features to identify directions of maximum variance.</li>\n" +
                                    "    <li><strong>Eigenvalues and Eigenvectors:</strong> Calculate to determine the magnitude and direction of variance.</li>\n" +
                                    "    <li><strong>Sort Principal Components:</strong> Select components with the highest eigenvalues.</li>\n" +
                                    "    <li><strong>Transform Data:</strong> Project the data onto the new principal components.</li>\n" +
                                    "</ol>\n" +
                                    "\n" +
                                    "<h3>Example Code for PCA in Python</h3>\n" +
                                    "<pre>\n" +
                                    "<code>\n" +
                                    "from sklearn.decomposition import PCA\n" +
                                    "from sklearn.preprocessing import StandardScaler\n" +
                                    "import numpy as np\n" +
                                    "\n" +
                                    "# Sample data\n" +
                                    "data = np.array([[2.5, 2.4],\n" +
                                    "                 [0.5, 0.7],\n" +
                                    "                 [2.2, 2.9],\n" +
                                    "                 [1.9, 2.2],\n" +
                                    "                 [3.1, 3.0],\n" +
                                    "                 [2.3, 2.7]])\n" +
                                    "\n" +
                                    "# Standardize the data\n" +
                                    "scaler = StandardScaler()\n" +
                                    "data_standardized = scaler.fit_transform(data)\n" +
                                    "\n" +
                                    "# Apply PCA\n" +
                                    "pca = PCA(n_components=2)\n" +
                                    "data_pca = pca.fit_transform(data_standardized)\n" +
                                    "print(data_pca)\n" +
                                    "</code>\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>Applications of PCA</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Dimensionality Reduction:</strong> Simplifies data for analysis and reduces computational complexity.</li>\n" +
                                    "    <li><strong>Noise Reduction:</strong> Removes less important components with minimal variance.</li>\n" +
                                    "    <li><strong>Data Visualization:</strong> Projects high-dimensional data into 2D or 3D for visualization.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(50, 17, "t-SNE", 2, "<h1>Introduction to t-SNE (t-Distributed Stochastic Neighbor Embedding)</h1>\n" +
                                    "<p>\n" +
                                    "    t-SNE (t-Distributed Stochastic Neighbor Embedding) is a powerful machine learning algorithm for visualizing high-dimensional data. Unlike dimensionality reduction techniques such as PCA, which aim to preserve global structure, t-SNE is designed to capture and represent local structure in the data. This makes it particularly well-suited for tasks such as clustering and understanding relationships in high-dimensional datasets.\n" +
                                    "</p>\n" +
                                    "<p>\n" +
                                    "    The algorithm reduces the dimensionality of a dataset to two or three dimensions, enabling clear visualization while retaining the similarity relationships of the original data.\n" +
                                    "</p>\n" +
                                    "\n" +
                                    "<h2>Key Concepts of t-SNE</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>High-Dimensional Similarities:</strong> In the original high-dimensional space, t-SNE calculates the probability of similarity between points. Points that are closer together have higher probabilities, and points that are far apart have lower probabilities.</li>\n" +
                                    "    <li><strong>Low-Dimensional Similarities:</strong> In the reduced space (e.g., 2D or 3D), t-SNE attempts to recreate the similarity probabilities from the high-dimensional space, ensuring that points that were close together in the original space remain close in the lower-dimensional space.</li>\n" +
                                    "    <li><strong>Kullback-Leibler Divergence:</strong> To compare the similarity distributions in the high-dimensional and low-dimensional spaces, t-SNE minimizes the Kullback-Leibler (KL) divergence, a measure of difference between probability distributions.</li>\n" +
                                    "    <li><strong>Perplexity:</strong> A key hyperparameter in t-SNE, perplexity controls the balance between local and global structure in the data. It can be thought of as the effective number of neighbors considered for each data point.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>How t-SNE Works</h2>\n" +
                                    "<ol>\n" +
                                    "    <li><strong>Compute Pairwise Similarities:</strong> For each data point, t-SNE calculates a probability distribution over all other points in the dataset, where similar points have higher probabilities.</li>\n" +
                                    "    <li><strong>Map to Low-Dimensional Space:</strong> Randomly initialize the points in a lower-dimensional space (e.g., 2D). Iteratively adjust the positions of points to minimize the KL divergence between the high-dimensional and low-dimensional distributions.</li>\n" +
                                    "    <li><strong>Optimize the Cost Function:</strong> Using gradient descent, t-SNE optimizes the layout of points in the reduced space.</li>\n" +
                                    "</ol>\n" +
                                    "\n" +
                                    "<h2>Visualizing Data with t-SNE</h2>\n" +
                                    "<p>\n" +
                                    "    t-SNE is often used for visualizing data clusters in datasets such as:\n" +
                                    "</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Image data</li>\n" +
                                    "    <li>Text embeddings</li>\n" +
                                    "    <li>Genomic data</li>\n" +
                                    "    <li>Customer segmentation</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example: Applying t-SNE in Python</h3>\n" +
                                    "<pre>\n" +
                                    "<code>\n" +
                                    "import numpy as np\n" +
                                    "import matplotlib.pyplot as plt\n" +
                                    "from sklearn.datasets import load_digits\n" +
                                    "from sklearn.manifold import TSNE\n" +
                                    "\n" +
                                    "# Load the dataset (Digits dataset as an example)\n" +
                                    "digits = load_digits()\n" +
                                    "X = digits.data\n" +
                                    "y = digits.target\n" +
                                    "\n" +
                                    "# Apply t-SNE\n" +
                                    "tsne = TSNE(n_components=2, perplexity=30, random_state=42)\n" +
                                    "X_embedded = tsne.fit_transform(X)\n" +
                                    "\n" +
                                    "# Plot the results\n" +
                                    "plt.scatter(X_embedded[:, 0], X_embedded[:, 1], c=y, cmap='tab10')\n" +
                                    "plt.colorbar(label='Digit Label')\n" +
                                    "plt.title('t-SNE Visualization of Digits Dataset')\n" +
                                    "plt.xlabel('t-SNE Dimension 1')\n" +
                                    "plt.ylabel('t-SNE Dimension 2')\n" +
                                    "plt.show()\n" +
                                    "</code>\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>Applications of t-SNE</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Clustering Analysis:</strong> Visualize clusters in data and identify patterns (e.g., grouping customers by behavior).</li>\n" +
                                    "    <li><strong>Anomaly Detection:</strong> Outliers in the data often appear as isolated points in t-SNE visualizations.</li>\n" +
                                    "    <li><strong>Feature Analysis:</strong> Understand how features contribute to clustering or classification tasks.</li>\n" +
                                    "    <li><strong>Preprocessing for Other Models:</strong> Use t-SNE for visual inspection before applying more advanced modeling techniques.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Advantages and Disadvantages of t-SNE</h2>\n" +
                                    "<h3>Advantages:</h3>\n" +
                                    "<ul>\n" +
                                    "    <li>Excellent for visualizing non-linear relationships in high-dimensional data.</li>\n" +
                                    "    <li>Captures local structure, making it useful for exploring clusters.</li>\n" +
                                    "</ul>\n" +
                                    "<h3>Disadvantages:</h3>\n" +
                                    "<ul>\n" +
                                    "    <li>Computationally Intensive: t-SNE can be slow for very large datasets.</li>\n" +
                                    "    <li>Non-Deterministic: Small changes in the data or hyperparameters can lead to different results.</li>\n" +
                                    "    <li>Does Not Preserve Global Structure: t-SNE focuses on local structure, which might distort global relationships.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(51, 17, "Feature Selection", 3, "<h1>Introduction to Feature Selection</h1>\n" +
                                    "<p>\n" +
                                    "    Feature selection is a process used in machine learning to identify and select the most important features (input variables) that contribute to the prediction of the target variable. By reducing the number of features, it helps improve model performance, reduces overfitting, and speeds up training.\n" +
                                    "</p>\n" +
                                    "<p>\n" +
                                    "    Feature selection is especially critical when working with datasets containing many irrelevant or redundant features, which can negatively impact the model’s accuracy and computational efficiency.\n" +
                                    "</p>\n" +
                                    "\n" +
                                    "<h2>Benefits of Feature Selection</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Improved Model Performance:</strong> Reduces noise in the data, leading to better predictive accuracy.</li>\n" +
                                    "    <li><strong>Avoid Overfitting:</strong> Prevents the model from learning patterns that are irrelevant or specific to the training data.</li>\n" +
                                    "    <li><strong>Reduced Computational Cost:</strong> Decreases training time by lowering the dimensionality of the dataset.</li>\n" +
                                    "    <li><strong>Enhanced Interpretability:</strong> Simplifies the model, making it easier to understand and analyze.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Types of Feature Selection Techniques</h2>\n" +
                                    "<h3>1. Filter Methods</h3>\n" +
                                    "<p>\n" +
                                    "    Filter methods evaluate the relevance of features using statistical measures without involving any machine learning model.\n" +
                                    "</p>\n" +
                                    "<p><strong>Examples:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Correlation:</strong> Measures the relationship between features and the target. High correlation with the target suggests relevance (e.g., Pearson's correlation coefficient).</li>\n" +
                                    "    <li><strong>Chi-Square Test:</strong> Evaluates the independence between categorical variables.</li>\n" +
                                    "    <li><strong>Mutual Information:</strong> Measures the dependency between two variables.</li>\n" +
                                    "    <li><strong>Variance Threshold:</strong> Removes features with low variance.</li>\n" +
                                    "</ul>\n" +
                                    "<p>Example in Python:</p>\n" +
                                    "<pre>\n" +
                                    "<code>\n" +
                                    "from sklearn.feature_selection import VarianceThreshold\n" +
                                    "\n" +
                                    "# Sample data\n" +
                                    "data = [[0, 2, 0, 3],\n" +
                                    "        [0, 1, 4, 3],\n" +
                                    "        [0, 1, 1, 3]]\n" +
                                    "\n" +
                                    "# Apply Variance Threshold\n" +
                                    "selector = VarianceThreshold(threshold=0.2)\n" +
                                    "reduced_data = selector.fit_transform(data)\n" +
                                    "print(reduced_data)\n" +
                                    "</code>\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h3>2. Wrapper Methods</h3>\n" +
                                    "<p>\n" +
                                    "    Wrapper methods use a predictive model to evaluate the importance of features. These methods are computationally expensive but often more accurate.\n" +
                                    "</p>\n" +
                                    "<p><strong>Examples:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Recursive Feature Elimination (RFE):</strong> Iteratively removes less important features based on model performance.</li>\n" +
                                    "    <li><strong>Forward Selection:</strong> Starts with no features and adds them one at a time based on improvement in performance.</li>\n" +
                                    "    <li><strong>Backward Elimination:</strong> Starts with all features and removes them one by one based on significance.</li>\n" +
                                    "</ul>\n" +
                                    "<p>Example: RFE in Python:</p>\n" +
                                    "<pre>\n" +
                                    "<code>\n" +
                                    "from sklearn.feature_selection import RFE\n" +
                                    "from sklearn.ensemble import RandomForestClassifier\n" +
                                    "\n" +
                                    "# Sample data\n" +
                                    "X = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]\n" +
                                    "y = [0, 1, 0]\n" +
                                    "\n" +
                                    "# Apply RFE\n" +
                                    "model = RandomForestClassifier()\n" +
                                    "rfe = RFE(estimator=model, n_features_to_select=2)\n" +
                                    "X_rfe = rfe.fit_transform(X, y)\n" +
                                    "print(X_rfe)\n" +
                                    "</code>\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h3>3. Embedded Methods</h3>\n" +
                                    "<p>\n" +
                                    "    Embedded methods integrate feature selection directly into the training process. These methods are computationally efficient and often yield good results.\n" +
                                    "</p>\n" +
                                    "<p><strong>Examples:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Lasso Regression (L1 Regularization):</strong> Shrinks less important feature coefficients to zero.</li>\n" +
                                    "    <li><strong>Tree-Based Models:</strong> Feature importance can be derived from models like Random Forest or Gradient Boosted Trees.</li>\n" +
                                    "</ul>\n" +
                                    "<p>Example: Feature Importance from a Random Forest:</p>\n" +
                                    "<pre>\n" +
                                    "<code>\n" +
                                    "from sklearn.ensemble import RandomForestClassifier\n" +
                                    "import pandas as pd\n" +
                                    "\n" +
                                    "# Sample data\n" +
                                    "X = pd.DataFrame({'Feature1': [1, 4, 7], 'Feature2': [2, 5, 8], 'Feature3': [3, 6, 9]})\n" +
                                    "y = [0, 1, 0]\n" +
                                    "\n" +
                                    "# Train Random Forest\n" +
                                    "model = RandomForestClassifier()\n" +
                                    "model.fit(X, y)\n" +
                                    "\n" +
                                    "# Get Feature Importances\n" +
                                    "feature_importances = model.feature_importances_\n" +
                                    "print(\"Feature Importances:\", feature_importances)\n" +
                                    "</code>\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>Practical Steps for Feature Selection</h2>\n" +
                                    "<ol>\n" +
                                    "    <li><strong>Understand the Dataset:</strong>\n" +
                                    "        <ul>\n" +
                                    "            <li>Examine the features and their relationship with the target variable.</li>\n" +
                                    "            <li>Identify categorical, numerical, and potentially redundant features.</li>\n" +
                                    "        </ul>\n" +
                                    "    </li>\n" +
                                    "    <li><strong>Filter Irrelevant Features:</strong>\n" +
                                    "        <ul>\n" +
                                    "            <li>Remove features with low variance or high missing values.</li>\n" +
                                    "        </ul>\n" +
                                    "    </li>\n" +
                                    "    <li><strong>Explore Correlations:</strong>\n" +
                                    "        <ul>\n" +
                                    "            <li>Use correlation matrices or statistical tests to identify and remove highly correlated features.</li>\n" +
                                    "        </ul>\n" +
                                    "    </li>\n" +
                                    "    <li><strong>Apply Feature Selection Techniques:</strong>\n" +
                                    "        <ul>\n" +
                                    "            <li>Use a combination of filter, wrapper, and embedded methods based on the problem and computational constraints.</li>\n" +
                                    "        </ul>\n" +
                                    "    </li>\n" +
                                    "    <li><strong>Evaluate Model Performance:</strong>\n" +
                                    "        <ul>\n" +
                                    "            <li>Train the model with the selected features and compare performance metrics.</li>\n" +
                                    "        </ul>\n" +
                                    "    </li>\n" +
                                    "</ol>\n", "2024-11-02", "2024-11-02")
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
                            Unit(52, 18, "Apriori Algorithm", 1, "<h1>Introduction to the Apriori Algorithm</h1>\n" +
                                    "<p>\n" +
                                    "    The Apriori algorithm is a widely used technique in association rule learning, a type of unsupervised learning used to uncover relationships between items in a dataset. It is commonly applied in market basket analysis, where the goal is to discover patterns, such as items frequently purchased together.\n" +
                                    "</p>\n" +
                                    "<p>\n" +
                                    "    The algorithm identifies frequent itemsets (sets of items that occur together frequently) and generates association rules to describe these relationships. For example, \"If a customer buys bread, they are likely to buy butter.\"\n" +
                                    "</p>\n" +
                                    "\n" +
                                    "<h2>Key Concepts in the Apriori Algorithm</h2>\n" +
                                    "\n" +
                                    "<h3>1. Support</h3>\n" +
                                    "<p>\n" +
                                    "    Measures how frequently an itemset appears in the dataset.\n" +
                                    "</p>\n" +
                                    "<p><strong>Formula:</strong></p>\n" +
                                    "<p><code>Support(A) = Number of transactions containing A / Total number of transactions</code></p>\n" +
                                    "\n" +
                                    "<h3>2. Confidence</h3>\n" +
                                    "<p>\n" +
                                    "    Measures the likelihood that an item <strong>B</strong> is purchased when <strong>A</strong> is purchased.\n" +
                                    "</p>\n" +
                                    "<p><strong>Formula:</strong></p>\n" +
                                    "<p><code>Confidence(A → B) = Support(A ∪ B) / Support(A)</code></p>\n" +
                                    "\n" +
                                    "<h3>3. Lift</h3>\n" +
                                    "<p>\n" +
                                    "    Measures the strength of a rule relative to the likelihood of <strong>B</strong> occurring independently of <strong>A</strong>.\n" +
                                    "</p>\n" +
                                    "<p><strong>Formula:</strong></p>\n" +
                                    "<p><code>Lift(A → B) = Confidence(A → B) / Support(B)</code></p>\n" +
                                    "\n" +
                                    "<p><strong>Lift Interpretation:</strong></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Lift > 1:</strong> Positive correlation (A and B are more likely to occur together).</li>\n" +
                                    "    <li><strong>Lift = 1:</strong> No correlation.</li>\n" +
                                    "    <li><strong>Lift < 1:</strong> Negative correlation.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>How the Apriori Algorithm Works</h2>\n" +
                                    "<p>The algorithm operates in two main steps: frequent itemset generation and rule generation.</p>\n" +
                                    "\n" +
                                    "<h3>Step 1: Frequent Itemset Generation</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Set a Minimum Support Threshold:</strong> Define a threshold (e.g., 0.3) to identify itemsets that occur frequently.</li>\n" +
                                    "    <li><strong>Generate Candidate Itemsets:</strong> Begin with individual items (1-itemsets) and filter those meeting the minimum support.</li>\n" +
                                    "    <li><strong>Iterative Expansion:</strong> Combine frequent <em>k</em>-itemsets to generate (<em>k+1</em>)-itemsets.</li>\n" +
                                    "    <li><strong>Prune Infrequent Itemsets:</strong> Remove candidate itemsets that fail to meet the minimum support.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Step 2: Association Rule Generation</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Set a Minimum Confidence Threshold:</strong> Define a threshold (e.g., 0.7) to identify strong rules.</li>\n" +
                                    "    <li><strong>Generate Rules:</strong> For each frequent itemset, generate rules in the form <strong>A → B</strong>.</li>\n" +
                                    "    <li><strong>Filter by Confidence and Lift:</strong> Retain only the rules that meet the minimum confidence and have a lift greater than 1.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Example: Applying Apriori Algorithm</h2>\n" +
                                    "\n" +
                                    "<h3>Dataset:</h3>\n" +
                                    "<table border=\"1\">\n" +
                                    "    <tr>\n" +
                                    "        <th>Transaction ID</th>\n" +
                                    "        <th>Items Purchased</th>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td>1</td>\n" +
                                    "        <td>Milk, Bread, Butter</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td>2</td>\n" +
                                    "        <td>Bread, Butter</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td>3</td>\n" +
                                    "        <td>Milk, Bread</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td>4</td>\n" +
                                    "        <td>Milk, Butter</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "        <td>5</td>\n" +
                                    "        <td>Bread, Butter, Eggs</td>\n" +
                                    "    </tr>\n" +
                                    "</table>\n" +
                                    "\n" +
                                    "<h3>Step-by-Step Execution:</h3>\n" +
                                    "\n" +
                                    "<h4>Frequent 1-itemsets:</h4>\n" +
                                    "<ul>\n" +
                                    "    <li>Support(Milk) = 3/5 = 0.6</li>\n" +
                                    "    <li>Support(Bread) = 4/5 = 0.8</li>\n" +
                                    "    <li>Support(Butter) = 4/5 = 0.8</li>\n" +
                                    "    <li>Support(Eggs) = 1/5 = 0.2</li>\n" +
                                    "</ul>\n" +
                                    "<p>Itemsets meeting Support ≥ 0.3: {Milk}, {Bread}, {Butter}</p>\n" +
                                    "\n" +
                                    "<h4>Frequent 2-itemsets:</h4>\n" +
                                    "<ul>\n" +
                                    "    <li>Support(Milk, Bread) = 2/5 = 0.4</li>\n" +
                                    "    <li>Support(Milk, Butter) = 2/5 = 0.4</li>\n" +
                                    "    <li>Support(Bread, Butter) = 3/5 = 0.6</li>\n" +
                                    "</ul>\n" +
                                    "<p>Frequent 2-itemsets: {Milk, Bread}, {Milk, Butter}, {Bread, Butter}</p>\n" +
                                    "\n" +
                                    "<h4>Frequent 3-itemsets:</h4>\n" +
                                    "<ul>\n" +
                                    "    <li>Support(Milk, Bread, Butter) = 1/5 = 0.2</li>\n" +
                                    "</ul>\n" +
                                    "<p>Since Support < 0.3, discard this itemset.</p>\n" +
                                    "\n" +
                                    "<h4>Generate Association Rules:</h4>\n" +
                                    "<p>From {Bread, Butter}:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>Rule: Bread → Butter</li>\n" +
                                    "    <li>Confidence: Support(Bread, Butter) / Support(Bread) = 0.6 / 0.8 = 0.75</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Implementation in Python</h2>\n" +
                                    "<pre>\n" +
                                    "<code>\n" +
                                    "from mlxtend.frequent_patterns import apriori\n" +
                                    "from mlxtend.frequent_patterns import association_rules\n" +
                                    "import pandas as pd\n" +
                                    "\n" +
                                    "# Sample dataset\n" +
                                    "data = {'Milk': [1, 0, 1, 1, 0],\n" +
                                    "        'Bread': [1, 1, 1, 0, 1],\n" +
                                    "        'Butter': [1, 1, 0, 1, 1],\n" +
                                    "        'Eggs': [0, 0, 0, 0, 1]}\n" +
                                    "\n" +
                                    "df = pd.DataFrame(data)\n" +
                                    "\n" +
                                    "# Generate frequent itemsets\n" +
                                    "frequent_itemsets = apriori(df, min_support=0.3, use_colnames=True)\n" +
                                    "\n" +
                                    "# Generate rules\n" +
                                    "rules = association_rules(frequent_itemsets, metric=\"confidence\", min_threshold=0.7)\n" +
                                    "\n" +
                                    "print(\"Frequent Itemsets:\")\n" +
                                    "print(frequent_itemsets)\n" +
                                    "print(\"\\nAssociation Rules:\")\n" +
                                    "print(rules)\n" +
                                    "</code>\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>Applications of the Apriori Algorithm</h2>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Market Basket Analysis:</strong> Identify items frequently bought together.</li>\n" +
                                    "    <li><strong>Recommendation Systems:</strong> Suggest items based on previous user interactions.</li>\n" +
                                    "    <li><strong>Fraud Detection:</strong> Spot unusual patterns in transactional data.</li>\n" +
                                    "    <li><strong>Medical Diagnosis:</strong> Identify patterns in symptoms and medical tests.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(53, 18, "Market Basket Analysis", 2, "<h1>Introduction to Market Basket Analysis</h1>\n" +
                                    "<p>Market Basket Analysis (MBA) is a technique used in data mining to understand the relationships between different products purchased together by customers. It is widely used in retail and e-commerce to uncover patterns and associations between products. By analyzing customer purchase behavior, businesses can optimize product placement, suggest cross-selling opportunities, and improve inventory management.</p>\n" +
                                    "\n" +
                                    "<p>Association rule learning, particularly algorithms like Apriori, is central to MBA. It helps in discovering frequent itemsets (sets of items that appear together frequently) and generating association rules (relationships between items), like \"If a customer buys milk, they are likely to also buy bread.\"</p>\n" +
                                    "\n" +
                                    "<h2>Key Concepts in Market Basket Analysis</h2>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Itemset:</strong> A collection of items purchased together in a transaction. <br>Example: A transaction containing \"Bread\" and \"Butter\" represents the itemset {Bread, Butter}.</li>\n" +
                                    "  <li><strong>Frequent Itemset:</strong> An itemset that appears frequently in the transaction dataset. The frequency is typically measured using support.</li>\n" +
                                    "  <li><strong>Support:</strong> The proportion of transactions that contain a particular itemset.</li>\n" +
                                    "  <p><strong>Formula:</strong></p>\n" +
                                    "  <pre>Support(A) = Transactions containing itemset A / Total number of transactions</pre>\n" +
                                    "  \n" +
                                    "  <li><strong>Association Rule:</strong> A rule that expresses the relationship between items in the dataset. <br>Example: Milk → Bread (If a customer buys milk, they are likely to also buy bread).</li>\n" +
                                    "  <li><strong>Confidence:</strong> The likelihood that an item B is purchased when item A is purchased.</li>\n" +
                                    "  <p><strong>Formula:</strong></p>\n" +
                                    "  <pre>Confidence(A→B) = Support(A ∪ B) / Support(A)</pre>\n" +
                                    "\n" +
                                    "  <li><strong>Lift:</strong> A measure of the strength of the association between two items, comparing the observed frequency with the expected frequency of item B in all transactions.</li>\n" +
                                    "  <p><strong>Formula:</strong></p>\n" +
                                    "  <pre>Lift(A→B) = Confidence(A→B) / Support(B)</pre>\n" +
                                    "  <p>A lift value greater than 1 indicates a positive association, meaning the items appear together more frequently than expected by chance.</p>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>How Market Basket Analysis Works</h2>\n" +
                                    "<h3>Step 1: Data Collection</h3>\n" +
                                    "<p>Gather transactional data that records which items are bought together by customers. For example, a dataset may contain the following transactions:</p>\n" +
                                    "<table>\n" +
                                    "  <tr>\n" +
                                    "    <th>Transaction ID</th>\n" +
                                    "    <th>Items Purchased</th>\n" +
                                    "  </tr>\n" +
                                    "  <tr>\n" +
                                    "    <td>1</td>\n" +
                                    "    <td>Milk, Bread, Butter</td>\n" +
                                    "  </tr>\n" +
                                    "  <tr>\n" +
                                    "    <td>2</td>\n" +
                                    "    <td>Bread, Butter</td>\n" +
                                    "  </tr>\n" +
                                    "  <tr>\n" +
                                    "    <td>3</td>\n" +
                                    "    <td>Milk, Bread</td>\n" +
                                    "  </tr>\n" +
                                    "  <tr>\n" +
                                    "    <td>4</td>\n" +
                                    "    <td>Milk, Butter</td>\n" +
                                    "  </tr>\n" +
                                    "  <tr>\n" +
                                    "    <td>5</td>\n" +
                                    "    <td>Bread, Butter, Eggs</td>\n" +
                                    "  </tr>\n" +
                                    "</table>\n" +
                                    "\n" +
                                    "<h3>Step 2: Generate Frequent Itemsets</h3>\n" +
                                    "<p>Use an algorithm like Apriori to find itemsets that meet a minimum support threshold (e.g., itemsets appearing in at least 3 out of 5 transactions). Example: If \"Milk, Bread\" appears in 3 transactions out of 5, the support for {Milk, Bread} is 3/5 = 0.6.</p>\n" +
                                    "\n" +
                                    "<h3>Step 3: Generate Association Rules</h3>\n" +
                                    "<p>For each frequent itemset, generate association rules. For example, from the itemset {Milk, Bread}, we can generate the rule: Milk → Bread. Calculate the confidence of the rule, i.e., the probability that if a customer buys Milk, they also buy Bread.</p>\n" +
                                    "\n" +
                                    "<h3>Step 4: Evaluate the Rules</h3>\n" +
                                    "<p>Evaluate the generated rules using metrics like confidence, lift, and support. Only keep rules that meet predefined thresholds (e.g., confidence >= 0.7, lift > 1).</p>\n" +
                                    "\n" +
                                    "<h2>Example: Applying Market Basket Analysis</h2>\n" +
                                    "<p>Let's consider a simple example to demonstrate how Market Basket Analysis is applied:</p>\n" +
                                    "<table>\n" +
                                    "  <tr>\n" +
                                    "    <th>Transaction ID</th>\n" +
                                    "    <th>Items Purchased</th>\n" +
                                    "  </tr>\n" +
                                    "  <tr>\n" +
                                    "    <td>1</td>\n" +
                                    "    <td>Milk, Bread, Butter</td>\n" +
                                    "  </tr>\n" +
                                    "  <tr>\n" +
                                    "    <td>2</td>\n" +
                                    "    <td>Bread, Butter</td>\n" +
                                    "  </tr>\n" +
                                    "  <tr>\n" +
                                    "    <td>3</td>\n" +
                                    "    <td>Milk, Bread</td>\n" +
                                    "  </tr>\n" +
                                    "  <tr>\n" +
                                    "    <td>4</td>\n" +
                                    "    <td>Milk, Butter</td>\n" +
                                    "  </tr>\n" +
                                    "  <tr>\n" +
                                    "    <td>5</td>\n" +
                                    "    <td>Bread, Butter, Eggs</td>\n" +
                                    "  </tr>\n" +
                                    "</table>\n" +
                                    "\n" +
                                    "<h3>Step 1: Calculate Support for Itemsets</h3>\n" +
                                    "<ul>\n" +
                                    "  <li>Support for {Milk}: Appears in 3 transactions → 3/5 = 0.6</li>\n" +
                                    "  <li>Support for {Bread}: Appears in 4 transactions → 4/5 = 0.8</li>\n" +
                                    "  <li>Support for {Butter}: Appears in 4 transactions → 4/5 = 0.8</li>\n" +
                                    "  <li>Support for {Milk, Bread}: Appears in 3 transactions → 3/5 = 0.6</li>\n" +
                                    "  <li>Support for {Bread, Butter}: Appears in 4 transactions → 4/5 = 0.8</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Step 2: Generate Association Rules</h3>\n" +
                                    "<p>For frequent itemset {Bread, Butter}, we can generate the rule: Bread → Butter</p>\n" +
                                    "<p><strong>Confidence:</strong> Support(Bread, Butter) / Support(Bread) = 0.8 / 0.8 = 1.0</p>\n" +
                                    "<p><strong>Lift:</strong> Confidence / Support(Butter) = 1.0 / 0.8 = 1.25</p>\n" +
                                    "\n" +
                                    "<p>For rule Milk → Bread:</p>\n" +
                                    "<p><strong>Confidence:</strong> Support(Milk, Bread) / Support(Milk) = 0.6 / 0.6 = 1.0</p>\n" +
                                    "<p><strong>Lift:</strong> Confidence / Support(Bread) = 1.0 / 0.8 = 1.25</p>\n" +
                                    "\n" +
                                    "<h3>Step 3: Interpret Results</h3>\n" +
                                    "<ul>\n" +
                                    "  <li>The rule Milk → Bread suggests that when customers buy Milk, they are very likely to buy Bread as well.</li>\n" +
                                    "  <li>The rule Bread → Butter suggests that if customers buy Bread, they are highly likely to also purchase Butter.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Implementation in Python</h2>\n" +
                                    "<p>You can implement Market Basket Analysis using libraries like mlxtend in Python.</p>\n" +
                                    "\n" +
                                    "<pre>\n" +
                                    "import pandas as pd\n" +
                                    "from mlxtend.frequent_patterns import apriori, association_rules\n" +
                                    "\n" +
                                    "# Example dataset\n" +
                                    "data = {\n" +
                                    "    'Milk': [1, 0, 1, 1, 0],\n" +
                                    "    'Bread': [1, 1, 1, 0, 1],\n" +
                                    "    'Butter': [1, 1, 0, 1, 1],\n" +
                                    "    'Eggs': [0, 0, 0, 0, 1]\n" +
                                    "}\n" +
                                    "\n" +
                                    "df = pd.DataFrame(data)\n" +
                                    "\n" +
                                    "# Apply Apriori to find frequent itemsets\n" +
                                    "frequent_itemsets = apriori(df, min_support=0.3, use_colnames=True)\n" +
                                    "\n" +
                                    "# Generate association rules\n" +
                                    "rules = association_rules(frequent_itemsets, metric=\"confidence\", min_threshold=0.7)\n" +
                                    "\n" +
                                    "print(\"Frequent Itemsets:\")\n" +
                                    "print(frequent_itemsets)\n" +
                                    "\n" +
                                    "print(\"\\nAssociation Rules:\")\n" +
                                    "print(rules)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>Applications of Market Basket Analysis</h2>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Product Placement:</strong> Place frequently bought together items close to each other in stores to increase cross-selling opportunities.</li>\n" +
                                    "  <li><strong>Cross-Selling and Upselling:</strong> Suggest complementary products to customers during checkout based on association rules (e.g., \"If you bought a laptop, you might also like a laptop bag\").</li>\n" +
                                    "  <li><strong>Inventory Management:</strong> Optimize stock levels by understanding which products are frequently bought together.</li>\n" +
                                    "  <li><strong>Recommendation Systems:</strong> Use MBA to recommend products to customers based on their purchasing history.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(54, 18, "Advanced Rule Mining", 3, "<h1>Introduction to Advanced Rule Mining</h1>\n" +
                                    "<p>Advanced Rule Mining refers to techniques and methods that extend basic association rule learning, such as the Apriori algorithm, to extract more sophisticated and insightful patterns from data. While traditional rule mining focuses on finding frequent itemsets and simple association rules, advanced techniques address challenges such as scalability, quality of rules, handling of large datasets, and discovering more complex relationships.</p>\n" +
                                    "<p>Advanced rule mining techniques enable the discovery of more relevant, accurate, and actionable rules, helping organizations make data-driven decisions more effectively.</p>\n" +
                                    "\n" +
                                    "<h2>Key Concepts in Advanced Rule Mining</h2>\n" +
                                    "\n" +
                                    "<h3>Association Rule Refinement</h3>\n" +
                                    "<p>Advanced techniques refine basic rules by filtering out less useful or less interesting rules based on criteria such as lift, confidence, and support. The rules can be filtered based on domain-specific considerations like business context or seasonality.</p>\n" +
                                    "\n" +
                                    "<h3>Multi-Dimensional Rules</h3>\n" +
                                    "<p>Traditional rule mining focuses on simple items, while advanced techniques explore multi-dimensional rules. These rules might involve attributes like time, location, or customer segments in addition to product items.</p>\n" +
                                    "<p>Example: \"If a customer buys product A in the morning, they are likely to buy product B in the evening.\"</p>\n" +
                                    "\n" +
                                    "<h3>Sequential Pattern Mining</h3>\n" +
                                    "<p>Discover patterns that occur in a sequence over time, such as purchase sequences or time-series patterns. Techniques like Sequential Pattern Mining or Sequence Mining help find temporal dependencies and order-specific relationships (e.g., a customer buys milk, then buys bread).</p>\n" +
                                    "\n" +
                                    "<h3>Weighted Association Rules</h3>\n" +
                                    "<p>Assign weights to items or transactions to capture more nuanced relationships. For example, items purchased in high quantities could be given more weight than those bought in small quantities.</p>\n" +
                                    "\n" +
                                    "<h3>Constraint-Based Rule Mining</h3>\n" +
                                    "<p>Involves using specific constraints (e.g., only find rules for customers in a particular region or those who purchased a certain type of product). Helps in mining more targeted and relevant rules, which is particularly useful in large datasets.</p>\n" +
                                    "\n" +
                                    "<h2>Advanced Rule Mining Techniques</h2>\n" +
                                    "\n" +
                                    "<h3>3.1 Eclat Algorithm</h3>\n" +
                                    "<p>The Eclat (Equivalence Class Transformation) algorithm is an efficient method for frequent itemset mining. It is particularly useful in handling large datasets and can be faster than the Apriori algorithm in certain situations.</p>\n" +
                                    "<p><strong>How it works:</strong></p>\n" +
                                    "<ul>\n" +
                                    "  <li>Eclat works by using a vertical data format (each item is associated with a list of transactions in which it appears).</li>\n" +
                                    "  <li>It then applies intersection operations to find frequent itemsets, making it faster for dense datasets.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example:</strong> If we have the itemsets for {A, B} and {A, C}, Eclat would find their intersection (common transactions) and calculate their support based on this.</p>\n" +
                                    "\n" +
                                    "<h3>3.2 FP-growth (Frequent Pattern Growth)</h3>\n" +
                                    "<p>FP-growth is another advanced method for mining frequent itemsets, which is faster and more memory-efficient compared to Apriori. Instead of generating candidate itemsets like Apriori, FP-growth uses a divide-and-conquer strategy to compress the dataset into a frequent pattern tree (FP-tree).</p>\n" +
                                    "<p><strong>How it works:</strong></p>\n" +
                                    "<ul>\n" +
                                    "  <li>First, FP-growth creates a compact FP-tree, representing itemsets with frequent occurrences.</li>\n" +
                                    "  <li>Then, it recursively mines the tree for frequent itemsets, which is much faster than generating all candidate itemsets.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Advantages:</strong></p>\n" +
                                    "<ul>\n" +
                                    "  <li>Faster than Apriori: Since it does not generate candidate itemsets explicitly, FP-growth is much more efficient.</li>\n" +
                                    "  <li>Memory Efficient: The FP-tree data structure is compressed, requiring less memory.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Use case:</strong> FP-growth is widely used in real-world applications like recommendation systems, e-commerce, and market basket analysis.</p>\n" +
                                    "\n" +
                                    "<h3>3.3 Constraint-Based Rule Mining</h3>\n" +
                                    "<p>Constraint-Based Rule Mining adds flexibility by allowing users to impose specific constraints on the rule mining process. These constraints may be based on domain knowledge or business goals.</p>\n" +
                                    "<p><strong>Types of constraints:</strong></p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Transaction-Based Constraints:</strong> For example, only find rules that apply to transactions of a certain size or type.</li>\n" +
                                    "  <li><strong>Item-Based Constraints:</strong> Limit the search to specific items or sets of items.</li>\n" +
                                    "  <li><strong>Time-Based Constraints:</strong> For example, find rules that only apply to a specific time of day or season.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example:</strong> A retail business might want to find rules about high-value customers: \"If a customer buys a high-value product, they are likely to buy a related product, but only during the holiday season.\"</p>\n" +
                                    "<p><strong>Application:</strong> Helps businesses focus their analysis on rules that are more relevant to specific contexts, improving the quality of the insights.</p>\n" +
                                    "\n" +
                                    "<h3>3.4 Sequential Pattern Mining</h3>\n" +
                                    "<p>Sequential Pattern Mining aims to find frequent sequences of events or transactions over time. This technique is useful for discovering patterns in time-series data, such as customer purchase sequences or web browsing behavior.</p>\n" +
                                    "<p><strong>How it works:</strong></p>\n" +
                                    "<ul>\n" +
                                    "  <li>The algorithm looks for subsequences that appear frequently in the same order over time.</li>\n" +
                                    "  <li>A subsequence could be a pattern of purchases made by customers over a period, such as buying a smartphone, followed by buying a case and then buying headphones.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Applications:</strong></p>\n" +
                                    "<ul>\n" +
                                    "  <li>Time-series forecasting: Predicting future purchases or behaviors based on historical patterns.</li>\n" +
                                    "  <li>Customer journey analysis: Understanding the sequence of steps customers take before making a purchase.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example:</strong> If 30% of customers buy A followed by B, and 20% buy B followed by C, this information can help improve marketing campaigns and product recommendations.</p>\n" +
                                    "\n" +
                                    "<h3>3.5 Lift-Based Rule Mining</h3>\n" +
                                    "<p>Lift is a measure of how much more likely two items are to be purchased together than if they were independent of each other. Lift-based rule mining focuses on generating rules with high lift values, indicating strong associations between items.</p>\n" +
                                    "<p><strong>How it works:</strong></p>\n" +
                                    "<ul>\n" +
                                    "  <li>A high lift value suggests a strong association that is unlikely to happen by chance.</li>\n" +
                                    "  <li>For example, if the lift of the rule \"Milk → Bread\" is significantly greater than 1, it indicates that the relationship between Milk and Bread is more than just coincidence.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example:</strong> Rule: \"If a customer buys Milk, they are 3 times more likely to buy Bread.\" The lift value here is 3, indicating a strong positive relationship between the two items.</p>\n" +
                                    "\n" +
                                    "<h3>3.6 Weighted Association Rules</h3>\n" +
                                    "<p>In weighted association rule mining, each item or transaction is assigned a weight to reflect its importance. For instance, more frequently purchased items or items with higher profit margins can be given higher weights.</p>\n" +
                                    "<p><strong>How it works:</strong></p>\n" +
                                    "<ul>\n" +
                                    "  <li>The algorithm calculates support and confidence using the weighted values, resulting in rules that take item importance into account.</li>\n" +
                                    "  <li>This helps businesses focus on more valuable relationships rather than just frequent ones.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example:</strong> For an online store, a rule might be \"If a customer buys a high-priced item, they are likely to also buy accessories.\" By weighting the rule based on the price of items, the algorithm could focus on more profitable rules.</p>\n" +
                                    "\n" +
                                    "<h2>Evaluation Metrics for Advanced Rule Mining</h2>\n" +
                                    "<p>When using advanced rule mining techniques, it’s important to evaluate the quality of the discovered rules using different metrics:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Support:</strong> Measures how often a rule occurs in the dataset.</li>\n" +
                                    "  <li><strong>Confidence:</strong> The probability that item B is purchased when item A is purchased.</li>\n" +
                                    "  <li><strong>Lift:</strong> A measure of the strength of the association.</li>\n" +
                                    "  <li><strong>Conviction:</strong> A measure of the rule's strength, considering both support and confidence.</li>\n" +
                                    "  <li><strong>Interestingness:</strong> Measures how useful or unexpected the rule is. A rule is considered interesting if it provides new insights that align with business goals.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>Applications of Advanced Rule Mining</h2>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>E-commerce:</strong> Improving product recommendations by identifying cross-selling opportunities that go beyond simple item co-occurrence.</li>\n" +
                                    "  <li><strong>Healthcare:</strong> Finding complex patterns in patient data, such as the sequence of symptoms leading to specific diseases.</li>\n" +
                                    "  <li><strong>Fraud Detection:</strong> Identifying unusual patterns of behavior in transaction data, helping detect fraudulent activity.</li>\n" +
                                    "  <li><strong>Supply Chain Optimization:</strong> Discovering relationships between inventory items, helping companies optimize stock levels and reduce waste.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02")
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
                            Unit(55, 19, "GANs Overview", 1, "<h1>1. GANs Overview: Introduction to the Concept and Structure of GANs</h1>\n" +
                                    "<p>Generative Adversarial Networks (GANs) are a class of machine learning frameworks designed to generate new, synthetic instances of data that resemble a given training dataset. The concept was first introduced by Ian Goodfellow in 2014. GANs have since become a fundamental tool in the field of artificial intelligence (AI) and have found applications in various domains such as image generation, video generation, text-to-image synthesis, and even music composition.</p>\n" +
                                    "<p>At the heart of GANs is a game-theoretic setup involving two neural networks competing against each other: the generator and the discriminator. Through this adversarial process, GANs are able to generate realistic data that is difficult to distinguish from real data, even by humans or other machine learning models.</p>\n" +
                                    "\n" +
                                    "<h2>2. GANs Basic Structure and Components</h2>\n" +
                                    "\n" +
                                    "<h3>2.1. Generator (G)</h3>\n" +
                                    "<p>The generator is responsible for creating new data instances. It takes random noise (typically sampled from a uniform or Gaussian distribution) as input and generates data that mimics the real dataset. The goal of the generator is to produce data that is indistinguishable from real data. Initially, the generated data may be very noisy or unrealistic, but the generator improves over time as it learns to fool the discriminator.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Role:</strong> Generate synthetic data (images, text, etc.) that resembles real data.</li>\n" +
                                    "  <li><strong>Input:</strong> Random noise (latent vector).</li>\n" +
                                    "  <li><strong>Output:</strong> Fake data instances that look similar to real data.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2.2. Discriminator (D)</h3>\n" +
                                    "<p>The discriminator is a classifier that distinguishes between real and fake data. It is trained to differentiate between the data produced by the generator and the actual data from the training set. Its job is to classify whether the input data is real (from the training set) or fake (generated by the generator). The discriminator's goal is to correctly identify whether the data it receives is real or fake.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Role:</strong> Classify whether the input is real or fake.</li>\n" +
                                    "  <li><strong>Input:</strong> Data (either real from the dataset or fake from the generator).</li>\n" +
                                    "  <li><strong>Output:</strong> A probability score indicating whether the data is real or fake.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. How GANs Work: The Adversarial Process</h2>\n" +
                                    "<p>The operation of GANs can be described as a minimax game between the generator and the discriminator. Both networks are trained simultaneously in a process that resembles a game:</p>\n" +
                                    "<ol>\n" +
                                    "  <li><strong>Step 1: Generator's Role:</strong> The generator takes random noise as input and produces fake data. The generated data is intended to resemble real data as closely as possible. Initially, the fake data generated by the generator is poor and easily detectable by the discriminator, but the generator improves through training.</li>\n" +
                                    "  <li><strong>Step 2: Discriminator's Role:</strong> The discriminator receives both real data (from the actual training set) and fake data (from the generator). It evaluates whether the data is real or fake and assigns a probability score, where a high score means the data is real, and a low score means the data is fake.</li>\n" +
                                    "  <li><strong>Step 3: Training with Feedback:</strong> The discriminator is trained to become better at distinguishing between real and fake data. Its goal is to maximize the likelihood of correctly classifying data as real or fake. The generator is trained to improve its ability to produce realistic data, aiming to minimize the discriminator's ability to detect fake data.</li>\n" +
                                    "</ol>\n" +
                                    "<p>This process creates a feedback loop where:</p>\n" +
                                    "<ul>\n" +
                                    "  <li>The generator learns to generate more realistic data over time.</li>\n" +
                                    "  <li>The discriminator becomes better at distinguishing between real and fake data.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The ultimate goal is for the generator to create data that is so convincing that the discriminator can no longer tell the difference between real and fake data. At this point, the GAN is said to have reached equilibrium.</p>\n" +
                                    "\n" +
                                    "<h2>4. Objective Function of GANs</h2>\n" +
                                    "<p>The objective of GANs is captured in the following minimax loss function:</p>\n" +
                                    "<pre>\n" +
                                    "min<sub>G</sub> max<sub>D</sub> V(D, G)\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>G:</strong> Generator.</li>\n" +
                                    "  <li><strong>D:</strong> Discriminator.</li>\n" +
                                    "  <li><strong>V(D, G):</strong> The value function, which represents the adversarial game between G and D.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The value function V(D, G) is defined as:</p>\n" +
                                    "<pre>\n" +
                                    "V(D, G) = E<sub>x∼p<sub>data</sub>(x)</sub>[log D(x)] + E<sub>z∼p<sub>z</sub>(z)</sub>[log(1 - D(G(z)))]\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>x∼p<sub>data</sub>(x):</strong> Real data from the training set.</li>\n" +
                                    "  <li><strong>z∼p<sub>z</sub>(z):</strong> Random noise input to the generator.</li>\n" +
                                    "  <li><strong>D(x):</strong> Probability that the discriminator classifies real data as real.</li>\n" +
                                    "  <li><strong>D(G(z)):</strong> Probability that the discriminator classifies fake data (generated by G) as real.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The first term in the equation represents the discriminator's goal of assigning high probability to real data. The second term represents the discriminator's goal of assigning low probability to fake data generated by the generator.</p>\n" +
                                    "<p>The generator seeks to minimize log(1 − D(G(z))), which means it aims to fool the discriminator by making the fake data appear real. The discriminator seeks to maximize log D(x) for real data and log(1 − D(G(z))) for fake data, so it can correctly distinguish between the two.</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(56, 19, "Training GANs", 2, "<h1>1. Understanding the GAN Training Process</h1>\n" +
                                    "<p>The core idea behind GAN training is to alternate between training two models:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Generator (G):</strong> Trains to create fake data that resembles real data as closely as possible.</li>\n" +
                                    "  <li><strong>Discriminator (D):</strong> Trains to distinguish between real data (from the dataset) and fake data (generated by G).</li>\n" +
                                    "</ul>\n" +
                                    "<p>The goal of the generator is to minimize the discriminator's ability to distinguish between real and fake data. The goal of the discriminator is to maximize its ability to correctly identify real and fake data.</p>\n" +
                                    "\n" +
                                    "<h2>Step-by-step GAN training loop:</h2>\n" +
                                    "<h3>Discriminator Training:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Input:</strong> Real data (from the training set) and fake data (from the generator).</li>\n" +
                                    "  <li><strong>Objective:</strong> Maximize the probability of classifying real data as real and fake data as fake.</li>\n" +
                                    "  <li>The discriminator computes the loss based on its predictions and updates its parameters accordingly.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Generator Training:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Input:</strong> Random noise (latent vector), which the generator uses to create fake data.</li>\n" +
                                    "  <li><strong>Objective:</strong> Minimize the probability of the discriminator classifying the fake data as fake. This forces the generator to improve its data generation to fool the discriminator.</li>\n" +
                                    "  <li>The generator’s loss is updated by computing the feedback from the discriminator.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p>These steps alternate in each iteration of training, progressively improving the generator’s ability to produce realistic data.</p>\n" +
                                    "\n" +
                                    "<h2>2. Key Steps in Training GANs</h2>\n" +
                                    "<h3>Step 1: Data Preprocessing</h3>\n" +
                                    "<p>Before training GANs, ensure that the input data is properly preprocessed and normalized. This often involves scaling image pixel values to a [0, 1] or [-1, 1] range.</p>\n" +
                                    "<p>Example: For images, you typically normalize the pixel values to [-1, 1] using a transformation like:</p>\n" +
                                    "<pre>\n" +
                                    "Normalized Pixel Value = (Pixel Value - 127.5) / 127.5\n" +
                                    "</pre>\n" +
                                    "<p>Data augmentation may also be used to diversify the dataset, which helps prevent overfitting.</p>\n" +
                                    "\n" +
                                    "<h3>Step 2: Initialize Both Networks</h3>\n" +
                                    "<p>Initialize the generator and discriminator networks with small random weights. Common weight initialization methods include Xavier or He initialization.</p>\n" +
                                    "\n" +
                                    "<h3>Step 3: Define Loss Functions</h3>\n" +
                                    "<p>The most common loss function for GANs is the binary cross-entropy loss, where:</p>\n" +
                                    "<p>The discriminator loss function is:</p>\n" +
                                    "<pre>\n" +
                                    "L<sub>D</sub> = -E<sub>x∼p<sub>data</sub>(x)</sub>[log D(x)] - E<sub>z∼p<sub>z</sub>(z)</sub>[log(1 - D(G(z)))]\n" +
                                    "</pre>\n" +
                                    "<p>The generator loss function is:</p>\n" +
                                    "<pre>\n" +
                                    "L<sub>G</sub> = -E<sub>z∼p<sub>z</sub>(z)</sub>[log D(G(z))]\n" +
                                    "</pre>\n" +
                                    "<p>Here, D(x) represents the discriminator's estimate of the probability that x (real or fake) is real, and G(z) is the generated data from a random input z.</p>\n" +
                                    "\n" +
                                    "<h3>Step 4: Train the Discriminator</h3>\n" +
                                    "<p>Train the discriminator by providing both real data and fake data generated by the generator.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Real data:</strong> From the training dataset, label as \"real\" (1).</li>\n" +
                                    "  <li><strong>Fake data:</strong> From the generator, label as \"fake\" (0).</li>\n" +
                                    "</ul>\n" +
                                    "<p>The discriminator should maximize the ability to classify real data as real and fake data as fake.</p>\n" +
                                    "\n" +
                                    "<h3>Step 5: Train the Generator</h3>\n" +
                                    "<p>While the discriminator is improving, the generator is trained to create more realistic data by minimizing the discriminator's ability to tell the difference between real and fake data. This is done by updating the generator's weights to reduce the discriminator's output for fake data (i.e., pushing the discriminator to classify generated data as real).</p>\n" +
                                    "<p>The generator is updated only based on feedback from the discriminator’s evaluation of fake data.</p>\n" +
                                    "\n" +
                                    "<h3>Step 6: Alternate Training</h3>\n" +
                                    "<p>Update discriminator and update generator alternately to improve both models. Each model learns from the other in this iterative process:</p>\n" +
                                    "<ul>\n" +
                                    "  <li>Train the discriminator with real and fake data.</li>\n" +
                                    "  <li>Update the generator using the discriminator's evaluation of fake data.</li>\n" +
                                    "</ul>\n" +
                                    "<p>This back-and-forth training process continues until the generator produces highly realistic data.</p>\n" +
                                    "\n" +
                                    "<h2>3. Challenges in Training GANs</h2>\n" +
                                    "\n" +
                                    "<h3>3.1. Mode Collapse</h3>\n" +
                                    "<p><strong>Problem:</strong> The generator may end up producing only a few types of outputs or even the same output repeatedly, leading to mode collapse (lack of diversity in generated samples).</p>\n" +
                                    "<p><strong>Solution:</strong> Implement techniques like mini-batch discrimination, unrolling GANs, or Wasserstein GANs (WGANs) to reduce mode collapse.</p>\n" +
                                    "\n" +
                                    "<h3>3.2. Vanishing/Exploding Gradients</h3>\n" +
                                    "<p><strong>Problem:</strong> If the discriminator becomes too powerful (i.e., it can easily distinguish between real and fake data), the generator may stop learning, leading to vanishing gradients.</p>\n" +
                                    "<p><strong>Solution:</strong> Ensure balanced training between the discriminator and generator. Regularly update both networks to maintain healthy competition.</p>\n" +
                                    "\n" +
                                    "<h3>3.3. Training Stability</h3>\n" +
                                    "<p><strong>Problem:</strong> GANs are inherently unstable, and training can oscillate or diverge if not properly managed.</p>\n" +
                                    "<p><strong>Solution:</strong> Use techniques like gradient penalty, spectral normalization, or WGAN with gradient penalty (WGAN-GP) to improve training stability.</p>\n" +
                                    "\n" +
                                    "<h3>3.4. Discriminator Overfitting</h3>\n" +
                                    "<p><strong>Problem:</strong> The discriminator may overfit if it is trained too much, making it too good at distinguishing real and fake data.</p>\n" +
                                    "<p><strong>Solution:</strong> Apply dropout, regularization, or train the generator more frequently to keep the discriminator from becoming too strong.</p>\n" +
                                    "\n" +
                                    "<h2>4. Best Practices for Training GANs</h2>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Use Batch Normalization:</strong> Apply batch normalization to stabilize learning and avoid vanishing/exploding gradients. This helps normalize the inputs to each layer in the generator and discriminator, improving training dynamics.</li>\n" +
                                    "  <li><strong>Balance Generator and Discriminator Training:</strong> Ensure that the discriminator and generator are not imbalanced. If one becomes too strong, the other may not learn effectively.</li>\n" +
                                    "  <li><strong>Use Learning Rate Schedules:</strong> Decrease the learning rate for both the generator and discriminator over time to help fine-tune the models and avoid overshooting the optimal solution.</li>\n" +
                                    "  <li><strong>Monitor Losses:</strong> Track both the generator and discriminator losses during training. If either loss becomes too large or too small, it may indicate that the model is not training properly.</li>\n" +
                                    "  <li><strong>Training with Larger Datasets:</strong> GANs benefit from large datasets for training. Ensure you have sufficient data diversity to help the model generalize better.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(57, 19, "Applications of GANs", 3, "<h1>1. Image Generation and Enhancement</h1>\n" +
                                    "<p>One of the most common and impactful applications of GANs is in image generation, where GANs can generate photorealistic images from random noise inputs.</p>\n" +
                                    "\n" +
                                    "<h2>1.1. Image Synthesis</h2>\n" +
                                    "<p>GANs can generate entirely new images that resemble a given set of real images. For instance:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Face Generation:</strong> GANs can create completely new human faces that do not exist, but look highly realistic. This is used in applications like digital art, entertainment, and even for creating synthetic identities in virtual environments.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example:</strong> \"This Person Does Not Exist\" is a popular website that uses GANs to generate random, photorealistic images of people who are entirely artificial.</p>\n" +
                                    "\n" +
                                    "<h2>1.2. Super-Resolution</h2>\n" +
                                    "<p>GANs can enhance the resolution of low-quality images. This application, called super-resolution, allows you to upscale images without losing quality, making blurry or pixelated images sharp and detailed.</p>\n" +
                                    "<p><strong>Example:</strong> Super-Resolution Generative Adversarial Network (SRGAN) is an architecture used to generate high-resolution images from low-resolution inputs.</p>\n" +
                                    "\n" +
                                    "<h2>1.3. Image-to-Image Translation</h2>\n" +
                                    "<p>GANs are also used for image-to-image translation, where one image is transformed into another, typically by preserving the structure while modifying specific features.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Example:</strong> Pix2Pix: A model that can transform sketches into realistic photos.</li>\n" +
                                    "  <li><strong>Example:</strong> CycleGAN: Used for translating images between two domains without paired datasets, such as converting photos to artwork or changing the style of a photograph (e.g., summer to winter scenes).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>2. Video Generation and Synthesis</h1>\n" +
                                    "\n" +
                                    "<h2>2.1. Video Prediction</h2>\n" +
                                    "<p>GANs can be used to predict future frames in a video, based on the current and past frames. This can be useful in applications like video summarization, surveillance, and autonomous driving, where predicting the next frames can help in decision-making.</p>\n" +
                                    "<p><strong>Example:</strong> Predicting the motion of objects in video streams, such as forecasting the next movement of vehicles.</p>\n" +
                                    "\n" +
                                    "<h2>2.2. Deepfake Technology</h2>\n" +
                                    "<p>One of the most controversial yet widely discussed applications of GANs is in deepfake technology, where they are used to create highly convincing but entirely fabricated videos.</p>\n" +
                                    "<p><strong>Example:</strong> GANs can generate videos of a person speaking words they never said, or even create synthetic video footage of a public figure engaging in conversations or performing actions they never did.</p>\n" +
                                    "<p>Deepfakes have been used for both entertainment and malicious purposes, raising concerns about privacy and misinformation.</p>\n" +
                                    "\n" +
                                    "<h1>3. Art and Creativity</h1>\n" +
                                    "\n" +
                                    "<h2>3.1. Artistic Style Transfer</h2>\n" +
                                    "<p>GANs are commonly used for artistic style transfer, where they learn to generate images in the style of famous artists or specific art forms.</p>\n" +
                                    "<p><strong>Example:</strong> DeepArt and DeepDream are applications where GANs take an input image and apply the style of famous artists (like Van Gogh or Picasso) to generate new art pieces.</p>\n" +
                                    "\n" +
                                    "<h2>3.2. Art Creation</h2>\n" +
                                    "<p>GANs can also be used to create entirely new pieces of art. By training on large datasets of art, GANs can generate unique artistic images that can be sold, exhibited, or used for inspiration.</p>\n" +
                                    "<p><strong>Example:</strong> Artbreeder is a platform that allows users to create and share unique art pieces generated by GANs, blending various styles, genres, and concepts.</p>\n" +
                                    "\n" +
                                    "<h1>4. Healthcare Applications</h1>\n" +
                                    "\n" +
                                    "<h2>4.1. Medical Image Synthesis</h2>\n" +
                                    "<p>GANs have the potential to enhance healthcare by synthesizing medical images for training, diagnosis, and simulation purposes. They can generate realistic MRI scans, X-rays, and CT scans, which can help train medical professionals or assist in creating synthetic datasets for research.</p>\n" +
                                    "<p><strong>Example:</strong> Using GANs to generate synthetic MRI scans for training models when real data is scarce or private.</p>\n" +
                                    "\n" +
                                    "<h2>4.2. Drug Discovery</h2>\n" +
                                    "<p>In drug discovery, GANs can help generate new molecular structures that may have desired biological properties. This can accelerate the process of finding potential drugs for diseases.</p>\n" +
                                    "<p><strong>Example:</strong> ChemGAN: A GAN-based model used to generate novel molecular structures that may have properties useful for treating diseases.</p>\n" +
                                    "\n" +
                                    "<h2>4.3. Medical Image Super-Resolution</h2>\n" +
                                    "<p>GANs can be used to enhance medical imaging by improving the quality of low-resolution scans (such as MRI or CT scans) to assist doctors in making more accurate diagnoses.</p>\n" +
                                    "<p><strong>Example:</strong> Applying super-resolution GANs to MRI images to enhance fine details, making it easier to identify potential issues like tumors or abnormalities.</p>\n" +
                                    "\n" +
                                    "<h1>5. Fashion and Design</h1>\n" +
                                    "\n" +
                                    "<h2>5.1. Fashion Design</h2>\n" +
                                    "<p>GANs can be applied in fashion design to generate new clothing patterns, styles, or even simulate how garments will look on different body types. This can aid designers in the creative process and also speed up prototyping.</p>\n" +
                                    "<p><strong>Example:</strong> FashionGAN: Used for generating new clothing designs or predicting how a piece of clothing might look in different colors or patterns.</p>\n" +
                                    "\n" +
                                    "<h2>5.2. Virtual Try-Ons</h2>\n" +
                                    "<p>GANs can enable virtual try-on experiences by generating images of a person wearing different clothes. This is particularly useful in e-commerce, where customers can try on clothes digitally before making a purchase.</p>\n" +
                                    "<p><strong>Example:</strong> Fashion retail platforms like Zara and ASOS may use GAN-based virtual fitting rooms to help customers visualize how clothes will fit.</p>\n" +
                                    "\n" +
                                    "<h1>6. Natural Language Processing (NLP)</h1>\n" +
                                    "\n" +
                                    "<h2>6.1. Text-to-Image Generation</h2>\n" +
                                    "<p>GANs can generate images based on textual descriptions, enabling users to input text and generate corresponding images.</p>\n" +
                                    "<p><strong>Example:</strong> AttnGAN: A model that generates high-quality images from textual descriptions, such as generating a picture of a \"red bird sitting on a branch\" from a written description.</p>\n" +
                                    "\n" +
                                    "<h2>6.2. Text Generation</h2>\n" +
                                    "<p>Although not as popular as in image-related applications, GANs can also be used for text generation. By generating more coherent and contextually accurate sentences, GANs can assist in improving dialogue systems or automated content creation tools.</p>\n" +
                                    "<p><strong>Example:</strong> Generating human-like responses in chatbots or creative writing.</p>\n" +
                                    "\n" +
                                    "<h1>7. Data Augmentation</h1>\n" +
                                    "<p>GANs can be used in data augmentation, where they generate synthetic data that can be used to supplement a real-world dataset. This is particularly useful in scenarios where collecting sufficient real-world data is expensive, time-consuming, or difficult.</p>\n" +
                                    "<p><strong>Example:</strong> Generating synthetic images or text samples to augment a machine learning model’s training dataset, especially in fields like healthcare (where medical data can be scarce) or autonomous driving (where real-world driving data is hard to collect).</p>\n" +
                                    "\n" +
                                    "<h1>8. Gaming and Virtual Worlds</h1>\n" +
                                    "\n" +
                                    "<h2>8.1. Game Environment Generation</h2>\n" +
                                    "<p>GANs can be used to generate new levels, environments, and even characters for video games. This enables procedural content generation, which can create an endless variety of game scenarios without needing to manually design each one.</p>\n" +
                                    "<p><strong>Example:</strong> GANs can generate new game maps or realistic 3D characters based on the game's artistic style.</p>\n" +
                                    "\n" +
                                    "<h2>8.2. Virtual Reality (VR) and Augmented Reality (AR)</h2>\n" +
                                    "<p>In VR/AR, GANs can enhance the experience by generating realistic avatars, immersive environments, and interactive content.</p>\n" +
                                    "<p><strong>Example:</strong> Realistic avatars for VR games or simulations can be created using GANs to ensure more natural and engaging interactions.</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(58, 20, "Attention Mechanism", 1, "<h1>Attention Mechanism in Deep Learning</h1>\n" +
                                    "<p>The attention mechanism is a key concept that has significantly advanced the field of deep learning, especially for sequence-based tasks such as natural language processing (NLP), machine translation, speech recognition, and even image captioning. It enables models to focus on specific parts of the input when making predictions, improving their ability to handle complex tasks.</p>\n" +
                                    "\n" +
                                    "<h2>1. What is the Attention Mechanism?</h2>\n" +
                                    "<p>The attention mechanism allows a model to dynamically focus on different parts of the input sequence when producing each output. This enables the model to capture important dependencies, especially when dealing with long sequences where earlier parts of the input are crucial for predicting later parts.</p>\n" +
                                    "\n" +
                                    "<h3>Key Idea:</h3>\n" +
                                    "<p>In tasks like translation, rather than encoding all input words uniformly, the attention mechanism allows the model to \"attend\" more strongly to certain words in the input sequence when generating a specific part of the output.</p>\n" +
                                    "\n" +
                                    "<h2>2. How Attention Works</h2>\n" +
                                    "<p>In a sequence-to-sequence model (commonly used in machine translation), the encoder processes the input sequence, and the decoder generates the output sequence. Traditional models use fixed-length context vectors to summarize the input, but attention allows the decoder to focus on specific parts of the input sequence at each decoding step.</p>\n" +
                                    "\n" +
                                    "<h3>Attention Calculation:</h3>\n" +
                                    "<p>At each decoding step, the attention mechanism computes a context vector as a weighted sum of all input tokens. The weight assigned to each token indicates its relevance for the current decoding step.</p>\n" +
                                    "\n" +
                                    "<h3>Key Components:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Query (Q)</strong>: The current state of the decoder.</li>\n" +
                                    "  <li><strong>Key (K)</strong>: The state of each token in the input sequence.</li>\n" +
                                    "  <li><strong>Value (V)</strong>: The information associated with each token in the input.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Attention Score:</h3>\n" +
                                    "<p>This score is computed between the query and the key using a similarity function, typically a dot product, which indicates how much focus the model should give to each input token.</p>\n" +
                                    "\n" +
                                    "<pre>\n" +
                                    "Attention Score = softmax(Q ⋅ K^T)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<p>The softmax function ensures that the attention scores sum to 1, creating a probability distribution over the input tokens.</p>\n" +
                                    "\n" +
                                    "<h3>Context Vector:</h3>\n" +
                                    "<p>After computing the attention scores, they are used to weigh the values (V). The weighted sum of these values forms the context vector, which aids in producing the output at the current step.</p>\n" +
                                    "\n" +
                                    "<pre>\n" +
                                    "Context Vector = ∑(Attention Score_i × V_i)\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>3. Types of Attention Mechanisms</h2>\n" +
                                    "<p>Different attention mechanisms vary in complexity and how they utilize attention scores. The most commonly used mechanisms are:</p>\n" +
                                    "\n" +
                                    "<h3>3.1 Additive Attention (Bahdanau Attention)</h3>\n" +
                                    "<p>Introduced by Bahdanau et al., additive attention computes the attention score by combining the query and key using a neural network instead of directly using their dot product. The output is then passed through a softmax function to normalize the scores.</p>\n" +
                                    "\n" +
                                    "<h4>Key Equation:</h4>\n" +
                                    "<pre>\n" +
                                    "score(Q, K) = v^T ⋅ tanh(W_q ⋅ Q + W_k ⋅ K)\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>v</strong>, <strong>W_q</strong>, and <strong>W_k</strong> are learnable parameters.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>3.2 Scaled Dot-Product Attention</h3>\n" +
                                    "<p>Scaled dot-product attention is widely used in Transformer models. It calculates the attention score by taking the dot product of the query and key, then scaling it by the square root of the dimension of the key vectors (d_k).</p>\n" +
                                    "\n" +
                                    "<h4>Key Equation:</h4>\n" +
                                    "<pre>\n" +
                                    "Attention(Q, K, V) = softmax(Q ⋅ K^T / √d_k) ⋅ V\n" +
                                    "</pre>\n" +
                                    "<p>Where <strong>d_k</strong> is the dimension of the key vector.</p>\n" +
                                    "\n" +
                                    "<h3>3.3 Multi-Head Attention</h3>\n" +
                                    "<p>Instead of using a single set of attention weights, multi-head attention runs multiple attention mechanisms in parallel. Each \"head\" learns different attention patterns, and the results are concatenated and linearly transformed. This allows the model to attend to information from different representation subspaces at different positions, which helps capture complex dependencies.</p>\n" +
                                    "\n" +
                                    "<h2>4. Importance of Attention Mechanism</h2>\n" +
                                    "\n" +
                                    "<h3>4.1 Handling Long Sequences</h3>\n" +
                                    "<p>In models like RNNs or LSTMs, learning long-term dependencies is difficult due to issues such as the vanishing gradient problem. Attention helps by providing direct access to all parts of the sequence, overcoming these limitations.</p>\n" +
                                    "\n" +
                                    "<h3>4.2 Improving Model Performance</h3>\n" +
                                    "<p>Attention allows models to focus on the most relevant parts of the input, which improves accuracy and efficiency. This is beneficial for tasks like machine translation, summarization, and question answering.</p>\n" +
                                    "\n" +
                                    "<h3>4.3 Interpretability</h3>\n" +
                                    "<p>Attention provides interpretability, as the attention weights show which parts of the input the model focuses on at each output step. This allows for insights into the model's decision-making process.</p>\n" +
                                    "\n" +
                                    "<h2>5. Applications of Attention Mechanism</h2>\n" +
                                    "<p>The attention mechanism is fundamental in various cutting-edge models, particularly in NLP:</p>\n" +
                                    "\n" +
                                    "<h3>5.1 Machine Translation</h3>\n" +
                                    "<p>In machine translation, attention enables the model to focus on specific words in the source language when generating each word in the target language, leading to more accurate translations.</p>\n" +
                                    "\n" +
                                    "<p><strong>Example:</strong> Google Translate uses attention in its Transformer-based architecture to improve translation quality.</p>\n" +
                                    "\n" +
                                    "<h3>5.2 Text Summarization</h3>\n" +
                                    "<p>In abstractive text summarization, attention helps the model select the most important information from a source document to generate a concise summary.</p>\n" +
                                    "\n" +
                                    "<h3>5.3 Speech Recognition</h3>\n" +
                                    "<p>In speech recognition, attention helps the model focus on different parts of an audio sequence, allowing it to transcribe spoken language into text more accurately.</p>\n" +
                                    "\n" +
                                    "<h3>5.4 Image Captioning</h3>\n" +
                                    "<p>Attention mechanisms can be used in image captioning to focus on relevant regions of an image while generating descriptions, making the model more adept at creating accurate captions for complex images.</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(59, 20, "Transformer Architecture", 2, "<h1>Transformer Architecture</h1>\n" +
                                    "<p>The Transformer architecture revolutionized the field of natural language processing (NLP) and deep learning by introducing an innovative approach to sequence modeling that does not rely on recurrent layers like RNNs (Recurrent Neural Networks) or LSTMs (Long Short-Term Memory). Instead, it relies entirely on self-attention mechanisms, which allows it to process sequences in parallel, significantly improving efficiency and scalability. The Transformer model is the foundation for many state-of-the-art NLP models like BERT, GPT, T5, and BART.</p>\n" +
                                    "<p>In this module, we will explore the core components and principles of the Transformer architecture and discuss its applications.</p>\n" +
                                    "\n" +
                                    "<h2>1. Overview of Transformer Architecture</h2>\n" +
                                    "<p>The Transformer model, introduced by Vaswani et al. in the paper \"Attention is All You Need\" (2017), is based entirely on self-attention mechanisms and feedforward neural networks. Unlike RNNs and LSTMs, which process sequences step-by-step, the Transformer processes all tokens in a sequence simultaneously, allowing for faster computation and better handling of long-range dependencies.</p>\n" +
                                    "\n" +
                                    "<h3>Core Components of the Transformer Architecture:</h3>\n" +
                                    "<p>The Transformer is made up of two main parts:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Encoder:</strong> Processes the input sequence.</li>\n" +
                                    "  <li><strong>Decoder:</strong> Generates the output sequence.</li>\n" +
                                    "</ul>\n" +
                                    "<p>Both the encoder and decoder are composed of stacked layers, each with the same structure.</p>\n" +
                                    "\n" +
                                    "<h2>2. Transformer Encoder</h2>\n" +
                                    "<p>The encoder's job is to take the input sequence and transform it into a sequence of continuous representations that the decoder can then use to generate the output. The encoder consists of multiple identical layers (often 6 in the original Transformer), each containing the following sub-layers:</p>\n" +
                                    "\n" +
                                    "<h3>2.1. Self-Attention Mechanism (Scaled Dot-Product Attention)</h3>\n" +
                                    "<p>The key component of the Transformer is the self-attention mechanism. It allows the model to focus on different parts of the input sequence when processing a specific token. The attention mechanism computes a weighted sum of the input sequence, with the weights determined by how relevant each token is to the current token being processed.</p>\n" +
                                    "\n" +
                                    "<h4>Attention Score Calculation:</h4>\n" +
                                    "<p>For each word (token) in the input sequence, the attention mechanism calculates a score with respect to every other word. The score reflects the importance of one word relative to another in understanding the context.</p>\n" +
                                    "\n" +
                                    "<h4>Query, Key, and Value:</h4>\n" +
                                    "<p>The self-attention mechanism uses three vectors for each token:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Query (Q):</strong> Represents the current token.</li>\n" +
                                    "  <li><strong>Key (K):</strong> Represents all other tokens in the sequence.</li>\n" +
                                    "  <li><strong>Value (V):</strong> Holds the actual information about each token.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The scaled dot-product is computed between the query and key vectors, and the results are passed through a softmax function to get the attention weights, which are then applied to the value vectors.</p>\n" +
                                    "\n" +
                                    "<h3>2.2. Position Encoding</h3>\n" +
                                    "<p>Since the Transformer does not process tokens sequentially, it needs a way to understand the order of tokens in the input sequence. To achieve this, position encodings are added to the input embeddings before the self-attention layer. The position encodings are vectors that capture the position of each token in the sequence, allowing the model to incorporate sequential information.</p>\n" +
                                    "\n" +
                                    "<h4>Formula for Position Encoding:</h4>\n" +
                                    "<p>The position encoding is typically generated using sine and cosine functions to ensure that different positions in the sequence have unique encodings.</p>\n" +
                                    "\n" +
                                    "<h3>2.3. Feedforward Neural Networks</h3>\n" +
                                    "<p>After the self-attention mechanism, each token’s representation is passed through a feedforward neural network. This neural network is applied to each token independently and identically across all positions. It consists of two linear transformations with a ReLU activation function between them.</p>\n" +
                                    "\n" +
                                    "<h4>Feedforward Network Layers:</h4>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>First linear transformation:</strong> Maps the input to a higher-dimensional space.</li>\n" +
                                    "  <li><strong>ReLU activation:</strong> Introduces non-linearity.</li>\n" +
                                    "  <li><strong>Second linear transformation:</strong> Maps the output back to the original dimensionality.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2.4. Layer Normalization and Residual Connections</h3>\n" +
                                    "<p>Each sub-layer (self-attention and feedforward network) in the encoder is followed by a residual connection, and the output of each sub-layer is passed through layer normalization to stabilize training and improve performance.</p>\n" +
                                    "\n" +
                                    "<h2>3. Transformer Decoder</h2>\n" +
                                    "<p>The decoder in the Transformer architecture is similar to the encoder, but with an additional layer of self-attention and some changes to the structure to produce the final output sequence.</p>\n" +
                                    "\n" +
                                    "<h3>3.1. Masked Self-Attention</h3>\n" +
                                    "<p>The decoder uses masked self-attention, which ensures that the predictions for a given token only depend on the tokens before it (or at most, the current token). This prevents the model from seeing future tokens when generating the current one, making it suitable for autoregressive tasks such as language generation.</p>\n" +
                                    "\n" +
                                    "<h3>3.2. Encoder-Decoder Attention</h3>\n" +
                                    "<p>In addition to self-attention, each decoder layer contains an encoder-decoder attention layer. This layer allows the decoder to focus on relevant parts of the input sequence (processed by the encoder). Essentially, it allows the decoder to attend to the encoder's output, ensuring that the output sequence is generated based on the entire input sequence.</p>\n" +
                                    "\n" +
                                    "<h3>3.3. Feedforward Neural Networks</h3>\n" +
                                    "<p>Like the encoder, each decoder layer also contains a feedforward neural network that processes the token representations generated by the attention mechanisms.</p>\n" +
                                    "\n" +
                                    "<h2>4. Advantages of Transformer Architecture</h2>\n" +
                                    "<p>The Transformer model has several key advantages over traditional sequence models like RNNs and LSTMs:</p>\n" +
                                    "\n" +
                                    "<h3>Parallelization:</h3>\n" +
                                    "<p>Since the Transformer processes the entire sequence at once (rather than step-by-step), it can be parallelized much more efficiently, leading to significant speedups during training.</p>\n" +
                                    "\n" +
                                    "<h3>Long-Range Dependencies:</h3>\n" +
                                    "<p>Transformers handle long-range dependencies much better than RNNs and LSTMs because the attention mechanism allows them to directly relate all tokens in the sequence, regardless of their distance from each other.</p>\n" +
                                    "\n" +
                                    "<h3>Scalability:</h3>\n" +
                                    "<p>Transformers scale well with increased data and model size, which is why they have been the foundation for large models like GPT, BERT, and T5.</p>\n" +
                                    "\n" +
                                    "<h3>Flexible Sequence-to-Sequence Tasks:</h3>\n" +
                                    "<p>Unlike RNN-based architectures, the Transformer’s architecture is not dependent on the order of the input, making it very flexible for various sequence-to-sequence tasks.</p>\n" +
                                    "\n" +
                                    "<h2>5. Applications of Transformer Architecture</h2>\n" +
                                    "<p>Transformers are widely used in a variety of NLP and deep learning tasks, some of the most notable applications include:</p>\n" +
                                    "\n" +
                                    "<h3>5.1. Machine Translation</h3>\n" +
                                    "<p>Transformers have dramatically improved machine translation quality. Models like Google's Transformer (introduced in the original paper) and BERT (Bidirectional Encoder Representations from Transformers) have achieved state-of-the-art results in translation tasks.</p>\n" +
                                    "\n" +
                                    "<h3>5.2. Text Generation</h3>\n" +
                                    "<p>Transformer-based models like GPT (Generative Pre-trained Transformer) are excellent for text generation tasks. They are trained on large amounts of text and can generate human-like text based on a given prompt.</p>\n" +
                                    "\n" +
                                    "<h3>5.3. Text Summarization</h3>\n" +
                                    "<p>Transformers, particularly BART and T5, are also used for summarization tasks. They are trained to generate concise summaries from long documents, making them valuable for news aggregation, legal document summarization, and more.</p>\n" +
                                    "\n" +
                                    "<h3>5.4. Sentiment Analysis</h3>\n" +
                                    "<p>Transformers like BERT and RoBERTa have been used extensively for sentiment analysis tasks, where the model identifies the sentiment (positive, negative, or neutral) expressed in a given text.</p>\n" +
                                    "\n" +
                                    "<h3>5.5. Question Answering</h3>\n" +
                                    "<p>In question answering tasks, Transformer models like BERT are used to generate answers to questions based on a given context. These models can extract or generate answers from documents, which is used in applications like virtual assistants (e.g., Alexa, Siri) and search engines.</p>\n" +
                                    "\n" +
                                    "<h3>5.6. Image Processing</h3>\n" +
                                    "<p>While originally developed for NLP, the Transformer architecture has also been applied to computer vision. The Vision Transformer (ViT) is a model that treats images as sequences of patches, much like how text is treated as a sequence of words, and has shown excellent results on image classification tasks.</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(60, 20, "Applications of Transformers", 3, "<h1>Applications of Transformers in NLP</h1>\n" +
                                    "<p>Transformers have fundamentally reshaped the landscape of Natural Language Processing (NLP) and are the backbone of many state-of-the-art models for various tasks. Their ability to handle long-range dependencies and process sequences in parallel makes them highly effective for NLP applications like machine translation, text generation, question answering, and summarization.</p>\n" +
                                    "<p>In this module, we will explore some of the key NLP applications of Transformer-based models, focusing on how they are used for tasks such as machine translation, text generation, sentiment analysis, and more.</p>\n" +
                                    "\n" +
                                    "<h2>1. Machine Translation</h2>\n" +
                                    "<p>Machine translation involves automatically translating text from one language to another. Traditionally, this task was tackled by sequence-to-sequence (seq2seq) models that used RNNs or LSTMs. However, these models struggled with long-range dependencies and were computationally expensive due to their sequential nature. The introduction of the Transformer model solved many of these issues.</p>\n" +
                                    "\n" +
                                    "<h3>How Transformers are Used in Machine Translation:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Encoder-Decoder Architecture:</strong> The Transformer employs an encoder-decoder structure, where the encoder processes the source language text and the decoder generates the target language text.</li>\n" +
                                    "  <li><strong>Self-Attention:</strong> The self-attention mechanism allows the model to focus on different parts of the input sequence when producing the translation, effectively capturing long-range dependencies between words, regardless of their position in the sequence.</li>\n" +
                                    "  <li><strong>Parallelization:</strong> Since Transformers can process all words in the sequence simultaneously (not sequentially), training and inference are much faster, making them ideal for large-scale translation tasks.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<p>Google Translate switched to using Transformer models to significantly improve the quality and fluency of its translations. Transformers allow for more context-aware translations that better preserve the meaning and grammar of the target language.</p>\n" +
                                    "\n" +
                                    "<h2>2. Text Generation</h2>\n" +
                                    "<p>Text generation involves creating coherent and contextually relevant text from a given prompt. Generative Pre-trained Transformers (GPT), developed by OpenAI, have become the gold standard for text generation.</p>\n" +
                                    "\n" +
                                    "<h3>How Transformers are Used in Text Generation:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Autoregressive Models:</strong> In text generation, models like GPT are autoregressive, meaning they predict the next word in a sequence based on the preceding context. After training on vast amounts of text data, GPT models generate high-quality text that resembles human writing.</li>\n" +
                                    "  <li><strong>Fine-Tuning:</strong> These models can be fine-tuned for specific tasks like storytelling, article writing, or even code generation, based on the type of data they were trained on.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<p>GPT-3 is capable of writing essays, poems, and even performing complex tasks like answering questions, generating code, or completing unfinished sentences. Its ability to generate highly contextual text has made it useful for applications like chatbots, content generation, and even gaming.</p>\n" +
                                    "\n" +
                                    "<h2>3. Sentiment Analysis</h2>\n" +
                                    "<p>Sentiment analysis is the task of determining whether a given text expresses positive, negative, or neutral sentiment. It is widely used in analyzing customer feedback, social media posts, and reviews.</p>\n" +
                                    "\n" +
                                    "<h3>How Transformers are Used in Sentiment Analysis:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>BERT (Bidirectional Encoder Representations from Transformers):</strong> BERT uses a bidirectional self-attention mechanism, meaning it considers the context from both the left and right side of a word to determine its meaning. This is particularly useful for sentiment analysis, where understanding the entire sentence context is crucial.</li>\n" +
                                    "  <li><strong>Pre-trained Models:</strong> BERT can be fine-tuned on specific datasets (e.g., customer reviews) to classify sentiments based on the model’s understanding of the underlying language.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<p>BERT-based models have been used in various industries for sentiment analysis. For example, in the retail industry, businesses use sentiment analysis to understand customer opinions in product reviews and social media posts.</p>\n" +
                                    "\n" +
                                    "<h2>4. Text Summarization</h2>\n" +
                                    "<p>Text summarization involves condensing a long document or article into a shorter version while retaining the essential information. This task can be done in two ways:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Extractive Summarization:</strong> Extracting key sentences from the original text.</li>\n" +
                                    "  <li><strong>Abstractive Summarization:</strong> Generating a new summary that may not contain the exact sentences but conveys the same meaning.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>How Transformers are Used in Text Summarization:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>BART (Bidirectional and Auto-Regressive Transformers):</strong> BART is a model that combines elements of both BERT and GPT, and it is particularly effective for abstractive summarization tasks. It can generate concise summaries while understanding the overall context of the document.</li>\n" +
                                    "  <li><strong>T5 (Text-to-Text Transfer Transformer):</strong> T5 is another versatile model that can be fine-tuned for summarization tasks by transforming the input text into a summary.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<p>Facebook’s BART model has been used for generating high-quality abstractive summaries. It is trained on large datasets and fine-tuned for specific domains, such as news summarization or research paper summarization.</p>\n" +
                                    "\n" +
                                    "<h2>5. Question Answering</h2>\n" +
                                    "<p>Question answering (QA) involves answering natural language questions based on a given context or document. Transformers have been highly successful in this area due to their ability to understand complex relationships between words in the text.</p>\n" +
                                    "\n" +
                                    "<h3>How Transformers are Used in Question Answering:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>BERT for QA:</strong> BERT, with its bidirectional attention, can process the entire context and the question simultaneously. It then identifies the most likely span of text in the document that answers the question. This is known as extractive QA.</li>\n" +
                                    "  <li><strong>T5 for Generative QA:</strong> T5 can also be used for question answering, where it generates the answer rather than extracting it from the context.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<p>SQuAD (Stanford Question Answering Dataset): Many Transformer models like BERT and RoBERTa have achieved state-of-the-art results on the SQuAD benchmark, where the task is to answer questions based on passages from Wikipedia.</p>\n" +
                                    "\n" +
                                    "<h2>6. Named Entity Recognition (NER)</h2>\n" +
                                    "<p>Named Entity Recognition is the task of identifying proper names, dates, locations, and other key entities in a piece of text. This is a critical task for information extraction, especially in the context of legal, medical, and business documents.</p>\n" +
                                    "\n" +
                                    "<h3>How Transformers are Used in NER:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>BERT and RoBERTa:</strong> These models are fine-tuned for NER tasks by training on labeled datasets where entities are annotated. They are able to identify entities by leveraging the attention mechanism to understand the relationships between words in a sentence.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<p>NER in Healthcare: In medical text, Transformers can be used to extract mentions of diseases, drugs, and other medical entities, which is useful for clinical decision support systems or research.</p>\n" +
                                    "\n" +
                                    "<h2>7. Language Understanding and Transfer Learning</h2>\n" +
                                    "<p>One of the biggest advantages of Transformers is their ability to leverage transfer learning. Pre-trained Transformer models (e.g., BERT, GPT) can be fine-tuned for specific NLP tasks, enabling high performance across a wide range of applications with less data and computational effort.</p>\n" +
                                    "\n" +
                                    "<h3>How Transformers are Used in Language Understanding:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Zero-Shot Learning:</strong> Transformers like T5 and GPT-3 can perform well on tasks they haven’t been explicitly trained on, a property known as zero-shot learning. For instance, GPT-3 can answer questions, summarize text, or even generate code, all without having been fine-tuned for those specific tasks.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<p>GPT-3 is capable of performing tasks such as translation, summarization, and question answering without task-specific training, which is a breakthrough in language understanding and natural language processing.</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(61, 21, "Reinforcement Learning Basics", 1, "<h1>Reinforcement Learning Basics</h1>\n" +
                                    "<p>Reinforcement Learning (RL) is a type of machine learning where an agent learns to make decisions by interacting with its environment. The goal of the agent is to maximize a cumulative reward through a sequence of actions. Unlike supervised learning, where the model learns from labeled data, in reinforcement learning, the model learns by trial and error, receiving feedback in the form of rewards or penalties after each action.</p>\n" +
                                    "<p>This section provides an introduction to the core concepts of reinforcement learning and the algorithms that power it.</p>\n" +
                                    "\n" +
                                    "<h2>1. Key Concepts in Reinforcement Learning</h2>\n" +
                                    "<p>Reinforcement learning involves several important elements, which are fundamental to understanding how an agent learns and makes decisions:</p>\n" +
                                    "\n" +
                                    "<h3>Agent:</h3>\n" +
                                    "<p>The agent is the learner or decision maker that interacts with the environment. The agent can be anything that learns to make decisions, such as a robot, a self-driving car, or a software system playing a game.</p>\n" +
                                    "\n" +
                                    "<h3>Environment:</h3>\n" +
                                    "<p>The environment is everything the agent interacts with and is responsible for providing feedback based on the agent's actions. It is the world the agent operates within and can be as simple as a game environment or as complex as a real-world setting.</p>\n" +
                                    "\n" +
                                    "<h3>State (s):</h3>\n" +
                                    "<p>A state is a specific configuration or situation in which the agent finds itself in the environment. It represents all the relevant information the agent needs to make a decision.</p>\n" +
                                    "<p><strong>Example:</strong> In a chess game, the state would be the positions of all the pieces on the board.</p>\n" +
                                    "\n" +
                                    "<h3>Action (a):</h3>\n" +
                                    "<p>An action is a move made by the agent that affects the environment. The agent can take one action at a time, and its choice of action is what drives the learning process.</p>\n" +
                                    "<p><strong>Example:</strong> In a game, an action could be to move a character in a particular direction or to perform a specific task.</p>\n" +
                                    "\n" +
                                    "<h3>Reward (r):</h3>\n" +
                                    "<p>A reward is the feedback the agent receives after taking an action. The reward can be positive or negative, and it reflects how good or bad the action was in achieving the agent's goal.</p>\n" +
                                    "<p><strong>Example:</strong> In a video game, receiving points for scoring could be a positive reward, while losing health or dying could be a negative reward.</p>\n" +
                                    "\n" +
                                    "<h3>Policy (π):</h3>\n" +
                                    "<p>The policy is a strategy or mapping that defines the agent's behavior. It can be deterministic or probabilistic, determining the likelihood of the agent taking a particular action given a specific state.</p>\n" +
                                    "<p><strong>Example:</strong> A policy could be a set of rules like \"if I am near an enemy, I will attack,\" or it could be a more complex learned function based on the state.</p>\n" +
                                    "\n" +
                                    "<h3>Value Function (V):</h3>\n" +
                                    "<p>The value function estimates how good a state is for the agent. It provides a measure of the long-term expected reward an agent can get starting from a particular state and following a given policy.</p>\n" +
                                    "<p><strong>Example:</strong> In a game, a state near the goal would have a higher value than a state near danger.</p>\n" +
                                    "\n" +
                                    "<h3>Q-Function (Q):</h3>\n" +
                                    "<p>The Q-function, also known as the action-value function, estimates the expected cumulative reward the agent will receive after taking a specific action in a given state and following a policy thereafter.</p>\n" +
                                    "<p><strong>Example:</strong> In a game, Q-values could represent how valuable it is to take a certain action (like jumping or ducking) in a particular game state (like being near an obstacle).</p>\n" +
                                    "\n" +
                                    "<h2>2. The Reinforcement Learning Process</h2>\n" +
                                    "<p>Reinforcement learning follows a cycle where the agent continuously interacts with the environment, makes decisions, and receives feedback:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Initialize:</strong> The agent begins by initializing its environment, policy, and value functions.</li>\n" +
                                    "  <li><strong>Observe:</strong> The agent observes the current state of the environment.</li>\n" +
                                    "  <li><strong>Choose Action:</strong> Based on the current state, the agent chooses an action to take according to its policy.</li>\n" +
                                    "  <li><strong>Receive Reward:</strong> After the agent takes the action, the environment provides feedback in the form of a reward.</li>\n" +
                                    "  <li><strong>Update:</strong> The agent updates its knowledge (such as its policy or value function) based on the reward it received.</li>\n" +
                                    "  <li><strong>Repeat:</strong> The process repeats, with the agent continually exploring the environment and improving its decision-making.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Exploration vs. Exploitation</h2>\n" +
                                    "<p>One of the key challenges in reinforcement learning is the balance between exploration and exploitation:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Exploration:</strong> Refers to trying out new actions that might lead to better rewards in the future. This involves the agent choosing actions that may not be the best based on current knowledge but could potentially lead to higher long-term rewards.</li>\n" +
                                    "  <li><strong>Exploitation:</strong> Refers to choosing the best-known action based on the agent’s current understanding to maximize immediate rewards.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The balance between these two strategies is crucial because excessive exploration can lead to inefficient learning, while excessive exploitation can prevent the agent from discovering potentially better strategies.</p>\n" +
                                    "\n" +
                                    "<h2>4. Common Reinforcement Learning Algorithms</h2>\n" +
                                    "<p>Several algorithms have been developed to help agents learn how to make decisions effectively in RL environments. These algorithms can be broadly categorized into two types:</p>\n" +
                                    "\n" +
                                    "<h3>Model-Free Methods:</h3>\n" +
                                    "<p>These algorithms do not rely on an explicit model of the environment. Instead, they learn directly from interaction with the environment.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Q-Learning:</strong> A model-free algorithm where the agent learns the Q-values for state-action pairs. The agent updates the Q-values based on the reward and the maximum Q-value of the next state.</li>\n" +
                                    "  <li><strong>SARSA (State-Action-Reward-State-Action):</strong> Similar to Q-learning but updates its Q-values based on the action actually taken (not the maximum possible action).</li>\n" +
                                    "  <li><strong>Policy Gradient Methods:</strong> These methods directly learn the policy without needing to estimate value functions, using gradients to adjust the policy parameters.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Model-Based Methods:</h3>\n" +
                                    "<p>These algorithms build and use a model of the environment to predict future states and rewards, improving decision-making efficiency.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Dyna-Q:</strong> Combines model-based planning with model-free Q-learning by learning a model of the environment and using it to generate synthetic experiences for updating the policy.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5. Applications of Reinforcement Learning</h2>\n" +
                                    "<p>Reinforcement learning has been successfully applied to a variety of fields:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Game Playing:</strong> RL has been used to develop agents that can play and master games like Chess, Go, and Atari games. For example, AlphaGo used RL to become the first AI to defeat a world champion Go player.</li>\n" +
                                    "  <li><strong>Robotics:</strong> Robots use RL to learn tasks such as walking, grasping, or assembling objects by interacting with their environment and receiving feedback.</li>\n" +
                                    "  <li><strong>Healthcare:</strong> RL is used for optimizing treatment plans, drug discovery, and personalized medicine by simulating various patient outcomes.</li>\n" +
                                    "  <li><strong>Finance:</strong> In trading, RL can be used to develop strategies that maximize profit based on market conditions.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(62, 21, "Q-Learning", 2, "<h1>Q-Learning: A Value-Based Reinforcement Learning Algorithm</h1>\n" +
                                    "<p>Q-Learning is one of the most popular value-based reinforcement learning (RL) algorithms. It is used by an agent to learn how to act optimally in an environment by maximizing cumulative rewards. The \"Q\" in Q-learning stands for Quality, representing the quality of a state-action pair. The algorithm learns to map each state-action pair to an estimated future reward and improves its decisions over time based on interactions with the environment.</p>\n" +
                                    "<p>In this section, we’ll dive into the Q-Learning algorithm, its working mechanism, key concepts, and how to implement it effectively.</p>\n" +
                                    "\n" +
                                    "<h2>1. Core Concepts in Q-Learning</h2>\n" +
                                    "<p>To understand Q-learning, we must first understand the following key components:</p>\n" +
                                    "\n" +
                                    "<h3>Q-Function (Quality Function):</h3>\n" +
                                    "<p>The Q-function, denoted as Q(s, a), represents the expected future rewards that can be obtained from state s by taking action a and then following the optimal policy thereafter. The goal of Q-learning is to learn an optimal Q-function that maximizes the agent's cumulative reward over time.</p>\n" +
                                    "\n" +
                                    "<h3>State (s):</h3>\n" +
                                    "<p>A state is a configuration or situation in which the agent finds itself in the environment.</p>\n" +
                                    "\n" +
                                    "<h3>Action (a):</h3>\n" +
                                    "<p>An action is a choice the agent makes to interact with the environment, potentially leading to a change in state.</p>\n" +
                                    "\n" +
                                    "<h3>Reward (r):</h3>\n" +
                                    "<p>A reward is the feedback the agent receives after taking an action in a particular state. This reward can be positive or negative and helps the agent understand how good its actions are.</p>\n" +
                                    "\n" +
                                    "<h3>Learning Rate (α):</h3>\n" +
                                    "<p>The learning rate (α) is a factor that determines how much new information overrides the old information. A higher learning rate makes the agent learn faster but can lead to instability, while a lower learning rate makes the agent learn slower but can provide more stable results.</p>\n" +
                                    "\n" +
                                    "<h3>Discount Factor (γ):</h3>\n" +
                                    "<p>The discount factor (γ) determines the importance of future rewards compared to immediate rewards. A value close to 1 means the agent cares more about future rewards, while a value closer to 0 means it focuses on immediate rewards.</p>\n" +
                                    "\n" +
                                    "<h3>Policy:</h3>\n" +
                                    "<p>A policy is a strategy used by the agent to determine the next action based on its current state. The optimal policy is the one that maximizes the cumulative reward over time.</p>\n" +
                                    "\n" +
                                    "<h2>2. The Q-Learning Algorithm</h2>\n" +
                                    "<p>The Q-learning algorithm works by iteratively updating the Q-values for state-action pairs. These updates are based on the rewards received and the estimated future rewards. The main objective is to converge towards an optimal Q-function, from which an optimal policy can be derived.</p>\n" +
                                    "\n" +
                                    "<h3>Q-Learning Update Rule:</h3>\n" +
                                    "<p>The Q-value update is done using the following rule:</p>\n" +
                                    "<pre>\n" +
                                    "Q(s,a) ← Q(s,a) + α (r + γ ⋅ maxₐ' Q(s',a') − Q(s,a))\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Q(s,a)</strong>: The current Q-value for state s and action a.</li>\n" +
                                    "  <li><strong>r</strong>: The reward received after taking action a in state s.</li>\n" +
                                    "  <li><strong>γ</strong>: The discount factor, which determines how much importance is given to future rewards.</li>\n" +
                                    "  <li><strong>maxₐ' Q(s',a')</strong>: The maximum Q-value for the next state s' after taking action a. This represents the best possible future reward.</li>\n" +
                                    "  <li><strong>α</strong>: The learning rate, determining how much the Q-value should be updated.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Steps in Q-Learning:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Initialize:</strong> Initialize the Q-table with arbitrary values (usually zeros). Set the learning rate (α), discount factor (γ), and the exploration-exploitation strategy (epsilon, which controls the exploration rate).</li>\n" +
                                    "  <li><strong>Exploration vs. Exploitation:</strong> Choose an action using an epsilon-greedy policy, which balances between exploration (random actions) and exploitation (choosing the best-known action). With probability ε, the agent explores a random action, and with probability 1-ε, it exploits the action with the highest Q-value.</li>\n" +
                                    "  <li><strong>Take Action:</strong> Take the chosen action a, observe the reward r, and transition to the new state s'.</li>\n" +
                                    "  <li><strong>Update Q-value:</strong> Update the Q-value for the current state-action pair using the Q-learning update rule.</li>\n" +
                                    "  <li><strong>Repeat:</strong> Repeat steps 2-4 for a set number of episodes or until convergence, i.e., when the Q-values stabilize.</li>\n" +
                                    "  <li><strong>Derive the Optimal Policy:</strong> Once the Q-values have converged, the optimal policy is derived by selecting the action with the highest Q-value for each state.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Epsilon-Greedy Exploration-Exploitation Strategy</h2>\n" +
                                    "<p>In Q-learning, the epsilon-greedy strategy is a commonly used approach to balance exploration and exploitation:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Exploration:</strong> With probability ε (epsilon), the agent selects a random action to explore potentially better actions. This ensures that the agent does not get stuck in a local optimum.</li>\n" +
                                    "  <li><strong>Exploitation:</strong> With probability 1 - ε, the agent selects the action with the highest Q-value for the current state, exploiting the knowledge it has learned so far.</li>\n" +
                                    "</ul>\n" +
                                    "<p>To improve learning efficiency, epsilon often decays over time, meaning that the agent explores more in the beginning and gradually shifts towards exploitation as it gains more knowledge.</p>\n" +
                                    "\n" +
                                    "<h2>4. Example of Q-Learning</h2>\n" +
                                    "<p>Let’s consider a simple grid world environment where an agent has to navigate through a 3x3 grid, starting at the top-left corner and reaching the bottom-right corner. The agent can move in four directions: up, down, left, and right.</p>\n" +
                                    "\n" +
                                    "<h3>Grid Setup:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li>States are the cells in the grid (9 states in total for a 3x3 grid).</li>\n" +
                                    "  <li>Actions are moving up, down, left, or right.</li>\n" +
                                    "  <li>The reward is +1 for reaching the goal and -1 for hitting a wall.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Q-learning Steps:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li>Initialize the Q-table with zeros (no prior knowledge).</li>\n" +
                                    "  <li>Set α = 0.1 (learning rate), γ = 0.9 (discount factor), and ε = 0.5 (exploration rate).</li>\n" +
                                    "  <li>Start at the initial state (top-left corner).</li>\n" +
                                    "  <li>Choose an action using the epsilon-greedy policy.</li>\n" +
                                    "  <li>Move to the next state, receive the reward, and update the Q-value using the Q-learning update rule.</li>\n" +
                                    "  <li>Repeat until the agent learns the optimal path (i.e., the Q-values converge).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5. Advantages of Q-Learning</h2>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Model-Free:</strong> Q-learning doesn’t require a model of the environment. The agent learns solely through interaction and feedback.</li>\n" +
                                    "  <li><strong>Convergence:</strong> Given sufficient exploration, Q-learning guarantees convergence to the optimal policy, provided that the learning rate and discount factor are properly tuned.</li>\n" +
                                    "  <li><strong>Simplicity:</strong> Q-learning is simple to implement and understand, making it an excellent starting point for learning reinforcement learning.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(63, 21, "Deep Q-Networks", 3, "<h1>Deep Q-Networks (DQN): An Exploration of Deep Reinforcement Learning</h1>\n" +
                                    "<p>Deep Q-Networks (DQN) combine Q-learning with deep learning, enabling reinforcement learning (RL) agents to handle environments with large or continuous state spaces. Traditional Q-learning stores and updates Q-values in a table, but this approach becomes impractical when the state space is large, as it requires storing and updating Q-values for every possible state-action pair. DQN overcomes this limitation by using deep neural networks to approximate the Q-function, allowing the agent to work in environments where the state space is too large to store explicitly.</p>\n" +
                                    "<p>In this section, we’ll dive into Deep Q-Networks, explaining their structure, how they are trained, and their applications.</p>\n" +
                                    "\n" +
                                    "<h2>1. Overview of Deep Q-Networks (DQN)</h2>\n" +
                                    "<p>A Deep Q-Network (DQN) uses a neural network to approximate the Q-value function, Q(s, a), which is the expected cumulative reward for taking action a in state s. Instead of using a table to store Q-values, a neural network is trained to predict these values for any given state-action pair.</p>\n" +
                                    "\n" +
                                    "<h3>Why DQN?</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Large State Spaces:</strong> In many RL tasks, the state space can be so large (e.g., images in video games) that it's impractical to use a Q-table. DQNs address this by using a neural network to approximate the Q-values, enabling the agent to generalize across similar states.</li>\n" +
                                    "  <li><strong>Continuous State Spaces:</strong> In traditional Q-learning, the state space is discrete. However, many real-world environments (such as robotics or video games) have continuous state spaces, which require function approximation techniques like neural networks.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. Key Concepts in DQN</h2>\n" +
                                    "<p>The DQN algorithm extends traditional Q-learning by using deep learning techniques. Key concepts include:</p>\n" +
                                    "\n" +
                                    "<h3>1. Q-Function Approximation via Neural Networks</h3>\n" +
                                    "<p><strong>Neural Network as Q-Function:</strong> Instead of storing Q-values in a table, DQN uses a neural network to approximate the Q-function, which maps state-action pairs to their Q-values. The neural network takes the state as input and outputs Q-values for each possible action in that state.</p>\n" +
                                    "\n" +
                                    "<h3>Target Network:</h3>\n" +
                                    "<p>To stabilize training, DQN uses two networks:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Online Network:</strong> The network used to compute the Q-values.</li>\n" +
                                    "  <li><strong>Target Network:</strong> A copy of the online network that is updated periodically. This helps prevent the instability that can arise from using the same network for both Q-value prediction and updating.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Experience Replay</h3>\n" +
                                    "<p><strong>Experience Replay Buffer:</strong> In traditional Q-learning, the agent updates the Q-values immediately after taking an action. However, this can lead to high variance and instability in training. DQN uses an experience replay buffer to store past state-action-reward transitions. The agent samples random mini-batches of experiences from this buffer to train the neural network. This breaks the temporal correlation between consecutive samples and leads to more stable learning.</p>\n" +
                                    "\n" +
                                    "<h3>3. Q-Learning Update Rule</h3>\n" +
                                    "<p>The Q-learning update rule is adapted for DQN as follows:</p>\n" +
                                    "<pre>\n" +
                                    "Q(s,a) ← Q(s,a) + α (r + γ ⋅ maxₐ' Q'(s',a') − Q(s,a))\n" +
                                    "</pre>\n" +
                                    "<p>Where:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Q(s, a)</strong>: The predicted Q-value from the neural network.</li>\n" +
                                    "  <li><strong>r</strong>: The reward obtained after taking action a in state s.</li>\n" +
                                    "  <li><strong>γ</strong>: The discount factor.</li>\n" +
                                    "  <li><strong>maxₐ' Q'(s', a')</strong>: The maximum predicted Q-value from the target network for the next state s'.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The neural network is trained by minimizing the loss between the predicted Q-values and the target Q-values (as defined in the update rule).</p>\n" +
                                    "\n" +
                                    "<h2>3. Training DQNs</h2>\n" +
                                    "<p>Training a DQN involves iterating through the following steps:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Initialize the environment and networks:</strong> Initialize the Q-network (neural network) with random weights. Initialize the target network as a copy of the Q-network. Initialize the experience replay buffer.</li>\n" +
                                    "  <li><strong>Choose an action using epsilon-greedy:</strong> With probability ε, select a random action (exploration). Otherwise, select the action with the highest Q-value from the Q-network (exploitation).</li>\n" +
                                    "  <li><strong>Observe the outcome:</strong> Take the chosen action in the environment, observe the reward r, and transition to the next state s'.</li>\n" +
                                    "  <li><strong>Store the experience:</strong> Store the transition (state s, action a, reward r, next state s') in the experience replay buffer.</li>\n" +
                                    "  <li><strong>Sample mini-batch:</strong> Randomly sample a mini-batch of experiences from the buffer.</li>\n" +
                                    "  <li><strong>Compute the target Q-value:</strong> For each experience in the mini-batch, compute the target Q-value using the Q-learning update rule. The target Q-value is based on the current reward and the maximum Q-value predicted by the target network for the next state.</li>\n" +
                                    "  <li><strong>Update the Q-network:</strong> Use the mini-batch to train the Q-network by minimizing the difference between the predicted Q-values and the target Q-values. This is typically done using mean squared error (MSE) as the loss function.</li>\n" +
                                    "  <li><strong>Update the target network:</strong> Periodically update the target network by copying the weights from the Q-network to stabilize training.</li>\n" +
                                    "  <li><strong>Repeat:</strong> Repeat the process for a number of episodes or until the agent converges to an optimal policy.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Key Innovations in DQN</h2>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Target Network Stabilization:</strong> The use of a target network (which is periodically updated) is crucial to stabilizing the training of DQNs. Without this stabilization, the Q-network could end up chasing moving targets, leading to instability and poor convergence.</li>\n" +
                                    "  <li><strong>Experience Replay:</strong> Experience replay helps to break the temporal correlation between consecutive experiences. By training on randomly sampled mini-batches, the agent can learn more effectively and avoid overfitting to recent experiences.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5. Applications of DQNs</h2>\n" +
                                    "<p>DQN has had a significant impact in the field of reinforcement learning, especially in areas requiring high-dimensional input spaces, such as:</p>\n" +
                                    "\n" +
                                    "<h3>1. Atari Games</h3>\n" +
                                    "<p>One of the most notable applications of DQN was in Atari 2600 games, where it achieved human-level performance on several games. The input to the network is a series of raw pixel images from the game, and the output is a set of Q-values corresponding to possible actions (e.g., left, right, shoot).</p>\n" +
                                    "\n" +
                                    "<h3>2. Robotics</h3>\n" +
                                    "<p>DQNs are used in robotic control tasks, such as teaching robots to walk, pick up objects, or navigate through unknown environments. The robot learns to perform actions that maximize its long-term reward.</p>\n" +
                                    "\n" +
                                    "<h3>3. Autonomous Vehicles</h3>\n" +
                                    "<p>DQNs can be applied to the development of self-driving cars, where the agent learns to make decisions in complex driving environments, such as avoiding obstacles, obeying traffic rules, and optimizing for fuel efficiency.</p>\n" +
                                    "\n" +
                                    "<h3>4. Financial Trading</h3>\n" +
                                    "<p>DQNs can also be used in financial trading to optimize portfolio decisions, learning strategies that maximize returns based on market data.</p>\n" +
                                    "\n" +
                                    "<h3>5. Healthcare</h3>\n" +
                                    "<p>DQNs can help optimize decisions in healthcare, such as personalized treatment planning, by learning from past patient data to recommend actions that lead to the best long-term health outcomes.</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(64, 22, "Introduction to Text Generation", 1, "<h1>Introduction to Text Generation and Language Modeling</h1>\n" +
                                    "<p>Text generation is the process of creating human-like text based on input data, often using machine learning models. This task is fundamental to various applications, such as chatbots, automatic content generation, and creative writing. The core idea behind text generation is to predict the next word or sequence of words given a prompt, leveraging a model trained on a vast amount of text data.</p>\n" +
                                    "<p>At the heart of most text generation systems lies language modeling, which is a task where the goal is to predict the probability of a word (or a sequence of words) given the context or the words that precede it. In this section, we'll explore the basics of text generation, the concept of language modeling, and how machine learning models are used for these tasks.</p>\n" +
                                    "\n" +
                                    "<h2>1. What is Text Generation?</h2>\n" +
                                    "<p>Text generation is a type of Natural Language Processing (NLP) task in which a model generates human-like text based on certain input, such as a prompt or a topic. Text generation can be as simple as continuing a sentence or as complex as generating an entire article on a specific subject. Examples of text generation include:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Autocomplete Suggestions:</strong> Predicting the next word or phrase while typing in a text field.</li>\n" +
                                    "  <li><strong>Chatbots:</strong> Generating conversational responses to user queries.</li>\n" +
                                    "  <li><strong>Creative Writing:</strong> Automatically generating stories, poems, or other forms of creative writing.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The main challenge in text generation is ensuring that the output is coherent, contextually appropriate, and grammatically correct.</p>\n" +
                                    "\n" +
                                    "<h2>2. Language Modeling: The Foundation of Text Generation</h2>\n" +
                                    "<p>Language modeling is the process of learning the statistical properties of a language. The goal is to model the probability distribution of a sequence of words, so that a model can predict the next word based on the preceding words.</p>\n" +
                                    "\n" +
                                    "<h3>Types of Language Models</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>N-gram Models:</strong> These are statistical models that predict the probability of a word based on the previous n-1 words. For example, a bigram model looks at the previous word to predict the next one, while a trigram model considers the previous two words.\n" +
                                    "    <p><strong>Limitation:</strong> N-gram models are limited in the amount of context they can capture. For example, a bigram model only looks at the previous word and ignores larger contexts, which can lead to poor performance in complex tasks.</p>\n" +
                                    "  </li>\n" +
                                    "  <li><strong>Neural Language Models:</strong> These models use neural networks, particularly recurrent neural networks (RNNs) and transformers, to model word sequences. Neural language models can capture much longer dependencies between words and produce more accurate predictions.</li>\n" +
                                    "  <ul>\n" +
                                    "    <li><strong>Recurrent Neural Networks (RNNs):</strong> RNNs are designed to handle sequential data and can remember information from previous time steps. They are commonly used in text generation tasks because they can maintain context over longer sequences of text.</li>\n" +
                                    "    <li><strong>Transformers:</strong> Transformers are a more recent and powerful architecture for language modeling. Unlike RNNs, transformers can attend to all words in the sequence simultaneously, capturing long-range dependencies more efficiently.</li>\n" +
                                    "  </ul>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. How Text Generation Works</h2>\n" +
                                    "<p>The process of text generation involves generating words one at a time, where each word is predicted based on the previous words in the sequence. Here's how it generally works:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Pre-training:</strong> The first step in training a text generation model is pre-training. During this phase, the model is trained on a large corpus of text data to learn the relationships between words and their context. For example, a model like GPT (Generative Pre-trained Transformer) is trained on a massive dataset of books, articles, websites, etc. The pre-training typically uses a language modeling task where the model learns to predict the next word in a sequence given the preceding words.</li>\n" +
                                    "  <li><strong>Fine-tuning:</strong> Once pre-trained, the model can be fine-tuned on specific data, depending on the task. For instance, if you're building a chatbot, you might fine-tune the model on conversational data. Fine-tuning helps the model become more specialized and improves its performance on a specific application.</li>\n" +
                                    "  <li><strong>Generating Text:</strong> During the text generation phase, the model generates text one word at a time. Given an initial input or prompt, the model predicts the next word in the sequence, adds it to the input, and then predicts the next word. This process repeats until a stopping condition is met, such as a maximum number of words or a special token that indicates the end of the sequence.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Key Techniques for Text Generation</h2>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Greedy Search:</strong> In greedy search, the model generates the most probable word at each step. While this method is simple, it can lead to repetitive or uninteresting text because it always chooses the most likely next word.</li>\n" +
                                    "  <li><strong>Beam Search:</strong> Beam search is a more sophisticated search algorithm that considers multiple possible sequences at each step. It keeps track of several candidate sequences (called beams) and selects the ones with the highest overall probability. Beam search can generate more coherent and diverse text compared to greedy search.</li>\n" +
                                    "  <li><strong>Sampling:</strong> In sampling, words are randomly selected based on their probabilities rather than choosing the most probable one. This introduces more diversity and creativity into the generated text. Techniques like temperature sampling adjust the randomness: a higher temperature increases randomness, while a lower temperature makes the model more deterministic.</li>\n" +
                                    "  <li><strong>Top-k Sampling:</strong> In this method, only the top k most likely words are considered at each step. The model then samples from these words. This helps prevent the model from choosing low-probability words, making the generated text more coherent.</li>\n" +
                                    "  <li><strong>Top-p (Nucleus) Sampling:</strong> Instead of fixing the number of possible words to choose from (like top-k), top-p sampling considers the smallest set of words whose cumulative probability is greater than p. This approach allows the model to focus on a smaller, more likely set of words while maintaining diversity in the generated text.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(65, 22, "Training Language Models", 2, "<h1>Training Language Models for Text Generation</h1>\n" +
                                    "<p>Training a large language model (LLM) for text generation involves multiple steps, from data collection and preprocessing to model training and fine-tuning. These models, such as GPT (Generative Pre-trained Transformer), BERT (Bidirectional Encoder Representations from Transformers), and other transformer-based models, are the backbone of most state-of-the-art text generation systems today.</p>\n" +
                                    "<p>In this section, we'll explore the key concepts, steps, and considerations involved in training language models for text generation.</p>\n" +
                                    "\n" +
                                    "<h2>1. Key Components of a Language Model</h2>\n" +
                                    "<p>A language model (LM) is essentially a probabilistic model that estimates the likelihood of a sequence of words. The core components that make up a language model are:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Vocabulary:</strong> A predefined set of words or tokens that the model can recognize and predict. This vocabulary is built from the training data and typically includes common words, subword tokens, or special tokens (such as start and end of sentence).</li>\n" +
                                    "  <li><strong>Embedding Layer:</strong> Converts words (or tokens) into dense, continuous vectors of numbers. These embeddings capture semantic meanings and relationships between words.</li>\n" +
                                    "  <li><strong>Transformer Architecture:</strong> The transformer-based architecture is the foundation of modern language models. It uses layers of self-attention mechanisms to capture long-range dependencies and relationships between words in the input sequence.</li>\n" +
                                    "  <li><strong>Output Layer:</strong> The output of the model is typically a probability distribution over the vocabulary, from which the model selects the next word or token in the sequence.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. Preparing Data for Language Modeling</h2>\n" +
                                    "<p>Before training a language model, you need to prepare the data, which typically involves:</p>\n" +
                                    "\n" +
                                    "<h3>1. Collecting Data</h3>\n" +
                                    "<p>Language models are trained on massive corpora of text to learn the statistical patterns in language. The dataset might include:</p>\n" +
                                    "<ul>\n" +
                                    "  <li>Books, articles, and websites: Large and diverse datasets are ideal for training language models.</li>\n" +
                                    "  <li>Pre-existing corpora: Datasets like Common Crawl, Wikipedia, and BookCorpus are commonly used to train language models.</li>\n" +
                                    "  <li>Domain-Specific Text: For specialized language models, such as those for legal or medical text generation, you may need to curate a specific dataset that aligns with the desired application.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Preprocessing the Data</h3>\n" +
                                    "<p>Once you've collected the raw text, you'll need to preprocess it to make it usable for training. Preprocessing steps typically include:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Tokenization:</strong> Breaking the text into tokens (words or subwords) that the model can process. This is often done using WordPiece or Byte Pair Encoding (BPE) to handle out-of-vocabulary words by splitting them into subword units.</li>\n" +
                                    "  <li><strong>Cleaning:</strong> Removing special characters, HTML tags, non-textual content, and other irrelevant parts of the data to ensure high-quality input for training.</li>\n" +
                                    "  <li><strong>Text Formatting:</strong> Organizing the data into sequences of a fixed length that the model can process. Long texts might need to be split into smaller chunks, and each chunk must be labeled with its corresponding target (such as predicting the next word or sentence).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Training a Language Model</h2>\n" +
                                    "<p>Once your data is prepared, it's time to train the language model. Here's a breakdown of the steps:</p>\n" +
                                    "\n" +
                                    "<h3>1. Define the Model Architecture</h3>\n" +
                                    "<p>For text generation, transformer-based models like GPT (Generative Pretrained Transformer) are commonly used. The key architectural components of such models include:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Self-Attention Mechanism:</strong> Allows the model to weigh the importance of different words in the input sequence. This is essential for capturing the long-range dependencies in text.</li>\n" +
                                    "  <li><strong>Positional Encoding:</strong> Since transformers do not process sequences in order, positional encodings are added to provide the model with information about the relative positions of tokens in the sequence.</li>\n" +
                                    "  <li><strong>Multi-Head Attention:</strong> This allows the model to focus on different parts of the sequence simultaneously, improving its ability to learn complex relationships in the data.</li>\n" +
                                    "  <li><strong>Feedforward Neural Networks:</strong> After attention layers, a position-wise feedforward network helps in processing the contextualized representations of each token.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>2. Pretraining the Model</h3>\n" +
                                    "<p>Most modern large language models follow a pretraining-fine-tuning approach.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Pretraining:</strong> Pretraining involves training the model on a large, diverse dataset without any specific task in mind. During pretraining, the model learns to predict the next word (or token) in a sequence, which helps it learn general language patterns.</li>\n" +
                                    "  <li><strong>Masked Language Modeling:</strong> Some models, like BERT, use a masked language modeling (MLM) approach where a portion of the input tokens is randomly masked, and the model learns to predict these masked tokens based on context.</li>\n" +
                                    "  <li><strong>Autoregressive Training:</strong> Models like GPT are typically trained autoregressively. Given a sequence of tokens, the model predicts the next token, and this prediction is used as part of the input for the next prediction, effectively generating a sequence one token at a time.</li>\n" +
                                    "  <li><strong>Optimization:</strong> During pretraining, the model learns through gradient descent using an optimization technique like Adam or AdamW, with the objective of minimizing the loss function (usually cross-entropy loss) that quantifies the difference between the predicted and true token distributions.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>3. Fine-Tuning the Model</h3>\n" +
                                    "<p>After pretraining, fine-tuning the model on domain-specific tasks or data is essential to adapt it for a particular use case. For example, if you are building a text generator for medical texts, you would fine-tune your pretrained model on a corpus of medical literature.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Supervised Fine-Tuning:</strong> Training the model on a labeled dataset (e.g., paired text inputs and desired outputs) to specialize in specific tasks such as question answering or dialogue generation.</li>\n" +
                                    "  <li><strong>Transfer Learning:</strong> The pretrained model can transfer its learned knowledge from the pretraining phase to solve specialized tasks with relatively small amounts of task-specific data.</li>\n" +
                                    "  <li><strong>Hyperparameter Tuning:</strong> During fine-tuning, hyperparameters such as learning rate, batch size, and training duration must be adjusted for optimal performance.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Evaluating Language Model Performance</h2>\n" +
                                    "<p>After training, it's important to evaluate the performance of your language model. Some common evaluation metrics include:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Perplexity:</strong> Measures how well the model predicts the next word in a sequence. A lower perplexity indicates better performance.</li>\n" +
                                    "  <li><strong>BLEU (Bilingual Evaluation Understudy):</strong> Often used in tasks like machine translation, BLEU measures the overlap between the generated text and reference text.</li>\n" +
                                    "  <li><strong>ROUGE (Recall-Oriented Understudy for Gisting Evaluation):</strong> Used for evaluating the quality of summaries or generated text by comparing the overlap of n-grams between the generated and reference text.</li>\n" +
                                    "  <li><strong>Human Evaluation:</strong> In many cases, human evaluators assess the coherence, relevance, and creativity of the generated text, especially for tasks like story generation or conversational models.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(66, 22, "Applications of Text Generation", 3, "<h1>Applications of Text Generation in NLP</h1>\n" +
                                    "<p>Text generation, driven by sophisticated language models such as GPT (Generative Pre-trained Transformer) and other transformer-based models, has seen a wide range of real-world applications across various industries. These models are capable of producing human-like text and can understand context, making them invaluable tools for numerous Natural Language Processing (NLP) tasks. Below, we explore several key applications of text generation in NLP.</p>\n" +
                                    "\n" +
                                    "<h2>1. Chatbots and Conversational Agents</h2>\n" +
                                    "<h3>Application Overview:</h3>\n" +
                                    "<p>One of the most popular uses of text generation is in chatbots and conversational agents. These systems generate text responses that simulate human-like conversations, often in customer support, healthcare, or entertainment settings.</p>\n" +
                                    "\n" +
                                    "<h3>How It Works:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li>A chatbot generates text based on user inputs, aiming to provide relevant and coherent responses.</li>\n" +
                                    "  <li>Models like GPT-3 or fine-tuned BERT are used to understand the context of a user's query and generate an appropriate answer.</li>\n" +
                                    "  <li>The chatbot can be trained on large datasets of dialogues and fine-tuned for specific domains (e.g., customer service, technical support, or social media).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Customer Service Chatbots:</strong> Businesses use text generation for automating customer service responses, reducing the need for human intervention and improving efficiency. For example, a chatbot can handle common customer queries related to billing or product information.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. Content Creation and Copywriting</h2>\n" +
                                    "<h3>Application Overview:</h3>\n" +
                                    "<p>Text generation is extensively used in content creation, helping generate articles, blogs, social media posts, product descriptions, and more.</p>\n" +
                                    "\n" +
                                    "<h3>How It Works:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li>Language models are trained on large corpora of text and fine-tuned for specific writing styles or topics.</li>\n" +
                                    "  <li>The model generates human-like text that is coherent, relevant, and engaging based on given input prompts, such as article titles or product names.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Automated Article Generation:</strong> Websites like Copy.ai or Jasper.ai use text generation to automatically generate blog posts and articles based on a user-provided title or keywords.</li>\n" +
                                    "  <li><strong>SEO Content:</strong> Text generation tools help marketers create SEO-optimized content that ranks well on search engines.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Text Summarization</h2>\n" +
                                    "<h3>Application Overview:</h3>\n" +
                                    "<p>Text summarization is another crucial application of text generation. It involves creating a concise version of a longer text while retaining its core meaning and key information. There are two types of text summarization:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Extractive Summarization:</strong> Extracting relevant sentences or phrases from the original text.</li>\n" +
                                    "  <li><strong>Abstractive Summarization:</strong> Generating a new, shorter text that conveys the same information as the original.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>How It Works:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li>For abstractive summarization, text generation models like GPT are used to condense the original text into a shorter version while maintaining coherence and key insights.</li>\n" +
                                    "  <li>These models are fine-tuned to understand the context and ensure that the generated summary is not only brief but also accurate and informative.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>News Summarization:</strong> Media outlets use text generation for automatically summarizing long news articles into brief highlights that readers can quickly scan.</li>\n" +
                                    "  <li><strong>Legal Document Summarization:</strong> Text generation models can help summarize long legal documents into digestible formats, enabling legal professionals to grasp key points without reading the entire text.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Machine Translation</h2>\n" +
                                    "<h3>Application Overview:</h3>\n" +
                                    "<p>Text generation is fundamental in machine translation systems, which automatically translate text from one language to another. Modern translation systems, such as Google Translate, rely on text generation models to produce fluent translations.</p>\n" +
                                    "\n" +
                                    "<h3>How It Works:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li>The language model is trained on large parallel corpora (texts in two languages) to learn how sentences and phrases in one language correspond to sentences in another language.</li>\n" +
                                    "  <li>During translation, the model generates the target text based on the input text, maintaining grammatical correctness and meaning across languages.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Google Translate:</strong> Google’s neural machine translation system uses a transformer-based text generation approach to translate text between multiple languages in real-time, improving accuracy and fluency.</li>\n" +
                                    "  <li><strong>Translation Services:</strong> Businesses operating in multiple countries use automatic translation services to communicate with customers and clients in their native languages.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5. Text-to-Speech and Speech Synthesis</h2>\n" +
                                    "<h3>Application Overview:</h3>\n" +
                                    "<p>Text-to-speech (TTS) systems, which convert written text into spoken language, are increasingly using text generation models to produce more natural and human-like voices.</p>\n" +
                                    "\n" +
                                    "<h3>How It Works:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li>Text generation models can generate contextually appropriate text that is then fed into a TTS system, which synthesizes the speech.</li>\n" +
                                    "  <li>These systems aim to not only produce correct pronunciations but also convey emotion and intonation, making the speech sound natural and fluid.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Virtual Assistants (e.g., Siri, Alexa, Google Assistant):</strong> These assistants use text generation models to understand user requests and respond in a natural, conversational tone.</li>\n" +
                                    "  <li><strong>Audiobook Creation:</strong> Text generation and TTS systems can be used to create audiobooks from written content, especially useful for visually impaired users.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>6. Creative Writing and Story Generation</h2>\n" +
                                    "<h3>Application Overview:</h3>\n" +
                                    "<p>Text generation models are increasingly being used for creative writing, including generating short stories, poetry, and even novels. This is a significant area where AI can assist writers or even generate stories autonomously.</p>\n" +
                                    "\n" +
                                    "<h3>How It Works:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li>The model is trained on large datasets of creative works (such as books, short stories, and scripts) to learn narrative structures, dialogue, and character development.</li>\n" +
                                    "  <li>The model can generate entire stories based on a prompt or continue writing a piece of content in a consistent style.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Story Generation Tools:</strong> Tools like AI Dungeon or Plot Generator allow users to provide prompts, and the AI generates interactive stories or creative pieces based on those inputs.</li>\n" +
                                    "  <li><strong>Scriptwriting:</strong> AI models can assist screenwriters by generating dialogue or entire scenes, helping writers overcome creative blocks.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>7. Sentiment Analysis and Opinion Mining</h2>\n" +
                                    "<h3>Application Overview:</h3>\n" +
                                    "<p>Text generation models are used in sentiment analysis to assess the tone or sentiment of a given piece of text. Sentiment analysis involves determining whether a piece of text is positive, negative, or neutral, which is valuable in market research, brand monitoring, and customer feedback analysis.</p>\n" +
                                    "\n" +
                                    "<h3>How It Works:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li>The model generates predictions about the sentiment of the text by analyzing patterns in language that correspond to emotional cues (e.g., positive or negative words, phrases).</li>\n" +
                                    "  <li>Often combined with other NLP tasks like named entity recognition (NER), these systems can also categorize sentiments related to specific products, services, or events.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Customer Feedback Analysis:</strong> Businesses use text generation models to automatically analyze customer reviews or social media mentions to gauge sentiment and respond to negative feedback.</li>\n" +
                                    "  <li><strong>Brand Monitoring:</strong> Sentiment analysis tools generate insights into public opinions, allowing companies to track how their brand is perceived.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>8. Code Generation</h2>\n" +
                                    "<h3>Application Overview:</h3>\n" +
                                    "<p>Text generation models have also found applications in code generation, where they assist developers by automatically generating code snippets based on natural language descriptions or prompts.</p>\n" +
                                    "\n" +
                                    "<h3>How It Works:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li>The model is trained on large datasets of programming languages and their syntactic rules, enabling it to understand natural language descriptions of code functionality and generate corresponding code.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Example:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>GitHub Copilot:</strong> GitHub Copilot, powered by OpenAI’s Codex, helps developers by suggesting code snippets and entire functions based on the developer's natural language comments and code context.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02")
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
                            Unit(67, 23, "Basics of Sentiment Analysis", 1, "<h1>1. What is Sentiment Analysis?</h1>\n" +
                                    "<p>Sentiment analysis refers to the computational task of identifying and categorizing opinions expressed in text to determine whether the sentiment is positive, negative, or neutral. The primary objective of sentiment analysis is to extract subjective information from text data.</p>\n" +
                                    "\n" +
                                    "<h3>Key Goals of Sentiment Analysis:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Identify Sentiment:</strong> Classify text as positive, negative, or neutral.</li>\n" +
                                    "  <li><strong>Intensity of Sentiment:</strong> Assess how strong or weak the sentiment is (e.g., very happy, somewhat sad).</li>\n" +
                                    "  <li><strong>Aspect-Based Sentiment:</strong> Detect sentiment associated with specific aspects (e.g., product quality, customer service).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>2. Importance of Sentiment Analysis in NLP</h1>\n" +
                                    "<p>Sentiment analysis plays a significant role in various applications and industries, helping businesses and organizations understand the emotions and opinions of their customers or target audience. Some of its key applications include:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Market Research:</strong> Sentiment analysis allows businesses to understand public opinion about products, services, or brands. By analyzing customer reviews or social media posts, companies can gain insights into customer satisfaction and preferences.</li>\n" +
                                    "  <li><strong>Brand Monitoring:</strong> Organizations track their brand reputation by analyzing the sentiment of online mentions or social media posts. Positive or negative shifts in sentiment can indicate how a brand is perceived.</li>\n" +
                                    "  <li><strong>Customer Service:</strong> Sentiment analysis helps companies monitor customer feedback and identify complaints or issues early on. This enables prompt responses and proactive improvements.</li>\n" +
                                    "  <li><strong>Social Media Monitoring:</strong> Analyzing sentiment in tweets, Facebook posts, or Instagram comments allows businesses and political campaigns to understand public sentiment about a particular topic or event.</li>\n" +
                                    "  <li><strong>Product Improvement:</strong> By analyzing the sentiment in user feedback, product reviews, and survey responses, companies can identify areas for improvement in their products or services.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>3. Types of Sentiment Analysis</h1>\n" +
                                    "<p>Sentiment analysis can be broken down into various types based on the granularity of the analysis:</p>\n" +
                                    "\n" +
                                    "<h3>a. Document-Level Sentiment Analysis</h3>\n" +
                                    "<p>At this level, sentiment is analyzed for an entire document, such as a review or article. The goal is to classify the sentiment of the entire text as positive, negative, or neutral.</p>\n" +
                                    "<p><strong>Example:</strong> A movie review with the statement \"The movie was fantastic and the acting was superb\" would likely be classified as positive sentiment.</p>\n" +
                                    "\n" +
                                    "<h3>b. Sentence-Level Sentiment Analysis</h3>\n" +
                                    "<p>In sentence-level sentiment analysis, sentiment is determined at the level of individual sentences. Each sentence is classified into one of the sentiment categories.</p>\n" +
                                    "<p><strong>Example:</strong> \"The food was cold\" might be classified as negative, while \"The service was excellent\" would be classified as positive.</p>\n" +
                                    "\n" +
                                    "<h3>c. Aspect-Based Sentiment Analysis</h3>\n" +
                                    "<p>This type of analysis focuses on identifying sentiments related to specific aspects or features mentioned in the text. For example, if a customer review discusses both the service and the product, aspect-based sentiment analysis can differentiate the sentiment toward each aspect.</p>\n" +
                                    "<p><strong>Example:</strong> In the sentence \"The laptop has great battery life but the screen resolution is poor,\" the sentiment for \"battery life\" might be classified as positive, while the sentiment for \"screen resolution\" would be negative.</p>\n" +
                                    "\n" +
                                    "<h1>4. Methods of Sentiment Analysis</h1>\n" +
                                    "<p>Sentiment analysis can be approached using various techniques, including:</p>\n" +
                                    "\n" +
                                    "<h3>a. Lexicon-Based Approaches</h3>\n" +
                                    "<p>This method relies on predefined dictionaries or lexicons of words with assigned sentiment scores. Each word in the text is matched against the lexicon, and the sentiment is determined based on the overall score.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Pros:</strong> Simple and interpretable.</li>\n" +
                                    "  <li><strong>Cons:</strong> May not account for context (e.g., sarcasm or irony) and might struggle with domain-specific language.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>b. Machine Learning-Based Approaches</h3>\n" +
                                    "<p>Machine learning techniques, such as supervised learning, are widely used for sentiment analysis. In this approach, labeled datasets (texts with known sentiments) are used to train classification models.</p>\n" +
                                    "<p><strong>Common Algorithms:</strong></p>\n" +
                                    "<ul>\n" +
                                    "  <li>Logistic Regression</li>\n" +
                                    "  <li>Support Vector Machines (SVM)</li>\n" +
                                    "  <li>Naive Bayes</li>\n" +
                                    "  <li>Random Forests</li>\n" +
                                    "</ul>\n" +
                                    "<p>The model learns the relationship between words/features and their corresponding sentiment labels to make predictions on unseen text.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Pros:</strong> Can capture more nuanced patterns in the data.</li>\n" +
                                    "  <li><strong>Cons:</strong> Requires large labeled datasets for training.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>c. Deep Learning-Based Approaches</h3>\n" +
                                    "<p>Deep learning methods, particularly Recurrent Neural Networks (RNNs) and Transformer-based models (like BERT), have significantly improved the accuracy of sentiment analysis tasks. These models can capture context and semantic meaning, making them highly effective for complex tasks.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Pros:</strong> Able to understand context, handle large datasets, and provide state-of-the-art performance.</li>\n" +
                                    "  <li><strong>Cons:</strong> Computationally expensive and requires a lot of data for training.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>5. Challenges in Sentiment Analysis</h1>\n" +
                                    "<p>Despite its usefulness, sentiment analysis faces several challenges:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Sarcasm and Irony:</strong> Sentiment analysis models may struggle with detecting sarcasm or irony, where the actual sentiment contradicts the literal meaning of the words.</li>\n" +
                                    "  <li><strong>Context and Ambiguity:</strong> Words with multiple meanings or ambiguous sentiment can cause problems. For example, the word \"sick\" can be positive in some contexts (e.g., \"That’s sick!\"), but negative in others (e.g., \"I feel sick\").</li>\n" +
                                    "  <li><strong>Domain-Specific Language:</strong> Sentiment analysis models may struggle when applied to domain-specific texts that contain jargon or specialized terminology.</li>\n" +
                                    "  <li><strong>Multilingual Sentiment Analysis:</strong> Analyzing sentiment in different languages with varying syntactic and semantic structures presents additional challenges.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>6. Tools and Libraries for Sentiment Analysis</h1>\n" +
                                    "<p>Several libraries and tools can be used to implement sentiment analysis models:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>NLTK (Natural Language Toolkit):</strong> A comprehensive Python library for text processing that includes tools for sentiment analysis.</li>\n" +
                                    "  <li><strong>TextBlob:</strong> A simple Python library for NLP that provides pre-trained sentiment analysis models.</li>\n" +
                                    "  <li><strong>VADER (Valence Aware Dictionary and sEntiment Reasoner):</strong> A lexicon and rule-based sentiment analysis tool specifically attuned to social media texts.</li>\n" +
                                    "  <li><strong>Transformers (Hugging Face):</strong> Provides access to pre-trained models like BERT, RoBERTa, and GPT, which can be fine-tuned for sentiment analysis tasks.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(68, 23, "Deep Learning for Sentiment Analysis", 2, "<h1>Deep Learning for Sentiment Analysis</h1>\n" +
                                    "<p>Deep learning techniques have revolutionized sentiment analysis by improving the accuracy and capabilities of models, allowing them to handle complex patterns and contextual information. In this unit, we will explore how deep learning is applied to sentiment analysis tasks, the key architectures used, and how they enhance sentiment classification tasks beyond traditional machine learning methods.</p>\n" +
                                    "\n" +
                                    "<h1>1. Overview of Deep Learning in Sentiment Analysis</h1>\n" +
                                    "<p>Deep learning techniques, especially Recurrent Neural Networks (RNNs), Long Short-Term Memory (LSTM) networks, and Transformers, are highly effective for sentiment analysis tasks because they can capture complex relationships and contextual information in sequential text data. These models can go beyond simple word-level classification and understand context, tone, and sequence.</p>\n" +
                                    "<p><strong>Key advantages of using deep learning for sentiment analysis include:</strong></p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Context Awareness:</strong> Deep learning models can take into account the context in which words appear, improving the model's ability to understand negation, sarcasm, and ambiguity.</li>\n" +
                                    "  <li><strong>Handling Sequential Data:</strong> Sentiment analysis often deals with sequences of words, and deep learning models like RNNs and LSTMs are designed to process such sequential data effectively.</li>\n" +
                                    "  <li><strong>End-to-End Learning:</strong> Deep learning models allow for end-to-end training, meaning raw text can be processed directly without the need for manual feature extraction.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>2. Key Deep Learning Models Used in Sentiment Analysis</h1>\n" +
                                    "\n" +
                                    "<h3>a. Recurrent Neural Networks (RNNs)</h3>\n" +
                                    "<p>Recurrent Neural Networks (RNNs) are a type of neural network specifically designed for processing sequential data. They have an internal memory that allows them to retain information from previous time steps, making them ideal for tasks like sentiment analysis, where the meaning of a word may depend on the words that precede it.</p>\n" +
                                    "<p><strong>RNN for Sentiment Analysis:</strong> In sentiment analysis, an RNN processes each word in a sentence one by one, updating its hidden state after each word to capture the overall sentiment of the text.</p>\n" +
                                    "<p><strong>Challenges with RNNs:</strong> Traditional RNNs suffer from the vanishing gradient problem, making it difficult for the model to capture long-range dependencies in the text.</p>\n" +
                                    "\n" +
                                    "<h3>b. Long Short-Term Memory (LSTM) Networks</h3>\n" +
                                    "<p>LSTMs are a specialized type of RNN designed to mitigate the vanishing gradient problem. They have a more complex structure with gates (input, forget, and output gates) that control the flow of information, allowing the model to remember or forget information over long sequences.</p>\n" +
                                    "<p><strong>LSTM for Sentiment Analysis:</strong> LSTM models are able to retain important information over longer sentences or paragraphs, which is crucial for understanding sentiment in more complex contexts.</p>\n" +
                                    "<p><strong>Example:</strong> In the sentence “The movie was great, but the ending was disappointing,” an LSTM can capture both the positive sentiment in “The movie was great” and the negative sentiment in “the ending was disappointing,” understanding the contrast between the two parts.</p>\n" +
                                    "\n" +
                                    "<h3>c. Gated Recurrent Units (GRUs)</h3>\n" +
                                    "<p>GRUs are a variation of LSTMs, but with a simpler architecture. Like LSTMs, GRUs also use gating mechanisms to control information flow but with fewer parameters. This makes GRUs faster to train and more efficient, though they may not capture long-term dependencies as effectively as LSTMs.</p>\n" +
                                    "\n" +
                                    "<h3>d. Transformers</h3>\n" +
                                    "<p>Transformers, introduced in the paper “Attention is All You Need,” have become the dominant model architecture for many NLP tasks, including sentiment analysis. Unlike RNNs or LSTMs, Transformers don’t process text sequentially. Instead, they use a mechanism called self-attention to process all words in the input simultaneously while considering the relationships between words, regardless of their position in the sentence.</p>\n" +
                                    "<p><strong>Transformers for Sentiment Analysis:</strong> Transformers can attend to all words in a sentence or paragraph at once, capturing long-range dependencies without the sequential processing of RNNs. This ability to focus on relevant parts of the text at once makes transformers particularly powerful for tasks involving complex language understanding.</p>\n" +
                                    "<p><strong>Example:</strong> For the sentence “I loved the movie, but the plot was confusing,” a transformer model could learn to associate the positive sentiment with \"loved\" and the negative sentiment with \"confusing,\" even if the two sentiments are far apart.</p>\n" +
                                    "\n" +
                                    "<h1>3. How Deep Learning Models Are Trained for Sentiment Analysis</h1>\n" +
                                    "<p>Deep learning models for sentiment analysis are typically trained using large labeled datasets where the sentiment of the text is known. The training process involves:</p>\n" +
                                    "\n" +
                                    "<h3>a. Preprocessing Text Data</h3>\n" +
                                    "<p>Before feeding text data into a deep learning model, it must be preprocessed to convert it into a numerical format that the model can understand. This may involve:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Tokenization:</strong> Breaking text into individual words or subwords.</li>\n" +
                                    "  <li><strong>Vectorization:</strong> Converting tokens into numerical vectors, often using techniques like Word2Vec, GloVe, or TF-IDF. With the advent of transformers, models like BERT use pre-trained embeddings directly.</li>\n" +
                                    "  <li><strong>Padding:</strong> Since sentences have varying lengths, padding is applied to ensure all sequences have the same length for batch processing.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>b. Model Architecture</h3>\n" +
                                    "<p>Once the text is preprocessed, the deep learning model, such as an LSTM or Transformer, is applied. The architecture typically consists of:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Embedding Layer:</strong> This layer converts input tokens into dense vectors. Pre-trained embeddings like Word2Vec or GloVe can be used here, or embeddings can be learned during training.</li>\n" +
                                    "  <li><strong>Hidden Layers:</strong> These layers capture the sequential or contextual relationships between words. In RNNs, LSTMs, and GRUs, these layers consist of recurrent units that process the text in sequence. In transformers, the self-attention mechanism allows the model to focus on different parts of the text.</li>\n" +
                                    "  <li><strong>Output Layer:</strong> A final fully connected layer with a softmax activation function is typically used to classify the sentiment of the text into categories like positive, negative, or neutral.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>c. Training Process</h3>\n" +
                                    "<p>The model is trained using labeled data, where each sentence has a corresponding sentiment label. The model's predictions are compared to the true sentiment, and the loss (usually cross-entropy loss) is computed. The model is then updated using backpropagation and gradient descent to minimize the loss.</p>\n" +
                                    "\n" +
                                    "<h1>4. Fine-Tuning Pretrained Models for Sentiment Analysis</h1>\n" +
                                    "<p>Recent advances in deep learning have led to the development of pretrained transformer models like BERT (Bidirectional Encoder Representations from Transformers), GPT (Generative Pre-trained Transformer), and RoBERTa. These models are trained on large corpora and can be fine-tuned on specific tasks, such as sentiment analysis.</p>\n" +
                                    "\n" +
                                    "<h3>Fine-Tuning with BERT</h3>\n" +
                                    "<p>BERT is a transformer model that is pre-trained on vast amounts of text data and learns deep contextual representations of words. For sentiment analysis, BERT can be fine-tuned on a sentiment-labeled dataset by adding a classification layer on top of the pretrained model.</p>\n" +
                                    "<p>Fine-tuning BERT involves training the model on a small dataset with sentiment labels, allowing it to adapt to the specific language patterns of sentiment in the target domain.</p>\n" +
                                    "<p><strong>Example:</strong> Fine-tuning BERT on a sentiment analysis dataset like movie reviews will help the model understand how sentiments are expressed in that context.</p>\n" +
                                    "\n" +
                                    "<h1>5. Evaluation Metrics for Sentiment Analysis Models</h1>\n" +
                                    "<p>Once the deep learning model is trained, it is evaluated using several performance metrics:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Accuracy:</strong> The percentage of correctly classified sentiment labels.</li>\n" +
                                    "  <li><strong>Precision:</strong> The percentage of correctly predicted positive sentiments out of all predicted positive sentiments.</li>\n" +
                                    "  <li><strong>Recall:</strong> The percentage of correctly predicted positive sentiments out of all actual positive sentiments.</li>\n" +
                                    "  <li><strong>F1-Score:</strong> The harmonic mean of precision and recall, providing a balanced evaluation metric.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h1>6. Applications of Deep Learning in Sentiment Analysis</h1>\n" +
                                    "<p>Deep learning models are used in sentiment analysis across various industries:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Customer Feedback:</strong> Analyzing customer reviews to understand overall satisfaction or dissatisfaction.</li>\n" +
                                    "  <li><strong>Social Media Monitoring:</strong> Analyzing social media posts (e.g., tweets or Facebook comments) to gauge public sentiment towards products, services, or political events.</li>\n" +
                                    "  <li><strong>Brand Monitoring:</strong> Monitoring mentions of a brand on social media and news outlets to assess how the public perceives the brand.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
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
                            Unit(70, 24, "Introduction to NER", 1, "<h1>Introduction to Named Entity Recognition (NER)</h1>\n" +
                                    "<p>Named Entity Recognition (NER) is a key task in Natural Language Processing (NLP) that involves identifying and classifying named entities in text. These entities typically represent important information such as names of people, organizations, locations, dates, monetary values, and more. NER is fundamental for understanding and structuring unstructured text, and it plays a crucial role in various applications like information retrieval, question answering, and text summarization.</p>\n" +
                                    "\n" +
                                    "<h2>1. What is Named Entity Recognition (NER)?</h2>\n" +
                                    "<p>NER is the process of locating and classifying entities in a text into predefined categories, such as:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Person</strong> (e.g., “John Smith”, “Albert Einstein”) </li>\n" +
                                    "  <li><strong>Organization</strong> (e.g., “Google”, “United Nations”) </li>\n" +
                                    "  <li><strong>Location</strong> (e.g., “New York”, “Mount Everest”) </li>\n" +
                                    "  <li><strong>Date and Time</strong> (e.g., “January 1st, 2020”, “Monday”) </li>\n" +
                                    "  <li><strong>Monetary Value</strong> (e.g., “\$1000”, “€500”) </li>\n" +
                                    "  <li>Other types can include percentages, product names, and more.</li>\n" +
                                    "</ul>\n" +
                                    "<p><strong>Example:</strong> In the sentence:</p>\n" +
                                    "<pre>\n" +
                                    "  \"Apple Inc. was founded by Steve Jobs in Cupertino in 1976.\"\n" +
                                    "</pre>\n" +
                                    "<ul>\n" +
                                    "  <li>Apple Inc. (Organization)</li>\n" +
                                    "  <li>Steve Jobs (Person)</li>\n" +
                                    "  <li>Cupertino (Location)</li>\n" +
                                    "  <li>1976 (Date)</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. How NER Works</h2>\n" +
                                    "<p>NER systems typically work in the following steps:</p>\n" +
                                    "<ol>\n" +
                                    "  <li><strong>Text Preprocessing:</strong> Before applying NER, the text is often preprocessed to remove stop words, special characters, and sometimes to tokenize it into individual words or phrases. This helps in breaking down complex sentences and making entity detection easier.</li>\n" +
                                    "  <li><strong>Named Entity Detection:</strong> The core part of NER involves detecting named entities in the text. This can be done using different approaches, such as rule-based methods, machine learning, or deep learning.</li>\n" +
                                    "  <li><strong>Named Entity Classification:</strong> Once the named entities are identified, they are classified into categories such as PERSON, LOCATION, ORGANIZATION, etc. This classification helps in understanding the context of the entity and how it fits into the broader structure of the text.</li>\n" +
                                    "</ol>\n" +
                                    "\n" +
                                    "<h2>3. Approaches to NER</h2>\n" +
                                    "<p>There are three primary approaches used in NER:</p>\n" +
                                    "\n" +
                                    "<h3>a. Rule-Based Systems</h3>\n" +
                                    "<p>In rule-based systems, a set of manually defined rules (patterns) is used to identify named entities. For instance, rules may be written to recognize capitalized words, specific suffixes (like \"Inc.\" or \"Ltd.\" for organizations), or dates.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Pros:</strong> Easy to understand, interpretable, and can be highly accurate in specific domains with well-defined rules.</li>\n" +
                                    "  <li><strong>Cons:</strong> Time-consuming to create rules, not scalable, and may struggle with diverse or unseen data.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>b. Machine Learning-Based Approaches</h3>\n" +
                                    "<p>Machine learning models can be trained on labeled datasets containing text annotated with named entities. Common algorithms include decision trees, SVMs, or CRFs (Conditional Random Fields).</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Pros:</strong> Can handle a wide range of entities and more complex text.</li>\n" +
                                    "  <li><strong>Cons:</strong> Requires large labeled datasets for training and can struggle with ambiguous or out-of-domain data.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>c. Deep Learning Approaches</h3>\n" +
                                    "<p>Deep learning, particularly with Recurrent Neural Networks (RNNs), Long Short-Term Memory (LSTM) networks, and Transformers, has achieved state-of-the-art performance in NER tasks. These models automatically learn to identify and classify entities without relying on manually defined rules.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Pros:</strong> Highly accurate, capable of handling large datasets, and adaptable to complex language structures.</li>\n" +
                                    "  <li><strong>Cons:</strong> Requires a significant amount of labeled data for training and is computationally intensive.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Challenges in NER</h2>\n" +
                                    "<p>Despite its successes, NER faces several challenges:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Ambiguity:</strong> Some entities can have multiple meanings depending on the context (e.g., “Apple” could refer to the fruit or the company).</li>\n" +
                                    "  <li><strong>Complex Entities:</strong> Some entities may consist of multiple words, like “New York City” or “United States of America.” These require specialized models or tokenizers.</li>\n" +
                                    "  <li><strong>Unseen Entities:</strong> Models may struggle to identify entities they have not encountered during training, such as new company names or emerging events.</li>\n" +
                                    "  <li><strong>Contextual Understanding:</strong> The meaning of an entity can change depending on its context. For example, “The Amazon” could refer to the river or the company.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5. Applications of NER</h2>\n" +
                                    "<p>NER is used in a variety of real-world applications, including:</p>\n" +
                                    "\n" +
                                    "<h3>a. Information Extraction</h3>\n" +
                                    "<p>NER helps to extract structured information from unstructured text. For example, it can be used to identify and extract key details from legal documents, scientific papers, or news articles.</p>\n" +
                                    "<p><strong>Example:</strong> Automatically extracting the names of people and companies from a legal contract.</p>\n" +
                                    "\n" +
                                    "<h3>b. Question Answering Systems</h3>\n" +
                                    "<p>NER is used in question answering systems to extract entities from a query or passage. By identifying named entities, the system can better understand the question and provide relevant answers.</p>\n" +
                                    "<p><strong>Example:</strong> In a question like “Who is the CEO of Microsoft?”, NER helps identify “CEO” (a role) and “Microsoft” (an organization).</p>\n" +
                                    "\n" +
                                    "<h3>c. Information Retrieval</h3>\n" +
                                    "<p>In search engines, NER is used to improve the accuracy of search results by identifying and ranking relevant named entities in documents.</p>\n" +
                                    "<p><strong>Example:</strong> If a user searches for “Best restaurants in Paris”, NER helps the search engine focus on locations (Paris) and related entities (restaurants).</p>\n" +
                                    "\n" +
                                    "<h3>d. Sentiment Analysis</h3>\n" +
                                    "<p>NER can be combined with sentiment analysis to understand the sentiment toward specific entities. For example, analyzing reviews to determine if people feel positively or negatively about certain products, companies, or locations.</p>\n" +
                                    "<p><strong>Example:</strong> In a product review, determining if the sentiment toward “iPhone” is positive or negative.</p>\n" +
                                    "\n" +
                                    "<h2>6. Tools and Libraries for NER</h2>\n" +
                                    "<p>Several popular libraries and tools can be used to implement NER:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>spaCy:</strong> A powerful Python library for NLP that comes with pre-trained models for NER, capable of detecting various entities like people, places, organizations, etc.</li>\n" +
                                    "  <li><strong>NLTK (Natural Language Toolkit):</strong> Another Python library with basic NER functionalities, useful for educational purposes and smaller projects.</li>\n" +
                                    "  <li><strong>Stanford NER:</strong> Developed by the Stanford NLP Group, this Java-based tool is popular for high-accuracy NER tasks.</li>\n" +
                                    "  <li><strong>Hugging Face Transformers:</strong> Offers transformer-based models (like BERT and RoBERTa) that are fine-tuned for NER tasks with high accuracy.</li>\n" +
                                    "  <li><strong>Flair:</strong> A Python NLP library that also offers pre-trained models for NER using modern architectures like LSTMs and BERT.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(71, 24, "Training NER Models", 2, "<h1>Training NER Models</h1>\n" +
                                    "<p>Training a Named Entity Recognition (NER) model involves building a machine learning or deep learning model that can automatically identify and classify named entities in text. This process requires a dataset that contains text with labeled entities and the appropriate algorithms for training and evaluation. Below is a step-by-step guide to help you train a model for NER.</p>\n" +
                                    "\n" +
                                    "<h2>1. Data Preparation for NER</h2>\n" +
                                    "<p>The first step in training an NER model is to prepare a suitable dataset. The dataset should be labeled with entities categorized according to the task (e.g., PERSON, LOCATION, ORGANIZATION, DATE, etc.).</p>\n" +
                                    "<h3>Steps to Prepare Data:</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Collect Data:</strong> You need a corpus of text (documents, news articles, web pages, etc.). For training, this text should contain annotations for the named entities (labels).</li>\n" +
                                    "  <li><strong>Labeling Entities:</strong> Each named entity in the text should be labeled with its category. For example, in the sentence:</li>\n" +
                                    "</ul>\n" +
                                    "<pre>\"Steve Jobs founded Apple in Cupertino in 1976.\"</pre>\n" +
                                    "<ul>\n" +
                                    "  <li>Steve Jobs → PERSON</li>\n" +
                                    "  <li>Apple → ORGANIZATION</li>\n" +
                                    "  <li>Cupertino → LOCATION</li>\n" +
                                    "  <li>1976 → DATE</li>\n" +
                                    "</ul>\n" +
                                    "<p>A common format for labeled data is the BIO format:</p>\n" +
                                    "<pre>\n" +
                                    "  Steve B-PER\n" +
                                    "  Jobs I-PER\n" +
                                    "  founded O\n" +
                                    "  Apple B-ORG\n" +
                                    "  in O\n" +
                                    "  Cupertino B-LOC\n" +
                                    "  in O\n" +
                                    "  1976 B-DATE\n" +
                                    "</pre>\n" +
                                    "<h3>Preprocessing Text:</h3>\n" +
                                    "<p>Clean the text by removing irrelevant symbols, correcting typos, and handling special characters. Tokenization (splitting text into words or tokens) is an important preprocessing step.</p>\n" +
                                    "\n" +
                                    "<h2>2. Choose a Model Architecture</h2>\n" +
                                    "<p>Once the data is prepared, the next step is selecting the right model architecture. There are several approaches to training NER models:</p>\n" +
                                    "\n" +
                                    "<h3>a. Classical Machine Learning Models</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Conditional Random Fields (CRFs):</strong> CRFs are popular for sequence labeling tasks like NER. They take into account the dependencies between adjacent labels.</li>\n" +
                                    "  <li><strong>Support Vector Machines (SVM) and Hidden Markov Models (HMMs):</strong> These models can also be applied for sequence labeling tasks, though they typically require feature extraction (e.g., word shape, part-of-speech tags).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>b. Deep Learning Models</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Recurrent Neural Networks (RNNs):</strong> RNNs, especially when combined with Long Short-Term Memory (LSTM) cells, are popular for sequence labeling tasks. They capture long-term dependencies between words and entities in the sentence.</li>\n" +
                                    "  <li><strong>Bidirectional LSTM (BiLSTM):</strong> A BiLSTM can process text in both forward and backward directions, improving its ability to understand context in NER tasks.</li>\n" +
                                    "  <li><strong>Transformer Models:</strong> More recently, transformer-based architectures like BERT and its variants (e.g., RoBERTa, DistilBERT) have achieved state-of-the-art performance in NER tasks. Transformers capture contextual relationships between words and entities effectively.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Feature Extraction</h2>\n" +
                                    "<p>For traditional machine learning models (like CRFs), you need to manually extract features from the text. For deep learning models, features are learned automatically during training. Some common features used in NER include:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Word-level features:</strong> The current word, its suffixes or prefixes, and capitalization (e.g., first letter capitalized might indicate a person name).</li>\n" +
                                    "  <li><strong>Part-of-speech (POS) tags:</strong> POS tagging can provide useful context for NER. For example, if a word is tagged as a noun, it may be more likely to be a person or location.</li>\n" +
                                    "  <li><strong>Word embeddings:</strong> Pretrained word embeddings like Word2Vec, GloVe, or FastText can be used to represent words in a dense vector space, capturing semantic relationships between words.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Model Training</h2>\n" +
                                    "<h3>a. Train the Model (Classical Machine Learning Approach)</h3>\n" +
                                    "<p>For classical machine learning models like CRFs, the steps include:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Feature Engineering:</strong> Extract features from the text (e.g., word features, POS tags, etc.).</li>\n" +
                                    "  <li><strong>Model Training:</strong> Use labeled data to train the model (e.g., CRF or SVM). The training process involves learning the parameters of the model so it can recognize patterns associated with named entities.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>b. Train the Model (Deep Learning Approach)</h3>\n" +
                                    "<p>For deep learning models like BiLSTMs or Transformers:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Model Initialization:</strong> Define the model architecture (e.g., a BiLSTM model with an output layer for classification).</li>\n" +
                                    "  <li><strong>Loss Function:</strong> Use a suitable loss function, such as categorical cross-entropy, which measures the difference between predicted and actual labels.</li>\n" +
                                    "  <li><strong>Optimization:</strong> Use an optimizer (e.g., Adam, SGD) to update the model’s weights during training.</li>\n" +
                                    "  <li><strong>Batch Training:</strong> Train the model in batches and use backpropagation to update weights based on the error (loss) computed at each step.</li>\n" +
                                    "</ul>\n" +
                                    "<p>For instance, a simple BiLSTM model might look like this:</p>\n" +
                                    "<pre>\n" +
                                    "import torch\n" +
                                    "import torch.nn as nn\n" +
                                    "\n" +
                                    "class BiLSTM_NER(nn.Module):\n" +
                                    "    def __init__(self, input_dim, hidden_dim, output_dim):\n" +
                                    "        super(BiLSTM_NER, self).__init__()\n" +
                                    "        self.lstm = nn.LSTM(input_dim, hidden_dim, bidirectional=True)\n" +
                                    "        self.fc = nn.Linear(hidden_dim * 2, output_dim)\n" +
                                    "    \n" +
                                    "    def forward(self, x):\n" +
                                    "        out, _ = self.lstm(x)\n" +
                                    "        out = self.fc(out)\n" +
                                    "        return out\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h3>c. Fine-tuning Pretrained Models (Transformers)</h3>\n" +
                                    "<p>If you're using transformer-based models like BERT, you can fine-tune a pre-trained model on your NER dataset. Fine-tuning involves training the model for a few epochs on your labeled data to adapt it to the NER task.</p>\n" +
                                    "<pre>\n" +
                                    "from transformers import BertForTokenClassification, BertTokenizer, Trainer, TrainingArguments\n" +
                                    "\n" +
                                    "# Load pre-trained model and tokenizer\n" +
                                    "model = BertForTokenClassification.from_pretrained(\"dbmdz/bert-large-cased-finetuned-conll03-english\")\n" +
                                    "tokenizer = BertTokenizer.from_pretrained(\"dbmdz/bert-large-cased-finetuned-conll03-english\")\n" +
                                    "\n" +
                                    "# Prepare the dataset and Trainer\n" +
                                    "train_dataset = ...  # Your training dataset\n" +
                                    "training_args = TrainingArguments(output_dir=\"./results\", num_train_epochs=3)\n" +
                                    "\n" +
                                    "trainer = Trainer(model=model, args=training_args, train_dataset=train_dataset)\n" +
                                    "trainer.train()\n" +
                                    "</pre>\n" +
                                    "\n" +
                                    "<h2>5. Evaluation and Hyperparameter Tuning</h2>\n" +
                                    "<p>Once the model is trained, evaluate it on a separate validation or test set to determine how well it performs. Common evaluation metrics for NER include:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Precision:</strong> The proportion of correct positive predictions out of all predicted positives.</li>\n" +
                                    "  <li><strong>Recall:</strong> The proportion of correct positive predictions out of all actual positives.</li>\n" +
                                    "  <li><strong>F1-score:</strong> The harmonic mean of precision and recall, balancing both metrics.</li>\n" +
                                    "</ul>\n" +
                                    "<p>Example:</p>\n" +
                                    "<pre>\n" +
                                    "from sklearn.metrics import classification_report\n" +
                                    "\n" +
                                    "# Assuming you have the true labels and predicted labels\n" +
                                    "true_labels = [...]\n" +
                                    "predictions = [...]\n" +
                                    "\n" +
                                    "print(classification_report(true_labels, predictions))\n" +
                                    "</pre>\n" +
                                    "<p>You may need to fine-tune hyperparameters such as:</p>\n" +
                                    "<ul>\n" +
                                    "  <li>Learning rate</li>\n" +
                                    "  <li>Batch size</li>\n" +
                                    "  <li>Number of epochs</li>\n" +
                                    "  <li>Model architecture (e.g., number of hidden layers in BiLSTM, number of attention heads in a Transformer)</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>6. Deployment</h2>\n" +
                                    "<p>Once your model is trained and evaluated, you can deploy it to a production environment for real-world NER tasks. Deployment can be done using APIs, web servers, or even integrating the model into mobile applications. Tools like FastAPI, Flask, or TensorFlow Serving can help serve the model as an API.</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(72, 24, "Applications of NER", 3, "<h1>Applications of Named Entity Recognition (NER)</h1>\n" +
                                    "<p>Named Entity Recognition (NER) plays a crucial role in many real-world applications, particularly in information extraction tasks. By identifying and classifying named entities (such as people, organizations, dates, and locations) in unstructured text, NER systems enable machines to understand and process natural language efficiently. Below are some key applications of NER in various domains.</p>\n" +
                                    "\n" +
                                    "<h2>1. Information Retrieval</h2>\n" +
                                    "<h3>a. Search Engines</h3>\n" +
                                    "<p>NER is used to enhance search engine results by identifying key entities in user queries and indexing documents based on these entities. This allows search engines to return more relevant results by associating queries with specific topics, people, organizations, or locations.</p>\n" +
                                    "<p><strong>Example:</strong> If a user searches for \"Tesla CEO,\" the NER model can identify \"Tesla\" as an organization and \"CEO\" as a position, helping the search engine prioritize content related to Tesla's leadership.</p>\n" +
                                    "\n" +
                                    "<h3>b. Document Categorization</h3>\n" +
                                    "<p>NER can assist in classifying and tagging documents by recognizing entities within them. This is particularly useful in organizing and indexing large databases of legal, financial, or medical documents.</p>\n" +
                                    "<p><strong>Example:</strong> In a legal document database, NER can be used to classify documents based on the named entities such as laws, courts, judges, and locations.</p>\n" +
                                    "\n" +
                                    "<h2>2. Question Answering Systems</h2>\n" +
                                    "<p>NER plays an important role in question-answering systems (QA), particularly in systems that provide direct answers to user queries based on large corpora of text.</p>\n" +
                                    "<p><strong>Example:</strong> If a user asks, \"Who is the president of the United States?\", the NER model will identify \"president\" as a role and \"United States\" as a location, helping the system to retrieve the correct answer, such as \"Joe Biden.\"</p>\n" +
                                    "\n" +
                                    "<h2>3. Information Extraction in Text Mining</h2>\n" +
                                    "<p>In text mining, NER is a foundational technique for extracting useful information from large volumes of unstructured text, such as emails, news articles, and social media posts. This extracted information can be used for various downstream applications, such as trend analysis, business intelligence, and content summarization.</p>\n" +
                                    "<p><strong>Example:</strong> In a news article, NER can extract information about events, people involved, organizations, and dates, which can then be used to generate a structured summary or to track the development of specific events over time.</p>\n" +
                                    "\n" +
                                    "<h2>4. Sentiment Analysis</h2>\n" +
                                    "<p>NER can be combined with sentiment analysis to gain deeper insights into opinions, emotions, and sentiments expressed about specific entities. By recognizing entities in a text, sentiment analysis can be applied to assess public opinion on individuals, products, brands, or organizations.</p>\n" +
                                    "<p><strong>Example:</strong> In customer reviews, NER can identify products and brands, while sentiment analysis can determine whether the sentiment toward those entities is positive, negative, or neutral. For instance, in a review: \"Apple's new iPhone is amazing!\" – NER identifies \"Apple\" as an organization and \"iPhone\" as a product, while sentiment analysis shows a positive sentiment.</p>\n" +
                                    "\n" +
                                    "<h2>5. Social Media Monitoring</h2>\n" +
                                    "<p>NER is widely used in social media monitoring to track mentions of people, brands, or events. It can help businesses and organizations monitor public sentiment and track trends in real time by identifying mentions of relevant entities across platforms like Twitter, Facebook, and Instagram.</p>\n" +
                                    "<p><strong>Example:</strong> For brand monitoring, NER can identify mentions of specific brand names and products in tweets or posts. Businesses can then analyze sentiment, track marketing campaign effectiveness, and respond to customer inquiries.</p>\n" +
                                    "\n" +
                                    "<h2>6. Healthcare and Bioinformatics</h2>\n" +
                                    "<p>In healthcare, NER is used to extract critical information from medical texts, such as research papers, clinical notes, and patient records. By recognizing medical terms like diseases, drugs, treatments, and symptoms, NER facilitates tasks like drug discovery, patient record management, and clinical decision support.</p>\n" +
                                    "<p><strong>Example:</strong> In a clinical trial report, NER can identify the names of diseases, medications, and clinical trial phases, which can then be used for drug discovery or clinical trial analysis.</p>\n" +
                                    "<h3>Sub-Application: Bioinformatics</h3>\n" +
                                    "<p>In bioinformatics, NER is used to extract biological entities such as genes, proteins, and species from scientific literature. This information can be integrated into databases for further analysis.</p>\n" +
                                    "<p><strong>Example:</strong> In a research article, NER can extract gene names (e.g., BRCA1), disease names (e.g., cancer), and drug names (e.g., aspirin) for further biological analysis.</p>\n" +
                                    "\n" +
                                    "<h2>7. Financial Document Analysis</h2>\n" +
                                    "<p>NER is applied in the finance industry for extracting relevant information from financial documents like earnings reports, SEC filings, investment analysis reports, and news articles. NER can extract financial entities, such as stock symbols, companies, market trends, and financial terms, helping to automate the processing and analysis of financial data.</p>\n" +
                                    "<p><strong>Example:</strong> In an earnings report, NER can identify key figures such as revenue, net income, and profit margins, along with the names of companies, thereby allowing analysts to focus on critical insights.</p>\n" +
                                    "\n" +
                                    "<h2>8. Legal Document Analysis</h2>\n" +
                                    "<p>In the legal field, NER is useful for extracting important information from contracts, case law, court rulings, and other legal documents. It helps identify entities such as parties involved, dates, legal terms, and case numbers, making the legal analysis more efficient and automated.</p>\n" +
                                    "<p><strong>Example:</strong> NER can help identify parties involved in a contract (e.g., individuals, companies), as well as key clauses, dates, and amounts, allowing legal professionals to quickly review and extract the most relevant details.</p>\n" +
                                    "\n" +
                                    "<h2>9. Chatbots and Virtual Assistants</h2>\n" +
                                    "<p>NER enhances the functionality of chatbots and virtual assistants by helping them understand user input more effectively. By recognizing key entities in user queries, chatbots can provide more accurate and context-aware responses.</p>\n" +
                                    "<p><strong>Example:</strong> If a user asks, \"Book a flight from New York to London on December 15th,\" NER will extract the entities \"New York\" (location), \"London\" (location), and \"December 15th\" (date), allowing the system to process the booking request accurately.</p>\n" +
                                    "\n" +
                                    "<h2>10. Event Extraction and News Categorization</h2>\n" +
                                    "<p>NER can be used to automatically extract events and categorize news articles based on the entities mentioned in them. This process helps in organizing large volumes of news data and in tracking the evolution of specific events or topics.</p>\n" +
                                    "<p><strong>Example:</strong> In a news article reporting on an international summit, NER can identify the event (e.g., \"United Nations Climate Summit\"), the participants (e.g., \"President Joe Biden,\" \"UN Secretary-General António Guterres\"), and the location (e.g., \"New York\"). This structured information can be used to categorize news articles or track the event's progress.</p>\n" +
                                    "\n" +
                                    "<h2>11. Content Personalization</h2>\n" +
                                    "<p>NER can be leveraged for personalized content delivery, where content is tailored based on the named entities identified in users' interactions, preferences, or past behavior. This is widely used in media platforms, e-commerce, and content recommendation systems.</p>\n" +
                                    "<p><strong>Example:</strong> An e-commerce platform can analyze customer reviews and browsing history to identify preferences for certain brands or products. Based on this information, the platform can recommend new items or display personalized content related to those entities.</p>\n" +
                                    "\n" +
                                    "<h2>12. Security and Threat Detection</h2>\n" +
                                    "<p>NER plays a role in identifying potential threats in the context of cybersecurity and counter-terrorism by recognizing entities such as locations, organizations, and individuals that may be related to security risks.</p>\n" +
                                    "<p><strong>Example:</strong> In intelligence reports, NER can be used to extract names of people, organizations, and locations involved in suspicious activities, helping agencies track and respond to potential threats.</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(73, 25, "Introduction to Object Detection", 1, "<h1>Introduction to Object Detection</h1>\n" +
                                    "<p>Object detection is a fundamental task in computer vision, which involves identifying and locating objects within an image or video. Unlike image classification, which only determines the category of an image, object detection not only classifies the objects but also pinpoints their locations by drawing bounding boxes around them. It has widespread applications in various fields, including autonomous driving, security, retail, healthcare, and robotics.</p>\n" +
                                    "\n" +
                                    "<h2>1. What is Object Detection?</h2>\n" +
                                    "<p>Object detection involves two primary tasks:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Object Classification:</strong> Identifying what objects are present in the image (e.g., car, dog, person, etc.).</li>\n" +
                                    "    <li><strong>Object Localization:</strong> Determining where each object is located in the image by drawing a bounding box around it.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The output of an object detection model typically includes the class labels of detected objects, along with their coordinates (x, y) that define the corners of the bounding box.</p>\n" +
                                    "\n" +
                                    "<h2>2. Key Concepts in Object Detection</h2>\n" +
                                    "\n" +
                                    "<h3>a. Bounding Box</h3>\n" +
                                    "<p>A bounding box is a rectangular box drawn around an object in an image. The box is usually represented by its coordinates (x_min, y_min, x_max, y_max), where:</p>\n" +
                                    "<ul>\n" +
                                    "    <li>(x_min, y_min) is the top-left corner of the bounding box.</li>\n" +
                                    "    <li>(x_max, y_max) is the bottom-right corner of the bounding box.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The bounding box helps in localizing the object, and its size is typically proportional to the object's size in the image.</p>\n" +
                                    "\n" +
                                    "<h3>b. Intersection over Union (IoU)</h3>\n" +
                                    "<p>The Intersection over Union (IoU) is a metric used to evaluate the accuracy of object detection models. It measures the overlap between the predicted bounding box and the ground truth bounding box. IoU is calculated as:</p>\n" +
                                    "<p><em>IoU = Area of overlap / Area of union</em></p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>IoU = 1:</strong> Perfect overlap between predicted and ground truth boxes.</li>\n" +
                                    "    <li><strong>IoU = 0:</strong> No overlap.</li>\n" +
                                    "</ul>\n" +
                                    "<p>A higher IoU indicates a better prediction, while a lower IoU suggests that the prediction is less accurate.</p>\n" +
                                    "\n" +
                                    "<h3>c. Object Classification and Detection</h3>\n" +
                                    "<p>Object detection models not only identify the object class but also perform localization. For example, in an image with a dog and a car, the model will output two bounding boxes, one for the dog and another for the car, along with the predicted class labels (\"dog\" and \"car\").</p>\n" +
                                    "\n" +
                                    "<h2>3. Challenges in Object Detection</h2>\n" +
                                    "<p>While object detection is a powerful tool, it comes with several challenges:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Variability in Object Appearance:</strong> Objects can appear in various sizes, angles, lighting conditions, and occlusions, making it difficult for models to detect them consistently.</li>\n" +
                                    "    <li><strong>Multiple Objects:</strong> Detecting multiple objects in an image, especially when they are crowded or overlapping, is another challenge.</li>\n" +
                                    "    <li><strong>Real-Time Performance:</strong> For applications like autonomous driving or robotics, the object detection model needs to operate in real-time with minimal latency.</li>\n" +
                                    "    <li><strong>Class Imbalance:</strong> In some datasets, certain object classes might be overrepresented, leading to class imbalance, which can affect the model's performance on less frequent classes.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Object Detection vs. Image Classification</h2>\n" +
                                    "<p>While image classification assigns a single label to an entire image, object detection goes a step further by localizing individual objects within the image and providing their corresponding class labels. For instance, in an image containing both a dog and a car, an image classification model would only label the image as \"dog\" or \"car,\" but an object detection model would label both objects and locate them within the image.</p>\n" +
                                    "\n" +
                                    "<table>\n" +
                                    "    <thead>\n" +
                                    "        <tr>\n" +
                                    "            <th>Feature</th>\n" +
                                    "            <th>Image Classification</th>\n" +
                                    "            <th>Object Detection</th>\n" +
                                    "        </tr>\n" +
                                    "    </thead>\n" +
                                    "    <tbody>\n" +
                                    "        <tr>\n" +
                                    "            <td>Task</td>\n" +
                                    "            <td>Assign one label to an image</td>\n" +
                                    "            <td>Detect and locate multiple objects</td>\n" +
                                    "        </tr>\n" +
                                    "        <tr>\n" +
                                    "            <td>Output</td>\n" +
                                    "            <td>One label per image</td>\n" +
                                    "            <td>Labels and bounding boxes per object</td>\n" +
                                    "        </tr>\n" +
                                    "        <tr>\n" +
                                    "            <td>Complexity</td>\n" +
                                    "            <td>Simple model</td>\n" +
                                    "            <td>More complex model</td>\n" +
                                    "        </tr>\n" +
                                    "    </tbody>\n" +
                                    "</table>\n" +
                                    "\n" +
                                    "<h2>5. Applications of Object Detection</h2>\n" +
                                    "<p>Object detection has a broad range of practical applications across various industries:</p>\n" +
                                    "\n" +
                                    "<h3>a. Autonomous Driving</h3>\n" +
                                    "<p>In autonomous vehicles, object detection models are used to identify pedestrians, other vehicles, traffic signs, and obstacles to enable safe navigation.</p>\n" +
                                    "\n" +
                                    "<h3>b. Surveillance and Security</h3>\n" +
                                    "<p>Object detection is used in video surveillance to detect intruders, vehicles, or other suspicious objects in real-time.</p>\n" +
                                    "\n" +
                                    "<h3>c. Healthcare and Medical Imaging</h3>\n" +
                                    "<p>In medical imaging, object detection is applied to identify tumors, lesions, or other critical objects in medical scans such as X-rays and MRIs.</p>\n" +
                                    "\n" +
                                    "<h3>d. Retail and E-commerce</h3>\n" +
                                    "<p>In retail, object detection can be used for automated inventory management, identifying products on shelves, or even enabling cashier-less stores.</p>\n" +
                                    "\n" +
                                    "<h3>e. Robotics</h3>\n" +
                                    "<p>Robotic systems use object detection for tasks like picking and placing objects, avoiding obstacles, or interacting with humans in environments such as warehouses or homes.</p>\n" +
                                    "\n" +
                                    "<h2>6. Popular Object Detection Algorithms</h2>\n" +
                                    "<p>Several algorithms and frameworks have been developed to perform object detection efficiently. These can be classified into two broad categories:</p>\n" +
                                    "\n" +
                                    "<h3>a. Traditional Object Detection Methods</h3>\n" +
                                    "<p>Before deep learning models gained popularity, object detection was performed using traditional computer vision techniques, including:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Haar Cascades:</strong> A series of classifiers used to detect objects (e.g., face detection). It works well for objects with specific shapes.</li>\n" +
                                    "    <li><strong>HOG (Histogram of Oriented Gradients):</strong> Used to detect objects based on the distribution of gradient orientations.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>b. Deep Learning-based Object Detection Methods</h3>\n" +
                                    "<p>Recent advances in deep learning have significantly improved the performance of object detection. The following are some popular deep learning-based object detection models:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>YOLO (You Only Look Once):</strong> YOLO is a real-time object detection algorithm that divides the image into grids and predicts bounding boxes and class probabilities for each grid cell. <strong>Key Strength:</strong> Fast and can detect multiple objects in real-time. <strong>Use Case:</strong> Real-time video surveillance, autonomous driving.</li>\n" +
                                    "    <li><strong>SSD (Single Shot Multibox Detector):</strong> SSD is another real-time object detection algorithm that predicts bounding boxes and class labels at multiple scales. <strong>Key Strength:</strong> Good trade-off between accuracy and speed. <strong>Use Case:</strong> Mobile and embedded applications.</li>\n" +
                                    "    <li><strong>Faster R-CNN (Region-based Convolutional Neural Networks):</strong> Faster R-CNN uses a region proposal network (RPN) to propose candidate regions for object detection, followed by a convolutional network for classification and bounding box regression. <strong>Key Strength:</strong> High accuracy, particularly for complex scenes. <strong>Use Case:</strong> Image analysis tasks that require high accuracy.</li>\n" +
                                    "    <li><strong>RetinaNet:</strong> RetinaNet is known for using a focal loss function to deal with class imbalance in object detection tasks. This loss function puts more focus on hard-to-detect objects. <strong>Key Strength:</strong> Handles class imbalance effectively. <strong>Use Case:</strong> Detecting rare objects in large datasets.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>7. Training Object Detection Models</h2>\n" +
                                    "<p>Training an object detection model typically involves the following steps:</p>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Data Collection:</strong> Collect a labeled dataset containing images with ground truth bounding boxes and corresponding object labels. Datasets like COCO (Common Objects in Context) and Pascal VOC are commonly used for training object detection models.</li>\n" +
                                    "    <li><strong>Data Preprocessing:</strong> Resize images to a consistent size and apply augmentations (like flipping, rotation, scaling) to increase the diversity of the training data.</li>\n" +
                                    "    <li><strong>Model Training:</strong> Train a deep learning model (e.g., YOLO, Faster R-CNN) on the labeled dataset, optimizing for both classification accuracy and bounding box regression. Use loss functions like cross-entropy loss (for classification) and smooth L1 loss (for bounding box regression).</li>\n" +
                                    "    <li><strong>Evaluation:</strong> Evaluate the model using metrics like mAP (mean Average Precision) and IoU (Intersection over Union).</li>\n" +
                                    "</ul>\n" +
                                    "``\n", "2024-11-02", "2024-11-02"),
                            Unit(74, 25, "YOLO and SSD Algorithms", 2, "<h1>YOLO and SSD Algorithms: Exploring Object Detection Models</h1>\n" +
                                    "\n" +
                                    "<p>Object detection has revolutionized computer vision by enabling machines to identify and locate objects in images and videos. Among the most popular algorithms for object detection are YOLO (You Only Look Once) and SSD (Single Shot Multibox Detector). Both algorithms are built using deep learning techniques, and they focus on achieving high accuracy while maintaining real-time performance. Let’s dive deeper into these two algorithms to understand how they work and how they compare.</p>\n" +
                                    "\n" +
                                    "<h2>1. YOLO (You Only Look Once)</h2>\n" +
                                    "\n" +
                                    "<h3>Overview</h3>\n" +
                                    "<p>YOLO is one of the most popular real-time object detection algorithms, developed by Joseph Redmon and others, introduced in 2015. Unlike traditional object detection algorithms that apply a sliding window or region proposal network to identify objects, YOLO divides the image into a grid and makes predictions for multiple bounding boxes in a single forward pass through the network. This makes YOLO exceptionally fast and suitable for real-time applications.</p>\n" +
                                    "\n" +
                                    "<h3>How YOLO Works</h3>\n" +
                                    "<p>YOLO takes the entire image as input and divides it into a grid (e.g., 13x13). Each grid cell is responsible for detecting objects whose center falls within that grid cell. The model predicts the following for each grid cell:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Class Probability</strong>: The probability that a particular class (e.g., person, dog, car) exists in the grid cell.</li>\n" +
                                    "  <li><strong>Bounding Box Coordinates</strong>: The coordinates of the bounding box, defined by its center (x, y) and dimensions (width, height).</li>\n" +
                                    "  <li><strong>Confidence Score</strong>: The confidence score for each bounding box, reflecting how confident the model is that the box contains an object.</li>\n" +
                                    "</ul>\n" +
                                    "<p>For each object detected, YOLO outputs:</p>\n" +
                                    "<ul>\n" +
                                    "  <li>The class label of the object (e.g., \"dog\", \"car\").</li>\n" +
                                    "  <li>The bounding box coordinates (x, y, width, height).</li>\n" +
                                    "  <li>A confidence score, used to filter out low-confidence predictions.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Advantages of YOLO</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Speed</strong>: YOLO is very fast because it processes the entire image in one go (single-pass), making it suitable for real-time detection tasks like video analysis.</li>\n" +
                                    "  <li><strong>Global Context</strong>: Since YOLO looks at the entire image at once, it captures the global context of the image, which helps reduce false positives.</li>\n" +
                                    "  <li><strong>Unified Model</strong>: YOLO combines object classification and localization into a single model, simplifying the architecture.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Disadvantages of YOLO</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Localization Errors</strong>: YOLO can sometimes make errors in localizing smaller objects, especially when they are far apart or partially occluded.</li>\n" +
                                    "  <li><strong>Limited Accuracy</strong>: While YOLO is fast, its accuracy is often lower compared to more complex algorithms like Faster R-CNN, especially on small objects or in highly cluttered scenes.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Versions of YOLO</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>YOLOv1</strong>: The original version, which introduced the single-pass approach but had issues with localization accuracy.</li>\n" +
                                    "  <li><strong>YOLOv2 (Darknet-19)</strong>: Improved localization and faster inference speed, with better bounding box prediction.</li>\n" +
                                    "  <li><strong>YOLOv3</strong>: Introduced multi-scale detection and improved accuracy. It uses a deeper network (Darknet-53) for better performance.</li>\n" +
                                    "  <li><strong>YOLOv4</strong>: Focused on better optimization for training and speed, making it suitable for both GPUs and CPUs.</li>\n" +
                                    "  <li><strong>YOLOv5</strong>: Although not officially part of the YOLO series, YOLOv5 is an unofficial but highly optimized version used widely in real-world applications.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. SSD (Single Shot Multibox Detector)</h2>\n" +
                                    "\n" +
                                    "<h3>Overview</h3>\n" +
                                    "<p>SSD is another real-time object detection algorithm that was introduced by Wei Liu et al. in 2016. It aims to combine high accuracy with fast inference speed. Like YOLO, SSD also performs detection in a single pass, but it differs in how it makes predictions across multiple feature maps. SSD is designed to predict multiple bounding boxes at different aspect ratios and scales for each object class, which helps in detecting objects at various sizes.</p>\n" +
                                    "\n" +
                                    "<h3>How SSD Works</h3>\n" +
                                    "<p>SSD divides the image into a grid and generates multiple bounding boxes for each grid cell. However, SSD differs from YOLO in the following ways:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Feature Pyramid</strong>: SSD uses multiple layers of convolutional features to detect objects at various scales. Early layers focus on detecting small objects, while deeper layers focus on larger objects.</li>\n" +
                                    "  <li><strong>Multiple Aspect Ratios and Scales</strong>: SSD uses multiple default bounding box aspect ratios at each location in the feature maps, which allows it to detect objects of different sizes.</li>\n" +
                                    "  <li><strong>Convolutional Layer for Prediction</strong>: SSD performs predictions directly from the feature maps produced by the convolutional layers, rather than from fully connected layers, which makes it faster.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The model outputs a fixed number of default boxes for each location in the feature map, each with a class label and a confidence score. SSD uses a multi-class classification loss and a regression loss to predict the bounding box coordinates.</p>\n" +
                                    "\n" +
                                    "<h3>Advantages of SSD</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Speed and Accuracy</strong>: SSD strikes a good balance between speed and accuracy, making it faster than methods like Faster R-CNN but more accurate than YOLO in some cases.</li>\n" +
                                    "  <li><strong>Multi-scale Predictions</strong>: The ability to detect objects of varying sizes due to the use of different feature maps helps SSD achieve high performance in complex scenes.</li>\n" +
                                    "  <li><strong>Less Computationally Expensive</strong>: SSD is less computationally expensive than models that rely on region proposal networks (RPN), such as Faster R-CNN.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Disadvantages of SSD</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Localization Errors</strong>: Like YOLO, SSD can struggle with small object localization in some cases, although it generally performs better than YOLO in this regard.</li>\n" +
                                    "  <li><strong>Complexity</strong>: While simpler than region-based methods, SSD still requires multiple predictions at each grid location, which can be computationally intensive.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Comparison of YOLO and SSD</h3>\n" +
                                    "<table border=\"1\">\n" +
                                    "  <thead>\n" +
                                    "    <tr>\n" +
                                    "      <th>Feature</th>\n" +
                                    "      <th>YOLO</th>\n" +
                                    "      <th>SSD</th>\n" +
                                    "    </tr>\n" +
                                    "  </thead>\n" +
                                    "  <tbody>\n" +
                                    "    <tr>\n" +
                                    "      <td>Speed</td>\n" +
                                    "      <td>Very fast, ideal for real-time use</td>\n" +
                                    "      <td>Fast, but slightly slower than YOLO</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "      <td>Accuracy</td>\n" +
                                    "      <td>Moderate accuracy (lower for small objects)</td>\n" +
                                    "      <td>Higher accuracy, especially for small objects</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "      <td>Object Detection</td>\n" +
                                    "      <td>Detects large objects well, struggles with small objects</td>\n" +
                                    "      <td>Detects objects across different scales</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "      <td>Architecture</td>\n" +
                                    "      <td>One network, single-pass detection</td>\n" +
                                    "      <td>Multi-layer architecture with multi-scale feature maps</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "      <td>Localization</td>\n" +
                                    "      <td>May struggle with small object localization</td>\n" +
                                    "      <td>Better at localizing smaller objects</td>\n" +
                                    "    </tr>\n" +
                                    "    <tr>\n" +
                                    "      <td>Use Case</td>\n" +
                                    "      <td>Real-time video surveillance, autonomous driving</td>\n" +
                                    "      <td>Suitable for both real-time and batch processing</td>\n" +
                                    "    </tr>\n" +
                                    "  </tbody>\n" +
                                    "</table>\n" +
                                    "\n" +
                                    "<h2>3. Training YOLO and SSD</h2>\n" +
                                    "\n" +
                                    "<h3>Training YOLO</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Dataset Preparation</strong>: YOLO requires a dataset with labeled bounding boxes for training (e.g., COCO, Pascal VOC).</li>\n" +
                                    "  <li><strong>Loss Function</strong>: YOLO uses a combined loss function that includes terms for classification, bounding box regression, and objectness score.</li>\n" +
                                    "  <li><strong>Model Architecture</strong>: The model architecture is defined by a convolutional network (e.g., Darknet for YOLOv3) that outputs class labels, bounding box coordinates, and confidence scores.</li>\n" +
                                    "  <li><strong>Optimization</strong>: YOLO is typically trained using stochastic gradient descent (SGD) or Adam optimizer, with pre-trained weights to speed up convergence.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>Training SSD</h3>\n", "2024-11-02", "2024-11-02"),
                            Unit(75, 25, "Applications of Object Detection", 3, "<h1>Applications of Object Detection</h1>\n" +
                                    "\n" +
                                    "<p>Object detection is a powerful computer vision task that identifies and localizes objects within an image or video. With advancements in deep learning, object detection has become a cornerstone for numerous real-world applications. Below are several key areas where object detection is used effectively:</p>\n" +
                                    "\n" +
                                    "<h2>1. Autonomous Vehicles</h2>\n" +
                                    "<h3>Description</h3>\n" +
                                    "<p>Autonomous vehicles (self-driving cars) rely heavily on object detection to understand their environment. Object detection helps these vehicles identify and track objects such as pedestrians, other vehicles, traffic signs, traffic lights, cyclists, and road obstacles. This is crucial for navigation, collision avoidance, and ensuring passenger safety.</p>\n" +
                                    "<h3>Applications</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Pedestrian Detection:</strong> Detecting pedestrians crossing the road to prevent accidents.</li>\n" +
                                    "  <li><strong>Vehicle Detection:</strong> Identifying other vehicles to maintain safe distances on the road.</li>\n" +
                                    "  <li><strong>Traffic Sign and Signal Recognition:</strong> Detecting traffic signs and signals to follow traffic rules.</li>\n" +
                                    "  <li><strong>Obstacle Detection:</strong> Identifying obstacles in the path (e.g., construction cones, fallen debris) to avoid collisions.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. Surveillance and Security</h2>\n" +
                                    "<h3>Description</h3>\n" +
                                    "<p>In security and surveillance systems, object detection is used to monitor activities in real-time. Cameras equipped with object detection models can recognize and track individuals or objects, improving the effectiveness of surveillance in areas like airports, shopping malls, public spaces, and private properties.</p>\n" +
                                    "<h3>Applications</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Intruder Detection:</strong> Detecting unauthorized persons or suspicious objects in restricted areas.</li>\n" +
                                    "  <li><strong>Crowd Monitoring:</strong> Tracking crowd movements and detecting unusual behavior or gatherings that might indicate security threats.</li>\n" +
                                    "  <li><strong>Face Recognition:</strong> Coupled with face detection, this technology can identify people entering a building or area.</li>\n" +
                                    "  <li><strong>Object Tracking:</strong> Detecting and following objects or people across video frames.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Retail and Inventory Management</h2>\n" +
                                    "<h3>Description</h3>\n" +
                                    "<p>In retail, object detection is used for monitoring store shelves, inventory tracking, and ensuring that items are properly stocked. It also plays a significant role in checkout systems, such as automated cash registers where customers can scan their own products.</p>\n" +
                                    "<h3>Applications</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Shelf Management:</strong> Detecting and recognizing products on shelves, ensuring proper inventory levels.</li>\n" +
                                    "  <li><strong>Customer Behavior Analysis:</strong> Understanding customer behavior, such as which products are picked up the most or are being ignored.</li>\n" +
                                    "  <li><strong>Self-Checkout Systems:</strong> Object detection can be used to automate checkout processes by recognizing products without the need for barcodes.</li>\n" +
                                    "  <li><strong>Stock Taking:</strong> Using cameras to monitor and keep track of inventory in warehouses and retail environments.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Healthcare and Medical Imaging</h2>\n" +
                                    "<h3>Description</h3>\n" +
                                    "<p>Object detection is increasingly used in healthcare, especially in medical imaging, where it can detect and locate anomalies such as tumors, lesions, or abnormalities in X-rays, MRIs, and CT scans. This aids in diagnosing diseases, treatment planning, and monitoring.</p>\n" +
                                    "<h3>Applications</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Tumor Detection:</strong> Detecting and localizing tumors or lesions in medical images (e.g., breast cancer detection in mammograms).</li>\n" +
                                    "  <li><strong>Organ Segmentation:</strong> Identifying and segmenting organs in MRI and CT scans for surgical planning.</li>\n" +
                                    "  <li><strong>Retinal Disease Detection:</strong> Identifying signs of diseases such as diabetic retinopathy or macular degeneration from eye scans.</li>\n" +
                                    "  <li><strong>Surgical Assistance:</strong> Using object detection for identifying anatomical structures during surgeries.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5. Robotics</h2>\n" +
                                    "<h3>Description</h3>\n" +
                                    "<p>Object detection is widely used in robotics for tasks like object manipulation, navigation, and interaction with the environment. Robots equipped with object detection models can identify and interact with objects in dynamic settings such as factories, homes, or warehouses.</p>\n" +
                                    "<h3>Applications</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Pick-and-Place Robotics:</strong> Robots that identify and pick up objects from a cluttered surface and place them in a different location.</li>\n" +
                                    "  <li><strong>Warehouse Automation:</strong> Identifying items in warehouses for picking, sorting, and shipping.</li>\n" +
                                    "  <li><strong>Assistive Robots:</strong> Robots helping people with disabilities by detecting and interacting with objects in their environment (e.g., helping to retrieve a glass of water).</li>\n" +
                                    "  <li><strong>Robot Vision:</strong> Enabling robots to see and understand their surroundings, crucial for navigation and obstacle avoidance.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>6. Augmented Reality (AR) and Virtual Reality (VR)</h2>\n" +
                                    "<h3>Description</h3>\n" +
                                    "<p>In augmented reality (AR) and virtual reality (VR) applications, object detection plays a central role in enhancing user experience by integrating digital content into the physical world or creating interactive virtual environments. Object detection helps to track real-world objects and enable interactive features.</p>\n" +
                                    "<h3>Applications</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>AR Games:</strong> Detecting objects in real time to place virtual objects on them (e.g., placing furniture in a room using AR).</li>\n" +
                                    "  <li><strong>Gesture Recognition:</strong> Detecting hand gestures for interactive experiences in VR or AR environments.</li>\n" +
                                    "  <li><strong>Indoor Navigation:</strong> AR systems using object detection to identify landmarks or obstacles and provide navigation assistance.</li>\n" +
                                    "  <li><strong>Interactive Displays:</strong> Recognizing physical objects for interactive marketing or educational content.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>7. Agriculture and Precision Farming</h2>\n" +
                                    "<h3>Description</h3>\n" +
                                    "<p>Object detection can be applied in agriculture to monitor crops, detect pests, and assess plant health. Drones equipped with object detection algorithms can fly over fields, detect areas of interest, and provide farmers with valuable insights about crop conditions.</p>\n" +
                                    "<h3>Applications</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Crop Monitoring:</strong> Identifying and monitoring the health of crops, detecting diseases or pest infestations early on.</li>\n" +
                                    "  <li><strong>Weed Detection:</strong> Detecting and distinguishing weeds from crops to apply targeted herbicide treatments.</li>\n" +
                                    "  <li><strong>Harvesting:</strong> Detecting ripe fruits or vegetables ready for harvest, reducing waste and improving efficiency.</li>\n" +
                                    "  <li><strong>Livestock Monitoring:</strong> Identifying individual animals for tracking health or locating lost animals in large herds.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>8. Sports Analytics</h2>\n" +
                                    "<h3>Description</h3>\n" +
                                    "<p>In sports, object detection is used for player tracking, performance analysis, and video analysis of games. It can help coaches and analysts assess player movements, predict plays, and offer insights into team strategies.</p>\n" +
                                    "<h3>Applications</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Player Tracking:</strong> Detecting and following players on the field in real-time, helping to analyze their movements and performance.</li>\n" +
                                    "  <li><strong>Ball Detection:</strong> Identifying the position of the ball during games like soccer or basketball for automated analysis and highlights generation.</li>\n" +
                                    "  <li><strong>Tactical Analysis:</strong> Analyzing team formations, positioning, and strategy using object detection to break down plays during or after a match.</li>\n" +
                                    "  <li><strong>Fitness and Health Monitoring:</strong> Using cameras to track players' physical performance, detect fatigue, or monitor injuries.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>9. Manufacturing and Quality Control</h2>\n" +
                                    "<h3>Description</h3>\n" +
                                    "<p>In manufacturing, object detection is essential for automating quality control processes, detecting defects, and ensuring that the products meet specified standards. High-resolution cameras combined with object detection can spot issues that are often invisible to the human eye.</p>\n" +
                                    "<h3>Applications</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Defect Detection:</strong> Detecting defects or irregularities in manufactured products, such as cracks, scratches, or dents.</li>\n" +
                                    "  <li><strong>Assembly Line Inspection:</strong> Verifying that parts are correctly assembled in real-time.</li>\n" +
                                    "  <li><strong>Product Counting and Sorting:</strong> Counting and sorting products in a production line, ensuring accurate inventory management.</li>\n" +
                                    "  <li><strong>Automated Packaging:</strong> Detecting products and packaging them accurately without human intervention.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>10. Environmental Monitoring and Wildlife Conservation</h2>\n" +
                                    "<h3>Description</h3>\n" +
                                    "<p>Object detection can be used in environmental monitoring to track wildlife, monitor ecosystems, and detect pollution. Cameras and drones equipped with object detection models can help researchers collect data on endangered species, deforestation, or pollution levels.</p>\n" +
                                    "<h3>Applications</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Wildlife Tracking:</strong> Detecting and tracking animals in their natural habitats using camera traps, drones, and satellite imagery.</li>\n" +
                                    "  <li><strong>Forest Monitoring:</strong> Detecting deforestation or illegal logging activities through satellite images and aerial footage.</li>\n" +
                                    "  <li><strong>Pollution Detection:</strong> Identifying sources of pollution (e.g., illegal dumping, forest fires) from images or video feeds.</li>\n" +
                                    "  <li><strong>Marine Life Monitoring:</strong> Using underwater cameras and drones to detect marine species or monitor the health of coral reefs.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02")
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
                            Unit(76, 26, "Introduction to Image Segmentation", 1, "<h1>Introduction to Image Segmentation</h1>\n" +
                                    "\n" +
                                    "<p>Image segmentation is a critical task in computer vision and image analysis that involves dividing an image into multiple segments or regions. Each segment corresponds to specific parts of the image, such as objects, regions of interest, or different structures. The goal of image segmentation is to simplify the representation of an image, making it easier to analyze and process for further tasks, such as object detection, image recognition, and scene understanding.</p>\n" +
                                    "\n" +
                                    "<h2>1. What is Image Segmentation?</h2>\n" +
                                    "<p>Image segmentation refers to the process of partitioning an image into distinct regions, where each region shares certain characteristics such as color, intensity, or texture. The result is a set of pixels grouped together based on these shared properties, which can then be analyzed separately.</p>\n" +
                                    "\n" +
                                    "<p>The two main objectives of image segmentation are:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Object Recognition:</strong> Identifying and isolating objects in an image (e.g., detecting a person or car).</li>\n" +
                                    "  <li><strong>Region of Interest Extraction:</strong> Identifying specific areas that are relevant to the task at hand (e.g., segmenting regions with specific medical conditions in medical imaging).</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. Types of Image Segmentation</h2>\n" +
                                    "<p>There are several approaches to segmenting an image. The choice of technique depends on the task, the type of data, and the computational resources available. Below are the main types of image segmentation:</p>\n" +
                                    "\n" +
                                    "<h3>a. Semantic Segmentation</h3>\n" +
                                    "<p>In semantic segmentation, each pixel in an image is assigned a class label (e.g., \"car,\" \"tree,\" \"road\").</p>\n" +
                                    "<p><strong>Objective:</strong> Grouping similar objects under the same label, without distinguishing between individual instances of objects.</p>\n" +
                                    "<p><strong>Example:</strong> In an image of a street scene, all pixels representing \"cars\" might be labeled as \"car\" and all pixels representing \"trees\" might be labeled as \"tree.\"</p>\n" +
                                    "\n" +
                                    "<h3>b. Instance Segmentation</h3>\n" +
                                    "<p>Instance segmentation not only classifies each pixel but also distinguishes between different objects of the same class.</p>\n" +
                                    "<p><strong>Objective:</strong> Identifying and segmenting distinct instances of the same object.</p>\n" +
                                    "<p><strong>Example:</strong> In an image with multiple cars, instance segmentation would label each car individually (e.g., car 1, car 2, car 3) rather than simply labeling all cars as the same.</p>\n" +
                                    "\n" +
                                    "<h3>c. Panoptic Segmentation</h3>\n" +
                                    "<p>A combination of semantic and instance segmentation, panoptic segmentation provides both the semantic label and individual object instances in an image.</p>\n" +
                                    "<p><strong>Objective:</strong> To provide a comprehensive view where both object classes and individual object instances are captured.</p>\n" +
                                    "<p><strong>Example:</strong> A panoptic segmentation model would label every pixel in an image and also differentiate between different instances of the same object class (e.g., distinguishing each \"person\" and labeling different \"buildings\").</p>\n" +
                                    "\n" +
                                    "<h2>3. Image Segmentation Techniques</h2>\n" +
                                    "<p>There are several methods used for image segmentation, which vary in complexity and the type of input required. Below are some common techniques:</p>\n" +
                                    "\n" +
                                    "<h3>a. Thresholding</h3>\n" +
                                    "<p>Thresholding is one of the simplest methods for image segmentation, where the intensity values of the pixels are compared against a fixed threshold value.</p>\n" +
                                    "<p><strong>Objective:</strong> Classify pixels into two categories: those that fall below the threshold and those that fall above it.</p>\n" +
                                    "<p><strong>Example:</strong> In a grayscale image, thresholding can be used to separate the background from objects (e.g., segmenting a white object on a black background).</p>\n" +
                                    "\n" +
                                    "<h3>b. Edge Detection</h3>\n" +
                                    "<p>Edge detection methods like the Canny edge detector are used to find the boundaries of objects within an image by detecting discontinuities in pixel intensity.</p>\n" +
                                    "<p><strong>Objective:</strong> Identify the points in an image where the brightness changes sharply, which are typically the boundaries of objects.</p>\n" +
                                    "<p><strong>Example:</strong> In a face detection system, edge detection can help to outline the facial features such as the outline of the face, eyes, and mouth.</p>\n" +
                                    "\n" +
                                    "<h3>c. Region-Based Segmentation</h3>\n" +
                                    "<p>Region-based segmentation methods group pixels that are similar in some way (e.g., based on color, intensity, or texture).</p>\n" +
                                    "<p><strong>Objective:</strong> Divide an image into regions where the pixels in each region share similar properties.</p>\n" +
                                    "<p><strong>Example:</strong> In medical imaging, region-based segmentation can help identify different tissues, such as tumor regions, by grouping pixels with similar intensities.</p>\n" +
                                    "\n" +
                                    "<h3>d. Clustering (e.g., K-Means)</h3>\n" +
                                    "<p>Clustering techniques like K-means can be used for segmentation by grouping similar pixels together into clusters based on their color or texture features.</p>\n" +
                                    "<p><strong>Objective:</strong> Find patterns in the pixel data and group similar pixels together to form segmented regions.</p>\n" +
                                    "<p><strong>Example:</strong> In satellite image analysis, K-means clustering can help segment different land types (e.g., water, vegetation, urban areas).</p>\n" +
                                    "\n" +
                                    "<h3>e. Deep Learning-Based Segmentation</h3>\n" +
                                    "<p>Deep learning models, particularly Convolutional Neural Networks (CNNs), have become the most powerful and accurate tools for image segmentation. U-Net and Mask R-CNN are popular models for segmentation tasks.</p>\n" +
                                    "<p><strong>Objective:</strong> Automatically learn features and segmentation boundaries from large datasets without the need for hand-crafted rules.</p>\n" +
                                    "<p><strong>Example:</strong> In medical image analysis, deep learning-based segmentation models can automatically segment organs or tumors from MRI or CT scans with high accuracy.</p>\n" +
                                    "\n" +
                                    "<h2>4. Evaluation of Segmentation Performance</h2>\n" +
                                    "<p>To evaluate how well a segmentation algorithm performs, several metrics are commonly used:</p>\n" +
                                    "\n" +
                                    "<h3>a. Intersection over Union (IoU)</h3>\n" +
                                    "<p>IoU measures the overlap between the predicted segmentation mask and the ground truth mask. It is the ratio of the intersection of the predicted and actual regions to their union.</p>\n" +
                                    "<p><strong>Formula:</strong><br> \n" +
                                    "IoU = <em>Intersection</em> / <em>Union</em></p>\n" +
                                    "<p><strong>Example:</strong> If the predicted region covers 80% of the actual object and the ground truth covers 90%, the IoU would be 0.8 / 0.9 = 0.89.</p>\n" +
                                    "\n" +
                                    "<h3>b. Dice Coefficient</h3>\n" +
                                    "<p>The Dice coefficient is similar to IoU but places more emphasis on the overlap of regions, providing a measure of the similarity between two sets.</p>\n" +
                                    "<p><strong>Formula:</strong><br> \n" +
                                    "Dice = 2 × <em>Intersection</em> / (<em>Size of Prediction</em> + <em>Size of Ground Truth</em>)</p>\n" +
                                    "<p><strong>Example:</strong> In binary segmentation tasks, a Dice score of 1 indicates perfect overlap, while a score of 0 indicates no overlap.</p>\n" +
                                    "\n" +
                                    "<h3>c. Pixel Accuracy</h3>\n" +
                                    "<p>Pixel accuracy measures the percentage of correctly classified pixels in the image.</p>\n" +
                                    "<p><strong>Formula:</strong><br> \n" +
                                    "Pixel Accuracy = <em>Number of Correct Pixels</em> / <em>Total Pixels</em></p>\n" +
                                    "<p><strong>Example:</strong> If a model correctly classifies 900 out of 1000 pixels, the pixel accuracy is 90%.</p>\n", "2024-11-02", "2024-11-02"),
                            Unit(77, 26, "U-Net Architecture", 2, "<h1>U-Net Architecture: Exploring its Role in Medical Image Segmentation</h1>\n" +
                                    "\n" +
                                    "<p>U-Net is a deep learning architecture specifically designed for image segmentation tasks, particularly in the medical field. It has become one of the most widely used models for semantic segmentation, where the goal is to classify each pixel in an image. The architecture was introduced in 2015 by Olaf Ronneberger, Philipp Fischer, and Thomas Brox, and its name, \"U-Net,\" refers to the \"U\" shaped structure of the model.</p>\n" +
                                    "\n" +
                                    "<p>U-Net is known for its ability to work with relatively small datasets and generate highly accurate segmentation masks, making it especially useful in fields like medical image segmentation, where annotated data may be limited.</p>\n" +
                                    "\n" +
                                    "<h2>1. Structure of U-Net</h2>\n" +
                                    "<p>U-Net's architecture is composed of two main parts: the contracting path (downsampling) and the expansive path (upsampling). These paths work together to capture both high-level features and fine-grained details of the input image.</p>\n" +
                                    "\n" +
                                    "<h3>a. Contracting Path (Encoder)</h3>\n" +
                                    "<p>The contracting path is responsible for extracting the features from the input image. It consists of repeated convolutional layers followed by max-pooling layers. Each step in this path reduces the spatial dimensions of the image while increasing the number of feature channels.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Convolutions:</strong> At each level, a set of convolutional layers is applied. The convolutional layers help to capture the high-level features of the image.</li>\n" +
                                    "  <li><strong>Max-Pooling:</strong> After convolutions, max-pooling layers are applied to reduce the image size, which enables the network to focus on the most important features. Pooling also helps reduce computational complexity.</li>\n" +
                                    "</ul>\n" +
                                    "<p>This part of the network serves as the encoder, which gradually reduces the spatial resolution while increasing the depth of feature representations.</p>\n" +
                                    "\n" +
                                    "<h3>b. Bottleneck</h3>\n" +
                                    "<p>At the bottom of the \"U,\" the model reaches the bottleneck layer, where the spatial resolution is at its lowest. The bottleneck contains convolutional layers that capture the most abstract features of the image, essentially compressing all the relevant information from the image into a low-dimensional representation.</p>\n" +
                                    "\n" +
                                    "<h3>c. Expansive Path (Decoder)</h3>\n" +
                                    "<p>The expansive path is the \"mirrored\" part of the architecture, designed to upsample the compressed feature maps and reconstruct the spatial resolution of the input image. This path consists of up-convolutions (also known as transposed convolutions), which help to increase the size of the feature maps.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Up-convolutions:</strong> These layers perform the reverse operation of the max-pooling in the contracting path, gradually increasing the image dimensions.</li>\n" +
                                    "  <li><strong>Skip Connections:</strong> A key feature of the U-Net architecture is the use of skip connections, which connect the corresponding layers in the contracting path to those in the expansive path. These skip connections allow the network to retain fine-grained details lost during downsampling and combine them with high-level features. This helps preserve spatial information and leads to more accurate segmentation.</li>\n" +
                                    "</ul>\n" +
                                    "<p>The expansive path also uses convolutional layers to refine the upsampled features. As a result, the final output is a high-resolution segmentation mask.</p>\n" +
                                    "\n" +
                                    "<h3>d. Output Layer</h3>\n" +
                                    "<p>At the output layer, the model produces a pixel-wise segmentation map, where each pixel is classified into a specific class (for example, foreground or background, or different organ structures in medical images). A softmax or sigmoid activation function is typically used in the final layer to output the class probabilities for each pixel.</p>\n" +
                                    "\n" +
                                    "<h2>2. U-Net’s Key Features</h2>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Skip Connections:</strong> These connections between the encoder and decoder ensure that spatial information is preserved, and low-level features can be reintroduced during the upsampling process.</li>\n" +
                                    "  <li><strong>Symmetry:</strong> U-Net’s architecture is symmetric, with each convolutional block in the contracting path mirrored by an upsampling block in the expansive path.</li>\n" +
                                    "  <li><strong>Efficient Use of Data:</strong> U-Net works effectively even with relatively small datasets, which is important in medical imaging, where labeled data is often scarce.</li>\n" +
                                    "  <li><strong>Pixel-wise Prediction:</strong> The network is designed to make predictions at the pixel level, ensuring that every pixel in the input image is assigned a class.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Advantages of U-Net</h2>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>High Accuracy:</strong> U-Net has been shown to achieve state-of-the-art performance on medical image segmentation tasks, such as organ and tumor segmentation in CT and MRI scans.</li>\n" +
                                    "  <li><strong>Efficient Training:</strong> U-Net’s architecture is relatively light on computation, which makes it suitable for training on smaller datasets.</li>\n" +
                                    "  <li><strong>Good Performance with Limited Data:</strong> One of the most significant advantages of U-Net is its ability to work with limited labeled data, which is often the case in medical imaging. By leveraging data augmentation techniques (e.g., rotations, translations, flipping), U-Net can be trained effectively without requiring large annotated datasets.</li>\n" +
                                    "  <li><strong>Localization Ability:</strong> The skip connections help the model not only to capture high-level context but also to preserve spatial information from the input, making it ideal for segmentation tasks where precise localization is necessary.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Applications of U-Net</h2>\n" +
                                    "<p>U-Net has found wide-ranging applications in various fields, particularly in medical image analysis:</p>\n" +
                                    "\n" +
                                    "<h3>a. Medical Image Segmentation</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Tumor Detection:</strong> U-Net can be used to segment and locate tumors in medical imaging modalities such as MRI or CT scans. By identifying the boundaries of the tumor, it can help clinicians in diagnosis and treatment planning.</li>\n" +
                                    "  <li><strong>Organ Segmentation:</strong> U-Net is widely used for segmenting various organs from medical scans, such as the liver, lungs, heart, and kidneys. This helps in tasks like organ volume estimation, which is critical for assessing diseases or planning surgeries.</li>\n" +
                                    "  <li><strong>Lesion Segmentation:</strong> In dermatology, U-Net can be applied to segment lesions or skin cancer areas from images of skin, assisting dermatologists in diagnosis and monitoring.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>b. Satellite and Aerial Imaging</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Land Use Classification:</strong> U-Net is used to segment aerial or satellite images to classify land use, such as identifying urban areas, bodies of water, forests, etc.</li>\n" +
                                    "  <li><strong>Change Detection:</strong> U-Net can also be employed for detecting changes in geographic regions over time, which is helpful in environmental monitoring and disaster management.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>c. Agriculture</h3>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Crop Detection and Classification:</strong> U-Net can be used to identify and segment crops in agricultural fields using aerial images, which aids in precision farming and crop health monitoring.</li>\n" +
                                    "  <li><strong>Weed Detection:</strong> The model can segment weeds from crops in agricultural fields, helping with automated weed control systems.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>5. Training U-Net</h2>\n" +
                                    "<p>To train a U-Net model effectively, the following steps are commonly used:</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Data Preprocessing:</strong> Medical images typically require preprocessing, such as normalization, resizing, and data augmentation. Augmentation techniques (like flipping, rotation, or zoom) help artificially expand the dataset to improve the model’s robustness.</li>\n" +
                                    "  <li><strong>Loss Function:</strong> The most commonly used loss function for image segmentation tasks in U-Net is the Dice coefficient loss or cross-entropy loss. The Dice coefficient helps to maximize the overlap between the predicted segmentation and the ground truth, which is crucial for precise segmentation tasks.</li>\n" +
                                    "  <li><strong>Optimization:</strong> Standard optimization algorithms like Adam or SGD (Stochastic Gradient Descent) are used to minimize the loss function and update the model's parameters.</li>\n" +
                                    "  <li><strong>Evaluation Metrics:</strong> Common evaluation metrics for U-Net include IoU (Intersection over Union), Dice Score, and Pixel Accuracy, which measure the performance of the model by comparing the predicted segmentation with the ground truth.</li>\n" +
                                    "</ul>\n.", "2024-11-02", "2024-11-02"),
                            Unit(78, 26, "Applications of Image Segmentation", 3, "<h1>Applications of Image Segmentation in Various Fields</h1>\n" +
                                    "\n" +
                                    "<p>Image segmentation is a fundamental task in computer vision that involves partitioning an image into different regions or segments, where each segment corresponds to different objects, boundaries, or structures. It is crucial for tasks that require understanding the spatial structure of an image, such as object recognition, scene analysis, and image editing. Here, we explore several key applications of image segmentation in various fields.</p>\n" +
                                    "\n" +
                                    "<h2>1. Medical Imaging</h2>\n" +
                                    "<p>Image segmentation is widely used in the medical field for analyzing and processing medical images, such as CT scans, MRIs, X-rays, and ultrasound images. The goal is to accurately identify and delineate structures of interest, such as organs, tumors, or lesions, to assist healthcare professionals in diagnosis, treatment planning, and monitoring.</p>\n" +
                                    "\n" +
                                    "<h3>a. Tumor and Lesion Detection</h3>\n" +
                                    "<p>Segmentation algorithms are used to detect and delineate tumors or lesions in medical images. This is particularly useful in cancer detection and monitoring treatment progress. For example, in MRI or CT scans, segmenting brain tumors can help in tracking their growth and response to treatments.</p>\n" +
                                    "\n" +
                                    "<h3>b. Organ Segmentation</h3>\n" +
                                    "<p>In medical imaging, segmenting organs like the liver, kidneys, lungs, or heart can aid in treatment planning, diagnosis, and even surgery. For instance, segmenting the liver in CT scans allows doctors to assess liver health, plan surgeries, and determine the location of abnormalities.</p>\n" +
                                    "\n" +
                                    "<h3>c. Vessel Segmentation</h3>\n" +
                                    "<p>In vascular imaging, segmentation is used to identify blood vessels in CT or MRI angiograms. Accurate segmentation of blood vessels can help in diagnosing vascular diseases such as aneurysms, stenosis, and blood clots.</p>\n" +
                                    "\n" +
                                    "<h2>2. Autonomous Vehicles</h2>\n" +
                                    "<p>Image segmentation is vital in the field of autonomous driving, where vehicles need to understand their environment and navigate safely. Segmentation helps the vehicle's computer vision system to recognize and classify different objects in the scene.</p>\n" +
                                    "\n" +
                                    "<h3>a. Road and Lane Detection</h3>\n" +
                                    "<p>For autonomous vehicles, road and lane detection is crucial. Segmentation algorithms can be used to identify road boundaries, lanes, and paths, enabling the vehicle to stay within its lane and navigate through intersections safely.</p>\n" +
                                    "\n" +
                                    "<h3>b. Pedestrian Detection</h3>\n" +
                                    "<p>Detecting pedestrians is an essential part of autonomous driving. Segmentation techniques are used to identify pedestrians in the vehicle’s path, ensuring that the vehicle can stop or avoid them in real-time.</p>\n" +
                                    "\n" +
                                    "<h3>c. Obstacle Detection</h3>\n" +
                                    "<p>Segmentation helps in detecting various obstacles in the environment, including other vehicles, traffic signs, and road barriers. This enables the vehicle to make decisions such as slowing down, stopping, or avoiding collisions.</p>\n" +
                                    "\n" +
                                    "<h2>3. Agriculture and Precision Farming</h2>\n" +
                                    "<p>In agriculture, image segmentation plays a crucial role in monitoring crop health, detecting diseases, and automating various farming processes. Using aerial imagery or drone-based imagery, segmentation helps in classifying different land types and plant species.</p>\n" +
                                    "\n" +
                                    "<h3>a. Crop and Weed Detection</h3>\n" +
                                    "<p>Segmentation is used to differentiate between crops and weeds in a field, helping to develop automated weed control systems. By segmenting out weeds, robots or drones can precisely target herbicide application to only the areas that need it, reducing chemical use and improving efficiency.</p>\n" +
                                    "\n" +
                                    "<h3>b. Crop Health Monitoring</h3>\n" +
                                    "<p>Farmers use segmentation to monitor the health of crops by identifying diseased or under-performing plants. By analyzing segmented images from drones or satellites, farmers can detect areas that need irrigation, fertilization, or pest control.</p>\n" +
                                    "\n" +
                                    "<h3>c. Yield Prediction</h3>\n" +
                                    "<p>Segmentation helps in assessing the growth of crops and estimating their yield. By segmenting different parts of the plant (e.g., leaves, stems, and fruits), algorithms can track growth patterns and predict the amount of harvest.</p>\n" +
                                    "\n" +
                                    "<h2>4. Satellite and Aerial Imagery</h2>\n" +
                                    "<p>In satellite imaging, image segmentation is essential for extracting meaningful information from vast landscapes, cities, and natural environments. It is applied in various geospatial analyses, such as land use classification, disaster monitoring, and environmental monitoring.</p>\n" +
                                    "\n" +
                                    "<h3>a. Land Use Classification</h3>\n" +
                                    "<p>Segmentation is used to classify different land types (e.g., urban, rural, forests, water bodies, etc.) in satellite images. This is useful for urban planning, environmental management, and monitoring deforestation or land degradation.</p>\n" +
                                    "\n" +
                                    "<h3>b. Disaster Monitoring</h3>\n" +
                                    "<p>After natural disasters such as floods, hurricanes, or wildfires, segmentation is applied to satellite images to detect affected areas, assess damage, and assist in recovery efforts. For example, in flood detection, segmentation helps identify flooded regions in high-resolution aerial images.</p>\n" +
                                    "\n" +
                                    "<h3>c. Crop Mapping and Forestry</h3>\n" +
                                    "<p>In forestry, segmentation techniques can be used to classify different types of vegetation, monitor deforestation, or track forest health. In agriculture, segmenting fields and identifying crops helps with yield predictions and monitoring.</p>\n" +
                                    "\n" +
                                    "<h2>5. Industrial Automation and Robotics</h2>\n" +
                                    "<p>Image segmentation is used in industrial automation to perform tasks such as quality inspection, assembly line monitoring, and robotic navigation.</p>\n" +
                                    "\n" +
                                    "<h3>a. Quality Control</h3>\n" +
                                    "<p>In manufacturing, segmentation can be used to inspect products on assembly lines. For instance, segmenting parts of a product can help detect defects such as cracks, dents, or misalignments, ensuring quality control in production.</p>\n" +
                                    "\n" +
                                    "<h3>b. Object Detection and Grasping</h3>\n" +
                                    "<p>In industrial robotics, segmentation is employed to detect and isolate objects for tasks like sorting, assembly, or packaging. Robots use segmented images to identify the shape, orientation, and location of objects for accurate handling.</p>\n" +
                                    "\n" +
                                    "<h3>c. Maintenance and Fault Detection</h3>\n" +
                                    "<p>Segmentation can be used in predictive maintenance applications. For instance, segmentation of images of machine components can help detect wear and tear or mechanical issues, preventing equipment failures.</p>\n" +
                                    "\n" +
                                    "<h2>6. Environmental Monitoring</h2>\n" +
                                    "<p>Segmentation plays an important role in monitoring environmental conditions, including wildlife tracking, water quality assessment, and climate change studies.</p>\n" +
                                    "\n" +
                                    "<h3>a. Wildlife Monitoring</h3>\n" +
                                    "<p>Segmentation helps in detecting and tracking wildlife species in natural habitats, often through camera traps or aerial imagery. This is useful for studying animal populations, behavior, and migration patterns.</p>\n" +
                                    "\n" +
                                    "<h3>b. Water Body Detection</h3>\n" +
                                    "<p>Satellite or drone-based imagery can be segmented to identify water bodies in regions where flooding, droughts, or climate change are a concern. Segmentation can help monitor the size and distribution of lakes, rivers, and reservoirs.</p>\n" +
                                    "\n" +
                                    "<h3>c. Environmental Hazard Detection</h3>\n" +
                                    "<p>Segmentation can also be applied to detect hazardous events like forest fires or pollution. By analyzing segmented satellite images, environmental changes like smoke, heat spots, or deforestation can be detected quickly, aiding in early response efforts.</p>\n" +
                                    "\n" +
                                    "<h2>7. Computer Vision and Augmented Reality (AR)</h2>\n" +
                                    "<p>Image segmentation is crucial in augmented reality applications, where digital objects need to be placed seamlessly into a real-world environment. Segmentation helps in identifying the background and foreground to create realistic interactions between virtual and real elements.</p>\n" +
                                    "\n" +
                                    "<h3>a. Virtual Object Placement</h3>\n" +
                                    "<p>In AR applications, segmentation can be used to segment out the background and identify suitable surfaces where virtual objects can be placed, such as tables or floors.</p>\n" +
                                    "\n" +
                                    "<h3>b. Object Recognition in AR</h3>\n" +
                                    "<p>Segmentation helps AR systems recognize and interact with specific objects in the environment. For instance, AR can be used to identify furniture in a room and allow users to interact with virtual furniture models.</p>\n" +
                                    "\n" +
                                    "<h2>8. Text and Document Processing</h2>\n" +
                                    "<p>Segmentation techniques are also applied in document image analysis, where the goal is to extract text or structure from scanned documents, forms, or handwritten notes.</p>\n" +
                                    "\n" +
                                    "<h3>a. Text Localization</h3>\n" +
                                    "<p>In OCR (Optical Character Recognition), segmentation is used to identify and isolate individual characters, words, or lines of text. This is crucial for converting scanned documents into machine-readable text.</p>\n" +
                                    "\n" +
                                    "<h3>b. Handwritten Text Recognition</h3>\n" +
                                    "<p>Segmentation is used to break down handwritten text into individual components (e.g., words and letters), helping OCR systems recognize and interpret handwritten content accurately.</p>\n", "2024-11-02", "2024-11-02")
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
                            Unit(79, 27, "Introduction to Face Recognition", 1, "<h1>Introduction to Face Recognition</h1>\n" +
                                    "\n" +
                                    "<p>Face recognition is a computer vision technology that identifies or verifies individuals based on their facial features. It is used in various applications ranging from security systems to social media, enabling automatic identification, authentication, and tracking of people in images or video streams. Face recognition systems utilize machine learning, deep learning, and pattern recognition techniques to analyze facial features and match them with existing databases.</p>\n" +
                                    "\n" +
                                    "<p>This module provides an overview of face recognition and tracking, including the key concepts and methods used in modern face recognition systems.</p>\n" +
                                    "\n" +
                                    "<h2>1. What is Face Recognition?</h2>\n" +
                                    "<p>Face recognition refers to the process of identifying or verifying a person’s identity based on their facial features. Unlike traditional methods of identification (like passwords or IDs), face recognition is a biometric method that uses unique attributes of a person’s face to distinguish them from others.</p>\n" +
                                    "\n" +
                                    "<h3>Key Steps in Face Recognition</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Face Detection:</strong> The first step involves detecting faces in an image or video. This is typically done using algorithms like Haar Cascades or deep learning-based methods like CNNs (Convolutional Neural Networks) to locate the face.</li>\n" +
                                    "    <li><strong>Face Alignment:</strong> Once the face is detected, alignment techniques are applied to normalize the face, adjusting it for factors like scale, rotation, and lighting. This ensures that features like the eyes, nose, and mouth are in a standard position.</li>\n" +
                                    "    <li><strong>Feature Extraction:</strong> After alignment, the system extracts key facial features such as the distance between the eyes, nose shape, and mouth contour. In modern face recognition systems, deep learning models like CNNs are often used to automatically extract these features.</li>\n" +
                                    "    <li><strong>Face Recognition/Matching:</strong> The extracted facial features are compared with a database of known faces. The system computes a similarity score to identify or verify the person.</li>\n" +
                                    "    <li><strong>Identification or Verification:</strong> In identification, the system attempts to match a given face with a database of faces, while in verification, the system confirms if the face belongs to a specific individual.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. Types of Face Recognition Systems</h2>\n" +
                                    "<p>There are two main types of face recognition systems:</p>\n" +
                                    "\n" +
                                    "<h3>a. Verification Systems (1:1 Matching)</h3>\n" +
                                    "<p>These systems are used to confirm if a person’s face matches a specific identity. For example, face verification for unlocking smartphones or accessing secure areas.</p>\n" +
                                    "\n" +
                                    "<h3>b. Identification Systems (1:N Matching)</h3>\n" +
                                    "<p>These systems attempt to identify a person by comparing their face with a large database of faces. An example of this would be facial recognition systems used in surveillance cameras to identify people in crowds.</p>\n" +
                                    "\n" +
                                    "<h2>3. Key Technologies Behind Face Recognition</h2>\n" +
                                    "<p>Modern face recognition systems rely on machine learning and deep learning techniques to process and analyze facial data.</p>\n" +
                                    "\n" +
                                    "<h3>a. Haar Cascades</h3>\n" +
                                    "<p>Haar Cascades is a classical algorithm used for face detection. It uses machine learning to train classifiers on positive and negative image samples. It is fast and suitable for real-time applications, but may not be as accurate in complex scenarios as deep learning-based methods.</p>\n" +
                                    "\n" +
                                    "<h3>b. Deep Learning (Convolutional Neural Networks - CNNs)</h3>\n" +
                                    "<p>CNNs are widely used for face recognition because they can learn hierarchical features from images. In face recognition tasks, CNNs are trained on large datasets to extract complex features like the shape of the eyes, nose, and mouth.</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>FaceNet:</strong> A popular deep learning model for face recognition that maps faces into a high-dimensional Euclidean space, where distances between points correspond to facial similarity. It is highly accurate and can be used for both verification and identification tasks.</li>\n" +
                                    "    <li><strong>VGGFace:</strong> Another CNN-based model for face recognition that performs very well in extracting face features. VGGFace networks are trained on large datasets of faces and can recognize faces under different lighting, angles, and conditions.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>c. Face Embeddings</h3>\n" +
                                    "<p>Face embeddings are numerical representations of facial features extracted by deep learning models. These embeddings are vectors that capture the unique characteristics of a person's face. They are used to compare faces by calculating distances or similarities between their embeddings. Techniques like cosine similarity or Euclidean distance are often used to measure these similarities.</p>\n" +
                                    "\n" +
                                    "<h2>4. Applications of Face Recognition</h2>\n" +
                                    "<p>Face recognition technology has widespread applications across various industries and sectors, including:</p>\n" +
                                    "\n" +
                                    "<h3>a. Security and Surveillance</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Access Control:</strong> Face recognition is used in security systems to allow access to secure areas, such as offices or buildings, by recognizing authorized individuals.</li>\n" +
                                    "    <li><strong>Surveillance:</strong> In public spaces, face recognition can be used to identify individuals for security purposes, such as monitoring for wanted criminals or tracking individuals in real-time.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>b. Personal Devices</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Smartphone Unlocking:</strong> Face recognition has become a popular method of unlocking smartphones, providing both security and convenience.</li>\n" +
                                    "    <li><strong>Personalization:</strong> Devices can personalize content, settings, or services based on the recognition of a specific user.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>c. Marketing and Retail</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Customer Analytics:</strong> Retailers use face recognition in stores to analyze customer demographics, track their shopping behavior, and provide personalized recommendations.</li>\n" +
                                    "    <li><strong>Targeted Advertising:</strong> In digital advertising, face recognition can help tailor ads based on the age, gender, or mood of the person viewing them.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>d. Law Enforcement</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Criminal Identification:</strong> Police and security agencies use face recognition to identify suspects in criminal investigations. For instance, it is used to match faces captured in surveillance footage with databases of known criminals.</li>\n" +
                                    "    <li><strong>Missing Persons:</strong> Face recognition can also help in finding missing persons by comparing images to databases of identified individuals.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>e. Healthcare</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Patient Identification:</strong> Hospitals use face recognition for patient identification, ensuring that the right person receives the right treatment and medication.</li>\n" +
                                    "    <li><strong>Emotion Detection:</strong> In healthcare, emotion recognition through face recognition is used for detecting mental health conditions, stress, or anxiety in patients.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(80, 27, "Deep Learning for Face Recognition", 2, "<h1>Deep Learning for Face Recognition</h1>\n" +
                                    "\n" +
                                    "<p>Deep learning has revolutionized face recognition by providing highly accurate models that can learn complex patterns in facial data. Traditional face recognition systems relied on manually crafted features and shallow machine learning models. However, deep learning, particularly through convolutional neural networks (CNNs), has allowed for end-to-end learning of facial features directly from raw image data, significantly improving the accuracy and robustness of face recognition systems.</p>\n" +
                                    "\n" +
                                    "<p>This module will explore how deep learning models are applied to face recognition, including the architectures, training processes, and real-world applications.</p>\n" +
                                    "\n" +
                                    "<h2>1. Role of Deep Learning in Face Recognition</h2>\n" +
                                    "<p>Deep learning models, especially CNNs, have become the backbone of modern face recognition systems. CNNs excel in recognizing patterns in images and are capable of automatically extracting hierarchical features from raw pixel data. In the case of face recognition, these features include key facial components like the eyes, nose, mouth, and other distinctive landmarks that help distinguish one face from another.</p>\n" +
                                    "\n" +
                                    "<h3>Key Advantages of Deep Learning in Face Recognition:</h3>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Automatic Feature Extraction:</strong> Deep learning models can learn to automatically extract relevant features from faces without the need for manual feature engineering.</li>\n" +
                                    "    <li><strong>High Accuracy:</strong> Deep learning models can achieve high accuracy rates, even with variations in lighting, angle, and facial expressions.</li>\n" +
                                    "    <li><strong>Scalability:</strong> Deep learning models, particularly CNNs, can scale to large datasets, making them ideal for applications where vast amounts of facial data need to be processed (e.g., surveillance systems or social media platforms).</li>\n" +
                                    "    <li><strong>Generalization:</strong> Deep learning models are better at generalizing to new, unseen faces compared to traditional methods.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>2. Common Deep Learning Architectures for Face Recognition</h2>\n" +
                                    "\n" +
                                    "<h3>a. Convolutional Neural Networks (CNNs)</h3>\n" +
                                    "<p>CNNs are the most commonly used deep learning models for face recognition. They are designed to automatically learn hierarchical patterns in images, making them well-suited for face detection and recognition tasks.</p>\n" +
                                    "\n" +
                                    "<h4>CNN-Based Approach for Face Recognition:</h4>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Preprocessing:</strong> Input images are preprocessed to align the face, normalize lighting conditions, and ensure the face is centered.</li>\n" +
                                    "    <li><strong>Convolutional Layers:</strong> These layers scan the image for local features such as edges, textures, and patterns in the face.</li>\n" +
                                    "    <li><strong>Pooling Layers:</strong> Pooling reduces the spatial dimensions of the image while retaining important information, allowing the network to focus on more abstract features.</li>\n" +
                                    "    <li><strong>Fully Connected Layers:</strong> After several convolutional and pooling layers, fully connected layers are used to combine the features and produce a final output.</li>\n" +
                                    "    <li><strong>Output Layer:</strong> The output is typically a vector representing the identity of the person, or a class label if performing classification.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>b. FaceNet</h3>\n" +
                                    "<p>FaceNet is a deep learning model specifically designed for face recognition. It uses a triplet loss function to learn an embedding for each face, which ensures that similar faces are closer in the embedding space while dissimilar faces are farther apart.</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Triplet Loss Function:</strong> This loss function works by training the model on triplets of images: an anchor image, a positive image (same identity), and a negative image (different identity). The goal is to minimize the distance between the anchor and positive images while maximizing the distance between the anchor and negative images in the embedding space.</li>\n" +
                                    "    <li><strong>Face Embeddings:</strong> FaceNet generates a fixed-length vector (embedding) for each face, which can be compared using distance metrics like Euclidean distance or cosine similarity. This makes it easy to identify or verify individuals by comparing face embeddings.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>c. VGGFace</h3>\n" +
                                    "<p>VGGFace is another deep learning model designed for face recognition. It uses a deep CNN architecture that is pre-trained on a large dataset of faces. VGGFace is known for its simplicity and effectiveness in recognizing faces under various conditions (lighting, pose, and occlusions).</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Pretraining on Large Datasets:</strong> VGGFace is trained on millions of face images, which allows it to learn general features that can be fine-tuned for specific applications.</li>\n" +
                                    "    <li><strong>Fine-Tuning:</strong> VGGFace can be fine-tuned on smaller, domain-specific datasets to improve its accuracy for particular use cases.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>d. ResNet (Residual Networks)</h3>\n" +
                                    "<p>ResNet is a deep CNN architecture that uses residual connections (shortcuts) to help train very deep networks. These residual connections allow the model to bypass certain layers, which helps avoid the vanishing gradient problem and enables the training of much deeper networks.</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Deep Networks:</strong> ResNet architectures have been successful in improving face recognition systems by enabling the training of deeper models without losing important features during backpropagation.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Training Deep Learning Models for Face Recognition</h2>\n" +
                                    "<p>Training deep learning models for face recognition involves several key steps, including data preprocessing, model selection, and fine-tuning.</p>\n" +
                                    "\n" +
                                    "<h3>a. Data Collection and Preprocessing</h3>\n" +
                                    "<p>To train a deep learning model for face recognition, a large dataset of labeled face images is required. These datasets typically contain thousands or even millions of images of people under various conditions.</p>\n" +
                                    "\n" +
                                    "<h4>Preprocessing Steps:</h4>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Face Detection:</strong> Before feeding the data into the deep learning model, faces must be detected in the images using algorithms like Haar Cascades, MTCNN, or even CNN-based face detectors.</li>\n" +
                                    "    <li><strong>Alignment:</strong> The detected faces are aligned (i.e., the face is rotated and resized to ensure consistency) to normalize variations in pose and orientation.</li>\n" +
                                    "    <li><strong>Normalization:</strong> Lighting conditions and image brightness are normalized to ensure the model focuses on the facial features, not lighting variations.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>b. Model Training</h3>\n" +
                                    "<p>The training process involves feeding the preprocessed data into the chosen deep learning model. The model learns to extract facial features by adjusting its weights through backpropagation using a loss function.</p>\n" +
                                    "\n" +
                                    "<h4>Loss Functions in Face Recognition:</h4>\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Cross-Entropy Loss:</strong> Used for classification tasks, where the model predicts a class label (identity) for each face.</li>\n" +
                                    "    <li><strong>Triplet Loss:</strong> Used in models like FaceNet, where the goal is to minimize the distance between similar faces and maximize the distance between dissimilar faces in the embedding space.</li>\n" +
                                    "    <li><strong>Contrastive Loss:</strong> Similar to triplet loss, it is used to differentiate between similar and dissimilar face pairs by minimizing the distance for similar pairs and maximizing it for dissimilar ones.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>c. Fine-Tuning and Transfer Learning</h3>\n" +
                                    "<p>Fine-tuning involves adjusting a pre-trained model (like VGGFace or FaceNet) to better suit a specific dataset or application. Transfer learning allows you to start with a model that has been trained on a large dataset and adapt it to your smaller dataset by training only the last few layers, which reduces computational cost and training time.</p>\n" +
                                    "\n" +
                                    "<h2>4. Face Recognition Model Evaluation</h2>\n" +
                                    "<p>Evaluating a face recognition model typically involves measuring its accuracy, precision, recall, and F1-score on a test dataset. Common evaluation metrics include:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "    <li><strong>Face Identification Accuracy:</strong> The percentage of correctly identified faces in a test set.</li>\n" +
                                    "    <li><strong>Verification Accuracy:</strong> The percentage of correct verifications (i.e., correct matches between the face and the stored identity).</li>\n" +
                                    "    <li><strong>Receiver Operating Characteristic (ROC) Curve:</strong> A graphical representation of a model’s performance, plotting the true positive rate (TPR) against the false positive rate (FPR).</li>\n" +
                                    "    <li><strong>Precision and Recall:</strong> Used to evaluate how well the model performs in distinguishing between true positives and false positives.</li>\n" +
                                    "</ul>\n", "2024-11-02", "2024-11-02"),
                            Unit(81, 27, "Real-Time Face Tracking", 3, "<h1>Real-Time Face Tracking</h1>\n" +
                                    "\n" +
                                    "<p>Real-time face tracking enables the continuous identification and following of a person's face in video streams. It is a critical technology used in fields like surveillance, human-computer interaction, augmented reality, and entertainment. Implementing face tracking requires efficient face detection, tracking algorithms, and system performance to handle video feeds at real-time frame rates.</p>\n" +
                                    "\n" +
                                    "<h2>1. Overview of Real-Time Face Tracking</h2>\n" +
                                    "\n" +
                                    "<p>Face tracking extends face detection by not only identifying the face in each frame but also following its movement across a sequence of frames. It involves two primary steps:</p>\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Face Detection:</strong> Identifying a face in the first frame using algorithms like Haar Cascades, MTCNN, or DLIB.</li>\n" +
                                    "  <li><strong>Face Tracking:</strong> Following the face in subsequent frames using tracking algorithms like Optical Flow, Kalman Filters, or Correlation-based tracking.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<p>For real-time applications, the system must process frames quickly (typically 30 frames per second or higher) to avoid lag.</p>\n" +
                                    "\n" +
                                    "<h2>2. Face Detection Algorithms for Real-Time Tracking</h2>\n" +
                                    "\n" +
                                    "<h3>a. Haar Cascade Classifiers</h3>\n" +
                                    "<p>Haar Cascades are fast and lightweight, making them ideal for real-time applications. They scan images for predefined patterns but may struggle with complex conditions like varying angles, lighting, or occlusions.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Advantages:</strong> Fast and lightweight, ideal for real-time applications.</li>\n" +
                                    "  <li><strong>Disadvantages:</strong> Less accurate compared to deep learning-based methods, especially in complex scenarios.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>b. MTCNN (Multi-task Cascaded Convolutional Networks)</h3>\n" +
                                    "<p>MTCNN is a deep learning-based face detection method that combines multi-task learning for better accuracy. It detects faces and key facial landmarks and is robust under challenging real-time conditions like different poses and partial occlusions.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Advantages:</strong> High accuracy and robust to pose variations and occlusions.</li>\n" +
                                    "  <li><strong>Disadvantages:</strong> Computationally more expensive than Haar Cascades but still feasible for real-time applications with GPU acceleration.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>c. DLIB</h3>\n" +
                                    "<p>DLIB provides a robust face detection model based on a histogram of oriented gradients (HOG) and supports real-time processing using deep learning-based approaches. It is highly accurate in detecting faces in various orientations and can also track facial landmarks.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Advantages:</strong> Works well in real-time with highly accurate face detection.</li>\n" +
                                    "  <li><strong>Disadvantages:</strong> May require optimizations for very high FPS processing in resource-limited environments.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>3. Face Tracking Algorithms</h2>\n" +
                                    "\n" +
                                    "<p>Once the face is detected in the first frame, face tracking algorithms are used to track its position over time. The goal is to follow the face's movement accurately across frames.</p>\n" +
                                    "\n" +
                                    "<h3>a. Optical Flow</h3>\n" +
                                    "<p>Optical flow calculates the movement of pixels between consecutive frames. It tracks the face's movement by analyzing the motion of pixel intensities between frames. The Lucas-Kanade method is a widely used optical flow algorithm that tracks a sparse set of points (e.g., corners or facial features like eyes or mouth).</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Advantages:</strong> Effective for real-time tracking if the face moves smoothly across frames.</li>\n" +
                                    "  <li><strong>Disadvantages:</strong> May fail if the face moves too fast or undergoes large deformations.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>b. Kalman Filter</h3>\n" +
                                    "<p>The Kalman Filter is a recursive method used for tracking an object over time. It predicts the position of the face in the next frame based on previous states and updates the estimate based on new measurements.</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Advantages:</strong> Good for handling noisy data and predicting the position of moving faces in real-time.</li>\n" +
                                    "  <li><strong>Disadvantages:</strong> Can become complex with erratic or unexpected facial movement.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h3>c. Correlation-based Tracking</h3>\n" +
                                    "<p>Correlation-based tracking compares the target (e.g., the face) in the current frame with the region of interest in the previous frame. The tracker moves across the frame to find the highest correlation (i.e., the face's location).</p>\n" +
                                    "<ul>\n" +
                                    "  <li><strong>Advantages:</strong> Simple and efficient.</li>\n" +
                                    "  <li><strong>Disadvantages:</strong> May fail when the face undergoes large movements or occlusions.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<h2>4. Implementing Real-Time Face Tracking</h2>\n" +
                                    "\n" +
                                    "<h3>Step-by-Step Process</h3>\n" +
                                    "\n" +
                                    "<h4>Import Necessary Libraries</h4>\n" +
                                    "<p>For real-time face tracking, Python offers several libraries such as OpenCV, DLIB, and MTCNN. These libraries provide powerful tools for both face detection and tracking.</p>\n" +
                                    "\n" +
                                    "<pre><code>import cv2\n" +
                                    "import dlib</code></pre>\n" +
                                    "\n" +
                                    "<h4>Load the Video Feed</h4>\n" +
                                    "<p>The first step in implementing real-time face tracking is to capture the video feed from the camera.</p>\n" +
                                    "\n" +
                                    "<pre><code># Open the webcam\n" +
                                    "cap = cv2.VideoCapture(0)</code></pre>\n" +
                                    "\n" +
                                    "<h4>Initialize Face Detection</h4>\n" +
                                    "<p>You can choose either Haar Cascade, MTCNN, or DLIB for face detection. Below is an example using DLIB.</p>\n" +
                                    "\n" +
                                    "<pre><code>detector = dlib.get_frontal_face_detector()</code></pre>\n" +
                                    "\n" +
                                    "<h4>Track the Face Using a Tracking Algorithm</h4>\n" +
                                    "<p>After detecting the face in the first frame, you can initialize a tracking algorithm like the Kalman Filter or use OpenCV’s built-in trackers (e.g., KCF, MOSSE, etc.).</p>\n" +
                                    "\n" +
                                    "<p>Example using OpenCV's Tracker:</p>\n" +
                                    "\n" +
                                    "<pre><code># Initialize the face detector and tracker\n" +
                                    "face_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcascade_frontalface_default.xml')\n" +
                                    "tracker = cv2.TrackerKCF_create()</code></pre>\n" +
                                    "\n" +
                                    "<h4>Process Each Frame</h4>\n" +
                                    "<p>For each frame in the video feed, perform the following:</p>\n" +
                                    "<ul>\n" +
                                    "  <li>Detect the face in the first frame.</li>\n" +
                                    "  <li>Initialize the tracker to follow the face in subsequent frames.</li>\n" +
                                    "  <li>Update the tracker in each subsequent frame.</li>\n" +
                                    "</ul>\n" +
                                    "\n" +
                                    "<pre><code>while True:\n" +
                                    "    # Capture the frame\n" +
                                    "    ret, frame = cap.read()\n" +
                                    "\n" +
                                    "    # Convert frame to grayscale for better performance\n" +
                                    "    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)\n" +
                                    "\n" +
                                    "    # Detect faces in the frame\n" +
                                    "    faces = face_cascade.detectMultiScale(gray, scaleFactor=1.1, minNeighbors=5)\n" +
                                    "\n" +
                                    "    for (x, y, w, h) in faces:\n" +
                                    "        # Initialize the tracker on the detected face\n" +
                                    "        tracker.init(frame, (x, y, w, h))\n" +
                                    "\n" +
                                    "    # Update the tracker in each new frame\n" +
                                    "    success, bbox = tracker.update(frame)\n" +
                                    "    if success:\n" +
                                    "        # Draw a rectangle around the tracked face\n" +
                                    "        p1 = (int(bbox[0]), int(bbox[1]))\n" +
                                    "        p2 = (int(bbox[0] + bbox[2]), int(bbox[1] + bbox[3]))\n" +
                                    "        cv2.rectangle(frame, p1, p2, (0, 255, 0), 2)\n" +
                                    "\n" +
                                    "    # Display the frame\n" +
                                    "    cv2.imshow('Face Tracking', frame)\n" +
                                    "\n" +
                                    "    # Exit on pressing 'q'\n" +
                                    "    if cv2.waitKey(1) & 0xFF == ord('q'):\n" +
                                    "        break\n" +
                                    "\n" +
                                    "# Release resources\n" +
                                    "cap.release()\n" +
                                    "cv2.destroyAllWindows()</code></pre>\n" +
                                    "\n" +
                                    "<h4>Display the Output</h4>\n" +
                                    "<p>The tracking result is displayed in real-time with a bounding box around the detected face, which is updated as the face moves through the frames.</p>\n", "2024-11-02", "2024-11-02")
                        )
                    )
                )
            )
        )
    )
)
