package com.anikinkirill.mobius

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.anikinkirill.mobius.components.card.Card
import com.anikinkirill.mobius.components.topappbar.TopAppBar
import com.anikinkirill.mobius.model.UserOrder
import kotlinx.coroutines.launch

private val orders = List(5) {
    UserOrder(
        userItems = listOf(
            MainRes.image.ic_watches,
            MainRes.image.ic_alice,
        )
    )
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun App() {
    var showMenu by remember {
        mutableStateOf(false)
    }

    val bottomSheetScaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = BottomSheetState(BottomSheetValue.Collapsed)
    )
    val coroutineScope = rememberCoroutineScope()

    BottomSheetScaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                showMenu = showMenu,
                onMoreButtonClick = { showMenu = true },
                onDismissMenuRequest = { showMenu = false },
            )
        },
        scaffoldState = bottomSheetScaffoldState,
        sheetContent = {
            Box(
                modifier = Modifier.fillMaxWidth().height(height = 250.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "BottomSheet content")
            }
        },
        sheetPeekHeight = 0.dp,
        sheetBackgroundColor = Color(0xFFF5F4F2),
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
                        modifier = Modifier.padding(top = topMargin, bottom = bottomMargin),
                        onButtonClick = {
                            coroutineScope.launch {
                                if (bottomSheetScaffoldState.bottomSheetState.isCollapsed) {
                                    bottomSheetScaffoldState.bottomSheetState.expand()
                                } else {
                                    bottomSheetScaffoldState.bottomSheetState.collapse()
                                }
                            }
                        }
                    )
                }
            }
        }
    }
}