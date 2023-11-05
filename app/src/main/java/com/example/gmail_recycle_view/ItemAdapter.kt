package com.example.gmail_recycle_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val mList: List<ItemViewModel>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemViewModel = mList[position]
        holder.usernameView.text = itemViewModel.username
        holder.timeView.text = itemViewModel.time
        holder.titleView.text = itemViewModel.title
        holder.contentView.text = itemViewModel.content

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//        val imageView : ImageView = itemView.findViewById(R.id.imageview)
        val usernameView : TextView = itemView.findViewById(R.id.username)
        val titleView : TextView = itemView.findViewById(R.id.title)
        val contentView : TextView = itemView.findViewById(R.id.content)
        val timeView : TextView = itemView.findViewById(R.id.time)
    }
}