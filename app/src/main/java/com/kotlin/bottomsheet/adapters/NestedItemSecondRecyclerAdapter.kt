package com.kotlin.bottomsheet.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bottomsheet.R
import com.kotlin.bottomsheet.view.holders.NestedItemSecondViewHolder

class NestedItemSecondRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.nested_recycler_item_second_layout,parent,false)
        return NestedItemSecondViewHolder(view)
    }

    override fun getItemCount(): Int =10

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }
}