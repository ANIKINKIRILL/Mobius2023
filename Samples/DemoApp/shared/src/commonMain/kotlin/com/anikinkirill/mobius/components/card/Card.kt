package com.anikinkirill.mobius.components.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
internal fun Card(
    modifier: Modifier = Modifier,
    userItems: List<String>,
) {
    androidx.compose.material.Card(
        modifier = modifier.fillMaxWidth().wrapContentHeight(),
        shape = RoundedCornerShape(20),
    ) {
        Column(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = "Уже у вас",
                    fontWeight = FontWeight(500),
                    fontSize = 20.sp,
                    color = Color(0xFF21201F)
                )
                Text(
                    text = "Повторить",
                    fontWeight = FontWeight(400),
                    fontSize = 13.sp,
                    color = Color(0xFF1B52B2)
                )
            }

            Row(modifier = Modifier.fillMaxWidth().padding(top = 16.dp)) {
                LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    items(items = userItems) { userItem ->
                        Image(
                            imageVector = Icons.Default.Person,
                            contentDescription = "item",
                            modifier = Modifier.size(56.dp)
                        )
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 12.dp, bottom = 18.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF5F4F2)),
                    contentPadding = PaddingValues(18.dp),
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(15),
                ) {
                    Text(text = "Посмотреть посылку")
                }
            }
        }
    }
}