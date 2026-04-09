package com.example.heart2heart_ny_version.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.heart2heart_ny_version.Models.ExpertRepository

@Composable
fun AskExpertScreen(navController: NavController, expertId: String?) {
    val expert = ExpertRepository.experts.find { it.id == expertId } ?: ExpertRepository.experts[0]
    var questionText by remember { mutableStateOf("") }
    var submitted by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFEF8EC))
            .padding(22.dp)
    ) {
        // Top Bar
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
            }
            Text(text = "Indsend spørgsmål", fontSize = 20.sp, fontWeight = FontWeight.Bold, fontFamily = Skrifttype)
        }

        Spacer(modifier = Modifier.height(24.dp))

        if (submitted) {
            Text("Tak for dit spørgsmål til ${expert.name}! Vi har modtaget det og vender tilbage.", fontFamily = Skrifttype, fontSize = 16.sp)
        } else {
            Text("Skriv dit spørgsmål til ${expert.name}:", fontFamily = Skrifttype, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = questionText,
                onValueChange = { questionText = it },
                modifier = Modifier.fillMaxWidth().height(200.dp),
                placeholder = { Text("Skriv her...", fontFamily = Skrifttype) },
                colors = OutlinedTextFieldDefaults.colors(focusedContainerColor = Color.White, unfocusedContainerColor = Color.White)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = { submitted = true },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = mainColor)
            ) {
                Text("Send spørgsmål", fontFamily = Skrifttype, color = Color.White)
            }
        }
    }
}
