package com.example.tpma2_10517041;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnBoarding1Act extends AppCompatActivity {

    Button btn_lanjutkan, btn_lewati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding1);

        btn_lanjutkan = findViewById(R.id.btn_lanjutkan);
        btn_lewati = findViewById(R.id.btn_lewati);


        btn_lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goonboarding2 = new Intent(OnBoarding1Act.this, OnBoarding2Act.class);
                startActivity(goonboarding2);
            }
        });

        btn_lewati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gosignin = new Intent(OnBoarding1Act.this, SignInAct.class);
                startActivity(gosignin);
            }
        });
    }
}
