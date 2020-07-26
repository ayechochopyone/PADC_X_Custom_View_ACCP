package com.padcmyanmar.component_view_assign_accp.activities

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.component_view_assign_accp.R
import com.padcmyanmar.component_view_assign_accp.adapters.NewTaskImageAdapter
import com.padcmyanmar.component_view_assign_accp.mvp.presenters.NewTaskPresenter
import com.padcmyanmar.component_view_assign_accp.mvp.presenters.NewTaskPresenterImpl
import com.padcmyanmar.component_view_assign_accp.mvp.views.NewTaskImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_new_tasks.*
import kotlinx.android.synthetic.main.activity_new_tasks.btn_back
import java.util.*
import kotlin.collections.ArrayList

class NewTasksActivity : AppCompatActivity() , NewTaskImageView{

    private lateinit var madapter : NewTaskImageAdapter
    private lateinit var mPresenter : NewTaskPresenter
    var arrImg : ArrayList<Int> = arrayListOf()

    companion object{
        fun newIntent(context: Context) : Intent {
            return Intent(context, NewTasksActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.padcmyanmar.component_view_assign_accp.R.layout.activity_new_tasks)

        setUpPresenter()
        setUpRecyclerAdapter()
        mPresenter.onUiReady()
        btn_back.setOnClickListener {
            mPresenter.onTapMain()
        }

    }

//    override fun onTapMain() {
//        btn_back.setOnClickListener {
//            startActivity(MainActivity.newIntent(this))
//        }
//    }
        override fun onTap() {
            startActivity(MainActivity.newIntent(this))
        }
    override fun displayImageList() {
        arrImg.add(R.drawable.profile2)
        arrImg.add(R.drawable.profile3)
        arrImg.add(R.drawable.ic_add_black_24dp)
        madapter.setData(arrImg)
    }

    private fun setUpPresenter(){
        mPresenter = ViewModelProviders.of(this).get(NewTaskPresenterImpl::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpRecyclerAdapter(){
        madapter = NewTaskImageAdapter()
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvTask.addItemDecoration(ItemMyDecoration())
        rvTask.layoutManager = linearLayoutManager
        rvTask.adapter = madapter
    }
}
