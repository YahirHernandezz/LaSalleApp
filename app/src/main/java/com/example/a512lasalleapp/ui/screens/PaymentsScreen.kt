package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.ui.components.PaymentItem
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun PaymentsScreen(innerPadding: PaddingValues){
    val pagados = listOf(
        "Agosto",
        "Septiembre",
        "Octubre"
    )

    val pendientes = listOf(
        "Noviembre",
        "Diciembre",
        "Enero"
    )
    ScreenTemplate(innerPadding = innerPadding, header = {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = androidx.compose.ui.Alignment.Center
        ){
            Column (
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
            ){
                Text(text = "Pagos",
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                    color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.padding(bottom = 15.dp))

                Text(text = "Semestre Ago - Dic",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                    color = MaterialTheme.colorScheme.onPrimary)
            }
        }
    }, body = {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ){
            Text(text = "Pagos Pendientes",
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
                fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.padding(start = 10.dp))

            LazyColumn(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .height(200.dp)
            ){
                items(pendientes){
                    PaymentItem(pendientes[pendientes.indexOf(it)], false)
                }
            }

            Text(text = "Pagos Realizados",
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
                fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.padding(start = 10.dp))

            LazyColumn(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .height(200.dp)
            ){
                items(pagados){
                    PaymentItem(pagados[pagados.indexOf(it)], true)
                }
            }
        }
    })
}

@Preview
@Composable
fun PaymentsScreenPreview() {
    _512LaSalleAppTheme {
        PaymentsScreen(innerPadding = PaddingValues())
    }
}