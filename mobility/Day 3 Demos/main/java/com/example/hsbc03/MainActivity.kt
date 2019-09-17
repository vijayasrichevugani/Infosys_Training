package com.example.hsbc03

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var list=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.add("India")
        list.add("China")
        list.add("UK")
        //simple list
       // var cadapter=  ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
       //simple list multi seclet
        var cadapter=  ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,list);
        countries.choiceMode=ListView.CHOICE_MODE_MULTIPLE
        countries.adapter=cadapter
        countries.setOnItemClickListener { parent, view, position, id ->
            var str=countries.getItemAtPosition(position).toString()
            Toast.makeText(this,str,Toast.LENGTH_LONG).show()
        }
    }
}
