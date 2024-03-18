package com.mod72.simplenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.FirstScreen.route,
    ) {
        composable(route = Routes.FirstScreen.route)
        {
            Screen1(navController = navController)
        }
        composable(route = Routes.SecondScreen.route)
        {
            Screen2(navController = navController)
        }
        composable(route = Routes.ThirdScreen.route)
        {
            Screen3(navController = navController)
        }
    }
}
