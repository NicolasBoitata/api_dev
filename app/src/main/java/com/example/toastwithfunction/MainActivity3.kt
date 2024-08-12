package com.example.toastwithfunction

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
//import com.example.toastwithfunction.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

//    private lateinit var binding: ActivityMainBinding
    private lateinit var btnGreen: Button
    private lateinit var btnYellow: Button
    private lateinit var btnBrow: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
        setContentView(R.layout.activity_main)

        btnGreen = findViewById<Button>(R.id.btnGreen)
        btnYellow = findViewById<Button>(R.id.btnYellow)
        btnBrow = findViewById<Button>(R.id.btnBrow)

        btnGreen.setOnClickListener {
            showGreenToast()
        }
        btnYellow.setOnClickListener {
            showYellowToast()
        }
        btnBrow.setOnClickListener {
            showBrowToast()
        }

    }
    private fun showGreenToast() {
        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.alert_toast_bar, null)
        val toast = Toast(this)
        toast.view = view
        toast.duration = Toast.LENGTH_LONG
        toast.setGravity(Gravity.TOP, 0, 0)
        toast.show()
    }
    private fun showYellowToast() {
        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.alert_toast_bar2, null)
        val toast = Toast(this)
        toast.view = view
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL or Gravity.CENTER_HORIZONTAL, 0, 300)
        toast.show()
    }
    private fun showBrowToast() {
        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.gif_alert_toast, null)
        val toast = Toast(this)
        toast.view = view
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL or Gravity.CENTER_HORIZONTAL, 260, 0)
        toast.show()
    }
}