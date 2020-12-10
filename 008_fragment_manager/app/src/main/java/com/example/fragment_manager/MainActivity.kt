package com.example.fragment_manager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var supportFragmentManager = supportFragmentManager
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        var depth1FirstFragment = Depth1FirstFragment()
        fragmentTransaction.add(R.id.activity_main_fl, depth1FirstFragment)
        fragmentTransaction.commit()

        this.initUI()
    }

    private fun initUI() {
        activity_main_btn_first.setOnClickListener {
            var supportFragmentManager = supportFragmentManager
            var fragmentTransaction = supportFragmentManager.beginTransaction()
            var depth1FirstFragment = Depth1FirstFragment()
            fragmentTransaction.replace(R.id.activity_main_fl, depth1FirstFragment)
            fragmentTransaction.commit()
        }

        activity_main_btn_second.setOnClickListener {
            var supportFragmentManager = supportFragmentManager
            var fragmentTransaction = supportFragmentManager.beginTransaction()
            var depth1SecondFragment = Depth1SecondFragment()
            fragmentTransaction.replace(R.id.activity_main_fl, depth1SecondFragment)
            fragmentTransaction.commit()
        }
    }
}