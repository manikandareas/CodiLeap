@file:OptIn(ExperimentalMaterial3Api::class)

package com.manikandareas.codileap.settings.presentation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.manikandareas.codileap.settings.data.getFAQs
import com.manikandareas.codileap.settings.presentation.component.FAQsAppBar
import com.manikandareas.codileap.settings.presentation.component.FAQsItem
import com.manikandareas.codileap.ui.theme.CodiLeapTheme

@Composable
fun FAQsScreen(
    modifier: Modifier = Modifier
    ) {
    val faqs = remember { getFAQs() }
    Scaffold(
        topBar = {
            FAQsAppBar {  }
        },
        content = { innerPadding ->
            Surface(
                modifier = modifier
                    .fillMaxSize()
                    .padding(innerPadding), // Apply inner padding
                color = MaterialTheme.colorScheme.background
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Frequently Asked Questions",
                        style = MaterialTheme.typography.headlineMedium,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    faqs.forEach { faq ->
                        FAQsItem(
                            faq = faq,
                            modifier = Modifier.padding(vertical = 4.dp)
                        )
                    }
                }
            }
        }
    )
}

@PreviewLightDark
@Composable
fun PreviewFAQsScreen(modifier: Modifier = Modifier) {
    CodiLeapTheme {
        FAQsScreen(modifier = modifier)
    }
}


