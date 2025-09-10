package com.cmedhealth.flutter.composeroomhilt.navigation.routes
import kotlinx.serialization.Serializable


@Serializable
sealed class ProfileRoute {

    @Serializable
    data object Profile : ProfileRoute()

}