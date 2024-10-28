package com.example.databindingcustom

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    val text=MutableLiveData("text hiiie")
    fun updateText(){
        text.value="new text"
    }
}