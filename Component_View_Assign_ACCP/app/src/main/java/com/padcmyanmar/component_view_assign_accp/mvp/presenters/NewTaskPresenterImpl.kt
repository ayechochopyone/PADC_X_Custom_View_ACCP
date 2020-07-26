package com.padcmyanmar.component_view_assign_accp.mvp.presenters

import com.padcmyanmar.component_view_assign_accp.mvp.views.NewTaskImageView

class NewTaskPresenterImpl : NewTaskPresenter, AbstractBasePresenter<NewTaskImageView>() {
    override fun onTapMain() {
       mView?.onTap()
    }

    override fun onUiReady() {
        mView?.displayImageList()
    }

}