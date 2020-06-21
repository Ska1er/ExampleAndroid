package com.example.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun frame_am(view: View)
    {
        var page : Intent = Intent(".Frame_Animation")
        startActivity(page);
    }
    fun tween_am(view: View)
    {
        var page : Intent = Intent(".Tween_Animation")
        startActivity(page);
    }
}
