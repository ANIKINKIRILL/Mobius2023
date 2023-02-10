package com.anikinkirill.mobius

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.anikinkirill.mobius.components.card.Card
import com.anikinkirill.mobius.components.topappbar.TopAppBar
import com.anikinkirill.mobius.model.UserOrder

private val orders = List(5) {
    UserOrder(
        userItems = listOf(
            MainRes.image.ic_watches,
            MainRes.image.ic_alice,
        )
    )
}

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
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFF5F4F2))
        ) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(6.dp),
            ) {
                itemsIndexed(items = orders) { index, item ->
                    val topMargin = 6.dp.takeIf { index == 0 } ?: 0.dp
                    val bottomMargin = 6.dp.takeIf { index == orders.lastIndex } ?: 0.dp
                    Card(
                        userItems = item.userItems,
                        modifier = Modifier.padding(top = topMargin, bottom = bottomMargin)
                    )
                }
            }
        }
    }
}