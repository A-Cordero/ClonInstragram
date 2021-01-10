package com.cloninstragram.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.cloninstragram.MainActivity
import com.cloninstragram.R
import com.cloninstragram.views.ContacsFragment
import kotlinx.android.synthetic.main.botton_bar.view.*

class TopBar (context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    init {
        initView()
    }

    private fun initView() {
        View.inflate(context, R.layout.top_bar,this)
        setListeners()
    }

    private fun setListeners() {

    }


}