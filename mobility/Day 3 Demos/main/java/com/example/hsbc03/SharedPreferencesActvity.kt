package com.example.hsbc03

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_shared_preferences_actvity.*

class SharedPreferencesActvity : AppCompatActivity() {
    lateinit var sharedpref:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences_actvity)
        //creates an xml file with private mode
        sharedpref= getSharedPreferences(name, Context.MODE_PRIVATE)
        save.setOnClickListener {
            //used for editing the xml file
           var editor:SharedPreferences.Editor= sharedpref.edit()
            //edit the xml file
            editor.putString(uname,username.text.toString())
            editor.commit()
            username.setText("")
        }
        load.setOnClickListener {
            var n1=sharedpref.getString(uname,"")
            username.setText(n1)
        }

    }

    companion object{
        var name:String="My_File"
        var uname:String="UserName"
    }
}
