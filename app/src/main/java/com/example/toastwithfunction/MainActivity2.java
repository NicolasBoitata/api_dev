package com.example.toastwithfunction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void bt (View view) {
        ImageView i = new ImageView(getApplicationContext());
        i.setImageResource (R.drawable.dogman);

        Toast toast = new Toast (getApplicationContext());
        toast.setDuration(Toast. LENGTH_LONG);
        toast.setView(i);
        toast.show();
    }
}