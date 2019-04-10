package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class popup1Activity extends Activity {

    Button back1;

    View.OnClickListener click1 =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(popup1Activity.this,MainActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup1);

        back1 = findViewById(R.id.back1);
        back1.setOnClickListener(click1);
    }
}
