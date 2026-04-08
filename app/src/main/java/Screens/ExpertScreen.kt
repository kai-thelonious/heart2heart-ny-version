package Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.heart2heart_ny_version.R

private val Pink100 = Color(0xFFFFD6E0)
private val Pink200 = Color(0xFFFFC1D0)
private val BubbleShape = RoundedCornerShape(16.dp)

@Composable
fun ExpertScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Spacer(Modifier.height(30.dp))

        BackButton { navController.popBackStack() }

        Spacer(Modifier.height(16.dp))

        // User message
        ChatBubble(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            color = Pink100,
            modifier = Modifier.fillMaxWidth(0.8f),
            fontStyle = FontStyle.Italic
        )

        Spacer(Modifier.height(16.dp))

        // Expert reply
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.linda_p_rw),
                contentDescription = "Avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray)
            )
            Spacer(Modifier.width(20.dp))
            ChatBubble(
                text = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat",
                color = Pink200,
                modifier = Modifier.widthIn(max = 440.dp)
            )
        }

        Spacer(Modifier.height(16.dp))

        // User message
        ChatBubble(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat",
            color = Pink100,
            modifier = Modifier.fillMaxWidth(0.8f),
            fontStyle = FontStyle.Italic
        )

        Spacer(Modifier.height(16.dp))

        // Expert reply
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.linda_p_rw),
                contentDescription = "Avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray)
            )
            Spacer(Modifier.width(20.dp))
            ChatBubble(
                text = "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.",
                color = Pink200,
                modifier = Modifier.widthIn(max = 440.dp)
            )
        }
    }
}

@Composable
private fun BackButton(onClick: () -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(bottom = 24.dp)
    ) {
        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
        Spacer(Modifier.width(8.dp))
        Text("Back", fontSize = 18.sp)
    }
}

@Composable
private fun ChatBubble(
    text: String,
    color: Color,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal
) {
    Box(
        modifier = modifier
            .clip(BubbleShape)
            .background(color)
            .padding(16.dp)
    ) {
        Text(text, fontSize = 16.sp, fontStyle = fontStyle)
    }
}