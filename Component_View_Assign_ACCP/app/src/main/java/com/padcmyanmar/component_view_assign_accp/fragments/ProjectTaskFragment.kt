package com.padcmyanmar.component_view_assign_accp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.padcmyanmar.component_view_assign_accp.R
import com.padcmyanmar.component_view_assign_accp.adapters.ProjectTasksListAdapter
import com.padcmyanmar.component_view_assign_accp.adapters.TasksListAdapter
import kotlinx.android.synthetic.main.fragment_project_tasks.*

class ProjectTaskFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_project_tasks,container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var arrImg = arrayOf<Int>(
            R.drawable.profile3,
            R.drawable.profile2,
            R.drawable.profile5

        )

       // val madapter = TasksListAdapter()
        val madapter = fragmentManager?.let {ProjectTasksListAdapter(it
        , arrImg) }
        val linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rview.layoutManager = linearLayoutManager
        rview.adapter = madapter
    }
}