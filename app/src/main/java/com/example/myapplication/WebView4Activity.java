package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WebView4Activity extends AppCompatActivity {
    WebView webview4;
    Button back4;

    View.OnClickListener r = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent t = new Intent(WebView4Activity.this,MainActivity.class);
            startActivity(t);
            finish();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view4);

        webview4 = (WebView)findViewById(R.id.webview4);
        back4 = (Button)findViewById(R.id.back4);
        back4.setOnClickListener(r);

        webview4.getSettings().setJavaScriptEnabled(true);
        webview4.setWebViewClient(new WebViewClient());
        webview4.loadUrl("http://shuttle.connectcar.net/daelim/#/route/view/0000000056df71060157ac0290483dea");
    }
}
