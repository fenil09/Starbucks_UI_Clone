package com.base.starbucks_ui_clone

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.base.starbucks_ui_clone.ui.theme.Starbucks_UI_CloneTheme
import java.util.Timer
import kotlin.concurrent.schedule

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Starbucks_UI_CloneTheme {
                SplashScreen()
            }
        }
    }
}



@Composable
fun SplashScreen(
    modifier: Modifier=Modifier
){

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
            .background(Color.White)
    ){
        Image(
            painter = painterResource(R.drawable.starbucks),
            contentDescription = "splashscrenimage",
            modifier=modifier.size(200.dp)
        )

    }
    val context= LocalContext.current
    val intent= Intent(context,Home::class.java)
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
    val timer=Timer()
    timer.schedule(2000){
        context.startActivity(intent)
    }
}

