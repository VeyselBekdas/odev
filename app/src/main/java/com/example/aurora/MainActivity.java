package com.example.aurora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;





public class MainActivity extends AppCompatActivity {
    Button btn_GİT;




    @Override
    protected void onCreate(Bundle savedIstanceState) {
        super.onCreate(savedIstanceState);
        setContentView(R.layout.activity_main);
        btn_GİT=  findViewById(R.id.btn_kat);
        btn_GİT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ANA.class));
            }
        });

    }
}