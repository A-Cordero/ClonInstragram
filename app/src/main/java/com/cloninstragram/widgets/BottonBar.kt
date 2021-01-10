package com.cloninstragram.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import com.cloninstragram.MainActivity
import com.cloninstragram.R
import com.cloninstragram.views.ContacsFragment
import kotlinx.android.synthetic.main.botton_bar.view.*

class BottonBar(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    init {
        initView()
    }

    private fun initView() {
        View.inflate(context, R.layout.botton_bar,this)
        setListeners()
    }

    private fun setListeners() {
        btnAdd.setOnClickListener {
            // nos infle un fragment
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.containerMain,ContacsFragment(),"contactFragment").addToBackStack(null).commit()
        }
    }

    fun setTitle(data: String){
        titleBottonBar.text = data
    }

}