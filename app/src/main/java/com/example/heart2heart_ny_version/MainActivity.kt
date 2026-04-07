package com.example.heart2heart_ny_version

import android.R.color.white
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.text.font.FontWeight.Companion.Light
import androidx.compose.ui.text.font.FontWeight.Companion.Medium
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.heart2heart_ny_version.ui.theme.Heart2heartnyversionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //Navigation()
            MainFun()
        }
    }
}

val mainColor = Color(0xFFF39FC2)
val OverskriftBG = FontFamily(
    Font(R.font.bricolage_grotesque_extralight, FontWeight.ExtraLight),
    Font(R.font.bricolage_grotesque_light, FontWeight.Light),
    Font(R.font.bricolage_grotesque_regular, FontWeight.Normal),
    Font(R.font.bricolage_grotesque_medium, FontWeight.Medium),
    Font(R.font.bricolage_grotesque_semibold, FontWeight.SemiBold),
    Font(R.font.bricolage_grotesque_bold, FontWeight.Bold),
    Font(R.font.bricolage_grotesque_extrabold, FontWeight.ExtraBold)
)

// val mainColor =

@Composable
fun MainFun() {
    LazyColumn(
        modifier = Modifier
            .padding(40.dp),

        ) {
        item() {
            Text(
                modifier = Modifier,
                text = "Brevkasse",
                color = Color.Black,
                fontSize = 48.sp,
                fontFamily = OverskriftBG,
                fontWeight = FontWeight.Bold
            )

        }
        item() {
            Text(
                modifier = Modifier,
                text = "Ugens ekspert",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = OverskriftBG,
                fontWeight = FontWeight.SemiBold
            )
        }
        item() {

            ExpertOfTheWeekCard()
        }
    }


}
@Composable
fun ExpertOfTheWeekCard() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(207.dp)
            .background(color = mainColor)
            .clickable { /* Action */ }
    ) {
        Row(
            Modifier.padding(24.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),

        ) {

            Image(
                painter = painterResource(id = R.drawable.linda_p),
                contentDescription = "Picture of this week's expert", // Important for screen readers
                contentScale = ContentScale.Crop,
                modifier = Modifier.requiredSize(width = 112.dp, height = 152.dp)
            )
            Column() {
                // Header
                Text("Linda P")

                // Description
                Text("Lorem ipsum dolor sit lorem ipsum Lorem ipsum dolor sit lorem ipsum ")
            }
        }
    }
}

@Composable
fun PreviousExpertCard() {
    Box(
        modifier = Modifier
            .size(width = 168.dp, height = 136.dp)
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.oprah),
            contentDescription = "oprah", // Background images are usually decorative
            contentScale = ContentScale.Crop, // This makes the image fill the area
            modifier = Modifier.matchParentSize() // Important: matches the Box size
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
            text = "Ask Oprah!",
            color = Color.White,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewComponent() {
    PreviousExpertCard()
}

//@Preview(showBackground = true)
//@Composable
//fun MainPreview() {
//    MainFun()
//}