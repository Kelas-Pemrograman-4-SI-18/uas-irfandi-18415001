package com.irpan.myapplication.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.irpan.myapplication.Admin.HomeAdminActivity;
import com.irpan.myapplication.R;
import com.ornach.nobobutton.NoboButton;

public class LoginActivity extends AppCompatActivity {

    Button btnPindah;
    NoboButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnPindah= (Button) findViewById(R.id.btnPindah);
        btnLogin = (NoboButton) findViewById(R.id.btnLogin);


        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeAdminActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
    }