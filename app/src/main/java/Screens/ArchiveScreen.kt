package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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

// funktion til spørgsmålsboksene
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

//funktion til eksperten
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


        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text(
                    text = "Spørgsmål til Oprah",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(bottom = 8.dp, top = 10.dp)
                )
            }
            // ekspert intro
            item {
                ExpertBox(
                    name = "Oprah",
                    description = "Ekspert i personlig udvikling og selvværd",
                    mainColor = Color(0xFFF39FC2),
                    imageRes = R.drawable.oprah
                )}

            // spørgsmål
            item {
                SimpleExpertBox(
                    name = "Ensomhed i 20'erne",
                    description = "Hej Oprah. Kæmpe fan btw. Jeg er en pige i 20'erne som struggler meget med ensomhed. Efter jeg blev ...",
                    mainColor = Color(0xFFE6E6E6), // vælg farve som ønsket
                            onClick = { navController.navigate("ExpertAnswer")
                            })
            }

            item {
                SimpleExpertBox(
                    name = "Pres fra sociale medier",
                    description = "Der er mange af pigerne fra min klasse, som lægger opslag ud hvor de bare ser mega mega godt ud, og ...",
                    mainColor = Color(0xFFE6E6E6),
                    onClick = {
                        navController.navigate("ExpertAnswer")
                    })

            }

            item {
                SimpleExpertBox(
                    name = "Hvilket gym skal jeg vælge?",
                    description = "Alle pigerne fra min klasse har søgt ind på Gefion, men jeg vil rigtig gerne gå på det fri - hvad skal jeg gøre??! ...",
                    mainColor = Color(0xFFE6E6E6),
                    onClick = {
                        navController.navigate("ExpertAnswer")
                    })

            }
            item {
                SimpleExpertBox(
                    name = "Håbløst forelsket",
                    description = "Hejsaaa! Der er en fra min klasse som jeg har det største crush på. Men jeg tror ikke han overhoved ved hvem ...",
                    mainColor = Color(0xFFE6E6E6),
                    onClick = {
                        navController.navigate("ExpertAnswer")
                    })

            }
            item {
                SimpleExpertBox(
                    name = "Mine venner er der ikke for mig",
                    description = "Jeg har mange venner, men jeg synes virkelig ikke de tjekker op på mig. Det gør mig virkelig ked af det, fordi ...",
                    mainColor = Color(0xFFE6E6E6),
                    onClick = {
                        navController.navigate("ExpertAnswer")
                    })

            }
            item {
                SimpleExpertBox(
                    name = "Hvornår kommer man sig over sin eks?",
                    description = "Mig og min eks gik fra hinanden for 6 måneder siden, og jeg er stadig ikke ovre ham. Jeg drømmer ofte om ...",
                    mainColor = Color(0xFFE6E6E6),
                    onClick = {
                        navController.navigate("ExpertAnswer")
                    })

            }
        }}}
