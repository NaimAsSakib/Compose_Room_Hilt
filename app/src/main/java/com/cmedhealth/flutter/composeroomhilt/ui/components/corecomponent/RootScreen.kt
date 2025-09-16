package com.cmedhealth.flutter.composeroomhilt.ui.components.corecomponent

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.cmedhealth.flutter.composeroomhilt.navigation.bottom_navigation.BottomNavConfig

//todo: Note: Take any common Scafold item here, Pass the variable to control visibility
@Composable
fun RootScreen(
    shouldShowBottomBar: Boolean = true,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold { paddingValues ->
        LaunchedEffect(shouldShowBottomBar) {
            BottomNavConfig.updateBottomNavVisibility(shouldShowBottomBar)
        }
        content(paddingValues)
    }
}

