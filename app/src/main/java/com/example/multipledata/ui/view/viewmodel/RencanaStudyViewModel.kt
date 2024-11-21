package com.example.multipledata.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.multipledata.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RencanaStudyViewModel: ViewModel () {
    private val _krsState = MutableStateFlow(RencanaStudi())

    val krsStateUi : StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan : String) {

    }
}