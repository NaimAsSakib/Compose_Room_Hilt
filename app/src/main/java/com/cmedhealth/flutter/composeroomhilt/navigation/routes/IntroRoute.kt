package com.cmedhealth.flutter.composeroomhilt.navigation.routes

import kotlinx.serialization.Serializable
@Serializable
sealed class IntroRoute {
        @Serializable
        data object Intro : IntroRoute()
}