package com.client.soulstudio.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.client.soulstudio.data.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class MainViewModel(
    private val mainRepository: MainRepository
) : ViewModel() {

}