package com.padcmyanmar.component_view_assign_accp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.component_view_assign_accp.R
import com.padcmyanmar.component_view_assign_accp.delegates.ImageItemDelegate
import com.padcmyanmar.component_view_assign_accp.views.viewholders.BaseImageViewHolder
import com.padcmyanmar.component_view_assign_accp.views.viewholders.ImageViewViewHolder

class ImageViewListAdapter( private val mDelegate : ImageItemDelegate) : RecyclerView.Adapter<ImageViewViewHolder>(){
    var mData : ArrayList<Int> = arrayListOf()
    override fun getItemCount(): Int {
       return mData.count()
    }

    override fun onBindViewHolder(holder: ImageViewViewHolder, position: Int) {
       holder.bindData(mData[position])
    }
    //var mData : ArrayList<Int> = arrayListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image_view, parent, false)
        return  ImageViewViewHolder(view,mDelegate)
    }

    fun setData (data: ArrayList<Int>){
        mData = data
        notifyDataSetChanged()
    }
}