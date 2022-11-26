package com.indramahkota.app.exploration.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.indramahkota.app.exploration.feature.designsystem.InCatalog
import com.indramahkota.app.exploration.feature.homepage.HomePageScreen
import com.indramahkota.app.exploration.feature.splash.SplashScreen
import com.indramahkota.app.exploration.navigation.navigation.Screen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navHostController = navController)
        }

        composable(route = Screen.HomePage.route) {
            HomePageScreen(navHostController = navController)
        }

        composable(route = Screen.DesignSystem.route) {
            InCatalog()
        }
    }
}
