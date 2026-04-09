package com.example.heart2heart_ny_version

import com.example.heart2heart_ny_version.Screens.ExpertAnswer
import com.example.heart2heart_ny_version.Screens.MainScreen
import com.example.heart2heart_ny_version.Screens.ExpertScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.heart2heart_ny_version.Screens.ArchiveScreen

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
        composable("ArchiveScreen/{expertId}") { backStackEntry ->
            val expertId = backStackEntry.arguments?.getString("expertId")
            ArchiveScreen(navController, expertId)
        }
        composable("ExpertAnswer/{expertId}/{questionId}"){ backStackEntry ->
            val expertId = backStackEntry.arguments?.getString("expertId")
            val questionId = backStackEntry.arguments?.getString("questionId")
            ExpertAnswer(navController, expertId, questionId)
        }
    }
}

