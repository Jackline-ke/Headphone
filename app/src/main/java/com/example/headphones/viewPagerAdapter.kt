package com.example.headphones

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.util.ArrayList


//Pass 3 constructs (list, fragmentManger,lifecycle)
//the viewPagerAdapter must extend the fragmentStateAdapter
//inside the fragmentStateAdapter pass fragmentManager and lifecycle
class viewPagerAdapter (list: ArrayList<Fragment>, fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {

    //create a fragmentList variable
    private val fragmentList: ArrayList<Fragment> = list

    //return the fragmentList size
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return fragmentList.size

    }

    //return the fragmentList position
    override fun createFragment(position: Int): Fragment {
        TODO("Not yet implemented")
        return fragmentList[position]
    }
}