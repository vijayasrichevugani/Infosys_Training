package com.example.hsbc03

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityLifecycle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        Log.i("ActivityLifecycle","Inside onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ActivityLifecycle","Inside onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ActivityLifecycle","Inside onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ActivityLifecycle","Inside onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ActivityLifecycle","Inside onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ActivityLifecycle","Inside onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ActivityLifecycle","Inside onDestroy")
    }


}
