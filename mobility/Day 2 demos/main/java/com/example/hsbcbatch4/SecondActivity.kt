package com.example.hsbcbatch4

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        cal.setOnClickListener {
            var intent1=Intent();
            intent1.component= ComponentName("com.android.calculator2","com.android.calculator2.Calculator")
            startActivity(intent1)

        }

        browser.setOnClickListener {
            var intent1=Intent()
            //var intent1=Intent(Intent.ACTION_VIEW,Uri.parse("http://www.hsbc.com"));
            intent1.action=Intent.ACTION_VIEW
            //converts a string to an Url
            intent1.data=Uri.parse("http://www.hsbc.com")
            startActivity(intent1)
        }
    }
}
