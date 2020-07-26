package com.padcmyanmar.component_view_assign_accp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.component_view_assign_accp.R
import com.padcmyanmar.component_view_assign_accp.views.viewholders.NewTaskViewHolder
import java.util.zip.Inflater

class NewTaskImageAdapter : RecyclerView.Adapter<NewTaskViewHolder>() {
    var mData : ArrayList<Int> = arrayListOf()
    override fun getItemCount(): Int {
        return mData.count()
    }

    override fun onBindViewHolder(holder: NewTaskViewHolder, position: Int) {
        holder.bindData(mData[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewTaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image_view,parent,false)
        return NewTaskViewHolder(view)
    }

    fun setData (data : ArrayList<Int>){
        mData = data
        notifyDataSetChanged()
    }

}