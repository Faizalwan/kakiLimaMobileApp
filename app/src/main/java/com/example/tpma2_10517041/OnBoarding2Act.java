package com.example.tpma2_10517041;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnBoarding2Act extends AppCompatActivity {

    Button btn_lanjutkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding2);

        btn_lanjutkan = findViewById(R.id.btn_lanjutkan);

        btn_lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoonboard3 = new Intent(OnBoarding2Act.this,OnBoarding3Act.class);
                startActivity(gotoonboard3);
            }
        });
    }
}
