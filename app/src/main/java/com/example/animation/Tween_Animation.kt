package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_tween__animation.*

class Tween_Animation : AppCompatActivity() {
    lateinit var anim: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tween__animation)
        start.setOnClickListener{
            anim= AnimationUtils.loadAnimation(this,R.anim.example_anim)
            tween_image.startAnimation(anim)
        }
    }
}
