package com.example.fragment_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isFirstPage = false
    lateinit var fragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("YOLO", "MainActivity: onCreate()")
        initUI()

        var fragmentTransaction = supportFragmentManager.beginTransaction()
        fragment = FirstFragment()
        fragmentTransaction.add(R.id.activity_main_fl, fragment)
        fragmentTransaction.commit()
    }

    override fun onStart() {
        super.onStart()
        Log.d("YOLO", "MainActivity: onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("YOLO", "MainActivity: onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("YOLO", "MainActivity: onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("YOLO", "MainActivity: onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("YOLO", "MainActivity: onDestroy()")
    }

    private fun initUI() {
        activity_main_button.setOnClickListener {
            if (fragment is SecondFragment) {
                fragment = FirstFragment()
            } else {
                fragment = SecondFragment()
            }
            var fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.activity_main_fl, fragment)
            fragmentTransaction.commit()
        }
    }
}