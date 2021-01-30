package com.example.khatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;
import android.net.Uri;
import android.widget.MediaController;

public class video_activity_1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_1);
        VideoView videoView=findViewById(R.id.video_1);
        MediaController mediaController=new MediaController(this);
        Uri uri =Uri.parse("rtsp://r2---sn-npoe7ne7.googlevideo.com/Cj0LENy73wIaNAlfp2i5GIsPMBMYESARFC2WGWtfMOCoAUIASARgxf2roYXPgJhfigELMmsxOXpzWkNDWlEM/EFE8C542059A567F2971EBCFB5DA1401927A0C00.AE1C91C101BD9E6E864566B43F59DB4128633F84/yt8/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}