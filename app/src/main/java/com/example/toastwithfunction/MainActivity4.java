package com.example.toastwithfunction;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    Button btnGreen, btnYellow;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGreen = (Button) findViewById (R.id. btnGreen) ;
        btnYellow = (Button) findViewById (R.id.btnYellow) ;

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showGreenToast();
            }
        });
        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showYellowToast();
            }
        });
    }
    private void showGreenToast () {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alert_toast_bar, null);
        Toast toast = new Toast(this);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 260, -900);
        toast.show();
    }
    private void showYellowToast () {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alert_toast_bar2, null);
        Toast toast = new Toast(this);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 260, 900);
        toast.show();
    }
}
