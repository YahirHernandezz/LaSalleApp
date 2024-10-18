package com.example.a512lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun ClassItem(materia: String, promedio: Double, onClick: () -> Unit = {}){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(MaterialTheme.colorScheme.background)
            .wrapContentHeight()
            .clickable { onClick() }
    ){
        Column(
            modifier = Modifier.wrapContentHeight()
        ){
            Box (
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .fillMaxWidth()
            ){
                Text(text = materia,
                    modifier = Modifier.padding(10.dp),
                    color = MaterialTheme.colorScheme.onPrimary)
            }

            Row(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth(),
                Arrangement.SpaceBetween
            ){
                Text(text = "Promedio Actual",
                    modifier = Modifier.padding(10.dp),
                    color = MaterialTheme.colorScheme.onBackground,
                    fontSize = MaterialTheme.typography.bodyMedium.fontSize)
                Text(text = promedio.toString(),
                    modifier = Modifier.padding(10.dp),
                    color = MaterialTheme.colorScheme.onBackground,
                    fontSize = MaterialTheme.typography.bodyMedium.fontSize)
            }
        }
    }
}

@Preview
@Composable
fun ClassItemPreview(){
    _512LaSalleAppTheme {
        ClassItem("Android", 9.0)
    }
}