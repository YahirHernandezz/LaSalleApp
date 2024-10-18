package com.example.a512lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme
import com.example.a512lasalleapp.ui.utils.Check_circle
import com.example.a512lasalleapp.ui.utils.Warning

@Composable
fun PaymentItem(text: String, paid: Boolean){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .height(60.dp)
            .padding(10.dp)
            .clickable {  }
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ){
            Box(
                modifier = Modifier
                    .weight(0.4f)
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (paid) {
                        Icon(
                            imageVector = Check_circle,
                            contentDescription = text,
                            modifier = Modifier
                                .size(30.dp)
                                .padding(start = 10.dp, end = 5.dp),
                            tint = Color.DarkGray
                        )
                    } else {
                        Icon(
                            imageVector = Warning,
                            contentDescription = text,
                            modifier = Modifier
                                .size(30.dp)
                                .padding(start = 10.dp, end = 5.dp),
                            tint = Color.DarkGray
                        )
                    }
                    Text(
                        text = text,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(end = 10.dp)
                    )
                }
            }

            Box(
                modifier = Modifier
                    .weight(0.3f)
                    .background(MaterialTheme.colorScheme.primary)
                    .fillMaxSize(),
                contentAlignment = androidx.compose.ui.Alignment.Center
            ){
                Text(text = "Vencimiento",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(start = 10.dp),
                    color = MaterialTheme.colorScheme.onPrimary)
            }

            Box(
                modifier = Modifier
                    .weight(0.3f)
                    .background(MaterialTheme.colorScheme.error)
                    .fillMaxSize(),
                contentAlignment = androidx.compose.ui.Alignment.Center
            ){
                Text(text = "Recibo",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(start = 10.dp),
                    color = MaterialTheme.colorScheme.onPrimary)
            }
        }
    }
}

@Preview
@Composable
fun PaymentItemPreview(){
    _512LaSalleAppTheme {
        PaymentItem(text = "Noviembre", false)
    }
}