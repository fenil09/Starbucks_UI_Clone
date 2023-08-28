package com.base.starbucks_ui_clone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.base.starbucks_ui_clone.ui.theme.Starbucks_UI_CloneTheme

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Starbucks_UI_CloneTheme {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                        .background(Color.White)
                ) {
                    TopSection()
                }
            }
        }
    }
}

@Composable
fun TopSection(
    modifier: Modifier=Modifier
){
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier.fillMaxWidth()
            .padding(top=35.dp)


    ){
        Image(
            painter = painterResource(R.drawable.baseline_filter_list_24),
            contentDescription = "Filters",
            modifier=modifier.size(25.dp)
        )
        Image(
         painter= painterResource(R.drawable.starbucks),
            contentDescription = "Logo",
            modifier=modifier.size(45.dp)
        )

        Image(
            painter= painterResource(R.drawable.baseline_shopping_bag_24),
            contentDescription = "Shopping",
            modifier=modifier.size(25.dp)
        )
    }
}




