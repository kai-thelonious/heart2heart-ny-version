package Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.heart2heart_ny_version.R

val mainColor = Color(0xFFF39FC2)

val OverskriftBG = FontFamily(
    Font(R.font.bricolage_grotesque_regular, FontWeight.Normal),
    Font(R.font.bricolage_grotesque_bold, FontWeight.Bold)
)

@Composable
fun MainScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier.padding(40.dp)
    ) {

        item {
            Text(
                text = "Brevkasse",
                color = Color.Black,
                fontSize = 48.sp,
                fontFamily = OverskriftBG,
                fontWeight = FontWeight.Bold
            )
        }

        item {
            Text(
                text = "Ugens ekspert",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = OverskriftBG,
                fontWeight = FontWeight.SemiBold
            )
        }

        item {
            ExpertCard(navController = navController, mainColor = mainColor)
        }
    }
}

@Composable
fun ExpertCard(navController: NavController, mainColor: Color) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(207.dp)
            .background(color = mainColor)
            .clickable {
                // Naviger til ExpertScreen når boksen trykkes
                navController.navigate("ExpertScreen")
            }
    ) {
        Row(
            Modifier.padding(24.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.linda_p),
                contentDescription = "Expert image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(width = 112.dp, height = 152.dp)
            )

            Column {
                Text("Linda P")
                Text("Lorem ipsum dolor sit lorem ipsum Lorem ipsum dolor sit lorem ipsum ")
            }
        }
    }
}