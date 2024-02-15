package com.example.jetpackcomposenavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun LandingScreen(
    navController: NavHostController
) {
    val name = "android"

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Landing Screen",
            fontSize = 20.sp
        )

        Button(onClick = {
            navController.navigate("$first/$name")
        }) {
            Text(text = "Go To First Destination")
        }
    }

}