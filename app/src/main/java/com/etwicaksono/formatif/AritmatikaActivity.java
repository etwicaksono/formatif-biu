package com.etwicaksono.formatif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AritmatikaActivity extends AppCompatActivity {
    Button btn_trapesium, btn_tabung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aritmatika);

        btn_trapesium=findViewById(R.id.btn_trapesium);
        btn_tabung=findViewById(R.id.btn_tabung);

        btn_trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTrapesium = new Intent(AritmatikaActivity.this,TrapesiumActivity.class);
                startActivity(toTrapesium);
            }
        });

        btn_tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTabung = new Intent(AritmatikaActivity.this,TabungActivity.class);
                startActivity(toTabung);
            }
        });
    }
}