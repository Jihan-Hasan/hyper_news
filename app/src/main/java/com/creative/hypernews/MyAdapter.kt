package com.creative.hypernews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val news : ArrayList<Model>):RecyclerView.Adapter<MyAdapter.ViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.news_card,parent,false)

        return MyAdapter.ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
       val currenItem = news[position]
        holder.title.text = currenItem.title
        holder.description.text = currenItem.description
    }

    override fun getItemCount(): Int {
        return news.size
    }

    class ViewHolder ( itemView : View) : RecyclerView.ViewHolder(itemView) {

        val title : TextView = itemView.findViewById(R.id.Title)
        val description : TextView = itemView.findViewById(R.id.description)
    }
}