package com.example.hsbcbatch4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        //property used for getting the intent
       // var n1=intent.getStringExtra("k1")
        //var n2=intent.getStringExtra("k2")
       var emp:Employee= intent.getSerializableExtra("obj")
               as Employee
        dis.text="hello ${emp.name} ${emp.pass}"
    }
}
