package com.etwicaksono.formatif;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class TrapesiumActivity extends AppCompatActivity {
    EditText et_ss_panjang, et_ss_pendek, et_tinggi, et_hasil;
    Button btn_hitung, btn_reset;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        et_ss_panjang = findViewById(R.id.et_ss_panjang);
        et_ss_pendek = findViewById(R.id.et_ss_pendek);
        et_tinggi = findViewById(R.id.et_tinggi);
        et_hasil = findViewById(R.id.et_hasil);
        btn_hitung = findViewById(R.id.btn_hitung);
        btn_reset = findViewById(R.id.btn_reset);

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float ss_panjang =  Float.parseFloat(et_ss_panjang.getText().toString());
                float ss_pendek =  Float.parseFloat(et_ss_pendek.getText().toString());
                float tinggi =  Float.parseFloat(et_tinggi.getText().toString());

                float hasil = ((ss_panjang + ss_pendek) * tinggi) / 2;

                et_hasil.setText("" + hasil);
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_hasil.setText("");
                et_ss_panjang.setText("");
                et_ss_pendek.setText("");
                et_tinggi.setText("");
            }
        });
    }
}
