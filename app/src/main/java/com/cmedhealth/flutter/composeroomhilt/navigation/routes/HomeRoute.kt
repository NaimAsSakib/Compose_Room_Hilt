package com.cmedhealth.flutter.composeroomhilt.navigation.routes
import kotlinx.serialization.Serializable


@Serializable
sealed class HomeRoute {
    @Serializable
    data object Home : HomeRoute()
}