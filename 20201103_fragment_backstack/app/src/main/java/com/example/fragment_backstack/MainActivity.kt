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

        Log.d("YOLO", "1: ${supportFragmentManager.backStackEntryCount}")

        var fragmentTransaction1 = supportFragmentManager.beginTransaction()
        var firstFragment = FirstFragment()
        fragmentTransaction1.add(R.id.activity_main_fl, firstFragment)
        fragmentTransaction1.addToBackStack(null)
        fragmentTransaction1.commit()

        Log.d("YOLO", "2: ${supportFragmentManager.backStackEntryCount}")

        var fragmentTransaction2 = supportFragmentManager.beginTransaction()
        var secondFragment = SecondFragment()
        fragmentTransaction2.add(R.id.activity_main_fl, secondFragment)
        fragmentTransaction2.addToBackStack(null)
        fragmentTransaction2.commit()

        Log.d("YOLO", "3: ${supportFragmentManager.backStackEntryCount}")

        var fragmentTransaction3 = supportFragmentManager.beginTransaction()
        var thirdFragment = ThirdFragment()
        fragmentTransaction3.add(R.id.activity_main_fl, thirdFragment)
        fragmentTransaction3.addToBackStack(null)
        fragmentTransaction3.commit()

        Log.d("YOLO", "4: ${supportFragmentManager.backStackEntryCount}")

        var fragmentTransaction4 = supportFragmentManager.beginTransaction()
        var fourthFragment = FourthFragment()
        fragmentTransaction4.add(R.id.activity_main_fl, fourthFragment)
        fragmentTransaction4.addToBackStack(null)
        fragmentTransaction4.commit()

        Log.d("YOLO", "5: ${supportFragmentManager.backStackEntryCount}")
    }

    private fun initUI() {
        activity_main_btn_pop.setOnClickListener {
            var fragmentManager = supportFragmentManager
            Log.d("YOLO", "${fragmentManager.backStackEntryCount}")
            fragmentManager.popBackStack()
        }
    }
}