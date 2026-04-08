package Screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.heart2heart_ny_version.R

val mainColor = Color(0xFFF39FC2)

val Skrifttype = FontFamily(
    Font(R.font.bricolage_grotesque_regular, FontWeight.Normal),
    Font(R.font.bricolage_grotesque_bold, FontWeight.Bold),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_semibold, FontWeight.SemiBold)
)

@Composable
fun MainScreen(navController: NavController) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(40.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        item(span = { GridItemSpan(maxLineSpan) }) {
            Text(
                text = "Brevkasse",
                color = Color.Black,
                fontSize = 48.sp,
                fontFamily = Skrifttype,
                fontWeight = FontWeight.Bold
            )
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
            Text(
                text = "Ugens ekspert",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = Skrifttype,
                fontWeight = FontWeight.SemiBold
            )
        }


        item(span = { GridItemSpan(maxLineSpan) }) {
            ExpertCard(navController = navController, mainColor = mainColor)
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
            Spacer(modifier = Modifier.height(8.dp)) // Mere mellemrum imellem boks og næste overskrift (Tidligere eksperter)
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
            Text(
                text = "Tidligere eksperter",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = Skrifttype,
                fontWeight = FontWeight.SemiBold
            )
        }

        item { PreviousExpertCard("Ask Oprah!", R.drawable.oprah) }
        item { PreviousExpertCard("Expert 2", R.drawable.linda_p) }
        item { PreviousExpertCard("Expert 3", R.drawable.sofie_linde) }
        item { PreviousExpertCard("Expert 4", R.drawable.hella_joof) }
        item { PreviousExpertCard("Ask Oprah!", R.drawable.oprah) }
        item { PreviousExpertCard("Expert 2", R.drawable.linda_p) }
        item { PreviousExpertCard("Expert 3", R.drawable.sofie_linde) }
        item { PreviousExpertCard("Expert 4", R.drawable.hella_joof) }
        item { PreviousExpertCard("Expert 3", R.drawable.sofie_linde) }
        item { PreviousExpertCard("Expert 4", R.drawable.hella_joof) }

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
                Text(
                    text = "Linda P",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontFamily = Skrifttype,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "Lorem ipsum dolor sit lorem ipsum Lorem ipsum dolor sit lorem ipsum",
                    color = Color.Black,
                    fontSize = 12.sp,
                    fontFamily = Skrifttype,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}

@Composable
fun PreviousExpertCard(text: String, @DrawableRes imageRes: Int) {
    Box(
        modifier = Modifier
            .size(width = 168.dp, height = 136.dp)
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "oprah",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )
        Spacer(
            modifier = Modifier
                .size(width = 168.dp, height = 136.dp)
                .background(
                    brush = Brush.verticalGradient(
                        0.48f to Color(0x00000000), // 48% stop: Fully Transparent Black
                        0.88f to Color(0xFF1C1C1C)  // 88% stop: Fully Opaque Dark Gray
                    )
                )
        )
        Text(
            text = text,
            color = Color.White,
            fontFamily = Skrifttype,
            fontWeight = FontWeight.Normal,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun PreviewComponent() {
//    PreviousExpertCard()
//}