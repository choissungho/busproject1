package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaelimApopupActivity extends Activity {

    Button daMainClickListner;

    View.OnClickListener MainClickListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(DaelimApopupActivity.this, MainActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daelimapopup);

        daMainClickListner = findViewById(R.id.daMainClickListner);
        daMainClickListner.setOnClickListener(MainClickListner);
    }
}
