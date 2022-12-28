package com.rsz.getapirickmorty.Api

import com.rsz.getapirickmorty.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

//Mengambil data character pada API
interface ApiService {
    @GET("character")
    fun getMorty() : Call<ResponseMorty>
}