package com.padcmyanmar.component_view_assign_accp.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder(itemview : View): RecyclerView.ViewHolder(itemview){

    abstract fun bindData(data :Int)
}