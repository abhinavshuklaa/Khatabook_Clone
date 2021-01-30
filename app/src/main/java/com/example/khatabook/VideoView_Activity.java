package com.example.khatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoView_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        VideoView videoView=findViewById(R.id.video_view);
        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.rec;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController=new MediaController(this,false);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }
}