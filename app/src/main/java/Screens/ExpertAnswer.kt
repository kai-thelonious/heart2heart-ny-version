package Screens

import android.R.color.white
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ExpertAnswer(navController: NavController) {
    val mainColor = Color(0xFFF39FC2)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(22.dp)
    ) {

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

        Spacer(modifier = Modifier.height(16.dp))

        // TITEL
        Text(
            text = "Ensomhed i 20'erne",
            color = Color.Black,
            fontSize = 28.sp,
            fontFamily = Skrifttype,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        //CONTENT
        Column(modifier = Modifier
            .padding(22.dp))
        {
            // Lille box med emne
            Box(
                modifier = Modifier
                    .background(mainColor, shape = RoundedCornerShape(50))
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text(
                    text = "Relationer",
                    color = Color.White,
                    fontSize = 12.sp
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // SPØRGSMÅL
            Text(
                text = "“Hej Oprah. Kæmpe fan btw. Jeg er en pige i 20'erne som struggler meget med ensomhed. Efter jeg blev uddannet, har jeg ikke meget kontakt med andre...”",
                fontSize = 20.sp,
                fontFamily = Skrifttype,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 28.sp
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Spørgsmål fra anonym, 25 år",
                fontSize = 12.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(24.dp))

            // SVAR
            Text(
                text = "Du er ikke alene. Mange oplever ensomhed efter store livsændringer. Det betyder ikke, at der er noget galt med dig – det betyder bare, at du er i en overgang.",
                fontSize = 16.sp,
                lineHeight = 24.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Relationer forsvinder nogle gange, når vores liv ændrer sig. Det kan føles som et tab, men det er også en mulighed for at skabe noget nyt – noget der passer bedre til den person, du er nu.",
                fontSize = 16.sp,
                lineHeight = 24.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Start småt. Du behøver ikke finde 'din nye vennegruppe' på én gang. Start med én person, én samtale, ét sted hvor du føler dig lidt tryg.",
                fontSize = 16.sp,
                lineHeight = 24.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Og vigtigst: vær blid mod dig selv. Ensomhed er ikke et tegn på svaghed – det er et tegn på, at du længes efter forbindelse. Og det er en styrke.",
                fontSize = 16.sp,
                lineHeight = 24.sp
            )
        }
    }
}