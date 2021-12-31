package com.client.soulstudio.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.client.soulstudio.data.repository.MainRepository
import com.client.soulstudio.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRep: MainRepository
) : ViewModel() {

    fun getBooks() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))

        try {
            //TODO Check for internet connection later...

            emit(Resource.success(data = mainRep.getBooks()))

        } catch (e: Exception) {
            emit(Resource.error(data = null, message = e.message ?: "Error Occurred!"))
        }
    }
}