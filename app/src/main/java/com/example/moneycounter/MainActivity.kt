package com.example.moneycounter

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moneycounter.ui.theme.MoneyCounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoneyCounterTheme {
                // A surface container using the 'background' color from the theme
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp(){
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF546E7A)
        ){
            Box(contentAlignment = Alignment.Center) {
                CreateCircle()
            }
        }

}

//@Preview
@Composable
fun CreateCircle(){
    Card(modifier = Modifier
        .padding(3.dp)
        .size(85.dp)
        .clickable {
            Log.d("Tap", "CreateCircle: Tap ")
        },
    shape = CircleShape,
    elevation = 4.dp) {
        Box (contentAlignment = Alignment.Center){
            Text(text = "Tap")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MoneyCounterTheme {
        MyApp()
    }
}