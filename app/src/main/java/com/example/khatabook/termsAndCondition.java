package com.example.khatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class termsAndCondition extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_condition);


        String url=getIntent().getStringExtra("urlTerms");
        webView =findViewById(R.id.webviewterms);
        webView.loadUrl(url);
//add some functionalities to this app
    }
}