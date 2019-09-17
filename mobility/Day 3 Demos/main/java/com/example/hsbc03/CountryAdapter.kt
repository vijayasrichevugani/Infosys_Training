package com.example.hsbc03

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.my_listview_template.view.*

class CountryAdapter(var ctx:Context,var clist:ArrayList<Country>) :BaseAdapter() {

    class CountryVH(view: View){
        lateinit var tv: TextView
        lateinit var img: ImageView
        init {
            tv=view.cnames
            img=view.cflags
        }


    }


    override fun getCount(): Int {
       return clist.size
    }
    override fun getItem(position: Int): Any {
      return clist[position]
    }
    override fun getItemId(position: Int): Long {
      return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
     /* var myView:View= LayoutInflater.from(ctx).
           inflate(R.layout.my_listview_template,parent,false)
     //set the data into the template
      myView.cflags.setImageResource(clist.get(position).flags)
      myView.cnames.text=clist.get(position).names
        return  myView*/

        var countryVH:CountryVH
        var cview:View
        if(convertView==null){
            //first time--first scrolling
            cview= LayoutInflater.from(ctx).inflate(R.layout.my_listview_template,null,false)
            countryVH=CountryVH(cview)
            cview.tag=countryVH
        }else{
            //second scrolling
            cview=convertView
            countryVH=cview.tag as CountryVH
        }
        //getting the data from the data set and adding it into the template
        var conrty:Country=getItem(position) as Country
        countryVH.img.setImageResource(conrty.flags)
        countryVH.tv.text=conrty.names
        return cview

    }
}