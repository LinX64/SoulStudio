package com.client.soulstudio.data.repository

import com.client.soulstudio.data.api.ApiService
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getBooks() = apiService.getBooks()
}