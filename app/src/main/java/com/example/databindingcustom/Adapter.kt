package com.example.databindingcustom

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
/**
 * if binding is imageview create image view type
 * if you create binding textView then create textView type function.
 */

@BindingAdapter("imageFromUrl")

fun ImageView.imageFromUrl(url: String){
    Glide.with(this.context).load(url).into(this)
}