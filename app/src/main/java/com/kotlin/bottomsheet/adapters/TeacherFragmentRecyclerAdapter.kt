package com.kotlin.bottomsheet.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bottomsheet.R
import com.kotlin.bottomsheet.view.holders.TeacherItemViewHolder

class TeacherFragmentRecyclerAdapter :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.teacher_fragment_item_layout,parent,false)
        return TeacherItemViewHolder(view)
    }

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }
}