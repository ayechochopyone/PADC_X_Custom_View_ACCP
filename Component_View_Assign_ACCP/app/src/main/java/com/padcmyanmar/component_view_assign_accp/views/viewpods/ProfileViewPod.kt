package com.padcmyanmar.component_view_assign_accp.views.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.view_pod_profile.view.*

class ProfileViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    fun bindData(closeTask : String, openTask : String, name: String, role : String){
        tv_close.text =  closeTask
        tv_open.text = openTask
        tvName.text = name
        tvRole.text = role

    }
}