package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView textView;
    Button btnchangecolor,btnchangefont;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        btnchangecolor = findViewById(R.id.changecolor);
        btnchangefont = findViewById(R.id.changeFont);

        btnchangecolor.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                textView.setTextColor(R.color.teal_200);
            }
        });

        btnchangefont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextSize(textView.getTextSize() + 10);
            }
        });
    }
}