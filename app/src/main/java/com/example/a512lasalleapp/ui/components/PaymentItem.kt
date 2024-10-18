package com.example.a512lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.ui.theme.GrayLight
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme
import com.example.a512lasalleapp.ui.utils.Lock

@Composable
fun PaymentItem(text: String, paid: Boolean){
    Box(
        modifier = Modifier
            .size(90.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(GrayLight),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (paid == true){
                Icon(
                    imageVector = Lock,
                    contentDescription = text,
                    modifier = Modifier.size(40.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
            }else{
                Icon(
                    imageVector = Lock,
                    contentDescription = text,
                    modifier = Modifier.size(40.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
            }

            Text(
                text= text,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodySmall,
                fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
        }

    }
}

@Preview
@Composable
fun PaymentItemPreview(){
    _512LaSalleAppTheme {
        PaymentItem(text = "Inicio", true)
    }
}