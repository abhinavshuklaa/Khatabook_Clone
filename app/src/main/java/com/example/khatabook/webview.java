package com.example.khatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class webview extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        String url=getIntent().getStringExtra("url");
        webView =findViewById(R.id.webview);
        webView.loadUrl(url);
        


    }
}