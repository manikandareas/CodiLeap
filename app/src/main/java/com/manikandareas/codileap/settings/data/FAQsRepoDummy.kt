package com.manikandareas.codileap.settings.data

import com.manikandareas.codileap.settings.presentation.model.FAQ

fun getFAQs(): List<FAQ> = listOf(
    FAQ(
        question = "How do I create an account?",
        answer = "To create an account, click on the 'Sign Up' button on the main screen. " +
                "Fill in your email address, choose a password, and follow the verification steps. " +
                "Once verified, you can start using all features of the app."
    ),
    FAQ(
        question = "How can I reset my password?",
        answer = "If you've forgotten your password, click on the 'Forgot Password' link on the " +
                "login screen. Enter your email address, and we'll send you instructions to reset " +
                "your password. Make sure to check your spam folder if you don't see the email."
    ),
    FAQ(
        question = "Is my data secure?",
        answer = "Yes, we take data security very seriously. All your data is encrypted both in " +
                "transit and at rest. We use industry-standard security protocols and regularly " +
                "update our security measures to ensure your information stays protected."
    ),
    FAQ(
        question = "How can I contact support?",
        answer = "You can reach our support team through multiple channels:\n" +
                "1. In-app chat support\n" +
                "2. Email: support@example.com\n" +
                "3. Phone: 1-800-EXAMPLE\n" +
                "We typically respond within 24 hours during business days."
    )
)