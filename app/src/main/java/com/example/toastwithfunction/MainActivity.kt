package com.example.toastwithfunction

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import pl.droidsonroids.gif.GifImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun bt(view: View) {
        val imageView = ImageView(applicationContext)
        imageView.setImageResource(R.drawable.kitten)
        val toast = Toast(applicationContext)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = imageView
        toast.show()
    }
    fun btgif(view: View) {
        val GifImageView = GifImageView(applicationContext)
        GifImageView.setImageResource(R.drawable.kittengif)
        val toast = Toast(applicationContext)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = GifImageView
        toast.show()
    }
}