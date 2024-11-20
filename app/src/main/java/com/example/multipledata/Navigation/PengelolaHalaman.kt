package com.example.multipledata.Navigation

import android.widget.MediaController
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.multipledata.ui.view.screen.SplashView
import com.example.multipledata.ui.view.viewmodel.MahasiswaViewModel


enum class Halaman{
    Splash,
    Mahasiswa
}

@Composable

fun MahasiswaApp(
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    navController : NavHostController = rememberNavController()
) {
    val mahasiswaUiState = mahasiswaViewModel.mahasiswaUiState.collectAsState().value

    NavHost(
        navController = navController,
        startDestination = Halaman.Splash.name,
        modifier = Modifier.padding()
    ) {
        composable(route = Halaman.Splash.name){
            SplashView(onMulai)
        }
    } //belum selesai

}