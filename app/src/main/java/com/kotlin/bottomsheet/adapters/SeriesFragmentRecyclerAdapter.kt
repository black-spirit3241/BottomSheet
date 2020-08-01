package com.kotlin.bottomsheet.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bottomsheet.R
import com.kotlin.bottomsheet.view.holders.NestedItemSecondViewHolder
import com.kotlin.bottomsheet.view.holders.NestedItemViewHolder
import com.kotlin.bottomsheet.view.holders.SeriesItemViewHolder
import kotlinx.android.synthetic.main.series_fragment_fourth_view_layout.view.*
import kotlinx.android.synthetic.main.series_fragment_second_view_layout.view.*

class SeriesFragmentRecyclerAdapter(context: Context) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        const val VT_FIRST = 0
        const val VT_SECOND = 1
        const val VT_THIRD = 2
        const val VT_FOURTH = 3
    }
     var application: Context = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View
        when (viewType) {
            VT_FIRST -> {
                view = inflater.inflate(R.layout.series_fragment_first_view_layout, parent, false)
                return SeriesItemViewHolder(view)
            }
            VT_SECOND -> {
                view = inflater.inflate(R.layout.series_fragment_second_view_layout, parent, false)
                return NestedItemViewHolder(view)
            }
            VT_THIRD -> {
                view = inflater.inflate(R.layout.series_fragment_second_view_layout, parent, false)
                return NestedItemViewHolder(view)
            }
            VT_FOURTH -> {
                view = inflater.inflate(R.layout.series_fragment_fourth_view_layout, parent, false)
                return NestedItemSecondViewHolder(view)
            }
            else -> {
                view = inflater.inflate(R.layout.series_fragment_first_view_layout, parent, false)
                return SeriesItemViewHolder(view)
            }

        }
    }

    override fun getItemCount(): Int = 4

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (position) {
            VT_SECOND -> {
                (holder as NestedItemViewHolder).itemView.rv_nested.layoutManager =
                    LinearLayoutManager(application,LinearLayoutManager.HORIZONTAL,false)
                holder.itemView.rv_nested.adapter=NestedItemRecyclerAdapter()
            }
            VT_THIRD ->{
                (holder as NestedItemViewHolder).itemView.rv_nested.layoutManager =
                    LinearLayoutManager(application,LinearLayoutManager.HORIZONTAL,false)
                holder.itemView.tv_nestedTextView.text="New on simple habit"
                holder.itemView.rv_nested.adapter=NestedItemRecyclerAdapter()
            }
            VT_FOURTH->{
                (holder as NestedItemSecondViewHolder).itemView.rv_all_topics.layoutManager=
                    LinearLayoutManager(application,LinearLayoutManager.VERTICAL,false)
                holder.itemView.rv_all_topics.adapter=NestedItemSecondRecyclerAdapter()
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        var itemViewType = 1
        if (position == 0)
            itemViewType = VT_FIRST
        when (position) {
            0 -> itemViewType = VT_FIRST
            1 -> itemViewType = VT_SECOND
            2 -> itemViewType = VT_THIRD
            3 -> itemViewType = VT_FOURTH
        }
        return itemViewType
    }
}