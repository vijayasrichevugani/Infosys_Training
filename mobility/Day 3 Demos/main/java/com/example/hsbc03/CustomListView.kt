package com.example.hsbc03

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_custom_list_view.*

class CustomListView : AppCompatActivity() {

    var list=ArrayList<Country>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view)
        list.add(Country(R.drawable.ca,"Cannada"))
        list.add(Country(R.drawable.nz,"New Zeland"))
        list.add(Country(R.drawable.us,"USA"))
        list.add(Country(R.drawable.np,"Nepal"))
        list.add(Country(R.drawable.mx,"Mexico"))
        list.add(Country(R.drawable.np,"Nepal"))
        country.adapter=CountryAdapter(this,list)
        country.setOnItemClickListener { parent, view, position, id ->
            var data:Country=country.getItemAtPosition(position) as Country
            Toast.makeText(this,data.names,Toast.LENGTH_LONG).show();
        }
    }
}
