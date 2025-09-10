package com.cmedhealth.flutter.composeroomhilt.navigation.graphs

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.HomeRoute
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.RootRoute
import com.cmedhealth.flutter.composeroomhilt.ui.home.HomeScreen


fun NavGraphBuilder.homeNavGraph(navController: NavController) {
   navigation<RootRoute.Home>(
       startDestination = HomeRoute.Home
   ){
       composable<HomeRoute.Home> {
           HomeScreen {
               navController.navigate(RootRoute.Profile)
           }
       }
   }
}