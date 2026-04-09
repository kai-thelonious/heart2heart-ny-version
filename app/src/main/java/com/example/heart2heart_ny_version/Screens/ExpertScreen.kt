package com.example.heart2heart_ny_version.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.heart2heart_ny_version.Models.ExpertRepository
import com.example.heart2heart_ny_version.R

private val Pink100 = Color(0xFFFFD6E0)
private val Pink200 = Color(0xFFFFC1D0)
private val BubbleShape = RoundedCornerShape(16.dp)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExpertScreen(navController: NavController) {
    val expert = ExpertRepository.experts.find { it.id == "puk_damsgard" } ?: ExpertRepository.experts[0]
    var newQuestion by remember { mutableStateOf("") }
    var showConfirmation by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp)
    ) {
        Spacer(Modifier.height(30.dp))

        // Back Button
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable { navController.popBackStack() }
                .padding(bottom = 16.dp)
        ) {
            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
            Spacer(Modifier.width(8.dp))
            Text("Tilbage", fontSize = 18.sp, fontFamily = Skrifttype)
        }

        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text(
                    text = "Spørgsmål til ${expert.name}",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Skrifttype,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }

            items(expert.questions) { question ->
                // User Message
                ChatBubble(
                    text = question.questionText,
                    author = question.authorInfo,
                    color = Pink100,
                    modifier = Modifier.fillMaxWidth(0.85f),
                    fontStyle = FontStyle.Italic
                )

                Spacer(Modifier.height(8.dp))

                // Expert Reply
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Top
                ) {
                    ChatBubble(
                        text = question.answerText,
                        author = expert.name,
                        color = Pink200,
                        modifier = Modifier.weight(1f).padding(start = 32.dp)
                    )
                    Spacer(Modifier.width(8.dp))
                    Image(
                        painter = painterResource(expert.imageRes),
                        contentDescription = "Avatar",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray)
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.height(24.dp))
            }
        }

        // Input Section
        HorizontalDivider(color = Color.LightGray, thickness = 1.dp)
        Spacer(modifier = Modifier.height(16.dp))
        
        if (showConfirmation) {
            Text(
                "Tak! Dit spørgsmål er sendt til ${expert.name}.",
                color = Color(0xFF4CAF50),
                fontWeight = FontWeight.Bold,
                fontFamily = Skrifttype,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }

        Text(
            "Stil selv et spørgsmål:",
            fontWeight = FontWeight.SemiBold,
            fontFamily = Skrifttype,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            OutlinedTextField(
                value = newQuestion,
                onValueChange = { newQuestion = it },
                placeholder = { Text("Skriv her...", fontSize = 14.sp) },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(24.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = mainColor,
                    unfocusedBorderColor = Color.Gray,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                )
            )
            Spacer(modifier = Modifier.width(8.dp))
            Button(
                onClick = {
                    if (newQuestion.isNotBlank()) {
                        showConfirmation = true
                        newQuestion = ""
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = mainColor),
                shape = RoundedCornerShape(24.dp)
            ) {
                Text("Send", color = Color.White)
            }
        }
    }
}

@Composable
private fun ChatBubble(
    text: String,
    author: String,
    color: Color,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal
) {
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .clip(BubbleShape)
                .background(color)
                .padding(16.dp)
        ) {
            Text(text, fontSize = 15.sp, fontStyle = fontStyle, fontFamily = Skrifttype)
        }
        Text(
            text = author,
            fontSize = 11.sp,
            color = Color.Gray,
            fontFamily = Skrifttype,
            modifier = Modifier.padding(top = 4.dp, start = 4.dp)
        )
    }
}
