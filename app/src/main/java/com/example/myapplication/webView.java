package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class webView extends AppCompatActivity {
 WebView webview;
 Button back;

    View.OnClickListener back1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(webView.this,MainActivity.class);
            startActivity(i);
            finish();
//s
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        back=(Button)findViewById(R.id.back);
        back.setOnClickListener(back1);
       webview=(WebView)findViewById(R.id.webview);
       webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("http://naver.com");

    }

}
