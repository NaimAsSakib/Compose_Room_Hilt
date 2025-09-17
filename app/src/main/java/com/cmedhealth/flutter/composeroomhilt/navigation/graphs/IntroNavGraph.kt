package com.cmedhealth.flutter.composeroomhilt.navigation.graphs

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.HomeRoute
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.IntroRoute
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.RootRoute
import com.cmedhealth.flutter.composeroomhilt.ui.home.HomeScreen
import com.cmedhealth.flutter.composeroomhilt.ui.intro.IntroScreen

fun NavGraphBuilder.introNavGraph(navController: NavController) {
    navigation<RootRoute.Intro>(
        startDestination = IntroRoute.Intro
    ){
        composable<IntroRoute.Intro> {
            IntroScreen {
                navController.navigate(RootRoute.Auth)
            }
        }
    }
}