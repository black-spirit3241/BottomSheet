package com.kotlin.bottomsheet.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlin.bottomsheet.R
import com.kotlin.bottomsheet.adapters.SeriesFragmentRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_series_layout.*

class SeriesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_series_layout,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_series.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        rv_series.adapter=SeriesFragmentRecyclerAdapter(context!!)
    }
}