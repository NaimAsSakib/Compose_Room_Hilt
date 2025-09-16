package com.cmedhealth.flutter.composeroomhilt.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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

@Composable
fun HomeScreen(navigateToProfile: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Greeting(
                name = "Home",
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Button(
                onClick = { navigateToProfile() }
            ) {
                Text("Go to Profile")
            }
        }
    }
}