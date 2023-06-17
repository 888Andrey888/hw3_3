package com.example.hw3_3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.hw3_3.databinding.ViewItemBinding

class ViewAdapter : RecyclerView.Adapter<ViewAdapter.ViewViewHolder>() {
    private val itemList = ArrayList<String>()

    class ViewViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = ViewItemBinding.bind(item)
        fun bind(data: String) = with(binding) {
            tvName.text = data
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item, parent, false)
        return ViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun addItem(data: String) {
        itemList.add(data)
        notifyDataSetChanged()
    }
}