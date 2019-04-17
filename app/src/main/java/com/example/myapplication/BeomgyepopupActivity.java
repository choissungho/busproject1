package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BeomgyepopupActivity extends Activity {

    Button bMainClickListner;

    View.OnClickListener MainClickListner =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(BeomgyepopupActivity.this,MainActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beomgyeppoup);

        bMainClickListner = findViewById(R.id.bMainClickListner);
        bMainClickListner.setOnClickListener(MainClickListner);
    }
}
