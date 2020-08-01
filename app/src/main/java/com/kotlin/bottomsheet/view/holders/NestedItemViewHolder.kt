package com.kotlin.bottomsheet.view.holders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bottomsheet.R

class NestedItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tv_title: TextView
        get() {
            return itemView.findViewById<TextView>(R.id.tv_nestedTextView)
        }

    val rv_nestedView: RecyclerView
        get() {
            return itemView.findViewById(R.id.rv_nested)
        }

}