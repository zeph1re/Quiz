package binar.ganda.quiz

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import binar.ganda.quiz.ui.theme.QuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Masukkan Umur?",
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 60.dp))

        var tahunlahir by remember { mutableStateOf("") }
        OutlinedTextField(
            value = tahunlahir,
            onValueChange = { tahunlahir = it },
            label = { Text("Umur") },
            maxLines = 1,
            textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(20.dp))

        var umur by remember { mutableStateOf("") }
        Button(
            onClick = {
                    umur = (2022 - tahunlahir.toInt()).toString()
            },
            modifier = Modifier
                .width(150.dp)
        ) {
            Text(text = "Hitung")
        }

        Text(text = "Umur Anda : $umur",
            fontSize = 12.sp)
    }


}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QuizTheme {
        Greeting("Android")
    }
}