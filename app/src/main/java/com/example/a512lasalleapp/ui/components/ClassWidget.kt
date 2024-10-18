package com.example.a512lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.ui.theme.GrayLight
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun ClassWidget(text: String, grade: String, onClick : () -> Unit = {}){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(GrayLight)
            .clickable { onClick() }
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(10.dp),
        ) {
            Text(
                text= text,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodySmall,
                fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                modifier = Modifier.padding(start = 20.dp)
            )
            Text(
                text= grade,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodySmall,
                fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                modifier = Modifier.padding(end = 20.dp)
            )
        }

    }
}

@Preview
@Composable
fun ClassWidgetPreview(){
    _512LaSalleAppTheme {
        ClassWidget(text = "Inicio", "9.0")
    }
}