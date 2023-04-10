package com.india.animatedapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.textView);
        Button btn1 = findViewById(R.id.button2);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button4);
        Button btn4 = findViewById(R.id.button5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation anime = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.view_translate);
                text.startAnimation(anime);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation anime = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.view_alpha);
                text.startAnimation(anime);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation anime = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.view_sclae);
                text.startAnimation(anime);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation anime = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.view_rotate);
                text.startAnimation(anime);

            }
        });


    }
}