package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class popup4Activity extends Activity {

    Button back4;

    View.OnClickListener click4 =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(popup4Activity.this,MainActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup4);

        back4 = findViewById(R.id.back4);
        back4.setOnClickListener(click4);
    }
}
