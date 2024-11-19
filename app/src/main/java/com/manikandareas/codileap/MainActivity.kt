package com.manikandareas.codileap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.manikandareas.codileap.analytics.presentation.AnalyticsScreen
import com.manikandareas.codileap.core.navigation.CodiLeapNavigation
import com.manikandareas.codileap.core.navigation.Navigator
import com.manikandareas.codileap.courses.presentation.CoursesScreen
import com.manikandareas.codileap.courses.presentation.LessonScreen
import com.manikandareas.codileap.home.presentation.HomeScreen
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import org.koin.compose.koinInject

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodiLeapTheme {
                val navController = rememberNavController()
                val navigator = koinInject<Navigator>()
//                CodiLeapNavigation(
//                    navController = navController,
//                    navigator = navigator,
//                    startDestination = navigator.startDestination
//                )
                LessonScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CodiLeapTheme {}
}