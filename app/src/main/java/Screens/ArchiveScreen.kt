package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.navigation.NavController
import com.example.heart2heart_ny_version.R

@Composable
fun ArchiveScreen(navController: NavController) {
    val mainColor = Color(0xFFF39FC2)

    Column(modifier = Modifier.fillMaxSize()) {

        // Back-knap øverst
        TextButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier.padding(20.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.Black
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Back")
            }
        }

        // Liste med eksperter
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text(
                    text = "Tidligere eksperter",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(bottom = 8.dp, top = 20.dp)
                )
            }

            item {
                ExpertBox(
                    name = "Linda P",
                    description = "Tidligere ekspert i brevkassen om mental sundhed.",
                    mainColor = Color(0xFFF39FC2),
                    imageRes = R.drawable.linda_p
                )
            }

            item {
                ExpertBox(
                    name = "Peter H",
                    description = "Ekspert i fysisk træning og kostvejledning.",
                    mainColor = mainColor,
                    imageRes = R.drawable.peter_h
                )
            }

            item {
                ExpertBox(
                    name = "Maria K",
                    description = "Specialist i mindfulness og stresshåndtering.",
                    mainColor = mainColor,
                    imageRes = R.drawable.maria_h
                )
            }
        }
    }
}

@Composable
fun ExpertBox(name: String, description: String, mainColor: Color, imageRes: Int) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(mainColor)
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "Billede af $name",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(width = 100.dp, height = 120.dp)
                    .clip(RoundedCornerShape(8.dp))
            )

            Column(verticalArrangement = Arrangement.Center) {
                Text(
                    text = name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = description,
                    fontSize = 14.sp
                )
            }
        }
    }
}

