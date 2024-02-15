package com.example.jetpackcomposenavigation.firstscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.example.jetpackcomposenavigation.second

const val ArgConst = "name"

@Composable
fun FirstDestination(
    navController: NavHostController,
    backStackEntry: NavBackStackEntry
) {

    //it can be null
    val arg = backStackEntry.arguments?.getString(ArgConst)


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "First Destination",
            fontSize = 20.sp
        )

        //checking args as it can be null
        arg?.let {
            Text(
                text = "Args: $arg",
                fontSize = 20.sp
            )
        }

        Button(onClick = {
            navController.navigate(second)
        }) {
            Text(text = "Go To Second Destination")
        }
    }
}