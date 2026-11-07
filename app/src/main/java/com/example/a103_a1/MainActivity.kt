package com.example.a103_a1

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a103_a1.ui.theme._103_A1Theme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _103_A1Theme {
                BakeryRevenueScreen()
            }
        }
    }
}


@Composable
fun BakeryRevenueScreen() {
    val currencySymbol = "$"
    var cookiesSold by remember { mutableStateOf("") }
    var cookiePrice by remember { mutableStateOf("") }
    var muffinsSold by remember { mutableStateOf("") }
    var muffinPrice by remember { mutableStateOf("") }
    var cakesSold by remember { mutableStateOf("") }
    var cakesPrice by remember { mutableStateOf("") }

    val bakeryItems = remember { mutableStateListOf<BakeryItem>() }
    var totalRevenue by remember { mutableStateOf(0.0) }
    var bestSellingItem by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "\uD83E\uDDc1 Bakery Sales",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF30243F),
           // style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "Enter the sales information for each product.",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray,
            modifier = Modifier.padding(top = 8.dp, bottom = 16.dp)
        )

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFEFE9C7)
            ),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "\uD83C\uDF6A Cookies",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF30243F)
                )

                Spacer(modifier = Modifier.height(6.dp))

                OutlinedTextField(
                    value = cookiesSold,
                    onValueChange = { cookiesSold = it },
                    label = { Text("Cookies sold") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))

                OutlinedTextField(
                    value = cookiePrice,
                    onValueChange = { cookiePrice = it },
                    label = { Text("Price per cookie") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFC7E6EF)
            ),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "\uD83E\uDDC1 Muffins",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF30243F)
                )

                Spacer(modifier = Modifier.height(6.dp))

                OutlinedTextField(
                    value = muffinsSold,
                    onValueChange = { muffinsSold = it },
                    label = { Text("Muffins sold") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))

                OutlinedTextField(
                    value = muffinPrice,
                    onValueChange = { muffinPrice = it },
                    label = { Text("Price per muffin") },
                    modifier = Modifier.fillMaxWidth()
                )

            }
        }


        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFDCC7EF)
            ),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "\uD83C\uDF82 Cakes",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF30243F)
                )

                Spacer(modifier = Modifier.height(6.dp))

                OutlinedTextField(
                    value = cakesSold,
                    onValueChange = { cakesSold = it },
                    label = { Text("Cakes sold") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))


                OutlinedTextField(
                    value = cakesPrice,
                    onValueChange = { cakesPrice = it },
                    label = { Text("Price per cake") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

    }

}

@Preview(showBackground = true)
@Composable
fun BakeryRenevueScreePreview() {
    _103_A1Theme {
        BakeryRevenueScreen()
    }
}