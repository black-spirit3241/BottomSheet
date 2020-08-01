package com.kotlin.bottomsheet.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bottomsheet.R
import com.kotlin.bottomsheet.view.holders.NestedItemViewHolder

class NestedItemRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.nested_recycler_item_first_layout,parent,false)
        return NestedItemViewHolder(view)
    }

    override fun getItemCount(): Int =10

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

}