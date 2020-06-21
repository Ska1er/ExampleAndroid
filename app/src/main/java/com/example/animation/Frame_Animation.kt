package com.example.animation

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import kotlinx.android.synthetic.main.activity_frame__animation.*

class Frame_Animation : AppCompatActivity() {
    lateinit var anim: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame__animation)
        (image_id.background as AnimationDrawable).start()
    }
    fun Stop (view: View)
    {
        if(frame_stop_start.text.toString()=="Стоп") {
            (image_id.background as AnimationDrawable).stop()
            frame_stop_start.text = "Старт"
        }
        else{
            (image_id.background as AnimationDrawable).start()
            frame_stop_start.text = "Стоп"
        }
    }
}
