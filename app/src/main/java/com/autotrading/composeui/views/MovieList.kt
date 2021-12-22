package com.autotrading.composeui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.autotrading.composeui.model.Schools

@Composable
fun MovieList(movieList: List<Schools.SchoolsItem>?) {
    LazyColumn {
        itemsIndexed(items = movieList!!) { index, item ->
            SchoolItem(schoolItem = item)
        }
    }
}

@Composable
fun SchoolItem(schoolItem: Schools.SchoolsItem) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .testTag("school_listitem")
            .height(70.dp), shape = RoundedCornerShape(8.dp), elevation = 4.dp
    )
    {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
        {
            Text(
                text = schoolItem.school_name!!,
                style = MaterialTheme.typography.subtitle1,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(15.dp),
                fontWeight = FontWeight.Normal
            )
        }
    }
}


