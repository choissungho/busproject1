package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webView extends AppCompatActivity {
 WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

       webview=(WebView)findViewById(R.id.webview);
       webview.getSettings().setJavaScriptEnabled(true);
       webview.loadUrl("http://shuttle.connectcar.net/daelim/#/route/view/0000000056df71060157adfd6de33de2");
        webview.setWebViewClient(new WebViewClient());

    }

}
