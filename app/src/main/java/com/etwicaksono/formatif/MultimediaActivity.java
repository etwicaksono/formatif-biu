package com.etwicaksono.formatif;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MultimediaActivity extends AppCompatActivity {
    VideoView vv_video;
    Button btn_play;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);
        mediaController = new MediaController(this);
        btn_play = findViewById(R.id.btn_play);
        vv_video=findViewById(R.id.vv_video);

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
                vv_video.setVideoURI(uri);
                vv_video.setMediaController(mediaController);
                mediaController.setAnchorView(btn_play);
                vv_video.start();
            }
        });
    }
}