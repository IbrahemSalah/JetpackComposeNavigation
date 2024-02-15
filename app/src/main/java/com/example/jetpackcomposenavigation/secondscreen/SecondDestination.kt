package com.example.jetpackcomposenavigation.secondscreen

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
import com.example.jetpackcomposenavigation.landing


@Composable
fun SecondDestination(
    navController: NavHostController
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Second Destination",
            fontSize = 20.sp
        )

        Button(onClick = {
            navController.popBackStack(landing, false)
        }) {
            Text(text = "Go To Landing")
        }
    }


}