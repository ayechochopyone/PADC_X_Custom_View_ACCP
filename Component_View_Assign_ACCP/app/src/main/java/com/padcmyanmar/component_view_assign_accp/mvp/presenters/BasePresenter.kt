package com.padcmyanmar.component_view_assign_accp.mvp.presenters

import com.padcmyanmar.component_view_assign_accp.mvp.views.BaseView

interface BasePresenter <T : BaseView> {

    fun initPresenter (view : T){
        
    }
}