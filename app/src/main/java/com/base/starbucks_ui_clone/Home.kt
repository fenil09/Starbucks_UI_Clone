package com.base.starbucks_ui_clone

import android.graphics.drawable.shapes.OvalShape
import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.base.starbucks_ui_clone.ui.theme.Starbucks_UI_CloneTheme

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Starbucks_UI_CloneTheme {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                ) {
                    TopSection()
                    Spacer(modifier = Modifier.height(50.dp))
                    Text(text = "Our Way Of" + "\n" + "Loving You Back",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                        modifier = Modifier.padding(end = 135.dp)
                    )
                    Spacer(modifier = Modifier.height(50.dp))
                    SearchBox(modifier = Modifier)
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
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 35.dp)


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


@Composable
fun SearchBox(modifier:Modifier,){
    val hexcolor="00704A"

    Box(
        modifier= modifier
            .width(300.dp)
            .height(60.dp)
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(25.dp)
            )
    ){
          Row(
              modifier = Modifier.fillMaxWidth(),
              verticalAlignment = Alignment.CenterVertically
          ){
              Image(
                  painterResource(id = R.drawable.baseline_search_241),
                  contentDescription = null,
                  modifier= modifier
                      .size(50.dp)
                      .padding(start = 5.dp, top = 5.dp)
              )
              Spacer(modifier = modifier.width(20.dp))
              Text(text = "Search",
                  color = Color.Green,
                  fontSize = 25.sp
                  )
          }
    }
}



