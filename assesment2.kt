package com.example.androidproject

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidproject.ui.theme.AndroidProjectTheme

class assesment2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    ImageCard(painter = painterResource(id = R.drawable.house), contentDescription = "house")
                }
            }
        }
    }
}
@Composable
fun ImageCard(painter: Painter,contentDescription:String,modifier: Modifier = Modifier){
    Card ( modifier = Modifier.fillMaxWidth())
    {
        Box (modifier = Modifier.height(200.dp), contentAlignment = Alignment.BottomStart)
        {
//            Image(painter = painter, contentDescription = contentDescription)
            androidx.compose.foundation.Image(painter = painter, contentDescription = contentDescription)
            Box (modifier = Modifier
                .matchParentSize(),
                contentAlignment = Alignment.TopCenter) {
                Text(text = "Wanderly",
                    color = Color.White)
                Text(text = "Your Ultimate companion for seamless Travel experiences")
//button box section
                Box (modifier = Modifier.matchParentSize(), contentAlignment = Alignment.BottomCenter) {
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth())
                    {
                        Text(text = "Sign in With Phone Number",modifier = Modifier.padding(2.dp))
                    }
//                button 2
                    Box (modifier = Modifier
                        .matchParentSize()
                        .padding(10.dp)) {
                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .fillMaxWidth())
                        {
                            Text(text = "Sign in with Apple", modifier = Modifier.padding(2.dp))
                        }
                    }
                }

            }
        }
    }
}

@Preview
@Composable
fun Card2Preview(){
    ImageCard()

}
