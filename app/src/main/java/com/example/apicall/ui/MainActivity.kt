package com.example.apicall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.apicall.ViewModel.RecyclerViewModel
import com.example.apicall.model.Data
import com.example.apicall.ui.UserAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(RecyclerViewModel::class.java)

        viewModel.getPost()
        viewModel.responseLiveData.observe(this, Observer {

            Log.d("TOASTOFREC",it.toString())

            var data :MutableList<Data> =it.data as MutableList<Data>
            adapter = UserAdapter(data)
            recycler_view.adapter = adapter

            recycler_view.setHasFixedSize(true)
        })
    }
}