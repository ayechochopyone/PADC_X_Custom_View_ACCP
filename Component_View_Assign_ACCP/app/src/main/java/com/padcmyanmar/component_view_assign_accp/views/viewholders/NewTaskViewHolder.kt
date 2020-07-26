package com.padcmyanmar.component_view_assign_accp.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_image_view.view.*
import kotlinx.android.synthetic.main.item_tasks.view.*

class NewTaskViewHolder(itemView: View) : BaseImageViewHolder(itemView) {

     override fun bindData(data: Int) {
        itemView.profile2.setImageResource(data)
    }
}