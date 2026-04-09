package com.example.heart2heart_ny_version.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.example.heart2heart_ny_version.Models.ExpertRepository

@Composable
fun SimpleExpertBox(name: String, description: String, mainColor: Color, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(mainColor)
            .clickable { onClick() }
            .padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = Skrifttype
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = if (description.length > 80) description.take(77) + "..." else description,
                fontSize = 14.sp,
                fontFamily = Skrifttype,
                lineHeight = 18.sp
            )
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
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Skrifttype
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = description,
                    fontSize = 14.sp,
                    fontFamily = Skrifttype
                )
            }
        }
    }
}

@Composable
fun ArchiveScreen(navController: NavController, expertId: String?) {
    val expert = ExpertRepository.experts.find { it.id == expertId } ?: ExpertRepository.experts[0]
    val mainColor = Color(0xFFF39FC2)

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFFEF8EC))) {

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
                Text(text = "Back", color = Color.Black, fontFamily = Skrifttype)
            }
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 22.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text(
                    text = "Spørgsmål til ${expert.name}",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontFamily = Skrifttype,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }

            item {
                ExpertBox(
                    name = expert.name,
                    description = expert.description,
                    mainColor = mainColor,
                    imageRes = expert.imageRes
                )
            }

            items(expert.questions) { question ->
                SimpleExpertBox(
                    name = question.title,
                    description = question.questionText,
                    mainColor = Color.White,
                    onClick = {
                        navController.navigate("ExpertAnswer/${expert.id}/${question.id}")
                    }
                )
            }
            
            item {
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}
