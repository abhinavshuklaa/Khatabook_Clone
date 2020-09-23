package com.example.khatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btButton;
    private long backPressedTime;
    private Toast backToast;
    private ImageView btdrop_down;
    private TextView tvPrivacy;
    private TextView tvTerms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTerms=findViewById(R.id.terms);
        tvTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,termsAndCondition.class);
                intent.putExtra("urlTerms","https://khatabook.com/terms");
                startActivity(intent);

            }
        });


        tvPrivacy=findViewById(R.id.privacy);
        tvPrivacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,webview.class);
                intent.putExtra("url","https://khatabook.com/privacy.html");
                startActivity(intent);



            }
        });

        btdrop_down=findViewById(R.id.btdrop_down);
        btdrop_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,Language_dialog.class);
                    startActivity(intent1);
 
            }
        });


        btButton=findViewById(R.id.button);

        btButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,otp_validation.class);
                startActivity(intent);
            }
        });




//        TextView privacy=(TextView) findViewById(R.id.privacy);
//        privacy.setPaintFlags(privacy.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }


    @Override
    public void onBackPressed() {

        if(backPressedTime+1000>System.currentTimeMillis()){
           backToast.cancel();
            super.onBackPressed();
            return;
        } else{
            backToast=Toast.makeText(getBaseContext(),"Press back again to exit",Toast.LENGTH_SHORT);
            backToast.show();
        }
backPressedTime=System.currentTimeMillis();

    }


}
