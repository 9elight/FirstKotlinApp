package com.example.firstkotlinapp.ui

import android.graphics.Color
import android.graphics.ColorFilter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.model.Purchase
import kotlinx.android.synthetic.main.item_viewholder.view.*

class Adapter(var items: List<Purchase>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
            = ViewHolder(LayoutInflater.from(parent.context)
        .inflate(R.layout.item_viewholder,parent,false))

    override fun getItemCount(): Int =  items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
        for (i in 0 until itemCount step 2 ){
            if (holder.adapterPosition == i){
                holder.itemView.setBackgroundColor(Color.GREEN)
                holder.itemView.number.setTextColor(Color.WHITE)
                holder.itemView.title.setTextColor(Color.WHITE)
                holder.itemView.price.setTextColor(Color.WHITE)
                holder.itemView.discount.setTextColor(Color.WHITE)
                holder.itemView.final_price.setTextColor(Color.WHITE)
            }
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(purchase: Purchase) {
            itemView.number.text = purchase.number.toString()
            itemView.title.text = purchase.title
            itemView.price.text = purchase.price.toString()
            itemView.discount.text = purchase.discount.toString()
            itemView.final_price.text = purchase.final_price.toString()
        }

    }
}
