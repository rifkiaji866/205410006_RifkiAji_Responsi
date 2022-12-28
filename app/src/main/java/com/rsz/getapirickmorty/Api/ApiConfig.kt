package com.rsz.getapirickmorty.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Class untuk mengambil dan mengconvert API
object ApiConfig {

    //Deklarasi untuk mengambil url API yang digunakan
    const val baseUrl = "https://rickandmortyapi.com/api/"

    //Method getRetrofit untuk mengambil data API dari URL lalu di convert menjadi
    //file JSON yang dapat di baca oleh android studio
    fun getRetrofit() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //Method mengambil data yang telah di convert lalu diteruskan ke API Service
    fun getService() : ApiService{
        return getRetrofit().create(ApiService::class.java)
    }
}