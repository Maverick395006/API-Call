package com.example.apicall.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apicall.R
import com.example.apicall.model.Data
//import com.example.apicall.model.Temp
import com.squareup.picasso.Picasso

class UserAdapter(private val user: MutableList<Data>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_data,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        var currentItem = user[position]

        holder.id.text = "ID:- ${currentItem.id.toString()}"
        holder.fname.text = "First Name:- ${currentItem.first_name.toString()}"
        holder.lname.text = "Last Name:- ${currentItem.last_name.toString()}"
        holder.email.text = "E-mail:- ${currentItem.email.toString()}"

//        Glide.with(context)
//            .load("${currentItem.avatar}")
//            .into(holder.avtar)

        Picasso.get().load("${currentItem.avatar}").into(holder.avtar)

    }

    override fun getItemCount(): Int {
        return user.size
    }

    inner class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var id: TextView = itemView.findViewById(R.id.id)
        var fname: TextView = itemView.findViewById(R.id.fname)
        var lname: TextView = itemView.findViewById(R.id.lname)
        var email: TextView = itemView.findViewById(R.id.email)
        var avtar: ImageView = itemView.findViewById(R.id.avtar)
    }
}