package com.padcmyanmar.component_view_assign_accp.mvp.presenters

import com.padcmyanmar.component_view_assign_accp.mvp.views.ImageView

class ImagePresenterImpl : ImagePresenter, AbstractBasePresenter<ImageView>(){

    override fun onUiReady() {
        mView?.displayList()
    }

    override fun onTapProfile(profileId: Int) {
        mView?.navigateToProfileScreen(profileId)
    }

    override fun onTapAdd(addId: Int) {
        mView?.navigateToNewsTask(addId)
    }

}