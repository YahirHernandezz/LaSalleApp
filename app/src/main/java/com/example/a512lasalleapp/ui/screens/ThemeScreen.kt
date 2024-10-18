package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun ThemeScreen(innerPadding : PaddingValues){
    ScreenTemplate(innerPadding = innerPadding, header = {

    }, body = {
        Text("Pantalla de Cambiar Tema")
    })
}

@Preview
@Composable
fun ThemeScreenPreview() {
    _512LaSalleAppTheme {
        ThemeScreen(innerPadding = PaddingValues())
    }
}