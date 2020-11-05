package com.akaiyukiusagi.flexboxsmaple

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FlexboxAdapter : RecyclerView.Adapter<FlexboxListViewHolder>() {

    private val items = ArrayList<FlexboxItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlexboxListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return FlexboxListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: FlexboxListViewHolder, position: Int) {
        val item = items[position]
        holder.itemName.text = item.name
    }

    fun setItems(items: List<FlexboxItem>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }
}