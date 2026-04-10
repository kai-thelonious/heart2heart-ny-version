package com.example.heart2heart_ny_version.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.heart2heart_ny_version.Models.ExpertRepository

@Composable
fun ExpertAnswer(navController: NavController, expertId: String?, questionId: String?) {
    val mainColor = Color(0xFFF39FC2)
    
    val expert = ExpertRepository.experts.find { it.id == expertId } ?: ExpertRepository.experts[0]
    val question = expert.questions.find { it.id == questionId } ?: expert.questions[0]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFEF8EC))
            .padding(22.dp)
            .verticalScroll(rememberScrollState())
    ) {

        // Back-knap øverst
        TextButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier.padding(top = 10.dp)
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

        Spacer(modifier = Modifier.height(16.dp))

        // TITEL
        Text(
            text = question.title,
            color = Color.Black,
            fontSize = 28.sp,
            fontFamily = Skrifttype,
            fontWeight = FontWeight.Bold,
            lineHeight = 34.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        //CONTENT
        Column(modifier = Modifier.padding(bottom = 22.dp))
        {
            // Lille box med emne
            Box(
                modifier = Modifier
                    .background(mainColor, shape = RoundedCornerShape(50))
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text(
                    text = question.category,
                    color = Color.White,
                    fontSize = 12.sp,
                    fontFamily = Skrifttype
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // SPØRGSMÅL
            Text(
                text = "“${question.questionText}”",
                fontSize = 20.sp,
                fontFamily = Skrifttype,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 28.sp
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Spørgsmål fra ${question.authorInfo}",
                fontSize = 12.sp,
                color = Color.Gray,
                fontFamily = Skrifttype
            )

            Spacer(modifier = Modifier.height(32.dp))

            // SVAR FRA EKSPERT
            Text(
                text = "Svar fra ${expert.name}:",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = mainColor,
                fontFamily = Skrifttype,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            
            Text(
                text = question.answerText,
                fontSize = 17.sp,
                lineHeight = 26.sp,
                fontFamily = Skrifttype,
                color = Color.DarkGray
            )

            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}
