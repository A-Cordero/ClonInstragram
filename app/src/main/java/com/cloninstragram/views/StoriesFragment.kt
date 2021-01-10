package com.cloninstragram.views

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cloninstragram.MainActivity
import com.cloninstragram.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_stories.*


class StoriesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUi()
        setTimer()
    }

    private fun setUi() {
        (context as MainActivity).bottonBar.setTitle("hole desde stories")

    }

    private fun setTimer() {
        var timer = object :CountDownTimer(5000,50){
            override fun onTick(millisUntilFinished: Long) {
                // se ejecuta cada tick
                progresStory.progress += 1
            }

            override fun onFinish() {
                // cuando termina el contador
                //fragmentManager?.beginTransaction()?.remove(this@StoriesFragment)?.commit()
                fragmentManager?.popBackStack()
            }
        }.start()
    }

}