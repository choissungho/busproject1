package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaelimBpopupActivity extends Activity {

    Button dbMainClickListner;

    View.OnClickListener MainClickListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(DaelimBpopupActivity.this, MainActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daelimbpopup);

        dbMainClickListner = findViewById(R.id.dbMainClickListner);
        dbMainClickListner.setOnClickListener(MainClickListner);
    }
}
