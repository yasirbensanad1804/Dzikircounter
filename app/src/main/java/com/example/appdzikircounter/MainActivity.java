package com.example.appdzikircounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_up, btn_reset;

    Vibrator vibrator;

    public int nilai = 0;
    public TextView tampilnilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampilnilai = (TextView) findViewById(R.id.btn_number);
        btn_up = (Button) findViewById(R.id.btn_up);
        btn_reset = (Button) findViewById(R.id.btn_reset);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(50);
                up();
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();

                vibrator.vibrate(1000);
            }
        });


    }

    public void up() {
        nilai++;
        tampilnilai.setText(Integer.toString(nilai));
    }
    public void reset(){
        nilai=0;
        tampilnilai.setText(Integer.toString(nilai));
    }


    public void up(View view) {
    }

    public void reset(View view) {
    }
}
