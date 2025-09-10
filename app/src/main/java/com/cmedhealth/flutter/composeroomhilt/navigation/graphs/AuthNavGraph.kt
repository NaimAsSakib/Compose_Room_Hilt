package com.cmedhealth.flutter.composeroomhilt.navigation.graphs

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.AuthRoute
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.HomeRoute
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.RootRoute
import com.cmedhealth.flutter.composeroomhilt.ui.auth.LoginScreen
import com.cmedhealth.flutter.composeroomhilt.ui.auth.RegistrationScreen
import com.cmedhealth.flutter.composeroomhilt.ui.home.HomeScreen

fun NavGraphBuilder.authNavGraph(navController: NavController) {
    navigation<RootRoute.Auth>(
        startDestination = AuthRoute.Login
    ) {
        composable<AuthRoute.Login> {
            LoginScreen(
                navigateToHome = {
                    navController.navigate(RootRoute.Home) {
                        popUpTo(RootRoute.Auth) { inclusive = true }
                    }
                },
                navigateToRegistration = {
                    navController.navigate(AuthRoute.Registration)
                }
            )
        }

        composable<AuthRoute.Registration> {
            RegistrationScreen(){
                navController.navigateUp()  //todo: Note- Same as pobackstach use it instead
            }
        }
    }
}
