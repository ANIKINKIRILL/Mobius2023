package com.anikinkirill.mobius.components.topappbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.anikinkirill.mobius.MainRes
import com.anikinkirill.mobius.components.topappbar.actions.PlatformTopAppBarDropdownMenu

@Composable
internal fun TopAppBar(
    showMenu: Boolean,
    onMoreButtonClick: () -> Unit,
    onDismissMenuRequest: () -> Unit,
) {
    androidx.compose.material.TopAppBar(
        title = {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(text = MainRes.string.top_app_bar_name)
            }
        },
        backgroundColor = Color.White,
        actions = {
            IconButton(onClick = onMoreButtonClick) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "more")
            }
            PlatformTopAppBarDropdownMenu(
                showMenu = showMenu,
                onDismissMenuRequest = onDismissMenuRequest,
            )
        }
    )
}