package com.example.lasalleapp.ui.theme.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.ui.theme.components.ScreenTemplate

@Composable
fun GradesScreen(innerPadding : PaddingValues){
    ScreenTemplate(innerPadding = innerPadding, header = { 
        Text(text = "Hola")
    }, body = {
        Text(text = "Hola")
    })
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GradesScreenPreview(){
    LaSalleAppTheme {
        GradesScreen(innerPadding = PaddingValues(0.dp))
    }
}