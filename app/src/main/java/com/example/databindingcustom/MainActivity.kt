package com.example.databindingcustom

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.databindingcustom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        val post=Post("Batman",
            "Batman is a superhero who appears in American comic books published by DC Comics. Batman was created by the artist Bob Kane and writer Bill Finger, and debuted in the 27th issue of the comic book Detective Comics on March 30, 1939. In the DC Universe, Batman is the alias of Bruce Wayne, a wealthy",
            "https://th.bing.com/th/id/OIP.YlsRzv5cBk2Gnd-RD-EAtwHaK-?rs=1&pid=ImgDetMain")
        binding.textData=post
    }
}