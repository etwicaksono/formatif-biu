package com.etwicaksono.formatif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

import androidx.annotation.Nullable;

import android.content.Intent;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class SignInActivity extends AppCompatActivity {
    Button btn_login;
    EditText et_username, et_password;
    TextInputLayout in_username, in_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btn_login = findViewById(R.id.btn_login);
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);

//        btn_login.setOnClickListener(this);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Here to Handling Login
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                // TODO membuat kondisi error bila username dan pass harus diisi lebih dari 6 karakter huruf
                if (username.length() < 6) {
                    et_username.setError("Username Harus Lebih dari 6 karacter");
                } else if (password.length() < 6) {
                    et_password.setError("Password Harus Lebih dari 6 karacter");
                } else {
                    // TODO membuat kondisi jika username dan pass sesuai maka akan menuju kepada halaman home
                    Intent intentHome = new Intent(SignInActivity.this, HomeActivity.class);
                    Toast.makeText(SignInActivity.this, "Selamat datang " + username, Toast.LENGTH_SHORT).show();
                    startActivity(intentHome);
                    finish();
                    // TODO intenHome adalah variabel untuk handling pindah halaman
                }
            }
        });
    }

}