package com.example.animation

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var heart: ImageView

    var clicked: Boolean = false

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heart = findViewById(R.id.heart)

        Start_Anim()

        heart.setOnClickListener(View.OnClickListener {
            if (clicked) {
                heart.setImageResource(R.drawable.heart)
                clicked = false
            } else {
                heart.setImageResource(R.drawable.heart_no_click)
                clicked = true
            }
        })

    }

    private fun Start_Anim() {
        Animation_FS(heart, true, 100.0)
    }


    private fun Animation_FS(view: View, clickAnim: Boolean, animDuration: Double) {
        if (clickAnim) {
            view.setOnTouchListener { v, event ->
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> {
                        val scaleX = ObjectAnimator()
                        scaleX.target = view
                        scaleX.setPropertyName("scaleX")
                        scaleX.setFloatValues(0.9f)
                        scaleX.setDuration(animDuration.toInt().toLong())
                        scaleX.start()

                        val scaleY = ObjectAnimator()
                        scaleY.target = view
                        scaleY.setPropertyName("scaleY")
                        scaleY.setFloatValues(0.9f)
                        scaleY.setDuration(animDuration.toInt().toLong())
                        scaleY.start()
                    }

                    MotionEvent.ACTION_UP -> {
                        val scaleX = ObjectAnimator()
                        scaleX.target = view
                        scaleX.setPropertyName("scaleX")
                        scaleX.setFloatValues(1f)
                        scaleX.setDuration(animDuration.toInt().toLong())
                        scaleX.start()

                        val scaleY = ObjectAnimator()
                        scaleY.target = view
                        scaleY.setPropertyName("scaleY")
                        scaleY.setFloatValues(1f)
                        scaleY.setDuration(animDuration.toInt().toLong())
                        scaleY.start()
                    }
                }
                false
            }
            clicked = true
        }
        view.clipToOutline = true
    }

}