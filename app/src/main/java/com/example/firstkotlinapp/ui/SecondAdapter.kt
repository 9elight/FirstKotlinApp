package com.example.firstkotlinapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.model.Shop
import kotlinx.android.synthetic.main.item_fourth_vh.view.*

class SecondAdapter(var list: List<Shop>, val listener: OnItemClickListener) :
    RecyclerView.Adapter<SecondAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fourth_vh, parent, false)
    )

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(currentShop: Shop) {
            itemView.shopName.text = currentShop.shopName
            itemView.shopAddress.text = currentShop.address
            itemView.purchase_time.text = currentShop.date.time.toString()
            itemView.setOnClickListener {
                listener.onItemClicked(currentShop)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClicked(item: Shop)
    }

}
