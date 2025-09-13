package com.sabanbingul.carshopapp.ui.feature.intro

import android.view.RoundedCorner
import androidx.compose.foundation.Image
import com.sabanbingul.carshopapp.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun IntroScreen(navToMain: () -> Unit={}){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 48.dp, bottom = 32.dp),
            verticalArrangement = Arrangement.SpaceBetween

        ) {
            Column {
                Text(text = "Easy Way to buy\n your dream car",
                    color = Color.White,
                    modifier = Modifier.padding(horizontal = 24.dp)
                        .statusBarsPadding(),
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(24.dp))
                Text(text = "Lorem ipsum dolor sit amet," +
                    "consectetur adipiscing" +
                        "\nelit, sed do eiusmod tempor incididunt ut labore et"+
                        "\n dolore magna aliqua",
                    color = Color.White,
                    modifier = Modifier.padding(horizontal = 24.dp),
                    fontSize = 14.sp,
                    lineHeight = 24.sp
                )
            }
            Column {
                Image(painter = painterResource(R.drawable.intro_car),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 200.dp)
                )
                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    onClick = navToMain,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                        .height(60.dp),
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    )
                ) {
                    Text(text = "Get Stared",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold)
                }
            }

        }
    }
}