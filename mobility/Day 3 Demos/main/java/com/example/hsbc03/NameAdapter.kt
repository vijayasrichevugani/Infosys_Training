package com.example.hsbc03

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.layout_rv_template.view.*

class NameAdapter(var ctx:Context,var names:ArrayList<String>): RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    lateinit var nameholder:NameViewHolder
    class NameViewHolder(view: View):RecyclerView.ViewHolder(view){
        var name:TextView=view.names
    }

    override fun getItemCount(): Int {
      return names.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): NameViewHolder {
       //compile the template
        var myView:View=LayoutInflater.from(ctx).inflate(R.layout.layout_rv_template,null,false)
        nameholder=NameViewHolder(myView)
        return nameholder;
    }
    //adding data into the template
    override fun onBindViewHolder(p0: NameViewHolder, p1: Int) {
        nameholder.name.text=names[p1]
    }
}