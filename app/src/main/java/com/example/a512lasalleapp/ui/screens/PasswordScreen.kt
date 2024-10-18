package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun PasswordScreen(innerPadding : PaddingValues){
    ScreenTemplate(innerPadding = innerPadding, header = {

    }, body = {
        Text("Pantalla de Cambiar Contraseña")
    })
}

@Preview
@Composable
fun PasswordScreenPreview() {
    _512LaSalleAppTheme {
        PasswordScreen(innerPadding = PaddingValues())
    }
}