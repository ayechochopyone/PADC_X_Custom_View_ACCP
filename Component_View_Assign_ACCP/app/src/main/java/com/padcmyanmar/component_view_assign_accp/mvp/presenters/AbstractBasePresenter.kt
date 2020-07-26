package com.padcmyanmar.component_view_assign_accp.mvp.presenters

import androidx.lifecycle.ViewModel
import com.padcmyanmar.component_view_assign_accp.mvp.views.BaseView

abstract class AbstractBasePresenter<T: BaseView> : BasePresenter<T>, ViewModel()  {
        var mView :T? = null

    override fun initPresenter(view: T) {
        mView = view
    }
}