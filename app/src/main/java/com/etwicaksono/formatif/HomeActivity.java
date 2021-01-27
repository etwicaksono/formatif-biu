package com.etwicaksono.formatif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class HomeActivity extends AppCompatActivity {
    Button btn_multimedia, btn_aritmatika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_aritmatika=findViewById(R.id.btn_aritmatika);
        btn_multimedia=findViewById(R.id.btn_multimedia);

        btn_aritmatika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toAritmatika = new Intent(HomeActivity.this,AritmatikaActivity.class);
                startActivity(toAritmatika);
            }
        });

        btn_multimedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMultimedia = new Intent(HomeActivity.this,MultimediaActivity.class);
                startActivity(toMultimedia);
            }
        });
    }
}