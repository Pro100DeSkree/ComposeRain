package com.deskree.composerain.screens.main_screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.deskree.composerain.data.WeatherModel

@Composable
fun ListItem(item: WeatherModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 2.dp, end = 2.dp, top = 3.dp, bottom = 0.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.padding(start = 10.dp, top = 5.dp, bottom = 5.dp)) {
                Text(text = item.time, style = MaterialTheme.typography.subtitle1)
                Text(text = item.condition, style = MaterialTheme.typography.caption)
            }
            Text(text = item.currentTemp.ifEmpty { "${item.maxTemp}/${item.minTemp}" } + "°C",
                style = MaterialTheme.typography.h5)
            AsyncImage(
                model = "https:${item.icon}",
                contentDescription = "ImageCondition",
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(35.dp)
            )
        }
    }
}