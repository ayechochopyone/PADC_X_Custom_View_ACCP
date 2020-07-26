package com.padcmyanmar.component_view_assign_accp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.component_view_assign_accp.R
import com.padcmyanmar.component_view_assign_accp.adapters.ImageViewListAdapter
import com.padcmyanmar.component_view_assign_accp.adapters.TasksListAdapter
import com.padcmyanmar.component_view_assign_accp.fragments.BottomSheetFragment
import com.padcmyanmar.component_view_assign_accp.mvp.presenters.ImagePresenter
import com.padcmyanmar.component_view_assign_accp.mvp.presenters.ImagePresenterImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , com.padcmyanmar.component_view_assign_accp.mvp.views.ImageView{

    private lateinit var madapter : TasksListAdapter
    private lateinit var mimageadapter : ImageViewListAdapter
    private lateinit var mPresenter : ImagePresenter

    companion object{
        fun newIntent(context : Context) : Intent{
            return Intent(context, MainActivity::class.java)
        }
    }
    var arrImg : ArrayList<Int> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpPresenter()

        setUpImageRecyclerView()
        setUpRecyclerView()
        mPresenter.onUiReady()


//        profile1.setOnClickListener {
//            val bottomSheetDialogFragment = BottomSheetFragment()
//            bottomSheetDialogFragment.show(supportFragmentManager, bottomSheetDialogFragment.tag)
//        }

    }

    override fun displayList() {

        arrImg.add(R.drawable.profile2)
        arrImg.add(R.drawable.profile3)
        arrImg.add(R.drawable.profile5)
        arrImg.add(R.drawable.ic_add_black_24dp)
        mimageadapter.setData(arrImg)
    }

    override fun navigateToProfileScreen(profileId: Int) {

        val bottomSheetDialogFragment = BottomSheetFragment()
          bottomSheetDialogFragment.show(supportFragmentManager, bottomSheetDialogFragment.tag)
    }

    override fun navigateToNewsTask(addId: Int) {
        startActivity(NewTasksActivity.newIntent(this))
    }


    private fun setUpImageRecyclerView(){
        mimageadapter = ImageViewListAdapter(mPresenter)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvImageview.addItemDecoration(ItemMyDecoration())
        rvImageview.layoutManager = linearLayoutManager
        rvImageview.adapter = mimageadapter
    }
    private fun setUpRecyclerView(){
        madapter = TasksListAdapter()
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler.layoutManager = linearLayoutManager
        recycler.adapter = madapter
    }

    private fun setUpPresenter(){
        mPresenter = ViewModelProviders.of(this).get(ImagePresenterImpl::class.java)
        mPresenter.initPresenter(this)
    }
}
