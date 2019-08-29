package com.jeyabalaji.cat_communicator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jeyabalaji.cat_communicator.R

class DataAdapter(val userList: ArrayList<Model>, context : Context) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {
    val context:Context = context

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup?.context).inflate(R.layout.adapter_item_layout, viewGroup, false)
        return ViewHolder(v);
    }
    override fun getItemCount(): Int {
        return userList.size
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        Glide.with(context).load(userList[position].imageId).into(viewHolder.image)
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.thumbnail)

    }
}