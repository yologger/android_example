package com.example.navigation_component

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("YOLO", "SecondFragment: onCreate()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("YOLO","SecondFragment: onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("YOLO","SecondFragment: onDetach()")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("YOLO", "${args.name}")

        fragment_second_btn_third.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thridFragment)
        }

        fragment_second_btn_back.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}