package com.padcmyanmar.component_view_assign_accp.mvp.presenters

import com.padcmyanmar.component_view_assign_accp.activities.MainActivity
import com.padcmyanmar.component_view_assign_accp.delegates.ImageItemDelegate
import com.padcmyanmar.component_view_assign_accp.mvp.views.ImageView

interface ImagePresenter : ImageItemDelegate, BasePresenter<ImageView>{

  fun onUiReady()
}