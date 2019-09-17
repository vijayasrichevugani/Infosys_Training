package com.example.hsbc03

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    var names=ArrayList<String>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        names.add("Mark")
        names.add("Jhon")
        names.add("Smith")
        names.add("AAA")
        names.add("BBB")

        rv.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv.adapter=NameAdapter(this,names)

    }
}
