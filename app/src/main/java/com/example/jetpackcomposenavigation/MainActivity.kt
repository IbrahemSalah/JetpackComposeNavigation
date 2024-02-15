package com.example.jetpackcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpackcomposenavigation.firstscreen.ArgConst
import com.example.jetpackcomposenavigation.firstscreen.FirstDestination
import com.example.jetpackcomposenavigation.secondscreen.SecondDestination
import com.example.jetpackcomposenavigation.ui.theme.JetpackComposeNavigationTheme


const val landing = "landing"
const val first = "first"
const val second = "second"


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "landing"
                    ) {
                        composable(route = landing) {
                            LandingScreen(navController)
                        }

                        composable(
                            "$first/{$ArgConst}",
                            arguments = listOf(
                                navArgument(ArgConst) { type = NavType.StringType }
                            )
                        ) { backStackEntry ->
                            FirstDestination(navController, backStackEntry)
                        }

                        composable(route = second) {
                            SecondDestination(navController)
                        }
                    }
                }
            }
        }
    }
}