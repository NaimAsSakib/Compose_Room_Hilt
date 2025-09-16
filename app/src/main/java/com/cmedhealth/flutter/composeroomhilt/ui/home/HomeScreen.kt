package com.cmedhealth.flutter.composeroomhilt.ui.home

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cmedhealth.flutter.composeroomhilt.ui.components.Greeting
import com.cmedhealth.flutter.composeroomhilt.ui.components.corecomponent.RootScreen

@Composable
fun HomeScreen(navigateToProfile: () -> Unit) {
    RootScreen { innerPadding ->
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