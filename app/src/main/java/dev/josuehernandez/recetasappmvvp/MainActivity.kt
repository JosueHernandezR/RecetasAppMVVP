package dev.josuehernandez.recetasappmvvp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.josuehernandez.recetasappmvvp.ui.theme.RecetasAppMVVPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
                modifier = Modifier
                    .background(color = Color(color = 0xFFF2F2F2))
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                Image(
                    painterResource(R.drawable.happy_meal_small),
                    contentDescription = "",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop,
                )
                Column(
                    modifier = Modifier.padding(16.dp),
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Happy meal",
                            style = TextStyle(
                                fontSize = 26.sp
                            )
                        )
                        Text(
                            text = "$5.99",
                            color = Color(color = 0xFF85bb65),
                            style = TextStyle(
                                fontSize = 17.sp
                            ),
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "800 calories",
                        style = TextStyle(
                            fontSize = 17.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ){
                        Text(text = "ORDER NOW")
                    }
                }
            }
        }
    }
}

