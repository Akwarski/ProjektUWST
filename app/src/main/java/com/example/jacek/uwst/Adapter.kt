package com.example.jacek.uwst

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*


@Suppress("NAME_SHADOWING") //do możliwości nadania tych samych nazw
class Adapter(var elements : ArrayList<Element>) : BaseAdapter(){

    //private var myList: MutableList<Element> = mutableListOf()
    lateinit var inflater: LayoutInflater
    lateinit var c: Context

    override fun getItem(position: Int): Any {
        return elements.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position as Long
    }

    override fun getCount(): Int {
        return elements.size
    }

    // override other abstract methods here
    override fun getView(position: Int, convertView: View?, container: ViewGroup): View {
        var convertView = convertView
        //if (inflater == null) {
            inflater = c.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        //}
        if (convertView == null) {
            //val lista = arrayOf("jeden","dwa", "trzy")
            //val adapter = ArrayAdapter<String>(convertView, android.R.layout.simple_expandable_list_item_1, lista)
            convertView = inflater.inflate(R.layout.model, container, false)
        }

        val viewHolder = MyViewHolder(convertView!!)
        viewHolder.title.setText(elements.get(position).title)
        viewHolder.img.setImageResource(elements.get(position).picture)

        viewHolder.setLongClickListener(object : LongClickListener {
            override fun onItemLongClick() {
                Toast.makeText(c, elements.get(position).title, Toast.LENGTH_SHORT).show()
            }
        })

        return convertView
    }
}