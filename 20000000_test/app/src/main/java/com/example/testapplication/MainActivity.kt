package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeToolbar()
        initializeTabLayout()
    }

    private fun initializeToolbar() {
        setSupportActionBar(toolbar)
    }

    private fun initializeTabLayout() {
        tabLayout = findViewById(R.id.tabLayout)
        tabLayout.addTab(tabLayout.newTab().setText("Home"))
        tabLayout.addTab(tabLayout.newTab().setText("Secret"))
        viewPager = findViewById(R.id.viewPager)
        var tabPagerAdapter = TabPagerAdapter(supportFragmentManager)
        viewPager.adapter = tabPagerAdapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    viewPager.currentItem = tab.position
                }
            }
        })
    }

    private inner class TabPagerAdapter(supportFragmentManager: FragmentManager) :
        FragmentStatePagerAdapter(supportFragmentManager) {

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> FirstFragment()
                else -> SecondFragment()
            }
        }

        override fun getCount(): Int {
            return 2
        }
    }
}
