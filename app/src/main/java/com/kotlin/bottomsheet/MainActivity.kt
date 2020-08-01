package com.kotlin.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.kotlin.bottomsheet.adapters.ViewPagerAdapter
import com.kotlin.bottomsheet.fragments.GoFragment
import com.kotlin.bottomsheet.fragments.SeriesFragment
import com.kotlin.bottomsheet.fragments.TeacherFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        setupViewPager()
    }

    private fun setupViewPager() {
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.addFragment(GoFragment(), "ON THE GO")
        viewPagerAdapter.addFragment(SeriesFragment(), "SERIES")
        viewPagerAdapter.addFragment(TeacherFragment(), "Teachers")
        viewPager.adapter=viewPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }
}