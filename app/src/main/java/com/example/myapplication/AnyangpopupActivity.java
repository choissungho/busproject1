package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnyangpopupActivity extends Activity {

    Button aMainBack;

    View.OnClickListener MainClickListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(AnyangpopupActivity.this, MainActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anyangpopup);

        aMainBack = findViewById(R.id.aMainBack);
        aMainBack.setOnClickListener(MainClickListner);


    }
}
