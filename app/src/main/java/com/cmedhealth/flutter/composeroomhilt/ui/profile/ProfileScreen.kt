package com.cmedhealth.flutter.composeroomhilt.ui.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cmedhealth.flutter.composeroomhilt.ui.components.Greeting
import com.cmedhealth.flutter.composeroomhilt.ui.components.corecomponent.RootScreen

@Composable
fun ProfileScreen(
    logout: () -> Unit = {},
    navigateToRegistration: () -> Unit = {}
) {
    RootScreen {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Greeting(name = "Profile")

                Button(onClick = navigateToRegistration) {
                    Text("Go to Registration")
                }

                Button(onClick = logout) {
                    Text("Logout")
                }
            }
        }
    }
}
