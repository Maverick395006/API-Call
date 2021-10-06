package com.example.apicall.network

import com.example.apicall.model.Temp
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface JsonApi {

//    https://reqres.in/api/users?page=2

    @GET("api/users?page=2")
    fun user(): Call<Temp>

    companion object {
        val BASE_URL="https://reqres.in/"
        operator fun invoke():JsonApi {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(JsonApi::class.java)
        }
    }



////    https://fakestoreapi.com/products
//
//    @GET("products")
//    fun user(): Call<Temp>
//
//    companion object {
//        val BASE_URL="https://fakestoreapi.com/"
//        operator fun invoke():JsonApi {
//            return Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//                .create(JsonApi::class.java)
//        }
//    }
}