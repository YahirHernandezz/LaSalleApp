package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.a512lasalleapp.R
import com.example.a512lasalleapp.ui.components.ClassItem
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun GradesScreen(innerPadding: PaddingValues, navController: NavController) {
    ScreenTemplate(innerPadding = innerPadding, header = {
        Row (
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
        ){
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .placeholder(R.drawable.dua)
                    .data(R.drawable.dua)
                    .build(),
                contentDescription = "Lasallista",
                modifier = Modifier.size(100.dp).clip(RoundedCornerShape(50)),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.padding(start = 15.dp)
            ){
                Text(text = "Dua Lipa",
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                    color = Color.White,
                    modifier = Modifier.padding(bottom = 5.dp))

                Row (
                    modifier = Modifier.fillMaxWidth()
                ){
                    Column(
                        modifier = Modifier.weight(0.7f)
                    ){
                        Text(text = "Ingenieria en Sistemas Computacionales",
                            fontSize = MaterialTheme.typography.bodySmall.fontSize,
                            fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                            color = Color.White)
                        Text(text = "5to Semestre",
                            fontSize = MaterialTheme.typography.bodySmall.fontSize,
                            fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                            color = Color.White)
                    }
                    Column(
                        modifier = Modifier.weight(0.3f).padding(start = 10.dp)
                    ){
                        Text(text = "Promedio",
                            fontSize = MaterialTheme.typography.bodySmall.fontSize,
                            fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                            color = Color.White)
                        Text(text = "9.0",
                            fontSize = MaterialTheme.typography.bodySmall.fontSize,
                            fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                            color = Color.White)
                    }
                }
            }
        }
    }, body = {
        LazyColumn (
            modifier = Modifier.height(570.dp).padding(10.dp)
        ){
            items(7) {
                ClassItem("Android", 9.0, onClick = {navController.navigate("class-detail")})
            }
        }
    })
}

@Preview
@Composable
fun GradesScreenPreview() {
    _512LaSalleAppTheme {
        GradesScreen(innerPadding = PaddingValues(), navController = NavController(LocalContext.current))
    }
}