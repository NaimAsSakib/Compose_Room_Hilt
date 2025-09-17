package com.cmedhealth.flutter.composeroomhilt.ui.intro.pager

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import kotlinx.coroutines.launch

@Composable
fun IntroPager(skipBtnAction: () -> Unit = {}) {
    val state = rememberPagerState { 5 }
    val scope = rememberCoroutineScope()

    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            state = state,
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(horizontal = 0.dp),
            snapPosition = SnapPosition.Center
        ) { page ->
            Box(
                modifier = Modifier
                    .background(if (page % 2 == 0) Color.Cyan else Color.LightGray)
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = page.toString(), fontSize = 32.sp)
            }
        }

        // Bottom navigation buttons
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Back button - only show if not on first page
            if (state.currentPage > 0) {
                Button(
                    onClick = {
                        scope.launch {
                            state.animateScrollToPage(state.currentPage - 1)
                        }
                    }
                ) {
                    Text("Back")
                }
            } else {
                // Empty space to maintain layout
                Spacer(modifier = Modifier.width(80.dp))
            }

            // Skip button in the middle
            Button(
                onClick = { skipBtnAction() }
            ) {
                Text("Skip")
            }

            // Next button - only show if not on last page
            if (state.currentPage < 4) {
                Button(
                    onClick = {
                        scope.launch {
                            state.animateScrollToPage(state.currentPage + 1) // Changed from -1 to +1
                        }
                    }
                ) {
                    Text("Next")
                }
            } else {
                Button(
                    onClick = { skipBtnAction() }
                ) {
                    Text("Ok")
                }
            }
        }
    }
}