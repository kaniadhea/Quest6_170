package com.example.multipledata.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multipledata.R
import com.example.multipledata.model.Mahasiswa
import com.example.multipledata.model.RencanaStudi
import java.lang.reflect.Modifier

@Composable

fun TampilView(
    mahasiswa: Mahasiswa,
    krs: RencanaStudi,
    onBackButtonClicked: ()-> Unit,
    onResetButtonClicked: ()-> Unit,
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.primary)),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.papding(top = 16.dp))
        Row (
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.umy),
                contentDescription = "umy"
            )
            Spacer(modifier = Modifier.padding(start = 16.dp))
            Column {
                Text(text = "Data KRS Mahasiswa",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
                Text(text = "Universitas Muhammadiyah Yogyakarta",
                    color = Color.White,
                    fontWeight = FontWeight.Light
                )
            }
        }
        Column (modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Column {
                    Text(text = "Nim",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}