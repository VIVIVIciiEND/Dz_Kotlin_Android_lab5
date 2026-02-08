package com.example.dz_kotlin_android_studio_lab5

import android.icu.text.CaseMap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dz_kotlin_android_studio_lab5.ui.theme.Dz_Kotlin_Android_Studio_lab5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Preview
@Composable
fun MainScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleBlock()
        ColorRow()
        CombinedBlock()
    }
}
@Composable
fun TitleBlock(){
    Column{
        Text(
            text= "ww",
            fontSize = 20.sp,
            letterSpacing = 2.sp
        )
        Text(
            text ="rr" ,
            fontSize = 20.sp,
            letterSpacing = 2.sp
        )
    }
}
@Composable
fun ColorRow(){
    Row(
        horizontalArrangement = Arrangement.Center
    ){
        ColorBox(Color(0xFFD900FF))
        ColorBox(Color(0x81CA77ED))
        ColorBox(Color(0xFF00CDD4))
    }
}
@Composable
fun ColorBox(color: Color){
    Box(
        modifier = Modifier
            .size(40.dp)
            .background(color)
    )
}
@Composable
fun CombinedBlock(){
    Column(
        modifier = Modifier
            .padding( 12.dp)
            .width(100.dp)
            .background(Color(0xFF2FFF00))
    ) {
        Text(text ="ww")
        Row(
            horizontalArrangement = Arrangement.Center
        ){
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .background(Color(0xFF0090FF))
            )
            Column{
                Text(text = "+")
            }
        }
    }
}





