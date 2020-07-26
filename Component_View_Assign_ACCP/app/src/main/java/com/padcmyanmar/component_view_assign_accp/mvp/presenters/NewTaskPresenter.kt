package com.padcmyanmar.component_view_assign_accp.mvp.presenters

import com.padcmyanmar.component_view_assign_accp.mvp.views.NewTaskImageView

interface NewTaskPresenter : BasePresenter<NewTaskImageView> {

    fun onTapMain()
    fun onUiReady()
}