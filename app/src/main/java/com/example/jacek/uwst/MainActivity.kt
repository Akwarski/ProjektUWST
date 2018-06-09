package com.example.jacek.uwst

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ListView
import android.widget.Toast
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var adapter : Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById(R.id.listasos) as ListView

        //val lista = arrayOf("jeden","dwa", "trzy")
        //val adapter = ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, lista)
        adapter = Adapter(getItem())
        list.adapter = adapter
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        Toast.makeText(this,"klik",Toast.LENGTH_SHORT).show()
        return super.onContextItemSelected(item)
    }

    private fun getItem() : ArrayList<Element>{
        val elements = ArrayList<Element>()
        var element = Element("title1","Description1", R.drawable.fruits)
        elements.add(element)

        element = Element("title2","Description2", R.drawable.fruits)
        elements.add(element)

        element = Element("title3","Description3", R.drawable.fruits)
        elements.add(element)

        return elements
    }

}
