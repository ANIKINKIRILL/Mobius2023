package com.anikinkirill.mobius.components.topappbar.actions

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
internal actual fun PlatformTopAppBarDropdownMenu(
    showMenu: Boolean,
    onDismissMenuRequest: () -> Unit,
) {
    DropdownMenuIos(
        expanded = showMenu,
        onDismissRequest = onDismissMenuRequest
    ) {
        DropdownMenuItemIos(onClick = {}) {
            Text(text = "Option 1")
        }
        DropdownMenuItemIos(onClick = {}) {
            Text(text = "Option 2")
        }
    }
}