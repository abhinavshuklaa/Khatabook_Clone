package com.example.khatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ClickOnMore extends AppCompatActivity {
    private ImageView buttonInvite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_on_more);

        buttonInvite = findViewById(R.id.buttonInvite);

        buttonInvite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentForInvite = new Intent(ClickOnMore.this, Invite_page.class);
                startActivity(intentForInvite);
            }
        });

    }
}