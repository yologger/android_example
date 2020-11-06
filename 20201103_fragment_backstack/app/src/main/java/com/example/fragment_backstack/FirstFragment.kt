package com.example.fragment_backstack

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("YOLO", "FirstFragment: onCreate()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("YOLO", "FirstFragment: onResume()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("YOLO", "FirstFragment: onStart()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("YOLO", "FirstFragment: onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("YOLO", "FirstFragment: onStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("YOLO", "FirstFragment: onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("YOLO", "FirstFragment: onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("YOLO", "FirstFragment: onDetach()")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

}