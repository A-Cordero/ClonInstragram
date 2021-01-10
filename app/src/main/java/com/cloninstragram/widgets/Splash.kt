package com.cloninstragram.widgets

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import com.cloninstragram.R

class Splash(activity: Activity) {
    var viewGroup : ViewGroup ?= null
    var view : View ?= null

    init {
        view = activity.layoutInflater.inflate(R.layout.splash_layout_init,null)
        viewGroup = activity.window.decorView.findViewById(R.id.main)
    }

    fun show(){
        viewGroup?.addView(view)
    }

    fun hide(){
        if(viewGroup != null && view != null){
            viewGroup?.removeView(view)
        }
    }
}