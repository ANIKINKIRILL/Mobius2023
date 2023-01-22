package com.anikinkirill.mobius

import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color

@Composable
internal actual fun PlatformText() {
    Text(text = Greeting().greeting(), color = Color.Green)
}