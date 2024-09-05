package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                ArtSpaceApp()
            }
        }
    }
}

@Composable
fun ArtSpace(
    @DrawableRes painting: Int,
    art: String,
    artist: String,
    year: String,
    onButtonPressedPrev: () -> Unit,
    onButtonPressedNext: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(30.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                elevation = CardDefaults.cardElevation(20.dp),
                colors = CardDefaults.cardColors(colorResource(R.color.white)),
                shape = RectangleShape
            ) {
                Image(
                    painter = painterResource(painting),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .height(400.dp)
                        .width(300.dp)
                        .background(Color.White)
                        .padding(30.dp)
                )
            }

            Spacer(modifier = Modifier.height(50.dp))
            Column(
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(12.dp)
                    .width(350.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = art,
                    fontWeight = FontWeight.Light,
                    fontSize = 24.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row {
                    Text(
                        text = (artist),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                    )
                    Text(
                        text = (" ($year)"),
                        fontWeight = FontWeight.Light,
                        fontSize = 16.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(50.dp))
            Row(
                modifier = Modifier
            ) {
                Button(
                    onClick = onButtonPressedPrev,
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = stringResource(R.string.prev),
                    )
                }
                Spacer(modifier.width(40.dp))
                Button(
                    onClick = onButtonPressedNext,
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = stringResource(R.string.next),
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ArtSpaceApp() {
    var order by remember { mutableIntStateOf(0) }
    var description by remember { mutableIntStateOf(0) }

    when(order) {
        0 -> ArtSpace(
            painting = R.drawable.android__berlin_wall_,
            art = stringResource(R.string.berliner_android_title),
            artist = stringResource(R.string.author_dalle),
            year = stringResource(R.string.twentytwentyone),
            onButtonPressedPrev = {
                if(order == 0 && description == 0) {
                    order = 3
                    description = 3
                } else {
                    order--
                    description--
                }
            },
            onButtonPressedNext = {
                if(order == 3 && description == 3) {
                    order = 0
                    description = 0
                } else {
                    order++
                    description++
                }
            }
        )
        1 -> ArtSpace(
            painting = R.drawable.android__happy_party_animal_,
            art = stringResource(R.string.party_animal_android_title),
            artist = stringResource(R.string.author_dalle),
            year = stringResource(R.string.twentytwentytwo),
            onButtonPressedPrev = {
                if(order == 0 && description == 0) {
                    order = 3
                    description = 3
                } else {
                    order--
                    description--
                }
            },
            onButtonPressedNext = {
                if(order == 3 && description == 3) {
                    order = 0
                    description = 0
                } else {
                    order++
                    description++
                }
            }
        )
        2 -> ArtSpace(
            painting = R.drawable.android__humble_,
            art = stringResource(R.string.humble_android_title),
            artist = stringResource(R.string.author_dalle),
            year = stringResource(R.string.twentytwentythree),
            onButtonPressedPrev = {
                if(order == 0 && description == 0) {
                    order = 3
                    description = 3
                } else {
                    order--
                    description--
                }
            },
            onButtonPressedNext = {
                if(order == 3 && description == 3) {
                    order = 0
                    description = 0
                } else {
                    order++
                    description++
                }
            }
        )
        3 -> ArtSpace(
            painting = R.drawable.android__snowflake_,
            art = stringResource(R.string.snowflake_android_title),
            artist = stringResource(R.string.author_dalle),
            year = stringResource(R.string.twentytwentythree),
            onButtonPressedPrev = {
                if(order == 0 && description == 0) {
                    order = 3
                    description = 3
                } else {
                    order--
                    description--
                }
            },
            onButtonPressedNext = {
                if(order == 3 && description == 3) {
                    order = 0
                    description = 0
                } else {
                    order++
                    description++
                }
            }
        )
    }
}

