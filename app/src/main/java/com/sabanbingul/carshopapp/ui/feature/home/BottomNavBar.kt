package com.sabanbingul.carshopapp.ui.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sabanbingul.carshopapp.R


@Composable
fun BottomNavBar(
    onProfileClick : () -> Unit = {},
    modifier: Modifier = Modifier
){
    Surface(
        modifier = modifier,
        color = Color.Transparent,
        shape = RoundedCornerShape(50.dp),
        shadowElevation = 8.dp
    ) {
        BottomAppBar(
            containerColor = Color.Black,
            contentPadding = PaddingValues(horizontal = 16.dp),
            tonalElevation = 0.dp
        ) {
            Row(
                Modifier.fillMaxWidth()
                    .height(60.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(painterResource(R.drawable.btn_1),
                    contentDescription = null,
                    tint = Color.White )
                Icon(painterResource(R.drawable.btn_2),
                    contentDescription = null,
                    tint = Color.White )
                Icon(painterResource(R.drawable.btn_3),
                    contentDescription = null,
                    tint = Color.White )
                IconButton(onProfileClick) {
                    Icon(
                        painterResource(R.drawable.btn_4),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        }
    }
}