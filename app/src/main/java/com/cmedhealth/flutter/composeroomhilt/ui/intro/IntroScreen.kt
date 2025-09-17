package com.cmedhealth.flutter.composeroomhilt.ui.intro

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cmedhealth.flutter.composeroomhilt.ui.components.Greeting
import com.cmedhealth.flutter.composeroomhilt.ui.components.corecomponent.RootScreen
import com.cmedhealth.flutter.composeroomhilt.ui.intro.pager.IntroPager
import kotlinx.coroutines.launch

@Composable
fun IntroScreen(navigateToLogin: () -> Unit = {}) {
    RootScreen(shouldShowBottomBar = false) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            // Pager as background - pass the navigation function
            IntroPager(skipBtnAction = navigateToLogin)

            // Greeting on top
            Greeting(
                name = "Intro/Carousel",
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 16.dp)
            )
        }
    }
}
