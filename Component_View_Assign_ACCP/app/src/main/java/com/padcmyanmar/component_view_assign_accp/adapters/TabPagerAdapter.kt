package com.padcmyanmar.component_view_assign_accp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.padcmyanmar.component_view_assign_accp.fragments.ContactFragment
import com.padcmyanmar.component_view_assign_accp.fragments.ProjectTaskFragment

class TabPagerAdapter (fm : FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when {
            position == 0 -> return ProjectTaskFragment()
            else -> return ContactFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Project Task"
            1 -> return "Contact"
            else -> return "About You"
        }

    }
}