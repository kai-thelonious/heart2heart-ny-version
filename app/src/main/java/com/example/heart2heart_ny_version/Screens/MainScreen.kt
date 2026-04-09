package com.example.heart2heart_ny_version.Screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.heart2heart_ny_version.R

//FARVER OG SKRIFTTYPER
val mainColor = Color(0xFFF39FC2)
val backgroundColor = Color(0xFFFEF8EC)
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
        modifier = Modifier
            .fillMaxSize()
            .background((backgroundColor))
            .padding(vertical = 40.dp, horizontal = 16.dp)

        ,
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

        item {
            PreviousExpertCard("Oprah", R.drawable.oprah) {
                navController.navigate("ArchiveScreen/oprah")
            }
        }
        item {
            PreviousExpertCard("Linda P", R.drawable.linda_p) {
                navController.navigate("ArchiveScreen/linda_p")
            }
        }
        item {
            PreviousExpertCard("Sofie Linde", R.drawable.sofie_linde) {
                navController.navigate("ArchiveScreen/sofie_linde")
            }
        }
        item {
            PreviousExpertCard("Hella Joof", R.drawable.hella_joof) {
                navController.navigate("ArchiveScreen/hella_joof")
            }
        }
        item {
            PreviousExpertCard("Michelle Obama", R.drawable.michelle_obama) {
                navController.navigate("ArchiveScreen/michelle_obama")
            }
        }
        item {
            PreviousExpertCard("Renée Toft Simonsen", R.drawable.renee_toft_simonsen) {
                navController.navigate("ArchiveScreen/renee_toft")
            }
        }
        item {
            PreviousExpertCard("Emma Holten", R.drawable.emma_holten) {
                navController.navigate("ArchiveScreen/emma_holten")
            }
        }
        item {
            PreviousExpertCard("Maria H", R.drawable.maria_h) {
                navController.navigate("ArchiveScreen/maria_h")
            }
        }
        item {
            PreviousExpertCard("Iben Hjejle", R.drawable.iben_hjejle) {
                navController.navigate("ArchiveScreen/iben_hjejle")
            }
        }
        item {
            PreviousExpertCard("Bodil Jørgensen", R.drawable.bodil_jorgensen) {
                navController.navigate("ArchiveScreen/bodil_jorgensen")
            }
        }

    }
}

@Composable
fun ExpertCard(navController: NavController, mainColor: Color) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(7.dp))
            .background(color = mainColor)
            .clickable {
                // Naviger til ExpertScreen når boksen trykkes
                navController.navigate("ExpertScreen")
            }
    ) {
        Row(
            Modifier.padding(0.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.puk_damsgard),
                contentDescription = "Expert image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(width = 140.dp, height = 200.dp)
            )
            Column(verticalArrangement = Arrangement.Center){
                Text(
                    text = "Puk Damsgård",
                    color = Color.Black,
                    fontSize = 22.sp,
                    fontFamily = Skrifttype,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 16.dp)
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "Med masser livserfaring, kan Puk hjælpe med alt fra hverdagsdilemmaer til store livsspørgsmål. ",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontFamily = Skrifttype,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 16.dp)
                )
            }
        }
    }
}

@Composable
fun PreviousExpertCard(text: String, @DrawableRes imageRes: Int, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(width = 168.dp, height = 136.dp)
            .clip(RoundedCornerShape(16.dp)) // Blødere, moderne hjørner
            .clickable { onClick() }
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = text,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )
        // Subtil mørk gradient i bunden for bedre læsbarhed af teksten
        Box(
            modifier = Modifier
                .matchParentSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.6f)),
                        startY = 60f
                    )
                )
        )
        Text(
            text = text,
            color = Color.White,
            fontFamily = Skrifttype,
            fontWeight = FontWeight.Medium,
            fontSize = 15.sp,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(horizontal = 12.dp, vertical = 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewComponent() {
    ExpertCard(navController = NavController(LocalContext.current), mainColor = mainColor)
}