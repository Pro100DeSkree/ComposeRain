package com.deskree.composerain.screens.main_screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import com.deskree.composerain.data.WeatherModel
import org.json.JSONArray
import org.json.JSONObject

@Composable
fun LazyList(list: List<WeatherModel>, currentDays: MutableState<WeatherModel>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        itemsIndexed(
            list
        ) { _, item ->
            ListItem(item = item)
        }
    }
}
