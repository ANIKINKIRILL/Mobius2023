package com.anikinkirill.mobius.components.topappbar.actions

import androidx.compose.material.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
internal actual fun PlatformTopAppBarDropdownMenu(
    showMenu: Boolean,
    onDismissMenuRequest: () -> Unit,
) {
    DropdownMenu(expanded = showMenu, onDismissRequest = onDismissMenuRequest) {
        DropdownMenuItem(onClick = {}) {
            Text(text = "Option 1")
        }

        DropdownMenuItem(onClick = {}) {
            Text(text = "Option 2")
        }
    }
}