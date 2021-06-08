package com.example.khatabook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Home_page extends AppCompatActivity {
    private ImageView btImMoreButton;
    private Button btButtonAddCustomers;
    private ImageView imforward;
    private Animation animation;
    private Button btLearnBusiness;


    private static final int CONTACTS_PERMISSION_REQ_CODE = 101;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        btLearnBusiness=findViewById(R.id.btLearnBusiness);
        btLearnBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLearn=new Intent(Home_page.this,learnBusiness.class);
                startActivity(intentLearn);
            }
        });




        imforward=findViewById(R.id.imforward);
        animation= AnimationUtils.loadAnimation(this,R.anim.anim);
        imforward.startAnimation(animation);



        btButtonAddCustomers=findViewById(R.id.imButtonAddCustomers);
         btButtonAddCustomers.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 boolean isPermissionGranted = ActivityCompat.checkSelfPermission(Home_page.this, Manifest.permission.READ_CONTACTS) == PackageManager.PERMISSION_GRANTED;
                 if (!isPermissionGranted) {
                     ActivityCompat.requestPermissions(Home_page.this, new String[]{Manifest.permission.READ_CONTACTS}, CONTACTS_PERMISSION_REQ_CODE);

                 } else {
                     Toast.makeText(Home_page.this, "Contacts Permission already granted", Toast.LENGTH_SHORT).show();
                 }

             }

         });


        btImMoreButton=findViewById(R.id.btImMoreButton);

        btImMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Home_page.this,ClickOnMore.class);
                startActivity(intent2);

            }
        });

    }
}