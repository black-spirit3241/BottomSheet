package com.kotlin.bottomsheet.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlin.bottomsheet.R
import com.kotlin.bottomsheet.adapters.TeacherFragmentRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_teacher_layout.*

class TeacherFragment  : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_teacher_layout,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //setup Recyclerview
        rv_teachers.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        rv_teachers.adapter=TeacherFragmentRecyclerAdapter()
    }
}