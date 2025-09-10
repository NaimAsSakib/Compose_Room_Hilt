package com.cmedhealth.flutter.composeroomhilt.ui.profile

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cmedhealth.flutter.composeroomhilt.ui.components.Greeting

@Composable
fun ProfileScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Greeting(
            name = "Profile",
            modifier = Modifier.padding(innerPadding)
        )
    }
}