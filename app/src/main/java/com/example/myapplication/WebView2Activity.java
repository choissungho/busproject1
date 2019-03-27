package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.DigitalClock;

public class WebView2Activity extends AppCompatActivity {
WebView webview2;
Button back2;
View.OnClickListener w = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent q = new Intent(WebView2Activity.this,MainActivity.class);
        startActivity(q);
        finish();
    }
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view2);

        webview2 = (WebView)findViewById(R.id.webview2);
        back2 = (Button)findViewById(R.id.back2);
        back2.setOnClickListener(w);

        webview2.getSettings().setJavaScriptEnabled(true);
        webview2.setWebViewClient(new WebViewClient());
        webview2.loadUrl("https://www.daelim.ac.kr/app/dtoa_s.jsp");


    }
}
