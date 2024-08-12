package com.example.animation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.Timer
import java.util.TimerTask

class Splash : AppCompatActivity() {

    private val timer = Timer() // private final Timer timer = new Timer();
    private lateinit var timerTask: TimerTask // TimerTask timerTask

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        timerTask = object : TimerTask() {
            override fun run() {
                    runOnUiThread {
                        gotoMainActivity()
                    }
            }
        }
        timer.schedule(timerTask, 3000)
    }
    private fun gotoMainActivity() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }
}

/*        timerTask = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable () {
                    @Override
                    public void run() {
                        gotoMainActivity();
                    }
                })
            }
        }
        timer.schedule(timerTask, 3000);

    }
    private void gotoMainActivity() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}*/
