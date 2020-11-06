package com.example.navigation_component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        super.onPause()
        Log.d("YOLO", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("YOLO", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("YOLO", "onDestroy()")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.d("YOLO", "onBackPressed()")
    }
}