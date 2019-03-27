package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WebView3Activity extends AppCompatActivity {
    WebView webview3;
    Button back3;

    View.OnClickListener e = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent e = new Intent(WebView3Activity.this,MainActivity.class);
            startActivity(e);
            finish();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view3);

        webview3 = (WebView)findViewById(R.id.webview3);
        back3 = (Button)findViewById(R.id.back3);
        back3.setOnClickListener(e);

        webview3.getSettings().setJavaScriptEnabled(true);
        webview3.setWebViewClient(new WebViewClient());
        webview3.loadUrl("https://www.daelim.ac.kr/app/dtob_s.jsp");
    }
}
