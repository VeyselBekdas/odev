package com.example.aurora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;





public class ANA extends AppCompatActivity {
    Button QWE;
    Button QWE1;
    Button QWE2;
    Button QWE3;
    Button QWE4;
    Button QWE5;



    @Override
    protected void onCreate(Bundle savedIstanceState) {
        super.onCreate(savedIstanceState);
        setContentView(R.layout.activity_ana);
        QWE=  findViewById(R.id.BTN1);
        QWE.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANA.this, b1.class));
            }
        });

        QWE1=  findViewById(R.id.BTN2);
        QWE1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANA.this, b2.class));
            }
        });
        QWE2=  findViewById(R.id.BTN3);
        QWE2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANA.this, b3.class));
            }
        });
        QWE3=  findViewById(R.id.BTN4);
        QWE3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANA.this, b4.class));
            }
        });
        QWE4=  findViewById(R.id.BTN5);
        QWE4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANA.this, b5.class));
            }
        });
        QWE5=  findViewById(R.id.BTN6);
        QWE5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANA.this, music.class));
            }
        });
    } }
