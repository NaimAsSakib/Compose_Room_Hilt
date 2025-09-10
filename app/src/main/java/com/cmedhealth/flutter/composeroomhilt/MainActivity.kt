package com.cmedhealth.flutter.composeroomhilt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.cmedhealth.flutter.composeroomhilt.navigation.AppNavigation
import com.cmedhealth.flutter.composeroomhilt.ui.theme.ComposeRoomHiltTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    ComposeRoomHiltTheme{
        AppNavigation()
    }
}



