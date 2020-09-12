package com.example.khatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class otp_validation extends AppCompatActivity {
    private Button btGetPin;
    private EditText etMobileEnter;

    private static final Pattern mobileNumber=
            Pattern.compile("^"+
                    "(?=.*[0-9])"+
                    ".{10,}"+
                    "$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_validation);

        btGetPin=findViewById(R.id.btGetPin);
        etMobileEnter=findViewById(R.id.etMobileENter);

        btGetPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etMobileEnter.getText().toString().isEmpty()){
                    Toast.makeText(otp_validation.this, "PLease Provide Mobile Number", Toast.LENGTH_SHORT).show();
                } else{
                    if(mobileNumber.matcher(etMobileEnter.getText().toString().trim()).matches()){
                        Intent intent=new Intent(otp_validation.this,Home_page.class);
                        intent.putExtra("helloText",etMobileEnter.getText().toString());
                        startActivity(intent);
                    }else{
                        Toast.makeText(otp_validation.this, "Enter Valid Number", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

    }
}