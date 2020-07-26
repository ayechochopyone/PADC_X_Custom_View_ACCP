package com.padcmyanmar.component_view_assign_accp.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.component_view_assign_accp.delegates.ImageItemDelegate
import kotlinx.android.synthetic.main.item_image_view.view.*

class ImageViewViewHolder(itemView : View, private val delegate : ImageItemDelegate) : BaseImageViewHolder(itemView) {

    init {

        itemView.setOnClickListener {
           if(layoutPosition == 3){
               delegate.onTapAdd(it.id)
           }else{
               delegate.onTapProfile(it.id)
           }
        }

    }
    var getImageView = itemView.profile2

     override fun bindData(data: Int) {

        //var getImageView = itemView.profile2
        itemView.profile2.setImageResource(data)

    }
}

