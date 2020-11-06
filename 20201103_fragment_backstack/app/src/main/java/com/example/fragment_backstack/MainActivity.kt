package com.example.fragment_backstack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()

        var fragmentManager = supportFragmentManager

        var fragmentTransaction1 = fragmentManager.beginTransaction()
        var firstFragment = FirstFragment()
        fragmentTransaction1.add(R.id.activity_main_fl, firstFragment)
        fragmentTransaction1.addToBackStack(null)
        fragmentTransaction1.commit()

        var fragmentTransaction2 = fragmentManager.beginTransaction()
        var secondFragment = SecondFragment()
        fragmentTransaction2.add(R.id.activity_main_fl, secondFragment)
        fragmentTransaction2.addToBackStack(null)
        fragmentTransaction2.commit()

        var fragmentTransaction3 = fragmentManager.beginTransaction()
        var thirdFragment = ThirdFragment()
        fragmentTransaction3.add(R.id.activity_main_fl, thirdFragment)
        fragmentTransaction3.addToBackStack(null)
        fragmentTransaction3.commit()

        var fragmentTransaction4 = fragmentManager.beginTransaction()
        var fourthFragment = FourthFragment()
        fragmentTransaction4.add(R.id.activity_main_fl, fourthFragment)
        fragmentTransaction4.addToBackStack(null)
        fragmentTransaction4.commit()

        var count: Int = fragmentManager.backStackEntryCount
        Log.d("YOLO", "$count")     // 0
    }

    private fun initUI() {
        activity_main_btn_pop.setOnClickListener {
            var fragmentManager = supportFragmentManager
            fragmentManager.popBackStack()
            Log.d("YOLO", "${fragmentManager.backStackEntryCount}")
        }
    }
}