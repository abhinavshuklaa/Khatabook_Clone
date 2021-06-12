package com.example.khatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Invite_page extends AppCompatActivity {
    private ImageView btClickToInviteIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_page);
        btClickToInviteIntent = findViewById(R.id.ClickToInviteIntent);

        btClickToInviteIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inviteIntent = new Intent();
                inviteIntent.setAction(Intent.ACTION_SEND);
                inviteIntent.putExtra(Intent.EXTRA_TEXT, "http://bit.ly/khatabook-app");
                inviteIntent.setType("plain/text");

                if (inviteIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(inviteIntent);
                }

            }
        });


    }
}