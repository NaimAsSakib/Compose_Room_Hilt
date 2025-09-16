package com.cmedhealth.flutter.composeroomhilt.navigation.bottom_navigation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.HomeRoute
import com.cmedhealth.flutter.composeroomhilt.navigation.routes.ProfileRoute

object BottomNavConfig {


    private val _shouldShowBottomNav = mutableStateOf(false)
    val shouldShowBottomNav: State<Boolean> = _shouldShowBottomNav

    fun updateBottomNavVisibility(shouldShow: Boolean) {
        _shouldShowBottomNav.value = shouldShow
    }

    fun isHomeRoute(route: String?): Boolean {
        return route == HomeRoute.Home::class.qualifiedName
    }

    fun isProfileRoute(route: String?): Boolean {
        return route == ProfileRoute.Profile::class.qualifiedName
    }
}