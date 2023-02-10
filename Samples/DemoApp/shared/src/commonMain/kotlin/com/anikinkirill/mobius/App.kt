package com.anikinkirill.mobius

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.anikinkirill.mobius.components.topappbar.TopAppBar

@Composable
internal fun App() {
    var showMenu by remember {
        mutableStateOf(false)
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                showMenu = showMenu,
                onMoreButtonClick = { showMenu = true },
                onDismissMenuRequest = { showMenu = false },
            )
        },
    ) {
        Box(modifier = Modifier.fillMaxSize().background(Color.White)) {
            Text(Greeting().greeting())
        }
    }
}