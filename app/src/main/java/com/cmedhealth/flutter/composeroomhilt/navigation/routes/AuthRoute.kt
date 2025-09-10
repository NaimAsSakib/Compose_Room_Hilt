package com.cmedhealth.flutter.composeroomhilt.navigation.routes

import kotlinx.serialization.Serializable

@Serializable
sealed class AuthRoute {
    @Serializable
    data object Login : AuthRoute()
    @Serializable
    data object Registration : AuthRoute()
}