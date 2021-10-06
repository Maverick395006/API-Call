package com.example.apicall.model

data class Temp(
    val data: List<Data>,
    val total: Int
)

data class Data(
    val avatar: String,
    val email: String,
    val first_name: String,
    val id: Int,
    val last_name: String
)

//data class Temp(
//    val id: Int,
//    val title: String,
//    val description: String,
//    val category: String,
//    val image: String
//)