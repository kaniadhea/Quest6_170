package com.example.multipledata.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.multipledata.R


@Composable

fun SplashView(
    onMulaiButton : () -> Unit,
){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = colorResource(id = R.color.primary)),
        verticalArrangement = Arrangement.Center, //untuk mengatur logo umy agar kebawah
        horizontalAlignment = Alignment.CenterHorizontally //untuk mengatur logo nya agar kebawah

    ){
        Image(painter = painterResource(R.drawable.umy),
            contentDescription = "",
            modifier = Modifier.size(150.dp) //mengatur ukuran logo
        )

        Button(
            onClick = {
                onMulaiButton
            },
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp)
        ) {
            Text(text = "Mulai")
        }
    }
}

//viewmodel untuk menghubungkan antar view dengan model