package com.client.soulstudio.data.api

import com.client.soulstudio.data.model.Books
import retrofit2.http.GET

interface ApiService {

    @GET("volumes?q=flowers&startIndex=0&maxResults=10")
    suspend fun getBooks(): Books

}