package com.akaiyukiusagi.flexboxsmaple

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlexboxListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val itemName: TextView = view.findViewById(R.id.item_name)
}