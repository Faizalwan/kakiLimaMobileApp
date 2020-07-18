package com.example.tpma2_10517041;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInAct extends AppCompatActivity {

    Button btn_signup, btn_masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btn_signup = findViewById(R.id.btn_signup);
        btn_masuk = findViewById(R.id.btn_masuk);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gosignup = new Intent(SignInAct.this,SignUpAct.class);
                startActivity(gosignup);
            }
        });

        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gohome = new Intent(SignInAct.this,HomeAct.class);
                startActivity(gohome);
            }
        });
    }
}
