package com.example.heart2heart_ny_version

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.heart2heart_ny_version.ui.theme.Heart2heartnyversionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainFun()
        }
    }
}


@Composable
fun MainFun() {
    LazyColumn(
        modifier = Modifier
            .padding(40.dp),

        ) {
        item() {
            Text("Brevkasse")
        }
        item() {
            Text("Ugens ekspert")
        }
        item() {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(color = Color.Red)
                    .clickable { /* Action */ }
            ) {
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.linda_p),
                        contentDescription = "Description for accessibility", // Important for screen readers
                        modifier = Modifier.size(64.dp)
                    )
                    Column() {
                        // Header
                        Text("Linda P")

                        // Description
                        Text("Lorem ipsum dolor sit lorem ipsum Lorem ipsum dolor sit lorem ipsum ")
                    }
                }
            }

        }
    }


}

