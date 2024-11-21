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
import com.example.multipledata.ui.view.screen.MahasiswaFormView
import com.example.multipledata.ui.view.screen.RencanaStudyView
import com.example.multipledata.ui.view.screen.SplashView
import com.example.multipledata.ui.view.viewmodel.MahasiswaViewModel
import com.example.multipledata.ui.view.viewmodel.RencanaStudyViewModel


enum class Halaman{
    Splash,
    Mahasiswa,
    MataKuliah,
    TampilKrs
}

@Composable

fun MahasiswaApp(
    modifier: Modifier = Modifier,
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    krsViewModel: RencanaStudyViewModel = viewModel(),
    RencanaStudyViewModel : RencanaStudyViewModel = viewModel(),
    navController : NavHostController = rememberNavController()
) {
    val mahasiswaUiState = mahasiswaViewModel.mahasiswaUiState.collectAsState().value
    val rencanaStudiUiState =
        RencanaStudyViewModel.krsStateUi.collectAsState().value

    NavHost(
        navController = navController,
        startDestination = Halaman.Splash.name,
        modifier = Modifier.padding()
    ) {
        composable(route = Halaman.Splash.name){
            SplashView(onMulaiButton = {
                navController.navigate(
                    Halaman.Mahasiswa.name
                )
            })
        }
        composable(route = Halaman.Mahasiswa.name) {
            MahasiswaFormView(
                onSubmitButtonClicked = {
                    mahasiswaViewModel.saveDataMahasiswa(it)
                    navController.navigate(Halaman.MataKuliah.name)},
                onBackButtonClicked = {navController.popBackStack()}
            )
        }
        composable(route = Halaman.MataKuliah.name) {
            RencanaStudyView(
                mahasiswa = mahasiswaUiState,
                onSubmitButtonClicked = {
                    krsViewModel.saveDataKRS(it)
                navController.navigate(Halaman.TampilKrs.name)
                                        },
                onBackButtonClicked = {
                    navController.popBackStack()
                }
            )
        }
        composable(route = Halaman.TampilKrs.name){
            TampilView(
                mahasiswa = mahasiswaUiState,
                krs = rencanaStudiUiState,

                onbuttonClicked = {
                    navController.popBackStack()
                },
                onResetButtonClicked = {
                    navController.navigate(Halaman.Splash.name)
                }

            )
        }

    }

}