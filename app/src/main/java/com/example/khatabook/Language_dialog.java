package com.example.khatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Language_dialog extends AppCompatActivity {
    private ImageView btEnglish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_dialog);

        btEnglish = findViewById(R.id.btenglish);

        btEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Language_dialog.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}

