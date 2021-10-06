package com.example.apicall.repositories

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.apicall.model.Temp
import com.example.apicall.network.JsonApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserRepository {
    fun recyclerData(): MutableLiveData<Temp> {
        val recResponce = MutableLiveData<Temp>()

        JsonApi().user().enqueue(object : Callback<Temp> {
            override fun onResponse(call: Call<Temp>, response: Response<Temp>) {
                recResponce.value = response.body()
                Log.d("Done",response.body().toString())
            }

            override fun onFailure(call: Call<Temp>, t: Throwable) {
                Log.d("Fault","Error",t)
            }

        })
        return recResponce

    }

}