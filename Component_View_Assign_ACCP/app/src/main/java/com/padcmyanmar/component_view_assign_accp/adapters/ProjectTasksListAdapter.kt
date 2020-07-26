package com.padcmyanmar.component_view_assign_accp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.component_view_assign_accp.R
import com.padcmyanmar.component_view_assign_accp.views.viewholders.ProjectTaskViewHolder

class ProjectTasksListAdapter(it: FragmentManager,
val arrImg: Array<Int>
) : RecyclerView.Adapter<ProjectTaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectTaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tasks, parent, false)
        return  ProjectTaskViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrImg.size
    }

    override fun onBindViewHolder(holder: ProjectTaskViewHolder, position: Int) {
        holder.getImageView.setImageResource(arrImg[position])
    }
}