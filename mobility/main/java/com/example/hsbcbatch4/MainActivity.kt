package com.example.hsbcbatch4


import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//imports all the the ids of the ui resources
// from the layout.xml
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   lateinit var emp:Employee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //connecting the layout with the Actvity
        setContentView(R.layout.activity_main)
        b1.setOnClickListener {
            var str=name.text.toString();
            var str1=pass.text.toString();
            var intent1= Intent(this,FirstActivity::class.java);
            //pass the data into the object
            emp= Employee(str,str1)
            //keys should be string value: String,Float,Long,Object...
          intent1.putExtra("obj",emp)

           // intent1.putExtra("k1",str)
           // intent1.putExtra("k2",str1)
            startActivity(intent1)

            //makeText accepts 3 arguments
            // 1:context:app will acessing all the resources via context
            //2: Text: message to be displayed
            //3: Duration of Toast

     /* Toast.makeText(this,"Hello Welcome All",
          Toast.LENGTH_LONG).show()*/
            //reading the data from the edittext
           /* var str=name.text.toString();
            var str1=pass.text.toString();
            if(str.equals("abc") && str1.equals("xyz")){
                display.text="Hello $str";
                display.setTextColor(Color.GREEN)
                //display.setBackgroundColor(Color.GREEN)
            } else{
                display.text="Invalid user.."
                display.setTextColor(Color.RED)
                //display.setBackgroundColor(Color.RED)
            }*/



        }
    }
}
