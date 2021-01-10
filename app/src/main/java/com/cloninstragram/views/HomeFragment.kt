package com.cloninstragram.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cloninstragram.MainActivity
import com.cloninstragram.R
import com.cloninstragram.adapter.StorieAdapter
import com.cloninstragram.adapter.StoryInterface
import com.cloninstragram.widgets.Splash
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    var splash : Splash ?= null
    var storieAdapter = StorieAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setSplash()
        setUi()
        setAdapter()
        setListeners()
    }

    override fun onStart() {
        super.onStart()
        (context as MainActivity).bottonBar.setTitle("hole desde Home")

    }
    override fun onResume() {
        super.onResume()
        (context as MainActivity).bottonBar.setTitle("hole desde Home")
    }

    private fun setListeners() {
        storieAdapter.listener = object : StoryInterface{
            override fun onClick() {
                gotoStorie()
            }
        }
    }

    private fun gotoStorie() {
        fragmentManager?.beginTransaction()?.replace(R.id.containerMain,StoriesFragment(),"storiesFragment")?.addToBackStack(null)?.commit()

    }

    private fun setSplash() {
        splash = Splash(activity!!)
        splash?.show()
    }

    private fun setAdapter() {
        storieAdapter.list = arrayListOf("true","false","true","false","true")
        rvStorie.adapter = storieAdapter
        //splash?.hide()
    }

    private fun setUi() {
        (context as MainActivity).bottonBar.setTitle("hole desde Home")
    }
}