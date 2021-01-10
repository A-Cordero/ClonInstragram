package com.cloninstragram.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cloninstragram.R
import kotlinx.android.synthetic.main.item_storie.view.*

class StorieAdapter: RecyclerView.Adapter<StorieAdapter.MyViewHolder>() {

    var listener : StoryInterface ?= null

    var list  = ArrayList<String>()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_storie,parent,false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.apply {

            when(list[position]){
                "true"->{
                    ctStory.setBackgroundResource(R.drawable.storie_degrade)
                }

                "false"->{
                    ctStory.setBackgroundResource(R.drawable.stori_blank)
                }
            }

            ctStory.setOnClickListener {
                listener?.onClick()
            }

        }
    }

    override fun getItemCount() = list.size

}

interface StoryInterface{
    fun onClick()
}