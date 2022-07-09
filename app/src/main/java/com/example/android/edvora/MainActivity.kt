package com.example.android.edvora

import UpcomingFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.edvora.Adapter.ViewPagerAdapter
import com.example.android.edvora.Fragments.NearestFragment
import com.example.android.edvora.Fragments.PastFragment
import kotlinx.android.synthetic.main.tabayout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(NearestFragment(),"Nearest")
        adapter.addFragment(UpcomingFragment(),"Upcoming")
        adapter.addFragment(PastFragment(),"Past")

        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

      /*  tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_favorite_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_settings_24)*/


    }
}