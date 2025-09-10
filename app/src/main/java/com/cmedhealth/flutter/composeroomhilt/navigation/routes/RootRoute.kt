package com.cmedhealth.flutter.composeroomhilt.navigation.routes
import kotlinx.serialization.Serializable


@Serializable
sealed class RootRoute {
    @Serializable
    data object Home : RootRoute()

    @Serializable
    data object Profile : RootRoute()

    @Serializable
    data object Auth : RootRoute()


}