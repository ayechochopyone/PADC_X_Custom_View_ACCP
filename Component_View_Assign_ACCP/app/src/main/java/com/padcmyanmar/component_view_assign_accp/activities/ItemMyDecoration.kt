package com.padcmyanmar.component_view_assign_accp.activities

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ItemMyDecoration : RecyclerView.ItemDecoration() {

    private val overlapValue = -50

    override fun getItemOffsets(outRect : Rect, view : View, parent : RecyclerView, state : RecyclerView.State) {
        var itemPosition = parent.getChildAdapterPosition(view)

        if (itemPosition != 0) {
            outRect.set(overlapValue, 0, 0, 0)  // args is : left,top,right,bottom
        } else {
            outRect.set(0, 0, 0, 0)
        }
    }
}