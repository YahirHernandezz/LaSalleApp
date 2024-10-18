package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme
import java.util.Stack

@Composable
fun ClassDetailScreen(innerPadding : PaddingValues, nombreClase : String){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column (
                modifier = Modifier
                    .padding(bottom = 35.dp)
                    .background(MaterialTheme.colorScheme.primary)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = nombreClase,
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                    color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.padding(bottom = 5.dp))
                Text(text = "9.0",
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                    color = MaterialTheme.colorScheme.onPrimary)
            }

            Row (
                modifier = Modifier
                    .padding(bottom = 35.dp)
                    .fillMaxWidth(),
                Arrangement.SpaceBetween
            ){
                Text(text = "Primer Parcial",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.padding(start = 20.dp, bottom = 5.dp))
                Text(text = "9.0",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.padding(end = 20.dp, bottom = 15.dp))
            }

            Row (
                modifier = Modifier
                    .padding(bottom = 35.dp)
                    .fillMaxWidth(),
                Arrangement.SpaceBetween
            ){
                Text(text = "Segundo Parcial",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.padding(start = 20.dp, bottom = 5.dp))
                Text(text = "9.0",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.padding(end = 20.dp, bottom = 15.dp))
            }

            Row (
                modifier = Modifier
                    .padding(bottom = 35.dp)
                    .fillMaxWidth(),
                Arrangement.SpaceBetween
            ){
                Text(text = "Tercer Parcial",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.padding(start = 20.dp, bottom = 5.dp))
                Text(text = "9.0",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.padding(end = 20.dp, bottom = 15.dp))
            }
        }
    }
}

@Preview
@Composable
fun ClassDetailScreenPreview() {
    _512LaSalleAppTheme {
        ClassDetailScreen(innerPadding = PaddingValues(), "Android")
    }
}