package com.padcmyanmar.component_view_assign_accp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.tabs.TabLayout
import com.padcmyanmar.component_view_assign_accp.R
import com.padcmyanmar.component_view_assign_accp.adapters.TabPagerAdapter
import com.padcmyanmar.component_view_assign_accp.mvp.presenters.ImagePresenter
import com.padcmyanmar.component_view_assign_accp.mvp.views.ImageView
import kotlinx.android.synthetic.main.activity_profile_screen.*

class BottomSheetFragment : BottomSheetDialogFragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_profile_screen,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      //  super.onViewCreated(view, savedInstanceState)
        btnCross.setOnClickListener {
            dialog?.dismiss()
        }
        val viewPagerAdapter = childFragmentManager?.let { TabPagerAdapter(it) }
        viewpager.adapter = viewPagerAdapter

        tabLayout.setupWithViewPager(viewpager)

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {

            }

        })
    }
}