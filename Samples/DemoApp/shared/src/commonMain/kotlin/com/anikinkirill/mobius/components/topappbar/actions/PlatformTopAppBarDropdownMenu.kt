package com.anikinkirill.mobius.components.topappbar.actions

import androidx.compose.runtime.Composable

@Composable
internal expect fun PlatformTopAppBarDropdownMenu(
    showMenu: Boolean,
    onDismissMenuRequest: () -> Unit,
)