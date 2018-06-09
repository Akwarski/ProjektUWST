package com.example.jacek.uwst

import android.view.ContextMenu
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MyViewHolder(v: View) : View.OnLongClickListener {

    var img: ImageView
    var title: TextView

    private lateinit var longClickListener : LongClickListener//z klasy LongClickListener

    fun setLongClickListener(lc: LongClickListener){
        this.longClickListener = lc
    }

    override fun onLongClick(v: View?): Boolean {
        this.longClickListener.onItemLongClick()
        return false
    }

    //konstruktor
    init {
        img = v.findViewById(R.id.picture)
        title = v.findViewById(R.id.temat)
        v.setOnLongClickListener(this)
    }

}