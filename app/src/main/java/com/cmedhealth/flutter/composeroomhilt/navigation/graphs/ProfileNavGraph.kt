package com.cmedhealth.flutter.composeroomhilt.navigation.graphs

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.HomeRoute
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.ProfileRoute
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.RootRoute
import com.cmedhealth.flutter.composeroomhilt.ui.home.HomeScreen
import com.cmedhealth.flutter.composeroomhilt.ui.profile.ProfileScreen


fun NavGraphBuilder.profileNavGraph(navController: NavController) {
   navigation<RootRoute.Profile>(
       startDestination = ProfileRoute.Profile
   ){
       composable<ProfileRoute.Profile> {
           ProfileScreen()
       }
   }
}