package com.example.heart2heart_ny_version.Screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
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
val mainColor = Color(0x59F39FC2)
val backgroundColor = Color(0xFFF8E1D0)
val cardBackgroundColor = Color(0xFFFDCBA6)
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
    val solidMain = Color(0xFFF39FC2)
    
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(32.dp),
        colors = CardDefaults.cardColors(containerColor = cardBackgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        border = BorderStroke(1.dp, solidMain.copy(alpha = 0.2f))
    ) {
        Column(
            modifier = Modifier
                .clickable { navController.navigate("ExpertScreen") }
                .padding(24.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Surface(
                        color = solidMain,
                        shape = RoundedCornerShape(50)
                    ) {
                        Text(
                            text = "UGENS EKSPERT",
                            color = Color.White,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Skrifttype,
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                            letterSpacing = 1.sp
                        )
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Puk Damsgård",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Skrifttype,
                        color = Color(0xFF2D2D2D)
                    )
                    Text(
                        text = "Korrespondent & Forfatter",
                        fontSize = 14.sp,
                        fontFamily = Skrifttype,
                        color = Color.Gray,
                        fontWeight = FontWeight.Medium
                    )
                }

                Image(
                    painter = painterResource(id = R.drawable.puk_damsgard),
                    contentDescription = "Puk Damsgård",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(90.dp)
                        .clip(RoundedCornerShape(20.dp))
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Puk er kendt for sin utrolige evne til at finde menneskelighed i verdens brændpunkter. Hendes svar i brevkassen bærer præg af en dyb kærlighed til mennesket og en ukuelig tro på resiliens.",
                fontSize = 15.sp,
                lineHeight = 22.sp,
                fontFamily = Skrifttype,
                color = Color(0xFF4A4A4A)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Specialties section with flair
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                ExpertTrait(
                    icon = Icons.Default.Favorite,
                    title = "Mod",
                    color = solidMain
                )
                ExpertTrait(
                    icon = Icons.Default.Face,
                    title = "Livsvisdom",
                    color = Color(0xFFB8E0D2)
                )
                ExpertTrait(
                    icon = Icons.Default.Info,
                    title = "Nærvær",
                    color = Color(0xFFEAC4D5)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Action section
            Surface(
                color = Color(0xFFE8E8E8),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Se Puks svar & stil et spørgsmål",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = Skrifttype,
                        color = Color(0xFF2D2D2D)
                    )
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = null,
                        tint = Color.Black
                    )
                }
            }
        }
    }
}

@Composable
fun ExpertTrait(icon: ImageVector, title: String, color: Color) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(color.copy(alpha = 0.15f), RoundedCornerShape(12.dp))
            .padding(horizontal = 10.dp, vertical = 6.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = color,
            modifier = Modifier.size(14.dp)
        )
        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = title,
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = Skrifttype,
            color = Color(0xFF4A4A4A)
        )
    }
}

@Composable
fun PreviousExpertCard(text: String, @DrawableRes imageRes: Int, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(width = 168.dp, height = 168.dp)
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
