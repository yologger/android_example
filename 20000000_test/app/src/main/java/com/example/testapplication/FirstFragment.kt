package com.example.testapplication

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // if this is set true,
        // Activity.onCreateOptionsMenu will call Fragment.onCreateOptionsMenu
        // Activity.onOptionsItemSelected will call Fragment.onOptionsItemSelected
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onResume() {
        super.onResume()
        // destroy all menu and re-call onCreateOptionsMenu
        (activity as MainActivity).invalidateOptionsMenu()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_first_fragment, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.menu_one_first -> {
                println("First from FirstFragment")
            }
            R.id.menu_one_second -> {
                println("Second from FirstFragment")
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
