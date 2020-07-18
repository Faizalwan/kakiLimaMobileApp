package com.example.tpma2_10517041;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnBoarding3Act extends AppCompatActivity {

    Button btn_jajan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding3);

        btn_jajan = findViewById(R.id.btn_jajan);

        btn_jajan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gosignin = new Intent(OnBoarding3Act.this,SignInAct.class);
                startActivity(gosignin);
            }
        });
    }
}
