package com.kotlin.bottomsheet.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.kotlin.bottomsheet.R
import kotlinx.android.synthetic.main.bottom_sheet_layout.*
import kotlinx.android.synthetic.main.fragment_go_layout.*

class GoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_go_layout,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bottomSheetBehavior=BottomSheetBehavior.from(bottom_sheet)

        btn_show_bottom_sheet.setOnClickListener {
            if(bottomSheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED){
                bottomSheetBehavior.state=BottomSheetBehavior.STATE_EXPANDED
                btn_show_bottom_sheet.text="Close Sheet"
            }else{
                bottomSheetBehavior.state=BottomSheetBehavior.STATE_COLLAPSED
                btn_show_bottom_sheet.text="Show Sheet"
            }
        }


        //dialog
        btn_show_dialog.setOnClickListener {
            val dialog= activity?.let { activity -> BottomSheetDialog(activity) }
            val view=layoutInflater.inflate(R.layout.bottom_sheet_layout,null)
            dialog?.setContentView(view)
            dialog?.show()
        }

        //dialog Fragment
        btn_show_fragment.setOnClickListener {
            val fragment=BottomSheetFragment()
           // fragment.show(activity?.let{it.supportFragmentManager},fragment.tag.toString())


        }

    }
}