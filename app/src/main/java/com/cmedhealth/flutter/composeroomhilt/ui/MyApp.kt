package com.cmedhealth.flutter.composeroomhilt.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.cmedhealth.flutter.composeroomhilt.navigation.bottom_navigation.BottomNavConfig
import com.cmedhealth.flutter.composeroomhilt.navigation.bottom_navigation.BottomNavigationBar
import com.cmedhealth.flutter.composeroomhilt.navigation.graphs.authNavGraph
import com.cmedhealth.flutter.composeroomhilt.navigation.graphs.homeNavGraph
import com.cmedhealth.flutter.composeroomhilt.navigation.graphs.introNavGraph
import com.cmedhealth.flutter.composeroomhilt.navigation.graphs.profileNavGraph
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.RootRoute

@Composable
fun MyApp() {
    val navController = rememberNavController()


    Scaffold(
        bottomBar = {
            // Only show bottom navigation for specified screens
            val shouldShow by BottomNavConfig.shouldShowBottomNav
            if (shouldShow) {
                BottomNavigationBar(navController = navController)
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = RootRoute.Intro,
            modifier = Modifier.padding(innerPadding)
        ) {
            // Introduction/Carousel
            introNavGraph(navController)

            // Auth navigation graph
            authNavGraph(navController)

            // Home navigation graph
            homeNavGraph(navController)

            // Profile navigation graph
            profileNavGraph(navController)
        }
    }
}