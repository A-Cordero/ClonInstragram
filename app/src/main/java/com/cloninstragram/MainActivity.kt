package com.cloninstragram

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.fragment.app.FragmentManager
import com.cloninstragram.views.HomeFragment
import com.cloninstragram.widgets.Splash
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottonBar.setTitle("Hola mundo")
        supportFragmentManager.beginTransaction().replace(R.id.containerMain,HomeFragment(),"homeFragmet").commit()
    }


}