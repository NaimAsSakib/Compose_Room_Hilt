package com.cmedhealth.flutter.composeroomhilt.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.cmedhealth.flutter.composeroomhilt.navigation.graphs.homeNavGraph
import com.cmedhealth.flutter.composeroomhilt.navigation.graphs.profileNavGraph
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.RootRoute


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = RootRoute.Home,
        modifier = Modifier.fillMaxSize()
    ){
        homeNavGraph(navController)
        profileNavGraph(navController)
    }
}