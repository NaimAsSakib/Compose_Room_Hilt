package com.cmedhealth.flutter.composeroomhilt.ui.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cmedhealth.flutter.composeroomhilt.ui.components.corecomponent.RootScreen

@Composable
fun LoginScreen(
    navigateToHome: () -> Unit,
    navigateToRegistration: () -> Unit
) {
    RootScreen(shouldShowBottomBar = false) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text("Hello Login!")
                Spacer(modifier = Modifier.padding(8.dp))
                Button(onClick = navigateToHome) {
                    Text("Go to Home")
                }
                Button(onClick = navigateToRegistration) {
                    Text("Go to Registration")
                }
            }
        }
    }
}
