package com.manikandareas.codileap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.manikandareas.codileap.auth.data.preference.PreferenceDataSource
import com.manikandareas.codileap.core.navigation.CodiLeapNavigation
import com.manikandareas.codileap.core.navigation.Navigator
import com.manikandareas.codileap.settings.presentation.FAQsScreen
import com.manikandareas.codileap.ui.theme.CodiLeapTheme
import kotlinx.coroutines.flow.first
import org.koin.compose.koinInject
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import com.manikandareas.codileap.core.navigation.Destination
import com.manikandareas.codileap.user.domain.User

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodiLeapTheme {
                val navController = rememberNavController()
                val navigator = koinInject<Navigator>()
                val dataSource = koinInject<PreferenceDataSource>()

                var startDestination by remember { mutableStateOf(navigator.startDestination) }


                val token by dataSource.getToken()
                    .collectAsState(initial = null)

                val user by dataSource.getUser().collectAsState(initial = null)

                println("TOKEN INITIAL VALUE: $token")
                println("USER INITIAL VALUE: $user")

                LaunchedEffect(token, user) {
                    startDestination = if (token == null) {
                        navigator.startDestination
                    } else if (user?.isAlreadyScreened == false) {
                        Destination.ScreeningGraph
                    } else {
                        Destination.HomeGraph
                    }
                }

                CodiLeapNavigation(
                    navController = navController,
                    navigator = navigator,
                    startDestination = startDestination,
                    currentUser = user
                )
            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CodiLeapTheme {}
}

// glot.io