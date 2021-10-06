package com.example.apicall.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.apicall.model.Temp
import com.example.apicall.repositories.UserRepository

class RecyclerViewModel: ViewModel() {

    var responseLiveData = MutableLiveData<Temp>()

    fun getPost() {
        responseLiveData = UserRepository().recyclerData()
    }
}