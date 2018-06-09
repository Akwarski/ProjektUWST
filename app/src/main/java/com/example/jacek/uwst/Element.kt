package com.example.jacek.uwst

import android.widget.ImageView
import java.io.Serializable

data class Element(
        var title: String,
        var description: String,
        var picture: Int
):Serializable