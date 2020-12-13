package com.example.recycler_view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycler_view.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.initUI()
    }

    private fun initUI() {

        activity_main_btn_open_vertical_recycler_view.setOnClickListener {
            val nextIntent = Intent(this, VerticalRecyclerViewActivity::class.java)
            startActivity(nextIntent)
        }

        activity_main_btn_open_horizontal_recycler_view.setOnClickListener {
            val nextIntent = Intent(this, HorizontalRecyclerViewActivity::class.java)
            startActivity(nextIntent)
        }

        activity_main_btn_open_onclick_item.setOnClickListener {
            val nextIntent = Intent(this, OnClickItemActivity::class.java)
            startActivity(nextIntent)
        }

        activity_main_btn_open_reorder.setOnClickListener {
            val nextIntent = Intent(this, ReorderActivity::class.java)
            startActivity(nextIntent)
        }

        activity_main_btn_open_item_with_button.setOnClickListener {
            val nextIntent = Intent(this, ItemWithButtonActivity::class.java)
            startActivity(nextIntent)
        }
    }
}