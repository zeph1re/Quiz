package binar.ganda.quiz

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import binar.ganda.quiz.ui.theme.QuizTheme

class SplashScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String) {

    Column(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "img",
            modifier = Modifier.size(300.dp)
            )
    }

    val context = LocalContext.current
    context.startActivity(Intent(context, MainActivity::class.java))


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    QuizTheme {
        Greeting2("Android")
    }
}