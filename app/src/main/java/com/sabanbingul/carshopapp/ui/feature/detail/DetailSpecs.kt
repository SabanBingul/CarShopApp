package com.sabanbingul.carshopapp.ui.feature.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.sabanbingul.carshopapp.R
import com.sabanbingul.carshopapp.ui.components.SpecCard

@Composable
fun DetailSpecs(
    totalCapacity: String,
    highesSpeed: String,
    engineOutput: String
) {
   Row(
       modifier = Modifier
           .fillMaxWidth()
           .padding(horizontal = 16.dp),
       horizontalArrangement = Arrangement.spacedBy(16.dp)
   ){
       SpecCard(R.drawable.sit, "Total\n Capacity", totalCapacity, Modifier.weight(1f))
       SpecCard(R.drawable.speed, "Highest\n Speed", highesSpeed, Modifier.weight(1f))
       SpecCard(R.drawable.engine, "Engine\n Output", engineOutput, Modifier.weight(1f))

   }
}

@Preview
@Composable
fun DetailSpecsPreview() {
    DetailSpecs(
        totalCapacity = "4 Seats",
        highesSpeed = "350 Km/h",
        engineOutput = "670 Hp"
    )
}