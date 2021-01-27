package com.etwicaksono.formatif;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class TabungActivity extends AppCompatActivity {
    EditText et_diameter, et_ss_pendek, et_tinggi, et_hasil;
    Button btn_hitung, btn_reset;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        et_diameter = findViewById(R.id.et_diameter);
        et_tinggi = findViewById(R.id.et_tinggi);
        et_hasil = findViewById(R.id.et_hasil);
        btn_hitung = findViewById(R.id.btn_hitung);
        btn_reset = findViewById(R.id.btn_reset);

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float diameter = Float.parseFloat(et_diameter.getText().toString());
                float tinggi = Float.parseFloat(et_tinggi.getText().toString());
                float jari2 = diameter / 2;
                float jari2kwadrat = (float) Math.pow(jari2, 2.0);

                float hasil = (float)  (jari2kwadrat * tinggi*22)/7;

                et_hasil.setText("" + hasil);
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_hasil.setText("");
                et_diameter.setText("");
                et_tinggi.setText("");
            }
        });
    }
}
