package com.example.fragment_example

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    var isFirstChildPage = false
    lateinit var fragment: Fragment

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("YOLO", "SecondFragment: onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("YOLO", "SecondFragment: onCreate()")

        var fragmentTransaction = childFragmentManager.beginTransaction()
        fragment = FirstChildFragment()
        fragmentTransaction.add(R.id.fragment_second_fl, fragment)
        fragmentTransaction.commit()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("YOLO", "SecondFragment: onCreateView()")
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("YOLO", "SecondFragment: onViewCreated()")
        fragment_second_btn.setOnClickListener {
            if (fragment is SecondChildFragment) {
                fragment = FirstChildFragment()
            } else {
                fragment = SecondChildFragment()
            }
            var fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_second_fl, fragment)
            fragmentTransaction.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("YOLO", "SecondFragment: onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("YOLO", "SecondFragment: onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("YOLO", "SecondFragment: onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("YOLO", "SecondFragment: onStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("YOLO", "SecondFragment: onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("YOLO", "SecondFragment: onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("YOLO", "SecondFragment: onDetach()")
    }
}