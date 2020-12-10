package com.example.fragment_manager

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_depth1_second.*

class Depth1SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_depth1_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var childFragmentManager = childFragmentManager
        var transaction = childFragmentManager.beginTransaction()
        var depth2FirstFragment = Depth2FirstFragment()
        transaction.add(R.id.fragment_depth1_second_fl, depth2FirstFragment)
        transaction.commit()

        initUI()
    }

    private fun initUI() {

        fragment_depth1_second_btn_activity_toggle.setOnClickListener {
            var transaction = fragmentManager?.beginTransaction()

            var depth1FirstFragment = Depth1FirstFragment()
            transaction?.replace(R.id.activity_main_fl, depth1FirstFragment)
            transaction?.commit()
        }

        fragment_depth1_second_btn_one.setOnClickListener {
            var childFragmentManager = childFragmentManager
            var transaction = childFragmentManager.beginTransaction()
            var depth2FirstFragment = Depth2FirstFragment()
            transaction.replace(R.id.fragment_depth1_second_fl, depth2FirstFragment)
            transaction.commit()
        }

        fragment_depth1_second_btn_two.setOnClickListener {
            var childFragmentManager = childFragmentManager
            var transaction = childFragmentManager.beginTransaction()
            var depth2SecondFragment = Depth2SecondFragment()
            transaction.replace(R.id.fragment_depth1_second_fl, depth2SecondFragment)
            transaction.commit()
        }
    }
}