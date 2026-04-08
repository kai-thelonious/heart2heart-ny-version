package com.example.heart2heart_ny_version

import Screens.MainScreen
import Screens.ExpertScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ArchiveScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "MainScreen"
    ) {
        composable("MainScreen") {
            MainScreen(navController)
        }
        composable("ExpertScreen") {
            ExpertScreen(navController)
        }
        composable("ArchiveScreen") {
            ArchiveScreen(navController)

        }
    }
}
