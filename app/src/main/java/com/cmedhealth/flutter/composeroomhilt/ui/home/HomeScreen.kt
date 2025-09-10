package com.cmedhealth.flutter.composeroomhilt.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cmedhealth.flutter.composeroomhilt.ui.components.Greeting

@Composable
fun HomeScreen(navigateToProfile:()->Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Greeting(
            name = "Home",
            modifier = Modifier.padding(innerPadding).clickable{
                navigateToProfile.invoke()
            }
        )
    }
}