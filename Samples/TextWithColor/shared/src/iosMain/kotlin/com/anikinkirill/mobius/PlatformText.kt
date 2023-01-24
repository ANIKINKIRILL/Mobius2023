package com.anikinkirill.mobius

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration

@Composable
internal actual fun PlatformText() {
    Text(
        text = Greeting().greeting(),
        color = Color.Blue,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.LineThrough,
    )
}