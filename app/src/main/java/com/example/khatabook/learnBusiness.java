package com.example.khatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class learnBusiness extends AppCompatActivity {
    private ImageView imTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_business);
        imTwo=findViewById(R.id.imTwo);
        imTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(learnBusiness.this,video_activity_1.class);
                startActivity(intent);

            }
        });

    }
}